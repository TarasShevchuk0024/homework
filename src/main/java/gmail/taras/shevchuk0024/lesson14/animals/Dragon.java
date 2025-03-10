package gmail.taras.shevchuk0024.lesson14.animals;

public class Dragon {
    private String name;
    private int age;
    private double weight;

    public Dragon () {
        System.out.println("Створено невідомого дракона");
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

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public Dragon(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        System.out.println("Створено повноцінного дракона" + name);
    }
    public void displayInfo() {
        System.out.println("Дракон: " + name + ", Вік: " + age + ", Вага: " + weight);
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
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}
