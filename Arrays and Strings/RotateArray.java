import java.util.ArrayList;

public class RotateArray {
    public static void main(String[] args) {
        /*
         * Input:
         * N = 5, D = 2
         * arr[] = {1,2,3,4,5}
         * Output: 3 4 5 1 2
         * Explanation: 1 2 3 4 5 when rotated
         * by 2 elements, it becomes 3 4 5 1 2.
         */
        int n=5;
        int arr[]={1,2,3,4,5};
        int d=2;

        int shift[]=new int[n];
        int k=0;
        
        for(int i=d;i<n;i++){
            shift[k++]=arr[i];
        }
       
        int z=d+1;
        for(int i=0;i<d;i++){
            shift[z++]=arr[i];
        }

        for(int i=0;i<n;i++){
            System.out.print(shift[i]+" ");
        }
    }
}
