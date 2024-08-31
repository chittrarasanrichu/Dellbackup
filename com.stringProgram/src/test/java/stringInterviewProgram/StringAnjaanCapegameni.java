package stringInterviewProgram;

public class StringAnjaanCapegameni {

    public static void main(String[] args) {
        String s = "Richu";
      //printing the char of string based on index value
        for(int i=0;i<s.length();i++) {
           int a= s.indexOf(s.charAt(i));
            for (int j=0;j<=a;j++){
                System.out.print(s.charAt(i));
            }System.out.println();
        }

    }
}
