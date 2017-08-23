package usingClassMemberRemoveDependency;

public class Drawing
{
	
	
	private Shape shape;
	
	
	public void setShape(Shape shape) {
		
		this.shape = shape;
	}
	
	public void drawShape()
	{
		
		this.shape.draw();
	}
}

class Shape
{

	public void draw() 
	{
		
		
	}
	
	
	
}

class Triangle 
{
	
	
}

class Circle 
{

}



public class RemoveDependency {

	public static void main(String[] args) {

		Triangle myTriangle  =  new Triangle();
		Drawing  myDrawing = new Drawing();
		myDrawing.setShape(myTriangle);

	}

}
