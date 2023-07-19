public class MethodOverriding {
    class Employee
{
    int bonus()
    {
       return 500;
    }

}

class Programmer extends Employee
{
    
    int bonus()
    {
       return 1000;
    }
    
}

class Manager extends Employee
{
    
    int bonus()
    {
       return 2000;
    }
    
}
class Test 
{
    public static void main(String [] args)
    {
         Programmer p = new Programmer();
         Manager m = new Manager();
         System.out.println("Programmer's Bonus : "+ p.bonus());
         System.out.println("Manager's Bonus : "+ m.bonus());
    }
}
}
