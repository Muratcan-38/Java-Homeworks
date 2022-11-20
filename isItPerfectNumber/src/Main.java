public class Main {
    public static void main(String[] args) {
        // 6 can divide 1,2,3 and 1+2+3=6

        int number=-1;
        int total = 0;

        for (int i=1; i<number; i++){
            if (number % i == 0){
                total = total + i;
            }
        }

        if (number < 1){
            System.out.println("Invalid Number");
            return;
        }

        if (total == number){
            System.out.println("Perfect Number");
        }else {
            System.out.println("Not Perfect Number");
        }




    }
}