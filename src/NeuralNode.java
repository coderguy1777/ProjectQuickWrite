public class NeuralNode<T> {

    T value;
    NeuralNode next;
    public NeuralNode(T val) {
        value = val;
    }

    public T get() {
        return value;
    }

    public void set(T v) {
        value = v;
    }

    public NeuralNode getNext() {
        return next;
    }

    public void setNext(NeuralNode n) {
        next = n;
    }
}