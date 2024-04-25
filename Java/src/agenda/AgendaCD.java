package agenda;
public class AgendaCD implements TDAContacto {
	private Nodo Agenda;
	
	public void InicializarAgenda() {
		Agenda=null;
	}
	
	public void AgregarContacto(Contacto contacto) {
		if (!this.BuscarDNI(contacto.dni)) {
			Nodo Nuevo= new Nodo();
			Nuevo.info=contacto;
			Nuevo.sig=Agenda;
			Agenda=Nuevo;
		}
	}	
	
	public Nodo BuscarEdad(int x) {
		Nodo arr=null;
		Nodo aux= Agenda;
		while (aux!=null)
			if (aux.info.edad==x) {
				Nodo Nuevo=new Nodo();
				Nuevo=aux;
				arr.sig=Nuevo;
			}
			aux= aux.sig;
		return (arr);
	}
	
	
	public boolean AgendaVacia() {
		return (Agenda==null);
	}
	
	public void EliminarContacto(int x) {
		if (Agenda!=null) {
			if (Agenda.info.dni==x) {
				Agenda=Agenda.sig;
			}else {
				Nodo aux= Agenda;
				while (aux.sig!=null && aux.info.dni!=x)
					aux=aux.sig;
				if (aux!=null)
					aux.sig=aux.sig.sig;
			}
		}
	}
	
	public boolean BuscarDNI(int x) {
		Nodo aux= Agenda;
		while (aux!=null && aux.info.dni!=x)
			aux= aux.sig;
		return (aux!=null);
	}
	
	public Nodo EsMayordeEdad() {
		Nodo arr=null;
		Nodo aux= Agenda;
		while (aux!=null)
			if (aux.info.edad>=18) {
				Nodo Nuevo=new Nodo();
				Nuevo=aux;
				arr.sig=Nuevo;
			}
			aux= aux.sig;
		return (arr);
	}
	
	
}
