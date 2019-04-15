class Queue {
    private final int MAX = 50;
    private int size;
    private int capacity = 0;
    private Object[] queueArr;
    private int front;
    private int back;

    Queue() {
        this.size = MAX;
        this.queueArr = new Object[MAX];
    }

    Queue(int size) {
        this.size = size;
        this.queueArr = new Object[size];
    }

    void enqueue(Object object) {
        back = (back + 1) % queueArr.length;
        queueArr[back] = object;
        capacity++;
        front = ((capacity - capacity) + 1) % queueArr.length;
    }

    int currentCapacity() {
        return capacity;
    }

    int size() {
        return size;
    }

    void dequeue() {
        if (capacity < 1) {
            throw new IllegalStateException();
        }
        else {
            front = (front + 1) % queueArr.length;
            capacity--;
        }
    }

    Object peek() {
        if (capacity < 1) {
            return null;
        }
        else {
            return queueArr[front];
        }
    }

    void clear() {
        capacity = 0;
        front = 0;
        back = queueArr.length - 1;
    }
}
