package com.oopsproject;

public class EncaplusationLearner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Learner l = new Learner();
		l.setRollNum(34);
		l.setName("Sakshi");
		l.setCity("Roha");
		System.out.println("Learner rollNum is" +l.getRollNum());
		System.out.println("Learner name is" +l.getName());
		System.out.println("Learner city is" +l.getCity());
	}

}
