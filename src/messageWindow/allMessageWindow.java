package messageWindow;
import javax.swing.*;
import warGame.*;

import windows.GameWindow;



public class allMessageWindow {
	private String _selectedItem = ""; //для передачи
	Planet _planet = new Planet(); //индекс создается автоматически
	JPanel _panel = new JPanel(); //поле которе быдем использовать для создания нескольких полей вводда

	Object[] _combo;




	//TODO
	//эти поля можно вынести в классы стран
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

	public allMessageWindow(JComboBox comboBox){

		_selectedItem = comboBox.getSelectedItem().toString();
		_combo = (Object[]) GameWindow.getCombo();

		if (comboBox.equals(_combo[0])){
			firstCombo();
		} else if (comboBox.equals(_combo[1])){
			secondCombo();
		} else if (comboBox.equals(_combo[2])){
			thirdCombo();
		}

	}

	protected void firstCombo(){
		switch (_selectedItem.toString()){
			case "Добавить республику в список":
				addInformation("Республика");

			case "Добавить монархию в список":
				addInformation("Монархия");

			case "Добавить федерацию в список":
				addInformation("Федерация");

			case "Удалить страну из списка":
				deleteCountry();

			default:
				//TODO
				//нужно отладить момент выбора первогй строки
		}
	}

	protected void secondCombo(){
		switch (_selectedItem.toString()){
			case "Объявить войну":
				//todo
				//вывести индексы стран
				//вывести названия стран
				//вывести военный потенциал
				//чекбоксы около кадой страны
				//вывести отдельным окном результат войны


			case "Добавить союзника":
				//вывести индексы стран
				//вывести названия стран
				//вывести военный потенциал
				//чекбоксы около каждой страны


			case "Изменить название":
				//ввести название страны

			case "Удалить союзников из списка":
				//ввести индекс страны
				//вывести всех союзников страны с чекбоксами для удаления
			case "Редактировать страну":
				//ввести индекс страны
				//вывести все тоде самое, что и при вводе, только вбить в базовые значения значения из памяти


			default:
				//TODO
				//нужно отладить момент выбора первогй строки
		}
	}



		protected  void thirdCombo(){
		switch (_selectedItem.toString()){
			case "Вывести все":
				StringBuilder allInfo = _planet.print();
				JTextField textField = new JTextField(String.valueOf(allInfo));
				textField.setEditable(false);
				_panel.add(textField);

				JOptionPane.showMessageDialog(null, _panel);
			case "Вывести у всех всех союзников":

			case "Изменить название":

			case "Вывести союзников только у этой страны":


			default:
				//TODO
				//нужно отладить момент выбора первогй строки
		}

	}



	private void addInformation(String item){

		_panel.setLayout(new BoxLayout(_panel, BoxLayout.Y_AXIS));

		switch (item){
			case "Федерация": {
				JLabel label = new JLabel("Федерация");
				_panel.add(label);

				JTextField[] textFields;
				textFields = addTextFielsd(_federationInfo);

				_planet.add(new Federation(textFields[0], textFields[1], textFields[2]));

				JOptionPane.showMessageDialog(null, _panel);
			}

			case "Республика": {
				JLabel label = new JLabel("Республика");
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
				throw new IllegalStateException("Unexpected value: " + _selectedItem);
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
