package com.codeprep.methref;

public class MethAndConstRef {

	public static void main(String[] args) {
//		Static method reference - (By using class --> className::methodName)
		WorkInter workInter = Stuff::doStuff;
		workInter.doTask();

//		Non-Static method reference - (By using class --> ObjectName::methodName)
		Stuff st = new Stuff();
		WorkInter workInterface = st::hello;
		workInterface.doTask();

//		Thread method reference - 
		Runnable runnable = Stuff::threadTask;
		Thread t = new Thread(runnable);
		t.start();

	}
}
