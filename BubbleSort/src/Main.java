
public class Main {
    public static void main(String[] args) {

        int[] arr = {48,33,25,1, 34,34,25,42,-4};
        BubbleSort(arr);
        printArray(arr);

    }

    public static void BubbleSort(int[] array){
        int i, j , temp;
        for(i =0; i<array.length -1; i++){
            for(j=0; j<array.length -i -1; j++){
                if(array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1]  = temp;
                }
            }
        }
    }



    public static void printArray(int[] array){
        for(int var: array){
            System.out.println(var);
        }

    }
}


