package inheritanceannotation;

public class VisitorImpl implements Visitor
{

	@Override
	public void process(Automobile bsf) {
		System.out.println("auto processed...");
		
	}

	@Override
	public void process(Maruti lsf) {
		System.out.println("maruti processed...");
		
	}

	@Override
	public void process(Car sf) {
		System.out.println("car processed...");
		
	}

}
