package com.vateam.rental;

import java.util.HashMap;
import java.util.Map;

public class Preferences {
	
	// given preferences that effect the choice
	public enum Preference {
	    GEAR_TYPE, 
	    SEAT_NUMBER,
	    VEHICLE_TYPE,
	    VEHICLE_CLASS,
	    AIR_CONDITIONER
	}

	//map containing 'name of preference' and 'value'
	private final Map<Preference,Object> preference_map = new HashMap<Preference,Object>();
	
	public void addPreference(Preference pref, Object value) {
		preference_map.put(pref, value);
	}

	@Override
	public String toString() {
		return "Preferences [preference_map=" + preference_map + "]";
	}
	
	public HashMap<Preference, Object> getPreferences() {
		return new HashMap<Preference,Object>(preference_map);
	}
}
