import java.util.Scanner;
/**
 *Cho truoc 1 xau ky tu la ho ten nguoi day du nhung khi nhap co the thua mot so dau cach.
 *Hay xoa di cac dau cach thua va in ra ho ten chinh xac.
 */
public class Sua_ten{
    public static void main(String[] args ){
        
        String s;
        String S1,S2 = new String ();
              
        Scanner scan= new Scanner(System.in);
        System.out.println("Nhap chuoi ki tu bat ki:");
        s= scan.nextLine();
        
        s=s.trim();
        for (int k=0; k<s.length();k++){
            S1=s.substring(k,k+1);
            if (S1.equals(" ")){
                S1=s.substring(k+1,k+2);
                if (S1.equals(" "))
                continue;
                else S2=S2+s.substring(k,k+1);
                
            }
            else S2=S2+S1;
                        
        }
        
        System.out.print(S2);
        System.out.println("");           
         
        }
        
        
    }
        
