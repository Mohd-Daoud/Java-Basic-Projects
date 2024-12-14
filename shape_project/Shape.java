package shape_project;

public interface Shape {
	
	default void rotateShape() {
		System.out.println("Rotate the Shape");
	}

}
