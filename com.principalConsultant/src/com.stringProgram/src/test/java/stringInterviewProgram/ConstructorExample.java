package stringInterviewProgram;

public class ConstructorExample {
    String name;
    int ID;

    ConstructorExample(){
        name="mathu";
        ID=76;
    }
    public void NoArgumentConstructor(){
        System.out.println("Candidate name is "+name+" his ID is "+ID);
    }
public static void main(String[] args){

    ConstructorExample ex = new ConstructorExample();
    ex.NoArgumentConstructor();
}
}
