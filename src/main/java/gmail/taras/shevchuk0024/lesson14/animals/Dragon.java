package gmail.taras.shevchuk0024.lesson14.animals;

import java.util.Objects;

public class Dragon {
    private String name;
    private int age;
    private double weight;
    private DragonType type;


    public Dragon () {
        System.out.println("Створено повноцінного дракона: ");
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getWeight() {
        return weight;
    }

    public DragonType getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setType(DragonType type) {
        this.type = type;
    }

    public Dragon(String name, int age, double weight, DragonType type ){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.type = type;
        System.out.println("Створено повноцінного дракона: " );
    }
    public void displayInfo() {
        System.out.println("Дракон: " + name + ", Вік: " + age + ", Вага: " + weight + ", Тип: " + type);
    }

    public void speak() {
        System.out.println(name + " каже: Я великий та могутній дракон!\uD83D\uDC09");
    }

    public void breatheFire() {
        System.out.println(name + ": випускає полум'я! \uD83D\uDD25\uD83D\uDD25\uD83D\uDD25");
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", type=" + type +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Dragon dragon)) return false;
        return age == dragon.age && Double.compare(weight, dragon.weight) == 0 && type == dragon.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, weight, type);
    }
}


