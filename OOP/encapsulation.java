package OOP;

public class Encapsulation
{
    private int rollno;
    private int age;
    private String name;
    // private variables declared 
    // these can only be accessed by 
    // public methods of class

    Encapsulation(int rollno,int age,String name){
        this.rollno=rollno;
        this.age=age;
        this.name=name;
    }

    public int getage(){
        return age;
    }

    
    public int getrollno(){
        return rollno;
    }

    
    public String getname(){
        return name;
    }

    public void setage(int newage){
        age=newage;
    }

    
    public void setrollno(int newrn){
        rollno=newrn;
    }

    
    public void setname(String newname){
        name=newname;
    }


    public static void main(String[] args) {
        Encapsulation e=new Encapsulation(30,22,"Ashutosh");
        System.out.println(e.getage());
        System.out.println(e.getname());
        System.out.println(e.getrollno());
        

        e.setage(20);
        e.setname("Abhishek");
        e.setrollno(33);

        System.out.println(e.getage());
        System.out.println(e.getname());
        System.out.println(e.getrollno());
    }
}