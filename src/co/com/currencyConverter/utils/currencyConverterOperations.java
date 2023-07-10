package co.com.currencyConverter.utils;

public class currencyConverterOperations {
	
	private  int result;
	private  double value;

	
	public void setValue(String Value) {
		this.value = Double.parseDouble(Value);
	}
	
	
	public int convertCurrency(int selected) {
		switch (selected) {
			case 0:
			case 5:
				result = (int) ((double) value * 4.162);
				break;
			case 1:
			case 6:
				result = (int) ((double) value * 4.579);
				break;
			case 2:
			case 7:
				result = (int) ((double) value * 5353.18);
				break;
			case 3:
			case 8:
				result = (int) ((double) value * 29.45);
				break;
			case 4:
			case 9:
				result = (int) ((double) value * 3.20);
				break;
		}
		
		return result;
	}
	
}
