package net.javaguides.springboot;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.springboot.entity.Gender;
import net.javaguides.springboot.entity.User;
import net.javaguides.springboot.entity.UserProfile;
import net.javaguides.springboot.repositry.UserRepository;

@SpringBootApplication
public class SpringbootHibernateOneOneMappingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHibernateOneOneMappingApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		// user object
		User user  = new User();
		     user.setName("Shamim");
		     user.setEmail("shamim@gmail.com");
		     
		UserProfile userProfile = new UserProfile();
		userProfile.setAddress("Delhi");
		userProfile.setBirthOfDate(LocalDate.of(1997, 8, 5));
		userProfile.setGender(Gender.MALE);
		userProfile.setPhoneNumber("9955669712");
		
		user.setUserProfile(userProfile);
		userProfile.setUser(user);
		
		userRepository.save(user);
	}

}
