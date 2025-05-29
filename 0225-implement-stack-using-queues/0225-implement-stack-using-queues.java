class MyStack {
  int  arr[];
    int n;

    public MyStack() {
         arr = new int[100];
    }
    
    public void push(int x) {
         arr[n++] = x;
    }
    
    public int pop() {
          int item = arr[--n];
        return item;
    }
    
    public int top() {
          return arr[n - 1];
    }
    
    public boolean empty() {
         return n == 0;
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