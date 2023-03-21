package windows;

import javax.swing.*;
import java.awt.*;


public class GameWindow extends Window {

	public String[] _addMenu = {
		"-",
		"Добавить республику в список",
		"Добавить монархию в список",
		"Добавить федерацию в список",
		"Удалить страну из списка",
	};

	public String[] _actionMenu = {
		"-",
		"Объявить войну",
		"Добавить союзника",
		"Изменить название",
		"Удалить союзников из списка",
		"Редактировать страну"
	};

	public String[] _showMenu = {
		"-",
		"Вывести все",
		"Вывести у всех всех союзников",
		"Вывести у всех всех союзников",
		"Вывести у всех всех союзников",
		"Вывести союзников только у этой страны"
	};

	public JPanel _panel = new JPanel();
	public final JComboBox _addComboBox = new JComboBox(_addMenu); // всегда заполнено
	public JComboBox _actionComboBox;
	public JComboBox _showComboBox;


	//механика работы онка
	/*
	применение выбора происодит по кнопке "выполнить"
	первичный список статичный
	вторичный зависит от первичного (нужно менять наполнение комбобокса)
		во время выбора первого меню, нужно это детектить и изменять второе меню
		надо булет настроить try
	 */


	public GameWindow(){ //конструктор, первое открытие окна игры
		_panel.setLayout(new BoxLayout(_panel, BoxLayout.Y_AXIS));
		createUI();

		setTitle("Игра: Союз и война");
		getContentPane().add(_panel);
		setSize(500, 500);

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLocationByPlatform(true);
		setTitle("Game");
		setVisible(true);
	}


	protected void createUI() { //используется для создания нескольких разделов в окне
		//блок ввода
		createMenu(createPanel());
		//возможно булет блок статистики
	}

	protected void createMenu(Container container){
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));

		//так как это структкра, то я думаю можно оставить повторение кода
		addLabel("Добавить", container);
		addComboBox(container, _addMenu);

		addLabel("Действие", container);
		addComboBox(container, _actionMenu);

		addLabel("Показать", container);
		addComboBox(container, _showMenu);
	}



	protected JPanel createPanel(){
		JPanel panel = new JPanel();
		_panel.add(panel);
		return panel;
	}

	
	protected void createInfo(Container container){ //блок информации, пока не до него
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
		
		addLabel("Статистка", container);
		addTextField(container);
	}


	//вывод информации в окне игры
	public void showInfo(String title, String message){
		JOptionPane.showMessageDialog(_panel, message, title, JOptionPane.PLAIN_MESSAGE);
	}





}
