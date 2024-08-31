package stringInterviewProgram;

import java.security.PublicKey;

public class ReplacingVowelsWithSpecialChar {
    public String Vowel() {
        String s = "Richu";
        int len = s.length();
        String ReplacedString = s.replaceAll("[AEIOUaeiou]", "\\$");

        System.out.println(ReplacedString);
        return ReplacedString;
    }
    public void WithoutInbuiltFunction(){
        String TextGiven="mukesh";
        char[] charArray = TextGiven.toCharArray();
        for (int i=0;i<TextGiven.length();i++) {
            if (TextGiven.charAt(i)=='A'|| TextGiven.charAt(i)=='E'|| TextGiven.charAt(i)=='I'||
                    TextGiven.charAt(i)=='O'|| TextGiven.charAt(i)=='U'|| TextGiven.charAt(i)=='a'||
                    TextGiven.charAt(i)=='a'|| TextGiven.charAt(i)=='e'|| TextGiven.charAt(i)=='i'||
                    TextGiven.charAt(i)=='o'|| TextGiven.charAt(i)=='u'){
                charArray[i]='%';
            }
        }
        for (int j=0;j<TextGiven.length();j++){
            System.out.print(charArray[j]);
        }
    }

     public static void main(String[] args){
        ReplacingVowelsWithSpecialChar rep = new ReplacingVowelsWithSpecialChar();
        rep.Vowel();
         rep.WithoutInbuiltFunction();
     }
    }


