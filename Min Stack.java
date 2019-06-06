class MinStack {
    int top,size;
    int[] mstack;

    /** initialize your data structure here. */
    public MinStack() {
      top = -1;
      int max = 1000;
      mstack = new int[max];
      size = mstack.length;
    }
    
    public void push(int x) {
        if(top >= size-1) 
            return;
        top = top + 1;
        mstack[top] = x;
    }
    
    public void pop() {
        if(top <= -1) 
            return;
        top = top - 1;    
    }
    
    public int top() {
        return mstack[top];
    }
    
    public int getMin() {
        int min = mstack[top];
        for(int i=top;i>=0;i--){
            if(mstack[i] < min){
                min = mstack[i];
            }
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */