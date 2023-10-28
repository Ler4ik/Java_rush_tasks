public class Solution9_2_6 {

    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String text) {
        System.out.println(Thread.currentThread().getStackTrace()[2].getClassName() + ": " + Thread.currentThread().getStackTrace()[2].getMethodName() + ": " + text);
    }
}
