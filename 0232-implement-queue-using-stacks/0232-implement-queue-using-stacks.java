class MyQueue {
    Deque<Integer> q = new ArrayDeque<>();

    
    public void push(int x) {
        q.offerLast(x);
        
    }
    
    public int pop() {
        return q.pollFirst();
        
    }
    
    public int peek() {
        return q.peekFirst();
        
    }
    
    public boolean empty() {
        return q.isEmpty();
        
    }
}