package za.co.mmagon.jwebswing.plugins.angularuiselect;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.BaseTestClass;
import za.co.mmagon.jwebswing.Page;

/**
 * @author Marc Magon
 */
public class AngularUISelectPageConfiguratorTest extends BaseTestClass
{
	
	public AngularUISelectPageConfiguratorTest()
	{
	}
	
	@Test
	public void testSomeMethod()
	{
		Page p = getInstance();
		System.out.println(p.toString(0));
	}
	
	@Test
	public void testHtml()
	{
		Page p = getInstance();
		AngularUISelect uis = new AngularUISelect("variable.name", "Please pick one...", "itemName in variable.name", "$item");
		uis.setLimit(5);
		uis.setInputId("input");
		p.getBody().add(uis);
		System.out.println(p.toString(0));
	}
	
}
