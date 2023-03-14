package windows;

import javax.swing.*;
import java.awt.*;

import Listener.*;

//TODO
//распределить все объекты по контейнерам и правильно расположить на экране


public class GameWindow extends Window {

	String[] _startMenu = {
		"Добавить республику в список",
		"Добавить монархию в список",
		"Добавить федерацию в список",
		"Удалить страну из списка",
		"Вывести все",
		"Редактировать страну"
	};

	String[] _countryMenu = {
		"Объявить войну",
		"Добавить союзника",
		"Изменить название",
		"Вывести у всех всех союзников",
		"Вывести у всех всех союзников",
		"Вывести у всех всех союзников",
		"Вывести союзников только у этой страны",
		"Удалить союзников из списка"
	};

	JPanel _panel = new JPanel();

	public GameWindow(){
		createUI();

		setTitle("Игра: Союз и война");
		getContentPane().add(_panel);
		setSize(500, 500);

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLocationByPlatform(true);
		setTitle("Game");
		setVisible(true);
	}


	protected void createUI() {
		createFirstMenu(createPanel()); //отдаем на создание первую коробку
		createInfoLabel(createPanel());
	}


	protected JPanel createPanel(){
		JPanel panel = new JPanel();
		_panel.add(panel);
		return panel;
	}


	protected void createFirstMenu(Container container){
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));

		addlabel("Выберете действие", container); //то есть мы должны передавать контейнер с указанным его расположением
		addComboBox(_startMenu, container);
		addComboBox(_countryMenu, container);
	}

	protected void createInfoLabel(Container container){
		container.setLayout(new BoxLayout(container, BoxLayout.X_AXIS));
		addlabel("информация", container);
		//возможно есть какой-то способ доставть элементы из панели...
	}


	protected void addComboBox(String[] menuArr, Container container){
		JComboBox comboBox = new JComboBox(menuArr);
		comboBox.addActionListener(new ListenerAction());
		container.add(comboBox);
	}

}
