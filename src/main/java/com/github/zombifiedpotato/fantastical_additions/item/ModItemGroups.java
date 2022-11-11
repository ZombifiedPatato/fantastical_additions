package com.github.zombifiedpotato.fantastical_additions.item;

import com.github.zombifiedpotato.fantastical_additions.Main;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup PUMPKIN_PATCH = FabricItemGroupBuilder.build(new Identifier(Main.MOD_ID, "pumpkin_patch"),
            () -> new ItemStack(ModItems.FAIRY_POWDER));
}
