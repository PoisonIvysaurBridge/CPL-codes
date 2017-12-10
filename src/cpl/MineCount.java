package cpl;
import java.util.Scanner;


public class MineCount {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder s = new StringBuilder();
		int width = scanner.nextInt();
		int height = scanner.nextInt();
		int numberOfMines = scanner.nextInt();
		
		while (width != 0 || height != 0) {
			char[][] field = new char[height][width];	
			
			for (int i = 0; i < numberOfMines; i++) {
				int x = scanner.nextInt();
				int y = scanner.nextInt();
				
				field[y][x] = 'x';
			}
			
			for (int i = 0; i < height; i++) {
                            for (int j = 0; j < width; j++) {
                                if (field[i][j] == 'x') {
                                        continue;
                                }
                                int[] offsetX = {-1, 0, 1, -1, 1, -1, 0, 1};
                                int[] offsetY = {-1, -1, -1, 0, 0, 1, 1, 1};

                                int mines = 0;
                                for (int k = 0; k < 8; k++) {
                                    int targetX = j + offsetX[k];
                                    int targetY = i + offsetY[k];

                                    if (targetX >= 0 && targetX < width && targetY >= 0 && targetY < height) {
                                        if (field[targetY][targetX] == 'x') {
                                                mines++;
                                        }
                                    }
                                }

                                if (mines == 0) {
                                    field[i][j] = '.';
                                }
                                else {
                                    field[i][j] = (char)(mines + '0');
                                }				
                            }
			}
			
			for (int i = 0; i < height; i++) {
				for (int j = 0; j < width; j++) {
					s.append("" + field[i][j]);
				}
				s.append("\n");
			}
			
			width = scanner.nextInt();
			height = scanner.nextInt();
			numberOfMines = scanner.nextInt();
		}
		
		System.out.print(s);
	}

}
