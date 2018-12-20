import java.util.Arrays;

class Building extends Location {
  private String name;
  private Type type;
  private Location location;
  private String[] availablePlaces;

  public Building(String name, Type type, float longitude, float latitude, String[] availablePlaces) {
    super(longitude, latitude);
    this.name = name;
    this.type = type;
    this.availablePlaces = availablePlaces;
  }

  public String getName() {
    return this.name;
  }

  public Location getBuildingLocation() {
    return this.location;
  }

  public String[] getAvailablePlaces() {
    return this.availablePlaces;
  }

  public Type getType() {
    return type;
  }

  public double getDistance(Building building) {
    if (this.whetherReachBuilding(building.getName())) {
      return super.getDistance(building);
    } else {
      throw new RuntimeException("can not reach the building directly");
    }
  }

  public boolean whetherReachBuilding(String name) {
    return Arrays.asList(this.availablePlaces).contains(name);
  }
}
