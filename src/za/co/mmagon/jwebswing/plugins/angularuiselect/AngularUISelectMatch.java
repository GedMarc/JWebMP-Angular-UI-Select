package za.co.mmagon.jwebswing.plugins.angularuiselect;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.attributes.InputTextAttributes;
import za.co.mmagon.jwebswing.plugins.angularuiselect.interfaces.AngularUISelectChildren;

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
 * @author Marc Magon
 * @since 12 Jun 2017
 */
public class AngularUISelectMatch extends Div implements AngularUISelectChildren
{
	
	private static final long serialVersionUID = 1L;
	
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
