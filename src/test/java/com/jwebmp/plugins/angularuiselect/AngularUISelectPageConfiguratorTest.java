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

import com.jwebmp.core.Page;
import org.junit.jupiter.api.Test;

/**
 * @author Marc Magon
 */
public class AngularUISelectPageConfiguratorTest

{

	public AngularUISelectPageConfiguratorTest()
	{
	}

	@Test
	public void testSomeMethod()
	{
		Page p = new Page();
		System.out.println(p.toString(0));
	}

	@Test
	@SuppressWarnings("unchecked")
	public void testHtml()
	{
		Page p = new Page();
		AngularUISelect uis = new AngularUISelect("variable.name", "Please pick one...", "itemName in variable.name", "$item");
		uis.setLimit(5);
		uis.setInputId("input");
		p.getBody()
		 .add(uis);
		System.out.println(p.toString(0));
	}

}
