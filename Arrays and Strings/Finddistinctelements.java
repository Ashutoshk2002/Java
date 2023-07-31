import java.util.Arrays;

public class Finddistinctelements {
    public static void main(String[] args) {
        int n=5;
        int arr[]={12, 1, 14, 3, 16};
        Arrays.sort(arr);
        int count=1;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                count++;
            }
            else{
                continue;
            }
        }
        System.out.println(count);

    }
}
