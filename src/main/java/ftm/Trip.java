package ftm;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.joda.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Trip
{
	private Long id;

	private String destination;
	private LocalDateTime departureTime;
	private LocalDateTime returnArrivalTime;

	public Trip()
	{
		// For hibernate
	}

	public Trip(
			String destination,
			LocalDateTime departureTime,
			LocalDateTime returnArrivalTime)
	{
		this.destination = destination;
		this.departureTime = departureTime;
		this.returnArrivalTime = returnArrivalTime;
	}

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getDestination()
	{
		return destination;
	}

	public void setDestination(String destination)
	{
		this.destination = destination;
	}

	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDateTime")
	public LocalDateTime getDepartureTime()
	{
		return departureTime;
	}

	public void setDepartureTime(LocalDateTime departureTime)
	{
		this.departureTime = departureTime;
	}

	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDateTime")
	public LocalDateTime getReturnArrivalTime()
	{
		return returnArrivalTime;
	}

	public void setReturnArrivalTime(LocalDateTime returnArrivalTime)
	{
		this.returnArrivalTime = returnArrivalTime;
	}
}
