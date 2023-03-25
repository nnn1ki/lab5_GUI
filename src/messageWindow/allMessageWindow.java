package messageWindow;
import javax.swing.*;
import warGame.*;

import java.awt.*;

public class allMessageWindow {
	private String _actionType = "";
	Planet _planet = new Planet();
	int _countryId;
	JPanel _panel = new JPanel(); //поле которе быдем использовать для создания нескольких полей вводда

	String[] _republicInfo = {
			"Название страны",
			"Военный потенциал",
			"Количество партий"
	};

	String[] _federationInfo = {
			"Название страны",
			"Военный потенциал",
			"Количество партий"
	};

	String[] _monarchiesInfo = {
			"Название страны",
			"Военный потенциал",
			"Количество партий"
	};

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
				_panel.add(label);

				JTextField[] textFields;
				textFields = addTextFielsd(_republicInfo);

				_planet.add(new Federation(textFields[0], textFields[1], textFields[2]));
				JOptionPane.showMessageDialog(null, _panel);
			}

			case "Республика": {
				JLabel label = new JLabel("Респубдика");
				_panel.add(label);

				JTextField[] textFields;
				textFields = addTextFielsd(_republicInfo);

				_planet.add(new Republic(textFields[0], textFields[1], textFields[2]));
				JOptionPane.showMessageDialog(null, _panel);
			}

			case "Монархия": {
				JLabel label = new JLabel("Монархия");
				_panel.add(label);

				JTextField[] textFields;
				textFields = addTextFielsd(_monarchiesInfo);

				_planet.add(new Monarchies(textFields[0], textFields[1], textFields[2])); //в классе еужно булет переделать на принятие jtextfield
				JOptionPane.showMessageDialog(null, _panel);
			}

			break;
			default:
				throw new IllegalStateException("Unexpected value: " + _actionType);
		}
	}

	private JTextField[] addTextFielsd(String[] info){
		JTextField[] textFields = new JTextField[3];

		for (int i = 0; i < info.length; i++){
			JTextField text = new JTextField(info[i]);
			_panel.add(text);
			textFields[i] = text;
		}
		return textFields;
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
