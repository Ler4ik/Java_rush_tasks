import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution10_11_5 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'a', 'b', 'c', 'd', 'e', 'f', 'g');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String line = reader.readLine();
            list.add(line.toLowerCase());
        }

        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < alphabet.size(); i++
             ) {
            result.add(0);
        }

        for (int i = 0; i < 10; i++) {
            char[] charArray = list.get(i).toCharArray();
            for(int j = 0; j < charArray.length; j++){
                if(alphabet.contains(charArray[j])){
                    int index = alphabet.indexOf(charArray[j]);
                    result.set(index,result.get(index) + 1);
                }
            }
        }

        for(int i = 0; i < alphabet.size(); i++){
            System.out.println(alphabet.get(i) + " " + result.get(i));
        }
    }

}
