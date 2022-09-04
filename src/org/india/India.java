package org.india;

import org.tamilnadu.Tamilnadu;
//child
public class India extends Tamilnadu {
	private void india() {
		System.out.println("Indian");
	}

	public static void main(String[] args) {
		India s = new India();
		s.india();
		s.malayalam();
		s.tamilLanguage();
		s.telugu();
	}
}
