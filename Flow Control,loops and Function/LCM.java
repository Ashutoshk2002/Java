//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class LCM {
    
    
// } Driver Code Ends
//User function Template for Java

public static int LCM(int a, int b){

    int ans=0;
        int x=Math.max(a,b);
        for(int i=1;i<=x;i++){
            if(x%a==0 && x%b==0){
                ans=x;
                break;
            }
            x++;
        }
        return ans;
    
    
}

//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int a = scn.nextInt();
            int b = scn.nextInt();
            System.out.println(LCM(a, b));
        }
        scn.close();
    }
}
// } Driver Code Ends