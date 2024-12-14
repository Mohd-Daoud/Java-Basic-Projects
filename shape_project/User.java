/* I designed and implemented an engaging educational game tailored for students in classes 6 to 12th, aimed at enhancing their understanding of 2D and 3D shapes. The game features a user interface where students can interact with various shapes by clicking on them. It uses object-oriented programming principles, I incorporated key concepts such as has-a-relationship, method overriding, method overloading, constructor overriding, inheritance, and upcasting to create a robust and extensible codebase.
 */
package shape_project;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Game g=new Game();
		char c;
		do {
			int choice=g.selectShape();
			if(choice==1) {
				System.out.println("You have Selected 2D Shape");
				TwoDShape td=g.selectTwoDShape();
				td.getArea();
				td.getPerimeter();
			}
			else{
				System.out.println("You have Selected 3D Shape");
				ThreeDShape td=g.selectThreeDShape();
				td.getVolume();
				td.getCurvedSurfaceArea();
				td.getTotalSurfaceArea();
			}
			System.out.println("Press Y/y to restart....");
			c=sc.next().charAt(0);
		}while(c=='Y' || c=='y');
		System.out.println("====Thank you for playing game====");
	}

}
