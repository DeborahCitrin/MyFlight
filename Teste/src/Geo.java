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
		double lat1 = Math.toRadians(a.getLatitude());
		double lat2 = Math.toRadians(b.getLatitude());
		double long1 = Math.toRadians(a.getLongitude());
		double long2 = Math.toRadians(b.getLongitude());

		double senLat = Math.sin((lat1 - lat2)/2);

		double senLong = Math.sin((long1 - long2)/2);

		double d = Math.pow(senLat, 2) + Math.pow(senLong, 2) * Math.cos(lat1) * Math.cos(lat2);
		d = 2 * 6371 * Math.asin(Math.sqrt(d));

		return d;
	}

	public double distancia(Geo outro)
	{
		double senLat = Math.sin(Math.toRadians((this.getLatitude()) - Math.toRadians(outro.getLatitude()))/2);
		senLat *= senLat;

		double senLong = Math.sin(Math.toRadians((this.getLongitude()) - Math.toRadians(outro.getLongitude()))/2);
		senLong *= senLong;

		double vezes = senLong * Math.cos(Math.toRadians(this.getLatitude())) * Math.cos(Math.toRadians(outro.getLatitude()));

		double soma = senLat + vezes;
		soma = Math.sqrt(soma);

		return 2 * 6371 * (Math.asin(Math.sqrt(soma)));
	}
}
