package compositeannotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Invoicetable")
public class Invoice
{
	@Id
	private Compkey compkey;
	
	@Column(name="details",nullable=false)
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
