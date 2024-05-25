package dev.benaihara.painted;

public class Map {
    private final Block[][] blocks;

    public Map(Block[][] blockMap) {
        this.blocks = blockMap;
    }

    public Block[][] getBlocks() {
        return blocks;
    }

    public Block getBlock(int x, int y) {
        return blocks[x][y];
    }

    public BlockType getBlockType(int x, int y) {
        return blocks[x][y].getType();
    }
}
