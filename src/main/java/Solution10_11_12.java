import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution10_11_12 {

    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> map = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String number = reader.readLine();
            if (number.isEmpty()) {
                break;
            }
            int id = Integer.parseInt(number);
            String name = reader.readLine();
            map.put(name,id);
        }


        for(Map.Entry<String , Integer> pair : map.entrySet()){
            System.out.println(pair.getValue() + " " + pair.getKey());

        }
    }

}
