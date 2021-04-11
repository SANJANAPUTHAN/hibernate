package inheritance;

public class LakhaniShoeFactory extends ShoeFactory
{
	public LakhaniShoeFactory() {
		// TODO Auto-generated constructor stub
	}
	private String lakhaniname;

	public String getLakhaniname() {
		return lakhaniname;
	}

	public void setLakhaniname(String lakhaniname) {
		this.lakhaniname = lakhaniname;
	}

	@Override
	public String getSpecificName() {
		return this.lakhaniname;
	}
	@Override
	public String toString() {
		return "LakhaniShoeFactory [lakhaniname=" + lakhaniname + "]";
	}
	
	

}
