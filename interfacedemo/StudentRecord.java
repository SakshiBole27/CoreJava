package com.interfacedemo;

public class StudentRecord implements CollegeData, HostelData {

	
	@Override
	public void hostelDetails() {
		System.out.println("hostelName: MGM hostel");
		System.out.println("hostelLocation : Panvel");
				
		}

	@Override
	public void studentRecord() {
		System.out.println("Student Name : Sakshi");
		System.out.println("College Name : MGM");
	}

	@Override
	public void collegeDetails() {
		System.out.println("collegeName: MGM College");
		System.out.println("collegeLocation: Navi Mumbai");
	}

	@Override
	public void studentData() {
		System.out.println("Student Degree : Computer Engineering");
		System.out.println("Student Roll no: 07");
	}
public static void main(String[] args) {
		StudentRecord s = new StudentRecord();
		s.collegeDetails();
		s.hostelDetails();
		s.studentData();
		s.studentRecord();
	}


}
