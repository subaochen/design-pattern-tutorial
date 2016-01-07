package cn.edu.sdut.r314;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class EncodeInputStream extends FilterInputStream {

	protected EncodeInputStream(InputStream in) {
		super(in);
	}

	public int read() throws IOException {
		int c = super.read();
		return c + 1;
	}
}
