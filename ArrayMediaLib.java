
/**
 * Maintain a collection of song, movie, and book titles.
 * 
 * @author ckinnard
 * @version 3/5/16
 */
public class ArrayMediaLib
{
    public static void main()
    {       
        /******* Part 2 *******/
        System.out.println("/******* Part 2 ******/");
        String[] sharingFriends = {"Jamal",
                "Emily",
                "Destiny",
               // "Mateo",
                "Sofia"  // notice no comma
            };

        for (int i = 0; i < sharingFriends.length; i++)
        {
            System.out.println(sharingFriends[i]);
        }

        /******* Part 3 *******/
        System.out.println("/******* Part 3 ******/");
        int total = 0;
        int[] daysBtwnPurchase = {2, 5, 1, 2, 4, 2, 1, 3};

        for (int d: daysBtwnPurchase) {
            total = total + d;
        }
        System.out.println("Average purhcase time is " + (double)total/daysBtwnPurchase.length);
       
        /******* Part 4 *******/
        System.out.println("/******* Part 4 ******/");

        Song[] topTenSongs = {
                new Song("The Twist"),
                new Song("Smooth"),
                new Song("Mack the Knife"),
                new Song("How Do I Live"),
                new Song("Party Rock Anthem"),
                new Song("I Gotta Feeling"),
                new Song("Macarena"),
                new Song("Physical"),
                new Song("You Light Up My Life"),
                new Song("Hey Jude")
            };
        // ---------------------------------------------display titles with for-each loop 
        for (Song s: topTenSongs)
        {
            System.out.println(s.getTitle());
        }

        // --------attempt to change object reference (but this does not change them!)
        System.out.println("--Change Titles--");
        System.out.println("—BEFORE--");
        for (Song changeSong: topTenSongs) {
            changeSong = new Song("test");
            System.out.println(changeSong.getTitle());
        }
        System.out.println("—AFTER--");
        for (Song showSong : topTenSongs) {
            System.out.println(showSong.getTitle());
        }

        // --------------change object references using standard for loop (which does change them)
        System.out.println("--Really Change Titles--");
        for(int i = 0; i < topTenSongs.length ; i++) {
            // commented out after testing so the rest of the code works
            //topTenSongs[i] = new Song("test");
        }
        for (Song showSong : topTenSongs) {
            System.out.println(showSong.getTitle());
        }

        // ------------------------------------------------- every third song gets a discount
        System.out.println("--Discount Prices--");
        int count = 1;
        for (Song song : topTenSongs) {
            if ((count % 3) == 0) {
                song.setPrice(.99); // later user song.setPrice(1.99);
            }
            else {
                song.setPrice(1.29); 
            }
            count++;
        }
        
  /* PLTW 1.2.3 # 11  
  
   */    
        index = SongFinder.getIndexLastDiscount(topTenSongs, 1.00);
        if (index >= 0 ) {
            System.out.println("Discount found " + topTenSongs[index].getTitle());
         }
         else {
            System.out.println("No songs are discounted");
        }


        // confirm by showing all prices:
        for (Song showSong : topTenSongs) {
            System.out.println(showSong.getTitle()+ " costs " + showSong.getPrice());
        }

        /******* Part 5 ******/
        System.out.println("/******* Part 5 ******/");          
        System.out.println("--Top 5 Song Titles--");
        for(int i = 0; i < 5 ; i++) {
            System.out.println(topTenSongs[i].getTitle());
        }
        System.out.println("--Ever other Song Title FOR--");
        for(int i = 0; i < topTenSongs.length ; i=i+2) {
            System.out.println(topTenSongs[i].getTitle());
        }
        System.out.println("--Ever other Song Title FOR-EACH --");
        int evens = 0;
        for (Song song : topTenSongs) {
            if ((evens % 2) == 0) {
                System.out.println(song.getTitle());
            }
            evens++;
        }
        
        /**************** PLTW 1.2.3 Songfinder Step 7 ********************
         *     replace Mack the knife with your 3rd song
         */
        int index = SongFinder.findTitle(topTenSongs, "Mack the Knife");
        if (index >=0 ) {
           System.out.println("Found " + topTenSongs[index].getTitle());
         }
           else  {
             System.out.println("Song not found!");
         }
         
       /**************** PLTW 1.2.3 Songfinder Step 15 ********************    
         System.out.println("--Find last song --");
         index = SongFinder.getIndexLastTitle(topTenSongs);
         if (index >= 0 ) {
             System.out.println("Last title: " + topTenSongs[index].getTitle());
            }
            else {
                System.out.println("You have a blank title!");
            }


    }
}

