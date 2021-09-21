package day12.task4;


import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>();

        List<String> members1 = new ArrayList<>();
        members1.add("Роджер Уотерс");
        members1.add("Ричард Райт");
        members1.add("Сид Барретт");
        members1.add("Дэвид Гилмор");

        List<String> members2 = new ArrayList<>();
        members2.add("Брайан Мэй");
        members2.add("Роджер Тейлор");
        members2.add("Фредди Меркьюри");
        members2.add("Джон Дикон");


        bands.add(new MusicBand("Pink floyd", 1967, members1));
        bands.add(new MusicBand("Queen", 1970, members2));

        System.out.println(bands);

        MusicBand.transferMembers(members1, members2);

        System.out.println(bands.get(0).printMembers());
        System.out.println(bands.get(1).printMembers());

    }
}
