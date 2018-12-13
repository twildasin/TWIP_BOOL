package com.company;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Created by tw073 on 12/11/18.
 */
public class solver {

    private String str;

    public solver(String a){

        str = a;

    }

    public static int solve (String str, int a, int b)
    {



        str = str.replaceAll("!A", (a == 0) ? "1" : "0");
        str = str.replaceAll("!B", (b == 0) ? "1" : "0");

        str = str.replaceAll("A", Integer.toString(a));
        str = str.replaceAll("B", Integer.toString(b));




        ScriptEngine engine = new ScriptEngineManager().getEngineByExtension("js");

        int end = -1;
        System.out.println(str);

        try {
            // Evaluate the expression
            Object result = engine.eval(str);

            System.out.println(result);
            if(result.equals(0) ){
                end = 0;
            }else if (!result.equals(0)){
                end = 1;
            }
        }
        catch (ScriptException e) {
            // Something went wrong
            //e.printStackTrace();
            System.out.println("Error");
            end = -1;
        }
        return end;



    }


}
