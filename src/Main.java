import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Программа для генерации пароля. Введите длину пароля");
        Scanner scanner = new Scanner(System.in);
        String password = PasswordGenerator.create(scanner.nextInt());
        System.out.println(password);
    }
}