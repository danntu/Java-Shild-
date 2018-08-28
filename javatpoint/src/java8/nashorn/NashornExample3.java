package java8.nashorn;

import javax.script.*;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class NashornExample3 {
    public static void main(String[] args) throws FileNotFoundException, ScriptException {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("Nashorn");
        Bindings bindings = engine.getBindings(ScriptContext.ENGINE_SCOPE);
        bindings.put("name", "Danik123");
        engine.eval(new FileReader("javatpoint/src/java8/nashorn/hello4.js"));
    }
}
