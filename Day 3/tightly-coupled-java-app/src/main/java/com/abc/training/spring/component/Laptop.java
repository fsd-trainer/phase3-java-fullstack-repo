package com.abc.training.spring.component;

public class Laptop {
	
	private HardDisk hdd;
	private CPU cpu;
	private RAM ram;
	
	
	// create object of these classes before we work
	// this is tightly-coupled code
	public Laptop() {
		
		hdd = new HardDisk();
		cpu = new CPU();
		ram = new RAM();
	}
	
     public void displayHardDiskSpeed() {
    	 System.out.println(hdd.getspeed());
     }

}
