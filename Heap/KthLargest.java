class Solution {
    // Function to return kth largest element from an array.
    public static int KthLargest(int arr[], int k) {
        // Your code here
         PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        for(int i=0;i<k;i++){
            minHeap.add(arr[i]);
        }
        for(int i=k;i<arr.length;i++){
            if(arr[i]>minHeap.peek()){
                minHeap.poll();
                minHeap.add(arr[i]);
            }
        }
        return minHeap.peek();
    }
}