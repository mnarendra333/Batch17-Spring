package pack1;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Traveller {

	public static void main(String[] args) {
		
		
		/*Resource res = new ClassPathResource("applicationContext.xml");
	
		BeanFactory factory = new XmlBeanFactory(res);
		Vehicle obj = (Vehicle)factory.getBean("id1");
		obj.start();
		*/
		ApplicationContext  ctx = null;
		try {
			ctx  = new ClassPathXmlApplicationContext("applicationContext.xml");
			Vehicle v = (Vehicle)ctx.getBean("id1");
			v.start();
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally{
			
		}
	
		
	}

}
