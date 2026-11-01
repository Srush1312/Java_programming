//digit sum

import java.util.Scanner;

class Digit
{ 
    public int SumDigit(int iNo)
    {
        iSum=0;
        while(iNo!=0)
        {   
            iSum=iSum+(iNo%10); 
            iNo=iNo/10;                       
        }  
        
        return iSum;
    }
}

class program129
{
    public static void main(String[] A) 
    {
        Scanner scanner=new Scanner(System.in);
        int iRet=0;
        Digit digit=new Digit();

        System.out.println("Enter Number:");
        int ivalue=scanner.nextInt();

        iRet=digit.SumDigit(ivalue);

        System.out.println("sum of Digits is:"+iRet);
    }
}
