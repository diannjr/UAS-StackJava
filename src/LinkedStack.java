
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author DIAN
 */
public class LinkedStack {
    private LinkedList<Animal> stack;

    public LinkedStack(){
        stack = new LinkedList<Animal>();
    }

    public void push (Animal animal){
        stack.push(animal);
    }

    public Animal pop(){
        return stack.pop();
    }

    public Animal peek(){
        return stack.peek();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public int size(){
        return stack.size();
    }

    public void printStack(){
        ListIterator<Animal> iterator = stack.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
