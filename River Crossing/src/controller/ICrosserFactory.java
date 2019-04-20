package controller;
import Objects.*;
public class ICrosserFactory {
	public ICrosser getCrosser(String type)
	{
	  if(type.equalsIgnoreCase("farmer"))
			return new Farmer();
		else if(type.equalsIgnoreCase("wolf"))
			return new Wolf();
		else if(type.equalsIgnoreCase("goat"))
			return new Goat();
		else if(type.equalsIgnoreCase("plant"))
			return new Plant();
		else return null;
	
		}

}
