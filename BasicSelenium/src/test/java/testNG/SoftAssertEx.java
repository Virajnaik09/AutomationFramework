package testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Test
public class SoftAssertEx {
	public void M1() {
	System.out.println("Step 1");
	 System.out.println("Step 2");
	 SoftAssert soft = new SoftAssert();
	 soft.assertEquals("A","A");
	 System.out.println("Step 3");
	 System.out.println("Step 4");
	 soft.assertAll();

}
}