package org.hines.james;

import org.hines.james.service.HelloWorldService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleSampleAppApplication implements CommandLineRunner {

    @Autowired
    private HelloWorldService helloWorldService;

    @Override
    public void run(String... args) {
        System.out.println(this.helloWorldService);

        if (args.length > 0 && args[0].equals("exitcode")) {
            throw new ExitException();
        }
    }    

	public static void main(String[] args) {
		SpringApplication.run(SimpleSampleAppApplication.class, args);
	}
}
