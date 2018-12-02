/*
 *INSTANCIAS JS
 */
package modelo;
import javax.script.*;

public class instanciasJS {

    public class EvalScript {
        
        public int pruebajs() throws ScriptException{
            int x=0;
            
            // create a script engine manager
            ScriptEngineManager factory = new ScriptEngineManager();
            // create a JavaScript engine
            ScriptEngine engine = factory.getEngineByName("JavaScript");
            // evaluate JavaScript code from String
            engine.eval("print('Hello, World')");
            
            return x;
        
        } 
    
        
        public void main(String[] args) throws Exception {
            
    }
    }
    
}
