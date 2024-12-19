import java.util.NoSuchElementException;

public class ArrayQueueADT {
    // Invariant:
    // 1. The queue is represented as a circular array.
    // 2. 'front' always points to the first element (if size > 0) or the position where the next element will be dequeued.
    // 3. The number of elements in the queue is tracked by 'size'.
    // 4. All elements are stored in 'queue', with unused spaces set to null.

    private Object[] queue;
    private int front;
    private int size;

    public ArrayQueueADT() {
        // Postcondition:
        // A new empty queue is created with an initial capacity of 10.
        this.queue = new Object[10];
        this.front = 0;
        this.size = 0;
    }

    public static void enqueue(ArrayQueueADT instance, Object element) {
        // Precondition:
        // - The 'element' to be added is not null.
        // Postcondition:
        // - The 'element' is added to the end of the queue.
        // - The size of the queue increases by 1.
        // - The array is resized if needed to ensure capacity.
        if (element == null) {
            throw new IllegalArgumentException("Element cannot be null");
        }
        ensureCapacity(instance, instance.size + 1);
        instance.queue[(instance.front + instance.size) % instance.queue.length] = element;
        instance.size++;
    }

    public static Object element(ArrayQueueADT instance) {
        // Precondition:
        // - The queue is not empty (size > 0).
        // Postcondition:
        // - Returns the first element of the queue without removing it.
        if (isEmpty(instance)) {
            throw new NoSuchElementException("Queue is empty");
        }
        return instance.queue[instance.front];
    }

    public static Object dequeue(ArrayQueueADT instance) {
        // Precondition:
        // - The queue is not empty (size > 0).
        // Postcondition:
        // - Removes and returns the first element of the queue.
        // - The size of the queue decreases by 1.
        // - The 'front' pointer moves to the next position.
        if (isEmpty(instance)) {
            throw new NoSuchElementException("Queue is empty");
        }
        Object result = instance.queue[instance.front];
        instance.queue[instance.front] = null; // Clear reference for garbage collection
        instance.front = (instance.front + 1) % instance.queue.length;
        instance.size--;
        return result;
    }

    public static int size(ArrayQueueADT instance) {
        // Postcondition:
        // - Returns the current number of elements in the queue.
        return instance.size;
    }

    public static boolean isEmpty(ArrayQueueADT instance) {
        // Postcondition:
        // - Returns true if the queue contains no elements (size == 0), otherwise false.
        return instance.size == 0;
    }

    public static void clear(ArrayQueueADT instance) {
        // Postcondition:
        // - All elements are removed from the queue.
        // - The queue is reset to its initial state with an empty array of size 10.
        instance.queue = new Object[10];
        instance.front = 0;
        instance.size = 0;
    }

    private static void ensureCapacity(ArrayQueueADT instance, int capacity) {
        // Precondition:
        // - 'capacity' is the minimum required capacity to fit all elements.
        // Postcondition:
        // - If the current array is too small, a new larger array is created.
        // - Elements are copied to the new array in proper order.
        // - The 'front' pointer is reset to 0.
        if (capacity > instance.queue.length) {
            int newCapacity = Math.max(capacity, instance.queue.length * 2);
            Object[] newQueue = new Object[newCapacity];
            for (int i = 0; i < instance.size; i++) {
                newQueue[i] = instance.queue[(instance.front + i) % instance.queue.length];
            }
            instance.queue = newQueue;
            instance.front = 0;
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
