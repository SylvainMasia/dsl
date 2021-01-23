// Wiring code generated from an ArduinoML model
// Application name: null

void setup(){
	pinMode(1, OUTPUT); // red_led [Actuator]
	pinMode(2, OUTPUT); // buzzer [Actuator]
	pinMode(3, INPUT);  // button [Sensor]
	pinMode(4, INPUT);  // button2 [Sensor]
}

long time = 0; long debounce = 200;

void state_initial() {
  digitalWrite(1,LOW);
  digitalWrite(2,LOW);
	boolean guard = millis() - time > debounce;
	if((
	digitalRead(3) == HIGH 
    ) && guard ) {
	time = millis();
	state_noiseon();
  } else {
	state_initial();
  }
}

void state_noiseon() {
  digitalWrite(1,LOW);
  digitalWrite(2,HIGH);
	boolean guard = millis() - time > debounce;
	if((
	digitalRead(3) == HIGH 
    ) && guard ) {
	time = millis();
	state_ledon();
  } else {
	state_noiseon();
  }
}

void state_ledon() {
  digitalWrite(1,HIGH);
  digitalWrite(2,LOW);
	boolean guard = millis() - time > debounce;
	if((
	digitalRead(3) == HIGH 
    ) && guard ) {
	time = millis();
	state_initial();
  } else {
	state_ledon();
  }
}

void loop() {
	state_initial();
}
