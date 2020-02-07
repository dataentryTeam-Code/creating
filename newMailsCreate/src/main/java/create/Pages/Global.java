package create.Pages;

public class Global
{
	public Global clickAccessAuthrizaion()
	{
		try
		{
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return this;		
	}
	public String PasswordGenerator()
	{
		//declare characters to be used
		final int  maxLength=12;
		final String digits="0123456789";
		final String lcaseChar="abcdefghijklmnopqrstuvwxyz";
		final String ucaseChar="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		final String characterSet=digits+lcaseChar+ucaseChar;
		final char[] ucaseArray=ucaseChar.toCharArray();
		final char[] lcaseArray=lcaseChar.toCharArray();
		final char[] digitsArray=digits.toCharArray();
		final char[] characterSetArray=characterSet.toCharArray();
		java.util.Random r=new java.util.Random();
		StringBuilder password=new StringBuilder();
		password.append(lcaseArray[r.nextInt(lcaseArray.length)]);
		password.append(digitsArray[r.nextInt(digitsArray.length)]);
		password.append(ucaseArray[r.nextInt(ucaseArray.length)]);
		for(int i=0;i<maxLength-3;i++)
		{
			password.append(characterSetArray[r.nextInt(characterSetArray.length)]);
		}
		return password.toString();		
	}
	public String stringGenerator(int maxLength )
	{
		//declare characters to be used
		final String lcaseChar="abcdefghijklmnopqrstuvwxyz";
		final String ucaseChar="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		final String characterSet=lcaseChar+ucaseChar;
		final char[] ucaseArray=ucaseChar.toCharArray();
		final char[] lcaseArray=lcaseChar.toCharArray();
		final char[] characterSetArray=characterSet.toCharArray();
		java.util.Random r=new java.util.Random();
		StringBuilder user=new StringBuilder();
		user.append(lcaseArray[r.nextInt(lcaseArray.length)]);
		user.append(ucaseArray[r.nextInt(ucaseArray.length)]);
		for(int i=0;i<maxLength-2;i++)
		{
			user.append(characterSetArray[r.nextInt(characterSetArray.length)]);
		}
		return user.toString();	
	}	
	
}
