package hibernate;

import java.io.Serializable;

public class Comment implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public Comment() {
	}

	public Comment(String message) {
		this.message = message;
	}
	
	
	

}
