import java.util.Scanner;

//assignment 1


 abstract class Figure {
	//properties
	double dim1;
	
	//methods
	abstract double findArea(int a,int b);
	abstract double findPerimeter(int a,int b);
	abstract double findArea(int a);
	abstract double findPerimeter(int a);
}

 class Circle extends Figure
	{

	double findArea(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	double findPerimeter(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	double findArea(int a) {
		// TODO Auto-generated method stub
		return 3.14*a*a;
	}

	double findPerimeter(int a) {
		// TODO Auto-generated method stub
		return 2*3.14*a;
	}

	
	

	
	}

 class Rectangle extends Figure
	{

	double findArea(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	double findPerimeter(int a, int b) {
		// TODO Auto-generated method stub
		return 2*a*b;
	}

	double findArea(int a) {
		// TODO Auto-generated method stub
		return 0;
	}

	double findPerimeter(int a) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	}

 class Triangle extends Figure
	{

	double findArea(int a, int b) {
		// TODO Auto-generated method stub
		return 0.5*a*b;
	}

	double findPerimeter(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	double findArea(int a) {
		// TODO Auto-generated method stub
		return 3*a;
	}

	double findPerimeter(int a) {
		// TODO Auto-generated method stub
		return 0;
	}

		
	}
 
    /*class FigureFactory 
 	{
 		public  Figure getInstance(String instance)
 		{
 			if(instance.equalsIgnoreCase("Circle"))
 				return new Circle();
 			elseif(instance.equalsIgnoreCase("Triangle"))
				return new Triangle();
			else
				return new Rectangle();
			 
 		}
 	}
 
 */






public class FigureClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,r,l,br,side,alt;
		Scanner s = new Scanner(System.in);
		
		System.out.println("***********************************");
		System.out.println("Select the shape");
		System.out.println("\n1.Circle \n2.Rectangle \n3.Triangle");
		i = s.nextInt();
		s.reset();
		switch(i)
		{
		case 1 	: 
			System.out.println("Enter the radius for circle");
			r = s.nextInt();
			Circle circ = new Circle();
					System.out.println("Area is "+circ.findArea(r));
					System.out.println("Perimeter is "+circ.findPerimeter(r));
			break;
		case 2 	:
			System.out.println("Enter the length and breadth for Rectangle respectively ");
			l=s.nextInt();
			s.reset();
			br=s.nextInt();
			  Rectangle rect = new Rectangle();
			  		System.out.println("Area is "+rect.findArea(l,br));
			  		System.out.println("Perimeter is "+rect.findPerimeter(l,br));
			break;
		case 3 	:
			System.out.println("Enter the side and altitude for Triangle");
			side=s.nextInt();
			s.reset();
			alt=s.nextInt();
			Triangle tri = new Triangle();
	  				System.out.println("Area is "+tri.findArea(side,alt));
	  				System.out.println("Perimeter is "+tri.findPerimeter(side));
			
		default :
			System.out.println("Wrong Selection");
		}
		
		
	}

}
