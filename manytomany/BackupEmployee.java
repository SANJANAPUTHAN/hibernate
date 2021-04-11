package manytomany;

public class BackupEmployee 
{
	public BackupEmployee() {
		// TODO Auto-generated constructor stub
	}
	private int eid;
	private String ename;
	private int emarks;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEmarks() {
		return emarks;
	}
	public void setEmarks(int emarks) {
		this.emarks = emarks;
	}
	public BackupEmployee(int eid, String ename, int emarks) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.emarks = emarks;
	}
	
	
}
