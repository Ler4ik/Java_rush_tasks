public class JavaCoreSolution3_11_5 {

    public static void main(String[] args) throws Exception {
        System.out.println(Matrix.NEO);
    }

    static class Matrix {
        public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
    }

    interface DBObject {
        DBObject initializeIdAndName(long id, String name);
    }

    static class User implements DBObject  {
        long id;
        String name;

        public User initializeIdAndName(long id, String name){
            this.name = name;
            this.id = id;
            return this;
        }


        @Override
        public String toString() {
            return String.format("The user's name is %s, id = %d", name, id);
        }
    }

}
