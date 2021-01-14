package model;

public class LoginUtility 
{
	public boolean validate(Login l)
	{
		if(l.getUsername().equals("Tushar") && l.getPassword().equals("admin"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	
}
