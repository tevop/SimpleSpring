package test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tevop.Hello;

public class TestMe {

	@Test
	public void test() {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		Hello hello = (Hello)context.getBean("hello");
		hello.hi();
		context.close();
	}

}
