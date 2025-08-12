package org.tnsif.sf.c2tc.oops;

public class Abstraction_Demo {

	public static void main(String[] args) {
		Mahesh obj=new Suresh();
		obj.calling();
		obj.AIIntegration();
		obj.SatelliteComm();
		obj.HealthMonitoring();
	}

}
abstract class Mahesh{
	public void calling() {
		System.out.println("calling");
	}
	public abstract void  AIIntegration();
	public abstract void SatelliteComm();
	public abstract void HealthMonitoring();
}
abstract class Ramesh extends Mahesh{

	@Override
	public void AIIntegration() {
		System.out.println("Phone is integarted with AI");
	}

	@Override
	public abstract void SatelliteComm() ;

	@Override
	public abstract void HealthMonitoring() ;
	
	
}
class Suresh extends Ramesh{

	@Override
	public void SatelliteComm() {
		// TODO Auto-generated method stub
		System.out.println("phone is integrated with satellitecome");
	}

	@Override
	public void HealthMonitoring() {
		// TODO Auto-generated method stub
		System.out.println("phone is integrated with healthmonitoring");
	}
	
}