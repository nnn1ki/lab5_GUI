package Listener;

import windows.GameWindow;
import windows.RulesWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerAction implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		//возможно стоит создать логирование
		System.out.println("Нжата кнопка " + e.getActionCommand() + '\n');

		//создаем реакцию на кнопку тут

		if (e.getActionCommand() == "Играть"){
			System.out.println("Игра началась");
			new GameWindow();
		}
		else if (e.getActionCommand() == "Правила игры") {
			System.out.println("Правила игры");
			new RulesWindow();
		}
		else if (e.getActionCommand() == "Выйти") {
			System.out.println("Выход из игры");
			System.exit(1);
		}

	}


}


