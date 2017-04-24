import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Shop shop = new Shop();
        while (true) {
            System.out.println("SHOP..!");
            shop.displayItems();

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Option: ");
            String input = scanner.nextLine();

            Boolean flag = shop.shopping(input);
            if (flag) {
                break;
            }
        }
    }
}
