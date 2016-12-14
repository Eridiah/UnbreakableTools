package net.unbreakabletools.mod;

public class Reference {

	public static final String MOD_ID = "unbreakabletools";
	public static final String VERSION = "Alpha v0.1";
	public static final String NAME = "Unbreakable Tools Mod";
	public static final String ACCEPTED_VERSIONS = "[1.11]";
	
	public static final String CLIENT_PROXY_CLASS = "net.unbreakabletools.mod.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "net.unbreakabletools.mod.proxy.ServerProxy";
	
	public static enum UTItems {
		
		GOD_PICKAXE("godpickaxe", "itemgodpickaxe"),
		TEST_ITEM("testitem", "itemtestitem");
		
		private String unlocalizedName;
		private String registryName;
		
		UTItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
	}
	
}
