package shape_project;

public class Cube implements ThreeDShape{
	double side;
	public Cube() {
		// TODO Auto-generated constructor stub
	}
	Cube(double side){
		this.side=side;
	}
	public void getVolume() {
		System.out.println("Volume of Cube is: "+side*side*side+" Cu. Unit");
	}
	public void getCurvedSurfaceArea() {
		System.out.println("Curved Surface Area of cube is: "+4*side*side+" Sq. Unit");
	}
	public void getTotalSurfaceArea() {
		System.out.println("Total Surface Area of cube is: "+6*side*side+" Sq. Unit");
	}

}
