package dev.benaihara.painted;

import dev.benaihara.painted.entities.Entity;
import dev.benaihara.painted.map.Map;
import dev.benaihara.painted.map.MapBuilder;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Game extends Canvas {
    public static Window window;

    public Map map;
    public Entity player;

    public static void main(String[] args) throws FileNotFoundException {
        Game game = new Game();
        window = new Window(game);

        //static imports for now...
        File level0File = new File("level0.png");
        Map level0 = new MapBuilder(level0File).build();

        game.setMap(level0);
        game.repaint();
    }

    public void startGame() {

    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(new Color(37, 37, 37));
        g.fillRect(0, 0, window.getWidth(), window.getHeight());

        //g2.drawImage(getMap(), null, 0, 0);
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
}
