import java.util.Scanner;
/**
 * the program to sum those numbers from 1 to n that is divisible by 7, and compute the average
 */
public class Bt2{
    public static void main(String[] args){
        int i, n, tong=0, dem=0;
        float tb;
        
        Scanner scan= new Scanner(System.in);
        System.out.println("Nhap n");
        n = scan.nextInt();
        
        for(i=1; i<=n; i++){
            if(i%7==0){
                tong+=i;
                ++dem;
            }
        }
        tb = (float) tong/dem;
        System.out.println("Tong cua day so tu 1 --> "+ n +" va chia het cho 7 la:" + tong );
        System.out.println("trung binh cong cua day so do la: " + tb);
                
    }
}
