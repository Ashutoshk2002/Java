
import java.io.*;

class PrimeFactorization{
    public static void main(String args[]) throws IOException{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            int n = Integer.parseInt(read.readLine());
            
            printPrimeFactorization(n);
            
            System.out.println();
        }
    }
    
    
// } Driver Code Ends
//User function Template for Java

// This function should print the prime factorization
// of the number n
// The new line is given by the driver's code.
public static void printPrimeFactorization(int n){
    
    if(n==1) System.out.println("1");
    else{
        for(int i=2;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
                n=n/i;
                i--;
            }
        }
    }


    
}


//{ Driver Code Starts.

}
// } Driver Code Ends