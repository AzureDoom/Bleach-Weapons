package mod.azure.bleachweapons.util;

import mod.azure.bleachweapons.BleachWeaponsMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class BleachItems {
	public static Item Zangetsu;

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents {
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {
			event.getRegistry().registerAll(
					Zangetsu = new SwordItem(ItemTier.DIAMOND, 0, 6.0f,
							new Item.Properties().group(BleachTabs.BleachItemsGroup))
									.setRegistryName(location("zangetsu")),
					new SwordItem(ItemTier.DIAMOND, 0, 6.0f, new Item.Properties().group(BleachTabs.BleachItemsGroup))
							.setRegistryName(location("bankaizangetsu")),
					new SwordItem(ItemTier.DIAMOND, 0, 6.0f, new Item.Properties().group(BleachTabs.BleachItemsGroup))
							.setRegistryName(location("hollowbankaizangetsu")),
					new SwordItem(ItemTier.DIAMOND, 0, 6.0f, new Item.Properties().group(BleachTabs.BleachItemsGroup))
							.setRegistryName(location("hollowzangetsu")),
					new SwordItem(ItemTier.DIAMOND, 0, 6.0f, new Item.Properties().group(BleachTabs.BleachItemsGroup))
							.setRegistryName(location("asauchi")),
					new SwordItem(ItemTier.DIAMOND, 0, 6.0f, new Item.Properties().group(BleachTabs.BleachItemsGroup))
							.setRegistryName(location("hollowasauchi")));
		}

		public static ResourceLocation location(String name) {
			return new ResourceLocation(BleachWeaponsMod.MODID, name);
		}
	}
}