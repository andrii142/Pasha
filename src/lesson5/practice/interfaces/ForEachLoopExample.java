package lesson5.practice.interfaces;

public class ForEachLoopExample {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, -1, 33};

        //data-type
        int index = 0;
        for(int t : arr) {
            System.out.println(t);
            index++;
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
