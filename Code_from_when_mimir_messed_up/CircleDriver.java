public class CircleDriver {
    public static void main(String[] args){
		System.out.println(Circle.PI);
		
		
		
		Circle circle1 = new Circle(2.3);
		System.out.println("circle1 count is: " + circle1.getCount());
		Circle circle2 = new Circle(4.7);
		System.out.println("circle2 count is: " + circle2.getCount());
		Circle circle3 = new Circle(.0065);
		System.out.println("circle3 count is: " + circle3.getCount());
		Circle circle4 = new Circle(18.99);
		System.out.println("circle4 count is: " + circle4.getCount());
		Circle circle5 = new Circle(103.2);
		System.out.println("circle5 count is: " + circle5.getCount());
		System.out.println("circle1 count is: " + circle1.getCount());
		System.out.println("circle4 count is: " + circle4.getCount());

		System.out.println("Circle1 area: " + circle1.getArea());
		System.out.println("Circle2 area: " + circle2.getArea());
		System.out.println("Circle3 area: " + circle3.getArea());
		System.out.println("Circle4 area: " + circle4.getArea());
		System.out.println("Circle5 area: " + circle5.getArea());
    }
    
}
