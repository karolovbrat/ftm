package ftm;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HibernateConfig
{
	public static SessionFactory getSessionFactory()
	{
		Configuration configuration = new Configuration().configure();
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
			.applySettings(configuration.getProperties())
			.build();

		return configuration.buildSessionFactory(serviceRegistry);
	}

	private static Properties getHibernateProperties()
	{
		Properties hibernateProperties = new Properties();
//		hibernateProperties.setProperty("connection.driver_class", "com.mysql.jdbc.Driver");
//		hibernateProperties.setProperty("connection.dialect", "com.mysql.jdbc.Driver");
//		hibernateProperties.setProperty("connection.url", "jdbc:mysql://localhost:3306/flight-ticket-monitor");
//		hibernateProperties.setProperty("connection.username", "writer");
//		hibernateProperties.setProperty("connection.password", "writer");
		return hibernateProperties;
	}
}
