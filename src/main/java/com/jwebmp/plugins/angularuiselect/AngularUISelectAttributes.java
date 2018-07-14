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

import com.jwebmp.base.html.interfaces.AttributeDefinitions;
import com.jwebmp.utilities.StaticStrings;

import static com.jwebmp.utilities.StaticStrings.*;

/**
 * The added available angular attributes for the UI Select
 *
 * @author Marc Magon
 * @since 12 Jun 2017
 */
public enum AngularUISelectAttributes
		implements AttributeDefinitions
{
	/**
	 * Closes a multi-select upon selection
	 */
	Close_On_Select,
	/**
	 * Multiple reference, use null as value
	 */
	Multiple,
	/**
	 * Appends the dropdown to the box vs relative
	 */
	Append_To_Body,
	/**
	 * Control is disabled
	 */
	Disabled("ng-disabled"),
	/**
	 * Search is enabled
	 */
	Search_Enabled,
	/**
	 * Clears the search box after selecting an option
	 */
	Reset_Search_Input,
	/**
	 * Style of control, see themes section
	 */
	Theme,
	/**
	 * Enable tagging mode (add new items on the fly). Accepts a string which is a scope function. If your model is an array of objects, this string is required. The function will
	 * be passed the new
	 * item as a string and should return an object which is the transformed value to be pushed to the items array.
	 */
	Tagging,
	/**
	 * Set a label for tags that appear in the dropdown. Expects a string or false. If false, then tagging happens without new items appearing in the dropdown. If empty or
	 * undeclared, tagging-label
	 * defaults to (new)
	 */
	Tagging_Label,
	/**
	 * Specify keyboard keys that will trigger creation of a new tag. Multiple keys can be separated by a pipe `
	 */
	Tagging_Tokens,
	/**
	 * Automatically get focus when loaded.
	 */
	AutoFocus,
	/**
	 * Set to true to skip the focusser after selecting an item.
	 */
	Skip_Focusser,
	/**
	 * Accepts a string which is a scope function. The function will be passed the pasted text as a string.
	 */
	Paste,
	/**
	 * Limits the number of selected items in multiple select mode
	 */
	Limit,
	/**
	 * Sets the spinner enabled when using the refresh function
	 */
	Spinner_Enabled,
	/**
	 * Sets the spinner css class. Default it will have its own style but can be overridden using this.
	 */
	Spinner_Class,
	/**
	 * Sets the input id so it can be labelled
	 */
	Input_Id;
	/**
	 * Any sub data
	 */
	private String data;

	/**
	 * A new AngularUIAttributes
	 */
	AngularUISelectAttributes()
	{

	}

	/**
	 * A new AngularUIAttributes with data
	 */
	AngularUISelectAttributes(String data)
	{
		this.data = data;
	}

	/**
	 * Returns the name or the data contained within
	 *
	 * @return
	 */
	@Override
	public String toString()
	{
		if (data != null && !data.isEmpty())
		{
			return data.replace(StaticStrings.CHAR_UNDERSCORE, CHAR_DASH)
			           .toLowerCase();
		}
		else
		{
			return name().replace(StaticStrings.CHAR_UNDERSCORE, CHAR_DASH)
			             .toLowerCase();
		}
	}

	@Override
	public boolean isKeyword()
	{
		return (this == Multiple || this == Tagging);
	}
}
