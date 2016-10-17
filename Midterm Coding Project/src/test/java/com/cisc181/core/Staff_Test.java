 package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void test() throws PersonException {
		ArrayList<Staff> Staffgroup = new ArrayList<Staff>();
		 
		Staff s1 = new Staff("David", "C", "Ragolia", null, "111", "302-757-6220", "dragolia@gmail", "3:00", 1, 23500.00, null, eTitle.MR);
		Staff s2 = new Staff("bill", "C", "nye", null, "111", "302-757-5430", "bill@gmail", "4:00", 1, 23500.00, null,eTitle.MR);
		Staff s3 = new Staff("Hillary", "R", "Clinton", null, "111", "302-757-4330", "HRC@gmail", "2:00", 1, 45500.00, null,eTitle.MRS);
		Staff s4 = new Staff("Isabelle", "C", "Smith", null, "111", "302-757-4220", "ISL@gmail", "4:00", 1, 33500.00, null,eTitle.MS);
		Staff s5 = new Staff("zoey", "C", "hill", null, "111", "302-757-2220", "BDR@gmail", "6:00", 1, 23500.00, null,eTitle.MRS);
		Staffgroup.add(s1);
		Staffgroup.add(s2);
		Staffgroup.add(s3);
		Staffgroup.add(s4);
		Staffgroup.add(s5);
		double SalaryAverage = (s1.getSalary() + s2.getSalary()+s3.getSalary()+s4.getSalary()+s5.getSalary())/5;
		assertEquals(SalaryAverage,149500,.1);
	}	

}
