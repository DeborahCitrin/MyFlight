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
		double senLat = Math.sin((a.getLatitude()-b.getLatitude())/2);
		senLat *= senLat;

		double senLong = Math.sin((a.getLongitude() - b.getLongitude())/2);
		senLong *= senLong;

		double vezes = senLong * Math.cos(a.getLatitude()) * Math.cos(b.getLatitude());

		double soma = senLat + vezes;
		soma = Math.sqrt(soma);

		return 2 * 6371 * (Math.asin(Math.sqrt(soma)));
	}

	//Ver o exercício 2 do Sobregarga... 
	//Dados Armazenados??
}
