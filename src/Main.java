import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int[] number1 = {1,3,4,17};
        int[] number2 = {5,3,12};
        int[] merge = new int[number1.length + number2.length];

        for(int i=0 ; i < number1.length ; i++){
            merge[i] = number1[i];
        }

        for(int i = 0; i < number2.length; i++) {
            merge[i + number1.length] = number2[i];
        }
        System.out.println(Arrays.toString(merge));


    }
}