public class JavaCoreSolution1_12_9 {

    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static interface Businessman {
        public void workHard();
    }

    public static class Worker{
        public void workHard(){}
    }

    public static class CTO extends Worker implements Businessman {

    }

}
