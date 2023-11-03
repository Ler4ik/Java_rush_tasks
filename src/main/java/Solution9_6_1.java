public class Solution9_6_1 {

    /*
Исключение при работе с числами Ӏ Java Syntax: 9 уровень, 6 лекция
*/

        public static void main(String[] args) {
                try {
                        int a = 42 / 0;
                }
                catch(ArithmeticException e){
                        System.out.println(e.getClass());
                }
        }

}
