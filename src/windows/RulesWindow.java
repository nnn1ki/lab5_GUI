package windows;
import javax.swing.*;
import java.awt.*;
import java.io.*;


public class RulesWindow {

	JFrame _frame = new JFrame("Rules");
	public RulesWindow(){
		_frame.setLayout(new BorderLayout());
		createRuls();
		_frame.pack();
		_frame.setVisible(true);
		_frame.setLocationRelativeTo(null);
	}


	private void createRuls(){
		JLabel label = new JLabel();
		label.setText(readFile());
		_frame.add(label, BorderLayout.CENTER);
	}


	private String readFile(){
		String text = "";

		try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\nma1t\\IdeaProjects\\untitled\\src\\windows\\rules.txt"))) {
			text = br.readLine();
			System.out.println("Файл загружен!");

		} catch (FileNotFoundException e) {
			System.out.println("Такого файла нет!");

		} catch (IOException e) {
			System.out.println("Ошибка чтения!");
		}

		return text;
	}



}
