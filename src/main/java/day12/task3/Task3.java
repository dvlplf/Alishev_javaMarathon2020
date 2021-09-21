//package day12.task3;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class Task3 {
//    public static void main(String[] args) {
//        List <MusicBand> musicBandList = new ArrayList<>();
//        musicBandList.add(new MusicBand("Pink Floyd", 1990));
//        musicBandList.add(new MusicBand("Queen", 2000));
//        musicBandList.add(new MusicBand("Metallica", 2010));
//        musicBandList.add(new MusicBand("Nirvana", 2050));
//        musicBandList.add(new MusicBand("Fiction Factory", 1890));
//        musicBandList.add(new MusicBand("Fiedel Michel", 1970));
//
//
//        System.out.println(Arrays.toString(musicBandList.toArray()));
//        System.out.println(Arrays.toString(groupsAfter2000(musicBandList).toArray()));
//
//
//    }
//
//    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
//        List<MusicBand> groupsAfter2000 = new ArrayList<>();
//        for (MusicBand band: bands) {
//            if (band.getYear() > 2000) {
//                groupsAfter2000.add(band);
//            }
//        }
//        return  groupsAfter2000;
//    }
//}


