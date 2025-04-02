package gmail.taras.shevchuk0024.lesson30_Interfaces;

class Stack implements Stackable {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int max) {
        this.maxSize = max;
        stackArray = new int[maxSize];
        top = -1;
    }

    @Override
    public boolean isEmpty() {
        return (top == -1);
    }

    @Override
    public boolean isFull() {
        return (top == maxSize -1);
    }

    @Override
    public void addElementToStack(int element) {
        if (isFull()) {
            System.out.println("Помилка: Неможливо додати елемент, так як, Стек вже заповнений!");
            return;
        }
        stackArray[++top] = element;
    }

    @Override
    public int deleteElementFromStack() {
        if (isEmpty()) {
            System.out.println("Помилка: Немає елементів для видалення, так як, Стек порожній!");
            return -1;
        }
        return stackArray[top--];
    }

    @Override
    public int readTop() {
        if(isEmpty()) {
            System.out.println("Помилка: Неможливо переглянути верхній елемент, так як Стек порожній!");
            return -1;
        }
        return stackArray [top];
    }
}
