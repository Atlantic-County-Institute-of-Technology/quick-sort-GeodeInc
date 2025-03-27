import java.util.Arrays;
import java.util.Random;

public class Main {


//  creates a random array of new integers
    public static void main(String[] args){
        int[] arr = new int[0];
        for(int i = 0; i < arr.length; i++){
            Random r = new Random();
            arr[i] = r.nextInt(0, 1000);
        }

// checks to see if the list is empty then runs the program
        if (arr.length ==0){System.out.println("Empty List");}
        else {
            System.out.println(Arrays.toString(arr));
            quickSort(arr, 0, arr.length - 1);
            System.out.println(Arrays.toString(arr));
        }

    }

    // sorts the list around a pivot point
    public static int partition(int[] arr, int low, int high){

        
        int flip = low - 1;

        int pivot = arr[high];



        for(int i = low; i < high; i++){
            if(arr[i] < pivot){
                swap(arr, flip + 1, i);
                flip++;
            }
        }

        swap(arr, flip + 1, high);
        return flip+1;


    }
// swaps two items in an array
    public static void swap(int[] arr, int i, int j){

        int temp = arr[j];

        arr[j] = arr[i];
        arr[i] = temp;




    }
// puts everything together
    public static void quickSort(int[] arr, int low, int high){
        if(low < high) {

            int pivot = partition(arr, low, high);

            quickSort(arr, low, pivot - 1);
            quickSort(arr , pivot + 1, high);
        }
    }
}



