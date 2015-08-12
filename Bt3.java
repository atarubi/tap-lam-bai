import java.util.Scanner;
/**
 *  the program to find the "sum of the squares" of all the numbers from 1 to n
 *  i.e. 1*1 + 2*2 + 3*3 + ... + 100*100
 */
public class Bt3{
    public static void main(String[] args){
        int i, n, tong=0, dem=0;
        
        Scanner scan= new Scanner(System.in);
        System.out.println("Nhap n");
        n= scan.nextInt();
        
        for(i=1; i<=n; i++){
            tong += i*i;
           
        }
        
        System.out.println("Tong cua day binh phiong tu 1 --> "+ n+ " la " + tong);
      
    }
}
