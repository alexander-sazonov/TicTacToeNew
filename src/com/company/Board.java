package com.company;

public class Board {
    //массив для хранения поля
    String[][] boardArray = new String[3][3];

    //конструктор
    public Board(){
        //инициализируем поле символами "-"
        for (int i = 0; i < boardArray.length; i++) {
            for (int j = 0; j < boardArray[i].length; j++) {
                boardArray[i][j] = "-";
            }
        }
    }

    @Override
    public String toString() {
        String boardString = "";
        for (int i = 0; i < boardArray.length; i++) {
            for (int j = 0; j < boardArray[i].length; j++) {
                boardString += boardArray[i][j] + " ";
            }
            boardString += "\n";
        }
        return boardString;
    }
}
