import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        System.out.println("number = " + number);

        System.out.print("Enter name: ");
        String name = scanner.next();

        System.out.println("name = " + name);
    }
}