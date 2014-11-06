package gui;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class SelectionTextPaneMainWindow extends JFrame {
	
	//NOTE: This is a test class. We should delete this once it is integrated into help.
	public SelectionTextPaneMainWindow() {
		setSize(300, 300);
		SelectionTextPane textPane = new SelectionTextPane(
				"This is some sample text. Let's parse it! This is some sample text. Let's parse it! This is some sample text. Let's parse it! This is some sample text. Let's parse it!");

		textPane.select(0, 5);
		String content = textPane.getText();

		String words[] = content.split(" ");

		add(textPane);
		setVisible(true);
	}

	public static void main(String[] args) {
		SelectionTextPaneMainWindow window = new SelectionTextPaneMainWindow();

	}

}
