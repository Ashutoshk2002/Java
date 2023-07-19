public class Static {

    static int count=0;

    Static(){
        count++;
    }

    public int getcount(){
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count);
        Static s=new Static();
        s.getcount();
        System.out.println(count);

    }
}
