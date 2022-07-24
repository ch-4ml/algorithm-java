package boj.b1.p2609;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main_2609_최대공약수와최소공배수 {
	public static void main(String[] args) throws Exception {
//		BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(new File("src/boj/b1/p2609/input.txt"))));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] nums = in.readLine().split(" ");
		int a = Integer.parseInt(nums[0]);
		int b = Integer.parseInt(nums[1]);
		int gcf = GCF(a, b);
		System.out.println(gcf);
		System.out.println(gcf * a / gcf * b / gcf);
		in.close();
	}
	
	public static int GCF(int a, int b) {
		int r, max, min;
		do {
			max = Math.max(a, b);
			min = Math.min(a, b);
			r = max % min;
			if(max == a) a = r;
			else b = r;
		} while(r != 0);
		return min;
	}
}
