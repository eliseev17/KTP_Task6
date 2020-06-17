public class Task57 {
    public static void main(String[] args) {
        System.out.println(longestNonrepeatingSubstring("abcde"));
    }

    public static String longestNonrepeatingSubstring(String str) {
        String result = "";
        String buffer = "";
        for (int i = 0; i < str.length(); i++) {
            if (!buffer.contains(str.substring(i, i + 1))) {
                buffer += str.substring(i, i + 1);
            } else {
                if (buffer.length() > result.length())
                    result = buffer;

                buffer = buffer.substring(buffer.indexOf(str.charAt(i)));
            }
        }
        if (buffer.length() > result.length())
            result = buffer;

        return result;
    }
}
