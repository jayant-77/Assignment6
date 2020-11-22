package Assignment6;
import java.util.*;
class Prb3

{

    static int add(int a, int b)

    {

        return a+b;

    }

    

    static int subtract(int a, int b)

    {

        if(b>a)

            return b-a;

        else

        return a-b;

    }

    

    static int multiply(int a, int b)

    {

        return a*b;

    }

    

    static double power(int a, int b)

    {

        return Prb3.power(a,b);

    }

}



class Operation

{

    public static void main(String [] args)

    {

        Scanner sc=new Scanner(System.in);

        System.out.println("a: ");

        int a=sc.nextInt();

        System.out.println("b: ");

        int b=sc.nextInt();

        

        System.out.println(Prb3.add(a,b));

        System.out.println(Prb3.subtract(a,b));

        System.out.println(Prb3.multiply(a,b));

        System.out.println(Prb3.power(a,b));

    }

}






