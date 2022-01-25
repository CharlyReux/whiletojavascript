package paramInterpreter.inter.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import paramInterpreter.inter.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VARIABLE", "RULE_SYMBOL", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':='", "'=?'", "'('", "')'", "'hd'", "'tl'", "'cons'", "'list'", "'nil'"
    };
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=11;
    public static final int RULE_VARIABLE=4;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=7;
    public static final int RULE_ML_COMMENT=9;
    public static final int RULE_SYMBOL=5;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__EqListeAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__EqListeAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__EqListeAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__EqListeAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__Model__EqListeAssignment )*
            {
             before(grammarAccess.getModelAccess().getEqListeAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__Model__EqListeAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_VARIABLE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__Model__EqListeAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__EqListeAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getEqListeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEqual"
    // InternalMyDsl.g:78:1: entryRuleEqual : ruleEqual EOF ;
    public final void entryRuleEqual() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleEqual EOF )
            // InternalMyDsl.g:80:1: ruleEqual EOF
            {
             before(grammarAccess.getEqualRule()); 
            pushFollow(FOLLOW_1);
            ruleEqual();

            state._fsp--;

             after(grammarAccess.getEqualRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEqual"


    // $ANTLR start "ruleEqual"
    // InternalMyDsl.g:87:1: ruleEqual : ( ( rule__Equal__Group__0 ) ) ;
    public final void ruleEqual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Equal__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Equal__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Equal__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Equal__Group__0 )
            {
             before(grammarAccess.getEqualAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Equal__Group__0 )
            // InternalMyDsl.g:94:4: rule__Equal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Equal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEqual"


    // $ANTLR start "entryRuleVars"
    // InternalMyDsl.g:103:1: entryRuleVars : ruleVars EOF ;
    public final void entryRuleVars() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleVars EOF )
            // InternalMyDsl.g:105:1: ruleVars EOF
            {
             before(grammarAccess.getVarsRule()); 
            pushFollow(FOLLOW_1);
            ruleVars();

            state._fsp--;

             after(grammarAccess.getVarsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVars"


    // $ANTLR start "ruleVars"
    // InternalMyDsl.g:112:1: ruleVars : ( ( rule__Vars__LvarsAssignment ) ) ;
    public final void ruleVars() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Vars__LvarsAssignment ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Vars__LvarsAssignment ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Vars__LvarsAssignment ) )
            // InternalMyDsl.g:118:3: ( rule__Vars__LvarsAssignment )
            {
             before(grammarAccess.getVarsAccess().getLvarsAssignment()); 
            // InternalMyDsl.g:119:3: ( rule__Vars__LvarsAssignment )
            // InternalMyDsl.g:119:4: rule__Vars__LvarsAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Vars__LvarsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVarsAccess().getLvarsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVars"


    // $ANTLR start "entryRuleExprs"
    // InternalMyDsl.g:128:1: entryRuleExprs : ruleExprs EOF ;
    public final void entryRuleExprs() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleExprs EOF )
            // InternalMyDsl.g:130:1: ruleExprs EOF
            {
             before(grammarAccess.getExprsRule()); 
            pushFollow(FOLLOW_1);
            ruleExprs();

            state._fsp--;

             after(grammarAccess.getExprsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExprs"


    // $ANTLR start "ruleExprs"
    // InternalMyDsl.g:137:1: ruleExprs : ( ( rule__Exprs__LexprAssignment ) ) ;
    public final void ruleExprs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Exprs__LexprAssignment ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Exprs__LexprAssignment ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Exprs__LexprAssignment ) )
            // InternalMyDsl.g:143:3: ( rule__Exprs__LexprAssignment )
            {
             before(grammarAccess.getExprsAccess().getLexprAssignment()); 
            // InternalMyDsl.g:144:3: ( rule__Exprs__LexprAssignment )
            // InternalMyDsl.g:144:4: rule__Exprs__LexprAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Exprs__LexprAssignment();

            state._fsp--;


            }

             after(grammarAccess.getExprsAccess().getLexprAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExprs"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:153:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleExpression EOF )
            // InternalMyDsl.g:155:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMyDsl.g:162:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Expression__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Expression__Group__0 )
            // InternalMyDsl.g:169:4: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleExprBase"
    // InternalMyDsl.g:178:1: entryRuleExprBase : ruleExprBase EOF ;
    public final void entryRuleExprBase() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleExprBase EOF )
            // InternalMyDsl.g:180:1: ruleExprBase EOF
            {
             before(grammarAccess.getExprBaseRule()); 
            pushFollow(FOLLOW_1);
            ruleExprBase();

            state._fsp--;

             after(grammarAccess.getExprBaseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExprBase"


    // $ANTLR start "ruleExprBase"
    // InternalMyDsl.g:187:1: ruleExprBase : ( ( rule__ExprBase__Alternatives ) ) ;
    public final void ruleExprBase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__ExprBase__Alternatives ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__ExprBase__Alternatives ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__ExprBase__Alternatives ) )
            // InternalMyDsl.g:193:3: ( rule__ExprBase__Alternatives )
            {
             before(grammarAccess.getExprBaseAccess().getAlternatives()); 
            // InternalMyDsl.g:194:3: ( rule__ExprBase__Alternatives )
            // InternalMyDsl.g:194:4: rule__ExprBase__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExprBase__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExprBaseAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExprBase"


    // $ANTLR start "entryRuleEBsy"
    // InternalMyDsl.g:203:1: entryRuleEBsy : ruleEBsy EOF ;
    public final void entryRuleEBsy() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleEBsy EOF )
            // InternalMyDsl.g:205:1: ruleEBsy EOF
            {
             before(grammarAccess.getEBsyRule()); 
            pushFollow(FOLLOW_1);
            ruleEBsy();

            state._fsp--;

             after(grammarAccess.getEBsyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEBsy"


    // $ANTLR start "ruleEBsy"
    // InternalMyDsl.g:212:1: ruleEBsy : ( ( rule__EBsy__Group__0 ) ) ;
    public final void ruleEBsy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__EBsy__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__EBsy__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__EBsy__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__EBsy__Group__0 )
            {
             before(grammarAccess.getEBsyAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__EBsy__Group__0 )
            // InternalMyDsl.g:219:4: rule__EBsy__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EBsy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEBsyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBsy"


    // $ANTLR start "entryRuleEBhd"
    // InternalMyDsl.g:228:1: entryRuleEBhd : ruleEBhd EOF ;
    public final void entryRuleEBhd() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleEBhd EOF )
            // InternalMyDsl.g:230:1: ruleEBhd EOF
            {
             before(grammarAccess.getEBhdRule()); 
            pushFollow(FOLLOW_1);
            ruleEBhd();

            state._fsp--;

             after(grammarAccess.getEBhdRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEBhd"


    // $ANTLR start "ruleEBhd"
    // InternalMyDsl.g:237:1: ruleEBhd : ( ( rule__EBhd__Group__0 ) ) ;
    public final void ruleEBhd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__EBhd__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__EBhd__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__EBhd__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__EBhd__Group__0 )
            {
             before(grammarAccess.getEBhdAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__EBhd__Group__0 )
            // InternalMyDsl.g:244:4: rule__EBhd__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EBhd__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEBhdAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBhd"


    // $ANTLR start "entryRuleEBtl"
    // InternalMyDsl.g:253:1: entryRuleEBtl : ruleEBtl EOF ;
    public final void entryRuleEBtl() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleEBtl EOF )
            // InternalMyDsl.g:255:1: ruleEBtl EOF
            {
             before(grammarAccess.getEBtlRule()); 
            pushFollow(FOLLOW_1);
            ruleEBtl();

            state._fsp--;

             after(grammarAccess.getEBtlRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEBtl"


    // $ANTLR start "ruleEBtl"
    // InternalMyDsl.g:262:1: ruleEBtl : ( ( rule__EBtl__Group__0 ) ) ;
    public final void ruleEBtl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__EBtl__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__EBtl__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__EBtl__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__EBtl__Group__0 )
            {
             before(grammarAccess.getEBtlAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__EBtl__Group__0 )
            // InternalMyDsl.g:269:4: rule__EBtl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EBtl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEBtlAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBtl"


    // $ANTLR start "entryRuleEBcons"
    // InternalMyDsl.g:278:1: entryRuleEBcons : ruleEBcons EOF ;
    public final void entryRuleEBcons() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleEBcons EOF )
            // InternalMyDsl.g:280:1: ruleEBcons EOF
            {
             before(grammarAccess.getEBconsRule()); 
            pushFollow(FOLLOW_1);
            ruleEBcons();

            state._fsp--;

             after(grammarAccess.getEBconsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEBcons"


    // $ANTLR start "ruleEBcons"
    // InternalMyDsl.g:287:1: ruleEBcons : ( ( rule__EBcons__Group__0 ) ) ;
    public final void ruleEBcons() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__EBcons__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__EBcons__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__EBcons__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__EBcons__Group__0 )
            {
             before(grammarAccess.getEBconsAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__EBcons__Group__0 )
            // InternalMyDsl.g:294:4: rule__EBcons__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EBcons__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEBconsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBcons"


    // $ANTLR start "entryRuleEBlist"
    // InternalMyDsl.g:303:1: entryRuleEBlist : ruleEBlist EOF ;
    public final void entryRuleEBlist() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleEBlist EOF )
            // InternalMyDsl.g:305:1: ruleEBlist EOF
            {
             before(grammarAccess.getEBlistRule()); 
            pushFollow(FOLLOW_1);
            ruleEBlist();

            state._fsp--;

             after(grammarAccess.getEBlistRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEBlist"


    // $ANTLR start "ruleEBlist"
    // InternalMyDsl.g:312:1: ruleEBlist : ( ( rule__EBlist__Group__0 ) ) ;
    public final void ruleEBlist() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__EBlist__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__EBlist__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__EBlist__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__EBlist__Group__0 )
            {
             before(grammarAccess.getEBlistAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__EBlist__Group__0 )
            // InternalMyDsl.g:319:4: rule__EBlist__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EBlist__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEBlistAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBlist"


    // $ANTLR start "rule__ExprBase__Alternatives"
    // InternalMyDsl.g:327:1: rule__ExprBase__Alternatives : ( ( ( rule__ExprBase__Group_0__0 ) ) | ( ( rule__ExprBase__VAssignment_1 ) ) | ( ( rule__ExprBase__SyAssignment_2 ) ) | ( ( rule__ExprBase__EbtAssignment_3 ) ) | ( ( rule__ExprBase__EbhAssignment_4 ) ) | ( ( rule__ExprBase__EbcAssignment_5 ) ) | ( ( rule__ExprBase__EblAssignment_6 ) ) | ( ( rule__ExprBase__EbsAssignment_7 ) ) );
    public final void rule__ExprBase__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:331:1: ( ( ( rule__ExprBase__Group_0__0 ) ) | ( ( rule__ExprBase__VAssignment_1 ) ) | ( ( rule__ExprBase__SyAssignment_2 ) ) | ( ( rule__ExprBase__EbtAssignment_3 ) ) | ( ( rule__ExprBase__EbhAssignment_4 ) ) | ( ( rule__ExprBase__EbcAssignment_5 ) ) | ( ( rule__ExprBase__EblAssignment_6 ) ) | ( ( rule__ExprBase__EbsAssignment_7 ) ) )
            int alt2=8;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:332:2: ( ( rule__ExprBase__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:332:2: ( ( rule__ExprBase__Group_0__0 ) )
                    // InternalMyDsl.g:333:3: ( rule__ExprBase__Group_0__0 )
                    {
                     before(grammarAccess.getExprBaseAccess().getGroup_0()); 
                    // InternalMyDsl.g:334:3: ( rule__ExprBase__Group_0__0 )
                    // InternalMyDsl.g:334:4: rule__ExprBase__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExprBase__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExprBaseAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:338:2: ( ( rule__ExprBase__VAssignment_1 ) )
                    {
                    // InternalMyDsl.g:338:2: ( ( rule__ExprBase__VAssignment_1 ) )
                    // InternalMyDsl.g:339:3: ( rule__ExprBase__VAssignment_1 )
                    {
                     before(grammarAccess.getExprBaseAccess().getVAssignment_1()); 
                    // InternalMyDsl.g:340:3: ( rule__ExprBase__VAssignment_1 )
                    // InternalMyDsl.g:340:4: rule__ExprBase__VAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExprBase__VAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getExprBaseAccess().getVAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:344:2: ( ( rule__ExprBase__SyAssignment_2 ) )
                    {
                    // InternalMyDsl.g:344:2: ( ( rule__ExprBase__SyAssignment_2 ) )
                    // InternalMyDsl.g:345:3: ( rule__ExprBase__SyAssignment_2 )
                    {
                     before(grammarAccess.getExprBaseAccess().getSyAssignment_2()); 
                    // InternalMyDsl.g:346:3: ( rule__ExprBase__SyAssignment_2 )
                    // InternalMyDsl.g:346:4: rule__ExprBase__SyAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExprBase__SyAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getExprBaseAccess().getSyAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:350:2: ( ( rule__ExprBase__EbtAssignment_3 ) )
                    {
                    // InternalMyDsl.g:350:2: ( ( rule__ExprBase__EbtAssignment_3 ) )
                    // InternalMyDsl.g:351:3: ( rule__ExprBase__EbtAssignment_3 )
                    {
                     before(grammarAccess.getExprBaseAccess().getEbtAssignment_3()); 
                    // InternalMyDsl.g:352:3: ( rule__ExprBase__EbtAssignment_3 )
                    // InternalMyDsl.g:352:4: rule__ExprBase__EbtAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExprBase__EbtAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getExprBaseAccess().getEbtAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:356:2: ( ( rule__ExprBase__EbhAssignment_4 ) )
                    {
                    // InternalMyDsl.g:356:2: ( ( rule__ExprBase__EbhAssignment_4 ) )
                    // InternalMyDsl.g:357:3: ( rule__ExprBase__EbhAssignment_4 )
                    {
                     before(grammarAccess.getExprBaseAccess().getEbhAssignment_4()); 
                    // InternalMyDsl.g:358:3: ( rule__ExprBase__EbhAssignment_4 )
                    // InternalMyDsl.g:358:4: rule__ExprBase__EbhAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExprBase__EbhAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getExprBaseAccess().getEbhAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:362:2: ( ( rule__ExprBase__EbcAssignment_5 ) )
                    {
                    // InternalMyDsl.g:362:2: ( ( rule__ExprBase__EbcAssignment_5 ) )
                    // InternalMyDsl.g:363:3: ( rule__ExprBase__EbcAssignment_5 )
                    {
                     before(grammarAccess.getExprBaseAccess().getEbcAssignment_5()); 
                    // InternalMyDsl.g:364:3: ( rule__ExprBase__EbcAssignment_5 )
                    // InternalMyDsl.g:364:4: rule__ExprBase__EbcAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExprBase__EbcAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getExprBaseAccess().getEbcAssignment_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:368:2: ( ( rule__ExprBase__EblAssignment_6 ) )
                    {
                    // InternalMyDsl.g:368:2: ( ( rule__ExprBase__EblAssignment_6 ) )
                    // InternalMyDsl.g:369:3: ( rule__ExprBase__EblAssignment_6 )
                    {
                     before(grammarAccess.getExprBaseAccess().getEblAssignment_6()); 
                    // InternalMyDsl.g:370:3: ( rule__ExprBase__EblAssignment_6 )
                    // InternalMyDsl.g:370:4: rule__ExprBase__EblAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExprBase__EblAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getExprBaseAccess().getEblAssignment_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:374:2: ( ( rule__ExprBase__EbsAssignment_7 ) )
                    {
                    // InternalMyDsl.g:374:2: ( ( rule__ExprBase__EbsAssignment_7 ) )
                    // InternalMyDsl.g:375:3: ( rule__ExprBase__EbsAssignment_7 )
                    {
                     before(grammarAccess.getExprBaseAccess().getEbsAssignment_7()); 
                    // InternalMyDsl.g:376:3: ( rule__ExprBase__EbsAssignment_7 )
                    // InternalMyDsl.g:376:4: rule__ExprBase__EbsAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExprBase__EbsAssignment_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getExprBaseAccess().getEbsAssignment_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Alternatives"


    // $ANTLR start "rule__Equal__Group__0"
    // InternalMyDsl.g:384:1: rule__Equal__Group__0 : rule__Equal__Group__0__Impl rule__Equal__Group__1 ;
    public final void rule__Equal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:388:1: ( rule__Equal__Group__0__Impl rule__Equal__Group__1 )
            // InternalMyDsl.g:389:2: rule__Equal__Group__0__Impl rule__Equal__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Equal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equal__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__0"


    // $ANTLR start "rule__Equal__Group__0__Impl"
    // InternalMyDsl.g:396:1: rule__Equal__Group__0__Impl : ( ( rule__Equal__VarsAssignment_0 ) ) ;
    public final void rule__Equal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:400:1: ( ( ( rule__Equal__VarsAssignment_0 ) ) )
            // InternalMyDsl.g:401:1: ( ( rule__Equal__VarsAssignment_0 ) )
            {
            // InternalMyDsl.g:401:1: ( ( rule__Equal__VarsAssignment_0 ) )
            // InternalMyDsl.g:402:2: ( rule__Equal__VarsAssignment_0 )
            {
             before(grammarAccess.getEqualAccess().getVarsAssignment_0()); 
            // InternalMyDsl.g:403:2: ( rule__Equal__VarsAssignment_0 )
            // InternalMyDsl.g:403:3: rule__Equal__VarsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Equal__VarsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEqualAccess().getVarsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__0__Impl"


    // $ANTLR start "rule__Equal__Group__1"
    // InternalMyDsl.g:411:1: rule__Equal__Group__1 : rule__Equal__Group__1__Impl rule__Equal__Group__2 ;
    public final void rule__Equal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:415:1: ( rule__Equal__Group__1__Impl rule__Equal__Group__2 )
            // InternalMyDsl.g:416:2: rule__Equal__Group__1__Impl rule__Equal__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Equal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equal__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__1"


    // $ANTLR start "rule__Equal__Group__1__Impl"
    // InternalMyDsl.g:423:1: rule__Equal__Group__1__Impl : ( ':=' ) ;
    public final void rule__Equal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:427:1: ( ( ':=' ) )
            // InternalMyDsl.g:428:1: ( ':=' )
            {
            // InternalMyDsl.g:428:1: ( ':=' )
            // InternalMyDsl.g:429:2: ':='
            {
             before(grammarAccess.getEqualAccess().getColonEqualsSignKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEqualAccess().getColonEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__1__Impl"


    // $ANTLR start "rule__Equal__Group__2"
    // InternalMyDsl.g:438:1: rule__Equal__Group__2 : rule__Equal__Group__2__Impl ;
    public final void rule__Equal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:442:1: ( rule__Equal__Group__2__Impl )
            // InternalMyDsl.g:443:2: rule__Equal__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equal__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__2"


    // $ANTLR start "rule__Equal__Group__2__Impl"
    // InternalMyDsl.g:449:1: rule__Equal__Group__2__Impl : ( ( rule__Equal__ExpAssignment_2 ) ) ;
    public final void rule__Equal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:453:1: ( ( ( rule__Equal__ExpAssignment_2 ) ) )
            // InternalMyDsl.g:454:1: ( ( rule__Equal__ExpAssignment_2 ) )
            {
            // InternalMyDsl.g:454:1: ( ( rule__Equal__ExpAssignment_2 ) )
            // InternalMyDsl.g:455:2: ( rule__Equal__ExpAssignment_2 )
            {
             before(grammarAccess.getEqualAccess().getExpAssignment_2()); 
            // InternalMyDsl.g:456:2: ( rule__Equal__ExpAssignment_2 )
            // InternalMyDsl.g:456:3: rule__Equal__ExpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Equal__ExpAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEqualAccess().getExpAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__2__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // InternalMyDsl.g:465:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:469:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalMyDsl.g:470:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // InternalMyDsl.g:477:1: rule__Expression__Group__0__Impl : ( ( rule__Expression__ExpbgAssignment_0 ) ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:481:1: ( ( ( rule__Expression__ExpbgAssignment_0 ) ) )
            // InternalMyDsl.g:482:1: ( ( rule__Expression__ExpbgAssignment_0 ) )
            {
            // InternalMyDsl.g:482:1: ( ( rule__Expression__ExpbgAssignment_0 ) )
            // InternalMyDsl.g:483:2: ( rule__Expression__ExpbgAssignment_0 )
            {
             before(grammarAccess.getExpressionAccess().getExpbgAssignment_0()); 
            // InternalMyDsl.g:484:2: ( rule__Expression__ExpbgAssignment_0 )
            // InternalMyDsl.g:484:3: rule__Expression__ExpbgAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__ExpbgAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getExpbgAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // InternalMyDsl.g:492:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:496:1: ( rule__Expression__Group__1__Impl )
            // InternalMyDsl.g:497:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // InternalMyDsl.g:503:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:507:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // InternalMyDsl.g:508:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // InternalMyDsl.g:508:1: ( ( rule__Expression__Group_1__0 )? )
            // InternalMyDsl.g:509:2: ( rule__Expression__Group_1__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // InternalMyDsl.g:510:2: ( rule__Expression__Group_1__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:510:3: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // InternalMyDsl.g:519:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:523:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalMyDsl.g:524:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // InternalMyDsl.g:531:1: rule__Expression__Group_1__0__Impl : ( '=?' ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:535:1: ( ( '=?' ) )
            // InternalMyDsl.g:536:1: ( '=?' )
            {
            // InternalMyDsl.g:536:1: ( '=?' )
            // InternalMyDsl.g:537:2: '=?'
            {
             before(grammarAccess.getExpressionAccess().getEqualsSignQuestionMarkKeyword_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getEqualsSignQuestionMarkKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // InternalMyDsl.g:546:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:550:1: ( rule__Expression__Group_1__1__Impl )
            // InternalMyDsl.g:551:2: rule__Expression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // InternalMyDsl.g:557:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__ExpbdAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:561:1: ( ( ( rule__Expression__ExpbdAssignment_1_1 ) ) )
            // InternalMyDsl.g:562:1: ( ( rule__Expression__ExpbdAssignment_1_1 ) )
            {
            // InternalMyDsl.g:562:1: ( ( rule__Expression__ExpbdAssignment_1_1 ) )
            // InternalMyDsl.g:563:2: ( rule__Expression__ExpbdAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getExpbdAssignment_1_1()); 
            // InternalMyDsl.g:564:2: ( rule__Expression__ExpbdAssignment_1_1 )
            // InternalMyDsl.g:564:3: rule__Expression__ExpbdAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__ExpbdAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getExpbdAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__ExprBase__Group_0__0"
    // InternalMyDsl.g:573:1: rule__ExprBase__Group_0__0 : rule__ExprBase__Group_0__0__Impl rule__ExprBase__Group_0__1 ;
    public final void rule__ExprBase__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:577:1: ( rule__ExprBase__Group_0__0__Impl rule__ExprBase__Group_0__1 )
            // InternalMyDsl.g:578:2: rule__ExprBase__Group_0__0__Impl rule__ExprBase__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__ExprBase__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExprBase__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_0__0"


    // $ANTLR start "rule__ExprBase__Group_0__0__Impl"
    // InternalMyDsl.g:585:1: rule__ExprBase__Group_0__0__Impl : ( () ) ;
    public final void rule__ExprBase__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:589:1: ( ( () ) )
            // InternalMyDsl.g:590:1: ( () )
            {
            // InternalMyDsl.g:590:1: ( () )
            // InternalMyDsl.g:591:2: ()
            {
             before(grammarAccess.getExprBaseAccess().getExprBaseAction_0_0()); 
            // InternalMyDsl.g:592:2: ()
            // InternalMyDsl.g:592:3: 
            {
            }

             after(grammarAccess.getExprBaseAccess().getExprBaseAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_0__0__Impl"


    // $ANTLR start "rule__ExprBase__Group_0__1"
    // InternalMyDsl.g:600:1: rule__ExprBase__Group_0__1 : rule__ExprBase__Group_0__1__Impl ;
    public final void rule__ExprBase__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:604:1: ( rule__ExprBase__Group_0__1__Impl )
            // InternalMyDsl.g:605:2: rule__ExprBase__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExprBase__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_0__1"


    // $ANTLR start "rule__ExprBase__Group_0__1__Impl"
    // InternalMyDsl.g:611:1: rule__ExprBase__Group_0__1__Impl : ( ( rule__ExprBase__NiAssignment_0_1 ) ) ;
    public final void rule__ExprBase__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:615:1: ( ( ( rule__ExprBase__NiAssignment_0_1 ) ) )
            // InternalMyDsl.g:616:1: ( ( rule__ExprBase__NiAssignment_0_1 ) )
            {
            // InternalMyDsl.g:616:1: ( ( rule__ExprBase__NiAssignment_0_1 ) )
            // InternalMyDsl.g:617:2: ( rule__ExprBase__NiAssignment_0_1 )
            {
             before(grammarAccess.getExprBaseAccess().getNiAssignment_0_1()); 
            // InternalMyDsl.g:618:2: ( rule__ExprBase__NiAssignment_0_1 )
            // InternalMyDsl.g:618:3: rule__ExprBase__NiAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ExprBase__NiAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getExprBaseAccess().getNiAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_0__1__Impl"


    // $ANTLR start "rule__EBsy__Group__0"
    // InternalMyDsl.g:627:1: rule__EBsy__Group__0 : rule__EBsy__Group__0__Impl rule__EBsy__Group__1 ;
    public final void rule__EBsy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:631:1: ( rule__EBsy__Group__0__Impl rule__EBsy__Group__1 )
            // InternalMyDsl.g:632:2: rule__EBsy__Group__0__Impl rule__EBsy__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__EBsy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EBsy__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBsy__Group__0"


    // $ANTLR start "rule__EBsy__Group__0__Impl"
    // InternalMyDsl.g:639:1: rule__EBsy__Group__0__Impl : ( '(' ) ;
    public final void rule__EBsy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:643:1: ( ( '(' ) )
            // InternalMyDsl.g:644:1: ( '(' )
            {
            // InternalMyDsl.g:644:1: ( '(' )
            // InternalMyDsl.g:645:2: '('
            {
             before(grammarAccess.getEBsyAccess().getLeftParenthesisKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEBsyAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBsy__Group__0__Impl"


    // $ANTLR start "rule__EBsy__Group__1"
    // InternalMyDsl.g:654:1: rule__EBsy__Group__1 : rule__EBsy__Group__1__Impl rule__EBsy__Group__2 ;
    public final void rule__EBsy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:658:1: ( rule__EBsy__Group__1__Impl rule__EBsy__Group__2 )
            // InternalMyDsl.g:659:2: rule__EBsy__Group__1__Impl rule__EBsy__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__EBsy__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EBsy__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBsy__Group__1"


    // $ANTLR start "rule__EBsy__Group__1__Impl"
    // InternalMyDsl.g:666:1: rule__EBsy__Group__1__Impl : ( ( rule__EBsy__SyAssignment_1 ) ) ;
    public final void rule__EBsy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:670:1: ( ( ( rule__EBsy__SyAssignment_1 ) ) )
            // InternalMyDsl.g:671:1: ( ( rule__EBsy__SyAssignment_1 ) )
            {
            // InternalMyDsl.g:671:1: ( ( rule__EBsy__SyAssignment_1 ) )
            // InternalMyDsl.g:672:2: ( rule__EBsy__SyAssignment_1 )
            {
             before(grammarAccess.getEBsyAccess().getSyAssignment_1()); 
            // InternalMyDsl.g:673:2: ( rule__EBsy__SyAssignment_1 )
            // InternalMyDsl.g:673:3: rule__EBsy__SyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EBsy__SyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEBsyAccess().getSyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBsy__Group__1__Impl"


    // $ANTLR start "rule__EBsy__Group__2"
    // InternalMyDsl.g:681:1: rule__EBsy__Group__2 : rule__EBsy__Group__2__Impl rule__EBsy__Group__3 ;
    public final void rule__EBsy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:685:1: ( rule__EBsy__Group__2__Impl rule__EBsy__Group__3 )
            // InternalMyDsl.g:686:2: rule__EBsy__Group__2__Impl rule__EBsy__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__EBsy__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EBsy__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBsy__Group__2"


    // $ANTLR start "rule__EBsy__Group__2__Impl"
    // InternalMyDsl.g:693:1: rule__EBsy__Group__2__Impl : ( ( rule__EBsy__LexpbAssignment_2 )* ) ;
    public final void rule__EBsy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:697:1: ( ( ( rule__EBsy__LexpbAssignment_2 )* ) )
            // InternalMyDsl.g:698:1: ( ( rule__EBsy__LexpbAssignment_2 )* )
            {
            // InternalMyDsl.g:698:1: ( ( rule__EBsy__LexpbAssignment_2 )* )
            // InternalMyDsl.g:699:2: ( rule__EBsy__LexpbAssignment_2 )*
            {
             before(grammarAccess.getEBsyAccess().getLexpbAssignment_2()); 
            // InternalMyDsl.g:700:2: ( rule__EBsy__LexpbAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_VARIABLE && LA4_0<=RULE_SYMBOL)||LA4_0==15||LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:700:3: rule__EBsy__LexpbAssignment_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__EBsy__LexpbAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getEBsyAccess().getLexpbAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBsy__Group__2__Impl"


    // $ANTLR start "rule__EBsy__Group__3"
    // InternalMyDsl.g:708:1: rule__EBsy__Group__3 : rule__EBsy__Group__3__Impl ;
    public final void rule__EBsy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:712:1: ( rule__EBsy__Group__3__Impl )
            // InternalMyDsl.g:713:2: rule__EBsy__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EBsy__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBsy__Group__3"


    // $ANTLR start "rule__EBsy__Group__3__Impl"
    // InternalMyDsl.g:719:1: rule__EBsy__Group__3__Impl : ( ')' ) ;
    public final void rule__EBsy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:723:1: ( ( ')' ) )
            // InternalMyDsl.g:724:1: ( ')' )
            {
            // InternalMyDsl.g:724:1: ( ')' )
            // InternalMyDsl.g:725:2: ')'
            {
             before(grammarAccess.getEBsyAccess().getRightParenthesisKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEBsyAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBsy__Group__3__Impl"


    // $ANTLR start "rule__EBhd__Group__0"
    // InternalMyDsl.g:735:1: rule__EBhd__Group__0 : rule__EBhd__Group__0__Impl rule__EBhd__Group__1 ;
    public final void rule__EBhd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:739:1: ( rule__EBhd__Group__0__Impl rule__EBhd__Group__1 )
            // InternalMyDsl.g:740:2: rule__EBhd__Group__0__Impl rule__EBhd__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__EBhd__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EBhd__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBhd__Group__0"


    // $ANTLR start "rule__EBhd__Group__0__Impl"
    // InternalMyDsl.g:747:1: rule__EBhd__Group__0__Impl : ( '(' ) ;
    public final void rule__EBhd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:751:1: ( ( '(' ) )
            // InternalMyDsl.g:752:1: ( '(' )
            {
            // InternalMyDsl.g:752:1: ( '(' )
            // InternalMyDsl.g:753:2: '('
            {
             before(grammarAccess.getEBhdAccess().getLeftParenthesisKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEBhdAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBhd__Group__0__Impl"


    // $ANTLR start "rule__EBhd__Group__1"
    // InternalMyDsl.g:762:1: rule__EBhd__Group__1 : rule__EBhd__Group__1__Impl rule__EBhd__Group__2 ;
    public final void rule__EBhd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:766:1: ( rule__EBhd__Group__1__Impl rule__EBhd__Group__2 )
            // InternalMyDsl.g:767:2: rule__EBhd__Group__1__Impl rule__EBhd__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__EBhd__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EBhd__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBhd__Group__1"


    // $ANTLR start "rule__EBhd__Group__1__Impl"
    // InternalMyDsl.g:774:1: rule__EBhd__Group__1__Impl : ( 'hd' ) ;
    public final void rule__EBhd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:778:1: ( ( 'hd' ) )
            // InternalMyDsl.g:779:1: ( 'hd' )
            {
            // InternalMyDsl.g:779:1: ( 'hd' )
            // InternalMyDsl.g:780:2: 'hd'
            {
             before(grammarAccess.getEBhdAccess().getHdKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEBhdAccess().getHdKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBhd__Group__1__Impl"


    // $ANTLR start "rule__EBhd__Group__2"
    // InternalMyDsl.g:789:1: rule__EBhd__Group__2 : rule__EBhd__Group__2__Impl rule__EBhd__Group__3 ;
    public final void rule__EBhd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:793:1: ( rule__EBhd__Group__2__Impl rule__EBhd__Group__3 )
            // InternalMyDsl.g:794:2: rule__EBhd__Group__2__Impl rule__EBhd__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__EBhd__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EBhd__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBhd__Group__2"


    // $ANTLR start "rule__EBhd__Group__2__Impl"
    // InternalMyDsl.g:801:1: rule__EBhd__Group__2__Impl : ( ( rule__EBhd__ExpbAssignment_2 ) ) ;
    public final void rule__EBhd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:805:1: ( ( ( rule__EBhd__ExpbAssignment_2 ) ) )
            // InternalMyDsl.g:806:1: ( ( rule__EBhd__ExpbAssignment_2 ) )
            {
            // InternalMyDsl.g:806:1: ( ( rule__EBhd__ExpbAssignment_2 ) )
            // InternalMyDsl.g:807:2: ( rule__EBhd__ExpbAssignment_2 )
            {
             before(grammarAccess.getEBhdAccess().getExpbAssignment_2()); 
            // InternalMyDsl.g:808:2: ( rule__EBhd__ExpbAssignment_2 )
            // InternalMyDsl.g:808:3: rule__EBhd__ExpbAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EBhd__ExpbAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEBhdAccess().getExpbAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBhd__Group__2__Impl"


    // $ANTLR start "rule__EBhd__Group__3"
    // InternalMyDsl.g:816:1: rule__EBhd__Group__3 : rule__EBhd__Group__3__Impl ;
    public final void rule__EBhd__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:820:1: ( rule__EBhd__Group__3__Impl )
            // InternalMyDsl.g:821:2: rule__EBhd__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EBhd__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBhd__Group__3"


    // $ANTLR start "rule__EBhd__Group__3__Impl"
    // InternalMyDsl.g:827:1: rule__EBhd__Group__3__Impl : ( ')' ) ;
    public final void rule__EBhd__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:831:1: ( ( ')' ) )
            // InternalMyDsl.g:832:1: ( ')' )
            {
            // InternalMyDsl.g:832:1: ( ')' )
            // InternalMyDsl.g:833:2: ')'
            {
             before(grammarAccess.getEBhdAccess().getRightParenthesisKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEBhdAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBhd__Group__3__Impl"


    // $ANTLR start "rule__EBtl__Group__0"
    // InternalMyDsl.g:843:1: rule__EBtl__Group__0 : rule__EBtl__Group__0__Impl rule__EBtl__Group__1 ;
    public final void rule__EBtl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:847:1: ( rule__EBtl__Group__0__Impl rule__EBtl__Group__1 )
            // InternalMyDsl.g:848:2: rule__EBtl__Group__0__Impl rule__EBtl__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__EBtl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EBtl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBtl__Group__0"


    // $ANTLR start "rule__EBtl__Group__0__Impl"
    // InternalMyDsl.g:855:1: rule__EBtl__Group__0__Impl : ( '(' ) ;
    public final void rule__EBtl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:859:1: ( ( '(' ) )
            // InternalMyDsl.g:860:1: ( '(' )
            {
            // InternalMyDsl.g:860:1: ( '(' )
            // InternalMyDsl.g:861:2: '('
            {
             before(grammarAccess.getEBtlAccess().getLeftParenthesisKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEBtlAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBtl__Group__0__Impl"


    // $ANTLR start "rule__EBtl__Group__1"
    // InternalMyDsl.g:870:1: rule__EBtl__Group__1 : rule__EBtl__Group__1__Impl rule__EBtl__Group__2 ;
    public final void rule__EBtl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:874:1: ( rule__EBtl__Group__1__Impl rule__EBtl__Group__2 )
            // InternalMyDsl.g:875:2: rule__EBtl__Group__1__Impl rule__EBtl__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__EBtl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EBtl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBtl__Group__1"


    // $ANTLR start "rule__EBtl__Group__1__Impl"
    // InternalMyDsl.g:882:1: rule__EBtl__Group__1__Impl : ( 'tl' ) ;
    public final void rule__EBtl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:886:1: ( ( 'tl' ) )
            // InternalMyDsl.g:887:1: ( 'tl' )
            {
            // InternalMyDsl.g:887:1: ( 'tl' )
            // InternalMyDsl.g:888:2: 'tl'
            {
             before(grammarAccess.getEBtlAccess().getTlKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEBtlAccess().getTlKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBtl__Group__1__Impl"


    // $ANTLR start "rule__EBtl__Group__2"
    // InternalMyDsl.g:897:1: rule__EBtl__Group__2 : rule__EBtl__Group__2__Impl rule__EBtl__Group__3 ;
    public final void rule__EBtl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:901:1: ( rule__EBtl__Group__2__Impl rule__EBtl__Group__3 )
            // InternalMyDsl.g:902:2: rule__EBtl__Group__2__Impl rule__EBtl__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__EBtl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EBtl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBtl__Group__2"


    // $ANTLR start "rule__EBtl__Group__2__Impl"
    // InternalMyDsl.g:909:1: rule__EBtl__Group__2__Impl : ( ( rule__EBtl__ExpbAssignment_2 ) ) ;
    public final void rule__EBtl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:913:1: ( ( ( rule__EBtl__ExpbAssignment_2 ) ) )
            // InternalMyDsl.g:914:1: ( ( rule__EBtl__ExpbAssignment_2 ) )
            {
            // InternalMyDsl.g:914:1: ( ( rule__EBtl__ExpbAssignment_2 ) )
            // InternalMyDsl.g:915:2: ( rule__EBtl__ExpbAssignment_2 )
            {
             before(grammarAccess.getEBtlAccess().getExpbAssignment_2()); 
            // InternalMyDsl.g:916:2: ( rule__EBtl__ExpbAssignment_2 )
            // InternalMyDsl.g:916:3: rule__EBtl__ExpbAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EBtl__ExpbAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEBtlAccess().getExpbAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBtl__Group__2__Impl"


    // $ANTLR start "rule__EBtl__Group__3"
    // InternalMyDsl.g:924:1: rule__EBtl__Group__3 : rule__EBtl__Group__3__Impl ;
    public final void rule__EBtl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:928:1: ( rule__EBtl__Group__3__Impl )
            // InternalMyDsl.g:929:2: rule__EBtl__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EBtl__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBtl__Group__3"


    // $ANTLR start "rule__EBtl__Group__3__Impl"
    // InternalMyDsl.g:935:1: rule__EBtl__Group__3__Impl : ( ')' ) ;
    public final void rule__EBtl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:939:1: ( ( ')' ) )
            // InternalMyDsl.g:940:1: ( ')' )
            {
            // InternalMyDsl.g:940:1: ( ')' )
            // InternalMyDsl.g:941:2: ')'
            {
             before(grammarAccess.getEBtlAccess().getRightParenthesisKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEBtlAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBtl__Group__3__Impl"


    // $ANTLR start "rule__EBcons__Group__0"
    // InternalMyDsl.g:951:1: rule__EBcons__Group__0 : rule__EBcons__Group__0__Impl rule__EBcons__Group__1 ;
    public final void rule__EBcons__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:955:1: ( rule__EBcons__Group__0__Impl rule__EBcons__Group__1 )
            // InternalMyDsl.g:956:2: rule__EBcons__Group__0__Impl rule__EBcons__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__EBcons__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EBcons__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBcons__Group__0"


    // $ANTLR start "rule__EBcons__Group__0__Impl"
    // InternalMyDsl.g:963:1: rule__EBcons__Group__0__Impl : ( () ) ;
    public final void rule__EBcons__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:967:1: ( ( () ) )
            // InternalMyDsl.g:968:1: ( () )
            {
            // InternalMyDsl.g:968:1: ( () )
            // InternalMyDsl.g:969:2: ()
            {
             before(grammarAccess.getEBconsAccess().getEBconsAction_0()); 
            // InternalMyDsl.g:970:2: ()
            // InternalMyDsl.g:970:3: 
            {
            }

             after(grammarAccess.getEBconsAccess().getEBconsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBcons__Group__0__Impl"


    // $ANTLR start "rule__EBcons__Group__1"
    // InternalMyDsl.g:978:1: rule__EBcons__Group__1 : rule__EBcons__Group__1__Impl rule__EBcons__Group__2 ;
    public final void rule__EBcons__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:982:1: ( rule__EBcons__Group__1__Impl rule__EBcons__Group__2 )
            // InternalMyDsl.g:983:2: rule__EBcons__Group__1__Impl rule__EBcons__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__EBcons__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EBcons__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBcons__Group__1"


    // $ANTLR start "rule__EBcons__Group__1__Impl"
    // InternalMyDsl.g:990:1: rule__EBcons__Group__1__Impl : ( '(' ) ;
    public final void rule__EBcons__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:994:1: ( ( '(' ) )
            // InternalMyDsl.g:995:1: ( '(' )
            {
            // InternalMyDsl.g:995:1: ( '(' )
            // InternalMyDsl.g:996:2: '('
            {
             before(grammarAccess.getEBconsAccess().getLeftParenthesisKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEBconsAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBcons__Group__1__Impl"


    // $ANTLR start "rule__EBcons__Group__2"
    // InternalMyDsl.g:1005:1: rule__EBcons__Group__2 : rule__EBcons__Group__2__Impl rule__EBcons__Group__3 ;
    public final void rule__EBcons__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1009:1: ( rule__EBcons__Group__2__Impl rule__EBcons__Group__3 )
            // InternalMyDsl.g:1010:2: rule__EBcons__Group__2__Impl rule__EBcons__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__EBcons__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EBcons__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBcons__Group__2"


    // $ANTLR start "rule__EBcons__Group__2__Impl"
    // InternalMyDsl.g:1017:1: rule__EBcons__Group__2__Impl : ( 'cons' ) ;
    public final void rule__EBcons__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1021:1: ( ( 'cons' ) )
            // InternalMyDsl.g:1022:1: ( 'cons' )
            {
            // InternalMyDsl.g:1022:1: ( 'cons' )
            // InternalMyDsl.g:1023:2: 'cons'
            {
             before(grammarAccess.getEBconsAccess().getConsKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEBconsAccess().getConsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBcons__Group__2__Impl"


    // $ANTLR start "rule__EBcons__Group__3"
    // InternalMyDsl.g:1032:1: rule__EBcons__Group__3 : rule__EBcons__Group__3__Impl rule__EBcons__Group__4 ;
    public final void rule__EBcons__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1036:1: ( rule__EBcons__Group__3__Impl rule__EBcons__Group__4 )
            // InternalMyDsl.g:1037:2: rule__EBcons__Group__3__Impl rule__EBcons__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__EBcons__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EBcons__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBcons__Group__3"


    // $ANTLR start "rule__EBcons__Group__3__Impl"
    // InternalMyDsl.g:1044:1: rule__EBcons__Group__3__Impl : ( ( rule__EBcons__LexpbAssignment_3 )* ) ;
    public final void rule__EBcons__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1048:1: ( ( ( rule__EBcons__LexpbAssignment_3 )* ) )
            // InternalMyDsl.g:1049:1: ( ( rule__EBcons__LexpbAssignment_3 )* )
            {
            // InternalMyDsl.g:1049:1: ( ( rule__EBcons__LexpbAssignment_3 )* )
            // InternalMyDsl.g:1050:2: ( rule__EBcons__LexpbAssignment_3 )*
            {
             before(grammarAccess.getEBconsAccess().getLexpbAssignment_3()); 
            // InternalMyDsl.g:1051:2: ( rule__EBcons__LexpbAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_VARIABLE && LA5_0<=RULE_SYMBOL)||LA5_0==15||LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:1051:3: rule__EBcons__LexpbAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__EBcons__LexpbAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getEBconsAccess().getLexpbAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBcons__Group__3__Impl"


    // $ANTLR start "rule__EBcons__Group__4"
    // InternalMyDsl.g:1059:1: rule__EBcons__Group__4 : rule__EBcons__Group__4__Impl ;
    public final void rule__EBcons__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1063:1: ( rule__EBcons__Group__4__Impl )
            // InternalMyDsl.g:1064:2: rule__EBcons__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EBcons__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBcons__Group__4"


    // $ANTLR start "rule__EBcons__Group__4__Impl"
    // InternalMyDsl.g:1070:1: rule__EBcons__Group__4__Impl : ( ')' ) ;
    public final void rule__EBcons__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1074:1: ( ( ')' ) )
            // InternalMyDsl.g:1075:1: ( ')' )
            {
            // InternalMyDsl.g:1075:1: ( ')' )
            // InternalMyDsl.g:1076:2: ')'
            {
             before(grammarAccess.getEBconsAccess().getRightParenthesisKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEBconsAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBcons__Group__4__Impl"


    // $ANTLR start "rule__EBlist__Group__0"
    // InternalMyDsl.g:1086:1: rule__EBlist__Group__0 : rule__EBlist__Group__0__Impl rule__EBlist__Group__1 ;
    public final void rule__EBlist__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1090:1: ( rule__EBlist__Group__0__Impl rule__EBlist__Group__1 )
            // InternalMyDsl.g:1091:2: rule__EBlist__Group__0__Impl rule__EBlist__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__EBlist__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EBlist__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBlist__Group__0"


    // $ANTLR start "rule__EBlist__Group__0__Impl"
    // InternalMyDsl.g:1098:1: rule__EBlist__Group__0__Impl : ( () ) ;
    public final void rule__EBlist__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1102:1: ( ( () ) )
            // InternalMyDsl.g:1103:1: ( () )
            {
            // InternalMyDsl.g:1103:1: ( () )
            // InternalMyDsl.g:1104:2: ()
            {
             before(grammarAccess.getEBlistAccess().getEBlistAction_0()); 
            // InternalMyDsl.g:1105:2: ()
            // InternalMyDsl.g:1105:3: 
            {
            }

             after(grammarAccess.getEBlistAccess().getEBlistAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBlist__Group__0__Impl"


    // $ANTLR start "rule__EBlist__Group__1"
    // InternalMyDsl.g:1113:1: rule__EBlist__Group__1 : rule__EBlist__Group__1__Impl rule__EBlist__Group__2 ;
    public final void rule__EBlist__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1117:1: ( rule__EBlist__Group__1__Impl rule__EBlist__Group__2 )
            // InternalMyDsl.g:1118:2: rule__EBlist__Group__1__Impl rule__EBlist__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__EBlist__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EBlist__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBlist__Group__1"


    // $ANTLR start "rule__EBlist__Group__1__Impl"
    // InternalMyDsl.g:1125:1: rule__EBlist__Group__1__Impl : ( '(' ) ;
    public final void rule__EBlist__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1129:1: ( ( '(' ) )
            // InternalMyDsl.g:1130:1: ( '(' )
            {
            // InternalMyDsl.g:1130:1: ( '(' )
            // InternalMyDsl.g:1131:2: '('
            {
             before(grammarAccess.getEBlistAccess().getLeftParenthesisKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEBlistAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBlist__Group__1__Impl"


    // $ANTLR start "rule__EBlist__Group__2"
    // InternalMyDsl.g:1140:1: rule__EBlist__Group__2 : rule__EBlist__Group__2__Impl rule__EBlist__Group__3 ;
    public final void rule__EBlist__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1144:1: ( rule__EBlist__Group__2__Impl rule__EBlist__Group__3 )
            // InternalMyDsl.g:1145:2: rule__EBlist__Group__2__Impl rule__EBlist__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__EBlist__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EBlist__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBlist__Group__2"


    // $ANTLR start "rule__EBlist__Group__2__Impl"
    // InternalMyDsl.g:1152:1: rule__EBlist__Group__2__Impl : ( 'list' ) ;
    public final void rule__EBlist__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1156:1: ( ( 'list' ) )
            // InternalMyDsl.g:1157:1: ( 'list' )
            {
            // InternalMyDsl.g:1157:1: ( 'list' )
            // InternalMyDsl.g:1158:2: 'list'
            {
             before(grammarAccess.getEBlistAccess().getListKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEBlistAccess().getListKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBlist__Group__2__Impl"


    // $ANTLR start "rule__EBlist__Group__3"
    // InternalMyDsl.g:1167:1: rule__EBlist__Group__3 : rule__EBlist__Group__3__Impl rule__EBlist__Group__4 ;
    public final void rule__EBlist__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1171:1: ( rule__EBlist__Group__3__Impl rule__EBlist__Group__4 )
            // InternalMyDsl.g:1172:2: rule__EBlist__Group__3__Impl rule__EBlist__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__EBlist__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EBlist__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBlist__Group__3"


    // $ANTLR start "rule__EBlist__Group__3__Impl"
    // InternalMyDsl.g:1179:1: rule__EBlist__Group__3__Impl : ( ( rule__EBlist__LexpbAssignment_3 )* ) ;
    public final void rule__EBlist__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1183:1: ( ( ( rule__EBlist__LexpbAssignment_3 )* ) )
            // InternalMyDsl.g:1184:1: ( ( rule__EBlist__LexpbAssignment_3 )* )
            {
            // InternalMyDsl.g:1184:1: ( ( rule__EBlist__LexpbAssignment_3 )* )
            // InternalMyDsl.g:1185:2: ( rule__EBlist__LexpbAssignment_3 )*
            {
             before(grammarAccess.getEBlistAccess().getLexpbAssignment_3()); 
            // InternalMyDsl.g:1186:2: ( rule__EBlist__LexpbAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_VARIABLE && LA6_0<=RULE_SYMBOL)||LA6_0==15||LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:1186:3: rule__EBlist__LexpbAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__EBlist__LexpbAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getEBlistAccess().getLexpbAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBlist__Group__3__Impl"


    // $ANTLR start "rule__EBlist__Group__4"
    // InternalMyDsl.g:1194:1: rule__EBlist__Group__4 : rule__EBlist__Group__4__Impl ;
    public final void rule__EBlist__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1198:1: ( rule__EBlist__Group__4__Impl )
            // InternalMyDsl.g:1199:2: rule__EBlist__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EBlist__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBlist__Group__4"


    // $ANTLR start "rule__EBlist__Group__4__Impl"
    // InternalMyDsl.g:1205:1: rule__EBlist__Group__4__Impl : ( ')' ) ;
    public final void rule__EBlist__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1209:1: ( ( ')' ) )
            // InternalMyDsl.g:1210:1: ( ')' )
            {
            // InternalMyDsl.g:1210:1: ( ')' )
            // InternalMyDsl.g:1211:2: ')'
            {
             before(grammarAccess.getEBlistAccess().getRightParenthesisKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEBlistAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBlist__Group__4__Impl"


    // $ANTLR start "rule__Model__EqListeAssignment"
    // InternalMyDsl.g:1221:1: rule__Model__EqListeAssignment : ( ruleEqual ) ;
    public final void rule__Model__EqListeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1225:1: ( ( ruleEqual ) )
            // InternalMyDsl.g:1226:2: ( ruleEqual )
            {
            // InternalMyDsl.g:1226:2: ( ruleEqual )
            // InternalMyDsl.g:1227:3: ruleEqual
            {
             before(grammarAccess.getModelAccess().getEqListeEqualParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEqual();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEqListeEqualParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__EqListeAssignment"


    // $ANTLR start "rule__Equal__VarsAssignment_0"
    // InternalMyDsl.g:1236:1: rule__Equal__VarsAssignment_0 : ( ruleVars ) ;
    public final void rule__Equal__VarsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1240:1: ( ( ruleVars ) )
            // InternalMyDsl.g:1241:2: ( ruleVars )
            {
            // InternalMyDsl.g:1241:2: ( ruleVars )
            // InternalMyDsl.g:1242:3: ruleVars
            {
             before(grammarAccess.getEqualAccess().getVarsVarsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVars();

            state._fsp--;

             after(grammarAccess.getEqualAccess().getVarsVarsParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__VarsAssignment_0"


    // $ANTLR start "rule__Equal__ExpAssignment_2"
    // InternalMyDsl.g:1251:1: rule__Equal__ExpAssignment_2 : ( ruleExprs ) ;
    public final void rule__Equal__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1255:1: ( ( ruleExprs ) )
            // InternalMyDsl.g:1256:2: ( ruleExprs )
            {
            // InternalMyDsl.g:1256:2: ( ruleExprs )
            // InternalMyDsl.g:1257:3: ruleExprs
            {
             before(grammarAccess.getEqualAccess().getExpExprsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExprs();

            state._fsp--;

             after(grammarAccess.getEqualAccess().getExpExprsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__ExpAssignment_2"


    // $ANTLR start "rule__Vars__LvarsAssignment"
    // InternalMyDsl.g:1266:1: rule__Vars__LvarsAssignment : ( RULE_VARIABLE ) ;
    public final void rule__Vars__LvarsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1270:1: ( ( RULE_VARIABLE ) )
            // InternalMyDsl.g:1271:2: ( RULE_VARIABLE )
            {
            // InternalMyDsl.g:1271:2: ( RULE_VARIABLE )
            // InternalMyDsl.g:1272:3: RULE_VARIABLE
            {
             before(grammarAccess.getVarsAccess().getLvarsVARIABLETerminalRuleCall_0()); 
            match(input,RULE_VARIABLE,FOLLOW_2); 
             after(grammarAccess.getVarsAccess().getLvarsVARIABLETerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__LvarsAssignment"


    // $ANTLR start "rule__Exprs__LexprAssignment"
    // InternalMyDsl.g:1281:1: rule__Exprs__LexprAssignment : ( ruleExpression ) ;
    public final void rule__Exprs__LexprAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1285:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:1286:2: ( ruleExpression )
            {
            // InternalMyDsl.g:1286:2: ( ruleExpression )
            // InternalMyDsl.g:1287:3: ruleExpression
            {
             before(grammarAccess.getExprsAccess().getLexprExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExprsAccess().getLexprExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__LexprAssignment"


    // $ANTLR start "rule__Expression__ExpbgAssignment_0"
    // InternalMyDsl.g:1296:1: rule__Expression__ExpbgAssignment_0 : ( ruleExprBase ) ;
    public final void rule__Expression__ExpbgAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1300:1: ( ( ruleExprBase ) )
            // InternalMyDsl.g:1301:2: ( ruleExprBase )
            {
            // InternalMyDsl.g:1301:2: ( ruleExprBase )
            // InternalMyDsl.g:1302:3: ruleExprBase
            {
             before(grammarAccess.getExpressionAccess().getExpbgExprBaseParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExprBase();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getExpbgExprBaseParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__ExpbgAssignment_0"


    // $ANTLR start "rule__Expression__ExpbdAssignment_1_1"
    // InternalMyDsl.g:1311:1: rule__Expression__ExpbdAssignment_1_1 : ( ruleExprBase ) ;
    public final void rule__Expression__ExpbdAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1315:1: ( ( ruleExprBase ) )
            // InternalMyDsl.g:1316:2: ( ruleExprBase )
            {
            // InternalMyDsl.g:1316:2: ( ruleExprBase )
            // InternalMyDsl.g:1317:3: ruleExprBase
            {
             before(grammarAccess.getExpressionAccess().getExpbdExprBaseParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExprBase();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getExpbdExprBaseParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__ExpbdAssignment_1_1"


    // $ANTLR start "rule__ExprBase__NiAssignment_0_1"
    // InternalMyDsl.g:1326:1: rule__ExprBase__NiAssignment_0_1 : ( ( 'nil' ) ) ;
    public final void rule__ExprBase__NiAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1330:1: ( ( ( 'nil' ) ) )
            // InternalMyDsl.g:1331:2: ( ( 'nil' ) )
            {
            // InternalMyDsl.g:1331:2: ( ( 'nil' ) )
            // InternalMyDsl.g:1332:3: ( 'nil' )
            {
             before(grammarAccess.getExprBaseAccess().getNiNilKeyword_0_1_0()); 
            // InternalMyDsl.g:1333:3: ( 'nil' )
            // InternalMyDsl.g:1334:4: 'nil'
            {
             before(grammarAccess.getExprBaseAccess().getNiNilKeyword_0_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getExprBaseAccess().getNiNilKeyword_0_1_0()); 

            }

             after(grammarAccess.getExprBaseAccess().getNiNilKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__NiAssignment_0_1"


    // $ANTLR start "rule__ExprBase__VAssignment_1"
    // InternalMyDsl.g:1345:1: rule__ExprBase__VAssignment_1 : ( RULE_VARIABLE ) ;
    public final void rule__ExprBase__VAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1349:1: ( ( RULE_VARIABLE ) )
            // InternalMyDsl.g:1350:2: ( RULE_VARIABLE )
            {
            // InternalMyDsl.g:1350:2: ( RULE_VARIABLE )
            // InternalMyDsl.g:1351:3: RULE_VARIABLE
            {
             before(grammarAccess.getExprBaseAccess().getVVARIABLETerminalRuleCall_1_0()); 
            match(input,RULE_VARIABLE,FOLLOW_2); 
             after(grammarAccess.getExprBaseAccess().getVVARIABLETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__VAssignment_1"


    // $ANTLR start "rule__ExprBase__SyAssignment_2"
    // InternalMyDsl.g:1360:1: rule__ExprBase__SyAssignment_2 : ( RULE_SYMBOL ) ;
    public final void rule__ExprBase__SyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1364:1: ( ( RULE_SYMBOL ) )
            // InternalMyDsl.g:1365:2: ( RULE_SYMBOL )
            {
            // InternalMyDsl.g:1365:2: ( RULE_SYMBOL )
            // InternalMyDsl.g:1366:3: RULE_SYMBOL
            {
             before(grammarAccess.getExprBaseAccess().getSySYMBOLTerminalRuleCall_2_0()); 
            match(input,RULE_SYMBOL,FOLLOW_2); 
             after(grammarAccess.getExprBaseAccess().getSySYMBOLTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__SyAssignment_2"


    // $ANTLR start "rule__ExprBase__EbtAssignment_3"
    // InternalMyDsl.g:1375:1: rule__ExprBase__EbtAssignment_3 : ( ruleEBtl ) ;
    public final void rule__ExprBase__EbtAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1379:1: ( ( ruleEBtl ) )
            // InternalMyDsl.g:1380:2: ( ruleEBtl )
            {
            // InternalMyDsl.g:1380:2: ( ruleEBtl )
            // InternalMyDsl.g:1381:3: ruleEBtl
            {
             before(grammarAccess.getExprBaseAccess().getEbtEBtlParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEBtl();

            state._fsp--;

             after(grammarAccess.getExprBaseAccess().getEbtEBtlParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__EbtAssignment_3"


    // $ANTLR start "rule__ExprBase__EbhAssignment_4"
    // InternalMyDsl.g:1390:1: rule__ExprBase__EbhAssignment_4 : ( ruleEBhd ) ;
    public final void rule__ExprBase__EbhAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1394:1: ( ( ruleEBhd ) )
            // InternalMyDsl.g:1395:2: ( ruleEBhd )
            {
            // InternalMyDsl.g:1395:2: ( ruleEBhd )
            // InternalMyDsl.g:1396:3: ruleEBhd
            {
             before(grammarAccess.getExprBaseAccess().getEbhEBhdParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEBhd();

            state._fsp--;

             after(grammarAccess.getExprBaseAccess().getEbhEBhdParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__EbhAssignment_4"


    // $ANTLR start "rule__ExprBase__EbcAssignment_5"
    // InternalMyDsl.g:1405:1: rule__ExprBase__EbcAssignment_5 : ( ruleEBcons ) ;
    public final void rule__ExprBase__EbcAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1409:1: ( ( ruleEBcons ) )
            // InternalMyDsl.g:1410:2: ( ruleEBcons )
            {
            // InternalMyDsl.g:1410:2: ( ruleEBcons )
            // InternalMyDsl.g:1411:3: ruleEBcons
            {
             before(grammarAccess.getExprBaseAccess().getEbcEBconsParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEBcons();

            state._fsp--;

             after(grammarAccess.getExprBaseAccess().getEbcEBconsParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__EbcAssignment_5"


    // $ANTLR start "rule__ExprBase__EblAssignment_6"
    // InternalMyDsl.g:1420:1: rule__ExprBase__EblAssignment_6 : ( ruleEBlist ) ;
    public final void rule__ExprBase__EblAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1424:1: ( ( ruleEBlist ) )
            // InternalMyDsl.g:1425:2: ( ruleEBlist )
            {
            // InternalMyDsl.g:1425:2: ( ruleEBlist )
            // InternalMyDsl.g:1426:3: ruleEBlist
            {
             before(grammarAccess.getExprBaseAccess().getEblEBlistParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEBlist();

            state._fsp--;

             after(grammarAccess.getExprBaseAccess().getEblEBlistParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__EblAssignment_6"


    // $ANTLR start "rule__ExprBase__EbsAssignment_7"
    // InternalMyDsl.g:1435:1: rule__ExprBase__EbsAssignment_7 : ( ruleEBsy ) ;
    public final void rule__ExprBase__EbsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1439:1: ( ( ruleEBsy ) )
            // InternalMyDsl.g:1440:2: ( ruleEBsy )
            {
            // InternalMyDsl.g:1440:2: ( ruleEBsy )
            // InternalMyDsl.g:1441:3: ruleEBsy
            {
             before(grammarAccess.getExprBaseAccess().getEbsEBsyParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEBsy();

            state._fsp--;

             after(grammarAccess.getExprBaseAccess().getEbsEBsyParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__EbsAssignment_7"


    // $ANTLR start "rule__EBsy__SyAssignment_1"
    // InternalMyDsl.g:1450:1: rule__EBsy__SyAssignment_1 : ( RULE_SYMBOL ) ;
    public final void rule__EBsy__SyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1454:1: ( ( RULE_SYMBOL ) )
            // InternalMyDsl.g:1455:2: ( RULE_SYMBOL )
            {
            // InternalMyDsl.g:1455:2: ( RULE_SYMBOL )
            // InternalMyDsl.g:1456:3: RULE_SYMBOL
            {
             before(grammarAccess.getEBsyAccess().getSySYMBOLTerminalRuleCall_1_0()); 
            match(input,RULE_SYMBOL,FOLLOW_2); 
             after(grammarAccess.getEBsyAccess().getSySYMBOLTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBsy__SyAssignment_1"


    // $ANTLR start "rule__EBsy__LexpbAssignment_2"
    // InternalMyDsl.g:1465:1: rule__EBsy__LexpbAssignment_2 : ( ruleExprBase ) ;
    public final void rule__EBsy__LexpbAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1469:1: ( ( ruleExprBase ) )
            // InternalMyDsl.g:1470:2: ( ruleExprBase )
            {
            // InternalMyDsl.g:1470:2: ( ruleExprBase )
            // InternalMyDsl.g:1471:3: ruleExprBase
            {
             before(grammarAccess.getEBsyAccess().getLexpbExprBaseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExprBase();

            state._fsp--;

             after(grammarAccess.getEBsyAccess().getLexpbExprBaseParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBsy__LexpbAssignment_2"


    // $ANTLR start "rule__EBhd__ExpbAssignment_2"
    // InternalMyDsl.g:1480:1: rule__EBhd__ExpbAssignment_2 : ( ruleExprBase ) ;
    public final void rule__EBhd__ExpbAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1484:1: ( ( ruleExprBase ) )
            // InternalMyDsl.g:1485:2: ( ruleExprBase )
            {
            // InternalMyDsl.g:1485:2: ( ruleExprBase )
            // InternalMyDsl.g:1486:3: ruleExprBase
            {
             before(grammarAccess.getEBhdAccess().getExpbExprBaseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExprBase();

            state._fsp--;

             after(grammarAccess.getEBhdAccess().getExpbExprBaseParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBhd__ExpbAssignment_2"


    // $ANTLR start "rule__EBtl__ExpbAssignment_2"
    // InternalMyDsl.g:1495:1: rule__EBtl__ExpbAssignment_2 : ( ruleExprBase ) ;
    public final void rule__EBtl__ExpbAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1499:1: ( ( ruleExprBase ) )
            // InternalMyDsl.g:1500:2: ( ruleExprBase )
            {
            // InternalMyDsl.g:1500:2: ( ruleExprBase )
            // InternalMyDsl.g:1501:3: ruleExprBase
            {
             before(grammarAccess.getEBtlAccess().getExpbExprBaseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExprBase();

            state._fsp--;

             after(grammarAccess.getEBtlAccess().getExpbExprBaseParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBtl__ExpbAssignment_2"


    // $ANTLR start "rule__EBcons__LexpbAssignment_3"
    // InternalMyDsl.g:1510:1: rule__EBcons__LexpbAssignment_3 : ( ruleExprBase ) ;
    public final void rule__EBcons__LexpbAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1514:1: ( ( ruleExprBase ) )
            // InternalMyDsl.g:1515:2: ( ruleExprBase )
            {
            // InternalMyDsl.g:1515:2: ( ruleExprBase )
            // InternalMyDsl.g:1516:3: ruleExprBase
            {
             before(grammarAccess.getEBconsAccess().getLexpbExprBaseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExprBase();

            state._fsp--;

             after(grammarAccess.getEBconsAccess().getLexpbExprBaseParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBcons__LexpbAssignment_3"


    // $ANTLR start "rule__EBlist__LexpbAssignment_3"
    // InternalMyDsl.g:1525:1: rule__EBlist__LexpbAssignment_3 : ( ruleExprBase ) ;
    public final void rule__EBlist__LexpbAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1529:1: ( ( ruleExprBase ) )
            // InternalMyDsl.g:1530:2: ( ruleExprBase )
            {
            // InternalMyDsl.g:1530:2: ( ruleExprBase )
            // InternalMyDsl.g:1531:3: ruleExprBase
            {
             before(grammarAccess.getEBlistAccess().getLexpbExprBaseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExprBase();

            state._fsp--;

             after(grammarAccess.getEBlistAccess().getLexpbExprBaseParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBlist__LexpbAssignment_3"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\3\uffff\1\5\5\uffff";
    static final String dfa_3s = "\1\25\3\uffff\1\24\5\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\4\1\10\1\6\1\7";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\3\11\uffff\1\4\5\uffff\1\1",
            "",
            "",
            "",
            "\1\7\13\uffff\1\5\1\6\1\10\1\11",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "327:1: rule__ExprBase__Alternatives : ( ( ( rule__ExprBase__Group_0__0 ) ) | ( ( rule__ExprBase__VAssignment_1 ) ) | ( ( rule__ExprBase__SyAssignment_2 ) ) | ( ( rule__ExprBase__EbtAssignment_3 ) ) | ( ( rule__ExprBase__EbhAssignment_4 ) ) | ( ( rule__ExprBase__EbcAssignment_5 ) ) | ( ( rule__ExprBase__EblAssignment_6 ) ) | ( ( rule__ExprBase__EbsAssignment_7 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000208030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000218030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000208032L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});

}