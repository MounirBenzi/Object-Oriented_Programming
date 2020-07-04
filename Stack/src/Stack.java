public interface Stack<V> {
    void push(V x);
    V pop();
    V peek();
    boolean empty();
    void printStack();
}
