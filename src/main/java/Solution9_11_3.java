import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution9_11_3 {

    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        ArrayList<Integer> counter = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {
                counter.add(Integer.parseInt(reader.readLine()));
            }
        } catch (Exception e) {
            for (int i = 0; i < counter.size(); i++) {
                System.out.println(counter.get(i));
            }
        }
    }
}
