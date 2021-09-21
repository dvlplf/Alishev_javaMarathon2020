package day12.task5;



import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>();
        List<MusicArtist> members1 = new ArrayList<>();
        List<MusicArtist> members2 = new ArrayList<>();

        bands.add(new MusicBand("Pink Floyd", 1970, members1));
        bands.add(new MusicBand("Queen", 1969, members2));

        members1.add(new MusicArtist("Роджер Уотерс", 1940));
        members1.add(new MusicArtist("Ричард Райт", 1944));
        members1.add(new MusicArtist("Сид Барретт", 1938));
        members1.add(new MusicArtist("Сид Барретт", 1938));

        members2.add(new MusicArtist("Дэвид Гилмор", 1935));
        members2.add(new MusicArtist("Дэвид Гилмор", 1935));
        members2.add(new MusicArtist("Дэвид Гилмор", 1935));
        members2.add(new MusicArtist("Дэвид Гилмор", 1935));

        System.out.println(bands.get(0).printMembers());
        System.out.println(bands.get(1).printMembers());

        MusicBand.transferMembers(members1, members2);

        System.out.println(bands.get(0).printMembers());
        System.out.println(bands.get(1).printMembers());
    }
}
