package create.Pages;

public class Global extends Librearies
{
	public Global clickAccessAuthrizaion()
	{
		try
		{
			String url=getTestUrl();
			setCurrentUrl(url);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return this;		
	}
	
}
