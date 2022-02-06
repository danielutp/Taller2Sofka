/**
 * Representa una clase llamada Spacecraft la cual es abstract,todo esto para la creacion de otras clases que heredan de esta y crear naves espaciales.
 * @author Daniel Steven Gil Cruz
 *
 */
public abstract class Spacecraft {	
	public String name;
	public int weight;
	public String developingCountry;
	public String shuttleVehicles;
	
	/**
	 * crea una instancia de la clase Spacecraft
	 */
	public Spacecraft() {
		this.name = "";
		this.weight = 0;
		this.developingCountry = "";			
	}		
	/**
	 * Metodo para obtener name
	 * @return Hace return de la variable name
	 */
	public String getName() {
		return name;
	}	
	/**
	 * Metodo para modificar la variable name
	 * @param name parametro modificado
	 */
	public void setName(String name) {
		this.name = name;
	}	
	/**
	 * Metodo para obtener getWeight
	 * @return Hace return de la variable getWeight
	 */
	public int getWeight() {
		return weight;
	}	
	/**
	 * Metodo para modificar la variable weight
	 * @param weight parametro modificado
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}	
	/**
	 * Metodo para obtener getDevelopingCountry
	 * @return Hace return de la variable getDevelopingCountry
	 */
	public String getDevelopingCountry() {
		return developingCountry;
	}	
	/**
	 * Metodo para modificar la variable developingCountry
	 * @param developingCountry parametro modificado
	 */
	public void setDevelopingCountry(String developingCountry) {
		this.developingCountry = developingCountry;
	}
	/**
	 * Metodos a implementar en la clase abstract que extienda de la clase Spacecraft
	 */
	public abstract void activeSelfPropelledRocket();
	public abstract void deactivateSelfPropelledRocket();
}
