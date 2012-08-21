package org.softlang.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestConstraints {

	private static final double SALARY = -50;
	
	@Test
	public void testNegativeSalary() {
		Employee emp = new Employee("RBonifacio", "Brasilia", SALARY);
		double salary01 = emp.getSalary();
		emp.cut();
		double salary02 = emp.getSalary();
		assertTrue(salary01 > salary02);
	}

	@Test
	public void testInvalidSubDepartment() {
		Employee emp = new Employee("Ralf", "Brasilia", 100);
		Department d = new Department("CIC", emp);
		
		d.addDept(d); 
	}
	
}
