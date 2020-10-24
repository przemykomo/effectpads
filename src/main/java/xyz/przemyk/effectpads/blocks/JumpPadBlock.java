package xyz.przemyk.effectpads.blocks;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;

public class JumpPadBlock extends LandingPadBlock {

    public final float STRENGTH;

    public JumpPadBlock(Properties properties, float strength) {
        super(properties);
        STRENGTH = strength;
    }

    @Override
    public void onLanded(IBlockReader worldIn, Entity entityIn) {
        if (entityIn.isSuppressingBounce()) {
            super.onLanded(worldIn, entityIn);
        } else {
            Vector3d motion = entityIn.getMotion();
            entityIn.setMotion(motion.getX(), STRENGTH, motion.getZ());
        }
    }
}
