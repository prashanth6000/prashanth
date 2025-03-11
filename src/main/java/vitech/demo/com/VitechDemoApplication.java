package vitech.demo.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import vitech.demo.com.controler.Classemp;

@SpringBootApplication
public class VitechDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run2 = SpringApplication.run(VitechDemoApplication.class, args);
		Classemp bean = run2.getBean(Classemp.class);
		bean.printValues();
	}

}
