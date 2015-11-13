package Section5_AbstractAndNestedClasses;

public class Section5_28_CellObject {
	private String name;
	private String make;
	private Battery batteryLife;
	public Section5_28_CellObject(String name, String make, Battery batteryLife)
	{
		this.name=name;
		this.make=make;
		this.batteryLife=batteryLife;
	}
	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}
	protected String getMake() {
		return make;
	}
	protected void setMake(String make) {
		this.make = make;
	}
	protected Battery getBatteryLife() {
		return batteryLife;
	}
	protected void setBatteryLife(Battery batteryLife) {
		this.batteryLife = batteryLife;
	}



	public static class Battery{
		private int duration;
		public Battery(int duration)
		{
			this.duration = duration;
		}
		public int getDuration()
		{
			return this.duration;
		}


	}
}