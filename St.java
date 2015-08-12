import java.util.Scanner;
/**
 * Write a program called ReverseString, which prompts user for a String
 * and prints the reverse of the String
 */
public class St{
    public static void main(String [] args){
        String s, s1;
        String s2=new String();
        int i, l;
       
        
        Scanner scan= new Scanner(System.in);
        System.out.println(" Nhap chuoi :");
        s= scan.next();
        
        l=s.length();
       System.out.println("Day moi la" );
       for(i=l-1;i>=0;i--){   
           
           s1=s.substring(i,i+1);
           
           s2 = s2 + s1;        
               
            
       }
       
       System.out.println(s2);
      
    }
}