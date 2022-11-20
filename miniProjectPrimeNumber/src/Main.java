public class Main {
    public static void main(String[] args) {

        int number = 4;
        boolean isPrime = true;

        for (int i=2; i<number; i++) {
            if (number % i == 0){
                isPrime = false;
            }
        }

        if (number==1){
            System.out.println("Number is not Prime Number");
            return;
        }

        if (number<1){
            System.out.println("Invalid number");
        }

        if (isPrime){
            System.out.println("Number is Prime Number");
        }
        else {
            System.out.println("Number is not Prime Number");
        }
    }
}