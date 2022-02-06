import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 * Esto es un sistema de creacion de naves espaciales de tipo tripuladas y no tripoladas.
 * @author Daniel Steven Gil Cruz
 *
 */
public class Main 
{	
    public static void main(String[] args){    	
        int opcion = 0;
    	int number = 0;
    	do{
    		number = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al sistema para la creacion de naves espaciales\n"+
    		    	"Para esta creacion de naves tenemos 2 opciones de tipo tripuladas y No tripuladas"+"\n"+"Ingrese la opcion 1 para crear una nave de tipo No Tripulada\n"+
    		"Ingrese la opcion 2 para crear una nave de tipo Tripulada\n"+"Ingrese la opcion 3 para para salir del sistema\n"));
    		/**
    		 * Se crean los casos para la creacion de tipo de nave en este caso de tipo tripulada y no tripulada
    		 */
	        switch(number){	        	
	            case 1 :
	            	int opcion1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion 1 para crear una nave Vikingo I No tripulada\n"
	            	+"Ingrese la opcion 2 para crear una nave Venera IX No tripulada\n"));
	            	/**
	            	 *Se crean los casos para las dos tipos de naves no tripuladas en este caso Vikingo I y Venera IX
	            	 */
	                switch (opcion1) {
	                	/**
	                	 *Se crea la nave espacial Vikingo I con sus respectivos atributos
	                	 */
						case 1: {
							UnmannedSpacecraft spacecraftcreated = new UnmannedSpacecraft("Vikingo I",3527,"EEUU","Marte");
							spacecraftcreated.openUndercarriage();
							spacecraftcreated.closeUndercarriage();
							JOptionPane.showInputDialog("Nave Vikingo I creada con las siguientes caracteristicas\n"+"Nombre : "+spacecraftcreated.name+"\n"+
							"Peso : "+spacecraftcreated.weight+"\n"+"Creado por : "+spacecraftcreated.developingCountry+"\n"+"Planeta objetivo : "+spacecraftcreated.targetPlanet);
							break;
						}
						/**
						 * Se crea la nave espacial Venera IX con sus respectivos atributos
						 */
						case 2: {
							UnmannedSpacecraft spacecraftcreated = new UnmannedSpacecraft("Venera IX",660,"Rusia","Venus");
							spacecraftcreated.cameraMovement();
							spacecraftcreated.takePicture();
							JOptionPane.showInputDialog("Nave Vikingo I creada con las siguientes caracteristicas\n"+"Nombre : "+spacecraftcreated.name+"\n"+
							"Peso : "+spacecraftcreated.weight+"\n"+"Creado por : "+spacecraftcreated.developingCountry+"\n"+"Planeta objetivo : "+spacecraftcreated.targetPlanet);
							break;
						}
						default:
							JOptionPane.showInputDialog("no coincide");
			                break;
						}
	                break;
	            /**
	             * Se crean los casos para las dos tipos de nave tripuladas en este caso Apolo y Skylab
	             */
	            case 2 :
	            	opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion 1 para crear una nave Apolo tripulada\n"
	    	        +"Ingrese la opcion 2 para crear una nave Skylab tripulada\n"));
	            	/**
	            	 * 
	            	 */
	                switch (opcion) {
	                	/**
	                	 * Se crea la nave espacial Apolo con sus respectivos atributos
	                	 */
						case 1: {
							MannedSpacecraft spacecraftcreated = new MannedSpacecraft("Apolo",4170,"EEUU",3);
							spacecraftcreated.startEngine();
							spacecraftcreated.shutdownEngine();
							JOptionPane.showInputDialog("Nave Apolo creada con las siguientes caracteristicas\n"+"Nombre : "+spacecraftcreated.name+"\n"+
							"Peso : "+spacecraftcreated.weight+"\n"+"Creado por : "+spacecraftcreated.developingCountry+"\n"
							+"Capacidad de personas : "+spacecraftcreated.capacityForPeople);
							break;
						}
						/**
						 * Se crea la nave espacial Skylab con sus respectivos atributos
						 */
						case 2: {
							MannedSpacecraft spacecraftcreated = new MannedSpacecraft("Skylab",75000,"Rusia",7);
							spacecraftcreated.activateThrusters();
							spacecraftcreated.disableThrusters();
							JOptionPane.showInputDialog("Nave Apolo creada con las siguientes caracteristicas\n"+"Nombre : "+spacecraftcreated.name+"\n"+
							"Peso : "+spacecraftcreated.weight+"\n"+"Creado por : "+spacecraftcreated.developingCountry+"\n"
							+"Capacidad de personas : "+spacecraftcreated.capacityForPeople);
							break;
						}
						default:
							JOptionPane.showInputDialog("no coincide");
			                break;
						}
	                break;	
	            case 3:
	            	JOptionPane.showInputDialog("Has finalizado la creacion de naves");
	            	break;	            	
	            default:
	            	JOptionPane.showInputDialog("no coincide");
	                break;	                
	        			}	        
	     }while(number!=3);	
   }	
}