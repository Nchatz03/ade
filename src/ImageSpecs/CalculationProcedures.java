package ImageSpecs;

import java.lang.Math;

public class CalculationProcedures {

	
	/**
	 * Field of View Wide Calculation
	 * <p>
	 * This is the method where we calculate the field of view wide(FOVW)
	 *
	 * @param val - Image Stats 
	 * @return FOVW
	 */
	public static double calculateFOVW(DroneVariables val) {

		double temp = (val.getX_sensor() / (2.0 * val.getX_gimbal_angle()));
		double FOVW = 2.0 * Math.toDegrees(Math.atan(temp));

		return FOVW;

	}

	/**
	 * Field of View Tall Calculation
	 * <p>
	 * This is the method where we calculate the field of view tall(FOVT)
	 *
	 * @param val - Image Stats  
	 * @return FOVT
	 */
	public static double calculateFOVT(DroneVariables val) {

		double temp = (val.getY_sensor() / (2.0 * val.getY_gimbal_angle()));
		double FOVT = 2.0 * Math.toDegrees(Math.atan(temp));

		return FOVT;

	}

	/**
	 * From drone to bottom of picture distance calculation
	 * <p>
	 * This is the method where we calculate the distance from 
	 * drone vertical axis to the bottom of the picture
	 *
	 * @param val - Image Stats  
	 * @return BofP
	 */
	public static double calculateBofP(DroneVariables val) {

		double FOVW = calculateFOVW(val);
		double temp = val.getX_gimbal_angle() - (1.0 / 2.0 * FOVW);
		double BofP = 100 * (Math.tan(Math.toRadians(temp)));

		return BofP;

	}

	/**
	 * From drone to top of picture distance calculation
	 * <p>
	 * This is the method where we calculate the distance from 
	 * drone vertical axis to the top of the picture
	 *
	 * @param val - Image Stats  
	 * @return TofP
	 */
	public static double calculateTofP(DroneVariables val) {

		double FOVW = calculateFOVW(val);
		double temp = val.getX_gimbal_angle() + (1.0 / 2.0 * FOVW);
		double TofP = 100 * (Math.tan(Math.toRadians(temp)));

		return TofP;

	}

	/**
	 * From drone to Left of picture distance calculation
	 * <p>
	 * This is the method where we calculate the distance from 
	 * drone vertical axis to the left of the picture
	 *
	 * @param val - Image Stats  
	 * @return LofP
	 */
	public static double calculateLofP(DroneVariables val) {

		double FOVT = calculateFOVT(val);
		double temp = val.getY_gimbal_angle() - (1.0 / 2.0 * FOVT);
		double LofP = 100 * (Math.tan(Math.toRadians(temp)));

		return LofP;

	}

	/**
	 * From drone to right of picture distance calculation
	 * <p>
	 * This is the method where we calculate the distance from 
	 * drone vertical axis to the bottom of the picture
	 *
	 * @param val - Image Stats  
	 * @return RofP
	 */
	public static double calculateRofP(DroneVariables val) {

		double FOVT = calculateFOVT(val);
		double temp = val.getY_gimbal_angle() + (1.0 / 2.0 * FOVT);
		double RofP = 100 * (Math.tan(Math.toRadians(temp)));

		return RofP;

	}

	/**
	 * Real height of photo calculation
	 * <p>
	 * This is the method where we calculate the real height
	 * of photo  in meters(m)
	 *
	 * @param val - Image Stats  
	 * @return HofPF
	 */
	public static double calculateHofPF(DroneVariables val) {

		double LofP = calculateLofP(val);
		double RofP = calculateRofP(val);

		double HofPF = RofP - LofP;

		return HofPF;

	}

	/**
	 * Real width of photo calculation
	 * <p>
	 * This is the method where we calculate the real width
	 * of photo  in meters(m)
	 *
	 * @param val - Image Stats  
	 * @return WofPF
	 */
	public static double calculateWofPF(DroneVariables val) {

		double BofP = calculateBofP(val);
		double TofP = calculateTofP(val);

		double WofPF = TofP - BofP;

		return WofPF;

	}

}
