/*Alexander Russkin
Calculator finally done*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String function = scanner.next();
        String [] str;
        int result = 0;
        String resultRome = "";
        try {
            if (function.contains("+")) {
                str = function.split("[+]");
                result = Calcul.summa (Integer.parseInt(str[0]), Integer.parseInt(str[1]));
            } else if (function.contains("-")) {
                str = function.split("[-]");
                result = Calcul.minus (Integer.parseInt(str[0]), Integer.parseInt(str[1]));
            } else if (function.contains("*")) {
                str = function.split("[*]");
                result = Calcul.multy (Integer.parseInt(str[0]), Integer.parseInt(str[1]));
            } else if (function.contains("/")) {
                str = function.split("[/]");
                result = Calcul.div (Integer.parseInt(str[0]), Integer.parseInt(str[1]));
            }
            System.out.println (result);
        } catch (NumberFormatException e) {
            if (function.contains("+")) {
                str = function.split("[+]");
                resultRome = Rome.sum(str[0], str[1]);
            } else if (function.contains("-")) {
                str = function.split("[-]");
                resultRome = Rome.min(str[0], str[1]);
            } else if (function.contains("*")) {
                str = function.split("[*]");
                resultRome = Rome.mul(str[0], str[1]);
            } else if (function.contains("/")) {
                str = function.split("[/]");
                resultRome = Rome.div(str[0], str[1]);
            }
            System.out.println(resultRome);
        }
    }
}
