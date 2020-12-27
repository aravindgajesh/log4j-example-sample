package com.demo.loggerCheck;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggerCheckApplication {
	 private static final Logger LOGGER = LogManager.getLogger(LoggerCheckApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(LoggerCheckApplication.class, args);
		
		LOGGER.info("AAA Info level log message");
        LOGGER.debug("BBB Debug level log message");
        LOGGER.error("CCCC Error level log message");
        LOGGER.info("AAA Info level log message");
        LOGGER.debug("BBB Debug level log message");
        LOGGER.error("CCCC Error level log message");
        LOGGER.info("AAA Info level log message");
        LOGGER.debug("BBB Debug level log message");
        LOGGER.error("CCCC Error level log message");
        LOGGER.info("AAA Info level log message");
        LOGGER.debug("BBB Debug level log message");
        LOGGER.error("CCCC Error level log message");
        LOGGER.info("AAA Info level log message");
        LOGGER.debug("BBB Debug level log message");
        LOGGER.error("CCCC Error level log message");
        LOGGER.info("AAA Info level log message");
        LOGGER.debug("BBB Debug level log message");
        LOGGER.error("CCCC Error level log message");
        LOGGER.info("AAA Info level log message");
        LOGGER.debug("BBB Debug level log message");
        LOGGER.error("CCCC Error level log message");
        LOGGER.info("AAA Info level log message");
        LOGGER.debug("BBB Debug level log message");
        LOGGER.error("CCCC Error level log message");
        LOGGER.info("AAA Info level log message");
        LOGGER.debug("BBB Debug level log message");
        LOGGER.error("CCCC Error level log message");
        LOGGER.info("AAA Info level log message");
        LOGGER.debug("BBB Debug level log message");
        LOGGER.error("CCCC Error level log message");
        LOGGER.info("AAA Info level log message");
        LOGGER.debug("BBB Debug level log message");
        LOGGER.error("CCCC Error level log message");
        LOGGER.info("AAA Info level log message");
        LOGGER.debug("BBB Debug level log message");
        LOGGER.error("CCCC Error level log message");
	}

	
}
