package org.softlang.model;

import java.io.Serializable;

/**
 * An employee has a name, an address, and a salary. 
 */
public class Employee implements Serializable {

    private static final long serialVersionUID = -210889592677165250L;

    private static final double MIN_SALARY = -50;

    private String name;
    private String address;
    private double salary;

    public Employee() {
	name = "";
	address = "";
	salary = MIN_SALARY;
    }

    public Employee(String pname, String paddress, double psalary) {
	name = pname;
	address = pname;
	salary = psalary;
    }

    public String getName() {
	return name;
    }

    public String getAddress() {
	return address;
    }

    public double getSalary() {
	return salary;
    }

    public void setName(String pname) {
	this.name = pname;
    }

    public void setAddress(String paddress) {
	this.address = paddress;
    }
    
    public void setSalary(double psalary) {
	this.salary = psalary;
    }

    public void cut() {
	setSalary(getSalary() / 2);
    }	
}