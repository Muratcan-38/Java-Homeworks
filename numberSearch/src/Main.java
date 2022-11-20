public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3,4,5};
        int search = 6;
        boolean exist=false;

        for (int number : numbers){
            if (number==search){
                exist = true;
                break;
            }
        }

        if (exist){
            System.out.println("Number existing");
        }else {
            System.out.println("Number is not existing");
        }


    }
}