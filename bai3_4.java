public class bai3_4 {
     
   public static void main(String[] args) {
   
       String line;    
       int i;          
       char ch;       
       boolean CR;  
       
       TextIO.putln("Enter a line of text.");
       TextIO.put(" -->");
       line = TextIO.getln();
       
       TextIO.putln();
       CR = true;
       
       for ( i = 0;  i < line.length();  i++ ) {
          ch = line.charAt(i);
          if ( Character.isLetter(ch) ) {
             TextIO.put(ch);
             CR = false;
          }
          else {
             if ( CR == false ) {
                TextIO.putln();
                CR = true;
             }
          }
       }
       
       TextIO.putln();  
         
   }  

}  