package com.Revature.Project2;
import com.Revature.Project2.services.GetMovies;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = {"com.Revature.Project2.beans", "com.Revature.Project2.services"})
@EntityScan("com.Revature.Project2.beans.pojos")
public class CineFile {
	private static final Logger logger = LoggerFactory.getLogger(CineFile.class);

	private static com.Revature.Project2.repos.MovieRepo MovieRepo;

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CineFile.class, args);

		GetMovies get = context.getBean(GetMovies.class);
		get.populateMovieTable();
	}

}
