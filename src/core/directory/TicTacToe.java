package core.directory;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    Random random;
    Scanner scanner;
    char[][] table;

    int lastX = 0, lastY = 0;

    TicTacToe(){
        table = new char[3][3];
        random = new Random();
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        new TicTacToe().game();
    }

    void game(){
        System.out.println("Game is started!");
        initTable();
        printTable();

        while(true){
            turnHuman();
            if(checkWin('x')){
                printTable();
                System.out.println("YOU WON!");
                break;
            }
            if(isTableFull()){
                System.out.println("DRAW!");
                break;
            }
            turnAI();
            printTable();
            if(checkWin('o')){
                printTable();
                System.out.println("AI WON!");
                break;
            }
        }
    }

    boolean isTableFull() {
        for(int x = 0; x < 3; x++){
            for(int y = 0; y < 3; y++){
                if(table[x][y] == '_') return false;
            }
        }
        return true;
    }

    boolean checkWin(char symbol) {
        boolean onDiagonal = (lastX + lastY) % 2 == 0;
        int countColumn = 0, countRow = 0, countDiag = 0, countCDiag = 0;
        for(int i = 0; i < 3; i++) {
            if(table[i][lastY] == symbol) countRow++;
            if(table[lastX][i] == symbol) countColumn++;
            if (onDiagonal) {
                if(table[i][i] == symbol) countDiag++;
                if(table[2-i][i] == symbol) countCDiag++;
            }
        }
        return (countRow == 3 || countColumn == 3 || countDiag == 3 || countCDiag == 3);
    }


    void turnHuman() {
        int x, y;

        do{
            System.out.println("Enter x y from [0..2]");
            x = scanner.nextInt();
            y = scanner.nextInt();
            //System.out.println(x + ", " + y);
        } while (!isCellValid(x, y));
        table[x][y] = 'x';
        lastX = x;
        lastY = y;
        /*System.out.println("Enter x y from [0..2]");
        x = scanner.nextInt();
        y = scanner.nextInt();
        if(isCellValid(x, y)) table[x][y] = 'x';
        else turnHuman();*/
    }

    boolean isCellValid(int x, int y){
        if(x < 0 || y < 0 || x > 2 || y > 2){
            return false;
        }
        return table[x][y] == '_';
    }

    void turnAI() {
        int x, y;

        do{
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        table[x][y] = 'o';
        lastX = x;
        lastY = y;
    }

    void initTable(){
        for(int x = 0; x < 3; x++){
            for(int y = 0; y < 3; y++){
                table[x][y] = '_';
            }
        }
    }

    void printTable() {
        for(int y = 0; y < 3; y++){
            for(int x = 0; x < 3; x++){
                String out = table[x][y] + "|";
                if (x == 0) out = "|" + out;
                System.out.print(table[x][y] + "|");
            }
            System.out.println();
        }
    }
}