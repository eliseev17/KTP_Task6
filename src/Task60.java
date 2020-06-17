public class Task60 {
    public static void main(String[] args) {
        System.out.println(palindromeDescendant(123312));
    }

    public static boolean palindromeDescendant(int num) {
        String number = Integer.toString(num);
        StringBuilder input = new StringBuilder();
        input.append(number);

        while (input.length() > 1) {
            if (input.toString().equals(input.reverse().toString()))
                return true;

            if (input.length() % 2 != 0)
                return false;

            String next = sumDigits(input.reverse().toString());

            input.setLength(0);
            input.append(next);
        }

        return false;
    }

    private static String sumDigits(String num) {
        String result = "";
        for (int i = 0; i < num.length() - 1; i += 2) {
            int sum = Character.digit(num.charAt(i), 10) + Character.digit(num.charAt(i + 1), 10);
            result += Integer.toString(sum);
        }
        return result;
    }
}
