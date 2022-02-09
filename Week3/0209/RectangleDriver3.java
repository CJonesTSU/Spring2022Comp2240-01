public class RectangleDriver2{
    public static void main(String[] args){
        Rectangle3 myRectangle = new Rectangle3();
        Rectangle3 mySecondRectangle = new Rectangle3();
        
        //System.out.println(myRectangle);
        myRectangle.setLength(2.3);
        myRectangle.setWidth(3.76);
        mySecondRectangle.setLength(17.123);
        mySecondRectangle.setWidth(-2.98);
        
        printRectangle(myRectangle);
        System.out.println();
        
        printRectangle(mySecondRectangle);
        System.out.println();
        
        myRectangle.setLength(56.4);
        myRectangle.setWidth(99.999);
        
        printRectangle(myRectangle);

    }
    
    private static void printRectangle(Rectangle2 rect){
        System.out.println("rect.getLength() = " + rect.getLength());
        System.out.println("rect.getWidth() = " + rect.getWidth());
        System.out.println("rect.getArea() = " + rect.getArea());        
    }
}