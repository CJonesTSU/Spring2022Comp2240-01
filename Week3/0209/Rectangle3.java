public class Rectangle3{
    // Fields
    private double length;
    private double width;
    
    // Constructors
    public Rectangle3(double l, double w){
      length = l;
      width = w;
    }

    
    public Rectangle3(){
      length = 0.0;
      width = 0.0;
    }
    
    
    // getters or accessors
    public double getLength(){
        return length;
    }
    
    public double getWidth(){
        return width;
    }
    
    // setters or mutators
    public void setLength(double l){
        if(l < 0){
            l = l * -1;
        }
        length = l;
    }
    
    public void setWidth(double w){
        if(w < 0){
            w = w * -1;
        }
        width = w;
    }
    
    // helper methods
    public double getArea(){
        return length * width;
    }
}