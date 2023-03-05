package windows;

import Listener.*;

import javax.swing.*;
import java.awt.*;
import java.net.http.WebSocket;


public class MainWindow extends Window {


    private Container container;

    public MainWindow() {
        JPanel pane = new JPanel();
        createUI(pane);
        setTitle("Игра: Союз и война");
        getContentPane().add(pane);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setTitle("Start menu");
        setVisible(true);
        pack();

    }

    @Override
    protected void createUI(Container container) {
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));

        addlabel("Союз и война", container);
        addlabel("Главное меню", container);

        addButton("Играть", container);
        addButton("Правила игры", container);
        addButton("Выйти", container);
    }

}



    //public void PrintBody(){

//        setSize(320, 320);
//        setLocation(100, 100);
//        setDefaultCloseOperation( EXIT_ON_CLOSE );
//
//        // Вспомогательная панель
//        JPanel grid = new JPanel();
//        GridLayout layout = new GridLayout(2, 0, 5, 12);
//        grid.setLayout(layout);
//
//        // Создаем кнопки глваного меню
//        JButton startButton = new JButton("Играть");
//        JButton aboutButton = new JButton("Правила игры");
//        JButton exitButton = new JButton("Выход");
//
//
//        // Размещаем нашу панель в панели содержимого
//        getContentPane().add(grid);
//        // Устанавливаем оптимальный размер окна
//
//

//    }
//


//наблюдатель, по который очуществляет вызов компонентов игры
//class MyListener implements ActionListener {
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if(e.getActionCommand().equals("1/ Добавить республику в список")){
//            System.out.println("Введена первая команда!");
//        }
//        else if (e.getActionCommand().equals("2/ Добавить монархию в список")) {
//            System.out.println("Введена вторая команда!");
//        }
//        else if (e.getActionCommand().equals("3/ Добавить федерацию в список")) {
//            System.out.println("Введена третья команда!");
//        }
//        else if (e.getActionCommand().equals("4/ Удалить страну из списка")){
//            System.out.println("Введена четвертая команда!");
//        }
//        else if (e.getActionCommand().equals("5/ Вывести все")){
//            System.out.println("Введена пятая команда!");
//        }
//        else if (e.getActionCommand().equals("6/ Редактировать страну")){
//            System.out.println("Введена шестая команда!");
//        }
//        else if (e.getActionCommand().equals("0/ Выход")){
//            System.out.println("Введена команда выхода!");
//        }
//
//
//    }
//}