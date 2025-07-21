package sparkysmagicmod.modid.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import sparkysmagicmod.modid.SparkysMagicMod;

public class ModItems {

    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {

        return Registry.register(Registries.ITEM, Identifier.of(SparkysMagicMod.MOD_ID, name), item);

    }

    public static void registerModItems() {

        SparkysMagicMod.LOGGER.info("Registering Mod Items for " + SparkysMagicMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(MYTHRIL_INGOT);
        });

    }
}
