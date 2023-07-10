package co.com.currencyConverter.main;

import co.com.currencyConverter.gui.ContainerCurrency;

public class App {
	public App() {
		showWindow();
	}
	
	public void showWindow() {
		ContainerCurrency CurrencyFrame = new ContainerCurrency();
		CurrencyFrame.setVisible(true);
	}
}
