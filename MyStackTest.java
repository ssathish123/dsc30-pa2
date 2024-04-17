import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {

    @Test
    public void example_1(){
        MyStack test_stack = new MyStack(10);
        assertEquals(true, test_stack.isEmpty());
        MyStack.push("Hi");
        assertEquals(false, test_stack.isEmpty());
        MyStack.pop();
        assertEquals(true, test_stack.isEmpty());
    }

    @Test
    public void example_2(){
        MyStack test_stack = new MyStack(10);
        MyStack.clear();
        assertEquals(0, test_stack.size());
        MyStack test_stack2 = new MyStack(20);
        MyStack.clear();
        assertEquals(0, test_stack2.size());
        MyStack test_stack3 = new MyStack(30);
        MyStack.clear();
        assertEquals(0, test_stack3.size());
    }

    @Test
    public void example_3(){
        MyStack test_stack = new MyStack(10);
        assertEquals(0, MyStack.size());
        test_stack.push("Hi");
        assertEquals(1, MyStack.size());
        test_stack.push("Hey");
        assertEquals(2, MyStack.size());
    }

    @Test
    public void example_4(){
        MyStack test_stack = new MyStack(10);
        assertEquals(10, test_stack.capacity());
        MyStack test_stack2 = new MyStack(20);
        assertEquals(20, test_stack.size());
        MyStack test_stack3 = new MyStack(30);
        assertEquals(30, test_stack.size());
    }

    @Test
    public void example_5(){
        MyStack test_stack = new MyStack(10);
        test_stack.push("Hi");
        assertEquals("Hi", test_stack.peek());
        test_stack.push("Bye");
        assertEquals("Bye", test_stack.peek());
        test_stack.push("Cry");
        assertEquals("Cry", test_stack.peek());
    }

    @Test
    public void example_6(){
        MyStack test_stack = new MyStack(10);
        test_stack.push("Hi");
        assertEquals("Hi", test_stack.peek());
        assertEquals("Hi", test_stack.size());
        test_stack.push("Cry");
        assertEquals("Cry", test_stack.peek());
    }

    @Test
    public void example_7(){
        MyStack test_stack = new MyStack(10);
        test_stack.push("Hi");
        test_stack.push("Bye");
        test_stack.push("Hey");
        assertEquals("Hi", test_stack.pop());
        assertEquals("Bye", test_stack.pop());
        assertEquals("Hey", test_stack.pop());
    }
}
