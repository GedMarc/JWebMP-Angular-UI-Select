/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mmagon.jwebswing.plugins.angularuiselect;

/**
 * @author Marc Magon
 * @since 12 Jun 2017
 */
public enum AngularUISelectTheme
{
	Bootstrap,
	Select2,
	Selectize;
	/**
	 * Any sub data
	 */
	private String data;
	
	/**
	 * A new AngularUISelectTheme
	 */
	private AngularUISelectTheme()
	{
	
	}
	
	/**
	 * A new AngularUISelectTheme with data
	 */
	private AngularUISelectTheme(String data)
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
			return data.toLowerCase();
		}
		else
		{
			return name().toLowerCase();
		}
	}
}
