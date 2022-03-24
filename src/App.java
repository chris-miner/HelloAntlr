
/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import dev.c00a5b70.hello.*;

public class App {
    public static void main(String[] args) throws Exception {
        // check if a file was specified
        String inputFile = null;
        if (args.length > 0)
            inputFile = args[0];

        // create an input character stream from a file
        InputStream is = System.in;
        if (inputFile != null) {
            is = new FileInputStream(inputFile);
        }

        // create a CharStream that reads from standard input
        CharStream input = CharStreams.fromStream(is);

        // create a lexer that feeds off of input CharStream
        HelloLexer lexer = new HelloLexer(input);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        HelloParser parser = new HelloParser(tokens);

        // parse the input, and get the root node of the tree
        ParseTree tree = parser.r(); // parse

        // do something with the tree
        ParseTreeWalker walker = new ParseTreeWalker();

        // create a generic parse tree visitor that can trigger callbacks
        AppListener extractor = new AppListener(parser);

        // walk the tree with the listener
        walker.walk(extractor, tree);
    }
}
