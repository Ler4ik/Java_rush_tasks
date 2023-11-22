public class JavaCoreSolution3_2_6 {

    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    class StringObject implements SimpleObject
    {

        public SimpleObject<String> getInstance(){
          return null;
        }
    }

}
