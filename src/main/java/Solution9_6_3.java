public class Solution9_6_3 {
    public static void main(String[] args) {
        try
        {
            int[] m = new int[2];
            m[8] = 5;
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e.getClass());
        }
    }
}
