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
    public void addElementToStack(int element) throws StackIsFullException {
        if (isFull()) {
            throw new StackIsFullException("Помилка: Неможливо додати елемент, так як, Стек вже заповнений!");
        }
        stackArray[++top] = element;
    }

    @Override
    public int deleteElementFromStack() throws StackIsEmptyException {
        if (isEmpty()) {
            throw new StackIsEmptyException("Помилка: Немає елементів для видалення, так як, Стек порожній!");
        }
        return stackArray[top--];
    }

    @Override
    public int readTop() throws StackIsEmptyException {
        if(isEmpty()) {
            throw new StackIsEmptyException("Помилка: Неможливо переглянути верхній елемент, так як Стек порожній!");
        }
        return stackArray [top];
    }
}
