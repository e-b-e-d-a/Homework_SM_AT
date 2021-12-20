public class Calculator {

    public static void main(String[] args) {
        summation(5,8);
        subtraction(9,2);
        multiplication(5,4);
        division(9,3);
        isEven(9);
    }

        public static int summation (int a, int b){
            System.out.println(a + b);
            return (a + b);
        }

        public static int subtraction (int a, int b){
            System.out.println(a - b);
            return (a - b);
        }

        public static int multiplication (int a, int b){
            System.out.println(a * b);
            return (a * b);
        }

        public static int division (int a, int b){
            System.out.println(a / b);
            return (a / b);
        }

        public static boolean isEven(int a) {
        if(a%2==0){
            System.out.println("Число четное");
            return true;
        } else {
            System.out.println("Число нечетное");
            return false;
        }
    }
}
