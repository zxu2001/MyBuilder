

/**
 * @author Admin
 * @version 1.0
 * @created 09-Oct-2018 4:14:00 PM
 */
public abstract class AirplaneBuilder {

	public AirplaneBuilder(){

	}

	public void finalize() throws Throwable {

	}
	public abstract void buildPowerplant();

	public abstract void buildSeats();

	public abstract void buildWings();

	public abstract Airplane GetAirplane();
}//end AirplaneBuilder