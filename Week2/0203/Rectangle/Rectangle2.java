public class Rectangle2{
    private int length;
    private int width;
    
    // getters or accessors
    public int getLength(){
        return length;
    }
    
    public int getWidth(){
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
        return length * width;
    }
}