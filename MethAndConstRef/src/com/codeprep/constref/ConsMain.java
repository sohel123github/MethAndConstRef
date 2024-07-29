package com.codeprep.constref;

public class ConsMain {

	public static void main(String[] args) {
//		Providing constructor reference..
		Provider providerOne = Student::new;
		Student student = providerOne.getStudent();
		student.staticDisplay();
		student.nonStaticDisplay();

	}

}
