package OOP;

public class Super {
    public class Animal {
        public int x;

        Animal(int x) {
            this.x = x;
        }

        public void fun() {
            System.out.println("Hello Parent Class");
        }
    }

    public class Dog extends Animal {
        public int x, y;

        Dog(int x,int y){
            super(x);
            this.y=y;
        }

       
    }


    public static void main(String[] args) {
        
        // d.fun();
    }
}
