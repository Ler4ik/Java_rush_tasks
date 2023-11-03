import java.util.ArrayList;

public class Solution9_6_4 {
    public static void main(String[] args) {
        try
        {
            ArrayList<String> list = new ArrayList<String>();
            String s = list.get(18);
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println(e.getClass());
        }
    }

}
