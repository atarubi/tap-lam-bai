import java.util.Scanner;
/**
 *In ra man hinh tat ca cac hop so tu 1-->k
 */
public class In_hop_so{
    public static void main(String[] args ){
        //bai sai loi logic ma van chua tim ra duoc
        int i, n, dem= 0, k;
        
        //Scanner scan= new Scanner(System.in);
        //System.out.println("Nhap k: ");
        //k= scan.nextInt();
        
        for(i=0; i<=100; i++){
            for(n=2; n<i; n++){
                if(i%n==0){
                    dem= dem +1;
                    
                }
                
            }
            
        }
       if(dem>1){
                System.out.println("hop so la"+i);
       }
        
       
    }
}
