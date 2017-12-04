package ImageSpecs;


public class PFofDrone {
	
	public static void main(String args[]){
		
		DroneVariables val = new DroneVariables(36,24,20,20,100,20,0,0);
		
		double height = CalculationProcedures.calculateHofPF(val);
		double width = CalculationProcedures.calculateWofPF(val);
		RealImgSize image = new RealImgSize(height,width);
		
		image.changeHeight(height);
		image.changeWidth(width);
		
		System.out.println(image.getHeight()+"\n");
		System.out.println(image.getWidth()+"\n");
		
		return;
		
		
		
	}
	


}
