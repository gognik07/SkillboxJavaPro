package lesson2.tasks2.RoadController.core;

public class Car
{
    //Переменная типа String
    public String number;
    //Переменная типа int
    public int height;
    //Переменная типа double
    public double weight;
    //Переменная типа boolean
    public boolean hasVehicle;
    //Переменная типа boolean
    public boolean isSpecial;

    public String toString()
    {
        //Переменная типа String
        String special = isSpecial ? "СПЕЦТРАНСПОРТ " : "";
        return "\n=========================================\n" +
            special + "Автомобиль с номером " + number +
            ":\n\tВысота: " + height + " мм\n\tМасса: " + weight + " кг";
    }
}