import java.util.Scanner;
/**
 * Write a description of class if_else here.
 * Exercise CheckPassFail (if-else): 
 * Write a program which prints "PASS" if the int variable "mark" is more than or equal to 50
 * or prints "FAIL" otherwise.
 */
public class If_else {
    public static void main (String [] args){
       
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap diem so cua ban");
        int ds= scan.nextInt();
        
        if(ds >=50){
            System.out.println("PASS");

        }
        else
            {System.out.println("FALL");
        }
                      
        
    }
}
