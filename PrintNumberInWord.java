import java.util.Scanner;
/**
 *Write a program called PrintNumberInWord which prints "ONE", "TWO",... , "NINE", "OTHER" 
 *if the int variable "number" is 1, 2,... , 9, or other, respectively
 *Use (a) a "nested-if" statement; (b) a "switch-case" statement.
 */
public class PrintNumberInWord{
    public static void main(String []args){
        //sudung vs if else
        Scanner scan= new Scanner(System.in);
        System.out.println("nhap so tu 1-->9:");
        int num= scan.nextInt();
        
        if(num==1){
            System.out.println("One");
        }
        else if (num==2){
            System.out.println("Two");            
        }
        else if (num==3){
            System.out.println("Three");
        }
        else if(num==4){
            System.out.println("Four");            
        }
        else if(num==5){
            System.out.println("Five");            
        }
        else if(num==6){
            System.out.println("Six");            
        }
        else if(num==7){
            System.out.println("Seven");            
        }
        else if(num==8){
            System.out.println("Eight");            
        }
        else{
            System.out.println("Nine");
        }
    }
       
}
