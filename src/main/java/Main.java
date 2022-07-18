public class Main {
    public static void main(String[] args){
        // selection sort = search through an array and keep track of the minimum value during
        //     each iteration. At the end of each iteration, we swap variables.

        //     Quadratic time O(n^2)
        //     small data set = okay
        //     large data set = BAD

        int[] array = {9,2,8,3,6,7,1,5,4};

        for (int i : array) System.out.print(i);

        System.out.println();

        selectionSort(array);

        for (int i = 0; i < array.length; i++) System.out.print(array[i]);


    }

    private static void selectionSort(int[] array) {
        for(int i=0; i < array.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[min] > array[j]){
                    min = j;
                }

            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
