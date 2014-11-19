package com.vateam.rental;

import java.util.ArrayList;

// class is designed to access the database in the future
public class GlobalManager {
	//facade, more managers could be added here
	private VehicleManager vm = null;
	
	// singleton
	private static GlobalManager _obj;
	
	private GlobalManager() {
		vm = new VehicleManager();
    }
	 
    public static GlobalManager getInstance() {
        if (_obj == null) {
        	_obj = new GlobalManager();
        }
        
        return _obj;
    }
    
    public ArrayList<Vehicle> getAllVehicles() {
		return vm.getAllVehicles();
    }
}
