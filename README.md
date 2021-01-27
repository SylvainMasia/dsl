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
- le dossier test contient des scénarios écrits en .Spaml
  - nous avons choisi comme scénario complémentaire le "Temporal"
