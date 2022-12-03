public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача №1");
        int applesCount = 5;
        System.out.println("Значение applesCount с типом int равно "+applesCount );
       byte peopleCount = 4;
        System.out.println("Значение peopleCount с типом byte равно "+peopleCount );
        short catsCount = 3;
        System.out.println("Значение catsCount с типом short равно "+catsCount );
        long housesCount = 8_000_000_000L;
        System.out.println("Значение housesCount с типом long равно "+housesCount );
        float pi = 3.141592F;
        System.out.println("Значение pi с типом  float равно "+pi );
        double e = 2.8;
        System.out.println("Значение e с типом  double равно "+e);
        //Задача 2
        System.out.println("Задача №2");
        float one = 27.12F;
        long two = 987_678_965_549L;
        double tree = 2.786;
        boolean four = false;
        char five = 569;
        short six = -159;
        int seven = 27897;
        byte eight = 67;

        //Задача 3
        System.out.println("Задача №3");
        int pupilsInFirstClass = 23;
        int pupilsInSecondClass = 27;
        int pupilsInThirdClass = 30;
        int paperCount = 480;
        int peperPerPupil = paperCount/(pupilsInFirstClass+pupilsInSecondClass+pupilsInThirdClass);
        System.out.println("На каждого ученика рассчитано "+peperPerPupil+ " листов бумаги");

        //Задача 4
        System.out.println("Задача №4");
        int bottles = 16;
        int minutes = 2;
        int productivityPerMinute = bottles/minutes;
        int twentyMinutes = 20;
        System.out.println("За " +twentyMinutes+ " минут машина произвела бутылок " + productivityPerMinute * twentyMinutes + " штук");
        int minutesInDay = 24*60;
        System.out.println("За " +minutesInDay+ " минут машина произвела бутылок " + productivityPerMinute * minutesInDay + " штук");
        int minutesInTreeDays = 3 * minutesInDay;
        System.out.println("За " +minutesInTreeDays+ " минут машина произвела бутылок " + productivityPerMinute * minutesInTreeDays + " штук");
        int minutesInMonth = 10 *  minutesInTreeDays;
        System.out.println("За " +minutesInMonth+ " минут машина произвела бутылок " + productivityPerMinute * minutesInMonth + " штук");
        //Задача 5
        System.out.println("Задача №5");
        int totalCans = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;
        int totalClasses = totalCans / ( brownCansPerClass+whiteCansPerClass);
        int totalWhiteCans = totalClasses * whiteCansPerClass;
        int totalBrownCans = totalClasses * brownCansPerClass;
        System.out.println ("В школе, где " +totalClasses + " классов, нужно " +totalWhiteCans + " банок белой краски и " +totalBrownCans+ " банок коричневой краски");
     //Задача 6
     System.out.println("Задача №6");

    }
}