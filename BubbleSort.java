public class BubbleSort {
    public static void main(String[] args) {

        int intArray[] = new int[]{5,90,35,45,150,3};

        //print array before sorting using bubble sort algorithm
        System.out.println("Array Before Bubble Sort");
        
        for (int i=0; i<intArray.length; i++){
            System.out.print(intArray[i] + ", ");
        }

        bubbleSort(intArray);

      
        System.out.println("\n"+"Array After Bubble Sort");
        
        for (int i=0; i<intArray.length; i++){
            System.out.print(intArray[i] + ", ");
        }
    }

    private static void bubbleSort(int[] intArray) {
        for (int n=0; n<intArray.length; n++){
            for (int i=1; i<intArray.length-n; i++){
                if (intArray[i-1] > intArray[i]){
                    int temp=intArray[i];
                    intArray[i]=intArray[i-1];
                    intArray[i-1]=temp;
                }
            }
        }

    }
}
