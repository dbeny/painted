package dev.benaihara.painted.block;

import java.awt.*;

public enum BlockType {
    VOID("Void", new Color(0, 0, 0)),
    WALL("Wall", new Color(100, 255, 0)),
    FLOOR("Floor", new Color(0, 155, 0)),
    SPAWN("Player Spawn", new Color(0, 255, 255)),
    ENEMY("Enemy Spawn", new Color(255, 0, 0)),
    PICKUP("Pickup", new Color(0, 0, 255)),
    GOAL("Goal", new Color(0, 155, 255));
    private final String name;
    private final Color color;

    BlockType(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public static BlockType getByRGB(int rgb) {
        for (BlockType type : values()) {
            Color color = type.getColor();
            //
        }
        return ENEMY;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }
}
