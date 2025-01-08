//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int array[] = {4,3,2,1};
        InsertionSort(array);
    }

    private static void InsertionSort(int[] array) {
        int n = array.length;

        for(int i = 1; i<n; i++){
            int key = array[i];
            int j = i -1;

            while (j>=0 && array[j]>array[key]){
                array[j+1] = array[j];
                j-=1;

            }
            array[j+1] = key;
        }
    }
}