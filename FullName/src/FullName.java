import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FullName {
    public static void main(String[] args) {
        System.out.println("Введите ФИО: ");
        Scanner lineScan = new Scanner(System.in);
        Scanner scan = new Scanner(lineScan.nextLine());
        StringBuilder fullName = new StringBuilder();

        while (scan.hasNext()) {
            String word = scan.next();
            fullName.append(word).append(" ");
            for (int i = 0; i < word.length(); i++){
                char letter = word.charAt(i);
                if (Character.isDigit(letter)){
                    System.out.println("Вы ввели некорректно!");
                    System.exit(1);
                }
            }
        }

        fullName = new StringBuilder(fullName.toString().stripTrailing());
        int firstIndex = fullName.indexOf(" ");
        int lastIndex = fullName.lastIndexOf(" ");

        String firstName = fullName.substring(0,firstIndex);
        String secondName = fullName.substring(firstIndex+1, lastIndex);
        String lastName = fullName.substring(lastIndex+1);

        System.out.println("Фамилия: " + firstName);
        System.out.println("Имя: " + secondName);
        System.out.println("Отчество: " + lastName);



//        int i = 0;
//
//        Matcher m = Pattern.compile("[а-яА-Яе-ё-Ё-Еa-zA-Z]+").matcher(fullName);
//
//        while (m.find()) {
//            String foundSubstring = m.group();
//            i = i + 1;
//            if (i == 1) {
//                System.out.println("Фамилия: " + foundSubstring);
//            }
//            if (i == 2) {
//                System.out.println("Имя: " + foundSubstring);
//            }
//            if (i==3||i==4){
//                System.out.println("Отчество: " + foundSubstring);
//            }
//        }
    }
}
