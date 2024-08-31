package stringInterviewProgram;

public class UpperCaseToLowerCase {
    public void UpperCaseToLower(){
        String Sentence = "CHENNAI is A METRO city in TAMILNADU";
        char[] GivenChar = Sentence.toCharArray();
        for (int i =0;i<Sentence.length();i++){
            if (GivenChar[i]>=65 && GivenChar[i]<=90){
              GivenChar[i] = (char)(GivenChar[i]+32);
            }
        }
        for (int i =0;i<GivenChar.length;i++){
            System.out.print(GivenChar[i]);
        }System.out.println();


    }
    public void LowerCaseToUpper(){
        String Sentence = "CHENNAI is A METRO city in TAMILNADU";
        char[] GivenChar = Sentence.toCharArray();
        for (int i =0;i<Sentence.length();i++){
            if (GivenChar[i]>=97 && GivenChar[i]<=122){
                GivenChar[i] = (char)(GivenChar[i]-32);
            }
        }
        for (int i =0;i<GivenChar.length;i++){
            System.out.print(GivenChar[i]);
        }

    }
    public static void main(String[] args){
        UpperCaseToLowerCase UpperCase = new UpperCaseToLowerCase();
        UpperCase.UpperCaseToLower();
        UpperCase.LowerCaseToUpper();

    }
}
