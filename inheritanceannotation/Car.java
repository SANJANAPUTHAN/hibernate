package inheritanceannotation;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="car")
public class Car extends Automobile implements Serializable
{
	private String carfeatures;

	public String getCarfeatures() {
		return carfeatures;
	}

	public void setCarfeatures(String carfeatures) {
		this.carfeatures = carfeatures;
	}

	@Override
	public String toString() {
		return "Car [carfeatures=" + carfeatures + "]";
	}
	public void handle() {
		new VisitorImpl().process(this);
	}
	
	
}
