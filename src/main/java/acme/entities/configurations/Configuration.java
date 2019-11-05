
package acme.entities.configurations;

import java.util.Collection;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;

import org.hibernate.validator.constraints.Range;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Configuration extends DomainEntity {

	//Serialisation identifier -------------------------------------------

	private static final long	serialVersionUID	= 1L;

	//Attributes----------------------------------------------------------

	@ElementCollection
	private Collection<String>	spamwords;

	@Range(min = 0, max = 1)
	private Double				spamThreshold;

}
