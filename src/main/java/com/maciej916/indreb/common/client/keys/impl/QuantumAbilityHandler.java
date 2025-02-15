package com.maciej916.indreb.common.client.keys.impl;

import com.maciej916.indreb.common.api.interfaces.item.IArmorProperties;
import com.maciej916.indreb.common.capability.ModCapabilities;
import com.maciej916.indreb.common.capability.player.IPlayerCapability;
import com.maciej916.indreb.common.client.keys.ModKeys;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public class QuantumAbilityHandler {
    public static void toggleQuantumAbility(Player player) {
        if (ModKeys.QUANTUM_ABILITY_KEY.consumeClick()) {
            boolean found = false;
            for (ItemStack stack : player.getArmorSlots()) {
                if (stack.getItem() instanceof IArmorProperties armorProperties) {
                    if (armorProperties.supportsQuantumAbility()) {
                        found = true;
                        break;
                    }
                }
            }

            if (found) {
                player.getCapability(ModCapabilities.PLAYER_CAPABILITY).ifPresent(cap -> toggle(cap, player, !cap.getQuantumAbility()));
            }
        }
    }

    public static void checkQuantumAbility(Player player) {
        player.getCapability(ModCapabilities.PLAYER_CAPABILITY).ifPresent(cap -> {
            boolean found = false;
            for (ItemStack stack : player.getArmorSlots()) {
                if (stack.getItem() instanceof IArmorProperties armorProperties) {
                    if (armorProperties.supportsQuantumAbility()) {
                        found = true;
                        break;
                    }
                }
            }

            if (!found && cap.getQuantumAbility()) {
                toggle(cap, player, false);
            }
        });
    }

    public static void toggle(IPlayerCapability cap, Player player, boolean enable) {
        MobEffectInstance fireResistance = new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1000000, 4, false, false);
        fireResistance.isInfiniteDuration();
        if (enable) {
            player.getAbilities().mayfly = true;
            player.addEffect(fireResistance);
            player.onUpdateAbilities();
        }  else {
            player.getAbilities().mayfly = false;
            player.removeEffect(MobEffects.MOVEMENT_SPEED);
        }

        cap.setQuantumAbility(enable);
    }
}
