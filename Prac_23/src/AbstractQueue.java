public abstract class AbstractQueue {
    protected int size;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public abstract void enqueue(Object element);

    public abstract Object dequeue();

    public abstract Object element();

    public void clear() {
        size = 0;
    }
}
