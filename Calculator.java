
/*import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        int operator,n1,n2;
        System.out.println("1-add \n 2 - sub \n 3-mul\n 4-divide\n 5-mod\n")xc;
        System.out.println("Choose Operator:");
        Scanner sc = new Scanner(System.in);
        operator  = sc.nextInt();
        System.out.println("Enter first number:");
        n1 = sc.nextInt();
        System.out.println("Enter second number:");
        n2 = sc.nextInt();
        int result = 0;
        switch(operator){
            case 1:
                result = n1+n2;
                break;
            case 2:
                result = n1-n2;
                break;
            case 3:
                result = n1*n2;
                break;
            case 4:
                result = n1/n2;
                break;
            case 5:
                result = n1%n2;
                break;
            default:
            System.out.println("Enter operator is not valid:");

        }
        System.out.println("Result is :"+result);
    }
}*/

import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        int operator,n1,n2;
        System.out.println("1-add\n 2-sub\n 3-mul\n 4-div\n 5-mod");
        System.out.println("Choose operator:");
        Scanner sc= new Scanner(System.in);
        operator =sc.nextInt();
        System.out.println("Enter the first value:");
        n1=sc.nextInt();
        System.out.println("Enter the second value:");
        n2=sc.nextInt();
        int result=0;
        switch (operator) {
            case 1:
            result=n1+n2; 
            break;
            case 2:
            result=n1-n2;
            break;
            case 3:
            result=n1*n2;
            break;
            case 4:
            result=n1/n2;
            case 5:
            result=n1%n2;
            break;
        
            default:
            System.out.println("Enter the operator is not valid:");
            
    
        }
        System.out.println("Result is:"+result);
    }
}