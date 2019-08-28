public class Loader {
    public static void main(String[] args) {

        for (int chCode = 0; chCode <= 1105; chCode++) {
            char ch = (char) chCode;
            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= 'А' && ch <= 'я' || ch == 'ё' || ch == 'Ё'){
                System.out.println(ch + " = " + chCode);
            }
        }
    }
}


