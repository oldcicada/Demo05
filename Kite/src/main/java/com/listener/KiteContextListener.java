package com.listener;

import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.utils.DictUtil;


public class KiteContextListener implements ServletContextListener {
	protected Logger Log = Logger.getLogger(getClass());

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		DictUtil dictUtil=applicationContext.getBean(DictUtil.class);
		
		Timer t = new Timer();
		// 执行定时任务：定时任务、延迟时间、间隔时间，单位毫秒
		t.schedule(new TimerTask() {
			@Override
			public void run() {
				dictUtil.load();
				Log.debug("加载字典数据....");
			}
		}, 0, 60 * 1000);

	}

}
