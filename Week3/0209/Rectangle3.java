public class Rectangle2{
    // Fields
    private double length;
    private double width;
    
    // getters or accessors
    public double getLength(){
        return length;
    }
    
    public double getWidth(){
        return width;
    }
    
    // setters or mutators
    public void setLength(int l){
        if(l < 0){
            l = l * -1;
        }
        length = l;
    }
    
    public void setWidth(int w){
        if(w < 0){
            w = w * -1;
        }
        width = w;
    }
    
    // helper methods
    public int getArea(){
        return length * wdith;
    }
}