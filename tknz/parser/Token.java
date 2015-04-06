package tknz.parser;

public class Token {
	
	public final String text;
	public final String type;
	
	public Token(String text, String type) {
		this.text= text;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return String.format("(%s)<%s>", this.type, this.text); 
	}

}
