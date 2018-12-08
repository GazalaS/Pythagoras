package se.pythagoras.property;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PropertyDetails {

	    private String floorName;

	    private String floorArea;

	    private String buildingName;

		public String getFloorName() {
			return floorName;
		}
		
		public void setFloorName(String floorName) {
			this.floorName = floorName;
		}
		
		public String getFloorArea() {
			return floorArea;
		}

		public void setFloorArea(String floorArea) {
			this.floorArea = floorArea;
		}
		
		public String getBuildingName() {
			return buildingName;
		}
		
		public void setBuildingName(String buildingName) {
			this.buildingName = buildingName;
		}
	}

