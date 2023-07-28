package package2;

import package1.*;

public abstract class Port{
	
	int max=150000;
	int min=100000;
	
	private int portCode=(int) (min+Math.random()*(max-min+1));;
	private String location;
	static final String capacity="1000.00 ton";

	protected Port(){}

	protected Port(String location){
		this.location=location;
	}

	public int getPortCode() {
		return portCode;
	}
	public void setPortCode(int portCode) {
		this.portCode = portCode;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	public String toString() {
		return "Port Code: "+portCode+", Location: "+location+", Capacity: "+capacity;
	}
}

class Seaport extends Port{
	static String operatingHours="8.00 AM - 7.00 PM";

	Seaport (){}

	Seaport (String location,String operatingHours){
		super(location);
		this.operatingHours=operatingHours;
	}

	@Override
	public String toString() {
		return super.toString()+", Operating Hours: "+operatingHours;
	}
}
class Airport extends Port{
	static String operatingHours="6.00 AM - 11.59 PM";

	Airport(){}

	Airport(String location){
		super(location);
	}

	@Override
	public String toString() {
		return super.toString()+", Operating Hours: "+operatingHours;
	}

}
