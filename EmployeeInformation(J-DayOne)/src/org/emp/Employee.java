package org.emp;

import org.project.Project;

public class Employee extends Project {
	private void empName() {
		System.out.println("empname");

	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.empName();
		e.companyName();
		e.clientName();
		e.projectName();

	}
}
