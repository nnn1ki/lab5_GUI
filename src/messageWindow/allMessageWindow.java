package messageWindow;
import javax.swing.*;
import warGame.*;

public class allMessageWindow {
	private String _actionType = "";
	Planet _planet = new Planet();
	int _countryId;
	JPanel _panel = new JPanel(); //поле которе быдем использовать для создания нескольких полей вводда

	public allMessageWindow(String actionType){
		_actionType = actionType;


		//возможно это можно сделать как-то иначе
		if(!_actionType.equals("Удаление")){
			inputInformation();
		}
		else {
			deleteCountry();
		}

	}

	private void inputInformation(){

		_panel.setLayout(new BoxLayout(_panel, BoxLayout.Y_AXIS));

		switch (_actionType){
			case "Федерация": {
				JLabel label = new JLabel("Федерация");
				JTextField countryName = new JTextField("Название страны");
				JTextField warPower = new JTextField("Военный потенциал");
				JTextField numberSubjects = new JTextField("Количество субъектов");
				_planet.add(new Federation(countryName, warPower, numberSubjects)); //в классе еужно булет переделать на принятие jtextfield

				_panel.add(label);
				_panel.add(countryName);
				_panel.add(warPower);
				_panel.add(numberSubjects);

				JOptionPane.showMessageDialog(null, _panel);
			}

			case "Республика": {
				JLabel label = new JLabel("Республика");
				JTextField countryName = new JTextField("Название страны");
				JTextField warPower = new JTextField("Военный потенциал");
				JTextField numberBatches = new JTextField("Количество партий");
				_planet.add(new Republic(countryName, warPower, numberBatches));

				_panel.add(label);
				_panel.add(countryName);
				_panel.add(warPower);
				_panel.add(numberBatches);

				JOptionPane.showMessageDialog(null, _panel);
			}

			case "Монархия": {
				JLabel label = new JLabel("Монархия");
				JTextField countryName = new JTextField("Название страны");
				JTextField warPower = new JTextField("Военный потенциал");
				JTextField timePower = new JTextField("Время у власти");
				_planet.add(new Monarchies(countryName, warPower, timePower)); //в классе еужно булет переделать на принятие jtextfield

				_panel.add(label);
				_panel.add(countryName);
				_panel.add(warPower);
				_panel.add(timePower);

				JOptionPane.showMessageDialog(null, _panel);


			}


		}
	}


	private void deleteCountry(){
		JLabel label = new JLabel("Удаление");
		JTextField id = new JTextField("Введите название для удаления");

		_panel.add(label);
		_panel.add(id);

		JOptionPane.showMessageDialog(null, _panel);

		try {
			_planet.remove(Integer.parseInt(id.getName()));
		}catch (NumberFormatException e){
			JOptionPane.showMessageDialog(null, "Введите правельные значения!");
		}

	}




}
