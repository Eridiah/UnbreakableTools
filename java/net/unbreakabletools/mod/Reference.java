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
		GOD_STONE_HOE("godstonehoe", "itemgodstonehoe"),
		
		//Iron
		GOD_IRON_SWORD("godironsword", "itemgodironsword"),
		GOD_IRON_SHOVEL("godironshovel", "itemgodironshovel"),
		GOD_IRON_PICKAXE("godironpickaxe", "itemgodironpickaxe"),
		GOD_IRON_AXE("godironaxe", "itemgodironaxe"),
		GOD_IRON_HOE("godironhoe", "itemgodironhoe"),
		
		//Diamond
		GOD_DIAMOND_SWORD("goddiamondsword", "itemgoddiamondsword"),
		GOD_DIAMOND_SHOVEL("goddiamondshovel", "itemgoddiamondshovel"),
		GOD_DIAMOND_PICKAXE("goddiamondpickaxe", "itemgoddiamondpickaxe"),
		GOD_DIAMOND_AXE("goddiamondaxe", "itemgoddiamondaxe"),
		GOD_DIAMOND_HOE("goddiamondhoe", "itemgoddiamondhoe"),
		
		//Gold
		GOD_GOLD_SWORD("godgoldsword", "itemgodgoldsword"),
		GOD_GOLD_SHOVEL("godgoldshovel", "itemgodgoldshovel"),
		GOD_GOLD_PICKAXE("godgoldpickaxe", "itemgodgoldpickaxe"),
		GOD_GOLD_AXE("godgoldaxe", "itemgodgoldaxe"),
		GOD_GOLD_HOE("godgoldhoe", "itemgodgoldhoe");
		
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
