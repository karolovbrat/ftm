package ftm;

import org.joda.time.LocalDateTime;

public class Main
{
	public static void main(String[] args)
	{
		TripDao tripDao = new TripDao(HibernateConfig.getSessionFactory());
		tripDao.persist(new Trip(
				"berlin", LocalDateTime.now().plusDays(1), LocalDateTime.now().plusDays(2)));
		System.out.println(tripDao.findAll().get(0).getDepartureTime());
	}
}
