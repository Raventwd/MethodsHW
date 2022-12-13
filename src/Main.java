public class Main {

    public static void getYearLeap(int year) {
        System.out.println("//Task 1");
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год вискосный");
        } else
            System.out.println(year + " год не високосный");
    }

    public static void getVersion(int clientDeviceYear, int clientOS) {
        System.out.println("//Task 2");
        if (clientOS == 1 && clientDeviceYear <= 2015) {     //clientOs = 1 - andoid os , clientOs = 0 - ios
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите  версию приложения для Android по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    public static int delivery(int deliveryDistance, int deliveryDays) {
        System.out.println("//Task 3");
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            deliveryDays += 1;
            return 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays += 2;
            return 3;
        } else {
            System.out.println("Не доставим");
        }
        return deliveryDays;
    }

    public static void main(String[] args) {
        int year = 2022;
        getYearLeap(year);

        int clientDeviceYear = 2014;
        int clientOs = 1;
        getVersion(clientDeviceYear, clientOs);

        int deliveryDistance = 95;
        int deliveryDays = 1;
        delivery(deliveryDistance, deliveryDays);
    }


}