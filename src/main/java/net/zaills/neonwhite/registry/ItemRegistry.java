package net.zaills.neonwhite.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.zaills.neonwhite.NeonWhite;
import net.zaills.neonwhite.item.Card.Fist;
import net.zaills.neonwhite.item.Card.Katana;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ItemRegistry {
	public static final Katana KATANA = Registry.register(Registries.ITEM,
		new Identifier(NeonWhite.MODID, "katana"), new Katana(new QuiltItemSettings().maxCount(1)));
	public static final Fist FIST = Registry.register(Registries.ITEM,
		new Identifier(NeonWhite.MODID, "fist"), new Fist(new QuiltItemSettings().maxCount(1)));

	public static final RegistryKey<ItemGroup> NEON_TAB = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(NeonWhite.MODID, "itemgroup"));

	public static void register() {
		Registry.register(Registries.ITEM_GROUP, NEON_TAB,
			FabricItemGroup.builder().name(Text.translatable("itemGroup.neonwhite.item")).icon(() -> new ItemStack(KATANA)).build());
		ItemGroupEvents.modifyEntriesEvent(NEON_TAB).register(content -> {
			content.addItem(KATANA);
			content.addItem(FIST);
		});
	}
}
