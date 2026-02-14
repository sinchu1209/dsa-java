public class LinearQueueArray {
    int[] arr;
    int front, rear, capacity;

    public LinearQueueArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
    }

    public void enqueue(int n) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear++;
        arr[rear] = n;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front++];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public boolean isFull() {
        return rear == capacity - 1;
    }

    public static void main(String[] args) {
        LinearQueueArray queue = new LinearQueueArray(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.dequeue()); // 10
        System.out.println(queue.peek());    // 20
        System.out.println(queue.isEmpty()); // false
        System.out.println(queue.isFull());  // false
    }
}
/*
Time & Space Complexity (Interview Answer)

Enqueue → O(1)

Dequeue → O(1)

Peek → O(1)

Space → O(n) */