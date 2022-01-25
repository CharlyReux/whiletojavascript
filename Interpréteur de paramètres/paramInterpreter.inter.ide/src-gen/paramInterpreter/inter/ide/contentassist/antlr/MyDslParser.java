/*
 * generated by Xtext 2.25.0
 */
package paramInterpreter.inter.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import paramInterpreter.inter.ide.contentassist.antlr.internal.InternalMyDslParser;
import paramInterpreter.inter.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getExprBaseAccess().getAlternatives(), "rule__ExprBase__Alternatives");
			builder.put(grammarAccess.getEqualAccess().getGroup(), "rule__Equal__Group__0");
			builder.put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
			builder.put(grammarAccess.getExpressionAccess().getGroup_1(), "rule__Expression__Group_1__0");
			builder.put(grammarAccess.getExprBaseAccess().getGroup_0(), "rule__ExprBase__Group_0__0");
			builder.put(grammarAccess.getEBsyAccess().getGroup(), "rule__EBsy__Group__0");
			builder.put(grammarAccess.getEBhdAccess().getGroup(), "rule__EBhd__Group__0");
			builder.put(grammarAccess.getEBtlAccess().getGroup(), "rule__EBtl__Group__0");
			builder.put(grammarAccess.getEBconsAccess().getGroup(), "rule__EBcons__Group__0");
			builder.put(grammarAccess.getEBlistAccess().getGroup(), "rule__EBlist__Group__0");
			builder.put(grammarAccess.getModelAccess().getEqListeAssignment(), "rule__Model__EqListeAssignment");
			builder.put(grammarAccess.getEqualAccess().getVarsAssignment_0(), "rule__Equal__VarsAssignment_0");
			builder.put(grammarAccess.getEqualAccess().getExpAssignment_2(), "rule__Equal__ExpAssignment_2");
			builder.put(grammarAccess.getVarsAccess().getLvarsAssignment(), "rule__Vars__LvarsAssignment");
			builder.put(grammarAccess.getExprsAccess().getLexprAssignment(), "rule__Exprs__LexprAssignment");
			builder.put(grammarAccess.getExpressionAccess().getExpbgAssignment_0(), "rule__Expression__ExpbgAssignment_0");
			builder.put(grammarAccess.getExpressionAccess().getExpbdAssignment_1_1(), "rule__Expression__ExpbdAssignment_1_1");
			builder.put(grammarAccess.getExprBaseAccess().getNiAssignment_0_1(), "rule__ExprBase__NiAssignment_0_1");
			builder.put(grammarAccess.getExprBaseAccess().getVAssignment_1(), "rule__ExprBase__VAssignment_1");
			builder.put(grammarAccess.getExprBaseAccess().getSyAssignment_2(), "rule__ExprBase__SyAssignment_2");
			builder.put(grammarAccess.getExprBaseAccess().getEbtAssignment_3(), "rule__ExprBase__EbtAssignment_3");
			builder.put(grammarAccess.getExprBaseAccess().getEbhAssignment_4(), "rule__ExprBase__EbhAssignment_4");
			builder.put(grammarAccess.getExprBaseAccess().getEbcAssignment_5(), "rule__ExprBase__EbcAssignment_5");
			builder.put(grammarAccess.getExprBaseAccess().getEblAssignment_6(), "rule__ExprBase__EblAssignment_6");
			builder.put(grammarAccess.getExprBaseAccess().getEbsAssignment_7(), "rule__ExprBase__EbsAssignment_7");
			builder.put(grammarAccess.getEBsyAccess().getSyAssignment_1(), "rule__EBsy__SyAssignment_1");
			builder.put(grammarAccess.getEBsyAccess().getLexpbAssignment_2(), "rule__EBsy__LexpbAssignment_2");
			builder.put(grammarAccess.getEBhdAccess().getExpbAssignment_2(), "rule__EBhd__ExpbAssignment_2");
			builder.put(grammarAccess.getEBtlAccess().getExpbAssignment_2(), "rule__EBtl__ExpbAssignment_2");
			builder.put(grammarAccess.getEBconsAccess().getLexpbAssignment_3(), "rule__EBcons__LexpbAssignment_3");
			builder.put(grammarAccess.getEBlistAccess().getLexpbAssignment_3(), "rule__EBlist__LexpbAssignment_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyDslGrammarAccess grammarAccess;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
