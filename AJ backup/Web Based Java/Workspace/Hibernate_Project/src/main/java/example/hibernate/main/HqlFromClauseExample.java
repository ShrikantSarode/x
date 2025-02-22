package example.hibernate.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import example.hibernate.entity.Actor;
import example.hibernate.utils.HibernateConfig;

public class HqlFromClauseExample {

	public static void main(String[] args) {
		try (SessionFactory factory = HibernateConfig.getSessionFactory();
				Session session = factory.openSession();) {
			String hqlQuery = "from Actor act";
			Query<Actor> queryRef = session.createQuery(hqlQuery, Actor.class);
			List<Actor> allActors = queryRef.list();
			for (Actor actor : allActors) {
				System.out.println(actor);
				System.out.println(actor.getFirstName());
				System.out.println(actor.getLastName());
				System.out.println(actor.getAge());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
