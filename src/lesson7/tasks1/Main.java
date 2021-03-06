package lesson7.tasks1;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    private static String staffFile = "lesson7/tasks1/data/staff.txt";
    private static String dateFormat = "dd.MM.yyyy";

    public static void main(String[] args) {
        ArrayList<Employee> staff = loadStaffFromFile();


    }

    private static ArrayList<Employee> loadStaffFromFile() {
        ArrayList<Employee> staff = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(staffFile));
            for (String line : lines) {
                String[] fragments = line.split("\t");
                if (fragments.length != 3) {
                    System.out.println("Wrong line: " + line);
                    continue;
                }
                staff.add(new Employee(
                        fragments[0],
                        Integer.parseInt(fragments[1]),
                        (new SimpleDateFormat(dateFormat)).parse(fragments[2])
                ));
            }

            Collections.sort(staff, (e1, e2) -> e1.getSalary().compareTo(e2.getSalary()) == 0
                    ? e1.getName().compareTo(e2.getName())
                    : e1.getSalary().compareTo(e2.getSalary()));

            for (Employee employee : staff) {
                System.out.println(employee);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return staff;
    }
}