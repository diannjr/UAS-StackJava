/**
 *
 * @author DIAN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
            Animal Anjing = new Animal("Anjing","Hitam", 1);
            Animal Kucing = new Animal("Kucing","Putih", 2);
            Animal Burung = new Animal("Burung","Hijau", 3);
            Animal Kuda = new Animal("Kuda","Cokelat", 4);
            Animal Kelinci = new Animal("Kelinci","Putih", 5);
            
            LinkedStack stack = new LinkedStack();
            System.out.println("DATA ANIMAL");
            
            stack.push(Anjing);
            stack.push(Kucing);
            stack.push(Burung);
            stack.push(Kuda);
            stack.push(Kelinci);

            stack.printStack();

            System.out.println(" ");
            System.out.println("INITIAL DATA ANIMAL");

            System.out.println(stack.peek());

            stack.pop();

            System.out.println(" ");
            System.out.println("DATA ANIMAL SUDAH DI POP");
            stack.printStack();

            System.out.println("STACK SIZE = " + stack.size());

    }
}