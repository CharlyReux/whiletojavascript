package paramInterpreter.inter.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import paramInterpreter.inter.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VARIABLE", "RULE_SYMBOL", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':='", "'=?'", "'nil'", "'('", "')'", "'hd'", "'tl'", "'cons'", "'list'"
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_eqListe_0_0= ruleEqual ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_eqListe_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_eqListe_0_0= ruleEqual ) )* )
            // InternalMyDsl.g:78:2: ( (lv_eqListe_0_0= ruleEqual ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_eqListe_0_0= ruleEqual ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_VARIABLE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_eqListe_0_0= ruleEqual )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_eqListe_0_0= ruleEqual )
            	    // InternalMyDsl.g:80:4: lv_eqListe_0_0= ruleEqual
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getEqListeEqualParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_eqListe_0_0=ruleEqual();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"eqListe",
            	    					lv_eqListe_0_0,
            	    					"paramInterpreter.inter.MyDsl.Equal");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEqual"
    // InternalMyDsl.g:100:1: entryRuleEqual returns [EObject current=null] : iv_ruleEqual= ruleEqual EOF ;
    public final EObject entryRuleEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqual = null;


        try {
            // InternalMyDsl.g:100:46: (iv_ruleEqual= ruleEqual EOF )
            // InternalMyDsl.g:101:2: iv_ruleEqual= ruleEqual EOF
            {
             newCompositeNode(grammarAccess.getEqualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqual=ruleEqual();

            state._fsp--;

             current =iv_ruleEqual; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEqual"


    // $ANTLR start "ruleEqual"
    // InternalMyDsl.g:107:1: ruleEqual returns [EObject current=null] : ( ( (lv_vars_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleExprs ) ) ) ;
    public final EObject ruleEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_vars_0_0 = null;

        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( ( ( (lv_vars_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleExprs ) ) ) )
            // InternalMyDsl.g:114:2: ( ( (lv_vars_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleExprs ) ) )
            {
            // InternalMyDsl.g:114:2: ( ( (lv_vars_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleExprs ) ) )
            // InternalMyDsl.g:115:3: ( (lv_vars_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleExprs ) )
            {
            // InternalMyDsl.g:115:3: ( (lv_vars_0_0= ruleVars ) )
            // InternalMyDsl.g:116:4: (lv_vars_0_0= ruleVars )
            {
            // InternalMyDsl.g:116:4: (lv_vars_0_0= ruleVars )
            // InternalMyDsl.g:117:5: lv_vars_0_0= ruleVars
            {

            					newCompositeNode(grammarAccess.getEqualAccess().getVarsVarsParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_vars_0_0=ruleVars();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEqualRule());
            					}
            					set(
            						current,
            						"vars",
            						lv_vars_0_0,
            						"paramInterpreter.inter.MyDsl.Vars");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getEqualAccess().getColonEqualsSignKeyword_1());
            		
            // InternalMyDsl.g:138:3: ( (lv_exp_2_0= ruleExprs ) )
            // InternalMyDsl.g:139:4: (lv_exp_2_0= ruleExprs )
            {
            // InternalMyDsl.g:139:4: (lv_exp_2_0= ruleExprs )
            // InternalMyDsl.g:140:5: lv_exp_2_0= ruleExprs
            {

            					newCompositeNode(grammarAccess.getEqualAccess().getExpExprsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_2_0=ruleExprs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEqualRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_2_0,
            						"paramInterpreter.inter.MyDsl.Exprs");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqual"


    // $ANTLR start "entryRuleVars"
    // InternalMyDsl.g:161:1: entryRuleVars returns [EObject current=null] : iv_ruleVars= ruleVars EOF ;
    public final EObject entryRuleVars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVars = null;


        try {
            // InternalMyDsl.g:161:45: (iv_ruleVars= ruleVars EOF )
            // InternalMyDsl.g:162:2: iv_ruleVars= ruleVars EOF
            {
             newCompositeNode(grammarAccess.getVarsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVars=ruleVars();

            state._fsp--;

             current =iv_ruleVars; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVars"


    // $ANTLR start "ruleVars"
    // InternalMyDsl.g:168:1: ruleVars returns [EObject current=null] : ( (lv_lvars_0_0= RULE_VARIABLE ) ) ;
    public final EObject ruleVars() throws RecognitionException {
        EObject current = null;

        Token lv_lvars_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:174:2: ( ( (lv_lvars_0_0= RULE_VARIABLE ) ) )
            // InternalMyDsl.g:175:2: ( (lv_lvars_0_0= RULE_VARIABLE ) )
            {
            // InternalMyDsl.g:175:2: ( (lv_lvars_0_0= RULE_VARIABLE ) )
            // InternalMyDsl.g:176:3: (lv_lvars_0_0= RULE_VARIABLE )
            {
            // InternalMyDsl.g:176:3: (lv_lvars_0_0= RULE_VARIABLE )
            // InternalMyDsl.g:177:4: lv_lvars_0_0= RULE_VARIABLE
            {
            lv_lvars_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_2); 

            				newLeafNode(lv_lvars_0_0, grammarAccess.getVarsAccess().getLvarsVARIABLETerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVarsRule());
            				}
            				setWithLastConsumed(
            					current,
            					"lvars",
            					lv_lvars_0_0,
            					"paramInterpreter.inter.MyDsl.VARIABLE");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVars"


    // $ANTLR start "entryRuleExprs"
    // InternalMyDsl.g:196:1: entryRuleExprs returns [EObject current=null] : iv_ruleExprs= ruleExprs EOF ;
    public final EObject entryRuleExprs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprs = null;


        try {
            // InternalMyDsl.g:196:46: (iv_ruleExprs= ruleExprs EOF )
            // InternalMyDsl.g:197:2: iv_ruleExprs= ruleExprs EOF
            {
             newCompositeNode(grammarAccess.getExprsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExprs=ruleExprs();

            state._fsp--;

             current =iv_ruleExprs; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprs"


    // $ANTLR start "ruleExprs"
    // InternalMyDsl.g:203:1: ruleExprs returns [EObject current=null] : ( (lv_lexpr_0_0= ruleExpression ) ) ;
    public final EObject ruleExprs() throws RecognitionException {
        EObject current = null;

        EObject lv_lexpr_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:209:2: ( ( (lv_lexpr_0_0= ruleExpression ) ) )
            // InternalMyDsl.g:210:2: ( (lv_lexpr_0_0= ruleExpression ) )
            {
            // InternalMyDsl.g:210:2: ( (lv_lexpr_0_0= ruleExpression ) )
            // InternalMyDsl.g:211:3: (lv_lexpr_0_0= ruleExpression )
            {
            // InternalMyDsl.g:211:3: (lv_lexpr_0_0= ruleExpression )
            // InternalMyDsl.g:212:4: lv_lexpr_0_0= ruleExpression
            {

            				newCompositeNode(grammarAccess.getExprsAccess().getLexprExpressionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_lexpr_0_0=ruleExpression();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getExprsRule());
            				}
            				set(
            					current,
            					"lexpr",
            					lv_lexpr_0_0,
            					"paramInterpreter.inter.MyDsl.Expression");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprs"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:232:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMyDsl.g:232:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:233:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMyDsl.g:239:1: ruleExpression returns [EObject current=null] : ( ( (lv_expbg_0_0= ruleExprBase ) ) (otherlv_1= '=?' ( (lv_expbd_2_0= ruleExprBase ) ) )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expbg_0_0 = null;

        EObject lv_expbd_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:245:2: ( ( ( (lv_expbg_0_0= ruleExprBase ) ) (otherlv_1= '=?' ( (lv_expbd_2_0= ruleExprBase ) ) )? ) )
            // InternalMyDsl.g:246:2: ( ( (lv_expbg_0_0= ruleExprBase ) ) (otherlv_1= '=?' ( (lv_expbd_2_0= ruleExprBase ) ) )? )
            {
            // InternalMyDsl.g:246:2: ( ( (lv_expbg_0_0= ruleExprBase ) ) (otherlv_1= '=?' ( (lv_expbd_2_0= ruleExprBase ) ) )? )
            // InternalMyDsl.g:247:3: ( (lv_expbg_0_0= ruleExprBase ) ) (otherlv_1= '=?' ( (lv_expbd_2_0= ruleExprBase ) ) )?
            {
            // InternalMyDsl.g:247:3: ( (lv_expbg_0_0= ruleExprBase ) )
            // InternalMyDsl.g:248:4: (lv_expbg_0_0= ruleExprBase )
            {
            // InternalMyDsl.g:248:4: (lv_expbg_0_0= ruleExprBase )
            // InternalMyDsl.g:249:5: lv_expbg_0_0= ruleExprBase
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getExpbgExprBaseParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_expbg_0_0=ruleExprBase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionRule());
            					}
            					set(
            						current,
            						"expbg",
            						lv_expbg_0_0,
            						"paramInterpreter.inter.MyDsl.ExprBase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:266:3: (otherlv_1= '=?' ( (lv_expbd_2_0= ruleExprBase ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:267:4: otherlv_1= '=?' ( (lv_expbd_2_0= ruleExprBase ) )
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getExpressionAccess().getEqualsSignQuestionMarkKeyword_1_0());
                    			
                    // InternalMyDsl.g:271:4: ( (lv_expbd_2_0= ruleExprBase ) )
                    // InternalMyDsl.g:272:5: (lv_expbd_2_0= ruleExprBase )
                    {
                    // InternalMyDsl.g:272:5: (lv_expbd_2_0= ruleExprBase )
                    // InternalMyDsl.g:273:6: lv_expbd_2_0= ruleExprBase
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getExpbdExprBaseParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expbd_2_0=ruleExprBase();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						set(
                    							current,
                    							"expbd",
                    							lv_expbd_2_0,
                    							"paramInterpreter.inter.MyDsl.ExprBase");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleExprBase"
    // InternalMyDsl.g:295:1: entryRuleExprBase returns [EObject current=null] : iv_ruleExprBase= ruleExprBase EOF ;
    public final EObject entryRuleExprBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprBase = null;


        try {
            // InternalMyDsl.g:295:49: (iv_ruleExprBase= ruleExprBase EOF )
            // InternalMyDsl.g:296:2: iv_ruleExprBase= ruleExprBase EOF
            {
             newCompositeNode(grammarAccess.getExprBaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExprBase=ruleExprBase();

            state._fsp--;

             current =iv_ruleExprBase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprBase"


    // $ANTLR start "ruleExprBase"
    // InternalMyDsl.g:302:1: ruleExprBase returns [EObject current=null] : ( ( () ( (lv_ni_1_0= 'nil' ) ) ) | ( (lv_v_2_0= RULE_VARIABLE ) ) | ( (lv_sy_3_0= RULE_SYMBOL ) ) | ( (lv_ebt_4_0= ruleEBtl ) ) | ( (lv_ebh_5_0= ruleEBhd ) ) | ( (lv_ebc_6_0= ruleEBcons ) ) | ( (lv_ebl_7_0= ruleEBlist ) ) | ( (lv_ebs_8_0= ruleEBsy ) ) ) ;
    public final EObject ruleExprBase() throws RecognitionException {
        EObject current = null;

        Token lv_ni_1_0=null;
        Token lv_v_2_0=null;
        Token lv_sy_3_0=null;
        EObject lv_ebt_4_0 = null;

        EObject lv_ebh_5_0 = null;

        EObject lv_ebc_6_0 = null;

        EObject lv_ebl_7_0 = null;

        EObject lv_ebs_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:308:2: ( ( ( () ( (lv_ni_1_0= 'nil' ) ) ) | ( (lv_v_2_0= RULE_VARIABLE ) ) | ( (lv_sy_3_0= RULE_SYMBOL ) ) | ( (lv_ebt_4_0= ruleEBtl ) ) | ( (lv_ebh_5_0= ruleEBhd ) ) | ( (lv_ebc_6_0= ruleEBcons ) ) | ( (lv_ebl_7_0= ruleEBlist ) ) | ( (lv_ebs_8_0= ruleEBsy ) ) ) )
            // InternalMyDsl.g:309:2: ( ( () ( (lv_ni_1_0= 'nil' ) ) ) | ( (lv_v_2_0= RULE_VARIABLE ) ) | ( (lv_sy_3_0= RULE_SYMBOL ) ) | ( (lv_ebt_4_0= ruleEBtl ) ) | ( (lv_ebh_5_0= ruleEBhd ) ) | ( (lv_ebc_6_0= ruleEBcons ) ) | ( (lv_ebl_7_0= ruleEBlist ) ) | ( (lv_ebs_8_0= ruleEBsy ) ) )
            {
            // InternalMyDsl.g:309:2: ( ( () ( (lv_ni_1_0= 'nil' ) ) ) | ( (lv_v_2_0= RULE_VARIABLE ) ) | ( (lv_sy_3_0= RULE_SYMBOL ) ) | ( (lv_ebt_4_0= ruleEBtl ) ) | ( (lv_ebh_5_0= ruleEBhd ) ) | ( (lv_ebc_6_0= ruleEBcons ) ) | ( (lv_ebl_7_0= ruleEBlist ) ) | ( (lv_ebs_8_0= ruleEBsy ) ) )
            int alt3=8;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:310:3: ( () ( (lv_ni_1_0= 'nil' ) ) )
                    {
                    // InternalMyDsl.g:310:3: ( () ( (lv_ni_1_0= 'nil' ) ) )
                    // InternalMyDsl.g:311:4: () ( (lv_ni_1_0= 'nil' ) )
                    {
                    // InternalMyDsl.g:311:4: ()
                    // InternalMyDsl.g:312:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExprBaseAccess().getExprBaseAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMyDsl.g:318:4: ( (lv_ni_1_0= 'nil' ) )
                    // InternalMyDsl.g:319:5: (lv_ni_1_0= 'nil' )
                    {
                    // InternalMyDsl.g:319:5: (lv_ni_1_0= 'nil' )
                    // InternalMyDsl.g:320:6: lv_ni_1_0= 'nil'
                    {
                    lv_ni_1_0=(Token)match(input,15,FOLLOW_2); 

                    						newLeafNode(lv_ni_1_0, grammarAccess.getExprBaseAccess().getNiNilKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExprBaseRule());
                    						}
                    						setWithLastConsumed(current, "ni", lv_ni_1_0, "nil");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:334:3: ( (lv_v_2_0= RULE_VARIABLE ) )
                    {
                    // InternalMyDsl.g:334:3: ( (lv_v_2_0= RULE_VARIABLE ) )
                    // InternalMyDsl.g:335:4: (lv_v_2_0= RULE_VARIABLE )
                    {
                    // InternalMyDsl.g:335:4: (lv_v_2_0= RULE_VARIABLE )
                    // InternalMyDsl.g:336:5: lv_v_2_0= RULE_VARIABLE
                    {
                    lv_v_2_0=(Token)match(input,RULE_VARIABLE,FOLLOW_2); 

                    					newLeafNode(lv_v_2_0, grammarAccess.getExprBaseAccess().getVVARIABLETerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExprBaseRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"v",
                    						lv_v_2_0,
                    						"paramInterpreter.inter.MyDsl.VARIABLE");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:353:3: ( (lv_sy_3_0= RULE_SYMBOL ) )
                    {
                    // InternalMyDsl.g:353:3: ( (lv_sy_3_0= RULE_SYMBOL ) )
                    // InternalMyDsl.g:354:4: (lv_sy_3_0= RULE_SYMBOL )
                    {
                    // InternalMyDsl.g:354:4: (lv_sy_3_0= RULE_SYMBOL )
                    // InternalMyDsl.g:355:5: lv_sy_3_0= RULE_SYMBOL
                    {
                    lv_sy_3_0=(Token)match(input,RULE_SYMBOL,FOLLOW_2); 

                    					newLeafNode(lv_sy_3_0, grammarAccess.getExprBaseAccess().getSySYMBOLTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExprBaseRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"sy",
                    						lv_sy_3_0,
                    						"paramInterpreter.inter.MyDsl.SYMBOL");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:372:3: ( (lv_ebt_4_0= ruleEBtl ) )
                    {
                    // InternalMyDsl.g:372:3: ( (lv_ebt_4_0= ruleEBtl ) )
                    // InternalMyDsl.g:373:4: (lv_ebt_4_0= ruleEBtl )
                    {
                    // InternalMyDsl.g:373:4: (lv_ebt_4_0= ruleEBtl )
                    // InternalMyDsl.g:374:5: lv_ebt_4_0= ruleEBtl
                    {

                    					newCompositeNode(grammarAccess.getExprBaseAccess().getEbtEBtlParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_ebt_4_0=ruleEBtl();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExprBaseRule());
                    					}
                    					set(
                    						current,
                    						"ebt",
                    						lv_ebt_4_0,
                    						"paramInterpreter.inter.MyDsl.EBtl");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:392:3: ( (lv_ebh_5_0= ruleEBhd ) )
                    {
                    // InternalMyDsl.g:392:3: ( (lv_ebh_5_0= ruleEBhd ) )
                    // InternalMyDsl.g:393:4: (lv_ebh_5_0= ruleEBhd )
                    {
                    // InternalMyDsl.g:393:4: (lv_ebh_5_0= ruleEBhd )
                    // InternalMyDsl.g:394:5: lv_ebh_5_0= ruleEBhd
                    {

                    					newCompositeNode(grammarAccess.getExprBaseAccess().getEbhEBhdParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_ebh_5_0=ruleEBhd();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExprBaseRule());
                    					}
                    					set(
                    						current,
                    						"ebh",
                    						lv_ebh_5_0,
                    						"paramInterpreter.inter.MyDsl.EBhd");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:412:3: ( (lv_ebc_6_0= ruleEBcons ) )
                    {
                    // InternalMyDsl.g:412:3: ( (lv_ebc_6_0= ruleEBcons ) )
                    // InternalMyDsl.g:413:4: (lv_ebc_6_0= ruleEBcons )
                    {
                    // InternalMyDsl.g:413:4: (lv_ebc_6_0= ruleEBcons )
                    // InternalMyDsl.g:414:5: lv_ebc_6_0= ruleEBcons
                    {

                    					newCompositeNode(grammarAccess.getExprBaseAccess().getEbcEBconsParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_ebc_6_0=ruleEBcons();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExprBaseRule());
                    					}
                    					set(
                    						current,
                    						"ebc",
                    						lv_ebc_6_0,
                    						"paramInterpreter.inter.MyDsl.EBcons");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:432:3: ( (lv_ebl_7_0= ruleEBlist ) )
                    {
                    // InternalMyDsl.g:432:3: ( (lv_ebl_7_0= ruleEBlist ) )
                    // InternalMyDsl.g:433:4: (lv_ebl_7_0= ruleEBlist )
                    {
                    // InternalMyDsl.g:433:4: (lv_ebl_7_0= ruleEBlist )
                    // InternalMyDsl.g:434:5: lv_ebl_7_0= ruleEBlist
                    {

                    					newCompositeNode(grammarAccess.getExprBaseAccess().getEblEBlistParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_ebl_7_0=ruleEBlist();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExprBaseRule());
                    					}
                    					set(
                    						current,
                    						"ebl",
                    						lv_ebl_7_0,
                    						"paramInterpreter.inter.MyDsl.EBlist");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:452:3: ( (lv_ebs_8_0= ruleEBsy ) )
                    {
                    // InternalMyDsl.g:452:3: ( (lv_ebs_8_0= ruleEBsy ) )
                    // InternalMyDsl.g:453:4: (lv_ebs_8_0= ruleEBsy )
                    {
                    // InternalMyDsl.g:453:4: (lv_ebs_8_0= ruleEBsy )
                    // InternalMyDsl.g:454:5: lv_ebs_8_0= ruleEBsy
                    {

                    					newCompositeNode(grammarAccess.getExprBaseAccess().getEbsEBsyParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_ebs_8_0=ruleEBsy();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExprBaseRule());
                    					}
                    					set(
                    						current,
                    						"ebs",
                    						lv_ebs_8_0,
                    						"paramInterpreter.inter.MyDsl.EBsy");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprBase"


    // $ANTLR start "entryRuleEBsy"
    // InternalMyDsl.g:475:1: entryRuleEBsy returns [EObject current=null] : iv_ruleEBsy= ruleEBsy EOF ;
    public final EObject entryRuleEBsy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBsy = null;


        try {
            // InternalMyDsl.g:475:45: (iv_ruleEBsy= ruleEBsy EOF )
            // InternalMyDsl.g:476:2: iv_ruleEBsy= ruleEBsy EOF
            {
             newCompositeNode(grammarAccess.getEBsyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBsy=ruleEBsy();

            state._fsp--;

             current =iv_ruleEBsy; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBsy"


    // $ANTLR start "ruleEBsy"
    // InternalMyDsl.g:482:1: ruleEBsy returns [EObject current=null] : (otherlv_0= '(' ( (lv_sy_1_0= RULE_SYMBOL ) ) ( (lv_lexpb_2_0= ruleExprBase ) )* otherlv_3= ')' ) ;
    public final EObject ruleEBsy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_sy_1_0=null;
        Token otherlv_3=null;
        EObject lv_lexpb_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:488:2: ( (otherlv_0= '(' ( (lv_sy_1_0= RULE_SYMBOL ) ) ( (lv_lexpb_2_0= ruleExprBase ) )* otherlv_3= ')' ) )
            // InternalMyDsl.g:489:2: (otherlv_0= '(' ( (lv_sy_1_0= RULE_SYMBOL ) ) ( (lv_lexpb_2_0= ruleExprBase ) )* otherlv_3= ')' )
            {
            // InternalMyDsl.g:489:2: (otherlv_0= '(' ( (lv_sy_1_0= RULE_SYMBOL ) ) ( (lv_lexpb_2_0= ruleExprBase ) )* otherlv_3= ')' )
            // InternalMyDsl.g:490:3: otherlv_0= '(' ( (lv_sy_1_0= RULE_SYMBOL ) ) ( (lv_lexpb_2_0= ruleExprBase ) )* otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getEBsyAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMyDsl.g:494:3: ( (lv_sy_1_0= RULE_SYMBOL ) )
            // InternalMyDsl.g:495:4: (lv_sy_1_0= RULE_SYMBOL )
            {
            // InternalMyDsl.g:495:4: (lv_sy_1_0= RULE_SYMBOL )
            // InternalMyDsl.g:496:5: lv_sy_1_0= RULE_SYMBOL
            {
            lv_sy_1_0=(Token)match(input,RULE_SYMBOL,FOLLOW_8); 

            					newLeafNode(lv_sy_1_0, grammarAccess.getEBsyAccess().getSySYMBOLTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEBsyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sy",
            						lv_sy_1_0,
            						"paramInterpreter.inter.MyDsl.SYMBOL");
            				

            }


            }

            // InternalMyDsl.g:512:3: ( (lv_lexpb_2_0= ruleExprBase ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_VARIABLE && LA4_0<=RULE_SYMBOL)||(LA4_0>=15 && LA4_0<=16)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:513:4: (lv_lexpb_2_0= ruleExprBase )
            	    {
            	    // InternalMyDsl.g:513:4: (lv_lexpb_2_0= ruleExprBase )
            	    // InternalMyDsl.g:514:5: lv_lexpb_2_0= ruleExprBase
            	    {

            	    					newCompositeNode(grammarAccess.getEBsyAccess().getLexpbExprBaseParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_lexpb_2_0=ruleExprBase();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEBsyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"lexpb",
            	    						lv_lexpb_2_0,
            	    						"paramInterpreter.inter.MyDsl.ExprBase");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEBsyAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBsy"


    // $ANTLR start "entryRuleEBhd"
    // InternalMyDsl.g:539:1: entryRuleEBhd returns [EObject current=null] : iv_ruleEBhd= ruleEBhd EOF ;
    public final EObject entryRuleEBhd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBhd = null;


        try {
            // InternalMyDsl.g:539:45: (iv_ruleEBhd= ruleEBhd EOF )
            // InternalMyDsl.g:540:2: iv_ruleEBhd= ruleEBhd EOF
            {
             newCompositeNode(grammarAccess.getEBhdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBhd=ruleEBhd();

            state._fsp--;

             current =iv_ruleEBhd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBhd"


    // $ANTLR start "ruleEBhd"
    // InternalMyDsl.g:546:1: ruleEBhd returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'hd' ( (lv_expb_2_0= ruleExprBase ) ) otherlv_3= ')' ) ;
    public final EObject ruleEBhd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expb_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:552:2: ( (otherlv_0= '(' otherlv_1= 'hd' ( (lv_expb_2_0= ruleExprBase ) ) otherlv_3= ')' ) )
            // InternalMyDsl.g:553:2: (otherlv_0= '(' otherlv_1= 'hd' ( (lv_expb_2_0= ruleExprBase ) ) otherlv_3= ')' )
            {
            // InternalMyDsl.g:553:2: (otherlv_0= '(' otherlv_1= 'hd' ( (lv_expb_2_0= ruleExprBase ) ) otherlv_3= ')' )
            // InternalMyDsl.g:554:3: otherlv_0= '(' otherlv_1= 'hd' ( (lv_expb_2_0= ruleExprBase ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getEBhdAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getEBhdAccess().getHdKeyword_1());
            		
            // InternalMyDsl.g:562:3: ( (lv_expb_2_0= ruleExprBase ) )
            // InternalMyDsl.g:563:4: (lv_expb_2_0= ruleExprBase )
            {
            // InternalMyDsl.g:563:4: (lv_expb_2_0= ruleExprBase )
            // InternalMyDsl.g:564:5: lv_expb_2_0= ruleExprBase
            {

            					newCompositeNode(grammarAccess.getEBhdAccess().getExpbExprBaseParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_expb_2_0=ruleExprBase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEBhdRule());
            					}
            					set(
            						current,
            						"expb",
            						lv_expb_2_0,
            						"paramInterpreter.inter.MyDsl.ExprBase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEBhdAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBhd"


    // $ANTLR start "entryRuleEBtl"
    // InternalMyDsl.g:589:1: entryRuleEBtl returns [EObject current=null] : iv_ruleEBtl= ruleEBtl EOF ;
    public final EObject entryRuleEBtl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBtl = null;


        try {
            // InternalMyDsl.g:589:45: (iv_ruleEBtl= ruleEBtl EOF )
            // InternalMyDsl.g:590:2: iv_ruleEBtl= ruleEBtl EOF
            {
             newCompositeNode(grammarAccess.getEBtlRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBtl=ruleEBtl();

            state._fsp--;

             current =iv_ruleEBtl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBtl"


    // $ANTLR start "ruleEBtl"
    // InternalMyDsl.g:596:1: ruleEBtl returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'tl' ( (lv_expb_2_0= ruleExprBase ) ) otherlv_3= ')' ) ;
    public final EObject ruleEBtl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expb_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:602:2: ( (otherlv_0= '(' otherlv_1= 'tl' ( (lv_expb_2_0= ruleExprBase ) ) otherlv_3= ')' ) )
            // InternalMyDsl.g:603:2: (otherlv_0= '(' otherlv_1= 'tl' ( (lv_expb_2_0= ruleExprBase ) ) otherlv_3= ')' )
            {
            // InternalMyDsl.g:603:2: (otherlv_0= '(' otherlv_1= 'tl' ( (lv_expb_2_0= ruleExprBase ) ) otherlv_3= ')' )
            // InternalMyDsl.g:604:3: otherlv_0= '(' otherlv_1= 'tl' ( (lv_expb_2_0= ruleExprBase ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getEBtlAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getEBtlAccess().getTlKeyword_1());
            		
            // InternalMyDsl.g:612:3: ( (lv_expb_2_0= ruleExprBase ) )
            // InternalMyDsl.g:613:4: (lv_expb_2_0= ruleExprBase )
            {
            // InternalMyDsl.g:613:4: (lv_expb_2_0= ruleExprBase )
            // InternalMyDsl.g:614:5: lv_expb_2_0= ruleExprBase
            {

            					newCompositeNode(grammarAccess.getEBtlAccess().getExpbExprBaseParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_expb_2_0=ruleExprBase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEBtlRule());
            					}
            					set(
            						current,
            						"expb",
            						lv_expb_2_0,
            						"paramInterpreter.inter.MyDsl.ExprBase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEBtlAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBtl"


    // $ANTLR start "entryRuleEBcons"
    // InternalMyDsl.g:639:1: entryRuleEBcons returns [EObject current=null] : iv_ruleEBcons= ruleEBcons EOF ;
    public final EObject entryRuleEBcons() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBcons = null;


        try {
            // InternalMyDsl.g:639:47: (iv_ruleEBcons= ruleEBcons EOF )
            // InternalMyDsl.g:640:2: iv_ruleEBcons= ruleEBcons EOF
            {
             newCompositeNode(grammarAccess.getEBconsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBcons=ruleEBcons();

            state._fsp--;

             current =iv_ruleEBcons; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBcons"


    // $ANTLR start "ruleEBcons"
    // InternalMyDsl.g:646:1: ruleEBcons returns [EObject current=null] : ( () otherlv_1= '(' otherlv_2= 'cons' ( (lv_lexpb_3_0= ruleExprBase ) )* otherlv_4= ')' ) ;
    public final EObject ruleEBcons() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_lexpb_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:652:2: ( ( () otherlv_1= '(' otherlv_2= 'cons' ( (lv_lexpb_3_0= ruleExprBase ) )* otherlv_4= ')' ) )
            // InternalMyDsl.g:653:2: ( () otherlv_1= '(' otherlv_2= 'cons' ( (lv_lexpb_3_0= ruleExprBase ) )* otherlv_4= ')' )
            {
            // InternalMyDsl.g:653:2: ( () otherlv_1= '(' otherlv_2= 'cons' ( (lv_lexpb_3_0= ruleExprBase ) )* otherlv_4= ')' )
            // InternalMyDsl.g:654:3: () otherlv_1= '(' otherlv_2= 'cons' ( (lv_lexpb_3_0= ruleExprBase ) )* otherlv_4= ')'
            {
            // InternalMyDsl.g:654:3: ()
            // InternalMyDsl.g:655:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEBconsAccess().getEBconsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getEBconsAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getEBconsAccess().getConsKeyword_2());
            		
            // InternalMyDsl.g:669:3: ( (lv_lexpb_3_0= ruleExprBase ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_VARIABLE && LA5_0<=RULE_SYMBOL)||(LA5_0>=15 && LA5_0<=16)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:670:4: (lv_lexpb_3_0= ruleExprBase )
            	    {
            	    // InternalMyDsl.g:670:4: (lv_lexpb_3_0= ruleExprBase )
            	    // InternalMyDsl.g:671:5: lv_lexpb_3_0= ruleExprBase
            	    {

            	    					newCompositeNode(grammarAccess.getEBconsAccess().getLexpbExprBaseParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_lexpb_3_0=ruleExprBase();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEBconsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"lexpb",
            	    						lv_lexpb_3_0,
            	    						"paramInterpreter.inter.MyDsl.ExprBase");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEBconsAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBcons"


    // $ANTLR start "entryRuleEBlist"
    // InternalMyDsl.g:696:1: entryRuleEBlist returns [EObject current=null] : iv_ruleEBlist= ruleEBlist EOF ;
    public final EObject entryRuleEBlist() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBlist = null;


        try {
            // InternalMyDsl.g:696:47: (iv_ruleEBlist= ruleEBlist EOF )
            // InternalMyDsl.g:697:2: iv_ruleEBlist= ruleEBlist EOF
            {
             newCompositeNode(grammarAccess.getEBlistRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBlist=ruleEBlist();

            state._fsp--;

             current =iv_ruleEBlist; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBlist"


    // $ANTLR start "ruleEBlist"
    // InternalMyDsl.g:703:1: ruleEBlist returns [EObject current=null] : ( () otherlv_1= '(' otherlv_2= 'list' ( (lv_lexpb_3_0= ruleExprBase ) )* otherlv_4= ')' ) ;
    public final EObject ruleEBlist() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_lexpb_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:709:2: ( ( () otherlv_1= '(' otherlv_2= 'list' ( (lv_lexpb_3_0= ruleExprBase ) )* otherlv_4= ')' ) )
            // InternalMyDsl.g:710:2: ( () otherlv_1= '(' otherlv_2= 'list' ( (lv_lexpb_3_0= ruleExprBase ) )* otherlv_4= ')' )
            {
            // InternalMyDsl.g:710:2: ( () otherlv_1= '(' otherlv_2= 'list' ( (lv_lexpb_3_0= ruleExprBase ) )* otherlv_4= ')' )
            // InternalMyDsl.g:711:3: () otherlv_1= '(' otherlv_2= 'list' ( (lv_lexpb_3_0= ruleExprBase ) )* otherlv_4= ')'
            {
            // InternalMyDsl.g:711:3: ()
            // InternalMyDsl.g:712:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEBlistAccess().getEBlistAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getEBlistAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getEBlistAccess().getListKeyword_2());
            		
            // InternalMyDsl.g:726:3: ( (lv_lexpb_3_0= ruleExprBase ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_VARIABLE && LA6_0<=RULE_SYMBOL)||(LA6_0>=15 && LA6_0<=16)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:727:4: (lv_lexpb_3_0= ruleExprBase )
            	    {
            	    // InternalMyDsl.g:727:4: (lv_lexpb_3_0= ruleExprBase )
            	    // InternalMyDsl.g:728:5: lv_lexpb_3_0= ruleExprBase
            	    {

            	    					newCompositeNode(grammarAccess.getEBlistAccess().getLexpbExprBaseParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_lexpb_3_0=ruleExprBase();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEBlistRule());
            	    					}
            	    					add(
            	    						current,
            	    						"lexpb",
            	    						lv_lexpb_3_0,
            	    						"paramInterpreter.inter.MyDsl.ExprBase");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEBlistAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBlist"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\3\uffff\1\5\5\uffff";
    static final String dfa_3s = "\1\20\3\uffff\1\25\5\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\7\1\5\1\10\1\4";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\3\11\uffff\1\1\1\4",
            "",
            "",
            "",
            "\1\10\14\uffff\1\7\1\11\1\5\1\6",
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

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "309:2: ( ( () ( (lv_ni_1_0= 'nil' ) ) ) | ( (lv_v_2_0= RULE_VARIABLE ) ) | ( (lv_sy_3_0= RULE_SYMBOL ) ) | ( (lv_ebt_4_0= ruleEBtl ) ) | ( (lv_ebh_5_0= ruleEBhd ) ) | ( (lv_ebc_6_0= ruleEBcons ) ) | ( (lv_ebl_7_0= ruleEBlist ) ) | ( (lv_ebs_8_0= ruleEBsy ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000018030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000038030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});

}