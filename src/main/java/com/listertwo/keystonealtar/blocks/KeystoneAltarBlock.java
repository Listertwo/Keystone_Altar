package com.listertwo.keystonealtar.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

import java.util.stream.Stream;

public class KeystoneAltarBlock extends Block {

    private static final VoxelShape SHAPE = Stream.of(
            Block.box(2, 10, 2, 14, 12, 14),
            Block.box(7, 12, 7, 9, 12.7, 9),
            Block.box(7, 12, 2.8, 9, 12.5, 4.8),
            Block.box(3, 12, 5, 5, 12.5, 7),
            Block.box(11, 12, 5, 13, 12.5, 7),
            Block.box(2, 0, 2, 14, 1, 14),
            Block.box(4, 1, 4, 12, 2, 12),
            Block.box(6, 2, 6, 10, 10, 10),
            Block.box(7, 12, 11.3, 9, 12.5, 13.3),
            Block.box(11, 12, 9, 13, 12.5, 11),
            Block.box(3, 12, 9, 5, 12.5, 11),
            Block.box(9, 12, 7, 10, 13, 9),
            Block.box(7, 12, 6, 9, 13, 7),
            Block.box(7, 11, 9, 9, 12, 10),
            Block.box(6, 11, 7, 7, 12, 9),
            Block.box(14, 11, 2, 15, 12, 14),
            Block.box(2, 11, 2, 3, 12, 14),
            Block.box(2, 11, 13, 14, 12, 14),
            Block.box(2, 11, 1, 14, 12, 2),
            Block.box(1, 9.7, 1, 2, 12.7, 2),
            Block.box(14, 9.7, 1, 15, 12.7, 2),
            Block.box(14, 9.7, 14, 15, 12.7, 15),
            Block.box(1, 9.7, 14, 2, 12.7, 15),
            Block.box(1, 11, 7.5, 2, 12.3, 8.5),
            Block.box(7.5, 11, 14, 8.5, 12.3, 15),
            Block.box(14, 11, 7.5, 15, 12.3, 8.5),
            Block.box(7.5, 11, 1, 8.5, 12.3, 2),
            Block.box(1.25, 12.7, 1.25, 1.75, 12.95, 1.75),
            Block.box(1.25, 12.7, 14.25, 1.75, 12.95, 14.75),
            Block.box(14.25, 12.7, 14.25, 14.75, 12.95, 14.75),
            Block.box(14.25, 12.7, 1.25, 14.75, 12.95, 1.75)
    ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();

    public KeystoneAltarBlock() {
        super(AbstractBlock.Properties.of(Material.STONE)
                .harvestTool(ToolType.PICKAXE)
                .sound(SoundType.GLASS)
                .strength(1.5f,6.0f)
        );
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context){
        return SHAPE;
    }
}
