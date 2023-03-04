package windows;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



/*
нужно разбить составляющие она на несколько блоков и отрисовывать их по-отдельности

первичное окно
-начать игру
-привила игры
-выйти


нужно отдельные компоненты разбивать по блокам, эти блоки добавлять в другие блоки, тем самым делать как-бы разметку для страницы
 */

public class MainWindow extends JFrame {


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


    private void addButton(String caption, Container container) {
        JButton button = new JButton(caption);

        // Подключение слушателей событий
        button.addActionListener(new ListenerAction());
        button.addChangeListener(new ListenerChange());

        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.setPreferredSize(new Dimension(150, 30));
        container.add(button);
    }


    private void addlabel(String caption, Container container) {
        JLabel label = new JLabel(caption);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(label);
    }


    public void createUI(Container container) {
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));

        addlabel("Союз и война", container);
        addlabel("Главное меню", container);

        addButton("Играть", container);
        addButton("Правила игры", container);
        addButton("Выйти", container);

    }


}


//классы наблюдения
class ListenerAction implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        //возможно стоит создать логирование
        System.out.println("Нжата кнопка " + e.getActionCommand() + '\n');

        //создаем реакцию на кнопку тут

        if (e.getActionCommand() == "Играть"){
            System.out.println("Игра началась");


        }
        else if (e.getActionCommand() == "Правила игры") {
            System.out.println("Правила игры");
            new RulesWindow();
        }
        else if (e.getActionCommand() == "Выйти") {
            System.out.println("Выход из игры");
            System.exit(1);
        }

    }


}

class ListenerChange implements ChangeListener {

    @Override
    public void stateChanged(ChangeEvent e) {
        // Источник события
        Object src = e.getSource();
        System.out.println("Cообщение о смене состояния объекта : "
                + src.getClass());
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