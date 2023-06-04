public class bubbleSort {
    public static void main(String[] args) {
        int[] array = {1,6,2,8};

        // bubbleSort
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j]>array[j+1 ]) {
                    //swap
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
            for (i = 0; i < array.length ; i++) {
                System.out.println(array[i]);
            }
        }
    }
}
