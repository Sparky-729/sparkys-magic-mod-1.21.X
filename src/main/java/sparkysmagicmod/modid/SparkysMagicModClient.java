package sparkysmagicmod.modid;

import net.fabricmc.api.ClientModInitializer;
import sparkysmagicmod.modid.item.ModItems;

//this starts minecraft
public class SparkysMagicModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ModItems.registerModItems();
    }

}
