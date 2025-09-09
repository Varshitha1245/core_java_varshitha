package org.tnsif.c2tc.interface_demo;



class Smartl implements SmartDevice{

	@Override
	public void turnOn() {
		System.out.println("smartlight is on");
		
	}

	@Override
	public void turnOff() {
		System.out.println("smartlight is off");
		
	}

	@Override
	public void getStatus() {
		System.out.println("smartlight is in standby mode");
		
	}
	
}
public class SmartLight {
	public static void main(String[] args) {
		SmartDevice obj = new Smartl();
		obj.turnOn();
		obj.turnOff();
		obj.getStatus();
		
		
	}

}
