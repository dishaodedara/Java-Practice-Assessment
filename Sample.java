//Practicle is done by Disha_21ce082.
import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String A = sc.nextLine();
        startOZ(A);
    }

    static void startOZ(String a) {
        if (a.charAt(0) == 'O' || a.charAt(0) == 'o') {
            System.out.print(a.charAt(0));
        }
        if (a.charAt(1) == 'z' || a.charAt(1) == 'Z') {
            System.out.print(a.charAt(1));
        }
    }
}

