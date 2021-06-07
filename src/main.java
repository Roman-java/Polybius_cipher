import java.util.Arrays;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("Input text:");
	String text = in.nextLine();
	char[][] matr = {	{'a', 'b', 'c', 'd', 'e', 'f'},
						{'g', 'h', 'i', 'j', 'k', 'l'},
						{'m', 'n', 'o', 'p', 'q', 'r'},
						{'s', 't', 'u', 'v', 'w', 'x'},
						{'y', 'z', '0', '1', '2', '3'},
						{'4', '5', '6', '7', '8', '9'}	};
	
	int[] num_1 = new int[text.length() * 2];
	for (int c = 0; c < text.length(); c++) {
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				if (matr[i][j] == text.charAt(c)) {
					num_1[c * 2] = i;
					num_1[c * 2 + 1] = j;
					}
				}
			}
		}
	
	System.out.println("Text:");
	System.out.println(text);
	for(int i=0;i<text.length()*2;i++)
		System.out.print(num_1[i]);
	
	System.out.println("\n\nCode:");
	int sdvig = 3;
	int[] some_new = new int[num_1.length*2];
    for(int i = 0; i<num_1.length*2; i++) {
    	if(i<num_1.length)
    		some_new[i] = num_1[i];
    	else
    		some_new[i] = num_1[i-num_1.length];
    }
    int[] new_num = Arrays.copyOfRange(some_new, 0 + sdvig, some_new.length/2 + sdvig);
    
    for(int i = 0; i<new_num.length; i++)
    	System.out.print(new_num[i]);
    System.out.println();
    
    StringBuilder one = new StringBuilder();
    for(int i=0;i<new_num.length/2;i++)
    	one.append(matr[new_num[i*2]][new_num[i*2+1]]);
    String enc = one.toString();
		System.out.print(enc);
	
	System.out.println("\n\nDecode:");
	System.out.println(enc);
	int[] num_2 = new int[enc.length() * 2];
	for (int c = 0; c < enc.length(); c++) {
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				if (matr[i][j] == enc.charAt(c)) {
					num_2[c * 2] = i;
					num_2[c * 2 + 1] = j;
					}
				}
			}
		}
	
	for(int i=0;i<text.length()*2;i++)
		System.out.print(num_2[i]);
	System.out.println();
	
	int[] some_new_2 = new int[num_2.length*2];
    for(int i = 0; i<num_2.length*2; i++) {
    	if(i<num_2.length)
    		some_new_2[i] = num_2[i];
    	else
    		some_new_2[i] = num_2[i-num_2.length];
    }
    int[] new_num_2 = Arrays.copyOfRange(some_new_2, some_new_2.length/2 - sdvig, some_new_2.length - sdvig);
    
    for(int i = 0; i<new_num_2.length; i++)
    	System.out.print(new_num_2[i]);
    System.out.println();
	
    StringBuilder two = new StringBuilder();
    for(int i=0;i<new_num_2.length/2;i++)
    	two.append(matr[new_num_2[i*2]][new_num_2[i*2+1]]);
    String dec = two.toString();
		System.out.print(dec);
	
	}
}