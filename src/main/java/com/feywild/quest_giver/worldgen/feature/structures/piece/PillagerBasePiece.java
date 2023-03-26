package com.feywild.quest_giver.worldgen.feature.structures.piece;

import com.mojang.datafixers.util.Either;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.level.levelgen.feature.structures.StructurePoolElementType;
import net.minecraft.world.level.levelgen.feature.structures.StructureTemplatePool;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorList;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import org.jetbrains.annotations.NotNull;

public class PillagerBasePiece extends BaseStructurePiece{

    public static final StructurePoolElementType<PillagerBasePiece> TYPE = type(PillagerBasePiece::new);

    protected PillagerBasePiece(Either<ResourceLocation, StructureTemplate> template, InteractionResultHolder<StructureProcessorList> processors, StructureTemplatePool.Projection projection) {
        super(template, processors, projection);
    }

    @NotNull
    @Override
    public StructurePoolElementType<?> getType() {
        return TYPE;
    }
}
