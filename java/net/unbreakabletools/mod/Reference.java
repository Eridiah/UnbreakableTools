package net.unbreakabletools.mod;

public class Reference {

	public static final String MOD_ID = "unbreakabletools";
	public static final String VERSION = "Alpha v0.1";
	public static final String NAME = "Unbreakable Tools Mod";
	public static final String ACCEPTED_VERSIONS = "[1.11]";
	
	public static final String CLIENT_PROXY_CLASS = "net.unbreakabletools.mod.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "net.unbreakabletools.mod.proxy.ServerProxy";
	
	public static enum UTItems {
		//Wood
		GOD_WOODEN_SWORD("godwoodensword", "itemgodwoodensword"),
		GOD_WOODEN_SHOVEL("godwoodenshovel", "itemgodwoodenshovel"),
		GOD_WOODEN_PICKAXE("godwoodenpickaxe", "itemgodwoodenpickaxe"),
		GOD_WOODEN_AXE("godwoodenaxe", "itemgodwoodenaxe"),
		GOD_WOODEN_HOE("godwoodenhoe", "itemgodwoodenhoe"),
		
		//Stone
		GOD_STONE_SWORD("godstonesword", "itemgodstonesword"),
		GOD_STONE_SHOVEL("godstoneshovel", "itemgodstoneshovel"),
		GOD_STONE_PICKAXE("godstonepickaxe", "itemgodstonepickaxe"),
		GOD_STONE_AXE("godstoneaxe", "itemgodstoneaxe"),
		GOD_STONE_HOE("godstonehoe", "itemgodstonehoe");
		
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
