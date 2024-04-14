package antlr;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {
	public static void main(String[] args) throws Exception {
		// Create an input stream from your input text
		String inputText = "int word = 1"; // Replace with your actual input
		ExprLexer lexer = new ExprLexer(CharStreams.fromString(inputText));
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// Create a parser
		ExprParser parser = new ExprParser(tokens);

		// Start parsing from the 'prog' rule (or any other rule you want)
		ParseTree tree = parser.prog(); // Change 'prog' to your desired rule

		// Add your custom logic here (e.g., visit the parse tree)
		// ...

		System.out.println(inputText);
		System.out.println(lexer);
		System.out.println(tokens);
		System.out.println(parser);
		System.out.println(tree);
	}
}
