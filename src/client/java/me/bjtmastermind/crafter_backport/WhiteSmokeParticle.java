//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
package me.bjtmastermind.crafter_backport;

import net.minecraft.client.particle.AscendingParticle;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleFactory;
import net.minecraft.client.particle.SpriteProvider;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.DefaultParticleType;

public class WhiteSmokeParticle extends AscendingParticle {

    protected WhiteSmokeParticle(ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ, float scaleMultiplier, SpriteProvider spriteProvider) {
        super(world, x, y, z, 0.1F, 0.1F, 0.1F, velocityX, velocityY, velocityZ, scaleMultiplier, spriteProvider, 0.3F, 8, -0.1F, true);
        this.red = 0.7294118F;
        this.green = 0.69411767F;
        this.blue = 0.7607843F;
    }

    public static class Factory implements ParticleFactory<DefaultParticleType> {
        private final SpriteProvider spriteProvider;

        public Factory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        public Particle createParticle(DefaultParticleType defaultParticleType, ClientWorld clientWorld, double d, double e, double f, double g, double h, double i) {
            return new WhiteSmokeParticle(clientWorld, d, e, f, g, h, i, 1.0F, this.spriteProvider);
        }
    }
}
