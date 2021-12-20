package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Board board = new Board();
        System.out.println(board);
        if(board.setCell(0,0,"x")){
            System.out.println("значение обновлено");
        } else{
            System.out.println("Ошибка");
        }
        System.out.println(board);
    }
}
