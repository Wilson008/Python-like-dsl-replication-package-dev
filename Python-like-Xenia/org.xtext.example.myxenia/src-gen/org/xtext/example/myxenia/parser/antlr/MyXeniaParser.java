/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.myxenia.parser.antlr;

import com.google.inject.Inject;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.myxenia.parser.antlr.internal.InternalMyXeniaParser;
import org.xtext.example.myxenia.services.MyXeniaGrammarAccess;

public class MyXeniaParser extends AbstractAntlrParser {

	@Inject
	private MyXeniaGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected TokenSource createLexer(CharStream stream) {
		return new MyXeniaTokenSource(super.createLexer(stream));
	}
	
	/**
	 * Indentation aware languages do not support partial parsing since the lexer is inherently stateful.
	 * Override and return {@code true} if your terminal splitting is stateless.
	 */
	@Override
	protected boolean isReparseSupported() {
		return false;
	}

	@Override
	protected InternalMyXeniaParser createParser(XtextTokenStream stream) {
		return new InternalMyXeniaParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public MyXeniaGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyXeniaGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
