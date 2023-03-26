package warGame;

import java.util.ArrayList;
import java.util.Random;

public abstract class Government {
    //главный класс свойств для всех регионов
    //В этом классе реализовать методы для добавления, удаления, поиска и вывода списка объектов-членов группы
    private static int count = 0; //счетчик стран
    protected int id; //номер каждой записи
    public String governmentName; //название страны
    protected int warPower = 0; //военный потенциал + союзников, если они есть
    protected ArrayList<Government> allies = new ArrayList<>(); //список стран союзников, от которых нужен только их потенциал
    protected Random random = new Random(); //для генераци значений

    public Government(){
        this.id = count;
        count++;
    }

    public abstract StringBuilder printInfo(); //нужно будет адаптираовать это под вывод на лейбл
    public String declareWar(Government government){ //проверяем на победу
        if(this.warPower > government.warPower) {
            this.warPower += 100;
            government.warPower -= 50;
            return "Победа";
        }
        else if (this.warPower == government.warPower) return "Ничья";
        else {
            this.warPower -= 50;
            government.warPower += 100;
            return "Поражение";
        }
    }

    public void printAllies(){ //вывод всех союзников
        for(Government government : allies){
            government.printInfo();
        }
    }

    public void makeAllies(Government government){ //сделать союзником
        this.allies.add(government); //добавили нового союзника
        this.warPower += government.warPower;
    }

    public void deleteFromAllies(Government government){
        this.warPower -= government.warPower;
        this.allies.remove(government); //удалили союзника
    }
}
