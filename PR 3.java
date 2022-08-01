//This Program is done by Disha_21CE082.
import java.util.Scanner;
public class Sample

{
    public static void main(String[] args)
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        boolean c=lastDigit(a,b);
        System.out.println(c);
    }
    static boolean lastDigit(int p,int q)
    {
        if(p%10 == q%10)
            return true;
        else
            return false;
    }
}
