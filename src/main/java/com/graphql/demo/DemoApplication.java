package com.graphql.demo;

import com.graphql.demo.model.Book;
import com.graphql.demo.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class DemoApplication implements CommandLineRunner {


	@Autowired
	private BookRepo bookRepo;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book b1 = new Book();
		b1.setAuthor("Bhagat Singh");
		b1.setTitle("Atheist");
		b1.setDescription("whyb iam Atheist");
		b1.setPrice(200.0);

		Book b2 = new Book();
		b2.setAuthor("Sachin");
		b2.setTitle("Sachin Biography");
		b2.setDescription("Cricket God");
		b2.setPrice(549.0);

		Book b3 = new Book();
		b3.setAuthor("J.K Rowling");
		b3.setTitle("Harry Potter");
		b3.setDescription("Magical journey");
		b3.setPrice(699.0);

		Book b4 = new Book();
		b4.setAuthor("Alan Hollinghurst");
		b4.setTitle("The Line of Beauty");
		b4.setDescription("This Booker Prize-winning novel bottles the essence of the 1980s, as the story follows a quest for beauty against a backdrop of politics, greed and friendships turned toxic.");
		b4.setPrice(799.0);

		Book b5 = new Book();
		b5.setAuthor("Hanya Yanagihara");
		b5.setTitle("A Little Life");
		b5.setDescription("Hanya Yanagihara’s immensely powerful story of brotherly love and the limits of human endurance has had a visceral impact on many a reader");
		b5.setPrice(799.0);

		this.bookRepo.save(b1);
		this.bookRepo.save(b2);
		this.bookRepo.save(b3);
		this.bookRepo.save(b4);
		this.bookRepo.save(b5);

	}
}
