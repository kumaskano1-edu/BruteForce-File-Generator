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
    public static String[] combinations(String[] array) {

        //TODO: Find a good algoritm for finding the combinations
        String[] res = new String[-1 >>> -array.length];
        for (int i = array.length, k = 0; --i >= 0;) {
            String s = res[k] = array[i].toString();
            for (int j = 0, x = k++; j < x;)
                res[k++] = s + res[j++];
        }
        return res;
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
