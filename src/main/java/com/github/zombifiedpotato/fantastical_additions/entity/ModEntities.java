package com.github.zombifiedpotato.fantastical_additions.entity;

import com.github.zombifiedpotato.fantastical_additions.Main;
import com.github.zombifiedpotato.fantastical_additions.entity.custom.DwarvenDynamiteEntity;
import com.github.zombifiedpotato.fantastical_additions.entity.custom.FairyPowderEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {

    public static final EntityType<FairyPowderEntity> FAIRY_POWDER= Registry.register(
            Registry.ENTITY_TYPE, new Identifier(Main.MOD_ID, "fairy_powder"),
            FabricEntityTypeBuilder.<FairyPowderEntity>create(SpawnGroup.MISC, FairyPowderEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25f, 0.25f))
                    .build()
    );

    public static final EntityType<DwarvenDynamiteEntity> DWARVEN_DYNAMITE = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(Main.MOD_ID, "dwarven_dynamite"),
            FabricEntityTypeBuilder.<DwarvenDynamiteEntity>create(SpawnGroup.MISC, DwarvenDynamiteEntity::new)
                    .dimensions(EntityDimensions.fixed(0.98f, 0.98f))
                    .build()
    );


    public static void registerModEntities() {
        System.out.println("Registering Mod Entities for " + Main.MOD_ID);
    }

}
