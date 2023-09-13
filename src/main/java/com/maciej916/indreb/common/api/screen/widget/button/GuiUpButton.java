package com.maciej916.indreb.common.api.screen.widget.button;

import com.maciej916.indreb.common.api.enums.GuiSprite;
import com.maciej916.indreb.common.api.interfaces.screen.IGuiHelper;
import com.maciej916.indreb.common.api.screen.widget.BaseButtonWidget;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GuiUpButton extends BaseButtonWidget {

    List<Component> tooltip;

    public GuiUpButton(IGuiHelper helper, int x, int y, @Nullable Runnable onLeftClick, List<Component> tooltip) {
        super(helper, x, y, GuiSprite.SMALL_BUTTON, onLeftClick, null);
        this.tooltip = tooltip;
    }

    @Override
    public void renderToolTip(Screen screen, GuiGraphics guiGraphics, int pMouseX, int pMouseY) {
        if (isHoveredOrFocused()) {
            if (tooltip != null) {
                guiGraphics.renderComponentTooltip(screen.getMinecraft().font, tooltip, pMouseX, pMouseY);
            }
        }
        super.renderToolTip(screen, guiGraphics, pMouseX, pMouseY);
    }

    @Override
    public void renderBackground(GuiGraphics guiGraphics, Minecraft pMinecraft, int pMouseX, int pMouseY) {
        super.renderBackground(guiGraphics, pMinecraft, pMouseX, pMouseY);

        RenderSystem.setShaderTexture(0, getResourceLocation());
        GuiSprite sprite = GuiSprite.UP_ICON;

        guiGraphics.blit(getResourceLocation(), getX() + sprite.getRenderOffsetLeft(), getY() + sprite.getRenderOffsetLeft(), sprite.getOffsetLeft(), sprite.getOffsetTop(), sprite.getWidth(), sprite.getHeight());
    }

}
