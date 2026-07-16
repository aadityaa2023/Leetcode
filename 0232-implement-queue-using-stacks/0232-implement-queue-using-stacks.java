class MyQueue {
    Queue<Integer> q = new ArrayDeque<>();

    
    public void push(int x) {
        q.offer(x);
        
    }
    
    public int pop() {
        return q.poll();
        
    }
    
    public int peek() {
        return q.peek();
        
    }
    
    public boolean empty() {
        return q.isEmpty();
        
    }
}