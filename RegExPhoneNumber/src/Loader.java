import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {
        System.out.println("Please enter phone number: ");
        Scanner scan = new Scanner(System.in);
        String phone =scan.nextLine();

        System.out.println(phone.replaceAll("[^0-9]", ""));

    }
}
