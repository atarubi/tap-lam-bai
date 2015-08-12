
public class su_dung_ham{
    public static void main(String [] args){
        String diachi,ten;
        int ntn;
        System.out.println("nhap dia chi");
        diachi=TextIO.getln();
        
        //System.out.println("dia chi cua ban la " + diachi);
        //System.out.println("nhap nam sinh cua ");
        //ntn=TextIO.getlnInt();
        //System.out.println("thong tin ve ban " + ntn);
        
        //TextIO.putln("Good Afternoon!  This program will create");
        //TextIO.putln("your profile file, if you will just answer");
        //TextIO.putln("a few simple questions.");
       // TextIO.putln();
        
        TextIO.putln("ten la gi");
        TextIO.writeFile("profile.doc"); //cai nay ton tai o o E
        ten=TextIO.getln();
        TextIO.putln("username: "+ ten );
        //viet ra man hinh 
        TextIO.writeStandardOutput();
        TextIO.putln("done");
        
    }
}