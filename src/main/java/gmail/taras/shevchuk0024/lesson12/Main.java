package gmail.taras.shevchuk0024.lesson12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть розмір масиву: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Введіть " + n + " цілих чисел:");
        for(int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Введені числа:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();


            while (true) {
                System.out.println("Меню: ");
                System.out.println("1 - Порахувати суму елементів");
                System.out.println("2 - Знайти середнє арифметичне всіх елементів");
                System.out.println("3 - Знайти найбільший елемент");
                System.out.println("4 - Завершити програму");
                System.out.println("Ваш вибір: ");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        int sum = 0;
                        for (int num : numbers) {
                            sum += num;
                        }
                        System.out.println("Сума елементів: " + sum);
                        break;
                    case 2:
                        double a = 0;
                        for (int num : numbers) {
                            a += num;
                        }
                        a /= n;
                        System.out.println("Середнє арифметичне: " + a);
                        break;
                    case 3:
                        int max = numbers[0];
                        for (int num : numbers) {
                            if (num > max) {
                                max = num;
                            }
                        }
                        System.out.println("Найбільший елемент: " + max);
                        break;
                    case 4:
                        System.out.println("Програма завершена. ");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Помилка :( ");
                        System.out.println("Введіть число від 1 до 4 щоб виконати команду.");
                        System.out.println("Спробуйте ще раз:) ");

                }
            }
        }
    }

