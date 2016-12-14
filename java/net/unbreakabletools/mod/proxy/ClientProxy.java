package net.unbreakabletools.mod.proxy;

import net.unbreakabletools.mod.init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
	}
	
}
