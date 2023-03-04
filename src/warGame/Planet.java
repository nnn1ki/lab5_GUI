package warGame;

import java.util.ArrayList;

public class Planet { //общий класс для всех стран.
    private ArrayList<Government> governments = new ArrayList<>();


    //добавление в список стран
    public  void add(Government government){
        this.governments.add(government);
    }

    public void print(){
        for(Government government : governments){
            government.printInfo();
        }
    }

    public void printAllies(int index){
        governments.get(index).printAllies();
    }

    public void printOne(int i){

        try {
            governments.get(i).printInfo(); //получем лишь одну запись
        }catch (IndexOutOfBoundsException e){
            System.out.println("Значение не принадлежит списку");
        }

    }

    public void printAllAllies(){ //выводим все, у кого есть союзники
        for(Government government : governments){
            government.printInfo();
            System.out.println("__________________________________");
            for(Government allies : government.allies){
                allies.printAllies();
            }
            System.out.println("__________________________________");
        }
    }

    public void remove(int id){ //удаление страны по его номеру
        governments.remove(governments.get(id));
    }

    //война
    public void war(int index1, int index2){
        System.out.println("Итог войны: " + governments.get(index1).declareWar(governments.get(index2)));
    }

    //добавить союзника
    public void addNewAllies(int index1, int index2){
        governments.get(index1).makeAllies( governments.get(index2) );
    }


    public void changeName(int index, String name){
        governments.get(index).governmentName = name;
    }

    public void deleteAllies(int index1, int index2){
        governments.get(index1).deleteFromAllies( governments.get(index2) );
    }



}
