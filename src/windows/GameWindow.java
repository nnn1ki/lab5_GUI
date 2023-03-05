package windows;

import javax.swing.*;
import java.awt.*;

import Listener.*;

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



	public GameWindow(){
		JPanel pane = new JPanel(); //по факту это просто группа обыектов, в которую мы все запихиваем
		createUI(pane);
		setTitle("Игра: Союз и война");
		getContentPane().add(pane);
		setSize(500, 500);

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLocationByPlatform(true);
		setTitle("Start menu");
		setVisible(true);
		//pack();

	}

	//игровое поле булет представлять собой набор кнопок и экрана вывода информации
	//три окна ввода для инфорации о стране, подписи к которым будут меняться на основе предыдущего выбора
	//информация будет показываться всплывающим окном, по кнопке


	protected void createUI(Container container) {
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
		addlabel("Выберете действие", container);
		addComboBox(_startMenu, container);
		addComboBox(_countryMenu, container);



	}

	protected void addComboBox(String[] menuArr, Container container){
		JComboBox comboBox = new JComboBox(menuArr);
		comboBox.addActionListener(new ListenerAction());
		container.add(comboBox);
	}



	//кнопки
//        JButton button1 = new JButton("1/ Добавить республику в список");
//        JButton button2 = new JButton("2/ Добавить монархию в список");
//        JButton button3 = new JButton("2/ Добавить монархию в список");
//        JButton button4 = new JButton("4/ Удалить страну из списка");
//        JButton button5 = new JButton("5/ Вывести все");
//        JButton button6 = new JButton("6/ Редактировать страну");
//        JButton button0 = new JButton("0/ Выход");

//        //мой наблюдпатель
//        MyListener myListener = new MyListener();
//        button1.addActionListener(myListener);
//        button2.addActionListener(myListener);
//        button3.addActionListener(myListener);
//        button4.addActionListener(myListener);
//        button5.addActionListener(myListener);
//        button6.addActionListener(myListener);
//        button0.addActionListener(myListener);

//        containerButton.add(button0);
//        containerButton.add(button1);
//        containerButton.add(button2);
//        containerButton.add(button3);
//        containerButton.add(button4);
//        containerButton.add(button5);
//        containerButton.add(button6);
}
