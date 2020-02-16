package com.maple.compiler.gcmain;

import com.maple.compiler.lexical.MapleLexicalAnalyzer;
import com.maple.compiler.lexical.Token;
import com.maple.compiler.lexical.MapleValidTokens;
import com.maple.compiler.utils.Debugger;
import com.maple.compiler.utils.FileUtils;

import java.util.List;

public class CompilerMain {

    public static void main(String[] args) {

        String filepath = "examples/test.gc";
        String sourceCode = FileUtils.getFileString(filepath);

        MapleLexicalAnalyzer lexer = new MapleLexicalAnalyzer();
        try {
            lexer.tokenizeSourceCode(sourceCode);
        } catch (Exception e) {
            Debugger.print(e);
        }
        MapleLexicalAnalyzer.printTokenStream(lexer.getPrimeTokensStream());
    }


}
