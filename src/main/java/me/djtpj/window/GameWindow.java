package me.djtpj.window;

import javax.swing.*;
import java.awt.*;

public class GameWindow {
    private final Dimension defaultDimension = new Dimension(800, 450);

    private final JFrame frame;

    public GameWindow() {
        String defaultTitle = "App";
        frame = new JFrame(defaultTitle);
        useDefaultSettings();
    }

    public void useDefaultSettings() {
        setSize(defaultDimension);
        setExitOnClose(true);
        setMaximized(true);
        setCentered(true);
        show();
    }

    public void setSize(Dimension dimension) {
        setSize(dimension.width, dimension.height);
    }

    public void setSize(int width, int height) {
        frame.setSize(width, height);
    }

    public void setExitOnClose(boolean val) {
        frame.setDefaultCloseOperation((val) ? JFrame.EXIT_ON_CLOSE : JFrame.HIDE_ON_CLOSE);
    }

    public void setMaximized(boolean val) {
        frame.setExtendedState((val) ? JFrame.MAXIMIZED_BOTH : JFrame.NORMAL);
    }

    public void setCentered(boolean val) {
        if (val) {
            frame.setLocationRelativeTo(null);
        }
    }

    public void show() {
        frame.setVisible(true);
    }

    public void hide() {
        frame.setVisible(false);
    }

    public void toggleVisibility() {
        if (frame.isVisible()) {
            hide();
        } else {
            show();
        }

        frame.setVisible(!frame.isVisible());
    }

    public void setTitle(String title) {
        frame.setTitle(title);
    }
}
