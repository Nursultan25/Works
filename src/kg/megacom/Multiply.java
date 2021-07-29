package kg.megacom;

public class Multiply {
    public static String multiTable(int num) {
        String result = "";
        for (int i = 1; i <= 10; i++) {
            result += i + " * " + num + " = " + i * num;
            if (i < 10) result += "\n";
        }
        return result;
    }
}
