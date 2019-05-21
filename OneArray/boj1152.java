package OneArray;

import java.util.*;
import java.io.*;

public class boj1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine().trim();
		String[] s = line.split(" ");
		
		if(line.isEmpty())	System.out.println(0);
		else	System.out.println(s.length);
	}
}
