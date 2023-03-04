package warGame;

public class Federation extends Government {
    protected int numberSubjects; //количество субъектов федерации
    protected String construction = "Federation"; //оно неизменно для этого типа
    protected String major = "president"; //парламент бер республики не существует

    public Federation(){
        this.warPower = random.nextInt(10);
        this.governmentName = Menu.scanner.nextLine();
        this.numberSubjects = random.nextInt(100);
    }

    public Federation(String govermentName, int electionDeadline, int numberSubjects){
        this.warPower = electionDeadline;
        this.governmentName = govermentName;
        this.numberSubjects = numberSubjects;
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
        stringBuilder.append("Количество субъектов федерации: " + this.numberSubjects + '\n');

        System.out.println(stringBuilder);
    }


}
