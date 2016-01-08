
public class TryCatchFinally {

	public static void main(String[] args) throws Exception {
		ResourceC c = null;
		try {
			c = new ResourceC();
			throw new Exception("main error"); // lost
		} catch (Exception e) {
			// e.printStackTrace();
		} finally {
			// The exception thrown from the finally block would be propagated up the call stack
			if (c != null) {
				c.close();
			}
		}
	}

}
