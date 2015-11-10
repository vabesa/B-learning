package backend;

public class Semana {
	public Semana(int numero, String mes, String lunes, String martes, String miercoles, String jueves, String viernes, String sabado, String domingo) {
		super();
		this.numero = numero;
		this.mes = mes;
		this.lunes = lunes;
		this.martes = martes;
		this.miercoles = miercoles;
		this.jueves = jueves;
		this.viernes = viernes;
		this.sabado = sabado;
		this.domingo = domingo;
	}
	public int numero;
	public String mes;
	public String lunes;
	public String martes;
	public String miercoles;
	public String jueves;
	public String viernes;
	public String sabado;
	public String domingo;

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getLunes() {
		return lunes;
	}
	public void setLunes(String lunes) {
		this.lunes += lunes + " - ";
	}
	public String getMartes() {
		return martes;
	}
	public void setMartes(String martes) {
		this.martes += martes + " - ";
	}
	public String getMiercoles() {
		return miercoles;
	}
	public void setMiercoles(String miercoles) {
		this.miercoles += miercoles + " - ";
	}
	public String getJueves() {
		return jueves;
	}
	public void setJueves(String jueves) {
		this.jueves += jueves + " - ";
	}
	public String getViernes() {
		return viernes;
	}
	public void setViernes(String viernes) {
		this.viernes += viernes + " - ";
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public String getSabado() {
		return sabado;
	}
	public void setSabado(String sabado) {
		this.sabado = sabado;
	}
	public String getDomingo() {
		return domingo;
	}
	public void setDomingo(String domingo) {
		this.domingo = domingo;
	}

}
