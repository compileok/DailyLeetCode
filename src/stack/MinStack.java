package stack;


/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 *
 *  Runtime: 70 ms
 */
public class MinStack {

    int[] data;
    int size;
    /** initialize your data structure here. */
    public MinStack() {
        data = new int[10];
        size = 0;
    }

    public void push(int x) {
        checkAndGrow();
        data[size++] = x;

    }

    public void pop() {
        size--;
    }

    public int top() {
        if(size < 1) {
            throw new RuntimeException(" the stack is empty");
        }
        return data[size-1];
    }

    public int getMin() {
        if(size<1){
            throw new RuntimeException(" the stack is empty");
        }

        int min = data[0];
        for (int i = 1; i < size; i++) {
            min = min > data[i] ? data[i] : min;
        }
        return min;
    }

    /**
     * check capacity ,and just let the capacity + 5
     */
    private void checkAndGrow(){
        if(data.length <= size){
            int newLen = data.length + 5;
            System.out.println(" grow ! new len is : " + newLen);

            int[] copy = new int[newLen];
            System.arraycopy(data,0,copy,0,Math.min(data.length, newLen));
            data = copy;
        }
    }

    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(-2);
        stack.push(0);
        stack.push(-3);
        System.out.println(stack.getMin() == -3);
        stack.pop();
        System.out.println(stack.top() == 0);
        System.out.println( stack.getMin() == -2);
    }

}
