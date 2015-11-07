package fr.univ_lille1.fil.coo.pool_scheduler.resources;

/**
 * Class managing basket ressources
 *
 */
public class BasketPool extends ResourcePool<Basket> {

	public BasketPool(int capacity) {
		super(capacity);
	}
	
	@Override
	public String toString() {
		return super.toString() + " basket";
	}
}
