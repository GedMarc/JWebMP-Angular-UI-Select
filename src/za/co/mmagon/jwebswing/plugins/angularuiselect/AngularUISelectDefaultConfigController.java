package za.co.mmagon.jwebswing.plugins.angularuiselect;

import za.co.mmagon.FileTemplates;
import za.co.mmagon.jwebswing.base.angular.controllers.AngularControllerBase;

/**
 * @author Marc Magon
 * @since 12 Jun 2017
 */
public class AngularUISelectDefaultConfigController extends AngularControllerBase
{
	
	private static final long serialVersionUID = 1L;
	
	/*
	 * Constructs a new AngularUISelectDefaultConfigController
	 */
	public AngularUISelectDefaultConfigController()
	{
		super("AngularUISelectDefaultConfigController");
	}
	
	@Override
	public String renderFunction()
	{
		StringBuilder controllerOutput = FileTemplates.getFileTemplate(AngularUISelectDefaultConfigController.class, "angularuiselectdefaults");
		return controllerOutput.toString();
	}
}
