//Practicle is done by Disha-21ce082.
import java.util.Scanner;
import static java.lang.Math.min;
public class Sample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string : ");
        String a=sc.next();
        System.out.println("Enter second string : ");
        String b=sc.next();
        int c=stringMatch(a,b);
        System.out.println(c);
    }
    static int stringMatch(String x,String y)
    {
        int count=0;
        int f=min(x.length(),y.length());
        for(int i=0;i<f-1;i++)
        {
            String z=x.substring(i,i+2);
            String t=y.substring(i,i+2);
            if(z.equals(t))
            {
                count++;
            }
        }
        return count;
    }
}