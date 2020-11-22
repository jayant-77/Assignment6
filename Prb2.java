package Assignment6;
import java.util.*;
class Prb2

{

    int radius;

    float area;

    

    void init()

    {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Radius: ");

        radius=sc.nextInt();

    }

    

    void calculateArea()

    {

        area=(float)(22/7.0f)*(radius*radius);

    }

    

    void display()

    {

        System.out.println("Area: "+area);

    }

}



class Assignment6

{

    public static void main(String [] args)

    {

        Prb2 obj=new Prb2();

        obj.init();

        obj.calculateArea();

        obj.display();

    }

}











