//accept no from user and count the no. of digits in that no.

import java.util.Scanner;

class Digit
{ 
    public int CountDigits(int iNo)
    {
        int iDigit=0;
        int icount=0;

        if(iNo<0)
        {
            iNo=-iNo;
        }
        while(iNo!=0)
        {
            iDigit=iNo%10;    
            iNo=iNo/10;
            icount++;                       
        }  
        
        return icount;
    }
}

class program126
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
