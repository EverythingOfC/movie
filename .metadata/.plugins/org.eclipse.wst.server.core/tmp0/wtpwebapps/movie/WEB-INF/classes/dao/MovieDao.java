package dao;

public class MovieDao {
	private static MovieDao instance = new MovieDao();
	
	private MovieDao() {
		
	}
	public static MovieDao getInstance() {
		return instance;
	}
}