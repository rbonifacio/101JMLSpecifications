package org.softlang.model;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 * A department has a name, a manager, employees, and subdepartments.
 */
public class Department implements Serializable {

    private static final long serialVersionUID = -2008895922177165250L;
	
    private String name;
    private Employee manager;
    private List<Department> subdepts = new LinkedList<Department>();
    private List<Employee> employees = new LinkedList<Employee>();
 
    public Department() {
	name = "";
	manager = new Employee();
    }

    public Department(String pname, Employee pmanager) {
	this.name = pname;
	this.manager = pmanager;
    }
 
    public String getName() {
	return name;
    }

    public void setName(String pname) {
	this.name = pname;
    }
    
    public Employee getManager() {
	return manager;
    }

    public void setManager(Employee pmanager) {
	this.manager = pmanager;
    }

    public List<Department> getSubdepts() {
	return subdepts;
    }

    public List<Employee> getEmployees() {
	return employees;
    }
 
    public void addDept(Department department) {
	subdepts.add(department);
    }

    public void addEmployee(Employee employee) {
	employees.add(employee);
    }

    public double total() {
	double total = 0;
	total += getManager().getSalary();
	for (Department s : getSubdepts())
	    total += s.total();
	for (Employee e : getEmployees())
	    total += e.getSalary();
	return total;		
    }	
    
    public void cut() {
	getManager().cut();
	for (Department s : getSubdepts())
	    s.cut();
	for (Employee e : getEmployees())
	    e.cut();
    }	
}