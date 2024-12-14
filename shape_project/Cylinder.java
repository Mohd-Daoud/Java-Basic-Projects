package shape_project;

public class Cylinder implements ThreeDShape{
	double r;
	double h;
	public Cylinder() {
		// TODO Auto-generated constructor stub
	}
	Cylinder(double r, double h){
		this.r=r;
		this.h=h;
	}
	public void getVolume() {
		System.out.println("Volume of Cylinder is: "+Math.PI*r*r*h+" Cu. Unit");
	}
	public void getCurvedSurfaceArea() {
		System.out.println("Curved Surface Area of Cylinder is: "+2*Math.PI*r*h+" Sq. Unit");
	}
	public void getTotalSurfaceArea() {
		System.out.println("Total Surface Area of Cylinder is: "+2*Math.PI*r*(r+h)+" Sq. Unit");
	}
}





