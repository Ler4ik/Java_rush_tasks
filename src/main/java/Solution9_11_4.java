import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution9_11_4 {

    public static void main(String[] args) throws Exception {
        String str = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        Date inputStrPattern = new SimpleDateFormat("yyyy-MM-dd").parse(str);
        SimpleDateFormat outputStrPattern = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        System.out.println(outputStrPattern.format(inputStrPattern).toUpperCase());
    }
}
