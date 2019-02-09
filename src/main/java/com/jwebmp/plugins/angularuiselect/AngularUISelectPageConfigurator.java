package com.jwebmp.plugins.angularuiselect;

import com.jwebmp.core.Page;
import com.jwebmp.core.base.angular.AngularPageConfigurator;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;
import com.jwebmp.core.services.IPageConfigurator;

import javax.validation.constraints.NotNull;

/**
 * The Angular UI Select Configurator
 *
 * @author GedMarc
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "Angular UI Select",
		pluginDescription = "A native AngularJS implementation of Select2/Selectize by the AngularUI Team",
		pluginUniqueName = "jwebswing-angular-ui-select",
		pluginVersion = "0.17.1",
		pluginCategories = "angular,select, dropdown, bootstrap, select2, selectizer, ui,web ui, framework",
		pluginSubtitle = "A native AngularJS implementation of Select2/Selectize by the AngularUI Team",
		pluginSourceUrl = "https://github.com/angular-ui/ui-select",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-Angular-UI-Select/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-Angular-UI-Select",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "https://angular-ui.github.io/ui-select/#documenation",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/AngularUISelect.jar/download")
public class AngularUISelectPageConfigurator
		implements IPageConfigurator<AngularUISelectPageConfigurator>
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	/*
	 * Constructs a new AngularUISelectPageConfigurator
	 */
	public AngularUISelectPageConfigurator()
	{
		//Nothing needed
	}

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return AngularUISelectPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		AngularUISelectPageConfigurator.enabled = mustEnable;
	}

	@NotNull
	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured() && enabled())
		{
			JQueryPageConfigurator.setRequired(true);
			AngularPageConfigurator.setRequired(true);

			page.getBody()
			    .addJavaScriptReference(AngularUISelectReferencePool.AngularUISelect.getJavaScriptReference());
		}
		return page;
	}

	@Override
	public boolean enabled()
	{
		return AngularUISelectPageConfigurator.enabled;
	}
}
