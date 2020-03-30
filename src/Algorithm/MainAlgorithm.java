package Algorithm;

import java.util.Stack;

public class MainAlgorithm {
    Stack<String> StackList = new Stack<>();
    public Stack<String> getStack() {
        return this.StackList;
    }
    public void AddToStack(String input) {
        StackList.push(input);
    }
    //METHODS START

    //algoritm for generating combinations
        //TODO: Find a good algoritm for finding the combinations
        public static void combination(String[] elements, int k) {

        }
    //String Parsers
    public void ParsingStringVersions(String Input){
        AddToStack(Input);
        AddToStack(Input.toUpperCase());
        AddToStack(Input.toLowerCase());
    }
    public void ParsingStringVersionWithNames(String Input) {
        AddToStack(GetAbreviationOfString(Input.toLowerCase()));
        AddToStack(GetAbreviationOfString(Input));
    }
    //other methods
    public String GetAbreviationOfString(String Input) {
        char Abrv = Input.charAt(0);
        String Abreviation = Character.toString(Abrv);
        return Abreviation;
    }
}
