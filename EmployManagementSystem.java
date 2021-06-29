import java.util.*;
import java.io.*;
class EmployManagementSystem
{
  public static void main(String arv[])
  {
    /** To clear the output Screen **/
    System.out.print("\033[H\033[2J");
    Scanner sc=new Scanner(System.in);
    Employee_Show epv =new Employee_Show();
    int i=0;
    /*** Callining Mainmenu Class function ****/
    MainMenu obj1 = new MainMenu();
    obj1.menu();
    /*** Initialising loop for Menu Choices ***/
    while(i<6)
    {
      System.out.print("\nPlease Enter choice :");
      i=Integer.parseInt(sc.nextLine());
      /** Switch Case Statements **/
      switch(i)
      {
        case 1:
        {
        /** Creating class's object and calling Function using that object **/
        Employee_Add ep =new Employee_Add();
        ep.createFile();
        System.out.print("\033[H\033[2J");
        obj1.menu();
        break;
        }
        case 2:
        {
          System.out.print("\nPlease Enter Employee's ID :");
          String s=sc.nextLine();
          try
          {
            epv.viewFile(s);}
            catch(Exception e){System.out.println(e);}
            System.out.print("\nPress Enter to Continue...");
            sc.nextLine();
            System.out.print("\033[H\033[2J");
            obj1.menu();
            break;
          }
        case 3:
        {
          System.out.print("\nPlease Enter Employee's ID :");
          String s=sc.nextLine();
          Employee_Remove epr =new Employee_Remove();
          epr.removeFile(s);
          System.out.print("\nPress Enter to Continue...");
          sc.nextLine();
          System.out.print("\033[H\033[2J");
          obj1.menu();
          break;
        }
        case 4:
        {
            System.out.print("\nPlease Enter Employee's ID :");
            String I=sc.nextLine();
            try
            {
              epv.viewFile(I);
            }
            catch(Exception e)
            {
              System.out.println(e);
            }
            
      }
    }
  }
}
}
