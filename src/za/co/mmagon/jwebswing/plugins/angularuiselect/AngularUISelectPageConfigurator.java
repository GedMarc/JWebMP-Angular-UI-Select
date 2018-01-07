package za.co.mmagon.jwebswing.plugins.angularuiselect;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.base.angular.AngularPageConfigurator;
import za.co.mmagon.jwebswing.plugins.PluginInformation;
import za.co.mmagon.jwebswing.plugins.jquery.JQueryPageConfigurator;

/**
 * The Angular UI Select Configurator
 *
 * @author Marc Magon
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "Angular UI Select",
		pluginDescription = "A native AngularJS implementation of Select2/Selectize by the AngularUI Team",
		pluginUniqueName = "jwebswing-angular-ui-select",
		pluginVersion = "0.17.1",
		pluginCategories = "angular,select, dropdown, bootstrap, select2, selectizer, ui,web ui, framework",
		pluginSubtitle = "A native AngularJS implementation of Select2/Selectize by the AngularUI Team",
		pluginSourceUrl = "https://github.com/angular-ui/ui-select",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-Angular-UI-Select/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-Angular-UI-Select",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "https://angular-ui.github.io/ui-select/#documenation",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/AngularUISelect.jar/download"
) class AngularUISelectPageConfigurator extends PageConfigurator
{

	private static final long serialVersionUID = 1L;

	/*
	 * Constructs a new AngularUISelectPageConfigurator
	 */
	public AngularUISelectPageConfigurator()
	{
		//Nothing needed
	}

	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			JQueryPageConfigurator.setRequired(true);
			AngularPageConfigurator.setRequired(true);

			page.getBody().addJavaScriptReference(AngularUISelectReferencePool.AngularUISelect.getJavaScriptReference());

			page.getAngular().getAngularModules().add(new AngularUISelectModule());
			page.getAngular().getAngularControllers().add(new AngularUISelectDefaultConfigController());
		}
		return page;
	}
}
