class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    public MyStack() {
        q1=new LinkedList<>();
        q2=new LinkedList<>();
    }
    
    public void push(int x) {
        if(!q1.isEmpty()){
            q1.add(x);
        }else{
            q2.add(x);
        }
    }
    
    public int pop() {
        if (q1.isEmpty() && q2.isEmpty()) {
            return -1; // Return -1 if stack is empty
        }

        if(!q1.isEmpty()){
            while(q1.size()>1){     
                q2.add(q1.remove());
            }
            return q1.remove();
        }
        else{
          while (q2.size() > 1) {
                q1.add(q2.remove());
            }
            // Pop the last element
            return q2.remove();

        }
    }
    
    public int top() {
      if (q1.isEmpty() && q2.isEmpty()) {
            return -1; // Return -1 if stack is empty
        }
        
        if (!q1.isEmpty()) {
            // Transfer elements from q1 to q2, except the last one
            while (q1.size() > 1) {
                q2.add(q1.remove());
            }
            int topElement = q1.remove();
            q2.add(topElement); // Put the last element back in q2
            return topElement;
        } else {
            // Transfer elements from q2 to q1, except the last one
            while (q2.size() > 1) {
                q1.add(q2.remove());
            }
            int topElement = q2.remove();
            q1.add(topElement); // Put the last element back in q1
            return topElement;
        }
    }
    
    public boolean empty() {
            return q1.isEmpty() && q2.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */