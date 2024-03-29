public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("Task1");
        int salary = 15000;
        int total =0;
        int month = 0;
        int result = 2459000;
        while (total <= result){
            total = total + salary;
            total = total + total/100;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println(month);

        //task2
        System.out.println("Task2");
        int i = 1;
        while (i <= 10){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i >= 1; i--){
            System.out.print(i + " ");
        }
        System.out.println();

        //task3
        System.out.println("Task3");
        int population = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        for (int year = 1; year <= 10; year++){
            population = population + (population / 1000 * (birthRate - deathRate));
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        System.out.println("Через 10 лет численность населения будет состовлять " + population + " человек");

        //task4
        System.out.println("Task4");
        int money = 15_000;
        int totalMoney = 12_000_000;
        int monthNumber = 0;
        while (money <= totalMoney){
            money += (money * 7)/100;
            monthNumber++;
            System.out.println("Месяц " + monthNumber + ", сумма накоплений - " + money + " рублей");
        }
        System.out.println("Василию понадобится " + monthNumber + " месяцев");

        //task5
        System.out.println("Task5");
        int money1 = 15_000;
        int totalMoney1 = 12_000_000;
        int monthNumber1 = 0;
        while (money1 <= totalMoney1){
            money1 += (money1 * 7)/100;
            monthNumber1++;
            if (monthNumber1 % 6 == 0){
                System.out.println("Месяц " + monthNumber1 + ", сумма накоплений - " + money1 + " рублей");
            }
        }

        //task6
        System.out.println("Task6");
        int balance = 15_000;
        int numberOfMonth = 0;
        int numberOfYear = 9;
        while (numberOfMonth <= numberOfYear * 12){
            balance += (balance * 7)/100;
            numberOfMonth++;
            if (numberOfMonth % 6 ==0){
                System.out.println("Сумма накоплений Василия за " + numberOfMonth + " месяцев = " + balance + " рублей");
            }
        }

        //task7
        System.out.println("Task7");
        for (int friday = 6; friday <= 31; friday += 7){
            System.out.println("Сегодня пятница, " + friday +  " число. Необходимо подготовить отчет");
        }

        //task8
        System.out.println("Task8");
        int thisYear = 2024;
        int periodOne = thisYear - 200;
        int periodTwo = thisYear + 100;
        for (int year = 0; year <= periodTwo; year += 79){
            if (periodOne <= year){
                System.out.println(year);
            }
        }
    }
}