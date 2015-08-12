import java.util.Scanner;
public class bai3_5 {   
               
    public static void main (String [] args){
        
            TextIO.writeFile("sales.dat");
            TextIO.putln("New York: 21431.123");
            TextIO.putln("Ha Noi:  28441.0124");
            TextIO.putln("Sai Gon:  28731.1432");
            TextIO.putln("Ho Chi Minh: no report received");
            TextIO.putln("Da Nang: 29124.213");
            TextIO.putln("Hue: no report received");
            TextIO.putln("Hai Phong: no report received");
            TextIO.putln("Hoa Binh: 28473.30");
            TextIO.writeStandardOutput();
   
            double total=0;
            int city = 0;
            int pos;
            TextIO.readFile("sales.dat");
            while (TextIO.eof()==false){
                    String b = TextIO.getln();
                    pos = b.indexOf(":");
                    String c = b.substring(pos+1);
                    try{
                            total =total+ Double.parseDouble(c);
                        }
                    catch (IllegalArgumentException e){
                        city++;
                }
            }
            TextIO.readStandardInput();
            
            TextIO.putln("The total sales of all cities is: "+total);
            TextIO.putln("The total number of cities that don't have data is:"+city);
    
            
            TextIO.putln("Reading data from file: sale.dats");
           
    }
}