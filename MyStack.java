import java.util.EmptyStackException;
import utilities.FullStackException;

/*
    Name: Sanjit Sathish
    PID:  A17804789
 */

/**
 * MyStack Implementation
 * @author Sanjit
 * @since 2024
 */
public class MyStack {

    /*
     * Capacity: Size of the stack
     * Size: Top index
     * Stack: All elements in the stack
     * */
    private static int capacity;
    static int size = 0;
    private static String[] stack;

    public MyStack(int capacity) {
        if (capacity < 1){
            throw new IllegalArgumentException();
        }
        this.capacity = capacity;
        stack = new String[capacity];
    }

    /*
     * No Params
     * */
    public MyStack() {
        capacity = 10;
        stack = new String[capacity];
    }

    /*
     * No Params
     * */
    public static boolean isEmpty() {
        if (size == 0){
            return true;
        } else {
            return false;
        }
    }

    /*
     * No Params
     * */
    public static void clear() {
        stack = new String[capacity];
        size = 0;
    }

    /*
     * No Params
     * */
    public static int size() {
        // TODO: complete implementation
        return size;
    }

    /*
     * No Params
     * */
    public static int capacity() {
        return capacity;
    }

    /*
     * No Params
     * */
    public String peek() {
        if (size == 0){
            throw new EmptyStackException();
        }
        return stack[size-1];
    }

    /*
     * No Params
     * */
    public static void push(String element) {
        if (size == capacity){
            throw new FullStackException("Your stack is full");
        }
        if (element == null){
            throw new IllegalArgumentException();
        }

        stack[size] = element;
        size += 1;
    }

    /*
     * No Params
     * */
    public static String pop() {
        if (this.isEmpty()){
            throw new EmptyStackException();
        }

        String popped = stack[size-1];
        stack[size-1] = null;
        size -= 1;

        return popped;
    }

    /*
     * Elements: Elements you want to push off
     * */
    public void multiPush(String[] elements) {
        if (elements == null){
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < elements.length; i++){
            this.push(elements[i]);
        }
    }

    /*
     * Amount: Number of elements you want to pop off
     * */
    public String[] multiPop(int amount) {
        if (amount <= 0){
            throw new IllegalArgumentException();
        }

        String[] popped = new String[amount];

        for (int i = 0; i < amount; i++){
            popped[i] = this.pop();
        }
        return popped;
    }


}
