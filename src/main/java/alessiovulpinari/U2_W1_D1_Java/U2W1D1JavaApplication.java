package alessiovulpinari.U2_W1_D1_Java;

import alessiovulpinari.U2_W1_D1_Java.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U2W1D1JavaApplication {

	public static void main(String[] args) {

		SpringApplication.run(U2W1D1JavaApplication.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(U2W1D1JavaApplication.class);

		Menu menu = context.getBean(Menu.class);
		System.out.println(menu);
	}

}
