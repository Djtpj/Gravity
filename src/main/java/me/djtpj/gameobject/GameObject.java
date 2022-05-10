package me.djtpj.gameobject;

public abstract class GameObject {

    private Position position;
    private Size size;



    public GameObject(Position position, Size size) {
        this.position = position;
        this.size = size;
    }

    public abstract void render();
    public abstract void update();
    public void fixedUpdate() {
        // Does not do anything
    }

}
