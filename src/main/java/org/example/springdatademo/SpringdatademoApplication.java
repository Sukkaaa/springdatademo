package org.example.springdatademo;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.example.springdatademo.dao.entities.Product;
import org.example.springdatademo.dao.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringdatademoApplication implements CommandLineRunner {
	@Autowired
	private ProductRepository productRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringdatademoApplication.class, args);
	}

	@Override
	public void run(String... args) {
		Product product_1=new Product();
		product_1.setName("Shampoo");
		product_1.setDescription("Cleans your hair");
		product_1.setPrice(30);
		Product product_2= new Product();
		product_2.setName("Conditionner");
		product_2.setDescription("Smoothens hair");
		product_2.setPrice(40);

		productRepository.save(product_1);

		List<Product> products = productRepository.findAll();
		products.forEach(productFromList ->{
			System.out.println(productFromList.toString());
		});
		//the product we will be updating
		Product productUpdate = new Product();
		productUpdate.setName("HairMask");
		productUpdate.setDescription("Nourishes hair");
		productUpdate.setPrice(50);
		productRepository.save(productUpdate);
		//the update
		Product productUpdatedById = productRepository.findById(1L).get();
		System.out.println(productUpdatedById);

		productUpdate.setPrice(120);
		productRepository.save(productUpdate);

		productUpdatedById = productRepository.findById(1L).get();
		System.out.println(productUpdatedById);

		//the deletion

		Product productDelete = new Product();
		productDelete.setName("Shirt");
		productDelete.setDescription("Wearable");
		productDelete.setPrice(190);
		productRepository.save(productDelete);

		System.out.println(productRepository.findById(2L).get());
		productRepository.delete(productDelete);
		try{
			System.out.println(productRepository.findById(2L).get());
		}catch (Exception exception){
			System.out.println("The product has been deleted !");
		}

		Product productDeleteById = new Product();
		productDelete.setName("Shirt");
		productDelete.setDescription("Wearable");
		productDelete.setPrice(190);
		productRepository.save(productDeleteById);

		productRepository.save(productDeleteById);
		System.out.println();
		try {
			System.out.println(productRepository.findById(3L).get());
		} catch (Exception exception) {
			System.out.println("The product has been deleted");
		}

		//Find by X
		System.out.println(productRepository.findByPrice(50));
		System.out.println(productRepository.deleteByPrice(50));
	}
}