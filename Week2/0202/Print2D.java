public class Print2D {
    public static void main(String[] args){
        int[][] arr2D = new int[2][3];
        
        // row zero 
        arr2D[0][0] = 1;
        arr2D[0][1] = 2;
        arr2D[0][2] = 3;
        
        // row one
        arr2D[1][0] = 4;
        arr2D[1][1] = 5;
        arr2D[1][2] = 6;
        
        int[][] otherArr2D = {{1, 2, 3}, {4, 5, 6}};
        
        int[] firstArray = {1,2,3};
        int[] secondArray = {4,5,6};
        
        int[][] combinedArray = {firstArray, secondArray};
        
        
        // int[][] arr = {{2, 5, 3, 33, 19, 10, 24, 56, 192},
        //               {55, 3, 7, 3, 1, 11, 54, 16, -45}};
        
        // int[][] test = {{1, 3}, {2, 5}};               
        
        print2DArray(arr2D);
        System.out.println();
        print2DArray(otherArr2D);
        System.out.println();
        print2DArray(combinedArray);
    }
    
    private static void print2DArray(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print("arr["+ i + "][" + j+ "] "+ arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}