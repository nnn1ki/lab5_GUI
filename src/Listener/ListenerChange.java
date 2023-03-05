package Listener;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ListenerChange implements ChangeListener {

	@Override
	public void stateChanged(ChangeEvent e) {
		// Источник события
		Object src = e.getSource();
		System.out.println("Cообщение о смене состояния объекта : "
				+ src.getClass());
	}
}