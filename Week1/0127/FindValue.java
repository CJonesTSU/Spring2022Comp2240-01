public class FindValue{
    public static void main(String[] arg){
        int[] arr = {2, 6, 8,14, 22, 56, 2347, 93, 89, 7, 1010};
        int searchVal = 89;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == searchVal){
                System.out.println("Found " + arr[i] + " at index " + i);    
            }
            
        }
    }
}