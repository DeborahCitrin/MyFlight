//Deborah e Pietra
//adicionamos os métodos distância na classe. Um deles é estático e recebe dois objetos do tipo Geo e retorna a distância entre eles e o outro não é estático e recebe somente um objeto e retorna a distância entre esse objeto e os dados armazenados - 30/08 e 12/09

import java.lang.Math;

public class Geo {
	private double latitude;
	private double longitude;
	
	public Geo(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}

	public static double distancia(Geo a, Geo b)
	{
		double senLat = Math.sin((Math.toRadians(a.getLatitude()) - Math.toRadians(b.getLatitude()))/2);
		senLat *= senLat;

		double senLong = Math.sin((Math.toRadians(a.getLongitude()) - Math.toRadians(b.getLongitude()))/2);
		senLong *= senLong;

		double vezes = senLong * Math.cos(Math.toRadians(a.getLatitude())) * Math.cos(Math.toRadians(b.getLatitude()));

		double soma = senLat + vezes;
		soma = Math.sqrt(soma);

		return 2 * 6371 * (Math.asin(Math.sqrt(soma)));
	}

	public double distancia(Geo outro)
	{
		double senLat = Math.sin((this.getLatitude() - outro.getLatitude())/2);
		senLat *= senLat;

		double senLong = Math.sin((this.getLongitude() - outro.getLongitude())/2);
		senLong *= senLong;

		double vezes = senLong * Math.cos(this.getLatitude()) * Math.cos(outro.getLatitude());

		double soma = senLat + vezes;
		soma = Math.sqrt(soma);

		return 2 * 6371 * (Math.asin(Math.sqrt(soma)));
	}

	//Ver o exercício 2 do Sobregarga... 
	//Dados Armazenados??
}
