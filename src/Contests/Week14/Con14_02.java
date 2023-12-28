package Contests.Week14;

// your code here


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Con14_02 {

    public static Boolean isBalanced(String string){

        int num = string.length() / 2;
        string = string.replace("{", "}");
        string = string.replace("(",")");
        string = string.replace("[","]");

        String firstStrings = string.substring(0,num);
        Stack<String> secondStrings = new Stack<String>();


        System.out.println(firstStrings);

        for (int i = num ; i < string.length() ; i++){
            secondStrings.add(string.substring(i,i+1));
            System.out.println(secondStrings);
        }

        String secondStrings2 = "";
        for (int i = num ; i < string.length() ; i++){
            secondStrings2 += secondStrings.pop();
        }

        if (firstStrings.equals(secondStrings2)){
            return true;
        } else {
            return false;
        }



    }


        public static void main(String[] args) {
            String testString = "{[()]}";
            System.out.println("\"" + testString + "\": " + isBalanced(testString));
            testString = "((())";
            System.out.println("\"" + testString + "\": " + isBalanced(testString));
            testString = "{{[[()]]}}";
            System.out.println("\"" + testString + "\": " + isBalanced(testString));
            testString = "";
            System.out.println("\"" + testString + "\": " + isBalanced(testString));
            testString = "([{)]}";
            System.out.println("\"" + testString + "\": " + isBalanced(testString));
            testString = "({[{}]})";
            System.out.println("\"" + testString + "\": " + isBalanced(testString));

        }
    }

