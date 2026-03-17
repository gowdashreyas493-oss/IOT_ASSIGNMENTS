package Module9;
import java.util.*;
public class Parantheses {
    public static void generate(int open,int close,String current,List<String> result){
        if(open==0 && close==0){
            result.add(current);
            return;
        }
        if(open>0)
            generate(open-1,close,current+"(",result);
        if(close>open)
            generate(open,close-1,current+")",result);
    }
    public static List<String> generateParenthesis(int n){
        List<String> result=new ArrayList<>();
        generate(n,n,"",result);
        return result;
    }
    public static void main(String[] args){
        System.out.println(generateParenthesis(3));
    }
}