package patron.state;

public class HabitacionMantenimiento implements HabitacionEstado {

	@Override
	public HabitacionEstado ocupar() {
		System.out.println("la habitacion no se puede ocupar");
		return this;
	}

	@Override
	public HabitacionEstado liberar() {
		System.out.println("la habitacion se ha liberado");
		return new HabitacionOcupadaVacia();
	}

	@Override
	public HabitacionEstado limpiar() {
		System.out.println("la habitacion no ha cambiado de estado");
		return this;
	}

	@Override
	public HabitacionEstado salir() {
		System.out.println("la habitacion no ha cambiado de estado");
		return this;
	}

}
