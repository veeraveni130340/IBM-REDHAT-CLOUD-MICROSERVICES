package org.example.account_service.model;

public enum City {
	CHENNAI("Chennai"), KOLKATA("Kolkata"), MUMBAI("Mumbai"), HYDRABAD("Hydrabad");

	private String city;

	private City(String city) {
		this.city = city;
	}

	public String getCity() {
		return city;
	}

}
