import java.util.*;

interface theory //parent 1
{
    //public static final
    int tno = 3;

    //abstract methods
    void tinput();
    void toutput();

    static void show()
    {
        System.out.println("No. of theory subjects: "+tno);
    }

      void th_input()
    {
        int i;
        for(i=0; i<th; i++)
        {
            System.out.println("Enter subject: " +i+1+":");
            th_subject[i]=sc.next();

            System.out.println("Enter marks: " +i+1+":");
            th_marks[i]=sc.nextInt();

        }
    }

    void calculate()
    {

    } 

    void output()
    {
        
    }
}

interface practical //parent 2
{
    int pinput();
    int poutput();

    public static void show()
    {
        System.out.println("No. of practicals subjects: "+pno);
    }

    void th_input()
    {
        int i;
        for(i=0; i<th; i++)
        {
            System.out.println("Enter subject: " +i+1+":");
            th_subject[i]=sc.next();

            System.out.println("Enter marks: " +i+1+":");
            th_marks[i]=sc.nextInt();

        }
    }

    void calculate()
    {

    } 

    void output()
    {
        
    }
}

//child
class Marksheet implements theory, practical
{

    String thString = new String(th_no);
    int th_marks new int(th_no);

    String pString = new String(p)

}

class mmultiple
{

    Marksheet m1 = new Marksheet();
    Scanner sc = new Scanner();

    m1.tinput();
    m1.pinput();
    m1.calculate();
    m1.poutput();
    m1.output();
} 