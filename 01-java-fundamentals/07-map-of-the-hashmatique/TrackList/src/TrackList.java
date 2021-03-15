import java.util.HashMap;
import java.util.Set;

public class TrackList {

	public static void main(String[] args) {

		HashMap<String, String> tracklist = new HashMap<String, String>();

		tracklist.put("The Jungle", "Welcome to the jungle, we got fun and games");
		tracklist.put("Fuel", "Give me fuel give me fire give me what i desire");
		tracklist.put("We want it all", "I want it all, I want it all");
		tracklist.put("Hotel California", "Welcome to Hotel California");

		Set<String> keys = tracklist.keySet();
		for (String key : keys) {

			System.out.println(key + ": " + tracklist.get(key));
		}
	}
}
