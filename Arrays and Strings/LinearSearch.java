class LinearSearch{

    public static int LinearSearchExecutor(int arr[],int key){
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }else{
                continue;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[]={3,4,6,2,1,7,8,9};
        int key=9;
        System.out.println(LinearSearchExecutor(arr, key));
    }
}