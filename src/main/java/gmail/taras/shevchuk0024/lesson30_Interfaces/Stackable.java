package gmail.taras.shevchuk0024.lesson30_Interfaces;

public interface Stackable {
    boolean isEmpty();
    boolean isFull();
    void addElementToStack( int element);
    int deleteElementFromStack();
    int readTop();
}
