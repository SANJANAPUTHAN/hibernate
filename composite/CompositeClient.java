package composite;

import org.hibernate.Session;

import utility.HibernateUtility;

public class CompositeClient
{
	public static void main(String[] args) 
	{
		
		Compkey compkey=new Compkey();
		compkey.setInv_id(101);
		compkey.setItem_id(1);
		
		Invoice invoice=new Invoice();
		invoice.setCompkey(compkey);
		invoice.setDetails("complan");
		
		Session session=HibernateUtility.getSession();
		
		session.save(invoice);
		//session.save(compkey);
		
		HibernateUtility.closeSession(null);
		
	}

}
