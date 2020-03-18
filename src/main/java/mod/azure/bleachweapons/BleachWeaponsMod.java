package mod.azure.bleachweapons;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mod.azure.bleachweapons.util.LootHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BleachWeaponsMod.MODID)
public class BleachWeaponsMod {

	public static BleachWeaponsMod instance;
	public static final String MODID = "bleachweapons";
	public static final Logger LOGGER = LogManager.getLogger(MODID);

	public BleachWeaponsMod() {
		instance = this;
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		modEventBus.addListener(this::setup);
	}

	private void setup(final FMLCommonSetupEvent event) {
		MinecraftForge.EVENT_BUS.register(new LootHandler());
	}
}