package com.maciej916.indreb.common.network.packet;

import com.maciej916.indreb.common.block.impl.machine.t_basic.metal_former.BlockEntityMetalFormer;
import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class PacketMetalFormerMode {

    private final BlockPos blockPos;

    public PacketMetalFormerMode(BlockPos blockPos) {
        this.blockPos = blockPos;
    }

    public PacketMetalFormerMode(FriendlyByteBuf buf) {
        blockPos = buf.readBlockPos();
    }

    public void toBytes(FriendlyByteBuf buf) {
        buf.writeBlockPos(blockPos);
    }

    public void handle(Supplier<NetworkEvent.Context> ctx) {
        ctx.get().enqueueWork(() -> {
            ServerPlayer player = ctx.get().getSender();
            assert player != null;
            if (player.level().getBlockEntity(blockPos) instanceof BlockEntityMetalFormer be) {
                be.updateModeServer();
            }
        });
        ctx.get().setPacketHandled(true);
    }
}
