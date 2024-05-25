package dev.benaihara.painted;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MapBuilder {
    private File mapFile;
    private final BufferedImage img;
    private final int width;
    private final int height;

    public MapBuilder(File mapFile) throws FileNotFoundException {
        this.mapFile = mapFile;
        if (!this.mapFile.exists()) throw new FileNotFoundException();
        try {
            img = ImageIO.read(mapFile);
            width = img.getWidth();
            height = img.getHeight();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Map build() {
        Block[][] blockMap = new Block[width][height];
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                int rgb = img.getRGB(x, y);
                blockMap[x][y] = new Block(BlockType.getByRGB(rgb));
            }
        }
        return new Map(blockMap);
    }

    public File getMapFile() {
        return mapFile;
    }

    public void setMapFile(File mapFile) {
        this.mapFile = mapFile;
    }

    public BufferedImage getMapImage() {
        return img;
    }

}
