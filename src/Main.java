import windows.MainWindow;
import  javax.swing.*;



public class Main {

    public static void main(String[] args){

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //организуем поток, для нашего первого окна
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainWindow();
            }
        });


    }
}