public class Solution9_6_2 {
    public static void main(String[] args) {
        try
        {
            String s = null;
            String m = s.toLowerCase();
        }
        catch (NullPointerException e)
        {
            System.out.println(e.getClass());
        }
    }

}
