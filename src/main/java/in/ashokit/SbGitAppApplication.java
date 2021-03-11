package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SbGitAppApplication {
   private static final String Rest_ url="https://www.equifax.com";
	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SbGitAppApplication.class, args);
		//HIS 134 changes
		run.close();
              int a =12;
	}

}
