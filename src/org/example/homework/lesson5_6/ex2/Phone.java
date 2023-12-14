package org.example.homework.lesson5_6.ex2;

public class Phone {
    private final String type;
    private final String typeSystem;
    private final Board board;
    private final Camera cam;

    protected Phone(String type, String typeSystem, Board board, Camera cam) {
        this.type = type;
        this.typeSystem = typeSystem;
        this.board = board;
        this.cam = cam;
    }

    public void printPropertiesPhone(String typePhone) {
        System.out.printf("%s %s. Имеет операционную систему %s,"
                        + " плату %s(размер %sх%sх%s), камеру %s(%s%s).%n",
                typePhone, type, typeSystem, board.getName(), board.getHeight(), board.getWidth(),
                board.getLength(), typePhone, cam.getType(), cam.getFlash() ? ", есть вспышка" : "");
    }
}
