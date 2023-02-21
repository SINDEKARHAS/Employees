package Database;

import java.time.LocalDate;

class Employees
	
	{
	
    private int empno;
    private String empname,project, empDesignation, proj_days;
    private int salary;
    private LocalDate Date;

    Employees(int empno, String empname, String empdesignation,int salary, String project, String proj_days )//LocalDate Date
    
    {
    	this.empno = empno;
        this.empname = empname;
        this.empDesignation = empdesignation;
		this.salary = salary;
		this.project = project;
		this.proj_days =proj_days;
		//this.Date=Date;
        
       
    }

    public int getEmpno(){
    	return empno;
    }

    public String getEname(){
        return empname;
    }

    public int getSalary(){
        return salary;
    }
    
    public String getempDesignation() {
    	return empDesignation;
    }
    
    public LocalDate getDate() {
		return Date;
	}
    
    public String project() {
    	return project;
    }
    
    public String proj_days() {
    	return proj_days;
    }

    public String toString(){
        return empno+"    |   "+empname+"   | " +salary+ "  |  " +empDesignation+ " | " +project+" | "+proj_days ;
        		//+ "//" +Date+ "
    }

	



}

