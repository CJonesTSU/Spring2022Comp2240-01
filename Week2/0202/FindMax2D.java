public class FindMax2D{
    public static void main(String[] args){
        
        int[] first = {3, 5, 9,-2, 45, -87, 44, 6, 2, 3453, 55, 23, 234};
        int[] second = {45, 1};
        int[] third = {120, 44, 3, -2};
        int[][] arr = {first, second, third};
                       
        int max = arr[0][0];
        for(int i = 0; i < arr.length; i++){
           for(int j = 0; j < arr[i
           ].length; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
           } 
        }
        System.out.println("max is: " + max);
    }
}