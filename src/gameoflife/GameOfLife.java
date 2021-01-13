/*
 *tuscia cele gimsta,kai yra 3 kaimynai (o>x)
 *tuscia cele, jeigu yra maziau arba daugiau 3, lieka tuscia (0>0)
 *gyva cele turinti maziau 2 arba daugiau 3 kaimynu, mirsta (x>0)
 *gyva cele turinti 2 ar 3 kaimynus, live on to the next generation (x>x)
 */
package gameoflife;

public class GameOfLife {

    public static void main(String[] args) {
         //pirmas lygis
        char [][] field = new char[50][50];
        for (int i=0;i<field.length;i++) {
            for(int j =0; j<field[i].length; j++) {
                if(Math.random() > 0.22) {
                    field[i][j] = 'X';
                }else {
                    field[i][j]='O';
                }
            }
        }
    }
    
}