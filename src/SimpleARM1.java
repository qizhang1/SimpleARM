
/**
 * @author  Qi Zhang
 * @version 01.05.2016
 */

public class SimpleARM1 {

	public static void main(String[] args) throws InterruptedException {
		try (ResourceA a = new ResourceA(new ResourceB())) { 
			throw new Error( );
		}
		// ResourceA Close; ResourceB do no close
	}
}
