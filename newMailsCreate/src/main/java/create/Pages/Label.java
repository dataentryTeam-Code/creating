package create.Pages;

public class Label extends AutomationElement
{
	protected Label()
	{
		
	}
	public Label(String locator,String descriptionOfElement)
	{
		super(locator,descriptionOfElement);
	}
	public Label(String locator,String logName,String placeHolder)
	{
		super(locator,logName,placeHolder);
	}
	public Label newDynamicObject(String logName,String... replacementString)
	{
		return (Label) super.newDynamicObject(logName,replacementString);
	}
}
