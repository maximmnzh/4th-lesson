public class Main
{
    public static void main(String[] args)
    {
        Container container = new Container();
        container.count += 7843;
        System.out.println(sumDigits(container.count));
    }

    static Integer sumDigits(Integer number) {
        String s = number.toString();
        int sum = 0;

        for(int i = 0; i < s.length() ; i++){
            if( Character.isDigit(s.charAt(i)) ){
                sum += Character.getNumericValue(s.charAt(i));
            }
        }

        return sum;

//        Without using toString and charAt methods.
//        int sum = 0;
//        int rest = 1;
//        while(rest!=0){
//            rest = number % 10;
//            number = number / 10;
//            sum = sum + rest;
//        }
//        return sum;
    }
}