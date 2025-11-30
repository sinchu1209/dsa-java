
public class ImplementStackArray {

    int[] arr;
    int top;
    int size;

    public ImplementStackArray(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }

    public int push(int x) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return -1;
        } else {
            top++;
            arr[top] = x;
            return x;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            int poppedElement = arr[top];
            top--;
            return poppedElement;
        }
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return arr[top];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {

        ImplementStackArray s = new ImplementStackArray(5);

        System.out.println(s.push(10));
        System.out.println(s.push(20));
        System.out.println(s.push(30));

        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.pop());

    }
}
