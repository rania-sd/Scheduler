package fr.univ_lille1.fil.coo.pool_scheduler.resources;

/**
 * Class representing a Cubicle
 *
 */
public class Cubicle implements Resource {
	
	protected String description;
	
	public Cubicle(String description) {
		this.description = description;
	}

	@Override
	public String description() {
		return description;
	}

}
