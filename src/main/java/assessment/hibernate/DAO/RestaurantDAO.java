package assessment.hibernate.DAO;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import assessment.model.Bill;
import assessment.model.Customer;

public class RestaurantDAO {
	
//	public String addBill(Movie movie1) throws Exception {

	public void generateBill() {
		//Implement the method
		Configuration cfg = new Configuration().configure(); //Loads hibernate.cfg.xml

		ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();

		Metadata metadata = new MetadataSources(reg).addAnnotatedClass(Bill.class).addAnnotatedClass(Customer.class).getMetadataBuilder()
				.build();
//		SessionFactory factory = cfg.buildSessionFactory(reg);
		
		SessionFactory factory = metadata.getSessionFactoryBuilder().build();
		Bill B1 = new Bill();
//		Scanner sc =new Scanner(System.in);
//		System.out.println("Enter the Bill Id: ");
//		String billId = sc.nextLine();
//		System.out.println("Enter the Bill Currency: ");
//		String billCurrency = sc.nextLine();
//		System.out.println("Enter the Bill Amount: ");
//		Double billAmount = Double.parseDouble(sc.nextLine());
//		
//		
		Customer c1 = new Customer();
//		System.out.println("Enter the customer Id");
//		Integer customerID = Integer.parseInt(sc.nextLine());
//		System.out.println("Enter the customer Name: ");
//		String customerName = sc.nextLine();
//		System.out.println("Enter the city: ");
//		String city = sc.nextLine();
//		System.out.println("Enter the phoneNo: ");
//		Long phoneNo = sc.nextLong();
		
		B1.setBillId("B1001");
		B1.setBillAmount(230.47);
		B1.setBillCurrency("USD");
		
		c1.setBillId("B1001");
		c1.setCity("New York");
		c1.setCustomerID(1);
		c1.setCustomerName("Petter");
		c1.setPhoneNo(9170539167l);
		System.out.println(B1);
		System.out.println(c1);
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(B1);
		session.save(c1);
		session.getTransaction().commit();
		session.close();
	}
	
	
	
}
