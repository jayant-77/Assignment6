package Assignment6;
import java.util.*;
class Student

{

    int rollno;

    String name;

    

    void setData(int rollno, String name)

    {

        this.rollno=rollno;

        this.name=name;

    }

    

    void showData()

    {

        System.out.println("ID: "+rollno);

        System.out.println("Name: "+name);

    }

}



class Prb1

{

    public static void main(String [] args)

    {

        Student obj=new Student();

        obj.setData(12345,"Jayant");

        obj.showData();

    }

}






