public class file
{
    public static void main(String [] args)
    {
        // put your code here
        int id;
        String  clas, user;
        //viet ra man hinh
        TextIO.putln("Nhap id ");       //sdung TextIO
        id= TextIO.getlnInt();
        
        TextIO.putln("Nhap lop ");
        clas= TextIO.getln();
        
        user= clas.substring(0,2)+id;      //cat tu vi tri nao
        //file 
        
        
        //file= TextIO.wrtiefile();
        //viet vao file
        TextIO.writeFile("profile.txt"); //cai nay ton tai o o E
        TextIO.putln("username: "+ user);
        //viet ra man hinh 
        TextIO.writeStandardOutput();
        TextIO.putln("done");
    }
}
