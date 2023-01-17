package terminal;

import exceptions.SyntaxErrorException;

import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;

class TerminalCommand {

}

public class TerminalParser {

    private final StreamTokenizer streamTokenizer;

    public TerminalParser(String inputString) {
        this.streamTokenizer = new StreamTokenizer(new StringReader(inputString));
        this.streamTokenizer.eolIsSignificant(true);
    }

    public TerminalCommand parse() throws IOException {
        this.streamTokenizer.nextToken();
        if (this.streamTokenizer.ttype == StreamTokenizer.TT_WORD) {
            return parseCodeLine();
        } else {
            throw new SyntaxErrorException("Expected a word or a number");
        }
    }

    private TerminalCommand parseCodeLine() {
        return null;
    }

}
