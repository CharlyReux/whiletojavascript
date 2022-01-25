/*
 * generated by Xtext 2.25.0
 */
package paramInterpreter.inter.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import paramInterpreter.inter.parser.antlr.internal.InternalMyDslParser;
import paramInterpreter.inter.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractAntlrParser {

	@Inject
	private MyDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMyDslParser createParser(XtextTokenStream stream) {
		return new InternalMyDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
