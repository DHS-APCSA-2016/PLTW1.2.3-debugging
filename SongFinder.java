public class SongFinder
{
   public static int findTitle(Song[] songs, String target){
     for (int i = 0; i < songs.length; i++){

         word = songs[i].getTitle();
         if (word.equals(target)) {
             return i;
         }
         else return -1;
        }
        return -1;
   }
   
  /*    PLTW 1.2.3 # 10   */
  
   public static int getIndexLastDiscount(Song[] songs, double compare){
    if (songs == null) return -1;

    int found = -1;
    for (int i = songs.length - 1; i >=0; i--) {
        if (songs[i].getPrice() < compare) {
            found = i;
        }
        else {
            found = -1; // to show none found
        }
    }
    return found;
}



/**
 * #13
 * Search through all songs, checking for blank titles.
 * If blank title is found, return -1 to indicate an error.
 * If all titles are "well-defined", return the last index in the array.
 */
public static int getIndexLastTitle(Song[] songs)
{
    int i;
    if (songs == null) {
       return -1;
    }
    for (i = 0; i < songs.length; i++) {
       // skip if no title
       if (songs[i].getTitle().equals("")) {
           return -1;
       }
    }
    return i;
}

}