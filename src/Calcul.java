public class Calcul {
    public static int summa (int a, int b) {
        Format(a,b);
        return a + b;
    }

    public static int minus (int a, int b) {
        Format(a,b);
        return a - b;
    }

    public static int multy (int a, int b) {
        Format(a,b);
        return a * b;
    }

    public static int div (int a, int b) {
        Format(a,b);
        return a / b;
    }

    public static void Format (int c,int h){
        if(c<=0||c>10||h<=0||h>10){
            throw new NumberFormatException("Введеное значение не соответсвует заданным параметрам");
        }
    }
}
