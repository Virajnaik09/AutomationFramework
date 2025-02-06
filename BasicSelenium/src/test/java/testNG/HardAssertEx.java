package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertEx {
	@Test
public void M1() 
{
	System.out.println("Step 1");
	System.out.println("Step 2");
	Assert.assertEquals(true,true);
	System.out.println("Step 3");
	System.out.println("Step 4");
}
	@Test
public void M2()
{
	String expdata = "Qspiders";
	String actldata = "Qspiders";
	Assert.assertEquals(actldata, expdata);
}
}
