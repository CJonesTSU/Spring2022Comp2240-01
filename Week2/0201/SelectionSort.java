public class SelectionSort{
    public static void main(String[] args){
        int[] list = {2, 5, 3, 33, 19, 10, 24, 56, 192, 2048, -5, -122, -56, 1054};
        int n = list.length; 
        
        System.out.println("Starting Array");
        printArray(list);
        for(int i = 0; i < n - 1; i++ ){
            int min = i;
            for(int j = i + 1; j < n; j++){
                if(list[j] < list[min]){
                    min = j;
                }
            }
            if(min != i){
                int temp = list[i];
                list[i] = list[min];
                list[min] = temp;
            }
        printArray(list);
        }
        System.out.println("Sorted Array");
        printArray(list);
    }
    
    private static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}