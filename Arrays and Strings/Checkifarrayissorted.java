import java.util.Arrays;

public class Checkifarrayissorted {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4};
        

        int arr2[]=new int[arr1.length];
        arr2=arr1.clone();
        Arrays.sort(arr2);
        int sort=0;
        for(int i=0;i<arr1.length;i++){
            if(arr2[i]==arr1[i]){
            sort++;
        }
        }

        if(sort==arr1.length){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not sorted");
        }


    }
}
