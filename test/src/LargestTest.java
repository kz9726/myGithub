import junit.framework.TestCase;


public class LargestTest extends TestCase {
	public LargestTest (String name){
		super (name);
	}
	
	public void testSimple (){
		assertEquals (10,Largest.largest(new int[]{9,8,7,10}));
	}

}
