package Hib_mapping_one_to_many_eg;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Class_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		College coll=new College();
		coll.setCol_id(101);
		coll.setCol_name("MNIT");
		coll.setCol_add("Jaipur");
		
		Branch br=new Branch();
		br.setBid(1);
		br.setBname("CS");
		coll.getBranch().add(br);
		br.setCollege(coll);
		
	
		
		
		
    	Configuration con=new Configuration().configure().addAnnotatedClass(College.class).addAnnotatedClass(Branch.class);
    	
    	SessionFactory sf=con.buildSessionFactory();
    	Session session=sf.openSession();
    	session.beginTransaction();
    	
    	session.save(coll);
    	session.save(br);
  
    	session.getTransaction().commit();
	}

}
