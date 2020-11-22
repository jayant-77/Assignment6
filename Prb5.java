package Assignment6;
import java.util.*;
class Prb5

{

    static int empNo=0;

    int salery;

    static int totalSalery=0;

    

    Prb5(int sal)

    {

        salery=sal;

        empNo++;

        totalSalery=totalSalery+salery;

    }

    

    static void display()

    {

        System.out.println("\nTotal Employees: "+empNo+"\nTotal Salery of all Employees: "+totalSalery);

    }

    

}



class Employee

{

    public static void main(String [] args)

    {

        Scanner sc=new Scanner(System.in);

        

        System.out.print("Enter total Entries: ");

        int n=sc.nextInt();

        

        for(int i=0;i<n;i++)

        {

            System.out.print("Enter Salery of Employee "+(i+1)+": ");

            int s=sc.nextInt();

            Prb5 emp=new Prb5(s);

        }

        

        Prb5.display();

    }

}








