package flamepoint1544.arcanum_aeternitas;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item TEST_ITEM = register(new Item(new Item.Settings()), "test_item");

    public static Item register(Item item, String id){
        // Create Identifier
        Identifier itemID = Identifier.of(ArcanumAeternitas.MOD_ID, id);

        // Register the item
        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);

        // Return
        return registeredItem;
    }

    public static void initialize(){

    }
}
