public class Task58 {
    public static void main(String[] args) {
        System.out.println(convertToRoman(16));
    }

    public static String convertToRoman(int num) {
        StringBuilder res = new StringBuilder();
        while (num >= 1000) {
            res.append("M");
            num -= 1000;
        }
        while (num >= 900) {
            res.append("CM");
            num -= 900;
        }
        while (num >= 500) {
            res.append("D");
            num -= 500;
        }
        while (num >= 400) {
            res.append("CD");
            num -= 400;
        }
        while (num >= 100) {
            res.append("C");
            num -= 100;
        }
        while (num >= 90) {
            res.append("XC");
            num -= 90;
        }
        while (num >= 50) {
            res.append("L");
            num -= 50;
        }
        while (num >= 40) {
            res.append("XL");
            num -= 40;
        }
        while (num >= 10) {
            res.append("X");
            num -= 10;
        }
        while (num >= 9) {
            res.append("IX");
            num -= 9;
        }
        while (num >= 5) {
            res.append("V");
            num -= 5;
        }
        while (num >= 4) {
            res.append("IV");
            num -= 4;
        }
        while (num >= 1) {
            res.append("I");
            num -= 1;
        }
        return res.toString();
    }
}
