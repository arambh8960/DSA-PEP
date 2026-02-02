class Solution {

    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0,nums.length-1);
        return nums;
    }
    void mergeSort(int nums[] ,int s,int e){
        if(s>=e){
            return;
            
        }
        int mid=s+(e-s)/2;
            mergeSort(nums,s,mid);
            mergeSort(nums,mid+1,e);
            merge(nums,s,e,mid);
    }
    void merge(int arr[],int s,int e,int mid){
        int length1=mid-s+1;//left length
        int length2=e-mid;//rigth length;
        int[] arr1=new int[length1];
        int[] arr2=new int[length2];
        int k=s;
        for(int i=0;i<length1;i++){
            arr1[i]=arr[k++];
        }
         k=mid+1;
        for(int i=0;i<length2;i++){
            arr2[i]=arr[k++];

        }
        int i=0;
        int j=0;
        k=s;
        while(i<length1&&j<length2){
            if(arr1[i]< arr2[j]){
                arr[k]=arr1[i];
                i++;
                k++;
            }else{
                arr[k]=arr2[j];
                j++;
                k++;
            }
        }
        while(i<length1){
            arr[k++]=arr1[i++];
        }
        while(j<length2){
            arr[k++]=arr2[j++];
        }


    }
}