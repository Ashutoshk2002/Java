public class BinarySearch {

    public static int BinarySearchExecutor(int arr[],int key){

        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int key=3;
        System.out.println(BinarySearchExecutor(arr, key));
    }
}
