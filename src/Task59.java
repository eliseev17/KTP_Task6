import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Vector;

public class Task59 {
    public static void main(String[] args) {
        try {
            System.out.println(formula("6 * 4 = 24"));
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }

    public static boolean formula(String str) throws ScriptException {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        String[] expressions = str.split("=");
        Vector<Integer> results = new Vector<Integer>();
        for (String expression : expressions) {
            results.add((Integer) engine.eval(expression));
        }
        int check = results.get(0);
        for (Integer value : results) {
            if (value != check)
                return false;
        }
        return true;
    }
}
