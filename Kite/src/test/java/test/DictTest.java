package test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.MzywZdDao;
import com.po.MzywZd;

public class DictTest {

	@Test
	public void test() {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		MzywZdDao mzywZdDao=applicationContext.getBean(MzywZdDao.class);
		List<MzywZd> list = mzywZdDao.queryDicList();
		System.out.println(list.get(2).getDm());
	}

}
