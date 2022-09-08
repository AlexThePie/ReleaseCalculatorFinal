public class Rome {
    final static String[] rome = {
            "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
            "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
            "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XVII", "XVIII", "XXIX", "XXX",
            "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
            "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
            "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
            "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
            "LXXI", "LXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVII", "LXXIX", "LXXX",
            "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
            "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
    };

    public static String sum (String a, String b) {
        int c = 0;
        int h = 0;
        for (int i = 0; i < rome.length; i++) {
            if (rome[i].equals(a)) {
                c = i + 1;
            }
            if (rome[i].equals(b)) {
                h = i + 1;
            }
        }
        Calcul.Format (c,h);
        return rome [(c + h)-1];
    }

    public static String min (String a, String b) {
        int c = 0;
        int h = 0;
        for (int i = 0; i < rome.length; i++) {
            if (rome[i].equals(a)) {
                c = i + 1;
            }
            if (rome[i].equals(b)) {
                h = i + 1;
            }
        }
        Calcul.Format (c,h);
        return rome [(c - h)-1];
    }

    public static String mul (String a, String b) {
        int c = 0;
        int h = 0;
        for (int i = 0; i < rome.length; i++) {
            if (rome[i].equals(a)) {
                c = i + 1;
            }
            if (rome[i].equals(b)) {
                h = i + 1;
            }
        }
        Calcul.Format (c,h);
        return rome [(c * h)-1];
    }

    public static String div (String a, String b) {
        int c = 0;
        int h = 0;
        for (int i = 0; i < rome.length; i++) {
            if (rome[i].equals(a)) {
                c = i + 1;
            }
            if (rome[i].equals(b)) {
                h = i + 1;
            }
        }
        Calcul.Format (c,h);
        return rome [(c / h)-1];
    }

}