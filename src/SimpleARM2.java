
public class SimpleARM2 {

	public static void main(String[] args) {
		try (ResourceA a = new ResourceA(); ResourceB b = new ResourceB()) {
			throw new Error();
		}
		// Resources will be closed in reverse order of the order in which they are created
	}

}
