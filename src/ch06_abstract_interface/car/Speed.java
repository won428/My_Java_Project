package ch06_abstract_interface.car;

public interface Speed {
    public static final int AllOWD_MAX_SPEED = 50;
    public abstract void speedUp(int speed);
    public abstract void speedDowun(int speed);

}
