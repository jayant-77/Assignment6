package Assignment6;
import java.util.*;
class Prb4

{

    int multiply(int a, int b)

    {

        return a*b;

    }

    

    double multiply(float a, float b, float c)

    {

        return a*b*c;

    }

    

    double multiply(int arr[])

    {

        double pro=0;

        for(int i=0;i<arr.length;i++)

        {

            pro=pro+arr[i];

        }

        return pro;

    }

    

    double multiply(double a, int b)

    {

        return a*b;

    }

}



class Math

{

    public static void main(String [] args)

    {

        Scanner sc=new Scanner(System.in);

        System.out.print("Int a: ");

        int a=sc.nextInt();

        System.out.print("Int b: ");

        int b=sc.nextInt();

        

        System.out.print("Float c: ");

        float c=sc.nextFloat();

        System.out.print("Float d: ");

        float d=sc.nextFloat();

        System.out.print("Float e: ");

        float e=sc.nextFloat();

        

        System.out.print("Enter Array Length: ");

        int x=sc.nextInt();

        int arr[]=new int[x];

        for(int i=0;i<x;i++)

        {

            System.out.print("a[i+1]: ");

            arr[i]=sc.nextInt();

        }

        

        System.out.print("Double f: ");

        double f=sc.nextDouble();

        System.out.print("Int g: ");

        int g=sc.nextInt();

        

        Prb4 obj=new Prb4();

        

        System.out.println("\nDouble a*b: "+obj.multiply(a,b));

        System.out.println("Double c*d: "+obj.multiply(c,d,e));

        System.out.println("Double e*f: "+obj.multiply(arr));

        System.out.println("Double g*h: "+obj.multiply(a,b));

    }

}



