public class Main {
    public static void main(String[] args) {
        // Задача 1.1
        int clientOS = 1;

        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задача 1.2
        boolean clientOSAndroid = false;

        if (!clientOSAndroid) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задача 2
        int clientDeviceYear = 2014;
        clientOS = 0;
        String result;

        if (clientDeviceYear <= 2015) {
            result = (clientOS == 0)
                    ? "Установите облегченную версию для iOS по ссылке"
                    : "Установите облегченную версию для Android по ссылке";
        } else {
            result = (clientOS == 0)
                    ? "Установите версию для iOS по ссылке"
                    : "Установите версию для Android по ссылке";
        }
        System.out.println(result);

        // Задача 3
        int year = 2024;

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        // Задача 4
        int deliveryDistance = 50;
        int daysToDeliver = 0;

        if (deliveryDistance <= 20) {
            daysToDeliver++;
            System.out.println("Потребуется дней: " + daysToDeliver);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            daysToDeliver = daysToDeliver + 2;
            System.out.println("Потребуется дней: " + daysToDeliver);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            daysToDeliver = daysToDeliver + 3;
            System.out.println("Потребуется дней: " + daysToDeliver);
        } else {
            System.out.println("Доставки нет");
        }

        // Задача 5
        int monthNumber = 12;

        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Такого месяца нет");
        } else switch (monthNumber) {
            case 1:
                System.out.println("Январь принадлежит к сезону зима");
                break;
            case 2:
                System.out.println("Февраль принадлежит к сезону зима");
                break;
            case 3:
                System.out.println("Март принадлежит к сезону весна");
                break;
            case 4:
                System.out.println("Апрель принадлежит к сезону весна");
                break;
            case 5:
                System.out.println("Май принадлежит к сезону весна");
                break;
            case 6:
                System.out.println("Июнь принадлежит к сезону лето");
                break;
            case 7:
                System.out.println("Июль принадлежит к сезону лето");
                break;
            case 8:
                System.out.println("Август принадлежит к сезону лето");
                break;
            case 9:
                System.out.println("Сентябрь принадлежит к сезону осень");
                break;
            case 10:
                System.out.println("Октябрь принадлежит к сезону осень");
                break;
            case 11:
                System.out.println("Ноябрь принадлежит к сезону осень");
                break;
            case 12:
                System.out.println("Декабрь принадлежит к сезону зима");
                break;
        }

        // Задача 5.1
        monthNumber = 12;

        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Такого месяца нет");
        } else switch (monthNumber) {
            case 1, 2, 12 -> System.out.println("Зима");
            case 3, 4, 5 -> System.out.println("Весна");
            case 6, 7, 8 -> System.out.println("Лето");
            case 9, 10, 11 -> System.out.println("Осень");
        }
    }
}
