package pro.poo.contraseña.copy;

public class Contrasena {
	
	/*
	 * longitud por defecto
	 */
	
	private final static int long_def= 8;
	
	//atibutos
	
	private int longitud;
	private String contrasena;
	
	
	//constructor
	
	public Contrasena(int longitud, String contrasena) {
		super();
		this.longitud = longitud;
		this.contrasena = contrasena;
	}
	//Un constructor con la longitud que nosotros le pasemos
	
	public Contrasena() {
		this(long_def);
	}

	public Contrasena(int longitud) {
		this.longitud = longitud;
		contrasena = generarContrasena();
	}
	
	//get y set
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public static int getLongDef() {
		return long_def;
	}
	
	
	//Metodos
	/*
	 *  esFuerte() devuelve un booleano / para si bede tener 2 mayusc, mas de 1 min y + de 5 num
	 */
	public boolean esFuerte() {
		int cuentaNum = 0;
		int cuentaMayusculas = 0;
		int cuentaMin = 0;
		//comprobamos caracter por caracter 
		for(int i = 0; i < contrasena.length(); i++) {
			if(contrasena.charAt(i)>=97 && contrasena.charAt(i)<=122) {
				cuentaMin +=1;
			}else {
				if(contrasena.charAt(i)>=65 && contrasena.charAt(i)<=90) {
					cuentaMayusculas +=1;
				}else {
					cuentaNum +=1;
				}
			}
		}
		//Si la constraseña tiene mas de 5 numeros, mas de 1 minuscula y mas de 2 mayusculas
        if (cuentaNum>=5 && cuentaMin>=1 && cuentaMayusculas>=2){
		        return true;
		    }else{
		        return false;
    }
		
	}
	
	/*
	 *  gernerarContrasena() genera la contraseña del objeto con la longitud que tenga
	 */
	public String generarContrasena() {
		String contra = "";
		//Generamos un numero aleatorio, segun este elige si añadir una minuscula, mayuscula o numero
        int eleccion=((int)Math.floor(Math.random()*3+1));

        if (eleccion==1){
            char minusculas=(char)((int)Math.floor(Math.random()*(123-97)+97));
            contra+=minusculas;
        }else{
            if(eleccion==2){
                char mayusculas=(char)((int)Math.floor(Math.random()*(91-65)+65));
                contra+=mayusculas;
            }else{
                char numeros=(char)((int)Math.floor(Math.random()*(58-48)+48));
                contra+=numeros;
            }
        }
		return contrasena;
		
	}

}
