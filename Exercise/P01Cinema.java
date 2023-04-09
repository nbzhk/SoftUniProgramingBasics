package Exercise;

import java.util.Scanner;

public class P01Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        int seats = rows * columns;
        double income = 0.0;

        switch (projection) {
            case "Premiere":
                income = seats * 12.00;
                break;

            case "Normal":
                income = seats * 7.5;
                break;

            case "Discount":
                income = seats * 5.0;
                break;
        }

        System.out.printf("%.2f leva", income);
    }
}
