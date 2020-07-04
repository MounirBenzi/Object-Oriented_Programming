public class ArrayRunner  {
    public static void main(String[] args){
        Stack<Integer> stack = new ArrayStack<Integer>();
        stack.push(3);
        stack.empty();
        System.out.println(stack.peek());
        stack.push(9);
        stack.push(2);
        stack.push(1);
        stack.push(4);
        stack.push(6);
        stack.printStack();
        stack.pop();
        stack.empty();


    }

}
