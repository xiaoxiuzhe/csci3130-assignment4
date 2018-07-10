
public class GravityConstant {

	private double g;
	
	public GravityConstant(GravityModel planet){
		g = planet.getGravitationalField();
	}
	
	public double getGravitationalField(){
		return g;
	}
	
    public void setPlanet(GravityModel newPlanet){
    	g = newPlanet.getGravitationalField();
    }
}
