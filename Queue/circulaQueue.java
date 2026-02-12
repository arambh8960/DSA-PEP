class MyCircularQueue {
    static int arr[];
    int size;
    int rear;
    int front;
    int count;
    public MyCircularQueue(int k) {
        size=k;
        this.rear=-1;
        this.front=0;
        this.count=0;
        arr=new int[k];
        
    }
    
    public boolean enQueue(int value) {
        if(isFull()) return false;
        rear=(rear+1)%size;
        arr[rear]=value;
        count++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false;
        front=(front+1)%size;
        count--;
        return true;

    }
    
    public int Front() {
        if(isEmpty()) return -1;
        return arr[front];
    }
    
    public int Rear() {
        if(isEmpty()) return -1;
        return arr[rear];
    }
    
    public boolean isEmpty() {
        return count==0;        
    }
    
    public boolean isFull() {
        return (count==size);
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */