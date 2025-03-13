package com.example.batchprocessing;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import java.time.LocalDateTime;

@SpringBootApplication
public class BatchProcessingApplication {

	public static void main(String[] args) {
		int exitCode =  SpringApplication.exit(SpringApplication.run(BatchProcessingApplication.class, args));
		System.out.println("exitCode: " + exitCode);
		System.exit(exitCode);
	}


}
