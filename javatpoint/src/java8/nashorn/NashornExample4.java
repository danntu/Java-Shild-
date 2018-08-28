package java8.nashorn;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class NashornExample4 {
    public static void main(String[] args) throws FileNotFoundException, ScriptException, NoSuchMethodException {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("Nashorn");
        engine.eval(new FileReader("javatpoint/src/java8/nashorn/hello8.js"));

        Invocable invocable = (Invocable) engine;
        invocable.invokeFunction("functionDemo1");
        invocable.invokeFunction("functionDemo2", "Danik");
    }
}
