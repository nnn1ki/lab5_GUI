package windows;

import Listener.ListenerAction;
import Listener.ListenerChange;
import Listener.ListenerGame;

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

	protected void addLabel(String caption, Container container) {
		JLabel label = new JLabel(caption);
		label.setAlignmentX(Component.CENTER_ALIGNMENT);
		container.add(label);
	}

	protected void addComboBox(Container container, String[] menuArr){
		//TODO
		//разобраться нужно ли вводить "имена" для кожного комбо


		JComboBox comboBox = new JComboBox(menuArr);
		comboBox.addActionListener(new ListenerGame(comboBox));
		comboBox.setMaximumSize(new Dimension(Integer.MAX_VALUE, comboBox.getMinimumSize().height));
		container.add(comboBox);
	}


	protected void addTextField(Container container){
		JTextField textField = new JTextField();
		textField.setMaximumSize(new Dimension(Integer.MAX_VALUE, textField.getMinimumSize().height));
		container.add(textField);
	}


}
