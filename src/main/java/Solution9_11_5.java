import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution9_11_5 {

    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        String str = (new BufferedReader(new InputStreamReader(System.in))).readLine().replace(" ", "");
        char[] charArray = str.toCharArray();
        StringBuilder charsVowels = new StringBuilder();
        StringBuilder charsConsonants = new StringBuilder();


        for (char c:charArray
             ) {
            if(isVowel(c)){
                charsVowels.append(c);
                charsVowels.append(" ");
            } else{
                charsConsonants.append(c);
                charsConsonants.append(" ");
            }
        }
        System.out.println(charsVowels.toString());
        System.out.println(charsConsonants.toString());


    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }

}
