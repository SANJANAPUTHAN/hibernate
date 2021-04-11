package inheritance;

public class BataShoeFactory extends ShoeFactory
{
	public BataShoeFactory() {
		// TODO Auto-generated constructor stub
	}
	private String bataname;

	public String getBataname() {
		return bataname;
	}

	public void setBataname(String bataname) {
		this.bataname = bataname;
	}

	@Override
	public String getSpecificName() {
		return this.bataname;
	}
	@Override
	public String toString() {
		return "BataShoeFactory [bataname=" + bataname + "]";
	}
	
	

}
