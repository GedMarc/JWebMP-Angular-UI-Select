import com.jwebmp.core.base.angular.services.IAngularController;
import com.jwebmp.core.base.angular.services.IAngularModule;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.angularuiselect.AngularUISelectDefaultConfigController;
import com.jwebmp.plugins.angularuiselect.AngularUISelectModule;
import com.jwebmp.plugins.angularuiselect.AngularUISelectPageConfigurator;

module com.jwebmp.plugins.angularuiselect {
	exports com.jwebmp.plugins.angularuiselect;
	exports com.jwebmp.plugins.angularuiselect.interfaces;

	requires com.jwebmp.core;

	provides IPageConfigurator with AngularUISelectPageConfigurator;
	provides IAngularModule with AngularUISelectModule;
	provides IAngularController with AngularUISelectDefaultConfigController;
}
