/**
 * Created by Max on 28.02.2017.
 */
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random r = new Random();
        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = r.nextInt();
        }

        System.out.println("Array Before Bubble Sort");
        for(int i=0; i < intArray.length; i++){
            System.out.println(intArray[i] + " ");
        }

        bubbleSort(intArray);

        System.out.println("");

        System.out.println("Array After Bubble Sort");
        for(int i=0; i < intArray.length; i++){
            System.out.println(intArray[i] + " ");
        }

    }
    // Сортування методом Бульбашка, порівнються пари чисел і, якщо перше число більше
    // за друге то вони міняються місцями, доти поки перше число в парі не буде меньшим за друге
    private static void bubbleSort(int[] intArray) {

        int n = intArray.length;
        int temp = 0;

        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){

                if(intArray[j-1] > intArray[j]){
                    temp = intArray[j-1];
                    intArray[j-1] = intArray[j];
                    intArray[j] = temp;
                }

            }
        }

    }
}