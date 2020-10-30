package EstruturasDeDados;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTests {
    @Test
    public void test() {
        Stack stack = new Stack(5);
        assertTrue(stack.isEmpty());
        stack.push(34);
        assertFalse(stack.isEmpty());
        assertEquals(stack.peek(), 34);
        stack.push(12);
        stack.push(19);
        assertEquals(stack.peek(), 19);
        assertEquals(stack.size(), 3);

        // testando pop

        assertEquals(stack.pop(), 19);
        //testando fullstack

        assertEquals(stack.size(), 2);
        stack.push(88);
        stack.push(81);
        stack.push(99);

        assertTrue(stack.isFull());

        try {
            stack.push(84);
            fail("esta linha não pode ser executada");

        } catch (RuntimeException e) {
        }

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        try{
            stack.pop();
            fail("tentativa de remoção em uma pilha vazia ");
        } catch (Exception e){

        }
    }
}