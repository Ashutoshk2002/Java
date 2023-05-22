//{ Driver Code Starts
//Initial Template for Java

import java.io.*;

class FirstDigitofNo{
    public static void main(String arg[]) throws IOException{
        BufferedReader read = new BufferedReader( new InputStreamReader(System.in));
        
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(read.readLine());
            
            int answer = firstDigit(n);
            System.out.println(answer);
        }
    }
    
    
// } Driver Code Ends
//User function Template for Java


// Complete the function
public static int firstDigit(int n){
    
    while(n>0){
        if(n/10==0){
            return n;
        }
        n=n/10;
    }
    return 0;
    
}

//{ Driver Code Starts.
}
// } Driver Code Ends