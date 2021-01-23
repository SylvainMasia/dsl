// Wiring code generated from an ArduinoML model
// Application name: null

void setup(){
	pinMode(1, OUTPUT); // red_led [Actuator]
	pinMode(2, OUTPUT); // buzzer [Actuator]
	pinMode(3, INPUT);  // button [Sensor]
}

long time = 0; long debounce = 200;

void state_off() {
  digitalWrite(1,LOW);
  digitalWrite(2,LOW);
	boolean guard = millis() - time > debounce;
	if((
	digitalRead(3) == HIGH 
    ) && guard ) {
	time = millis();
	state_on();
  } else {
	state_off();
  }
}

void state_on() {
  digitalWrite(1,HIGH);
  digitalWrite(2,HIGH);
	boolean guard = millis() - time > debounce;
	if((
	digitalRead(3) == LOW 
    ) && guard ) {
	time = millis();
	state_off();
  } else {
	state_on();
  }
}

void loop() {
	state_off();
}
