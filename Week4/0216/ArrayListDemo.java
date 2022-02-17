// import the arraylist class
import java.util.ArrayList;

public class ArrayListDemo{
  public static void main(String[] args){
    ArrayList<String> arrList = new ArrayList<>();
    ArrayList<Integer> arrList2 = new ArrayList<>();
    int[] arr = {3,4,5,2,1};
    
    arrList.add("This is the first string");
    System.out.println("arrList.size(): " + arrList.size());
    arrList.add("There is a road no simple highway");
    arrList.add("I don't know what to type here");
    System.out.println("arrList.size(): " + arrList.size());
    System.out.println("arrList.get(1): " + arrList.get(1));
    System.out.println("printing the array " + arr);
    System.out.println();
    System.out.println("Printing string at index 1: " + arrList.get(1));
    System.out.println("printing arrayList: " + arrList);
    arrList.remove(0);
    System.out.println("printing arrayList: " + arrList);
    System.out.println("Printing string at index 0: " + arrList.get(0));
    System.out.println();
    arrList.add(2, "Index 2");
    System.out.println("printing arrayList: " + arrList);
    arrList.add(1, "Index 1");
    System.out.println("printing arrayList: " + arrList);
    arrList.set(1, "Not the same anymore");
    System.out.println("printing arrayList: " + arrList);
    
    
    
    
    
    
    
  }
}