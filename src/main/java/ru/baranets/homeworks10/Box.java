package ru.baranets.homeworks10;

public class Box {
    final int length;
    final int width;
    final int height;
    private String item;
    private String color;
    private boolean isClosed;

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public Box(int length, int width, int height, String color, boolean isClosed) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;
        this.isClosed = isClosed;
    }

    public void info() {
        System.out.println("Размер коробки: " + length + " * " + width + " * " + height);
        System.out.println("Цвет коробки: " + color);
    }

    public void repaint(String colorNew) {
        color = colorNew;
    }

    public void open() {
        isClosed = false;
        System.out.println("коробка открыта");
    }

    public void closed() {
        isClosed = true;
        System.out.println("коробка закрыта");
    }

    public void put(String item) {
        if (isClosed) {
            System.out.println("коробка закрыта");
            return;
        }
        if (this.item != null) {
            System.out.println("в коробке нет места");
            return;
        }
        this.item = item;
        System.out.println("положили " + item + " в коробку");
    }

    public void getIt() {
        if (isClosed) {
            System.out.println("коробка закрыта");
            return;
        }
        if (this.item == null) {
            System.out.println("коробка пуста");
        } else {
            item = null;
            System.out.println("забрали предмет из коробки");
            return;
        }
    }
}
