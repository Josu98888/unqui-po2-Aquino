package ar.edu.unq.po2.tp6;
import java.util.ArrayList;
import java.util.List;

public class ServidorPop implements IServidor {
	
	private ArrayList<ClienteEmail> cliente = new ArrayList <ClienteEmail>(); //lista de clientes
	private ArrayList<Correo>nuevoCorreo= new ArrayList <Correo>(); //lista de nuevos correos
	
	public ServidorPop() {
		
	}
	
	public List<Correo> recibirNuevos(String user, String pass) {
		List<Correo> retorno = new ArrayList<Correo>();
		this.conectar(user, pass); 	//Verifica que el usuario sea valido y establece la conexion.
		retorno.addAll(nuevoCorreo);	//obtener emails Nuevos del usuario.//asignar a retorno la lista de los nuevos e-mails.
		return retorno;
	}

	public void conectar(String nombreUsuario, String passusuario) {
		if(this.verificarUsuario(nombreUsuario, passusuario)) {
			  System.out.println("Su conexion fue exitosa");
		  }
		 else System.out.println("Su usuario o contraseña son incorrectos");//Verifica que el usuario sea valido y establece la conexion.  	
	}
	
	public boolean verificarUsuario(String user, String pass) {
		boolean resultado= false;
		for(int i=0; i < cliente.size(); i++) {
			if (this.cliente.get(i).getNombreUsuario()== user && this.cliente.get(i).getPassusuario()== pass) {
				resultado=true;
			}
		}
		
		return resultado;
	}

	public void enviar(Correo correo) {
      //realiza lo necesario para enviar el correo.		
	}

	@Override
	public float tazaDeTransferencia() {
		//no corresponde
		return 0;
	}

	@Override
	public void resetear() {
         //no corresponde		
	}

	@Override
	public void realizarBackUp() {
		//no corresponde
		
	}
	
	public ArrayList<ClienteEmail> getCliente() {
		return cliente;
	}


	public void setCliente(ArrayList<ClienteEmail> cliente) {
		this.cliente = cliente;
	}
	
	public void agregarCliente(ClienteEmail cliente) {
		this.cliente.add(cliente);
		
	}

}
