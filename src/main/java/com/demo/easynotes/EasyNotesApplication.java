package com.demo.easynotes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.demo.easynotes.config.AppProperties;

@SpringBootApplication
@EnableJpaAuditing
@EnableConfigurationProperties(AppProperties.class)
public class EasyNotesApplication implements ApplicationRunner {
	
	private static final Logger logger = LogManager.getLogger(EasyNotesApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(EasyNotesApplication.class, args);
	}
	
	@Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        //logger.debug("Debugging log");
        logger.info("Application Started !!!");
        /*logger.warn("Hey, This is a warning!");
        logger.error("Oops! We have an Error. OK");
        logger.fatal("Damn! Fatal error. Please fix me.");*/
    }
}
