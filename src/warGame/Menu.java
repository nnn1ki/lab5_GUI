package warGame;

import java.util.Scanner;

//планета, как класс, который объединяет все страны.
//сменить власть\строй - пересоздать объект

public class Menu {
    private  static Planet planet = new Planet();
    public static Scanner scanner = new Scanner(System.in);

    //республика, монархия, федерация, государство
    //делаем информационное приложение про строи государств
    public static void main(String args[]){
        int choice = -1;
        do{
            System.out.println("1/ Добавить республику в список"); //менб создания страны
            System.out.println("2/ Добавить монархию в список"); //менб создания страны
            System.out.println("3/ Добавить федерацию в список"); //менб создания страны
            System.out.println("4/ Удалить страну из списка"); //нужно будет создать список
            System.out.println("5/ Вывести все");
            System.out.println("6/ Редактировать страну");
            System.out.println("0/ Выход");

            choice = readInt();
            try {
                switch (choice){
                    case 1: {
                        System.out.println("Введите необходимые данные для Республики:");

                        System.out.println("Введите название страны: ");
                        String govermentName = scanner.nextLine();

                        System.out.println("Введите военный потенциал: ");
                        int warPower = readInt();

                        System.out.println("Введите количество партий: ");
                        int numberBatches = readInt();

                        planet.add(new Republic(govermentName, warPower, numberBatches));
                        break;
                    }

                    case 2: {
                        System.out.println("Введите необходимые данные для Монархии:");

                        System.out.println("Введите название страны: ");
                        String govermentName = scanner.nextLine();

                        System.out.println("Введите военный потенциал: ");
                        int warPower = readInt();

                        System.out.println("Время у власти: ");
                        int timePower = readInt();

                        planet.add(new Monarchies(govermentName, warPower, timePower));
                        break;
                    }

                    case 3: { //добавить страну
                        System.out.println("Введите необходимые данные для Федерации:");

                        System.out.println("Введите название страны: ");
                        String govermentName = scanner.nextLine();

                        System.out.println("Введите военный потенциал: ");
                        int warPower = readInt();

                        System.out.println("Введите количество субъектов: ");
                        int numberSubjects = readInt();

                        planet.add(new Federation(govermentName, warPower, numberSubjects));
                        break;
                    }

                    case 4: { //удалить страну из списка
                        System.out.println("Введите id страны");
                        planet.remove(readInt()); //читаем номер и сразу его передаем
                        break;
                    }

                    case 5: { //вывести все

                        System.out.println("____________________________________");
                        planet.print();
                        System.out.println("____________________________________");
                        break;
                    }

                    case 6: { //редактировать страну
                        change();
                        break;
                    }
                }

            }catch (NullPointerException e){
                System.out.println("Введите значения");

            }
        }while (choice != 0);
        System.exit(0);

        planet.print();
    }


    public static void change(){
        int choice = -1;
        do{
            System.out.println("Введите номер страны для редактирования: ");
            int highlighted = readInt(); //это индекс страны, мы получили индекс

            //печатем выбранную страну и начинаем ее редактировать
            System.out.println("___________________________");
            planet.printOne(highlighted);
            System.out.println("___________________________");

            System.out.println("1/ Объявить войну");
            System.out.println("2/ Добавить союзника");
            System.out.println("3/ Изменить название");
            System.out.println("4/ Вывести у всех всех союзников");
            System.out.println("5/ Вывести союзников только у этой страны");
            System.out.println("6/ Удалить союзников из списка");
            System.out.println("7/ Назад");
            System.out.println("0/ Выход");

            choice = readInt();

            switch (choice){
                case 1:
                    System.out.println("Введите номер страны, которой нужно объявить войну");
                    planet.war(highlighted, readInt());
                    main(null);
                    break;

                case 2:
                    System.out.println("Введите номер страны, чтобы добавить ее в союзники");
                    planet.addNewAllies(highlighted ,readInt());
                    System.out.println("Союзник добавлен!");
                    main(null);
                    break;

                case 3:
                    System.out.println("Введите новое название для этой страны");
                    planet.changeName(highlighted, scanner.nextLine());
                    main(null);
                    break;
                case 4:
                    planet.printAllAllies();
                    main(null);
                    break;

                case 5:
                    planet.printAllies(highlighted);
                    main(null);
                    break;

                case 6:
                    break;
                case 7:
                    main(null);
                    break;
            }
        }while (choice != 0);
        System.exit(0);
    }


    private static int readInt() {
        int readed = -1;
        try {
            readed = Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException e){
            System.out.println("Вводите только числа");
            readed = readInt(); //рекурсия)
        }
        return readed;
    }

}