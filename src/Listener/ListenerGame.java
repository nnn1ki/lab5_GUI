package Listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import windows.GameWindow;
import messageWindow.allMessageWindow;


//классс для обработки выбора игроком

public class ListenerGame implements ActionListener {
	private JComboBox _comboBox;
	private String _selectedItem;
	private String[] _add;
	private String[] _action;
	private String[] _show;


	public ListenerGame(JComboBox comboBox) {
		this._comboBox = comboBox;
		_add = GameWindow._addMenu;
		_action = GameWindow._actionMenu;
		_show = GameWindow._showMenu;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		//мне нужно просто передать выбранный элемент,
		new allMessageWindow(_comboBox);

		_selectedItem = (String) _comboBox.getSelectedItem();
//
//		if (_comboBox.equals(combo[0])){
//			firstComdo();
//		} else if (_comboBox.equals(combo[1])){
//			secondCombo();
//		} else if (_comboBox.equals(combo[2])){
//			thirdCombo();
//		}
	}


//	protected void firstComdo(){
//
//		//что мне предавать в окна?
//
//
//		switch (_selectedItem.toString()){
//			case "Добавить республику в список":
//				new allMessageWindow("Республика", _comboBox);
//
//			case "Добавить монархию в список":
//				new allMessageWindow("Монархия", _comboBox);
//
//			case "Добавить федерацию в список":
//				new allMessageWindow("Федерация", _comboBox);
//
//			case "Удалить страну из списка":
//				new allMessageWindow("Удаление", _comboBox);
//
//			default:
//				//TODO
//				//нужно отладить момент выбора первогй строки
//		}
//
//	}
//
//	protected void secondCombo(){
//		switch (_selectedItem.toString()){
//			case "Объявить войну":
//
//			case "Добавить союзника":
//
//			case "Изменить название":
//
//			case "Удалить союзников из списка":
//
//			case "Редактировать страну":
//
//
//			default:
//				//TODO
//				//нужно отладить момент выбора первогй строки
//		}
//
//
//
//
//	}
//
//	protected  void thirdCombo(){
//		switch (_selectedItem.toString()){
//			case "Вывести все":
//
//			case "Вывести у всех всех союзников":
//
//			case "Изменить название":
//
//			case "Вывести союзников только у этой страны":
//
//
//			default:
//				//TODO
//				//нужно отладить момент выбора первогй строки
//		}
//
//	}
}
