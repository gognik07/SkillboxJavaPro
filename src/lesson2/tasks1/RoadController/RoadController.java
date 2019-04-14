package lesson2.tasks1.RoadController;

import lesson2.tasks1.RoadController.core.Camera;
import lesson2.tasks1.RoadController.core.Car;

import java.util.Scanner;

public class RoadController
{
    //задаются переменные веса, размеры, стоимость
    private static double passengerCarMaxWeight = 3500.0; // kg
    private static int passengerCarMaxHeight = 2000; // mm
    private static int controllerMaxHeight = 4000; // mm

    private static int passengerCarPrice = 100; // RUB
    private static int cargoCarPrice = 250; // RUB
    private static int vehicleAdditionalPrice = 200; // RUB

    public static void main(String[] args)
    {
        // В консоль выводится вопрос
        System.out.println("Сколько автомобилей сгенерировать?");

        // Создаётся класс, который будет считывать информацию с консоли
        Scanner scanner = new Scanner(System.in);
        // Информация считывается с консоли и записывается в целочисленную переменную carsCount
        int carsCount = scanner.nextInt();

        // цикл по количеству carsCount
        for(int i = 0; i < carsCount; i++)
        {
            //создаётся новая машина и информация о ней выводится в консоль
            Car car = Camera.getNextCar();
            System.out.println(car);

            //Пропускаем автомобили спецтранспорта бесплатно
            if (car.isSpecial) {
                openWay();
                continue;
            }

            //Проверяем высоту и массу автомобиля, вычисляем стоимость проезда
            int price = calculatePrice(car);
            if(price == -1) {
                continue;
            }

            // Выводит стоимость автомобиля
            System.out.println("Общая сумма к оплате: " + price + " руб.");
        }
    }

    /**
     * Расчёт стоимости проезда исходя из массы и высоты
     */
    private static int calculatePrice(Car car)
    {
        //Параметры для расчёт стоимости проезда
        int carHeight = car.height;
        int price = 0;
        if (carHeight > controllerMaxHeight)
        {
            // вывод в консоль информации
            blockWay("высота вашего ТС превышает высоту пропускного пункта!");
            return -1;
        }
        //сравнивается высота машины с максимально возможной
        else if (carHeight > passengerCarMaxHeight)
        {
            double weight = car.weight;
            //Грузовой автомобиль
            //сравнивается вес машины с максимально возможным
            if (weight > passengerCarMaxWeight)
            {
                price = passengerCarPrice;
                // Проверка наличия прицепа у авто
                if (car.hasVehicle) {
                    price = price + vehicleAdditionalPrice;
                }
            }
            //Легковой автомобиль
            else {
                price = cargoCarPrice;
            }
        }
        else {
            price = passengerCarPrice;
        }
        return price;
    }

    /**
     * Открытие шлагбаума
     */
    private static void openWay()
    {
        System.out.println("Шлагбаум открывается... Счастливого пути!");
    }

    /**
     * Сообщение о невозможности проезда
     */
    private static void blockWay(String reason)
    {
        System.out.println("Проезд невозможен: " + reason);
    }
}