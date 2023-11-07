public class Solution9_6_6 {

    public static void main(String[] args) {
        try
        {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        }
        catch(NumberFormatException e){
            System.out.println(e.getClass());
        }
    }

}
