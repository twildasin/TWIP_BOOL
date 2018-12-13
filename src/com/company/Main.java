package com.company;
import java.util.*;
import javax.script.*;




public class Main {

    public static void main(String[] args) /*throws ScriptException*/{

        Scanner ab = new Scanner(System.in);
        System.out.println("Input an expression");
        String expression = ab.nextLine();
        expression = expression.toUpperCase();



        expression = expression.replace(" ", "");
        expression = expression.replaceAll("&&", "*");
        expression = expression.replaceAll("\\|\\|", "+");
        /*expression = expression.replaceAll("!A", "0");
        expression = expression.replaceAll("!B", "0");
        expression = expression.replaceAll("A", "1");
        expression = expression.replaceAll("B", "1");
        expression = expression.replaceAll("A", "1");
        expression = expression.replaceAll("B", "1");
        */


        System.out.println(expression);


        System.out.println(solver.solve(expression, 0, 0));


    }



}