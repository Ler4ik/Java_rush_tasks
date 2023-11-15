public class Solution10_11_6 {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name, lastName, adress;
        private Integer homeNumber;
        private Boolean isWomen;
        private Boolean isFamily;

        public Human(){
            this.name = "Incognito";
        }

        public Human(String name){
            this.name = name;
        }

        public Human(String name, String lastName){
            this.name = name;
            this.lastName = lastName;
        }

        public Human(String name, String lastName, String adress){
            this.name = name;
            this.lastName = lastName;
            this.adress = adress;
        }

        public Human(String name, String adress,boolean isWomen){
            this.name = name;
            this.lastName = adress;
            this.isWomen = true;
        }

        public Human(String name, String lastName,String adress, boolean isWomen){
            this.name = name;
            this.lastName = lastName;
            this.lastName = adress;
            this.isWomen = true;
        }

        public  Human(boolean isWomen){
            this.name = "incognito";
            this.isWomen = isWomen;
        }

        public  Human(String name, boolean isFamily){
            this.name = name;
            this.isFamily = isFamily;
        }

        public  Human(boolean isWomen, boolean isFamily){
            this.isWomen = isWomen;
            this.isFamily = isFamily;
        }

        public  Human(String name, String lastName, String adress, Integer homeNumber ,boolean isWomen, boolean isFamily){
            this.isWomen = isWomen;
            this.isFamily = isFamily;
        }

    }
}
