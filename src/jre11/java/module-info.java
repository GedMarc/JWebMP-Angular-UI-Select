module com.jwebmp.plugins.angularuiselect {
	exports com.jwebmp.plugins.angularuiselect;
	exports com.jwebmp.plugins.angularuiselect.interfaces;

	requires com.jwebmp.core;
	requires java.validation;
	requires com.jwebmp.guicedinjection;
	requires com.jwebmp.core.angularjs;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.angularuiselect.AngularUISelectPageConfigurator;
	provides com.jwebmp.core.base.angular.services.IAngularModule with com.jwebmp.plugins.angularuiselect.AngularUISelectModule;
	provides com.jwebmp.core.base.angular.services.IAngularController with com.jwebmp.plugins.angularuiselect.AngularUISelectDefaultConfigController;

	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.angularuiselect.implementations.AngularUISelectExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.angularuiselect.implementations.AngularUISelectExclusionsModule;

	opens com.jwebmp.plugins.angularuiselect to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.angularuiselect.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
}
