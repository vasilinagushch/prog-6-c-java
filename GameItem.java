// gameItem.java

/**
 * Абстрактный класс, представляющий общий элемент игры.
 */
public abstract class GameItem {
    protected String name;  // Название игрового элемента
    protected String description;  // Описание игрового элемента
    public GameItem(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Абстрактный метод для отображения информации об игровом элементе
    public abstract void display();
}