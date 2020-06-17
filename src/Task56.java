import java.util.Vector;

public class Task56 {
    public static void main(String[] args) {
        System.out.println(ulam(206));
    }

    public static int ulam(int n) {
        Vector<Integer> values = new Vector<Integer>();
        values.add(1);
        values.add(2);
        for (int i = 3; i < 2000; i++) {
            int count = 0;
            for (int j = 0; j < values.size() - 1; j++) {
                for (int k = j + 1; k < values.size(); k++) {
                    if (values.get(j) + values.get(k) == i)
                        count++;

                }
            }
            if (count == 1)
                values.add(i);
            if (values.size() == n)
                return i;
        }
        return -1;
    }
}
