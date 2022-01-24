import java.util.EmptyStackException;

/**
 *
 * @author DIAN
 */
public class ArrayStack {
        private Animal[] stack;
    private int top;

    public ArrayStack (int capacity){
        stack = new Animal[capacity];
    }
    public void push (Animal animal){
        if(top == stack.length){
            Animal[] newArray = new Animal[2 * stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }
        stack[top++] = animal;
    }
    public Animal pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        Animal employee = stack[--top];
        stack[top] = null;
        return employee;
    }
    public Animal peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack[top-1];
    }
    public boolean isEmpty(){
        return top == 0;
    }
    public int size(){
        return top;
    }
    public void printStack(){
        for(int i = top-1; i>= 0; i--){
            System.out.println(stack[i]);
        }
    }
}