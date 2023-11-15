import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution10_11_11 {

    HashMap<Integer, String> map;
    static Integer index;
    static String name;

    public Solution10_11_11() {
        this.map = new HashMap<Integer, String>();
        map.put(index, name);
    }

    public static void main(String[] args) throws IOException {
        Solution10_11_11 solution = new Solution10_11_11();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            int index = Integer.parseInt(reader.readLine());
            String name = reader.readLine();
            solution.map.put(index, name);
        }

        solution.map.remove(null);

        for (Map.Entry<Integer, String> pair : solution.map.entrySet()) {
            index = pair.getKey();
            name = pair.getValue();
            System.out.println("Id=" + index + " Name=" + name);
        }
    }

}
