class FrontMiddleBackQueue {
    Deque<Integer> q1;
    Deque<Integer> q2;
    public FrontMiddleBackQueue() {
        q1 = new ArrayDeque<>();
        q2 = new ArrayDeque<>();
    }
    
    public void pushFront(int val) {
        q1.addFirst(val);
    }
    
    public void pushMiddle(int val) {
        int mid = q1.size() / 2;
       for(int i=0; i<mid; i++){
            q2.addLast(q1.pollFirst());
        }
        q1.addFirst(val);
        while(!q2.isEmpty()){
            q1.addFirst(q2.pollLast());
        }
    }
    
    public void pushBack(int val) {
        q1.addLast(val);
    }
    
    public int popFront() {
        if(q1.isEmpty()){
            return -1;
        }
       return q1.pollFirst();
    }
    
    public int popMiddle() {
        if(q1.isEmpty()){
            return -1;
        }
        int mid = (q1.size() - 1) / 2;
        for(int i=0; i<mid; i++){
            q2.addLast(q1.pollFirst());
        }
        int ele = q1.pollFirst();
        while(!q2.isEmpty()){
            q1.addFirst(q2.pollLast());
        }
        return ele;
    }
    
    public int popBack() {
        if(q1.isEmpty()){
            return -1;
        }
        return q1.pollLast();
    }
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */