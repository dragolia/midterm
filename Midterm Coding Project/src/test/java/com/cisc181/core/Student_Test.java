package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@BeforeClass
	public static void setup() throws PersonException {
		ArrayList <Course> courseList = new ArrayList<Course>();
		Course c1 = new Course();
		Course c2 = new Course();
		Course c3 = new Course();
		courseList.add(c1);
		courseList.add(c2);
		courseList.add(c3);
		ArrayList <Semester> semesterList = new ArrayList<Semester>();
		Semester Fall = new Semester();
		Semester Spring = new Semester();
		semesterList.add(Fall);
		semesterList.add(Spring);
		ArrayList <Section> sectionList = new ArrayList<Section>();
		Section s1 = new Section();
		Section s2 = new Section();
		Section s3 = new Section();
		Section s4 = new Section();
		Section s5 = new Section();
		Section s6 = new Section();
		sectionList.add(s1);
		sectionList.add(s2);
		sectionList.add(s3);
		sectionList.add(s4);
		sectionList.add(s5);
		sectionList.add(s6);
		ArrayList<Student> studentList= new ArrayList<Student>();
		Student st1 = new Student("David", "c", "Ragolia", null, null, null, null, null);
		
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}
}