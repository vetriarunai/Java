package org.india;

import org.tamilnadu.Tamilnadu;

//child
public class India extends Tamilnadu {
	public void a(){
		System.out.println("Trichy");
	}

	private void india() {
		System.out.println("Indian");
	}

	public static void main(String[] args) {

		India s = new India();
		s.a();
		s.india();
		s.malayalam();
		s.tamilLanguage();
		s.telugu();
	}
}
