
public class ResourceC implements AutoCloseable {
	public ResourceC() {
		System.out.println("ResourceC Open");
	}

	public void close() throws Exception {
		throw new Exception();
	}
}
