import com.jwebmp.core.base.angular.services.IAngularController;
import com.jwebmp.core.base.angular.services.IAngularModule;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.angularuiselect.AngularUISelectDefaultConfigController;
import com.jwebmp.plugins.angularuiselect.AngularUISelectModule;
import com.jwebmp.plugins.angularuiselect.AngularUISelectPageConfigurator;
import com.jwebmp.plugins.angularuiselect.implementations.AngularUISelectExclusionsModule;

module com.jwebmp.plugins.angularuiselect {
	exports com.jwebmp.plugins.angularuiselect;
	exports com.jwebmp.plugins.angularuiselect.interfaces;

	requires com.jwebmp.core;
	requires java.validation;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with AngularUISelectPageConfigurator;
	provides IAngularModule with AngularUISelectModule;
	provides IAngularController with AngularUISelectDefaultConfigController;

	provides IGuiceScanJarExclusions with AngularUISelectExclusionsModule;
	provides IGuiceScanModuleExclusions with AngularUISelectExclusionsModule;

	opens com.jwebmp.plugins.angularuiselect to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.angularuiselect.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
}
