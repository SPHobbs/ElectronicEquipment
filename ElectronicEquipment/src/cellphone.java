
public class cellphone {
	private static String deviceName;
	private static int powerConsumption;
	private static String brand;
	public cellphone(String DeviceName, int PowerConsumption, String Brand) {
	    deviceName = DeviceName;
	    powerConsumption = PowerConsumption;
	    brand = Brand;
	}
	public String toString(){
		return "Device Name: " + deviceName + ".\nPower Consumption: " + powerConsumption+ " watts.\nBrand: " + brand;
	}
}
