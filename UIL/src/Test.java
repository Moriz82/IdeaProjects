import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.*;
import java.io.*;

public class Test {
    public static void main(String[] args) throws ScriptException {
        Scanner scan = new Scanner(System.in);
        String problem = scan.nextLine();
        int red = 1, blue = 1;
        String newProblem = "";

        for (int i = 1; i < problem.length()+1; i++) {
            boolean b = false;
            if (problem.length()>i){
                b = problem.charAt(i) == '#' || problem.charAt(i) == '@';
            }

                if (problem.charAt(i-1) == '#'){
                if (b){
                    newProblem+=red+"+";
                }
                else{
                    newProblem+=red;
                }
            }
            if (problem.charAt(i-1) == '@'){
                if (b){
                    newProblem+=red+"+";
                }
                else{
                    newProblem+=red;
                }
            }
            if (problem.charAt(i-1) == '&'){
                newProblem+="+";
            }
            if (problem.charAt(i-1) == '%'){
                newProblem+="-";
            }
            if (problem.charAt(i-1) == '*'){
                newProblem+="*";
            }
            if (problem.charAt(i-1) == '$'){
                newProblem+="%";
            }
        }
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("js");
        System.out.println(engine.eval(newProblem));
    }
}

