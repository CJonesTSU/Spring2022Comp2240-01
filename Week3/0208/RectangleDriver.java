public class RectangleDriver{
    public static void main(String[] args){
        Rectangle myRectangle = new Rectangle();
        Rectangle mySecondRectangle = new Rectangle();
        
        //System.out.println(myRectangle);
        myRectangle.length = 2;
        myRectangle.width = 3;
        mySecondRectangle.length = 17;
        mySecondRectangle.width = 2;
        System.out.println("myRectangle.length = " + myRectangle.length;
        System.out.println("myRectangle.width = " + myRectangle.width);
        System.out.println("mySecondRectangle.length = " + mySecondRectangle.length);
        System.out.println("mySecondRectangle.width = " + mySecondRectangle.width);
        myRectangle.length = 56;
        myRectangle.width = 99;
        System.out.println("myRectangle.length = " + myRectangle.length);
        System.out.println("myRectangle.width = " + myRectangle.width);
    }
}