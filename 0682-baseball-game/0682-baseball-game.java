class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for(String op: operations){
            if(op.equals("C")){
                stack.pop();
            }
            else if(op.equals("D")){
                stack.push(2 * stack.peek());
            } 
            else if(op.equals("+")){
                int l = stack.pop();
                int m = l + stack.peek();
                stack.push(l);
                stack.push(m);
            }
            else{
                stack.push(Integer.parseInt(op));
            }
        }
        int sum =0;
        for(int e: stack){
            sum = sum +e;
        }
        return sum;
        
    }
}