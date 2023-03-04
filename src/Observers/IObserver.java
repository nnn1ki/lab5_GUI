package Observers;

//класс для всех слушателей програмы

public interface IObserver {

	void RecordingClicks(); //запись всех нажатий игрока по кнопкам (для логирования)

	void RecordingStatus(); //сохраняем состояние игры для ее продолжения
}
