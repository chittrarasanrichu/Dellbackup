package stringInterviewProgram;

public class ReverseTheSentence {

    public static void Split() {

        String s = "Antony is a joker";
        String[] a = s.split(" ");
//        for (String splitted : a) {
//            System.out.println(splitted);
//        }

        int StringLength = a.length;
        String rev = "";
        String space = " ";
        for(int i = StringLength-1;i>=0;i--){
         rev = rev + space +a[i];
         }
        System.out.println(rev);


    }
    public static void main(String[] args)
    {
        ReverseTheSentence.Split();
    }
}
