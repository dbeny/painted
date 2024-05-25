package dev.benaihara.painted;

import javax.swing.*;
import java.awt.*;

public class Window {
	private int width;
	private int height;
	private final JFrame frame;
	private final Game game;

	public Window(Game game) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screen = toolkit.getScreenSize();
		int screenWidth = (int) screen.getWidth();
		int screenHeight = (int) screen.getHeight();
		frame = new JFrame();
		frame.setBounds(0, 0, screenWidth, screenHeight);
		frame.setTitle("Painted!");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		onResize();
		this.game = game;
		frame.add(game);
	}

	public void onResize() {
		width = frame.getWidth();
		height = frame.getHeight();
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public Game getGame() {
		return game;
	}
}
