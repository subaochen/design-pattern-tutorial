package cn.edu.sdut.r314;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
	public static void main(String[] args) {
		int c;

		try {
			InputStream in = new EncodeInputStream(new BufferedInputStream(InputTest.class.getResourceAsStream("test.txt")));

			while ((c = in.read()) >= 0) {
				System.out.print((char) c);
			}

			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
