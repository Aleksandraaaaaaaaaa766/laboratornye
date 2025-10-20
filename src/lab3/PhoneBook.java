package lab3;

import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, String> book = new HashMap<>();

    public HashMap<String, String> getBook() {
        return book;
    }

    public void setBook(HashMap<String, String> book) {
        this.book = book;
    }

    public void put(String number, String name) {
        var k = book.put(name, number); //возвращает null, если ключа не было в коллекции
        System.out.println(k == null ? "Запись успешно внесена!" : "Такое имя уже есть, старый номер: " + k);
    }

    public void remove(String name) {
        book.remove(name);
    }

    public String get(String name) {
        return book.get(name);
    }

    //проверка наличия
    public boolean containsName(String name) {
        return book.containsKey(name);
    }

    public boolean containsNumber(String number) {
        return book.containsValue(number);
    }

    //количество контактов
    public int size() {
        return book.size();
    }

    public void print() { //вывод всего списка
        System.out.println(book);
    }
}
