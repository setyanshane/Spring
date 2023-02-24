package org.bean;

public class Country {
	int id;
	String CountryName;
	long population;
	public Country() {
		super();
	}
	public Country(int i,String CountryName,long population) {
		super();
		this.id=i;
		this.CountryName=CountryName;
		this.population=population;
		}
	public String getCountryName() {
		return CountryName;
	}
	public void setCountryName(String countryName) {
		CountryName = countryName;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	}
