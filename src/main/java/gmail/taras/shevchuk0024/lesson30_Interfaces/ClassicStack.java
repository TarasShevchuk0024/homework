package gmail.taras.shevchuk0024.lesson30_Interfaces;

public class ClassicStack {
    public static void main(String[] args) {
        Stack theStack = new Stack(7);

        try {
            theStack.addElementToStack(44);
            theStack.addElementToStack(51);
            theStack.addElementToStack(28);
            theStack.addElementToStack(86);
            theStack.addElementToStack(145);
            theStack.addElementToStack(3);
            theStack.addElementToStack(876);
            theStack.addElementToStack(654);
        } catch (StackIsFullException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
        System.out.println(" ");

        try {
            System.out.println("Верхній елемент: " + theStack.readTop());
        } catch (StackIsEmptyException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
        System.out.println(" ");

        try {
            System.out.println("Видалено: " + theStack.deleteElementFromStack());
        } catch (StackIsEmptyException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
        System.out.println(" ");

        while (!theStack.isEmpty()) {
            try {
                int value = theStack.deleteElementFromStack();
                System.out.println("Видалено: " + value);
            } catch (StackIsEmptyException e) {
                System.out.println("Помилка: " + e.getMessage());
            }
        }
        try {
            theStack.deleteElementFromStack();
        } catch (StackIsEmptyException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
