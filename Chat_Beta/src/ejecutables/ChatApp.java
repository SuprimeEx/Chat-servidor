package ejecutables;
import java.net.InetAddress;

import Hilos_CLiente.Cliente;
public class ChatApp {
	public static void main(String[] args) {
		try {
			//Direccion ip del servidor a mano
			//InetAddress ip = InetAddress.getByName("192.168.1.80");
			Cliente cliente = new Cliente(InetAddress.getLocalHost(),6000);
			cliente.iniciar();
		} catch (Exception e) {
			System.err.println("falla");
		}
	}
}
