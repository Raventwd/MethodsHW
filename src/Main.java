public class Main {

    public static void yearLeap(int year){
        System.out.println("//Task 1");
        for (int i = 0; i < 1; i++) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                System.out.println(year + " год вискосный");
            }else
                System.out.println(year + " год не високосный");
        }
    }

    public static void version(int clientDeviceYear, int clientOS){
        System.out.println("//Task 2");
        if (clientDeviceYear <= 2015) {
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
    public static int delivery(int deliveryDistance, int deliveryDays){
        System.out.println("//Task 3");
        if (deliveryDistance <= 20) {
            System.out.println("потребуется "+deliveryDays+" день");
        }
        else if (deliveryDistance > 20 && deliveryDistance < 60) {
            deliveryDays++;
            System.out.println("потребуется "+deliveryDays+" дня");
        }
        else if (deliveryDistance > 60 && deliveryDistance <= 100 ) {
            deliveryDays++;
            System.out.println("потребуется "+deliveryDays+" дня");
        }
        else if (deliveryDistance > 100 ) {
            System.out.println("Не доставим");
        }
        return deliveryDays;

    }
    public static void main(String[] args) {
        int year = 2022;
        yearLeap(year);

        int clientDeviceYear = 2014;
        int clientOs = 1;
        version(clientDeviceYear, clientOs);

        int deliveryDistance = 105;
        int deliveryDays = 1;
        delivery(deliveryDistance, deliveryDays);
    }


}