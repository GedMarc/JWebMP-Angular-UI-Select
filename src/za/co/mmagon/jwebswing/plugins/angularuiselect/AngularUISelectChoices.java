package za.co.mmagon.jwebswing.plugins.angularuiselect;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.plugins.angularuiselect.interfaces.AngularUISelectChildren;

/**
 * A default select matcher with a set placeholder
 * <p>
 *
 *
 * @author Marc Magon
 * @since 12 Jun 2017
 */
public class AngularUISelectChoices extends Div implements AngularUISelectChildren
{

    private static final long serialVersionUID = 1L;

    /*
     * Constructs a new AngularUISelectMatch
     */
    public AngularUISelectChoices(String repeatString, String componentDisplayString)
    {
        setTag("ui-select-choices");
        addAttribute("repeat", repeatString);
        setText(componentDisplayString);
    }
}
