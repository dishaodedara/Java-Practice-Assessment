
// Practicle is done by Disha-21ce082.
import java.util.*;
class Sample
{
    public static void main (String args[])
    {
        array a = new array();
        a.getdata();
        a.check();
    }
    String key[] = { "D", "B", "D", "C", "C", "D", "A", "E", "A", "D" };
    String mcq[][] = new String[8][10];
    String store[] = new String[10];
    int marks[] = new int[8];
    /*
    String key[] = { "D", "B", "D", "C", "C", "D", "A", "E", "A", "D" };
    String mcq[][] = {{ "A", "B", "A", "C", "C", "D", "E", "E", "A", "D" },
    { "D", "B", "A", "B", "C", "A", "E", "E", "A", "D" },
    { "E", "D", "D", "A", "C", "B", "E", "E", "A", "D" },
    { "C", "B", "A", "E", "D", "C", "E", "E", "A", "D" },
    { "A", "B", "D", "C", "C", "D", "E", "E", "A", "D" },
    { "B", "B", "E", "C", "C", "D", "E", "E", "A", "D" },
    { "B", "B", "A", "C", "C", "D", "E", "E", "A", "D" },
    { "E", "B", "E", "C", "C", "D", "E", "E", "A", "D" }
    };
    int marks[] = new int[8];
    */
    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<8; i++)
        {
            System.out.print("Enter Marks for Student Number "+(i+1)+": ");
            store[i] = sc.nextLine();
            mcq[i] = store[i].split(" ");
        }
    }
    void check()
    {
        for(int i=0; i<8; i++)
        {
            marks[i]=0;
        }
        for(int i=0; i<8; i++)
        {
            for(int j=0; j<10; j++)
            {
                if(mcq[i][j].compareTo(key[j])==0)
                {
                    marks[i]++;
                }
            }
        }
        for(int i=0; i<8; i++)
        {
            System.out.println("Student Number "+(i+1)+" has gained "+marks[i]+" marks");
        }
    }
}