package lesson8.tasks1.ConsoleCustomerList;

import lesson8.tasks1.ConsoleCustomerList.exception.InvalidEmailException;
import lesson8.tasks1.ConsoleCustomerList.exception.InvalidPhoneException;

import java.util.HashMap;

public class CustomerStorage {
    private HashMap<String, Customer> storage;

    public CustomerStorage() {
        storage = new HashMap<>();
    }

    public void addCustomer(String data) throws InvalidPhoneException, InvalidEmailException {
        String[] components = data.split("\\s+");
        String name = components[0] + " " + components[1];
        String phone = components[3];
        if (!isValidPhone(phone)) {
            throw new InvalidPhoneException();
        }

        String email = components[2];
        if (!isValidEmail(email)) {
            throw new InvalidEmailException();
        }

        storage.put(name, new Customer(name, components[3], components[2]));
    }

    private boolean isValidEmail(String email) {
        return email != null && !email.isEmpty()
                && email.matches("^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$");
    }

    private boolean isValidPhone(String phone) {
        return phone != null && !phone.isEmpty()
                && phone.matches("^(\\+7|8)(\\(\\d{3}\\)|\\d{3})\\d{7}$");
    }

    public void listCustomers() {
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name) {
        storage.remove(name);
    }

    public int getCount() {
        return storage.size();
    }
}