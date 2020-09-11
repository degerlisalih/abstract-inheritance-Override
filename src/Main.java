import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter unit price:");
        double unitPrice = scanner.nextDouble();
        System.out.println("Enter weight:");
        double weigh = scanner.nextDouble();
        WeighedItem weighedItem = new WeighedItem(name, unitPrice, weigh);

        scanner.nextLine();
        System.out.println("Enter name:");
        String name1 = scanner.nextLine();
        System.out.println("Enter unit price:");
        double unitPrice1 = scanner.nextDouble();
        System.out.println("Enter quantity:");
        int quantity = scanner.nextInt();
        CountedItem countedItem = new CountedItem(name1, unitPrice1, quantity);
        System.out.println(weighedItem);
        System.out.println();
        System.out.println(countedItem);
        scanner.close();
    }
}


