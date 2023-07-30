public class ReverseAnArray{

    static int[] ReverseAnArrayExecutor(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;end--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        arr=ReverseAnArrayExecutor(arr);
        for(int x:arr){
            System.out.print(x);
        }
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[(arr.length-1)-i]);
        // }
    }
}