//digit sum

import java.util.Scanner;

class Digit
{ 
    public int SumDigit(int iNo)
    {
        while(iNo!=0)
        {   
            iDigit=iNo%10;
            iSum=iSum+iDigit; 
            iNo=iNo/10;                       
        }  
        
        return iSum;
    }
}

class program128
{
    public static void main(String[] A) 
    {
        Scanner scanner=new Scanner(System.in);
        int iRet=0;
        Digit digit=new Digit();

        System.out.println("Enter Number:");
        int ivalue=scanner.nextInt();

        iRet=digit.SumDigit(ivalue);

        System.out.println("Number Of Digits:"+iRet);
    }
}
