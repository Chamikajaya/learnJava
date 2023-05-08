package com.learn.lambda;

import java.util.List;
import java.util.stream.Collectors;

class Song {
    private final String genre;
    private final int year;
    private final int timesPlayed;
    private final String title;

    public Song(String title, String artist, String genre, int year, int timesPlayed) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.year = year;
        this.timesPlayed = timesPlayed;
    }

    private final String artist;

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public int getTimesPlayed() {
        return timesPlayed;
    }


}

class Songs {
    // This method is used to return a list with Song class objects (Inside the list returned by getSongs method are objects created from the Song class)
    public List<Song> getSongs() {
        return List.of(
                new Song("$10", "Hitchhiker", "Electronic", 2016, 183),
                new Song("Havana", "Camila Cabello", "R&B", 2017, 324),
                new Song("Cassidy", "Grateful Dead", "Rock", 1972, 123),
                new Song("50 ways", "Paul Simon", "Soft Rock", 1975, 199),
                new Song("Hurt", "Nine Inch Nails", "Industrial Rock", 1995, 257),
                new Song("Silence", "Delerium", "Electronic", 1999, 134),
                new Song("Hurt", "Johnny Cash", "Soft Rock", 2002, 392),
                new Song("Watercolour", "Pendulum", "Electronic", 2010, 155),
                new Song("The Outsider", "A Perfect Circle", "Alternative Rock", 2004, 312),
                new Song("With a Little Help from My Friends", "The Beatles", "Rock", 1967, 168),
                new Song("Come Together", "The Beatles", "Blues rock", 1968, 173),
                new Song("Come Together", "Ike & Tina Turner", "Rock", 1970, 165),
                new Song("With a Little Help from My Friends", "Joe Cocker", "Rock", 1968, 46),
                new Song("Immigrant Song", "Karen O", "Industrial Rock", 2011, 12),
                new Song("Breathe", "The Prodigy", "Electronic", 1996, 337),
                new Song("What's Going On", "Gaye", "R&B", 1971, 420),
                new Song("Hallucinate", "Dua Lipa", "Pop", 2020, 75),
                new Song("Walk Me Home", "P!nk", "Pop", 2019, 459),
                new Song("I am not a woman, I'm a god", "Halsey", "Alternative Rock", 2021, 384),
                new Song("Pasos de cero", "Pablo Alborán", "Latin", 2014, 117),
                new Song("Smooth", "Santana", "Latin", 1999, 244),
                new Song("Immigrant song", "Led Zeppelin", "Rock", 1970, 484),
                new Song("Love Story", "Taylor Swift", "Country Pop", 2008, 235),
                new Song("Can't Help Falling in love", "Elvis Presley", "Pop", 1961, 180),
                new Song("What Is LOve", "Haddaway", "Eurodance", 1993, 247),
                new Song("Endless LovE", "Diana Ross and Lionel Richie", "R&B", 1981, 267),
                new Song("I Will Always lOVE You", "Whitney Houston", "R&B", 1992, 273) );

    }
}


public class Diner {
    public static void main(String[] args) {
        Songs songs = new Songs();
        List<Song> allSongs = songs.getSongs();  // Stores all songs objects inside a list
        // Find every song which belongs to any rock category
        List<Song> rockSongs = allSongs.stream().filter(song -> song.getGenre().contains("Rock")).collect(Collectors.toList());
        //rockSongs.forEach(song -> System.out.println("Title -> " + song.getTitle() + "  Artists -> "+ song.getArtist()));
        /****************************************************************/
        //Find all songs released after the year 2000
        List<Song> after2000 = allSongs.stream().filter(song -> song.getYear() > 2000).collect(Collectors.toList());
        //Find the song with the highest number of times played.
        Song mostPlayedSong = allSongs.stream().sorted((song1, song2) -> song1.getTimesPlayed() - song2.getTimesPlayed()).findFirst().orElse(null);
        if (mostPlayedSong != null) {
            System.out.println("Top played track is -> " + mostPlayedSong.getTitle());
        }
        // Find all songs belonging to the "Electronic" genre and played more than 150 times.
        // List<Song> topEDM = allSongs.stream().filter(song -> song.getGenre().contains("Electronic")).filter(song -> song.getTimesPlayed() > 150).collect(Collectors.toList());
        // System.out.println("Electronic tracks with more than 150 playbacks are -->");
        // topEDM.forEach(song -> System.out.println(song.getTitle() + " --> " + song.getTimesPlayed()));

        // Find all songs that have the word "love" in their title, ignoring case.
        List<Song> romantic = allSongs.stream().filter(song -> song.getTitle().toLowerCase().contains("love")).collect(Collectors.toList());
        romantic.forEach(song -> System.out.println(song.getTitle()));
        }




    }

