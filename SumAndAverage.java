import java.util.Scanner;
/**
 * Write a program called SumAndAverage to produce the sum of 1, 2, 3, ..., to an upperbound (e.g., 100).
 * Also compute and display the average
 */
public class SumAndAverage{
    public static void main(String[] args){
        //khai bao bien
        int i, n, tong=0 ;
        double tb=0;
        
        Scanner scan= new Scanner(System.in);
        System.out.println("Nhap n");
        n= scan.nextInt();
                        
        for(i=1; i<=n; i++){
            tong= tong + i;        // tong = tong+i
            
        }
        
        tb = (double) tong/n;
        System.out.println("Tong cua day so tu 1 -->" + n + " la : " + tong);
        System.out.println("Trung binh cua day la :" + tb);
                      
               
    }
}
