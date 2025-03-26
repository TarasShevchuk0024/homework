package gmail.taras.shevchuk0024.lesson14;

import gmail.taras.shevchuk0024.lesson14.animals.DragonType;
import gmail.taras.shevchuk0024.lesson14.animals.Dragon;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Dragon dragon1 = new Dragon();
        dragon1.setName("Johny");
        dragon1.setAge(77);
        dragon1.setWeight(528.4);
        dragon1.setType(DragonType.FIRE);

        System.out.println("Дані першого дракона: ");
        System.out.println(dragon1.getName());
        System.out.println(dragon1.getAge());
        System.out.println(dragon1.getWeight());
        System.out.println(dragon1.getType());
        System.out.println(" ");


        Dragon dragon2 = new Dragon("Lucky", 154, 463.8, DragonType.WATER );
        System.out.println("Дані другого дракона: ");
        System.out.println(dragon2.getName());
        System.out.println(dragon2.getAge());
        System.out.println(dragon2.getWeight());
        System.out.println(dragon2.getType());
        System.out.println(" ");

        Dragon dragon3 = new Dragon();
        dragon3.setName("Gerry");
        dragon3.setAge(77);
        dragon3.setWeight(528.4);
        dragon3.setType(DragonType.FIRE);

        System.out.println("Дані третього дракона: ");
        System.out.println(dragon3.getName());
        System.out.println(dragon3.getAge());
        System.out.println(dragon3.getWeight());
        System.out.println(dragon3.getType());
        System.out.println(" ");

        System.out.println("Порівняння драконів: ");
        System.out.println("dragon1 == dragon2: " + dragon1.equals(dragon2));
        System.out.println("dragon1 == dragon3: " + dragon1.equals(dragon3));
        System.out.println(" ");

        System.out.println("Хеш-коди драконів: ");
        System.out.println("dragon1 hashCode: " + dragon1.hashCode());
        System.out.println("dragon2 hashCode: " + dragon2.hashCode());
        System.out.println("dragon3 hashCode: " + dragon3.hashCode());
        System.out.println(" ");


        System.out.println("Тепер у нас є можливість створювати драконів самостійно: ");
        Dragon[] dragons = new Dragon[3];

        for (int i = 0; i < dragons.length;i++) {
            System.out.println("Введіть імʼя дракона №" + (i + 1) + ":");
            String name = scanner.nextLine();

            System.out.println("Введіть вік дракона: ");
            int age = scanner.nextInt();

            System.out.println("Введіть вагу дракона: ");
            double weight = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Виберіть тип дракона: FIRE, ICE, LIGHTNING, EARTH, WIND, WATER");
            DragonType type;
            while (true) {
                try {
                    String typeInput = scanner.nextLine().toUpperCase();
                    type = DragonType.valueOf(typeInput);
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println("Невірний тип. Будь ласка, введіть один із варіантів: FIRE, ICE, LIGHTNING, EARTH, WIND, WATER");
                }
            }

            dragons[i] = new Dragon (name, age, weight, type);
        }
        System.out.println("Список створених драконів: ");
        for (Dragon dragon : dragons) {
            dragon.displayInfo();
            dragon.speak();
            dragon.breatheFire();
            System.out.println("----------------------");
        }
        scanner.close();

    }
}
