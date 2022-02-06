/**
 * Esta es una clase llamada MannedSpacecraft que extends de Spacecraft para la creacion de naves espaciales tripuladas
 * @author Daniel Steven Gil Cruz
 *
 */
public class MannedSpacecraft extends Spacecraft{
	private boolean onTheMove;
	public int capacityForPeople;
	private boolean speed;
	private int movement;	
	/**
	 * Crea una instancia de la clase MannedSpacecraft
	 */
	public MannedSpacecraft() {
		super();
		this.name = ""; 
		this.weight = 0;   
		this.developingCountry = "";
		this.capacityForPeople = 0;
		this.speed = false;
		this.movement = 0;		
	}
	/**
	 * Crea una instancia de la clase MannedSpacecraft
	 */
	public MannedSpacecraft(String name,int weight,String developingCountry, int capacityForPeople) {
		this.name = name; 
		this.weight = weight;   
		this.developingCountry = developingCountry;
		this.capacityForPeople = capacityForPeople;		
	}	
	/**
	 *Se implementa metodo de la clase extendida
	 */
	@Override
	public void activeSelfPropelledRocket() {
		this.onTheMove =  true;		
	}	
	/**
	 *Se implementa metodo de la clase extendida
	 */
	@Override
	public void deactivateSelfPropelledRocket() {
		this.onTheMove = false; 		
	}	
	/**
	 * Se crea metodo para iniciar motor
	 */
	public void startEngine() {
		this.speed = true;		
	}
	/**
	* Se crea metodo para apagar motor
	*/
	public void shutdownEngine() {
		this.speed = false;	
	/**
	* Se crea metodo para iniciar propulsores
	*/	
	}
	public void activateThrusters() {
		this.speed = true;			
	/**
	* Se crea metodo para apagar propulsores
	*/	
	}
	public void disableThrusters() {
		this.speed = false;		
	}	
}
