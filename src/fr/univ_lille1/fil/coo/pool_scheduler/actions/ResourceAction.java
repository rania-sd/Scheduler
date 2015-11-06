package fr.univ_lille1.fil.coo.pool_scheduler.actions;

import fr.univ_lille1.fil.coo.pool_scheduler.resources.Resource;
import fr.univ_lille1.fil.coo.pool_scheduler.resources.ResourcePool;
import fr.univ_lille1.fil.coo.pool_scheduler.resources.ResourcefulUser;

public abstract class ResourceAction<R extends Resource> extends Action {

	protected ResourcefulUser<R> resourcefulUser;
	protected ResourcePool<R> resourcePool;

	public ResourceAction(ResourcefulUser<R> resourcefulUser, ResourcePool<R> resourcePool) {
		this.resourcefulUser = resourcefulUser;
		this.resourcePool = resourcePool;
	}
	
}
