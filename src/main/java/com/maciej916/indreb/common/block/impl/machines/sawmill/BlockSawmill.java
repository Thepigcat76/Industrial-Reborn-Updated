package com.maciej916.indreb.common.block.impl.machines.sawmill;

import com.maciej916.indreb.common.block.BlockElectricMachine;
import com.maciej916.indreb.common.interfaces.block.IHasContainer;
import com.maciej916.indreb.common.interfaces.block.IStateActive;
import com.maciej916.indreb.common.interfaces.block.IStateFacing;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nullable;
import java.util.List;

public class BlockSawmill extends BlockElectricMachine implements IStateFacing, IHasContainer, IStateActive {

    public BlockSawmill() {
        super(0, 0);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new BlockEntitySawmill(pos, state);
    }

    public ContainerSawmill getContainer(int windowId, Level level, BlockPos pos, Inventory playerInventory, Player playerEntity) {
        return new ContainerSawmill(windowId, level, pos, playerInventory, playerEntity);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable BlockGetter pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
//        pTooltip.add(TextComponentUtil.build(
//            new TranslatableComponent(EnumLang.POWER_TIER.getTranslationKey()).withStyle(ChatFormatting.GRAY),
//            new TranslatableComponent(EnumLang.TIER_BASIC.getTranslationKey()).withStyle(ChatFormatting.GREEN)
//        ));
//
//        pTooltip.add(TextComponentUtil.build(
//            new TranslatableComponent(EnumLang.GENERATE.getTranslationKey()).withStyle(ChatFormatting.GRAY),
//            new TranslatableComponent(EnumLang.POWER_TICK.getTranslationKey(), TextComponentUtil.getFormattedEnergyUnit(ModConfig.generator_tick_generate)).withStyle(ChatFormatting.GREEN)
//        ));
//
//        pTooltip.add(TextComponentUtil.build(
//            new TranslatableComponent(EnumLang.OUTPUT.getTranslationKey()).withStyle(ChatFormatting.GRAY),
//            new TranslatableComponent(EnumLang.POWER_TICK.getTranslationKey(), TextComponentUtil.getFormattedEnergyUnit(ModConfig.generator_tick_transfer)).withStyle(ChatFormatting.GREEN),
//            new TextComponent(" "),
//            new TranslatableComponent(EnumLang.CAPACITY.getTranslationKey()).withStyle(ChatFormatting.GRAY),
//            new TranslatableComponent(EnumLang.POWER_TICK.getTranslationKey(), TextComponentUtil.getFormattedEnergyUnit(ModConfig.generator_energy_capacity)).withStyle(ChatFormatting.GREEN)
//        ));
    }
}
