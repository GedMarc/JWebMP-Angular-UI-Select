/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.angularuiselect;

import com.jwebmp.FileTemplates;
import com.jwebmp.base.angular.controllers.AngularControllerBase;

/**
 * @author Marc Magon
 * @since 12 Jun 2017
 */
public class AngularUISelectDefaultConfigController
		extends AngularControllerBase
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
