public class AverageArray{
    public static void main(String[] args){
        int[] numArray = {5, 6, 89,-21, 55, -1068, 0, 99, 43, 87};
        int sum = 0;
        
        for(int i = 0; i < numArray.length; i++){
            sum = sum + numArray[i];
        }
        double avg = (double)sum / numArray.length;
        System.out.println("Average of the array is " + avg);
    }
}