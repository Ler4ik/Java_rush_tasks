public class Solution9_11_7 {
    public static int A = 5;
    public static int B = 2 * A;
    public int C = A * B;
    public static int D = A * B;

    public static void main(String[] args) {
        Solution9_11_7 solution = new Solution9_11_7();
        solution.A = 5;

        Solution9_11_7.D = 5;
    }

    public int getA() {
        return A;
    }

}
