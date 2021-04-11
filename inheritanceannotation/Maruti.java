package inheritanceannotation;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="maruti")
public class Maruti extends Car implements Serializable
{
	private String marutifeature;

	public String getMarutifeature() {
		return marutifeature;
	}

	public void setMarutifeature(String marutifeature) {
		this.marutifeature = marutifeature;
	}

	@Override
	public String toString() {
		return "Maruti [marutifeature=" + marutifeature + "]";
	}
	
	public void handle() {
		new VisitorImpl().process(this);
	}
}
