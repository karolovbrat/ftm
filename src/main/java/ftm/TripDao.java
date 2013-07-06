package ftm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class TripDao
{

	private final SessionFactory sessionFactory;

	public TripDao(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}

	public void persist(Trip trip)
	{
		Session session = sessionFactory.openSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();

		session.persist(trip);

		transaction.commit();
		session.close();
	}

	public List<Trip> findAll()
	{
		Session session = sessionFactory.openSession();
		List allTrips = session.createCriteria(Trip.class).list();
		session.close();
		return allTrips;
	}
}
