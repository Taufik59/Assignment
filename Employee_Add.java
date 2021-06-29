import java.util.*;
import java.io.*;

class Employee_Add
{
    public void createFile()
    {
        Scanner sc=new Scanner(System.in);
        EmployDetail emp=new EmployDetail();
        emp.getInfo();
        try{
            File f1=new File("file"+emp.employ_id+".txt");
            if(f1.createNewFile()){
                FileWriter myWriter = new FileWriter("file"+emp.employ_id+".txt");
                myWriter.write("Employee First Name     :"+emp.first_name+"\n"+
                "Middle Name     :"+emp.middle_name+"\n"+
                "Last Name     :"+emp.last_name+"\n"+
                "Email Information :"+emp.email+"\n"+
                "Employee Designation :"+emp.designation+"\n"+
                "Employee ID:"+emp.employ_id+"\n"+
                "Employee DOB:"+emp.employ_dob+"\n"+
                "Employee Gender:"+emp.employ_gender+"\n"+
                "Employee Contact  :"+emp.employ_contact+"\n");
                myWriter.close();
                System.out.println("\nEmployee has been Added :)\n");
                System.out.print("\nPress Enter to Continue...");
                sc.nextLine();
            }
            else {
                System.out.println("\nEmployee already exists :(");
                System.out.print("\nPress Enter to Continue...");
                sc.nextLine();
            }
        }
        catch(Exception e){System.out.println(e);}
    }
}