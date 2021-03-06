package inheritanceannotation;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="automobile")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="disc")
@DiscriminatorValue(value="auto")
public class Automobile implements Serializable
{
	@Id
	public int id;
	
	@Column(name="autofeature")
	public String autofeature;
	
	public Automobile() {
		id=(int)System.nanoTime();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAutofeature() {
		return autofeature;
	}

	public void setAutofeature(String autofeature) {
		this.autofeature = autofeature;
	}

	@Override
	public String toString() {
		return "Automobile [id=" + id + ", autofeature=" + autofeature + "]";
	}
	
	public void handle() {
		new VisitorImpl().process(this);
	}
}
