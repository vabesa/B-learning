package backend;

public class Nota {
	public Nota(String Curso) {
		super();
		this.curso = Curso;
		this.notas = "";
		this.listanotas = new double[100];
		this.contadorlista = 0;
		this.promedio = 0;
		this.promedio_string = "0";

	}
	public String curso;
	public String notas;
	public double[] listanotas;
	public int contadorlista;
	public double promedio;
	public String promedio_string;

	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getNotas() {
		return notas;
	}
	public void setNotas(String notas) {
		this.notas += notas + " - ";
	}
	public double[] getListanotas() {
		return listanotas;
	}
	public void setListanotas(double[] listanotas) {
		this.listanotas = listanotas;
	}
	public double getPromedio() {
		return promedio;
	}
	public void setPromedio() {
		double suma = 0;
		int contador = 0;
		for (double d: this.getListanotas()){
			suma += d;
			contador += 1;
		}
		this.promedio = suma/contador;
	}
	public String getPromedio_string() {
		return promedio_string;
	}
	public void setPromedio_string() {
		this.promedio_string = String.valueOf(this.getPromedio());
	}
	public int getContadorlista() {
		return contadorlista;
	}
	public void setContadorlista(int contadorlista) {
		this.contadorlista = contadorlista;
	}


}
