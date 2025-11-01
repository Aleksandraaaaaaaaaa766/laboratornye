package lab4.task2;

import java.util.NoSuchElementException;

//Обобщённая коробка
public class Box<T> {

    private T item;  // единственное поле класса

    //разместить на хранение
    //Если объект кладут в коробку, но она не пуста – необходимо выкинуть исключение
    public void put(T newItem) { //ничего не возвращает, только изменяем поле класса
        if (item != null)
            throw new IllegalStateException("Коробка занята"); //объект в некорректном состоянии
        else
            item = newItem;
    }

    //получение объекта
    //Если объект забирают из коробки – ссылку на этот объект необходимо обнулить
    public T take() {
        if (item == null)
            throw new NoSuchElementException(); //пытаешься получить что-то, чего нет
        else {
            T tItem = item;
            item = null;
            return tItem;
        }
    }

    //метод проверки на заполненность
    public boolean isEmpty() {
        return item == null;
    }

    @Override
    public String toString() {
        if (item == null)
            return "Коробка пуста";
        return "Коробка содержит: " + item;
    }
}
