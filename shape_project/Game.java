package shape_project;
import java.util.Scanner;
public class Game {
	Game(){
		System.out.println("====Game Has Started====");
	}
	public int selectShape() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for 2DShape");
		System.out.println("Press 2 for 3DShape");
		int choice=sc.nextInt();
		if(choice==1)
			return 1;
		else if(choice==2)
			return 2;
		else {
			System.out.println("Invalid Choice!");
				return selectShape();
		}	
	}
	public  TwoDShape selectTwoDShape() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for Circle");
		System.out.println("Press 2 for Triangle");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("You have selected Circle");
			System.out.println("ENter Radius: ");
			double r=sc.nextDouble();
			Circle c1=new Circle(r);
		return c1;
		}
		else if(choice==2) {
			System.out.println("You have selected Triangle");
			System.out.println("ENter side1: ");
			double side1=sc.nextDouble();
			System.out.println("ENter side2: ");
			double side2=sc.nextDouble();
			System.out.println("ENter side3: ");
			double side3=sc.nextDouble();
		return new Triangle(side1, side2, side3);
		}
		else {
			System.out.println("Invalid choice!");
			return selectTwoDShape();
		}
	}
	public  ThreeDShape selectThreeDShape() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for Cylinder");
		System.out.println("Press 2 for Cube");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("You have selected Cylinder");
			System.out.println("ENter Radius: ");
			double r=sc.nextDouble();
			System.out.println("ENter Height: ");
			double h=sc.nextDouble();
		return new Cylinder(r,h);
		}
		else if(choice==2) {
			System.out.println("You have selected Cube");
			System.out.println("ENter side: ");
			double side=sc.nextDouble();
		return new Cube(side);
		}
		else {
			System.out.println("Invalid choice!");
			return selectThreeDShape();
		}
	}
}






