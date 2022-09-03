/*
 * generated by Xtext 2.25.0
 */
package org.xtext.mycsm.parser.antlr;

import com.google.inject.Inject;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.mycsm.parser.antlr.internal.InternalMyCsmParser;
import org.xtext.mycsm.services.MyCsmGrammarAccess;

public class MyCsmParser extends AbstractAntlrParser {

	@Inject
	private MyCsmGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected TokenSource createLexer(CharStream stream) {
		return new MyCsmTokenSource(super.createLexer(stream));
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
	protected InternalMyCsmParser createParser(XtextTokenStream stream) {
		return new InternalMyCsmParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "CSM";
	}

	public MyCsmGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyCsmGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
