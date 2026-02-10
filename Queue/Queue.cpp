#include <iostream>
using namespace std;

class MyQueue{
public:
    int *arr;
    int front;
    int rear;
    int size;

    // Constructor
    MyQueue(int size){
        this->size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    // Check empty
    bool isEmpty(){
        return (front == -1 || front > rear);
    }

    // Check full
    bool isFull(){
        return (rear == size - 1);
    }

    // Insert element
    void enqueue(int val){
        if(isFull()){
            cout << "Queue Overflow" << endl;
            return;
        }
        if(front == -1){
            front = 0;
        }
        rear++;
        arr[rear] = val;
    }

    // Remove element
    void dequeue(){
        if(isEmpty()){
            cout << "Queue Underflow" << endl;
            return;
        }
        front++;
    }

    // Front element
    int peek(){
        if(isEmpty()){
            cout << "Queue Empty" << endl;
            return -1;
        }
        return arr[front];
    }
};

int main(){
    MyQueue q(5);

    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);

    cout << "Front element: " << q.peek() << endl;

    q.dequeue();
    cout << "Front after dequeue: " << q.peek() << endl;

    return 0;
}
