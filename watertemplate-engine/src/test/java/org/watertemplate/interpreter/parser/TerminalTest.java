package org.watertemplate.interpreter.parser;

import org.junit.Assert;
import org.junit.Test;

import static org.watertemplate.interpreter.lexer.TokenFixture.*;

public class TerminalTest {

    @Test
    public void buildParseTree() {
        TokenStream tokenStream = new TokenStream(
            new If(),
            new PropertyKey("id"),
            new PropertyKey("x"),
            new End());

        Assert.assertNotNull(Terminal.IF.buildAbstractSyntaxTree(tokenStream));
        Assert.assertNotNull(Terminal.PROPERTY_KEY.buildAbstractSyntaxTree(tokenStream));
        Assert.assertNotNull(Terminal.PROPERTY_KEY.buildAbstractSyntaxTree(tokenStream));
        Assert.assertNotNull(Terminal.END.buildAbstractSyntaxTree(tokenStream));
    }

}
