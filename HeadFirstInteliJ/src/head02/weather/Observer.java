package head02.weather;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
