public class Main {
    public static void main(String[] args) {
        sayiBulmaca();

    }

    public static void sayiBulmaca(){
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
            sendMessage("Number is existing: " + search);
        }else {
            sendMessage("Number is not existing: " + search);
        }
    }

    public static void sendMessage(String message){
        System.out.println(message);
    }
}