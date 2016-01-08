
public class ResourceB implements AutoCloseable {

	public ResourceB() {
		System.out.println("ResourceB Open");
	}

	public void close() {
		System.out.println("ResourceB Close");
	}
}
