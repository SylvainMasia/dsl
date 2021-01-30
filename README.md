# DSL - ArduinoML Spaceteam revision

# Team

Masia Sylvain  
Montoya Damien 
Peres Richard   
Rigaut François

# Structuration des dossiers

- arduinoML -> le ecore se trouve dans ce dossier  
- arduinoML_kernel -> le code de Mr. Mosser (révisé)  
- polytech.dsl.spaceteam.spaml
  - contient le fichier Spaml.xtext  
  - contient le fichier SpamlGenerator.xtend
    - le langage permet d'écrire via 2 syntaxes : une verbose et une non verbose
  - contient le fichier SpamlValidator.xtend
    - nous avons testé qu'un meme pin ne peut pas être attribué plusieurs fois ou que le pin existe (basé sur le Arduino Uno R3), ainsi qu'une variable et un state ne peuvent pas avoir le même nom
- polytech.dsl.spaceteam.internal.spaml
	- contient le dsl interne fait en java
	- les 5 scénarios sont en commentaire dans le main
- test_scenario_external_dsl -> contient des scénarios écrits en .Spaml
  - nous avons choisi comme scénario complémentaire le "Temporal"



# Syntaxe BNF de SPAML

## DSL Externe

```BNF
<name> 					::= [-A-Za-z_]+
<state_name> 			::= [-A-Za-z_]+
<plugged_elem_name> 	::= [-A-Za-z_][-A-Za-z_0-9]*
<plugged_elem_class> 	::= "Actuator" | "SensorDigital" | "SensorAnalog"
<plugged_port> 			::= [0-9]+

<plugged_elem> 			::= <plugged_elem_class> <plugged_elem_name> |
						<plugged_port>
<plugged_elem_list> 	::= <plugged_elem> "+" <plugged_elem_list> |
						<plugged_elem>
<plugged_elements> 		::= "pluggedElements" <plugged_elem_list>

<plugged_action> 		::= <plugged_elem_name> "=" ("LOW" | "HIGH")
<temporal_action> 		::= [0-9]+
<action> 				::= <plugged_action> | <temporal_action>
<condition> 			::= <action> | 
                        "AND(" <condition> "," <condition> ")" |
						"OR(" <condition> "," <condition> ")"

<transition> 	::= <condition> "->" <state_name>
<instruction> 	::= <transition> | <plugged_action>

<instruction_set> 	::= <instruction> <instruction_set> | <instruction>
<state> 			::= <state_name> "{" <instruction_set> "}"
<state_list> 		::= <state> <state_list> | <state>
<states> 			::= "states" <state_list>

<program> ::= "Program" <name> "initialState" <state_name> "{" <plugged_elements> <states> "}"
```

## DSL Interne

```BNF
<name> 					::= "\"" [-A-Za-z_]+ "\""
<state_name> 			::= "\"" [-A-Za-z_]+ "\""
<program_name> 			::= "\"" [-A-Za-z_]+ "\""
<plugged_elem_name> 	::= "\"" [-A-Za-z_][-A-Za-z_0-9]* "\""
<plugged_elem_class> 	::= "Actuator" | "SensorDigital" | "SensorAnalog"
<plugged_port> 			::= [0-9]+
<signal>				::= "SIGNAL.LOW" | "SIGNAL.HIGH"
<operation>				::= "OPERATION.OR" | "OPERATION.AND"

<plugged_elem>			::= <plugged_elem_class> ".create().setPin(" <plugged_port> ").setName(" <plugged_elem_name> ")"
<add_plugged_elem> 		::= "addPluggedElement(" <plugged_elem> ")"
<plugged_elements> 		::= <add_plugged_elem> "." <plugged_elements> |
						<add_plugged_elem>
						
<add_action>	::= "addAction(Action.create().setValue(" <signal> ").setActuator(" <plugged_elem_name> "))"

<temporal_condition>		::= "TemporalCondition.create().setDelay(" [0-9]+ ")"
<logical_condition>			::= "LogicalCondition.create().setValue(" <signal> ").setSensor(" <plugged_elem_name> ")"

<condition>						::= <logical_condition> | <temporal_condition>
<add_condition>					::= "addCondition(" <condition> ")"
<condition_set>					::= <add_condition> "." <condition_set> | <add_condition>
<set_operator>					::= "setOperation(" <operation> ")"
<condition_set_with_operator> 	::= <set_operator> "." <condition_set> | <condition_set>

<add_transition>	::= "addTransition(Transition.create().setNext(" <state_name> ")." <condition_set_with_operator> ")"

<instruction> 		::= <add_transition> | <add_action>
<instruction_set> 	::= <instruction> "." <instruction_set> | <instruction>
<state> 			::= "State.create().setName(" <state_name> ")." <instruction_set>
<add_state>			::=	"addState(" <state> ")"
<states> 			::= <add_state> "." <states> | <add_state>


<program> ::= "Program.create().setName(" <program_name> ")." <plugged_elements> ".setInitialState(" <state_name> ")." <states> ".generateArduinoCode();"
```

