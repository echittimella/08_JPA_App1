package in.chittimella;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.chittimella.entities.ContactsMasterEntity;
import in.chittimella.repositories.ContactsMasterRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		ContactsMasterRepo bean = context.getBean(ContactsMasterRepo.class);
		
		
		ContactsMasterEntity entity = new ContactsMasterEntity();
		entity.setContactId(2);
		entity.setContactName("Ashok");
		entity.setContactNumber(1234567890);
		bean.save(entity);
		
		context.close();
		
	}

}
