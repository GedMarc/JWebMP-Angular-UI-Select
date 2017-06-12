package za.co.mmagon.jwebswing.plugins.angularuiselect;

import za.co.mmagon.jwebswing.base.html.interfaces.AttributeDefinitions;

/**
 * The added available angular attributes for the UI Select
 *
 * @author Marc Magon
 * @since 12 Jun 2017
 */
public enum AngularUISelectAttributes implements AttributeDefinitions
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
     * Enable tagging mode (add new items on the fly). Accepts a string which is a scope function. If your model is an array of objects, this string is required. The function will be passed the new
     * item as a string and should return an object which is the transformed value to be pushed to the items array.
     */
    Tagging,
    /**
     * Set a label for tags that appear in the dropdown. Expects a string or false. If false, then tagging happens without new items appearing in the dropdown. If empty or undeclared, tagging-label
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
    private AngularUISelectAttributes()
    {

    }

    /**
     * A new AngularUIAttributes with data
     */
    private AngularUISelectAttributes(String data)
    {

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
            return data.replace('_', '-').toLowerCase();
        }
        else
        {
            return name().replace('_', '-').toLowerCase();
        }
    }

    @Override
    public boolean isKeyword()
    {
        if (this == Multiple || this == Tagging)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
