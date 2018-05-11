package hibernateTest;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.kite.po.MzywZjcl;
import com.kite.util.HibernateUtil;


public class HibernateTest {

	@Test
	public void test() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		System.out.println(session);
		Transaction transaction = session.beginTransaction();
		MzywZjcl m=new MzywZjcl();
		m.setXm("zhang");
		session.save(m);
		transaction.commit();
	}
}
