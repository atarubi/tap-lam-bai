

public class cach_dung_ham
{
    
    public static void main(String[] args)
    {
        // put your code here
        int id;
        String  clas, user;
        System.out.println("Nhap id ");
        id= TextIO.getlnInt();
        
        System.out.println("Nhap lop ");
        clas= TextIO.getln();
        
        user= clas.substring(0,2);      //cat tu vi tri nao
        System.out.println("user name " + user + id);
        //lay do dai cua  mot chuoi      
            
    }
}
