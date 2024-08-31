package org.example;

public class ReverseEachWordInString {
    public void ReverseEachWord(){
        String n = "this is javatpoint";
       String[] split = n.split(" ");
       for(String e : split){
           StringBuffer buf = new StringBuffer(e);
           //String rev = buf.reverse();
           int len = e.length();
           String rev = "";
           for (int i=len-1;i>=0;i--){
               rev= rev+e.charAt(i);

           }
           System.out.println(rev);
       }
    }

   public static void main(String[] args){
        ReverseEachWordInString str = new ReverseEachWordInString();
        str.ReverseEachWord();

   }

}
