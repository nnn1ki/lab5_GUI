package windows;
import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.io.*;

//заменить все окно на всплывающее уведомление с тектом


public class RulesWindow extends Window {

	JFrame _frame = new JFrame("Rules");
	public RulesWindow(){
		JOptionPane.showMessageDialog(_frame, readFile());
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
