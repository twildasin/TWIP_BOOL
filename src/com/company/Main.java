package com.company;
import java.util.*;
import javax.script.*;




public class Main {

    public static void main(String[] args) /*throws ScriptException*/{
Scanner ab = new Scanner(System.in);



        String expression = "(A && B) || A";
        expression = expression.replace(" ", "");
        expression = expression.replaceAll("&&", "*");
        expression = expression.replaceAll("\\|\\|", "+");
        expression = expression.replaceAll("!A", "0");
        expression = expression.replaceAll("!B", "0");
        expression = expression.replaceAll("A", "1");
        expression = expression.replaceAll("B", "1");
        expression = expression.replaceAll("A", "1");
        expression = expression.replaceAll("B", "1");

        System.out.println(expression);

        // Get JavaScript engine
        ScriptEngine engine = new ScriptEngineManager().getEngineByExtension("js");

        try {
            // Evaluate the expression
            Object result = engine.eval(expression);

            System.out.println(result);
        }
        catch (ScriptException e) {
            // Something went wrong
            //e.printStackTrace();
            System.out.println("Error");
        }

    }
}
