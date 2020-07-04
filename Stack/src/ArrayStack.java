import java.util.ArrayList;

public class ArrayStack<V> implements Stack<V>{
    Object[] stack;
    final int N;
    int size ;

    ArrayStack(){
        N = 100;
        stack = new Object[N];
        size = 0;
    }

    @Override
    public void push(V x) {
        assert(size<100);
        stack[size] = x;
        size += 1;
    }

    @Override
    public V pop() {
        assert(size>0);
        @SuppressWarnings("unchecked")
        V popped = (V) stack[size-1];
        size-=1;
        return popped;
    }

    @Override
    public V peek() {
        assert(size>0);
        @SuppressWarnings("unchecked")
        V result = (V) stack[size-1];
        return result;
    }

    @Override
    public void printStack() {
        for(int i =0; i <= size-1; i++){
            @SuppressWarnings("unchecked")
            V result = (V)stack[i];

            System.out.print(result+ ", ");
        }

    }
    @Override
    public boolean empty() {
        return (size == 0);
    }
}
