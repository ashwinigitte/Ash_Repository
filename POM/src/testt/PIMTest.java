package testt;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PIMTest extends CommonTest {
	
	
@Test(priority=4,groups= {"smoke","regression"})
public void verifyTxtOnPim() {
	pp.clickOnPim();
	String txtOnPim = pp.textOnPim();
	Assert.assertEquals(txtOnPim,"PIM");
	}
	
@Test(priority=5,groups= {"smoke","regression"})
public void verifyEmpSearchEmpId()
{
	pp.clickOnSearch("0273");
	pp.clickOnSearch1();
	String id=pp.clickOnSearch("0273");
	Assert.assertEquals(id,"0273");
	}

@Test(priority=5,groups= {"smoke","regression"})//updated TC to push on git repository
public void TestingChanges() {
	Assert.assertEquals(false, false);
}
}
