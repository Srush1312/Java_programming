import java.util.Scanner;


class program27
{ 
    public static void main(String A[])
    {
        Scanner scanner = null ;
        String sName=null;

        int iAge=0;
        float fMarks=0.0; //error

        scanner=new Scanner(System.in);   

        System.out.println("Enter Your Name:");
        sName=scanner.next();   //space 

        System.out.println("Enter Your Age:");
        iAge=Scanner.nextInt();

        System.out.println("Enter Your Marks:");
        System.out.println("Welcome "+sName);

        System.out.println("your age:"+iage);
        System.out.println("your marks:"+fmarks);


    }
    
}
