package Serializacation;

import java.io.Serializable;

public class Employ implements Serializable {
	
	private static final long serialVersionUID = 1L;
	String name;
	int id;
	transient String pwd;
	double salary;
	
	Employ(){
		
	}
	
	Employ(String name, int id, String pwd, double salary){
		this.name = name;
		this.id = id;
		this.pwd = pwd;
		this.salary = salary;
	}
	
	public String toString() {
		return "Name: "+name+"\tId: "+id+"\tPassword: "+pwd+"\tSalary: "+salary;
	}
		
}
	

	
	



