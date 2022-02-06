public class FindMax{
    public static void main(String[] args){
        int[] numArray = {5, 6, 89,-21, 55, -1068, 0, 99, 43, 87};
        int len = numArray.length;
        int currentMax = Integer.MIN_VALUE;
        
        for(int i = 0; i < len; i++){
            if(numArray[i] > currentMax){
                currentMax = numArray[i];
            }
        }
        System.out.println("Max value is " + currentMax);
    }
}