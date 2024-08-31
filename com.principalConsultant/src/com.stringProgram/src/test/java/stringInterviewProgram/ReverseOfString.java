package stringInterviewProgram;

public class ReverseOfString {
    public static void main(String[] args){
        String s = "hi";
        int len = s.length();
        String rev ="";
        for(int i=len-1;i>=0;i--){
            rev= rev + s.charAt(i);
        }
        System.out.println("Reversed String is " +rev);
        if (s.equals(rev)){
            System.out.println("String" +s+ " a palindrome");
        }else {
            System.out.println("String " +s+ " not a palindrome");
        }
    }
}
