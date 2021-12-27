package gameutils;

import java.util.Random;

public class GameUtils {

    //Получаем рандомное значение граней от 1 до 4
    public static byte rollFourFacetsDice() {
        Random random = new Random();
        int first = 1;
        int last = 4;
        byte fourFacets = (byte) (first + random.nextInt(last - first));
        System.out.println(fourFacets);
        return (fourFacets);
    }

    //Получаем рандомное значение граней от 1 до 6
    public static byte rollSixFacetsDice() {
        Random random = new Random();
        int first = 1;
        int last = 6;
        byte sixFacets = (byte) (first + random.nextInt(last - first));
        System.out.println(sixFacets);
        return (sixFacets);
    }

    //Получаем рандомное значение граней от 1 до 8
    public static byte rollEightFacetsDice() {
        Random random = new Random();
        int first = 1;
        int last = 8;
        byte eightFacets = (byte) (first + random.nextInt(last - first));
        System.out.println(eightFacets);
        return (eightFacets);
    }

    //Получаем рандомное значение граней от 1 до 12
    public static byte rollTwelveFacetsDice() {
        Random random = new Random();
        int first = 1;
        int last = 12;
        byte twelveFacets = (byte) (first + random.nextInt(last - first));
        System.out.println(twelveFacets);
        return (twelveFacets);
    }

    //Получаем рандомное значение граней от 1 до 20
    public static byte rollTwentyFacetsDice() {
        Random random = new Random();
        int first = 1;
        int last = 20;
        byte twentyFacets = (byte) (first + random.nextInt(last - first));
        System.out.println(twentyFacets);
        return (twentyFacets);
    }

    //Получаем рандомное значение граней от 0 до 9
    public static byte rollTenFacetsDice() {
        Random random = new Random();
        int first = 0;
        int last = 9;
        byte tenFacets = (byte) (first + random.nextInt(last - first));
        System.out.println(tenFacets);
        return (tenFacets);
    }

    /* Получаем рандомное значение граней от 00 до 90
    Если выпало значение 00 - добавляем спереди нолик
    Если выпало значение не 00 - добавляем нолик сзади
    */
    public static byte rollDecFacetsDice() {
        Random random = new Random();
        int dec[] = {00,10,20,30,40,50,60,70,80,90};
        byte decFacets = (byte) (00 + random.nextInt(dec.length));
        if (decFacets==00) {
            System.out.println("0" + decFacets);
        } else {
            System.out.println(decFacets + "0");
        }
        return (decFacets);
    }
}
