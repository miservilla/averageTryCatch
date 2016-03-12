import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String stringNumber;
        double avg;
        double count = 0;
        double number = 0, sumNumber = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter numbers to average, enter '*' to run:");
        stringNumber = in.next();
        TryParseIn(stringNumber);


        while (!stringNumber.equals("*") && true)
        {
                number = Double.parseDouble(stringNumber);
                sumNumber = sumNumber + number;
                count++;
                stringNumber = in.next();
        }

        avg = sumNumber/count;

        System.out.println("The average is " + avg);
    }


        private static boolean TryParseIn(String number){
        try {
            Double.parseDouble(number);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("You did not enter a number.");
            return false;
        }

    }

}
