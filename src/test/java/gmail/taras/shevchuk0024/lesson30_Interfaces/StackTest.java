package gmail.taras.shevchuk0024.lesson30_Interfaces;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    @Test
    void shouldAddElementToStack() throws StackIsFullException, StackIsEmptyException {
        // given
        Stack stack = new Stack(3);
        // when
        stack.addElementToStack(100);
        // then
        assertEquals(100, stack.readTop());
    }
    @Test
    void shouldThrowExceptionWhenStackIsFull() throws StackIsFullException {
        // given
        Stack stack = new Stack(2);
        stack.addElementToStack(20);
        stack.addElementToStack(40);
        // when + then
        assertThrows(StackIsFullException.class, () -> stack.addElementToStack(60));
    }
    @Test
    void shouldDeleteElementFromStack() throws StackIsFullException, StackIsEmptyException {
        // given
        Stack stack = new Stack(3);
        stack.addElementToStack(10);
        stack.addElementToStack(20);
        stack.addElementToStack(30);
        // when
        int delete = stack.deleteElementFromStack();
        // then
        assertEquals(30,delete);
    }
    @Test
    void shouldThrowExceptionWhenStackIsEmptyOnDelete() {
        // given
        Stack stack = new Stack(2);
        // when + then
        assertThrows(StackIsEmptyException.class, () -> stack.deleteElementFromStack());
    }
    @Test
    void shouldThrowExceptionWhenStackIsEmptyOnReadTop() {
        // given
        Stack stack = new Stack(1);
        // when + then
        assertThrows(StackIsEmptyException.class, () -> stack.readTop());
    }
    @Test
    void shouldReturnElementWrappedInOptionalWhenStackIsNotEmpty() throws StackIsFullException {
        // given
        Stack stack = new Stack(3);
        stack.addElementToStack(15);
        // when
        Optional<Integer> result = stack.optionalDeleteElementFromStack();
        // then
        assertTrue(result.isPresent());
        assertEquals(15,result.get());
    }
    @Test
    void shouldReturnEmptyOptionalWhenStackIsEmpty() {
        // given
        Stack stack = new Stack(3);
        // when
        Optional<Integer>result = stack.optionalDeleteElementFromStack();
        // then
        assertTrue(result.isEmpty());
    }

}