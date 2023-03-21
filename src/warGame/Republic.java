package warGame;

import javax.swing.*;

public class Republic extends Government {

    protected int numberBatches; //количество партий
    protected String construction = "Republic"; //оно неизменно для этого типа
    protected String major = "parliament"; //парламент бер республики не существует



    public Republic(){ //пустой конструктор
        this.warPower = random.nextInt(100);
        this.governmentName = Menu.scanner.nextLine(); //ввод названия страны
        this.numberBatches = random.nextInt(100);
    }

    public Republic(JTextField govermentName, JTextField warPower, JTextField numberBatches ){ //передали значения
        try {
            this.warPower = Integer.parseInt(warPower.getText());
            this.governmentName = govermentName.getText(); //название страны
            this.numberBatches = Integer.parseInt(numberBatches.getText());
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Введите все значения!");
        }

    }



    @Override
    public void printInfo() {
        StringBuilder stringBuilder = new StringBuilder("");
        //название страны, кто правитель, сколько осталось править, количество субъектов
        stringBuilder.append("" + id + '\n');
        stringBuilder.append("Строй: " + this.construction + '\n');
        stringBuilder.append("Название страны: " + this.governmentName + '\n');
        stringBuilder.append("Главный в стране: " + this.major + '\n');
        stringBuilder.append("Военный потенциал: " + this.warPower + '\n');
        stringBuilder.append("Количество партий: " + this.numberBatches + '\n');

        System.out.println(stringBuilder);
    }
}
