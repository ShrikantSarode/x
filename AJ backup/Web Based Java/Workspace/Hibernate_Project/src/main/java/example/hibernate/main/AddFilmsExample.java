package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.entity.Film;
import example.hibernate.utils.HibernateConfig;

public class AddFilmsExample {

	public static void main(String[] args) {
		try (SessionFactory factory = HibernateConfig.getSessionFactory();
				Session session = factory.openSession();) {
			Film f1 = new Film();
			f1.setFilmId("F01");
			f1.setTitle("Bombay Velvet");

			Film f2 = new Film();
			f2.setFilmId("F02");
			f2.setTitle("PK");

			Transaction tx = session.beginTransaction();
			session.persist(f1);
			session.persist(f2);
			tx.commit();
			System.out.println("Films added...");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
