import java.util.Scanner;
/**
 * the program to sum only the odd numbers from 1 to 100, and compute the average.
 */
public class Bt1{
    public static void main(String []args){
        int i, n, tong=0, dem =0;
        float tb =0 ;
        
        Scanner scan= new Scanner(System.in);
        System.out.println("Nhap n:");
        n= scan.nextInt();
        
        for(i=1; i<=n; i++){
            if(i%2==1){
                tong += i;
                
                ++dem;
           
            }
            tb = (float)tong/dem;   
        }
        System.out.println("tong day so tu 1--> "+ n + "la: " + tong);
        System.out.println("trung binh cong cua day la: "+ tb);
    }
}