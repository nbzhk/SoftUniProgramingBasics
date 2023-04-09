package Exercise;

import java.util.Scanner;

public class P07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double priceStudio = 0;
        double priceApartment = 0;

        switch (month) {
            case "May":
            case "October":
                priceStudio = nights * 50;
                priceApartment = nights * 65;
                if (nights > 7 && nights < 14) {
                    priceStudio = priceStudio * 0.95;
                } else if (nights > 14) {
                    priceStudio = priceStudio * 0.7;
                    priceApartment = priceApartment * 0.9;
                }
                break;

            case "June":
            case "September":
                priceStudio = nights * 75.2;
                priceApartment = nights * 68.7;
                if (nights > 14) {
                    priceStudio = priceStudio * 0.8;
                    priceApartment = priceApartment * 0.9;
                }
                break;
            case "July":
            case "August":
                priceStudio = nights * 76;
                priceApartment = nights * 77;
                if (nights > 14) {
                    priceApartment = priceApartment * 0.9;
                }
                break;
        }

        System.out.printf("Apartment: %.2f lv.%n", priceApartment);
        System.out.printf("Studio: %.2f lv.", priceStudio);

    }
}


