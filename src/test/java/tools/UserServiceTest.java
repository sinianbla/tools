package tools;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sinianbla.service.UserService;

public class UserServiceTest {
	
	@Test
	public void test_01(){
		ApplicationContext application = new ClassPathXmlApplicationContext("bean.xml");
		UserService userServce = (UserService)application.getBean("userService");
		System.out.println(userServce.getUserInfo(31234134L)); 
	}

}
