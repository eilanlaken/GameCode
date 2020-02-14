package com.maple.compiler.lexical;

import com.maple.compiler.utils.Debugger;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MapleLexicalAnalyzer {

    private List<Token> fullTokenStream = new ArrayList<>();
    private List<Token> primeTokensStream = new ArrayList<>(); // tokens making the code itself
    private List<Token> auxiliaryTokensStream = new ArrayList<>(); // line comments, block comments, spaces, tabs, newlines

    private MapleValidTokens[] mapleValidTokens = MapleValidTokens.values();

    public MapleLexicalAnalyzer() {

    }

    public void tokenizeSourceCode(final String sourceCode) throws AnalyzerException {
        int position = 0;
        Token token = null;
        do {
            token = extractFirstToken(sourceCode, position);
            if (token != null) {
                position = token.endIndexInFile;
                fullTokenStream.add(token);
            }
        } while (token != null && position != sourceCode.length());
        setPrimeTokensStream();
        setAuxiliaryTokensStream();
        if (position != sourceCode.length()) {
            throw new AnalyzerException("Lexical error at position # "+ position, position);
        }
    }

    private void setPrimeTokensStream() {
        for (Token token : this.fullTokenStream) {
            if (!token.getTokenType().isAuxiliary) {
                primeTokensStream.add(token);
            }
        }
    }

    private void setAuxiliaryTokensStream() {
        for (Token token : this.fullTokenStream) {
            if (token.getTokenType().isAuxiliary) {
                auxiliaryTokensStream.add(token);
            }
        }
    }


    private Token extractFirstToken(final String source, int fromIndex) {
        if (fromIndex < 0 || fromIndex >= source.length()) {
            throw new IllegalArgumentException("Illegal index in the input stream!");
        }
        for (MapleValidTokens mapleValidToken : mapleValidTokens) {
            Pattern p = Pattern.compile(".{" + fromIndex + "}" + mapleValidToken.regex,
                    Pattern.DOTALL);
            Matcher m = p.matcher(source);
            if (m.matches()) {
                String lexema = m.group(1);
                return new Token(mapleValidToken.tokenType, lexema, fromIndex,fromIndex + lexema.length());
            }
        }

        return null;
    }


    public static void printTokenStream(List<Token> tokens) {
        int tokenCounter = 0;
        for (Token token : tokens) {
            if (tokenCounter >= 10) {
                System.out.println("");
                tokenCounter = 0;
                Debugger.print(token.toString() + "  ---->  ");
            } else {
                Debugger.print(token.toString() + "  ---->  ");
                tokenCounter++;
            }
        }
    }

    static class AnalyzerException extends Exception {

        public int position;

        AnalyzerException(String msg, int position) {
            super(msg);
            this.position = position;
        }
    }

    public List<Token> getFullTokenStream() {
        return this.fullTokenStream;
    }

    public List<Token> getPrimeTokensStream() {
        return this.primeTokensStream;
    }

    public List<Token> getAuxiliaryTokensStream() {
        return this.auxiliaryTokensStream;
    }

}

