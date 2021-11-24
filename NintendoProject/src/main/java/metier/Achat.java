package metier;

import java.time.LocalDate;

public class Achat 
{
	private Jeu j;
	private LocalDate date;
	private double prix;
	public Jeu getJ() {
		return j;
	}
	public void setJ(Jeu j) {
		this.j = j;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public Achat(Jeu j, LocalDate date, double prix) {
		super();
		this.j = j;
		this.date = date;
		this.prix = prix;
	}
	@Override
	public String toString() {
		return "Achat [j=" + j + ", date=" + date + ", prix=" + prix + "]";
	}
	
	
}
