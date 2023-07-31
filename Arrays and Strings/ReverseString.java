public class ReverseString {
    public static void main(String[] args) {
        String s ="Hello";
        char a[]=s.toCharArray();
        for(int i=0;i*i<a.length;i++){
            char temp=a[i];
            a[i]=a[(a.length-i)-1];
            a[(a.length-i)-1]=temp;
        }
        for(char x:a){
            System.out.println(x);
        }
        String p=String.copyValueOf(a);
        System.out.println(p);
    }



}
