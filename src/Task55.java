import java.util.Arrays;

public class Task55 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getHashTags("Hey Parents, Surprise, Fruit Juice Is Not Fruit")));
    }

    public static String[] getHashTags(String str) {
        String[] values = {"", "", ""};
        String[] words = str.split(" ");
        for (String word : words) {
            if (!Character.isLetter(word.charAt(word.length() - 1)))
                word = word.substring(0, word.length() - 1);

            if (word.length() > values[0].length()) {
                values[2] = values[1];
                values[1] = values[0];
                values[0] = word;
            } else if (word.length() > values[1].length()) {
                values[2] = values[1];
                values[1] = word;
            } else if (word.length() > values[2].length()) {
                values[2] = word;
            }
        }
        for (int i = 0; i < values.length; i++) {
            values[i] = "#" + values[i];
        }
        return values;
    }
}
