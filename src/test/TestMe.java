package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tevop.Hello;

public class TestMe {

	@Test
	public void test() {
		@SuppressWarnings("resource")
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("bean.xml");
		Hello hello = (Hello)context.getBean("hello");
		hello.hi();
	}

}
