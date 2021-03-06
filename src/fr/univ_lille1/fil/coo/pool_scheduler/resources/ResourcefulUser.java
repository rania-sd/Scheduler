package fr.univ_lille1.fil.coo.pool_scheduler.resources;

/**
 * User who are using the resource
 *
 * @param <R> the type of the resource
 */
public class ResourcefulUser<R extends Resource> {

	protected R resource;
	
	public R getResource() {
		return resource;
	}
	
	public void setResource(R resource) {
		this.resource = resource;
	}
	
	public void resetResource() {
		this.resource = null;
	}
}
