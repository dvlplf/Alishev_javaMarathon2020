package day12.task4;

import java.util.Arrays;
import java.util.List;

class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + Arrays.toString(members.toArray()) +
                '}';
    }

    public String printMembers() {
        return  "members=" + Arrays.toString(members.toArray()) + '}';
    }

    public static void transferMembers(List<String> members1, List<String> members2) {
        members1.addAll(members2);
        members2.clear();
    }
}
