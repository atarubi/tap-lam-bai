public class Member_list {
	public static void main(String[] args){
		String [] mem_list;
		String key;
		mem_list= new String[3];
		mem_list[0] = "Hoang Van Kien";
		mem_list[1] = "Bui Trong Nam";
		mem_list[2] = "Do Ngoc am";
		System.out.print("enter name:");
		key = TextIO.getln();
		key = key.toLowerCase();
		for(int i= 0;i<3;i++){
			mem_list[i]=mem_list[i].toLowerCase();
			if(mem_list[i].indexOf(key) != -1) System.out.print(mem_list[i]+"\n");
		}
	}	
}