package vitech.demo.com.controler;

import org.springframework.beans.factory.annotation.Value;

public class Classemp {
 @Value("&{vitech.emp.firstname}")
 private String firstname;
 @Value("&{vitech.emp.lastname}")
 private String lastname;
 @Value("${config.a}")
 private int a;
 @Value("${config.b")
 private int b;
 
 
 public void printValues() {
	 System.out.println("fname ="+ firstname);
	 System.out.println("lname ="+ lastname);
	 System.out.println("x = "+ a);
	 System.out.println("y = "+ b);
	 System.out.println("x+y = "+(a+b));
	 
 }
 
}
 
 