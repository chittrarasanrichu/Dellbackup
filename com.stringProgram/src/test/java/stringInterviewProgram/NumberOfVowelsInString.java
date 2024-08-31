package stringInterviewProgram;

public class NumberOfVowelsInString
{
    public void SumOfVowels(){
        String GivenText = "Antony pius is joker and fool";
        int count=0;
        for (int i=0;i<GivenText.length();i++){
            if (GivenText.charAt(i)=='A'|| GivenText.charAt(i)=='E' ||GivenText.charAt(i)=='I' ||
            GivenText.charAt(i)=='O'||  GivenText.charAt(i)=='U'||  GivenText.charAt(i)=='a'|| GivenText.charAt(i)=='e'
            || GivenText.charAt(i)=='i'|| GivenText.charAt(i)=='o'|| GivenText.charAt(i)=='u'){
              count++;
            }
        }System.out.print(count);
    }
    public static void main(String[] args){
        NumberOfVowelsInString num = new NumberOfVowelsInString();
        num.SumOfVowels();
    }
}
