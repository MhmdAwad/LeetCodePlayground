package alogrithms;

public class Sorting {

    public static void printArray(int[] array){
        for (int i : array) {
            System.out.println(">>>>> " + i);
        }
    }

    public static void insertionSort(){
        // 1, 3, 2, 5,
        int[] array = {5,1,3,2,4,12,46,13,0,14,78,6};
        for(int i =0; i < array.length ; i++){
            if(array[i] < array[0]){
                int temp = array[i];
                array[i] = array[0];
                array[0] = temp;
            }else {
                for (int x = 2; x < array.length; x++) {
                    int f = x - 2;
                    int s = x - 1;
                    if (array[x] < array[f]) {
                        int temp = array[x];
                        array[x] = array[s];
                        array[s] = array[f];
                        array[f] = temp;
                    } else if (array[x] < array[s]) {
                        int temp = array[x];
                        array[x] = array[s];
                        array[s] = temp;
                    }
                }
            }
        }
        printArray(array);
    }
    public static void selectionSort(){
        int[] array = {5,1,3,2,4,12,46,13,78,6};
        for(int i =0; i < array.length; i++){
            int min= array[i];
            int index= i;
            for(int x = i+1; x < array.length; x++) {
                if (min > array[x]){
                    min = array[x];
                    index = x;
                }
            }
            int temp = array[index];
            array[index] = array[i];
            array[i]  = temp;
        }
        printArray(array);
    }
    public static void bubbleSort(){
        int[] array = {5,1,3,2,4,12,46,13,78,6};
        for(int i = 0; i < array.length; i++){
            for(int x = 0; x < array.length-1; x++){
                if(array[x] > array[x+1]){
                    int temp = array[x];
                    array[x] = array[x+1];
                    array[x+1] = temp;
                }
            }
        }
        printArray(array);
    }
}
