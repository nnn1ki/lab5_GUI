package windows;

import javax.swing.*;
import java.awt.*;


public class MainWindow extends Window {

    public MainWindow() {
        JPanel pane = new JPanel();
        createUI(pane);
        setTitle("Игра: Союз и война");
        getContentPane().add(pane);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setTitle("Start menu");
        setVisible(true);
        pack();

    }

    @Override
    protected void createUI(Container container) {
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));

        addLabel("Союз и война", container);
        addLabel("Главное меню", container);

        addButton("Играть", container);
        addButton("Правила игры", container);
        addButton("Выйти", container);
    }

}
