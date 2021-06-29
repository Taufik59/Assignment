import java.util.*;
import java.io.*;
class EmployDetail
{
    String first_name;
    String middle_name;
    String last_name;
    String email;
    String designation;
    String employ_id;
    String employ_dob;
    String employ_gender;
    String employ_contact;
    public void getInfo()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Employee's First_name --------: ");
        first_name=sc.nextLine();
        System.out.print("Enter Employee's Middle_name --------: ");
        middle_name=sc.nextLine();
        System.out.print("Enter Employee's Last_name --------: ");
        last_name=sc.nextLine();
        System.out.print("Enter Employee's Email ID ----: ");
        email=sc.nextLine();
        System.out.print("Enter Employee's Designation ----: ");
        designation=sc.nextLine();
        System.out.print("Enter Employee's ID ----------: ");
        employ_id=sc.nextLine();
        System.out.print("Enter Employee's DOB ------: ");
        employ_dob=sc.nextLine();
        System.out.print("Enter Employee's Gender ------: ");
        employ_gender=sc.nextLine();
        System.out.print("Enter Employee contact Info --: ");
        employ_contact=sc.nextLine();
    
    }
}