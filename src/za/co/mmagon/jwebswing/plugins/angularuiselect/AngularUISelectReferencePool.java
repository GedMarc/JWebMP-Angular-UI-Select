package za.co.mmagon.jwebswing.plugins.angularuiselect;

import za.co.mmagon.jwebswing.base.references.CSSReference;
import za.co.mmagon.jwebswing.base.references.JavascriptReference;
import za.co.mmagon.jwebswing.base.servlets.enumarations.RequirementsPriority;
import za.co.mmagon.jwebswing.base.servlets.interfaces.ReferencePool;

/**
 * References for angular
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
enum AngularUISelectReferencePool implements ReferencePool
{
    AngularUISelect(new JavascriptReference("AngularUISelect", 1.6, "bower_components/angular-ui-select/dist/select.js"),
            new CSSReference("AngularUISelect", 1.6, "bower_components/angular-ui-select/dist/select.css"));
    /**
     * Any sub data
     */
    private String data;

    /**
     * A new AngularSlimScrollReferencePool
     */
    private AngularUISelectReferencePool()
    {

    }

    /**
     * A new AngularSlimScrollReferencePool with data
     */
    private AngularUISelectReferencePool(String data)
    {

    }

    private JavascriptReference javaScriptReference;
    private CSSReference cssReference;

    private AngularUISelectReferencePool(JavascriptReference javaScriptReference, CSSReference cssReference)
    {
        this.javaScriptReference = javaScriptReference;
        if (this.javaScriptReference != null)
        {
            this.javaScriptReference.setPriority(RequirementsPriority.DontCare);
        }
        this.cssReference = cssReference;
        if (this.cssReference != null)
        {
            this.cssReference.setPriority(RequirementsPriority.DontCare);
        }
    }

    @Override
    public JavascriptReference getJavaScriptReference()
    {
        return javaScriptReference;
    }

    @Override
    public void setJavaScriptReference(JavascriptReference javaScriptReference)
    {
        this.javaScriptReference = javaScriptReference;
    }

    @Override
    public CSSReference getCssReference()
    {
        return cssReference;
    }

    @Override
    public void setCssReference(CSSReference cssReference)
    {
        this.cssReference = cssReference;
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
            return data;
        }
        else
        {
            return name();
        }
    }
}
