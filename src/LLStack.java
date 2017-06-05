/**
 * 链式存储结构的栈
 *
 * Created by tianz on 2017/6/4 0004.
 */
public class LLStack<T> {
    /**
     * 内部类，实现节点
     */
    private class LLNode<T> {
        LLNode<T> next = null;
        T data;

        private LLNode(T data) {
            this.data = data;
        }
    }

    private LLNode<T> top;

    public LLStack() {
        this.top = new LLNode(null);
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(T data) {
        LLNode<T> newNode = new LLNode<>(data);
        newNode.next = top;
        top = newNode;
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }
        T data = top.data;
        top = top.next;
        return data;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return top.data;
    }
}
