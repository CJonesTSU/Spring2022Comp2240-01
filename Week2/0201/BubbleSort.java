public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {2, 5, 3, 33, 19, 10, 24, 56, 192, 2048, -5, -122, -56, 1054};
        
        System.out.println("Original array: ");
        printArray(arr);
        boolean didSwap = true; 
        int timesThruWhile = 0;
        while(didSwap == true){
            didSwap = false;
            for(int i = 0; i < arr.length - 1; i++){
                //System.out.println("comparing " + arr[i] + " and " + arr[i+1]);
                if(arr[i] < arr[i + 1]){
                    // swap the two
                    //System.out.println("swapping " + arr[i] + " and " + arr[i+1]);
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    didSwap = true;
                    //printArray(arr);
                }
            }
            timesThruWhile++;
            //System.out.println("pass " + timesThruWhile + " Array looks like");
            //printArray(arr);
        }
        System.out.println("Sorted array: ");
        printArray(arr);
    }
    
    private static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}