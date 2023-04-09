package Exercise;

import java.util.Scanner;

public class P05Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination;
        String accommodation = "";
        double price = 0.0;

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                price = budget * 0.3;
                accommodation = "Camp";
            } else if (season.equals("winter")) {
                price = budget * 0.7;
                accommodation = "Hotel";
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                price = budget * 0.4;
                accommodation = "Camp";
            } else if (season.equals("winter")) {
                price = budget * 0.8;
                accommodation = "Hotel";
            }
        } else {
            destination = "Europe";
            price = budget * 0.9;
            accommodation = "Hotel";
        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", accommodation, price);
    }
}
