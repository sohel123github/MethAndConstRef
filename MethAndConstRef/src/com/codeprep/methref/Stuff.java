package com.codeprep.methref;

public class Stuff {
	
	public static void doStuff() {
		System.out.println("This is do stuff method...");
	}
	
	public void hello() {
		System.out.println("This is hello method...");
	}
	
	public static void threadTask() {
		for(int i=1; i<=10; i++) {
			System.out.println(i * 2);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		
	}
}
