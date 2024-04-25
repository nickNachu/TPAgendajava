package agenda;

public interface TDAContacto {
	void InicializarAgenda();
	void AgregarContacto(Contacto contacto);
	Nodo BuscarEdad(int x);
	boolean AgendaVacia();
	void EliminarContacto(int x);
	Nodo EsMayordeEdad();
	boolean BuscarDNI(int x);
}
