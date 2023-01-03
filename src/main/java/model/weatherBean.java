package model;


public class weatherBean {

	private String cityStr;

	private String countryStr;

	private String cloudsStr;
	
	private String temperature;
	
	private String date;
	

	public weatherBean(String cityStr, String countryStr) {

		this.cityStr = cityStr;
		this.countryStr = countryStr;

	}
	
	public String getDate() {
		String dateStr = date.substring(0,10); 
		return dateStr;
	}
	
	public String getTemperature() {
		return temperature;
	}

	public String getCityStr() {
		return cityStr;
	}

	public String getCountryStr() {
		return countryStr;
	}

	public String getCloudsStr() {
		return cloudsStr;
	}

		public void setCloudsStr(String cloudsStr) {
		this.cloudsStr = cloudsStr;
	}
		public void setTemperature(String XMLtemperature) {
			this.temperature =XMLtemperature;
	}

		public void setDate(String XMLlastupdate) {
			this.date = XMLlastupdate;
		}

		
		

		
		
		
		
		
		
		
		
		
		
		

}
