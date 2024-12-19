import java.util.NoSuchElementException;

public class ArrayQueue {
    // Invariant:
    // 1. The queue is represented as a circular array.
    // 2. 'front' always points to the first element (if size > 0) or the position where the next element will be dequeued.
    // 3. The number of elements in the queue is tracked by 'size'.
    // 4. All elements are stored in 'queue', with unused spaces set to null.

    private Object[] queue;
    private int front;
    private int size;

    public ArrayQueue() {
        // Postcondition:
        // A new empty queue is created with an initial capacity of 10.
        this.queue = new Object[10];
        this.front = 0;
        this.size = 0;
    }

    public void enqueue(Object element) {
        // Precondition:
        // - The 'element' to be added is not null.
        // Postcondition:
        // - The 'element' is added to the end of the queue.
        // - The size of the queue increases by 1.
        // - The array is resized if needed to ensure capacity.

        if (element == null) {
            throw new IllegalArgumentException("Element cannot be null");
        }
        ensureCapacity(size + 1);
        queue[(front + size) % queue.length] = element;
        size++;
    }

    public Object element() {
        // Precondition:
        // - The queue is not empty (size > 0).
        // Postcondition:
        // - Returns the first element of the queue without removing it.
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return queue[front];
    }

    public Object dequeue() {
        // Precondition:
        // - The queue is not empty (size > 0).
        // Postcondition:
        // - Removes and returns the first element of the queue.
        // - The size of the queue decreases by 1.
        // - The 'front' pointer moves to the next position.
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        Object result = queue[front];
        queue[front] = null; // Clear reference for garbage collection
        front = (front + 1) % queue.length;
        size--;
        return result;
    }

    public int size() {
        // Postcondition:
        // - Returns the current number of elements in the queue.
        return size;
    }

    public boolean isEmpty() {
        // Postcondition:
        // - Returns true if the queue contains no elements (size == 0), otherwise false.
        return size == 0;
    }

    public void clear() {
        // Postcondition:
        // - All elements are removed from the queue.
        // - The queue is reset to its initial state with an empty array of size 10.
        queue = new Object[10];
        front = 0;
        size = 0;
    }

    private void ensureCapacity(int capacity) {
        // Precondition:
        // - 'capacity' is the minimum required capacity to fit all elements.
        // Postcondition:
        // - If the current array is too small, a new larger array is created.
        // - Elements are copied to the new array in proper order.
        // - The 'front' pointer is reset to 0.
        if (capacity > queue.length) {
            int newCapacity = Math.max(capacity, queue.length * 2);
            Object[] newQueue = new Object[newCapacity];
            for (int i = 0; i < size; i++) {
                newQueue[i] = queue[(front + i) % queue.length];
            }
            queue = newQueue;
            front = 0;
        }
    }

    @Override
    public String toString() {
        String result = "Queue: [";

        for (int i = 0; i < size; i++) {
            result += queue[(front + i) % queue.length];
            if (i < size - 1) {
                result += ", ";
            }
        }

        result += "]";
        return result;
    }
}
