package za.co.mmagon.jwebswing.plugins.angularuiselect;

import za.co.mmagon.jwebswing.base.angular.modules.AngularModuleBase;

/**
 * The module getting loaded into angular
 *
 * @author Marc Magon
 * @since 08 Jun 2017
 */
class AngularUISelectModule extends AngularModuleBase
{

	private static final long serialVersionUID = 1L;

	/*
	 * Constructs a new AngularUISelectModule
	 */
	public AngularUISelectModule()
	{
		super("ui.select");
	}

	@Override
	public String renderFunction()
	{
		return null;
	}
}
