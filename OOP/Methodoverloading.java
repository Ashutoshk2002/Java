public class Methodoverloading {
    class Addition {
        static int sum(int a, int b) {
            return (a + b);
        }

        static double sum(double a, double b) {
            return (a + b);
        }

    }

    class Test {

        public static void main(String[] args) {
            // Don't need to create objects
            // We have defined sum Method as static
            System.out.println(Addition.sum(5, 5));
            // Ambiguity which method to invoke !!
        }

    }
}
