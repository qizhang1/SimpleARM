

public class ResourceA implements AutoCloseable {
	public ResourceA(ResourceB b) {
		System.out.println("ResourceA Open");
	}

	public ResourceA() {
		System.out.println("ResourceA Open");
	}

	public void close() {
		System.out.println("ResourceA Close");
	}
	
}
