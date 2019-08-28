import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader {
    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
//        String textExample = "11sdfsfd sdfs2df 11 22 dd 33 0";
        System.out.println(text);

        int sum = 0;

        Matcher m = Pattern.compile("[0-9]+").matcher(text);
        while (m.find()) {
            String foundSubstring = m.group();
            System.out.println(foundSubstring);
            int ch = Integer.parseInt(foundSubstring);
            sum = sum + ch;
        }

        System.out.println("Сумма заработка: " + sum);


//        int v1 = text.indexOf("Вася заработал");
//        int v2 = text.indexOf("руб");
//
//        String str1 = text.substring(v1+14, v2).trim();
//        System.out.println("Вася: " + str1);
//
//        int m3 = text.indexOf("Маша - ");
//        int m4 = text.lastIndexOf("руб");
//
//        String str2 = text.substring(m3+6, m4).trim();
//        System.out.println("Маша: " + str2);
//
//        int sum=Integer.parseInt(str1)+Integer.parseInt(str2);
//        System.out.println("Сумма заработка Васи и Маши = " + sum);
    }
}