/**
 * Esta es una clase llamada UnmannedSpacecraft que extends de Spacecraft para la creacion de naves espaciales no tripuladas
 * @author Daniel Steven Gil Cruz
 *
 */
public class UnmannedSpacecraft extends Spacecraft{
	private boolean onTheMove;
	public String targetPlanet;
	private boolean open;
	private int movement;
	private boolean click;	
	/**
	 * Crea una instancia de la clase UnmannedSpacecraft
	 */
	public UnmannedSpacecraft() {
		super();
		this.name = ""; 
		this.weight = 0;   
		this.developingCountry = "";
		this.onTheMove = false;
		this.targetPlanet = "";
		this.open = false;
		this.click = false;		
	}	
	/**
	 * Crea una instancia de la clase UnmannedSpacecraft
	 */
	public UnmannedSpacecraft(String name,int weight,String developingCountry,String targetPlanet) {
		this.name = name; 
		this.weight = weight;   
		this.developingCountry = developingCountry;	
		this.targetPlanet = targetPlanet;		
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
	* Se crea metodo para abrir tren de aterrizaje
	*/
	public void openUndercarriage() {
		this.open = true;		
	}	
	/**
	* Se crea metodo para cerrar tren de aterrizaje
	*/
	public void closeUndercarriage() {
		this.open = false;		
	}	
	/**
	* Se crea metodo para mover camara
	*/
	public void cameraMovement() {
		this.movement = this.movement + 1;		
	}	
	/**
	* Se crea metodo para tomar una foto
	*/
	public void takePicture() {
		this.click = true;		
	}
}