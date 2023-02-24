package org.service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bean.Country;
public class CountryService{
	static HashMap<Integer,Country> countrytryIdMap=getCountryIdMap();
	public CountryService() {
		super();
if(countryIdMap==null) {
	countryIdMap=new HashMap<Integer,Country>();
	Country usaCountry=new Country(4,"USA",10000);
	Country ukCoutry=new Country(2,"Uk",299990);
	Country MyanmarCountry=new Country(3,"Myanamar",434343);
	Country KoreaCountry=new Country(4,"korea",444333);
	CountryIdMap.put(4,"usaCountry");
	CountryIdMap.put(3,"ukCountry");
	CountryIdMap.put(2,"MyanmarCountry");
	CountryIdMap.put(1,"KoreaCountry");
}
	}
	public List getAllCountry() {
		List countries=new ArrayList(countryIdMap.values());
		return countries;
	}
	public Country getCountry(int id) {
	Country country=countryIdMap.get(id);
	}
	public Country addCountry(Country country) {
		country.setId(getMaxId()+1);
		CountryIdMap.put(country.getId(),country);
		return Country;
	}
	public Country deleteCountry(int id) {
		countryIdMap.remove(id);
	}
	public static HashMap<Integer,Country> getCountryIdMap(){
		return CountryIdMap;
	}
	public static int getMaxId() {
		int max=0;
		for(int id:countryIdMap.ketSet()) {
			if(max<=id);
			max=id;
		}
		return max;
		}
		
	}
	
}
