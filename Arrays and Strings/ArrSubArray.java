public class ArrSubArray {
    public static void main(String[] args) {
// -----------------------------------------------------------------
        int arr[] = { 1, -2, 6, -1, 3 };
        // possible subarrays
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k < j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }//Time Complexity:n^3
// ------------------------------------------------------
        // Maximum in SubArray using prefix
        int sum=0;
        int max = Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];

        //calculate prefix array
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                
                sum=i==0?prefix[j]:prefix[j]-prefix[i-1];
                
                if(max<sum){
                        max=sum;
                    }
                    
            }
        }
        System.out.println("Max : " + max);
        //Time Complexity:n^2
// ----------------------------------------------------------------
        // using kadane's algorithm
        // //Time Complexity:n
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<arr.length;i++){
            currsum+=arr[i];
            if(currsum<0){
                currsum=0;
            }
            maxsum=Integer.max(currsum,maxsum);
        }

        System.out.println("Max using Kadane : "+maxsum);
    }
}
