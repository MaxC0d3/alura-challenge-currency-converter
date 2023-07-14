package co.com.currencyConverter.main;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.formdev.flatlaf.FlatDarculaLaf;

public class Main {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(new FlatDarculaLaf());
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		App app = new App();
	}
}
