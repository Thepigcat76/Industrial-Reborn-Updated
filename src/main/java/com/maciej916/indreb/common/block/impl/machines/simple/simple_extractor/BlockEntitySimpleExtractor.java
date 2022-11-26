package com.maciej916.indreb.common.block.impl.machines.simple.simple_extractor;

import com.maciej916.indreb.common.block.impl.machines.simple.simple_crusher.MenuSimpleCrusher;
import com.maciej916.indreb.common.blockentity.ModBlockEntities;
import com.maciej916.indreb.common.blockentity.SimpleMachineBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class BlockEntitySimpleExtractor extends SimpleMachineBlockEntity {

    public BlockEntitySimpleExtractor(BlockPos pos, BlockState blockState) {
        super(ModBlockEntities.SIMPLE_EXTRACTOR.get(), pos, blockState);
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int containerId, Inventory playerInventory, Player player) {
        return new MenuSimpleExtractor(this, containerId, playerInventory, player, data);
    }


//    @Override
//    protected Optional<CrushingRecipe> getRecipe(ItemStack input) {
//        return level.getRecipeManager().getRecipeFor(ModRecipeType.CRUSHING.get(), new SimpleContainer(input), level);
//    }

}
