package warGame;

import javax.swing.*;

public class Monarchies extends Government {
    protected int timePower; //время у власти
    protected String construction = "Monarchies"; //оно неизменно для этого типа
    protected String major = "queen"; //парламент бер республики не существует

    public Monarchies(){
        this.warPower = random.nextInt(10);
        this.governmentName = Menu.scanner.nextLine();
        this.timePower = random.nextInt(100);
    }

    public Monarchies(JTextField govermentName, JTextField electionDeadline, JTextField timePower){
        try {
            this.warPower = Integer.parseInt(electionDeadline.getText());
            this.governmentName = govermentName.getText();
            this.timePower = Integer.parseInt(timePower.getText());
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Введите все значения!");
        }

    }


    @Override
    public StringBuilder printInfo() {
        StringBuilder stringBuilder = new StringBuilder("");
        //название страны, кто правитель, сколько осталось править, количество субъектов
        stringBuilder.append("" + id + '\n');
        stringBuilder.append("Строй: " + this.construction + '\n');
        stringBuilder.append("Название страны: " + this.governmentName + '\n');
        stringBuilder.append("Главный в стране: " + this.major + '\n');
        stringBuilder.append("Военный потенциал: " + this.warPower + '\n');
        stringBuilder.append("Время у власти: " + this.timePower + '\n');

	    return stringBuilder;
    }

}
