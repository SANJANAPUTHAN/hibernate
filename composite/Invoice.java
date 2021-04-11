package composite;

import java.io.Serializable;

public class Invoice implements Serializable
{
	private Compkey compkey;
	private String details;
	public Compkey getCompkey() {
		return compkey;
	}
	public void setCompkey(Compkey compkey) {
		this.compkey = compkey;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
	

}
