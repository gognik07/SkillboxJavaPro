package lesson5.tasks2.todoList;

public enum Commands {
    LIST("LIST", "Вывести список дел"),
    ADD("ADD ", "Добавить дело"),
    EDIT("EDIT ", "Изменить дело"),
    DELETE("DELETE ", "Удалить дело"),
    EXIT("EXIT", "Выйти из программы"),
    HELP("HELP", "Получить справку по командам");

    Commands(String name, String description) {
        this.name = name;
        this.description = description;
    }

    private String name;

    private String description;

    public static void printListCommand() {
        for (Commands command : values()) {
            System.out.println(command.name + " - " + command.description);
        }
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
