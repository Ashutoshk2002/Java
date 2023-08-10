import java.util.Arrays;
public class JavaAnagram{
    public static void main(String[] args) {
        String s1="cgudllrbrjlgvxuheeuwpewiylhnthzprofdxysmsgwkcztglzedalvcgostfavcmxpcvyhzpqhffojqqytooathdjfxyezuhbpu";
        String s2="dniciuehstodlqxhhcydvccfpbbpczqdiczfwhsgdbvrgewfyajbahsicalrxhavovgxdwkinrcmwpmpxurkuxtrfdpencvkvxvs";

        
        char str1[]=s1.toLowerCase().toCharArray();
        char str2[]=s2.toLowerCase().toCharArray();
        
        Arrays.sort(str1);
        Arrays.sort(str2);
        boolean result=Arrays.equals(str1,str2);
        System.out.println(result);

        int diff=str2.length-str1.length;
        System.out.println(diff);
        
}
}