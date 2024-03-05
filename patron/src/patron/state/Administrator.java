package patron.state;

public class Administrator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Habitacion h= new Habitacion();
		
		h.ocupar();
		h.limpiar();
		h.salir();
		h.liberar();
		h.limpiar();
		h.ocupar();
		h.liberar();
		h.ocupar();
		h.liberar();
		h.limpiar();
		h.liberar();

	}

}
