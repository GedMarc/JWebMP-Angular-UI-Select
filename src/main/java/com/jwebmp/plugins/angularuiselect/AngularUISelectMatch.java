/*
 * Copyright (C) 2017 GedMarc
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

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.attributes.InputTextAttributes;
import com.jwebmp.plugins.angularuiselect.interfaces.AngularUISelectChildren;

/**
 * A default select matcher with a set placeholder
 * <p>
 * in the ui-select-match element you need to change your naming to match your selected item like:
 * <p>
 * &lt;ui-select-match placeholder="Select person..."&gt; {{$item.name}} &lt;{{$item.email}}&gt; &lt;/ui-select-match&gt;
 * <p>
 * note the $item usage instead of $select.selected.name like in a our single item implementation.
 * <p>
 * You can set this via setText(), or simply pass in an object with setTiny(true) and .toString(true);
 *
 * @author GedMarc
 * @since 12 Jun 2017
 */
public class AngularUISelectMatch
		extends Div
		implements AngularUISelectChildren
{


	/*
	 * Constructs a new AngularUISelectMatch
	 */
	@SuppressWarnings("unchecked")
	public AngularUISelectMatch(String variableName, String placeHolder)
	{
		setTag("ui-select-match");
		setText("{{" + variableName + "}}");
		addAttribute(InputTextAttributes.PlaceHolder, placeHolder);
	}
}
