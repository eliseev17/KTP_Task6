public class Task52 {
    public static void main(String[] args) {
        System.out.println(translateWord("button"));
        System.out.println(translateSentence("Do you think, it is going to rain today?"));
    }

    private static int firstVowel(String word) {
        String vowels = "AaEeIiOoUuYy";
        for (int i = 0; i < word.length(); i++) {
            if (vowels.contains(Character.toString(word.charAt(i)))) {
                return i;
            }
        }
        return -1;
    }

    public static String translateWord(String word) {
        if (word == "") return "";
        int firstVowel = firstVowel(word);
        if (firstVowel == 0) return word + "yay";
        if (firstVowel == -1) return word + "ay";

        return word.substring(firstVowel) + word.substring(0, firstVowel) + "ay";
    }

    public static String translateSentence(String sentence) {
        String[] words = sentence.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            String buffer = "";
            if (!Character.isLetter(words[i].charAt(words[i].length() - 1))) {
                char last = words[i].charAt(words[i].length() - 1);
                words[i] = words[i].substring(0, words[i].length() - 1);
                buffer = Task52.translateWord(words[i]) + Character.toString(last) + " ";
            } else {
                buffer = Task52.translateWord(words[i]) + " ";
            }

            if (buffer != buffer.toLowerCase()) {
                buffer = buffer.substring(0, 1).toUpperCase() + buffer.substring(1).toLowerCase();
            }
            result += buffer;
        }
        return result;
    }
}
