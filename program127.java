//accept no from user and count the no. of digits in that no.

import java.util.Scanner;

class Digit
{ 
    public int CountDigits(int iNo)
    {
        int icount=0;

        while(iNo!=0)
        {    
            iNo=iNo/10;
            icount++;                       
        }  
        
        return icount;
    }
}

class program127
{
    public static void main(String[] A) 
    {
        Scanner scanner=new Scanner(System.in);
        int iRet=0;
        Digit digit=new Digit();

        System.out.println("Enter Number:");
        int ivalue=scanner.nextInt();

        iRet=digit.CountDigits(ivalue);

        System.out.println("Number Of Digits:"+iRet);
    }
}
