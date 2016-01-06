
/**
 * @author  Qi Zhang
 * @version 01.05.2016
 */

public class SimpleARM {

	public static void main(String[] args) throws Exception {
		try (ResourceA a = new ResourceA(new ResourceB())) {
			throw new Error();
		}
	}

	public static class ResourceA implements AutoCloseable {

		public ResourceA(ResourceB b) {
			System.out.println("ResourceA Open");
		}

		public void close() {
			System.out.println("ResourceA Close");
		}
	}

	public static class ResourceB implements AutoCloseable {

		public ResourceB() {
			System.out.println("ResourceB Open");
			//throw new Error();
		}
		
		public void close() {
			System.out.println("ResourceB Close");
		}
	}

}
