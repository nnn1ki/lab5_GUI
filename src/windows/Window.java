package windows;

import Listener.ListenerAction;
import Listener.ListenerChange;

import javax.swing.*;
import java.awt.*;

public abstract class Window extends JFrame {

	protected void createUI(Container container) {}

	protected void addButton(String caption, Container container) {
		JButton button = new JButton(caption);

		// Подключение слушателей событий
		button.addActionListener(new ListenerAction());
		button.addChangeListener(new ListenerChange());

		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		button.setPreferredSize(new Dimension(150, 30));
		container.add(button);
	}

	protected void addlabel(String caption, Container container) {
		JLabel label = new JLabel(caption);
		label.setAlignmentX(Component.CENTER_ALIGNMENT);

		//label.setForeground(Color.BLACK);
		//label.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

		container.add(label);
	}


}
