package warGame;

public class Monarchies extends Government {
    protected int timePower; //время у власти
    protected String construction = "Monarchies"; //оно неизменно для этого типа
    protected String major = "queen"; //парламент бер республики не существует

    public Monarchies(){
        this.warPower = random.nextInt(10);
        this.governmentName = Menu.scanner.nextLine();
        this.timePower = random.nextInt(100);
    }

    public Monarchies(String govermentName, int electionDeadline, int timePower){
        this.warPower = electionDeadline;
        this.governmentName = govermentName;
        this.timePower = timePower;
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
        stringBuilder.append("Время у власти: " + this.timePower + '\n');

        System.out.println(stringBuilder);
    }

}
