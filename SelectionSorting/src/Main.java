//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int array[] = {4,3,2,1};
        System.out.println("original array: ");
        printArray(array);
        System.out.println();

        SelectionSort(array);

        System.out.println("after Sorting: ");
        printArray(array);

    }

    private static void SelectionSort(int[] arr){
        int n = arr.length;
        int i , j, minimumIndex, temp;
        for( i = 0; i<n-1; i++){
            minimumIndex = i;
            for(j = i+1; j<n ; j++){
                if(arr[j] < arr[minimumIndex]){
                    minimumIndex = j;
                }
            }

            if(minimumIndex != i){
                temp = arr[i];
                arr[i] = arr[minimumIndex];
                arr[minimumIndex] = temp;
            }

        }

    }

    static  void printArray(int[] arr){
        for(int value: arr){
            System.out.print(value + " ");
            System.out.println();
        }
    }

}