import java.util.ArrayList;
import java.util.Scanner;
class Playlist {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<String> playlist=new ArrayList<>();
        System.out.println("My first song:");
        String firstSong=scanner.nextLine();
        playlist.add(firstSong);
        System.out.println("My second song:");
        String secondSong=scanner.nextLine();
        playlist.add(secondSong);
        System.out.println("My third song:");
        String thirdSong=scanner.nextLine();
        playlist.add(thirdSong);
		System.out.println("My fourth song:");
        String fourthSong=scanner.nextLine();
        playlist.add(fourthSong);
		System.out.println("My fifth song:");
        String fifthSong=scanner.nextLine();
        playlist.add(fifthSong);
        playlist.remove(1);
		playlist.get(2);
        System.out.println("Contains 'Animal'? " + playlist.contains("Animal"));
        System.out.println("Playlist:");
        for (String song:playlist) {
            System.out.println(song);
        }
    }
}