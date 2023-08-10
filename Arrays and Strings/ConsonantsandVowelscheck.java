public class ConsonantsandVowelscheck {
    public static void main(String[] args) {
        String s="a i u e o t m n s w";
        int v=0;
        int c=0;

        char arr[]=new char[s.length()];
        arr=s.toCharArray();
        
        for(int i=0;i<s.length()-1;i++){
            if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'){
                v++;
            }
            else if(arr[i]!=' '){
                c++;
            }
        }
        
        if(v>c)
        System.out.print("Yes");
        else if(c>v)
        System.out.print("No");
        else
       System.out.print("Same");
        
        System.out.println();
    }
}
