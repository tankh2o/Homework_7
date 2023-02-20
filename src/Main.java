public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int savings = 29000;
        int percentages = 0;
        int i = 1;
        while (savings <= 2459000) {
            System.out.println("Месяц " + i + ", сумма накоплений равна " + savings + " рублей.");
            percentages = percentages + savings / 100;
            savings = savings + percentages;
            i = i + 1;
        }

        System.out.println("Задача 2");
        int a = 1;
        while (a <= 10) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();
        for (a = 10; a >= 1 && a <= 10; a = a - 1) {
            System.out.print(a + " ");
        }

        System.out.println();
        System.out.println("Задача 3");
        long populationSize = 12000000l;
        int populationGrowth = 17;
        int mortality = 8;
        long population_year;
        for (int year = 0; year <= 10; year = year + 1) {
            population_year = populationSize / 1000 + populationGrowth - mortality;
            populationSize = populationSize + population_year;
            System.out.println("Год " + year + ", численность населения составляет " + populationSize + ".");
        }

        System.out.println("Задача 4");
        int depositAmount = 15000;
        int month = 0;
        int percenTages;
        while (depositAmount <= 12000000) {
            System.out.println("Месяц " + month + ", сумма накоплений составляет " + depositAmount + ".");
            percenTages = depositAmount * 7 / 100;
            depositAmount = depositAmount + percenTages;
            month++;
        }

        System.out.println("Задача 5");
        int depositAmount_5 = 15000;
        int percenTages_5;
        int month_5 = 0;
        for (; depositAmount_5 <= 12000000; month_5++) {
            percenTages_5 = depositAmount_5 * 7 / 100;
            depositAmount_5 = depositAmount_5 + percenTages_5;
            if (month_5 % 6 == 0) {
                System.out.println("Месяц " + month_5 + ", сумма накоплений составляет " + depositAmount_5 + ".");
            }
        }
        System.out.println(depositAmount_5);

        System.out.println("Задача 6");
        int buildup = 15000;
        int percen;
        for (int team = 0; team <= 9 * 12; team = team + 1) {
            percen = buildup * 7 / 100;
            buildup = buildup + percen;
            if (team % 6 == 0) {
                System.out.println("В " + team + " месяц у вас будет накоплена эта сумма: " + buildup);
            }
        }

        System.out.println("Задача 7");
        for (int friday = 1; friday >= 1 && friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчёт.");
        }

        System.out.println("Задача 8");
        int ourYear = 2023;
        int untilOurYear = ourYear - 200;
        int afterOurYear = ourYear + 100;
        for (int yearComet = 79; yearComet <= afterOurYear;  yearComet = yearComet + 79) {
            if (yearComet >= untilOurYear) {
                System.out.println(yearComet);
            }
        }
    }
}