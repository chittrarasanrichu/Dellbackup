package stringInterviewProgram;

import java.util.ArrayList;

public class JavaStream {

    public static void main(String[] args){

        ArrayList<String> name = new ArrayList<String>();
        name.add("Antony");
        name.add("pius");
        name.add("Akshay");
        name.add("koushik");
        name.add("BALA");
       // System.out.println(name);
        long c = name.stream().filter(s -> s.contains("A")).count();
        System.out.println(c);
    }
}
