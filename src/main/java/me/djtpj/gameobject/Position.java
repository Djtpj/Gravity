package me.djtpj.gameobject;

public record Position(int x, int y) {

    @Override
    public String toString() {
        return x + ", " + y;
    }
}
