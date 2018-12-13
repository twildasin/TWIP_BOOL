package com.company;
import java.util.*;
import javax.script.*;
import java.io.*;




public class Main {

    public static void main(String[] args) /*throws ScriptException*/{

        Scanner ab = new Scanner(System.in);
        System.out.println("Input an expression");
        String expression = ab.nextLine();
        String finalex = expression;
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

        System.out.println("A\t" + "B\t" + expression + "\n\n");

        /*System.out.println(solver.solve(expression, 0, 0));
        System.out.println(solver.solve(expression, 0, 1));
        System.out.println(solver.solve(expression, 1, 0));
        System.out.println(solver.solve(expression, 1, 1));*/














        try {
            //Whatever the file path is.
            File statText = new File("output.txt");
            FileOutputStream is = new FileOutputStream(statText);
            OutputStreamWriter osw = new OutputStreamWriter(is);
            Writer w = new BufferedWriter(osw);
            w.write("Truth Table for expression: " + finalex + "\n\n"+ "A\tB\tOUTPUT\n0\t0\t  ");

            w.write((solver.solve(expression, 0, 0) == 0) ? "0" : "1");
            w.write("\n0\t1\t  ");

            w.write((solver.solve(expression, 0, 1) == 0) ? "0" : "1");
            w.write("\n1\t0\t  ");

            w.write((solver.solve(expression, 1, 0) == 0) ? "0" : "1");
            w.write("\n1\t1\t  ");

            w.write((solver.solve(expression, 1, 1) == 0) ? "0" : "1");
            w.close();
        } catch (IOException e) {
            System.err.println("Problem writing to the file statsTest.txt");
        }



    }



}