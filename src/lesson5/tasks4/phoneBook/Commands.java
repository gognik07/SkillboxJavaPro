package lesson5.tasks4.phoneBook;

public enum Commands {
    LIST("LIST", "Вывести телефонную книгу"),
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
