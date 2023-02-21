package Database;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class CRUD {

    public static void main(String[] args){
        List<Employees> c = new ArrayList<Employees>();
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        int ch;

        while(true)
        {
            System.out.println();
            System.out.println("*************************************************************");
            System.out.println("*****************Employee Mnagement System*******************");
            System.out.println("                 1.INSERT                                    ");
            System.out.println("                 2.DISPLAY                                   ");
            System.out.println("                 3.SEARCH                                    ");
            System.out.println("                 4.UPDATE                                    ");
            System.out.println("                 5.DELETE                                    ");
            System.out.println("                 6.EXIT !                                    ");
            System.out.println("*************************************************************");
            System.out.println("\n");
            System.out.println("Enter your choice: ");
            ch = s.nextInt();

            switch(ch){
                case 1:
                
                    System.out.println("Enter Employee No.: ");
                    int empno = s.nextInt();
                    
                    //s.nextLine();
                    System.out.println("Enter Employee name: ");
                    String empname = s1.nextLine();
                    
                    System.out.println("Enter the Designation: ");
                    String empDesignation = s1.nextLine();
             
                    System.out.println("Enter Employee salary: ");
                    int salary = s.nextInt(); 
                    
                    System.out.println("Project: ");
                    String project = s1.nextLine();
                    
                    System.out.println("Project Deadline: ");
                    String proj_days = s1.nextLine();
                    
                    /*
                     * System.out.println("Select joining date")
                     * LocalDate date =d.LocalDate();*/

                    c.add(new Employees(empno, empname,empDesignation,salary,project, proj_days ));
                    System.out.println("Record(s) added successfully...!!");
                    break;
                    
                    
                case 2:
                	
                    System.out.println("********************Employee Details*******************");
                    System.out.println("\n");
                    System.out.println("EMP_ID | NAME | DESIGNATION | SALARY | PROJECT | PROJ_DAYS "); // | Date
                    
                    Iterator<Employees> i = c.iterator();
                    while(i.hasNext())
                    {
                        Employees e = i.next();
                        System.out.println(e);
                    }
                    
                    break;
                    
                case 3:
                	
                    boolean found = false;
                    System.out.println("Enter Empno to search: ");
                    int empno1 = s.nextInt();
                    System.out.println("*****************************************");
                    i = c.iterator();
                    while(i.hasNext())
                    
                    {
                        Employees e = i.next();
                        if(e.getEmpno() == empno1){
                            System.out.println(e);
                            found = true;
                        }
                    }
                    if(!found)
                    {
                        System.out.println("Record Not Found"); 
                    }
                    System.out.println("*******************************************");
                    break;
                    
                    
                case 4:
                	
                    found = false;
                    System.out.println("Enter Empno to update: ");
                    empno1 = s.nextInt();
                    System.out.println("*****************************************");
                    ListIterator<Employees> li = c.listIterator();
                    while(li.hasNext()){
                    	
                        Employees e = li.next();
                        if(e.getEmpno() == empno1){
                            System.out.println("Enter new name: ");
                            empname = s1.nextLine();
                            
                            System.out.println("Enter new Designation: ");
                            empDesignation = s1.nextLine();
                            
                            System.out.println("Enter new salary: ");
                            salary = s.nextInt();
                            
                            System.out.println();
                            project = s1.nextLine();
                            
                            System.out.println(" New Deadline/ Extention : ");
                            proj_days = s1.nextLine();
                            
                            li.set(new Employees(empno1, empname, empDesignation, salary, project, proj_days));
                            found = true;
                        }
                    }
                    
                    if(!found){
                        System.out.println("Record Not Found"); 
                    }else{
                        System.out.println("Record updated successfully...!!");
                    }
                    System.out.println("*******************************************");
                    break;
                    
                    
                case 5:
                	
                    found = false;
                    System.out.println("Enter Empno to delete: ");
                    empno1 = s.nextInt();
                    System.out.println("*****************************************");
                    i = c.iterator();
                    while(i.hasNext()){
                        Employees e = i.next();
                        if(e.getEmpno() == empno1){
                            i.remove();
                            found = true;
                        }
                    }
                    
                    
                    if(!found){
                        System.out.println("Record Not Found"); 
                        
                    }else
                    
                    {
                        System.out.println("Record deleted successfully...!!");
                    }
                    System.out.println("*******************************************");
                    break;
                    
                    
                
                    
                case 6:
                	
                    System.out.println("Session Eneded.....");
                    System.exit(0);
                    
                default:
                	
                    System.out.println("Invalid choice!!! Make a valid One.");
            }
        }

    }
    
}
