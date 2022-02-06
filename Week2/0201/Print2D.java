public class Print2D {
    public static void main(String[] args){
        int[][] arr = {{2, 5, 3, 33, 19, 10, 24, 56, 192},
                       {55, 3, 7, 3, 1, 11, 54, 16, -45}};
        int[][] test = {{1, 3}, {2, 5}};               
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print("arr["+ i + "][" + j+ "] "+ arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}