import java.util.Scanner;
/**
 * a program called HarmonicSum to compute the sum of a harmonic series, as shown below, where n=50000
 */
public class Bt4{
    public static void main(String[] args){
        int n, i;
        float tong=0;
        
        Scanner scan= new Scanner(System.in);
        System.out.println("nhap n");
        n= scan.nextInt();
        
        for(i=1; i<=n;i++){
            tong +=(float) 1/i;  
        }
        
        System.out.println("tong cua day HarmonicSum la: "+ tong);
    }
    
}