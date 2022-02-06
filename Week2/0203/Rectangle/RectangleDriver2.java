public class RectangleDriver2{
    public static void main(String[] args){
        Rectangle2 myRectangle = new Rectangle2();
        Rectangle2 mySecondRectangle = new Rectangle2();
        
        //System.out.println(myRectangle);
        myRectangle.setLength(2);
        myRectangle.setWidth(3);
        mySecondRectangle.setLength(17);
        mySecondRectangle.setWidth(-2);
        
        printRectangle(myRectangle);
        System.out.println();
        
        printRectangle(mySecondRectangle);
        System.out.println();
        
        myRectangle.setLength(56);
        myRectangle.setWidth(99);
        
        printRectangle(myRectangle);

    }
    
    private static void printRectangle(Rectangle2 rect){
        System.out.println("rect.getLength() = " + rect.getLength());
        System.out.println("rect.getWidth() = " + rect.getWidth());
        System.out.println("rect.getArea() = " + rect.getArea());        
    }
}