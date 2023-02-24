package org.controller;

import java.util.List;

import org.service.CountryService;

@RestController
public class CountryController {
	CountryService countryservice=new CountryService();
	@RequestMapping(value="/countries",method=RequestMethod.GET,headers=
			"Accept=application/json")
	public List getCountries() {
		List listofCountry=countryservice.getAllCountry();
		return listofCountry;
		
	}
	@RequestMapping(value="/country/{id}",method=RequestMethod.GET,headers=
			"Accept=application/json")
	public Country getCountryById(@PathVariable int id ) {
		return countryservice.getCountry(id);
		
	}@RequestMapping(value="/countries", method=RequestMapping.POST,headers=
			"Accept=application/json")
	public Country addCountry(@ResponseBody Country country) {
		return countryservice.addCountry(Country);
	}
	 @RequestMapping(value="/countries", method=RequestMapping.PUT,headers=
			 "Accept=application/json")
	 public Country updateCountry(@ResponseBody Country country) {
		 return countryservice.updateCountry(country);
	 }
	 @RequestMapping(value="/country{id}" method=RequestMapping.DELETE,headers=
			 "Accept=application/json")
	 public void deleteCountry(@PathVariable("id") int id) {
		 countryservice.deleteCountry(id);
		 
	 }

}
