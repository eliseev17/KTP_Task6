public class Task53 {
    public static void main(String[] args) {
        System.out.println(validColor("rgb(255,255,255,0.2342)"));
    }

    public static boolean validColor(String color) {
        if (!color.contains("rgb"))
            return false;
        String value = color.substring(color.indexOf("(") + 1, color.indexOf(")"));
        String[] numbers = value.split(",");
        if (color.contains("rgba") && numbers.length != 4)
            return false;
        if (color.contains("rgb") && !color.contains("rgba") && numbers.length != 3)
            return false;
        for (int i = 0; i < 3; i++) {
            if (Integer.parseInt(numbers[i]) < 0 || Integer.parseInt(numbers[i]) > 255)
                return false;
        }
        if (numbers.length == 4) {
            if (Double.parseDouble(numbers[3]) < 0 || Double.parseDouble(numbers[3]) > 1)
                return false;
        }
        return true;
    }
}
