public class FindPattern {
    public static void main(String[] args) {
        String s="Hello";
        String p="llo";

        if(s.contains(p)){
            for(int i=0;i<s.length()-1;i++){
                if(s.charAt(i)==p.charAt(0)){
                    System.out.println(i);
                    break;
                }
            }
        }
        else{
            System.out.println(-1);
        }

    }
}
