package gmail.taras.shevchuk0024.lesson30_Interfaces;

public class ClassicStack {
    public static void main(String[] args) {
        Stack theStack = new Stack(7);

        theStack.addElementToStack(44);
        theStack.addElementToStack(51);
        theStack.addElementToStack(28);
        theStack.addElementToStack(86);
        theStack.addElementToStack(145);
        theStack.addElementToStack(3);
        theStack.addElementToStack(876);
        theStack.addElementToStack(654);
        System.out.println(" ");

        System.out.println("Верхній елемент: " + theStack.readTop());
        System.out.println(" ");

        theStack.deleteElementFromStack();
        System.out.println("Видалено: " + theStack.deleteElementFromStack());
        System.out.println(" ");

        System.out.println("Верхній елемент: " + theStack.readTop());
        System.out.println(" ");


        while (!theStack.isEmpty()) {
            int value = theStack.deleteElementFromStack();
            System.out.println(value);
            System.out.println(" ");
        }
        theStack.deleteElementFromStack();
        System.out.println(" ");
    }
}
