import java.util.Set;
import java.util.HashMap;

public class Hashmatique {

	/* Objectives:
	* Create your first HashMap.
	* Iterate over a HashMap.  */
	
	
	// make the Hashmap available to all the methods below 
	public HashMap<String, String> album;
		
	
	/* Method 1:  Create a Album of type HashMap  */
	public void createAlbum(){
		album = new HashMap<String, String>();
		System.out.println("New album created, please add a new track!");
	}	

			
	
	/* Method 2:  Add in at least 4 songs that are stored by title */
	public void putTracks(String title,String lyrics){
		album.put(title, lyrics);
		System.out.println("New Track Added: " + title);
	}

	
	
	/* Method 3:  Pull out one of the songs by its track title */
	public void pullTracks(String title){
		String Lyrics = album.get(title);
		System.out.println(title + ": " + Lyrics);
	}
	
	
	
	/* Method 4:  Print out all the track names and lyrics in the format Track: Lyrics */
	public void getAlbum(){
		Set<String> keys = album.keySet();
		for (String key : keys) {
			System.out.println(key + ": " + album.get(key));
			System.out.println(""); // Spacer
		}
		
	}
	
}
