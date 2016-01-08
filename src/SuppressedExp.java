public class SuppressedExp {

	public static void main(String[] args) throws Exception {
		try (ResourceC c = new ResourceC()) {
			throw new Exception("main error");
		} catch (Exception e) {
			// The exception thrown inside the try block is thrown to the outside world. 
			// The exception thrown when the resource was closed is suppressed.
			e.printStackTrace();
		}
	}
	
}
