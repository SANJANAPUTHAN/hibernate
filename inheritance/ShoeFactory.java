package inheritance;

public class ShoeFactory
{
	public ShoeFactory() {
		// TODO Auto-generated constructor stub
	}
	
	private int sid;
	private String name;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecificName()
	{
		return "";
	}
	@Override
	public String toString() {
		return "ShoeFactory [sid=" + sid + ", name=" + name + "]";
	}
	
	

}
