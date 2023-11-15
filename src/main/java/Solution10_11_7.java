public class Solution10_11_7 {
    public int A = 5;
    public static int B = 5;
    public static int C = 5;
    public static int D = 5;

    public static void main(String[] args) {
        Solution10_11_7 solution = new Solution10_11_7();
        solution.A = 5;
        solution.B = 5 * B;
        solution.C = 5 * C * D;
        Solution10_11_7.D = 5 * D * C;

        Solution10_11_7.D = 5;
    }

    public int getA() {
        return A;
    }
}
