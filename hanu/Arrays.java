
public class Arrays
{
    public static void main(String[] args)
    {
        // put your code here
        int i, len;
        String[] memberList={"Vương Thị Thảo", "Bùi Anh Tuấn", "Nguyễn Thị Thêu", "Nguyễn Văn Tu"};
        //cach 2: String[] memberList;
        System.out.println("chuoi ten");
        len= memberList.length;
        
        for(i=0;i<len;i++)
        System.out.println(memberList[i]);
        String key;
        System.out.print("Nhap ten :");
        key = TextIO.getln();
        key = key.toLowerCase();
       
        for(i=0;i<len;i++){
            
        memberList[i]=memberList[i].toLowerCase();
        if(memberList[i].indexOf(key) != -1) 
        System.out.print(memberList[i]+"\n");
        
        }
    }
       

}
