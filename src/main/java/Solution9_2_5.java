public class Solution9_2_5 {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
    }
    public static int getStackTraceDepth() {
        int deep = Thread.currentThread().getStackTrace().length;
        System.out.println(deep);
        return deep;
    }
}
