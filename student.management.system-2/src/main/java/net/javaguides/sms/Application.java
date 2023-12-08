package net.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.sms.entity.Student;
import net.javaguides.sms.repository.StudentRepository;

@SpringBootApplication
public class Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		
		Student st1= new Student("Hasim", "Md", "mdhasi@gmail.com");
		studentRepository.save(st1);
		
		Student st2= new Student("Nasim", "Md", "nasim@gmail.com");
		studentRepository.save(st2);
		
	}
	
	

}
