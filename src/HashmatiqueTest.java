
public class HashmatiqueTest {

	public static void main(String[] args) {
		Hashmatique output = new Hashmatique();
		
		
		/* Method 1:  Create a album trackList of type HashMap */
		System.out.println("<-------Method 1 Test Begin-------->"); // Spacer
		output.createAlbum();  // Create a new album
		System.out.println(""); // Spacer
		
		
		
		/* Method 2:  Add in at least 4 songs that are stored by title */
		System.out.println("<-------Method 2 Test Begin-------->"); // Spacer
		output.putTracks("K.Flay - Champagne", "Champange in the kitchen not because I bought it but because I'm crashing an apartment and somebody left it open. So I poured it in a cup, drank it up. I got the devil in my head but angels swimming in my blood.");
		// Add new tracks to the HashMap - stored by title 
		
		output.putTracks("Twenty One Pilots - Chlorine", "Sippin' on straight chlorine, Let the vibe slide over me, This beat is a chemical, beat is a chemical, When I leave don't save my seat, I'll be back when it's all complete, The moment is medical, moment is medical.");
		// Add new tracks to the HashMap - stored by title 
		
		output.putTracks("Ayokay, Quinn XCII - Kings of Summer", "I've been out here waiting for nightfall. It feels so right when the lights don't fade. Days like these don't last so we might stall. We been living like kings and we hope it don't change.");
		// Add new tracks to the HashMap - stored by title 
		
		output.putTracks("Mike Snow - Genghis Khan", "I know there's no form and no labels to put on, to this thing we keep and dip into when we need, and I don't have the right to ask where you go at night, but the waves hit my head to think someone's in your bed");
		// Add new tracks to the HashMap - stored by title
		
		output.putTracks("Glass Animals - Life Itself", "Daddy was dumb, said that I'd be something special. Brought me up tough but I was a gentle human. Said that he loved each of my two million freckles. When I grew up was gonna be a superstar.");
		// Add new tracks to the HashMap - stored by title  
		System.out.println(""); // Spacer
		
		
		
		/* Method 3:  Pull out one of the songs by its track title */
		System.out.println("<-------Method 3 Test Begin-------->"); // Spacer
		output.pullTracks("Ayokay, Quinn XCII - Kings of Summer");	// Track recall by title 
		System.out.println(""); // Spacer
		
		
		
		/* Method 4:  Print out all the track names and lyrics in the format Track: Lyrics */
		System.out.println("<-------Method 4 Test Begin-------->"); // Spacer
		output.getAlbum(); // Album Track & Lyrics Recall
		System.out.println(""); // Spacer
		
		
		
	}

}
