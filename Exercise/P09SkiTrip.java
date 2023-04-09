package Exercise;

import java.util.Scanner;

public class P09SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String accommodation = scanner.nextLine();
        String rating = scanner.nextLine();

        double price = 0.0;


        switch (accommodation) {
            case "room for one person":
                if (days < 10) {
                    price = (days - 1) * 18.00;
                } else if (days <= 15) {
                    price = (days - 1) * 18.00;
                } else {
                    price = (days - 1) * 18.00;
                }
                break;
            case "apartment":
                if (days < 10) {
                    price = ((days - 1) * 25.00) * 0.7;
                } else if (days <= 15) {
                    price = ((days - 1) * 25.00) * 0.65;
                } else {
                    price = ((days - 1) * 25.00) * 0.5;
                }
                break;
            case "president apartment":
                if (days < 10) {
                    price = ((days - 1) * 35.00) * 0.9;
                } else if (days <= 15) {
                    price = ((days - 1) * 35.00) * 0.85;
                } else {
                    price = ((days - 1) * 35.00) * 0.8;
                }
                break;
        }
        if (rating.equals("positive")) {
            price = price * 1.25;
        } else if (rating.equals("negative")) {
            price = price * 0.9;
        }

        System.out.printf("%.2f", price);
    }
}
