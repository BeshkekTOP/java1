import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ФИО студента: ");
        String fullName = scanner.nextLine();

        System.out.println("Введите возраст: ");
        int age = scanner.nextInt();

        System.out.println("Введите рост: ");
        double rost = scanner.nextDouble();

        System.out.println("Является студент учащимя на бюджетной основе (true/false): ");
        boolean budget = scanner.nextBoolean();

        System.out.println("Введите пол: ");
        String gender = scanner.next();

        System.out.println("Информация о студенте:");
        System.out.println("ФИО:" + fullName);
        System.out.println("Возраст: " + age);
        System.out.println("Рост: " + rost);
        System.out.println("Форма обучения: " + budget);
        System.out.println("Пол: " + gender);
    }
}