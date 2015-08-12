import java.util.Scanner;
/**
 * Write a program called ReverseString, which prompts user for a String
 * and prints the reverse of the String
 */
public class St_1{
    public static void main(String [] args){
        String s;
        String s1=new String();        //câu lệnh cần thiết để tạo ra chuỗi mới
        int i, l;
       
        
        Scanner scan= new Scanner(System.in);
        System.out.println(" Nhap chuoi :");
        s= scan.next();
        
        l=s.length();
       System.out.println("Day moi la" );
       for(i=l-1;i>=0;i--){   
           
           s1= s1 + s.charAt(i);     //su dung charAt để chọn tất cả chuỗi
               
        }
       
       System.out.println(s1);
      
    }
}