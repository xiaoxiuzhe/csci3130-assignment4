
public interface GravityModel {
	
	double getGravitationalField();
	
}

class Earth implements GravityModel{
	
	public double getGravitationalField(){
		
		return 9.80665;
		
	}
}

class Jupiter implements GravityModel{
	
	public double getGravitationalField(){
		
		return 25;
		
	}
}