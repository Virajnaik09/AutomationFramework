package testNG;

import org.testng.annotations.Test;

public class Sampletest {
@Test(invocationCount = 5)	
public void createContact()
{
	System.out.println("Contact Created");
}
@Test(enabled = false)
public void modifyContact()
{
	System.out.println("Contact Modified");
}
@Test(dependsOnMethods = "createContact")
public void deleteContact()
{
	System.out.println("Contact Deleted");
}
}
