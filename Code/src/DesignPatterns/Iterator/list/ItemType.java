package DesignPatterns.Iterator.list;

public enum ItemType {

    ANY("任何"), WEAPON("武器"), RING("戒子"), POTION("药水");

    private String title;

    ItemType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
