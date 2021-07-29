package kg.megacom;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        //Multiplication table for number
        System.out.println("Multiplication table for number");
        System.out.println(Multiply.multiTable(5));

        System.out.println("================================");

        //The Wide-Mouthed frog
        System.out.println("The Wide-Mouthed frog");
        System.out.println(mouth_size("alligator"));

        System.out.println("================================");

        //Convert number to reversed array of digits
        System.out.println("Convert number to reversed array of digits");
        System.out.println(toArray(2123939));
    }

    public static String mouth_size (String animal) {
        if (animal.equals("alligator")) {
            return "input value: "+ animal + "\nresult: " + "Small!";
        }

        return "input value: "+ animal + "\nresult: " + "Wide";
    }

    public static String toArray (int num) {
        LinkedList<Character> array = new LinkedList<>();
        for (int i = 0; i < String.valueOf(num).length(); i++) {
            array.addFirst(String.valueOf(num).charAt(i));
        }
        return "input value:" + num + " result:" + String.valueOf(array);
    }
}
