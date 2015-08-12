import java.util.Scanner;
/**
 * Write a description of class check_odd_even here.
 * Write a program which prints "Odd Number" if the int variable “number” is odd
 * or “Even Number” otherwise.
 */
public class CheckOddEven{
    public static void main(String[] args){
        
        Scanner scan= new Scanner(System.in);
        System.out.println("Nhap so :");
        int so= scan.nextInt();
        
        if(so%2==1){
            System.out.println("So ban nhap la so le!");
        }
        else{
            System.out.println("So ban nhap la so chan !");
        }
        
    }
}
