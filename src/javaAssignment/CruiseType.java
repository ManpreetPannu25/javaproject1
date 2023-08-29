package javaAssignment;

public enum CruiseType {

	SCENIC_CRUISE("Scenic_Cruise"), SUNSET_CRUISE("Sunset_Cruise"), DISCOVERY_CRUISE("Discovery_Cruise"),
	MYSTERY_CRUISE("Mystery_Cruise");

	String cruiseType;

	CruiseType(String cruiseType) {
		this.cruiseType = cruiseType;
	}

	String getCruiseType() {
		return cruiseType;
	}

}