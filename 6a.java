import java.util.Scanner;

public class Stack<E> {
    E stck[]; 
    int top    final int SIZE = 10; 

    @SuppressWarnings("unchecked")
    Stack() {
        stck = (E[]) new Object[SIZE];
        top = -1; // Initialize top index as -1 indicating empty stack
    }

    void push(E item) {
        if (top == SIZE - 1)
            System.out.println("Stack is full");
        else
            stck[++top] = item; 
    }
    E pop() {
        if (top < 0) {
            System.out.println("Stack underflow");
            return null;
        } else {
            return stck[top--]; 
        }
    }
}
public class TestStack {
    public static void main(String[] args) {
       
        Stack<Integer> mystack1 = new Stack<Integer>();
        Stack<Double> mystack2 = new Stack<Double>();

        Scanner s = new Scanner(System.in);

        System.out.println("Enter elements into the Integer stack");
        for (int i = 0; i < 5; i++) {
            int n = s.nextInt(); 
            mystack1.push(n); 
        }
        System.out.println("Enter elements into the Double stack");
        for (int i = 0; i < 5; i++) {
            double m = s.nextDouble(); 
            mystack2.push(m); 
        }

                System.out.println("Elements of stack 1 (Integer stack):");
        for (int i = 0; i < 5; i++) {
            System.out.println(mystack1.pop()); 
        }

        // Display and pop elements from the Double stack
        System.out.println("Elements of stack 2 (Double stack):");
        for (int i = 0; i < 5; i++) {
            System.out.println(mystack2.pop()); 
        }

        s.close();
    }
}
