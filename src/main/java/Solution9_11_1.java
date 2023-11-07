public class Solution9_11_1 {

    public static void main(String[] args) {
        try{
            divideByZero();
        }
        catch (ArithmeticException e)
        {
            e.printStackTrace();
        }

    }

    public static void divideByZero(){
        System.out.println(11/0);
    }
}
