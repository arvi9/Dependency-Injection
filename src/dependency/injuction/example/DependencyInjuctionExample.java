package dependency.injuction.example;

import withoutPolymorphisum.*;

import usingPolymorphisum.*;

	//Shape is abstract method
	class Triangle1 extends Shape
	{
		
		public void draw()
		{
			System.out.println("Draw triangle");
		}
	}
	
	//Shape is abstract method
	class Circle1 extends Shape
	{
		 
		 public void draw()
			{
				System.out.println("Draw Circle");
			}
	}
	
	



public class DependencyInjuctionExample 
{

	public static void main(String[] args) {

		// Without Polymorphisum
		Triangle myTriangle = new Triangle();
		myTriangle.draw();

		// Without Polymorphisum
		Circle myCircle = new Circle();
		myCircle.draw();
		
		
		// Using Polymorphisum
		Shape shape1  =  new Triangle1();
		shape1.draw();
		
		// Using Polymorphisum
		Shape shape2  =  new Circle1();
		shape2.draw();
		
		
		
		
	}

}
