
public class SUV extends CivilVehicle {

    private final int TIME_TO_FIX = 15; //in minutes

    public SUV(double vehicleSize){
        super(vehicleSize);
    }

    public int getTimeToFix(){
    	return TIME_TO_FIX; 
    }


}
