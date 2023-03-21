package Listener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import windows.GameWindow;
import messageWindow.allMessageWindow;




//классс для обработки выбора игроком

public class ListenerGame implements ActionListener {
	JComboBox comboBox = new JComboBox();

	public ListenerGame(JComboBox comboBox) {
		this.comboBox = comboBox;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String selectedItem = (String) comboBox.getSelectedItem();

		if(selectedItem.equals("Добавить республику в список")){
			new allMessageWindow("Республика");

		} else if (selectedItem.equals("Добавить монархию в список")) {
			new allMessageWindow("Монархия");

		} else if (selectedItem.equals("Добавить федерацию в список")) {
			new allMessageWindow("Федерация");

		} else if (selectedItem.equals("Удалить страну из списка")) {
			new allMessageWindow("Удаление");
		}




	}


}