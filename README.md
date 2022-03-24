## Hello Antlr

This project is an example of using Antlr4 to generate a parser and a lexer.  The parser and lexer are generated from the grammar in the file `Hello.g4`.

The project structure was created with the Create Java Project... command in vscode. To build and run the project, you need to install antlr version 4.9.3.  I used brew to install it.
```
brew install antlr4
```

While the grammar is defined in `Hello.g4`, the parser and lexer are generated from it in the files `HelloLexer.java` and `HelloParser.java`.  To generate these files, I used the ANTLR4 grammar syntax support extension by Mike Lishke (mike-lischke.vscode-antlr4).  The files are generated in the grammars/generated folder each time the grammar is changed.



