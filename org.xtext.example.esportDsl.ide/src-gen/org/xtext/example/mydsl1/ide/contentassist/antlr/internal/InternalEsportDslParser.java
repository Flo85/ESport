package org.xtext.example.mydsl1.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl1.services.EsportDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEsportDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'worlds'", "'regionals'", "'allStars'", "'promotion'", "'midSeasonInvitational'", "'riftRivals'", "'playOff'", "'group'", "'final'", "'semiFinal'", "'quarterFinal'", "'singleRoundElimination'", "'league'", "'worldsPlayIn'", "'worldsGroup'", "'riftRivalsGroup'", "'msiPlayIn'", "'msiGroup'", "'allStarsGroup'", "'spring'", "'summer'", "'attackDamageCarry'", "'support'", "'midLane'", "'topLane'", "'jungle'", "'positioning'", "'stressManagement'", "'playmakingMechanics'", "'escapeMechanics'", "'patience'", "'farm'", "'steal'", "'splitPush'", "'teamPlay'", "'aggressivity'", "'leadership'", "'draft'", "'pathing'", "'awareness'", "'experience'", "'objectivePlay'", "'metaGame'", "'Zone'", "':'", "'('", "')'", "','", "'Tournament'", "'qualifiesFor'", "'qualifiesFrom'", "'League'", "'Team'", "'Qualification'", "'Country'", "'-'", "'FinalStage'", "'matchs'", "'GroupStage'", "'Match'", "'Group'", "'Player'", "'Coach'", "'Capacity'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalEsportDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEsportDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEsportDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEsportDsl.g"; }


    	private EsportDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(EsportDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleRoot"
    // InternalEsportDsl.g:53:1: entryRuleRoot : ruleRoot EOF ;
    public final void entryRuleRoot() throws RecognitionException {
        try {
            // InternalEsportDsl.g:54:1: ( ruleRoot EOF )
            // InternalEsportDsl.g:55:1: ruleRoot EOF
            {
             before(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_1);
            ruleRoot();

            state._fsp--;

             after(grammarAccess.getRootRule()); 
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
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalEsportDsl.g:62:1: ruleRoot : ( ( rule__Root__Alternatives )* ) ;
    public final void ruleRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:66:2: ( ( ( rule__Root__Alternatives )* ) )
            // InternalEsportDsl.g:67:2: ( ( rule__Root__Alternatives )* )
            {
            // InternalEsportDsl.g:67:2: ( ( rule__Root__Alternatives )* )
            // InternalEsportDsl.g:68:3: ( rule__Root__Alternatives )*
            {
             before(grammarAccess.getRootAccess().getAlternatives()); 
            // InternalEsportDsl.g:69:3: ( rule__Root__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==54||LA1_0==59||(LA1_0>=62 && LA1_0<=65)||(LA1_0>=72 && LA1_0<=73)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEsportDsl.g:69:4: rule__Root__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Root__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getRootAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRulePerson"
    // InternalEsportDsl.g:78:1: entryRulePerson : rulePerson EOF ;
    public final void entryRulePerson() throws RecognitionException {
        try {
            // InternalEsportDsl.g:79:1: ( rulePerson EOF )
            // InternalEsportDsl.g:80:1: rulePerson EOF
            {
             before(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getPersonRule()); 
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
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalEsportDsl.g:87:1: rulePerson : ( ( rule__Person__Alternatives ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:91:2: ( ( ( rule__Person__Alternatives ) ) )
            // InternalEsportDsl.g:92:2: ( ( rule__Person__Alternatives ) )
            {
            // InternalEsportDsl.g:92:2: ( ( rule__Person__Alternatives ) )
            // InternalEsportDsl.g:93:3: ( rule__Person__Alternatives )
            {
             before(grammarAccess.getPersonAccess().getAlternatives()); 
            // InternalEsportDsl.g:94:3: ( rule__Person__Alternatives )
            // InternalEsportDsl.g:94:4: rule__Person__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Person__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getAlternatives()); 

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
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleZone"
    // InternalEsportDsl.g:103:1: entryRuleZone : ruleZone EOF ;
    public final void entryRuleZone() throws RecognitionException {
        try {
            // InternalEsportDsl.g:104:1: ( ruleZone EOF )
            // InternalEsportDsl.g:105:1: ruleZone EOF
            {
             before(grammarAccess.getZoneRule()); 
            pushFollow(FOLLOW_1);
            ruleZone();

            state._fsp--;

             after(grammarAccess.getZoneRule()); 
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
    // $ANTLR end "entryRuleZone"


    // $ANTLR start "ruleZone"
    // InternalEsportDsl.g:112:1: ruleZone : ( ( rule__Zone__Group__0 ) ) ;
    public final void ruleZone() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:116:2: ( ( ( rule__Zone__Group__0 ) ) )
            // InternalEsportDsl.g:117:2: ( ( rule__Zone__Group__0 ) )
            {
            // InternalEsportDsl.g:117:2: ( ( rule__Zone__Group__0 ) )
            // InternalEsportDsl.g:118:3: ( rule__Zone__Group__0 )
            {
             before(grammarAccess.getZoneAccess().getGroup()); 
            // InternalEsportDsl.g:119:3: ( rule__Zone__Group__0 )
            // InternalEsportDsl.g:119:4: rule__Zone__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Zone__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getZoneAccess().getGroup()); 

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
    // $ANTLR end "ruleZone"


    // $ANTLR start "entryRuleTournament"
    // InternalEsportDsl.g:128:1: entryRuleTournament : ruleTournament EOF ;
    public final void entryRuleTournament() throws RecognitionException {
        try {
            // InternalEsportDsl.g:129:1: ( ruleTournament EOF )
            // InternalEsportDsl.g:130:1: ruleTournament EOF
            {
             before(grammarAccess.getTournamentRule()); 
            pushFollow(FOLLOW_1);
            ruleTournament();

            state._fsp--;

             after(grammarAccess.getTournamentRule()); 
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
    // $ANTLR end "entryRuleTournament"


    // $ANTLR start "ruleTournament"
    // InternalEsportDsl.g:137:1: ruleTournament : ( ( rule__Tournament__Group__0 ) ) ;
    public final void ruleTournament() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:141:2: ( ( ( rule__Tournament__Group__0 ) ) )
            // InternalEsportDsl.g:142:2: ( ( rule__Tournament__Group__0 ) )
            {
            // InternalEsportDsl.g:142:2: ( ( rule__Tournament__Group__0 ) )
            // InternalEsportDsl.g:143:3: ( rule__Tournament__Group__0 )
            {
             before(grammarAccess.getTournamentAccess().getGroup()); 
            // InternalEsportDsl.g:144:3: ( rule__Tournament__Group__0 )
            // InternalEsportDsl.g:144:4: rule__Tournament__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tournament__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTournamentAccess().getGroup()); 

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
    // $ANTLR end "ruleTournament"


    // $ANTLR start "entryRuleLeague"
    // InternalEsportDsl.g:153:1: entryRuleLeague : ruleLeague EOF ;
    public final void entryRuleLeague() throws RecognitionException {
        try {
            // InternalEsportDsl.g:154:1: ( ruleLeague EOF )
            // InternalEsportDsl.g:155:1: ruleLeague EOF
            {
             before(grammarAccess.getLeagueRule()); 
            pushFollow(FOLLOW_1);
            ruleLeague();

            state._fsp--;

             after(grammarAccess.getLeagueRule()); 
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
    // $ANTLR end "entryRuleLeague"


    // $ANTLR start "ruleLeague"
    // InternalEsportDsl.g:162:1: ruleLeague : ( ( rule__League__Group__0 ) ) ;
    public final void ruleLeague() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:166:2: ( ( ( rule__League__Group__0 ) ) )
            // InternalEsportDsl.g:167:2: ( ( rule__League__Group__0 ) )
            {
            // InternalEsportDsl.g:167:2: ( ( rule__League__Group__0 ) )
            // InternalEsportDsl.g:168:3: ( rule__League__Group__0 )
            {
             before(grammarAccess.getLeagueAccess().getGroup()); 
            // InternalEsportDsl.g:169:3: ( rule__League__Group__0 )
            // InternalEsportDsl.g:169:4: rule__League__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__League__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLeagueAccess().getGroup()); 

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
    // $ANTLR end "ruleLeague"


    // $ANTLR start "entryRuleTeam"
    // InternalEsportDsl.g:178:1: entryRuleTeam : ruleTeam EOF ;
    public final void entryRuleTeam() throws RecognitionException {
        try {
            // InternalEsportDsl.g:179:1: ( ruleTeam EOF )
            // InternalEsportDsl.g:180:1: ruleTeam EOF
            {
             before(grammarAccess.getTeamRule()); 
            pushFollow(FOLLOW_1);
            ruleTeam();

            state._fsp--;

             after(grammarAccess.getTeamRule()); 
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
    // $ANTLR end "entryRuleTeam"


    // $ANTLR start "ruleTeam"
    // InternalEsportDsl.g:187:1: ruleTeam : ( ( rule__Team__Group__0 ) ) ;
    public final void ruleTeam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:191:2: ( ( ( rule__Team__Group__0 ) ) )
            // InternalEsportDsl.g:192:2: ( ( rule__Team__Group__0 ) )
            {
            // InternalEsportDsl.g:192:2: ( ( rule__Team__Group__0 ) )
            // InternalEsportDsl.g:193:3: ( rule__Team__Group__0 )
            {
             before(grammarAccess.getTeamAccess().getGroup()); 
            // InternalEsportDsl.g:194:3: ( rule__Team__Group__0 )
            // InternalEsportDsl.g:194:4: rule__Team__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Team__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTeamAccess().getGroup()); 

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
    // $ANTLR end "ruleTeam"


    // $ANTLR start "entryRuleQualification"
    // InternalEsportDsl.g:203:1: entryRuleQualification : ruleQualification EOF ;
    public final void entryRuleQualification() throws RecognitionException {
        try {
            // InternalEsportDsl.g:204:1: ( ruleQualification EOF )
            // InternalEsportDsl.g:205:1: ruleQualification EOF
            {
             before(grammarAccess.getQualificationRule()); 
            pushFollow(FOLLOW_1);
            ruleQualification();

            state._fsp--;

             after(grammarAccess.getQualificationRule()); 
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
    // $ANTLR end "entryRuleQualification"


    // $ANTLR start "ruleQualification"
    // InternalEsportDsl.g:212:1: ruleQualification : ( ( rule__Qualification__Group__0 ) ) ;
    public final void ruleQualification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:216:2: ( ( ( rule__Qualification__Group__0 ) ) )
            // InternalEsportDsl.g:217:2: ( ( rule__Qualification__Group__0 ) )
            {
            // InternalEsportDsl.g:217:2: ( ( rule__Qualification__Group__0 ) )
            // InternalEsportDsl.g:218:3: ( rule__Qualification__Group__0 )
            {
             before(grammarAccess.getQualificationAccess().getGroup()); 
            // InternalEsportDsl.g:219:3: ( rule__Qualification__Group__0 )
            // InternalEsportDsl.g:219:4: rule__Qualification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Qualification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualificationAccess().getGroup()); 

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
    // $ANTLR end "ruleQualification"


    // $ANTLR start "entryRuleEString"
    // InternalEsportDsl.g:228:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalEsportDsl.g:229:1: ( ruleEString EOF )
            // InternalEsportDsl.g:230:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalEsportDsl.g:237:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:241:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalEsportDsl.g:242:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalEsportDsl.g:242:2: ( ( rule__EString__Alternatives ) )
            // InternalEsportDsl.g:243:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalEsportDsl.g:244:3: ( rule__EString__Alternatives )
            // InternalEsportDsl.g:244:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleCountry"
    // InternalEsportDsl.g:253:1: entryRuleCountry : ruleCountry EOF ;
    public final void entryRuleCountry() throws RecognitionException {
        try {
            // InternalEsportDsl.g:254:1: ( ruleCountry EOF )
            // InternalEsportDsl.g:255:1: ruleCountry EOF
            {
             before(grammarAccess.getCountryRule()); 
            pushFollow(FOLLOW_1);
            ruleCountry();

            state._fsp--;

             after(grammarAccess.getCountryRule()); 
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
    // $ANTLR end "entryRuleCountry"


    // $ANTLR start "ruleCountry"
    // InternalEsportDsl.g:262:1: ruleCountry : ( ( rule__Country__Group__0 ) ) ;
    public final void ruleCountry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:266:2: ( ( ( rule__Country__Group__0 ) ) )
            // InternalEsportDsl.g:267:2: ( ( rule__Country__Group__0 ) )
            {
            // InternalEsportDsl.g:267:2: ( ( rule__Country__Group__0 ) )
            // InternalEsportDsl.g:268:3: ( rule__Country__Group__0 )
            {
             before(grammarAccess.getCountryAccess().getGroup()); 
            // InternalEsportDsl.g:269:3: ( rule__Country__Group__0 )
            // InternalEsportDsl.g:269:4: rule__Country__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Country__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCountryAccess().getGroup()); 

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
    // $ANTLR end "ruleCountry"


    // $ANTLR start "entryRuleEInt"
    // InternalEsportDsl.g:278:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalEsportDsl.g:279:1: ( ruleEInt EOF )
            // InternalEsportDsl.g:280:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalEsportDsl.g:287:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:291:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalEsportDsl.g:292:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalEsportDsl.g:292:2: ( ( rule__EInt__Group__0 ) )
            // InternalEsportDsl.g:293:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalEsportDsl.g:294:3: ( rule__EInt__Group__0 )
            // InternalEsportDsl.g:294:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleFinalStage"
    // InternalEsportDsl.g:303:1: entryRuleFinalStage : ruleFinalStage EOF ;
    public final void entryRuleFinalStage() throws RecognitionException {
        try {
            // InternalEsportDsl.g:304:1: ( ruleFinalStage EOF )
            // InternalEsportDsl.g:305:1: ruleFinalStage EOF
            {
             before(grammarAccess.getFinalStageRule()); 
            pushFollow(FOLLOW_1);
            ruleFinalStage();

            state._fsp--;

             after(grammarAccess.getFinalStageRule()); 
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
    // $ANTLR end "entryRuleFinalStage"


    // $ANTLR start "ruleFinalStage"
    // InternalEsportDsl.g:312:1: ruleFinalStage : ( ( rule__FinalStage__Group__0 ) ) ;
    public final void ruleFinalStage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:316:2: ( ( ( rule__FinalStage__Group__0 ) ) )
            // InternalEsportDsl.g:317:2: ( ( rule__FinalStage__Group__0 ) )
            {
            // InternalEsportDsl.g:317:2: ( ( rule__FinalStage__Group__0 ) )
            // InternalEsportDsl.g:318:3: ( rule__FinalStage__Group__0 )
            {
             before(grammarAccess.getFinalStageAccess().getGroup()); 
            // InternalEsportDsl.g:319:3: ( rule__FinalStage__Group__0 )
            // InternalEsportDsl.g:319:4: rule__FinalStage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FinalStage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFinalStageAccess().getGroup()); 

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
    // $ANTLR end "ruleFinalStage"


    // $ANTLR start "entryRuleGroupStage"
    // InternalEsportDsl.g:328:1: entryRuleGroupStage : ruleGroupStage EOF ;
    public final void entryRuleGroupStage() throws RecognitionException {
        try {
            // InternalEsportDsl.g:329:1: ( ruleGroupStage EOF )
            // InternalEsportDsl.g:330:1: ruleGroupStage EOF
            {
             before(grammarAccess.getGroupStageRule()); 
            pushFollow(FOLLOW_1);
            ruleGroupStage();

            state._fsp--;

             after(grammarAccess.getGroupStageRule()); 
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
    // $ANTLR end "entryRuleGroupStage"


    // $ANTLR start "ruleGroupStage"
    // InternalEsportDsl.g:337:1: ruleGroupStage : ( ( rule__GroupStage__Group__0 ) ) ;
    public final void ruleGroupStage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:341:2: ( ( ( rule__GroupStage__Group__0 ) ) )
            // InternalEsportDsl.g:342:2: ( ( rule__GroupStage__Group__0 ) )
            {
            // InternalEsportDsl.g:342:2: ( ( rule__GroupStage__Group__0 ) )
            // InternalEsportDsl.g:343:3: ( rule__GroupStage__Group__0 )
            {
             before(grammarAccess.getGroupStageAccess().getGroup()); 
            // InternalEsportDsl.g:344:3: ( rule__GroupStage__Group__0 )
            // InternalEsportDsl.g:344:4: rule__GroupStage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GroupStage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupStageAccess().getGroup()); 

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
    // $ANTLR end "ruleGroupStage"


    // $ANTLR start "entryRuleMatch"
    // InternalEsportDsl.g:353:1: entryRuleMatch : ruleMatch EOF ;
    public final void entryRuleMatch() throws RecognitionException {
        try {
            // InternalEsportDsl.g:354:1: ( ruleMatch EOF )
            // InternalEsportDsl.g:355:1: ruleMatch EOF
            {
             before(grammarAccess.getMatchRule()); 
            pushFollow(FOLLOW_1);
            ruleMatch();

            state._fsp--;

             after(grammarAccess.getMatchRule()); 
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
    // $ANTLR end "entryRuleMatch"


    // $ANTLR start "ruleMatch"
    // InternalEsportDsl.g:362:1: ruleMatch : ( ( rule__Match__Group__0 ) ) ;
    public final void ruleMatch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:366:2: ( ( ( rule__Match__Group__0 ) ) )
            // InternalEsportDsl.g:367:2: ( ( rule__Match__Group__0 ) )
            {
            // InternalEsportDsl.g:367:2: ( ( rule__Match__Group__0 ) )
            // InternalEsportDsl.g:368:3: ( rule__Match__Group__0 )
            {
             before(grammarAccess.getMatchAccess().getGroup()); 
            // InternalEsportDsl.g:369:3: ( rule__Match__Group__0 )
            // InternalEsportDsl.g:369:4: rule__Match__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Match__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMatchAccess().getGroup()); 

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
    // $ANTLR end "ruleMatch"


    // $ANTLR start "entryRuleGroup"
    // InternalEsportDsl.g:378:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // InternalEsportDsl.g:379:1: ( ruleGroup EOF )
            // InternalEsportDsl.g:380:1: ruleGroup EOF
            {
             before(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_1);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getGroupRule()); 
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
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // InternalEsportDsl.g:387:1: ruleGroup : ( ( rule__Group__Group__0 ) ) ;
    public final void ruleGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:391:2: ( ( ( rule__Group__Group__0 ) ) )
            // InternalEsportDsl.g:392:2: ( ( rule__Group__Group__0 ) )
            {
            // InternalEsportDsl.g:392:2: ( ( rule__Group__Group__0 ) )
            // InternalEsportDsl.g:393:3: ( rule__Group__Group__0 )
            {
             before(grammarAccess.getGroupAccess().getGroup()); 
            // InternalEsportDsl.g:394:3: ( rule__Group__Group__0 )
            // InternalEsportDsl.g:394:4: rule__Group__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getGroup()); 

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
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRulePlayer"
    // InternalEsportDsl.g:403:1: entryRulePlayer : rulePlayer EOF ;
    public final void entryRulePlayer() throws RecognitionException {
        try {
            // InternalEsportDsl.g:404:1: ( rulePlayer EOF )
            // InternalEsportDsl.g:405:1: rulePlayer EOF
            {
             before(grammarAccess.getPlayerRule()); 
            pushFollow(FOLLOW_1);
            rulePlayer();

            state._fsp--;

             after(grammarAccess.getPlayerRule()); 
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
    // $ANTLR end "entryRulePlayer"


    // $ANTLR start "rulePlayer"
    // InternalEsportDsl.g:412:1: rulePlayer : ( ( rule__Player__Group__0 ) ) ;
    public final void rulePlayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:416:2: ( ( ( rule__Player__Group__0 ) ) )
            // InternalEsportDsl.g:417:2: ( ( rule__Player__Group__0 ) )
            {
            // InternalEsportDsl.g:417:2: ( ( rule__Player__Group__0 ) )
            // InternalEsportDsl.g:418:3: ( rule__Player__Group__0 )
            {
             before(grammarAccess.getPlayerAccess().getGroup()); 
            // InternalEsportDsl.g:419:3: ( rule__Player__Group__0 )
            // InternalEsportDsl.g:419:4: rule__Player__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Player__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlayerAccess().getGroup()); 

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
    // $ANTLR end "rulePlayer"


    // $ANTLR start "entryRuleCoach"
    // InternalEsportDsl.g:428:1: entryRuleCoach : ruleCoach EOF ;
    public final void entryRuleCoach() throws RecognitionException {
        try {
            // InternalEsportDsl.g:429:1: ( ruleCoach EOF )
            // InternalEsportDsl.g:430:1: ruleCoach EOF
            {
             before(grammarAccess.getCoachRule()); 
            pushFollow(FOLLOW_1);
            ruleCoach();

            state._fsp--;

             after(grammarAccess.getCoachRule()); 
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
    // $ANTLR end "entryRuleCoach"


    // $ANTLR start "ruleCoach"
    // InternalEsportDsl.g:437:1: ruleCoach : ( ( rule__Coach__Group__0 ) ) ;
    public final void ruleCoach() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:441:2: ( ( ( rule__Coach__Group__0 ) ) )
            // InternalEsportDsl.g:442:2: ( ( rule__Coach__Group__0 ) )
            {
            // InternalEsportDsl.g:442:2: ( ( rule__Coach__Group__0 ) )
            // InternalEsportDsl.g:443:3: ( rule__Coach__Group__0 )
            {
             before(grammarAccess.getCoachAccess().getGroup()); 
            // InternalEsportDsl.g:444:3: ( rule__Coach__Group__0 )
            // InternalEsportDsl.g:444:4: rule__Coach__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Coach__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCoachAccess().getGroup()); 

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
    // $ANTLR end "ruleCoach"


    // $ANTLR start "entryRuleCapacity"
    // InternalEsportDsl.g:453:1: entryRuleCapacity : ruleCapacity EOF ;
    public final void entryRuleCapacity() throws RecognitionException {
        try {
            // InternalEsportDsl.g:454:1: ( ruleCapacity EOF )
            // InternalEsportDsl.g:455:1: ruleCapacity EOF
            {
             before(grammarAccess.getCapacityRule()); 
            pushFollow(FOLLOW_1);
            ruleCapacity();

            state._fsp--;

             after(grammarAccess.getCapacityRule()); 
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
    // $ANTLR end "entryRuleCapacity"


    // $ANTLR start "ruleCapacity"
    // InternalEsportDsl.g:462:1: ruleCapacity : ( ( rule__Capacity__Group__0 ) ) ;
    public final void ruleCapacity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:466:2: ( ( ( rule__Capacity__Group__0 ) ) )
            // InternalEsportDsl.g:467:2: ( ( rule__Capacity__Group__0 ) )
            {
            // InternalEsportDsl.g:467:2: ( ( rule__Capacity__Group__0 ) )
            // InternalEsportDsl.g:468:3: ( rule__Capacity__Group__0 )
            {
             before(grammarAccess.getCapacityAccess().getGroup()); 
            // InternalEsportDsl.g:469:3: ( rule__Capacity__Group__0 )
            // InternalEsportDsl.g:469:4: rule__Capacity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Capacity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCapacityAccess().getGroup()); 

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
    // $ANTLR end "ruleCapacity"


    // $ANTLR start "ruleTournamentType"
    // InternalEsportDsl.g:478:1: ruleTournamentType : ( ( rule__TournamentType__Alternatives ) ) ;
    public final void ruleTournamentType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:482:1: ( ( ( rule__TournamentType__Alternatives ) ) )
            // InternalEsportDsl.g:483:2: ( ( rule__TournamentType__Alternatives ) )
            {
            // InternalEsportDsl.g:483:2: ( ( rule__TournamentType__Alternatives ) )
            // InternalEsportDsl.g:484:3: ( rule__TournamentType__Alternatives )
            {
             before(grammarAccess.getTournamentTypeAccess().getAlternatives()); 
            // InternalEsportDsl.g:485:3: ( rule__TournamentType__Alternatives )
            // InternalEsportDsl.g:485:4: rule__TournamentType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TournamentType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTournamentTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTournamentType"


    // $ANTLR start "ruleMatchType"
    // InternalEsportDsl.g:494:1: ruleMatchType : ( ( rule__MatchType__Alternatives ) ) ;
    public final void ruleMatchType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:498:1: ( ( ( rule__MatchType__Alternatives ) ) )
            // InternalEsportDsl.g:499:2: ( ( rule__MatchType__Alternatives ) )
            {
            // InternalEsportDsl.g:499:2: ( ( rule__MatchType__Alternatives ) )
            // InternalEsportDsl.g:500:3: ( rule__MatchType__Alternatives )
            {
             before(grammarAccess.getMatchTypeAccess().getAlternatives()); 
            // InternalEsportDsl.g:501:3: ( rule__MatchType__Alternatives )
            // InternalEsportDsl.g:501:4: rule__MatchType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MatchType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMatchTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMatchType"


    // $ANTLR start "ruleGroupStageType"
    // InternalEsportDsl.g:510:1: ruleGroupStageType : ( ( rule__GroupStageType__Alternatives ) ) ;
    public final void ruleGroupStageType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:514:1: ( ( ( rule__GroupStageType__Alternatives ) ) )
            // InternalEsportDsl.g:515:2: ( ( rule__GroupStageType__Alternatives ) )
            {
            // InternalEsportDsl.g:515:2: ( ( rule__GroupStageType__Alternatives ) )
            // InternalEsportDsl.g:516:3: ( rule__GroupStageType__Alternatives )
            {
             before(grammarAccess.getGroupStageTypeAccess().getAlternatives()); 
            // InternalEsportDsl.g:517:3: ( rule__GroupStageType__Alternatives )
            // InternalEsportDsl.g:517:4: rule__GroupStageType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GroupStageType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGroupStageTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleGroupStageType"


    // $ANTLR start "ruleSeason"
    // InternalEsportDsl.g:526:1: ruleSeason : ( ( rule__Season__Alternatives ) ) ;
    public final void ruleSeason() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:530:1: ( ( ( rule__Season__Alternatives ) ) )
            // InternalEsportDsl.g:531:2: ( ( rule__Season__Alternatives ) )
            {
            // InternalEsportDsl.g:531:2: ( ( rule__Season__Alternatives ) )
            // InternalEsportDsl.g:532:3: ( rule__Season__Alternatives )
            {
             before(grammarAccess.getSeasonAccess().getAlternatives()); 
            // InternalEsportDsl.g:533:3: ( rule__Season__Alternatives )
            // InternalEsportDsl.g:533:4: rule__Season__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Season__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSeasonAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSeason"


    // $ANTLR start "rulePosition"
    // InternalEsportDsl.g:542:1: rulePosition : ( ( rule__Position__Alternatives ) ) ;
    public final void rulePosition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:546:1: ( ( ( rule__Position__Alternatives ) ) )
            // InternalEsportDsl.g:547:2: ( ( rule__Position__Alternatives ) )
            {
            // InternalEsportDsl.g:547:2: ( ( rule__Position__Alternatives ) )
            // InternalEsportDsl.g:548:3: ( rule__Position__Alternatives )
            {
             before(grammarAccess.getPositionAccess().getAlternatives()); 
            // InternalEsportDsl.g:549:3: ( rule__Position__Alternatives )
            // InternalEsportDsl.g:549:4: rule__Position__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Position__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPositionAccess().getAlternatives()); 

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
    // $ANTLR end "rulePosition"


    // $ANTLR start "ruleCapacityType"
    // InternalEsportDsl.g:558:1: ruleCapacityType : ( ( rule__CapacityType__Alternatives ) ) ;
    public final void ruleCapacityType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:562:1: ( ( ( rule__CapacityType__Alternatives ) ) )
            // InternalEsportDsl.g:563:2: ( ( rule__CapacityType__Alternatives ) )
            {
            // InternalEsportDsl.g:563:2: ( ( rule__CapacityType__Alternatives ) )
            // InternalEsportDsl.g:564:3: ( rule__CapacityType__Alternatives )
            {
             before(grammarAccess.getCapacityTypeAccess().getAlternatives()); 
            // InternalEsportDsl.g:565:3: ( rule__CapacityType__Alternatives )
            // InternalEsportDsl.g:565:4: rule__CapacityType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CapacityType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCapacityTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCapacityType"


    // $ANTLR start "rule__Root__Alternatives"
    // InternalEsportDsl.g:573:1: rule__Root__Alternatives : ( ( ( rule__Root__ZonesAssignment_0 ) ) | ( ( rule__Root__TournamentsAssignment_1 ) ) | ( ( rule__Root__LeaguesAssignment_2 ) ) | ( ( rule__Root__TeamsAssignment_3 ) ) | ( ( rule__Root__PersonsAssignment_4 ) ) | ( ( rule__Root__QualificationsAssignment_5 ) ) | ( ( rule__Root__CountriesAssignment_6 ) ) );
    public final void rule__Root__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:577:1: ( ( ( rule__Root__ZonesAssignment_0 ) ) | ( ( rule__Root__TournamentsAssignment_1 ) ) | ( ( rule__Root__LeaguesAssignment_2 ) ) | ( ( rule__Root__TeamsAssignment_3 ) ) | ( ( rule__Root__PersonsAssignment_4 ) ) | ( ( rule__Root__QualificationsAssignment_5 ) ) | ( ( rule__Root__CountriesAssignment_6 ) ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt2=1;
                }
                break;
            case 59:
                {
                alt2=2;
                }
                break;
            case 62:
                {
                alt2=3;
                }
                break;
            case 63:
                {
                alt2=4;
                }
                break;
            case 72:
            case 73:
                {
                alt2=5;
                }
                break;
            case 64:
                {
                alt2=6;
                }
                break;
            case 65:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalEsportDsl.g:578:2: ( ( rule__Root__ZonesAssignment_0 ) )
                    {
                    // InternalEsportDsl.g:578:2: ( ( rule__Root__ZonesAssignment_0 ) )
                    // InternalEsportDsl.g:579:3: ( rule__Root__ZonesAssignment_0 )
                    {
                     before(grammarAccess.getRootAccess().getZonesAssignment_0()); 
                    // InternalEsportDsl.g:580:3: ( rule__Root__ZonesAssignment_0 )
                    // InternalEsportDsl.g:580:4: rule__Root__ZonesAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Root__ZonesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRootAccess().getZonesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEsportDsl.g:584:2: ( ( rule__Root__TournamentsAssignment_1 ) )
                    {
                    // InternalEsportDsl.g:584:2: ( ( rule__Root__TournamentsAssignment_1 ) )
                    // InternalEsportDsl.g:585:3: ( rule__Root__TournamentsAssignment_1 )
                    {
                     before(grammarAccess.getRootAccess().getTournamentsAssignment_1()); 
                    // InternalEsportDsl.g:586:3: ( rule__Root__TournamentsAssignment_1 )
                    // InternalEsportDsl.g:586:4: rule__Root__TournamentsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Root__TournamentsAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRootAccess().getTournamentsAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEsportDsl.g:590:2: ( ( rule__Root__LeaguesAssignment_2 ) )
                    {
                    // InternalEsportDsl.g:590:2: ( ( rule__Root__LeaguesAssignment_2 ) )
                    // InternalEsportDsl.g:591:3: ( rule__Root__LeaguesAssignment_2 )
                    {
                     before(grammarAccess.getRootAccess().getLeaguesAssignment_2()); 
                    // InternalEsportDsl.g:592:3: ( rule__Root__LeaguesAssignment_2 )
                    // InternalEsportDsl.g:592:4: rule__Root__LeaguesAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Root__LeaguesAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getRootAccess().getLeaguesAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEsportDsl.g:596:2: ( ( rule__Root__TeamsAssignment_3 ) )
                    {
                    // InternalEsportDsl.g:596:2: ( ( rule__Root__TeamsAssignment_3 ) )
                    // InternalEsportDsl.g:597:3: ( rule__Root__TeamsAssignment_3 )
                    {
                     before(grammarAccess.getRootAccess().getTeamsAssignment_3()); 
                    // InternalEsportDsl.g:598:3: ( rule__Root__TeamsAssignment_3 )
                    // InternalEsportDsl.g:598:4: rule__Root__TeamsAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Root__TeamsAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getRootAccess().getTeamsAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalEsportDsl.g:602:2: ( ( rule__Root__PersonsAssignment_4 ) )
                    {
                    // InternalEsportDsl.g:602:2: ( ( rule__Root__PersonsAssignment_4 ) )
                    // InternalEsportDsl.g:603:3: ( rule__Root__PersonsAssignment_4 )
                    {
                     before(grammarAccess.getRootAccess().getPersonsAssignment_4()); 
                    // InternalEsportDsl.g:604:3: ( rule__Root__PersonsAssignment_4 )
                    // InternalEsportDsl.g:604:4: rule__Root__PersonsAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Root__PersonsAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getRootAccess().getPersonsAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalEsportDsl.g:608:2: ( ( rule__Root__QualificationsAssignment_5 ) )
                    {
                    // InternalEsportDsl.g:608:2: ( ( rule__Root__QualificationsAssignment_5 ) )
                    // InternalEsportDsl.g:609:3: ( rule__Root__QualificationsAssignment_5 )
                    {
                     before(grammarAccess.getRootAccess().getQualificationsAssignment_5()); 
                    // InternalEsportDsl.g:610:3: ( rule__Root__QualificationsAssignment_5 )
                    // InternalEsportDsl.g:610:4: rule__Root__QualificationsAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Root__QualificationsAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getRootAccess().getQualificationsAssignment_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalEsportDsl.g:614:2: ( ( rule__Root__CountriesAssignment_6 ) )
                    {
                    // InternalEsportDsl.g:614:2: ( ( rule__Root__CountriesAssignment_6 ) )
                    // InternalEsportDsl.g:615:3: ( rule__Root__CountriesAssignment_6 )
                    {
                     before(grammarAccess.getRootAccess().getCountriesAssignment_6()); 
                    // InternalEsportDsl.g:616:3: ( rule__Root__CountriesAssignment_6 )
                    // InternalEsportDsl.g:616:4: rule__Root__CountriesAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Root__CountriesAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getRootAccess().getCountriesAssignment_6()); 

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
    // $ANTLR end "rule__Root__Alternatives"


    // $ANTLR start "rule__Person__Alternatives"
    // InternalEsportDsl.g:624:1: rule__Person__Alternatives : ( ( rulePlayer ) | ( ruleCoach ) );
    public final void rule__Person__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:628:1: ( ( rulePlayer ) | ( ruleCoach ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==72) ) {
                alt3=1;
            }
            else if ( (LA3_0==73) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalEsportDsl.g:629:2: ( rulePlayer )
                    {
                    // InternalEsportDsl.g:629:2: ( rulePlayer )
                    // InternalEsportDsl.g:630:3: rulePlayer
                    {
                     before(grammarAccess.getPersonAccess().getPlayerParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePlayer();

                    state._fsp--;

                     after(grammarAccess.getPersonAccess().getPlayerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEsportDsl.g:635:2: ( ruleCoach )
                    {
                    // InternalEsportDsl.g:635:2: ( ruleCoach )
                    // InternalEsportDsl.g:636:3: ruleCoach
                    {
                     before(grammarAccess.getPersonAccess().getCoachParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCoach();

                    state._fsp--;

                     after(grammarAccess.getPersonAccess().getCoachParserRuleCall_1()); 

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
    // $ANTLR end "rule__Person__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalEsportDsl.g:645:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:649:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalEsportDsl.g:650:2: ( RULE_STRING )
                    {
                    // InternalEsportDsl.g:650:2: ( RULE_STRING )
                    // InternalEsportDsl.g:651:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEsportDsl.g:656:2: ( RULE_ID )
                    {
                    // InternalEsportDsl.g:656:2: ( RULE_ID )
                    // InternalEsportDsl.g:657:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__TournamentType__Alternatives"
    // InternalEsportDsl.g:666:1: rule__TournamentType__Alternatives : ( ( ( 'worlds' ) ) | ( ( 'regionals' ) ) | ( ( 'allStars' ) ) | ( ( 'promotion' ) ) | ( ( 'midSeasonInvitational' ) ) | ( ( 'riftRivals' ) ) | ( ( 'playOff' ) ) );
    public final void rule__TournamentType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:670:1: ( ( ( 'worlds' ) ) | ( ( 'regionals' ) ) | ( ( 'allStars' ) ) | ( ( 'promotion' ) ) | ( ( 'midSeasonInvitational' ) ) | ( ( 'riftRivals' ) ) | ( ( 'playOff' ) ) )
            int alt5=7;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case 13:
                {
                alt5=3;
                }
                break;
            case 14:
                {
                alt5=4;
                }
                break;
            case 15:
                {
                alt5=5;
                }
                break;
            case 16:
                {
                alt5=6;
                }
                break;
            case 17:
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalEsportDsl.g:671:2: ( ( 'worlds' ) )
                    {
                    // InternalEsportDsl.g:671:2: ( ( 'worlds' ) )
                    // InternalEsportDsl.g:672:3: ( 'worlds' )
                    {
                     before(grammarAccess.getTournamentTypeAccess().getWorldsEnumLiteralDeclaration_0()); 
                    // InternalEsportDsl.g:673:3: ( 'worlds' )
                    // InternalEsportDsl.g:673:4: 'worlds'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTournamentTypeAccess().getWorldsEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEsportDsl.g:677:2: ( ( 'regionals' ) )
                    {
                    // InternalEsportDsl.g:677:2: ( ( 'regionals' ) )
                    // InternalEsportDsl.g:678:3: ( 'regionals' )
                    {
                     before(grammarAccess.getTournamentTypeAccess().getRegionalsEnumLiteralDeclaration_1()); 
                    // InternalEsportDsl.g:679:3: ( 'regionals' )
                    // InternalEsportDsl.g:679:4: 'regionals'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTournamentTypeAccess().getRegionalsEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEsportDsl.g:683:2: ( ( 'allStars' ) )
                    {
                    // InternalEsportDsl.g:683:2: ( ( 'allStars' ) )
                    // InternalEsportDsl.g:684:3: ( 'allStars' )
                    {
                     before(grammarAccess.getTournamentTypeAccess().getAllStarsEnumLiteralDeclaration_2()); 
                    // InternalEsportDsl.g:685:3: ( 'allStars' )
                    // InternalEsportDsl.g:685:4: 'allStars'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTournamentTypeAccess().getAllStarsEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEsportDsl.g:689:2: ( ( 'promotion' ) )
                    {
                    // InternalEsportDsl.g:689:2: ( ( 'promotion' ) )
                    // InternalEsportDsl.g:690:3: ( 'promotion' )
                    {
                     before(grammarAccess.getTournamentTypeAccess().getPromotionEnumLiteralDeclaration_3()); 
                    // InternalEsportDsl.g:691:3: ( 'promotion' )
                    // InternalEsportDsl.g:691:4: 'promotion'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTournamentTypeAccess().getPromotionEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalEsportDsl.g:695:2: ( ( 'midSeasonInvitational' ) )
                    {
                    // InternalEsportDsl.g:695:2: ( ( 'midSeasonInvitational' ) )
                    // InternalEsportDsl.g:696:3: ( 'midSeasonInvitational' )
                    {
                     before(grammarAccess.getTournamentTypeAccess().getMidSeasonInvitationalEnumLiteralDeclaration_4()); 
                    // InternalEsportDsl.g:697:3: ( 'midSeasonInvitational' )
                    // InternalEsportDsl.g:697:4: 'midSeasonInvitational'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTournamentTypeAccess().getMidSeasonInvitationalEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalEsportDsl.g:701:2: ( ( 'riftRivals' ) )
                    {
                    // InternalEsportDsl.g:701:2: ( ( 'riftRivals' ) )
                    // InternalEsportDsl.g:702:3: ( 'riftRivals' )
                    {
                     before(grammarAccess.getTournamentTypeAccess().getRiftRivalsEnumLiteralDeclaration_5()); 
                    // InternalEsportDsl.g:703:3: ( 'riftRivals' )
                    // InternalEsportDsl.g:703:4: 'riftRivals'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getTournamentTypeAccess().getRiftRivalsEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalEsportDsl.g:707:2: ( ( 'playOff' ) )
                    {
                    // InternalEsportDsl.g:707:2: ( ( 'playOff' ) )
                    // InternalEsportDsl.g:708:3: ( 'playOff' )
                    {
                     before(grammarAccess.getTournamentTypeAccess().getPlayOffEnumLiteralDeclaration_6()); 
                    // InternalEsportDsl.g:709:3: ( 'playOff' )
                    // InternalEsportDsl.g:709:4: 'playOff'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTournamentTypeAccess().getPlayOffEnumLiteralDeclaration_6()); 

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
    // $ANTLR end "rule__TournamentType__Alternatives"


    // $ANTLR start "rule__MatchType__Alternatives"
    // InternalEsportDsl.g:717:1: rule__MatchType__Alternatives : ( ( ( 'group' ) ) | ( ( 'final' ) ) | ( ( 'semiFinal' ) ) | ( ( 'quarterFinal' ) ) | ( ( 'singleRoundElimination' ) ) );
    public final void rule__MatchType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:721:1: ( ( ( 'group' ) ) | ( ( 'final' ) ) | ( ( 'semiFinal' ) ) | ( ( 'quarterFinal' ) ) | ( ( 'singleRoundElimination' ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt6=1;
                }
                break;
            case 19:
                {
                alt6=2;
                }
                break;
            case 20:
                {
                alt6=3;
                }
                break;
            case 21:
                {
                alt6=4;
                }
                break;
            case 22:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalEsportDsl.g:722:2: ( ( 'group' ) )
                    {
                    // InternalEsportDsl.g:722:2: ( ( 'group' ) )
                    // InternalEsportDsl.g:723:3: ( 'group' )
                    {
                     before(grammarAccess.getMatchTypeAccess().getGroupEnumLiteralDeclaration_0()); 
                    // InternalEsportDsl.g:724:3: ( 'group' )
                    // InternalEsportDsl.g:724:4: 'group'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getMatchTypeAccess().getGroupEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEsportDsl.g:728:2: ( ( 'final' ) )
                    {
                    // InternalEsportDsl.g:728:2: ( ( 'final' ) )
                    // InternalEsportDsl.g:729:3: ( 'final' )
                    {
                     before(grammarAccess.getMatchTypeAccess().getFinalEnumLiteralDeclaration_1()); 
                    // InternalEsportDsl.g:730:3: ( 'final' )
                    // InternalEsportDsl.g:730:4: 'final'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getMatchTypeAccess().getFinalEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEsportDsl.g:734:2: ( ( 'semiFinal' ) )
                    {
                    // InternalEsportDsl.g:734:2: ( ( 'semiFinal' ) )
                    // InternalEsportDsl.g:735:3: ( 'semiFinal' )
                    {
                     before(grammarAccess.getMatchTypeAccess().getSemiFinalEnumLiteralDeclaration_2()); 
                    // InternalEsportDsl.g:736:3: ( 'semiFinal' )
                    // InternalEsportDsl.g:736:4: 'semiFinal'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getMatchTypeAccess().getSemiFinalEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEsportDsl.g:740:2: ( ( 'quarterFinal' ) )
                    {
                    // InternalEsportDsl.g:740:2: ( ( 'quarterFinal' ) )
                    // InternalEsportDsl.g:741:3: ( 'quarterFinal' )
                    {
                     before(grammarAccess.getMatchTypeAccess().getQuarterFinalEnumLiteralDeclaration_3()); 
                    // InternalEsportDsl.g:742:3: ( 'quarterFinal' )
                    // InternalEsportDsl.g:742:4: 'quarterFinal'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getMatchTypeAccess().getQuarterFinalEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalEsportDsl.g:746:2: ( ( 'singleRoundElimination' ) )
                    {
                    // InternalEsportDsl.g:746:2: ( ( 'singleRoundElimination' ) )
                    // InternalEsportDsl.g:747:3: ( 'singleRoundElimination' )
                    {
                     before(grammarAccess.getMatchTypeAccess().getSingleRoundEliminationEnumLiteralDeclaration_4()); 
                    // InternalEsportDsl.g:748:3: ( 'singleRoundElimination' )
                    // InternalEsportDsl.g:748:4: 'singleRoundElimination'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getMatchTypeAccess().getSingleRoundEliminationEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__MatchType__Alternatives"


    // $ANTLR start "rule__GroupStageType__Alternatives"
    // InternalEsportDsl.g:756:1: rule__GroupStageType__Alternatives : ( ( ( 'league' ) ) | ( ( 'worldsPlayIn' ) ) | ( ( 'worldsGroup' ) ) | ( ( 'riftRivalsGroup' ) ) | ( ( 'msiPlayIn' ) ) | ( ( 'msiGroup' ) ) | ( ( 'allStarsGroup' ) ) );
    public final void rule__GroupStageType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:760:1: ( ( ( 'league' ) ) | ( ( 'worldsPlayIn' ) ) | ( ( 'worldsGroup' ) ) | ( ( 'riftRivalsGroup' ) ) | ( ( 'msiPlayIn' ) ) | ( ( 'msiGroup' ) ) | ( ( 'allStarsGroup' ) ) )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt7=1;
                }
                break;
            case 24:
                {
                alt7=2;
                }
                break;
            case 25:
                {
                alt7=3;
                }
                break;
            case 26:
                {
                alt7=4;
                }
                break;
            case 27:
                {
                alt7=5;
                }
                break;
            case 28:
                {
                alt7=6;
                }
                break;
            case 29:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalEsportDsl.g:761:2: ( ( 'league' ) )
                    {
                    // InternalEsportDsl.g:761:2: ( ( 'league' ) )
                    // InternalEsportDsl.g:762:3: ( 'league' )
                    {
                     before(grammarAccess.getGroupStageTypeAccess().getLeagueEnumLiteralDeclaration_0()); 
                    // InternalEsportDsl.g:763:3: ( 'league' )
                    // InternalEsportDsl.g:763:4: 'league'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getGroupStageTypeAccess().getLeagueEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEsportDsl.g:767:2: ( ( 'worldsPlayIn' ) )
                    {
                    // InternalEsportDsl.g:767:2: ( ( 'worldsPlayIn' ) )
                    // InternalEsportDsl.g:768:3: ( 'worldsPlayIn' )
                    {
                     before(grammarAccess.getGroupStageTypeAccess().getWorldsPlayInEnumLiteralDeclaration_1()); 
                    // InternalEsportDsl.g:769:3: ( 'worldsPlayIn' )
                    // InternalEsportDsl.g:769:4: 'worldsPlayIn'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getGroupStageTypeAccess().getWorldsPlayInEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEsportDsl.g:773:2: ( ( 'worldsGroup' ) )
                    {
                    // InternalEsportDsl.g:773:2: ( ( 'worldsGroup' ) )
                    // InternalEsportDsl.g:774:3: ( 'worldsGroup' )
                    {
                     before(grammarAccess.getGroupStageTypeAccess().getWorldsGroupEnumLiteralDeclaration_2()); 
                    // InternalEsportDsl.g:775:3: ( 'worldsGroup' )
                    // InternalEsportDsl.g:775:4: 'worldsGroup'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getGroupStageTypeAccess().getWorldsGroupEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEsportDsl.g:779:2: ( ( 'riftRivalsGroup' ) )
                    {
                    // InternalEsportDsl.g:779:2: ( ( 'riftRivalsGroup' ) )
                    // InternalEsportDsl.g:780:3: ( 'riftRivalsGroup' )
                    {
                     before(grammarAccess.getGroupStageTypeAccess().getRiftRivalsGroupEnumLiteralDeclaration_3()); 
                    // InternalEsportDsl.g:781:3: ( 'riftRivalsGroup' )
                    // InternalEsportDsl.g:781:4: 'riftRivalsGroup'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getGroupStageTypeAccess().getRiftRivalsGroupEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalEsportDsl.g:785:2: ( ( 'msiPlayIn' ) )
                    {
                    // InternalEsportDsl.g:785:2: ( ( 'msiPlayIn' ) )
                    // InternalEsportDsl.g:786:3: ( 'msiPlayIn' )
                    {
                     before(grammarAccess.getGroupStageTypeAccess().getMsiPlayInEnumLiteralDeclaration_4()); 
                    // InternalEsportDsl.g:787:3: ( 'msiPlayIn' )
                    // InternalEsportDsl.g:787:4: 'msiPlayIn'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getGroupStageTypeAccess().getMsiPlayInEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalEsportDsl.g:791:2: ( ( 'msiGroup' ) )
                    {
                    // InternalEsportDsl.g:791:2: ( ( 'msiGroup' ) )
                    // InternalEsportDsl.g:792:3: ( 'msiGroup' )
                    {
                     before(grammarAccess.getGroupStageTypeAccess().getMsiGroupEnumLiteralDeclaration_5()); 
                    // InternalEsportDsl.g:793:3: ( 'msiGroup' )
                    // InternalEsportDsl.g:793:4: 'msiGroup'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getGroupStageTypeAccess().getMsiGroupEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalEsportDsl.g:797:2: ( ( 'allStarsGroup' ) )
                    {
                    // InternalEsportDsl.g:797:2: ( ( 'allStarsGroup' ) )
                    // InternalEsportDsl.g:798:3: ( 'allStarsGroup' )
                    {
                     before(grammarAccess.getGroupStageTypeAccess().getAllStarsGroupEnumLiteralDeclaration_6()); 
                    // InternalEsportDsl.g:799:3: ( 'allStarsGroup' )
                    // InternalEsportDsl.g:799:4: 'allStarsGroup'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getGroupStageTypeAccess().getAllStarsGroupEnumLiteralDeclaration_6()); 

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
    // $ANTLR end "rule__GroupStageType__Alternatives"


    // $ANTLR start "rule__Season__Alternatives"
    // InternalEsportDsl.g:807:1: rule__Season__Alternatives : ( ( ( 'spring' ) ) | ( ( 'summer' ) ) );
    public final void rule__Season__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:811:1: ( ( ( 'spring' ) ) | ( ( 'summer' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                alt8=1;
            }
            else if ( (LA8_0==31) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalEsportDsl.g:812:2: ( ( 'spring' ) )
                    {
                    // InternalEsportDsl.g:812:2: ( ( 'spring' ) )
                    // InternalEsportDsl.g:813:3: ( 'spring' )
                    {
                     before(grammarAccess.getSeasonAccess().getSpringEnumLiteralDeclaration_0()); 
                    // InternalEsportDsl.g:814:3: ( 'spring' )
                    // InternalEsportDsl.g:814:4: 'spring'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getSeasonAccess().getSpringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEsportDsl.g:818:2: ( ( 'summer' ) )
                    {
                    // InternalEsportDsl.g:818:2: ( ( 'summer' ) )
                    // InternalEsportDsl.g:819:3: ( 'summer' )
                    {
                     before(grammarAccess.getSeasonAccess().getSummerEnumLiteralDeclaration_1()); 
                    // InternalEsportDsl.g:820:3: ( 'summer' )
                    // InternalEsportDsl.g:820:4: 'summer'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getSeasonAccess().getSummerEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Season__Alternatives"


    // $ANTLR start "rule__Position__Alternatives"
    // InternalEsportDsl.g:828:1: rule__Position__Alternatives : ( ( ( 'attackDamageCarry' ) ) | ( ( 'support' ) ) | ( ( 'midLane' ) ) | ( ( 'topLane' ) ) | ( ( 'jungle' ) ) );
    public final void rule__Position__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:832:1: ( ( ( 'attackDamageCarry' ) ) | ( ( 'support' ) ) | ( ( 'midLane' ) ) | ( ( 'topLane' ) ) | ( ( 'jungle' ) ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt9=1;
                }
                break;
            case 33:
                {
                alt9=2;
                }
                break;
            case 34:
                {
                alt9=3;
                }
                break;
            case 35:
                {
                alt9=4;
                }
                break;
            case 36:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalEsportDsl.g:833:2: ( ( 'attackDamageCarry' ) )
                    {
                    // InternalEsportDsl.g:833:2: ( ( 'attackDamageCarry' ) )
                    // InternalEsportDsl.g:834:3: ( 'attackDamageCarry' )
                    {
                     before(grammarAccess.getPositionAccess().getAttackDamageCarryEnumLiteralDeclaration_0()); 
                    // InternalEsportDsl.g:835:3: ( 'attackDamageCarry' )
                    // InternalEsportDsl.g:835:4: 'attackDamageCarry'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getPositionAccess().getAttackDamageCarryEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEsportDsl.g:839:2: ( ( 'support' ) )
                    {
                    // InternalEsportDsl.g:839:2: ( ( 'support' ) )
                    // InternalEsportDsl.g:840:3: ( 'support' )
                    {
                     before(grammarAccess.getPositionAccess().getSupportEnumLiteralDeclaration_1()); 
                    // InternalEsportDsl.g:841:3: ( 'support' )
                    // InternalEsportDsl.g:841:4: 'support'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getPositionAccess().getSupportEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEsportDsl.g:845:2: ( ( 'midLane' ) )
                    {
                    // InternalEsportDsl.g:845:2: ( ( 'midLane' ) )
                    // InternalEsportDsl.g:846:3: ( 'midLane' )
                    {
                     before(grammarAccess.getPositionAccess().getMidLaneEnumLiteralDeclaration_2()); 
                    // InternalEsportDsl.g:847:3: ( 'midLane' )
                    // InternalEsportDsl.g:847:4: 'midLane'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getPositionAccess().getMidLaneEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEsportDsl.g:851:2: ( ( 'topLane' ) )
                    {
                    // InternalEsportDsl.g:851:2: ( ( 'topLane' ) )
                    // InternalEsportDsl.g:852:3: ( 'topLane' )
                    {
                     before(grammarAccess.getPositionAccess().getTopLaneEnumLiteralDeclaration_3()); 
                    // InternalEsportDsl.g:853:3: ( 'topLane' )
                    // InternalEsportDsl.g:853:4: 'topLane'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getPositionAccess().getTopLaneEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalEsportDsl.g:857:2: ( ( 'jungle' ) )
                    {
                    // InternalEsportDsl.g:857:2: ( ( 'jungle' ) )
                    // InternalEsportDsl.g:858:3: ( 'jungle' )
                    {
                     before(grammarAccess.getPositionAccess().getJungleEnumLiteralDeclaration_4()); 
                    // InternalEsportDsl.g:859:3: ( 'jungle' )
                    // InternalEsportDsl.g:859:4: 'jungle'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getPositionAccess().getJungleEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__Position__Alternatives"


    // $ANTLR start "rule__CapacityType__Alternatives"
    // InternalEsportDsl.g:867:1: rule__CapacityType__Alternatives : ( ( ( 'positioning' ) ) | ( ( 'stressManagement' ) ) | ( ( 'playmakingMechanics' ) ) | ( ( 'escapeMechanics' ) ) | ( ( 'patience' ) ) | ( ( 'farm' ) ) | ( ( 'steal' ) ) | ( ( 'splitPush' ) ) | ( ( 'teamPlay' ) ) | ( ( 'aggressivity' ) ) | ( ( 'leadership' ) ) | ( ( 'draft' ) ) | ( ( 'pathing' ) ) | ( ( 'awareness' ) ) | ( ( 'experience' ) ) | ( ( 'objectivePlay' ) ) | ( ( 'metaGame' ) ) );
    public final void rule__CapacityType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:871:1: ( ( ( 'positioning' ) ) | ( ( 'stressManagement' ) ) | ( ( 'playmakingMechanics' ) ) | ( ( 'escapeMechanics' ) ) | ( ( 'patience' ) ) | ( ( 'farm' ) ) | ( ( 'steal' ) ) | ( ( 'splitPush' ) ) | ( ( 'teamPlay' ) ) | ( ( 'aggressivity' ) ) | ( ( 'leadership' ) ) | ( ( 'draft' ) ) | ( ( 'pathing' ) ) | ( ( 'awareness' ) ) | ( ( 'experience' ) ) | ( ( 'objectivePlay' ) ) | ( ( 'metaGame' ) ) )
            int alt10=17;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt10=1;
                }
                break;
            case 38:
                {
                alt10=2;
                }
                break;
            case 39:
                {
                alt10=3;
                }
                break;
            case 40:
                {
                alt10=4;
                }
                break;
            case 41:
                {
                alt10=5;
                }
                break;
            case 42:
                {
                alt10=6;
                }
                break;
            case 43:
                {
                alt10=7;
                }
                break;
            case 44:
                {
                alt10=8;
                }
                break;
            case 45:
                {
                alt10=9;
                }
                break;
            case 46:
                {
                alt10=10;
                }
                break;
            case 47:
                {
                alt10=11;
                }
                break;
            case 48:
                {
                alt10=12;
                }
                break;
            case 49:
                {
                alt10=13;
                }
                break;
            case 50:
                {
                alt10=14;
                }
                break;
            case 51:
                {
                alt10=15;
                }
                break;
            case 52:
                {
                alt10=16;
                }
                break;
            case 53:
                {
                alt10=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalEsportDsl.g:872:2: ( ( 'positioning' ) )
                    {
                    // InternalEsportDsl.g:872:2: ( ( 'positioning' ) )
                    // InternalEsportDsl.g:873:3: ( 'positioning' )
                    {
                     before(grammarAccess.getCapacityTypeAccess().getPositioningEnumLiteralDeclaration_0()); 
                    // InternalEsportDsl.g:874:3: ( 'positioning' )
                    // InternalEsportDsl.g:874:4: 'positioning'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getCapacityTypeAccess().getPositioningEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEsportDsl.g:878:2: ( ( 'stressManagement' ) )
                    {
                    // InternalEsportDsl.g:878:2: ( ( 'stressManagement' ) )
                    // InternalEsportDsl.g:879:3: ( 'stressManagement' )
                    {
                     before(grammarAccess.getCapacityTypeAccess().getStressManagementEnumLiteralDeclaration_1()); 
                    // InternalEsportDsl.g:880:3: ( 'stressManagement' )
                    // InternalEsportDsl.g:880:4: 'stressManagement'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getCapacityTypeAccess().getStressManagementEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEsportDsl.g:884:2: ( ( 'playmakingMechanics' ) )
                    {
                    // InternalEsportDsl.g:884:2: ( ( 'playmakingMechanics' ) )
                    // InternalEsportDsl.g:885:3: ( 'playmakingMechanics' )
                    {
                     before(grammarAccess.getCapacityTypeAccess().getPlaymakingMechanicsEnumLiteralDeclaration_2()); 
                    // InternalEsportDsl.g:886:3: ( 'playmakingMechanics' )
                    // InternalEsportDsl.g:886:4: 'playmakingMechanics'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getCapacityTypeAccess().getPlaymakingMechanicsEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEsportDsl.g:890:2: ( ( 'escapeMechanics' ) )
                    {
                    // InternalEsportDsl.g:890:2: ( ( 'escapeMechanics' ) )
                    // InternalEsportDsl.g:891:3: ( 'escapeMechanics' )
                    {
                     before(grammarAccess.getCapacityTypeAccess().getEscapeMechanicsEnumLiteralDeclaration_3()); 
                    // InternalEsportDsl.g:892:3: ( 'escapeMechanics' )
                    // InternalEsportDsl.g:892:4: 'escapeMechanics'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getCapacityTypeAccess().getEscapeMechanicsEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalEsportDsl.g:896:2: ( ( 'patience' ) )
                    {
                    // InternalEsportDsl.g:896:2: ( ( 'patience' ) )
                    // InternalEsportDsl.g:897:3: ( 'patience' )
                    {
                     before(grammarAccess.getCapacityTypeAccess().getPatienceEnumLiteralDeclaration_4()); 
                    // InternalEsportDsl.g:898:3: ( 'patience' )
                    // InternalEsportDsl.g:898:4: 'patience'
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getCapacityTypeAccess().getPatienceEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalEsportDsl.g:902:2: ( ( 'farm' ) )
                    {
                    // InternalEsportDsl.g:902:2: ( ( 'farm' ) )
                    // InternalEsportDsl.g:903:3: ( 'farm' )
                    {
                     before(grammarAccess.getCapacityTypeAccess().getFarmEnumLiteralDeclaration_5()); 
                    // InternalEsportDsl.g:904:3: ( 'farm' )
                    // InternalEsportDsl.g:904:4: 'farm'
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getCapacityTypeAccess().getFarmEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalEsportDsl.g:908:2: ( ( 'steal' ) )
                    {
                    // InternalEsportDsl.g:908:2: ( ( 'steal' ) )
                    // InternalEsportDsl.g:909:3: ( 'steal' )
                    {
                     before(grammarAccess.getCapacityTypeAccess().getStealEnumLiteralDeclaration_6()); 
                    // InternalEsportDsl.g:910:3: ( 'steal' )
                    // InternalEsportDsl.g:910:4: 'steal'
                    {
                    match(input,43,FOLLOW_2); 

                    }

                     after(grammarAccess.getCapacityTypeAccess().getStealEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalEsportDsl.g:914:2: ( ( 'splitPush' ) )
                    {
                    // InternalEsportDsl.g:914:2: ( ( 'splitPush' ) )
                    // InternalEsportDsl.g:915:3: ( 'splitPush' )
                    {
                     before(grammarAccess.getCapacityTypeAccess().getSplitPushEnumLiteralDeclaration_7()); 
                    // InternalEsportDsl.g:916:3: ( 'splitPush' )
                    // InternalEsportDsl.g:916:4: 'splitPush'
                    {
                    match(input,44,FOLLOW_2); 

                    }

                     after(grammarAccess.getCapacityTypeAccess().getSplitPushEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalEsportDsl.g:920:2: ( ( 'teamPlay' ) )
                    {
                    // InternalEsportDsl.g:920:2: ( ( 'teamPlay' ) )
                    // InternalEsportDsl.g:921:3: ( 'teamPlay' )
                    {
                     before(grammarAccess.getCapacityTypeAccess().getTeamPlayEnumLiteralDeclaration_8()); 
                    // InternalEsportDsl.g:922:3: ( 'teamPlay' )
                    // InternalEsportDsl.g:922:4: 'teamPlay'
                    {
                    match(input,45,FOLLOW_2); 

                    }

                     after(grammarAccess.getCapacityTypeAccess().getTeamPlayEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalEsportDsl.g:926:2: ( ( 'aggressivity' ) )
                    {
                    // InternalEsportDsl.g:926:2: ( ( 'aggressivity' ) )
                    // InternalEsportDsl.g:927:3: ( 'aggressivity' )
                    {
                     before(grammarAccess.getCapacityTypeAccess().getAggressivityEnumLiteralDeclaration_9()); 
                    // InternalEsportDsl.g:928:3: ( 'aggressivity' )
                    // InternalEsportDsl.g:928:4: 'aggressivity'
                    {
                    match(input,46,FOLLOW_2); 

                    }

                     after(grammarAccess.getCapacityTypeAccess().getAggressivityEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalEsportDsl.g:932:2: ( ( 'leadership' ) )
                    {
                    // InternalEsportDsl.g:932:2: ( ( 'leadership' ) )
                    // InternalEsportDsl.g:933:3: ( 'leadership' )
                    {
                     before(grammarAccess.getCapacityTypeAccess().getLeadershipEnumLiteralDeclaration_10()); 
                    // InternalEsportDsl.g:934:3: ( 'leadership' )
                    // InternalEsportDsl.g:934:4: 'leadership'
                    {
                    match(input,47,FOLLOW_2); 

                    }

                     after(grammarAccess.getCapacityTypeAccess().getLeadershipEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalEsportDsl.g:938:2: ( ( 'draft' ) )
                    {
                    // InternalEsportDsl.g:938:2: ( ( 'draft' ) )
                    // InternalEsportDsl.g:939:3: ( 'draft' )
                    {
                     before(grammarAccess.getCapacityTypeAccess().getDraftEnumLiteralDeclaration_11()); 
                    // InternalEsportDsl.g:940:3: ( 'draft' )
                    // InternalEsportDsl.g:940:4: 'draft'
                    {
                    match(input,48,FOLLOW_2); 

                    }

                     after(grammarAccess.getCapacityTypeAccess().getDraftEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalEsportDsl.g:944:2: ( ( 'pathing' ) )
                    {
                    // InternalEsportDsl.g:944:2: ( ( 'pathing' ) )
                    // InternalEsportDsl.g:945:3: ( 'pathing' )
                    {
                     before(grammarAccess.getCapacityTypeAccess().getPathingEnumLiteralDeclaration_12()); 
                    // InternalEsportDsl.g:946:3: ( 'pathing' )
                    // InternalEsportDsl.g:946:4: 'pathing'
                    {
                    match(input,49,FOLLOW_2); 

                    }

                     after(grammarAccess.getCapacityTypeAccess().getPathingEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalEsportDsl.g:950:2: ( ( 'awareness' ) )
                    {
                    // InternalEsportDsl.g:950:2: ( ( 'awareness' ) )
                    // InternalEsportDsl.g:951:3: ( 'awareness' )
                    {
                     before(grammarAccess.getCapacityTypeAccess().getAwarenessEnumLiteralDeclaration_13()); 
                    // InternalEsportDsl.g:952:3: ( 'awareness' )
                    // InternalEsportDsl.g:952:4: 'awareness'
                    {
                    match(input,50,FOLLOW_2); 

                    }

                     after(grammarAccess.getCapacityTypeAccess().getAwarenessEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalEsportDsl.g:956:2: ( ( 'experience' ) )
                    {
                    // InternalEsportDsl.g:956:2: ( ( 'experience' ) )
                    // InternalEsportDsl.g:957:3: ( 'experience' )
                    {
                     before(grammarAccess.getCapacityTypeAccess().getExperienceEnumLiteralDeclaration_14()); 
                    // InternalEsportDsl.g:958:3: ( 'experience' )
                    // InternalEsportDsl.g:958:4: 'experience'
                    {
                    match(input,51,FOLLOW_2); 

                    }

                     after(grammarAccess.getCapacityTypeAccess().getExperienceEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalEsportDsl.g:962:2: ( ( 'objectivePlay' ) )
                    {
                    // InternalEsportDsl.g:962:2: ( ( 'objectivePlay' ) )
                    // InternalEsportDsl.g:963:3: ( 'objectivePlay' )
                    {
                     before(grammarAccess.getCapacityTypeAccess().getObjectivePlayEnumLiteralDeclaration_15()); 
                    // InternalEsportDsl.g:964:3: ( 'objectivePlay' )
                    // InternalEsportDsl.g:964:4: 'objectivePlay'
                    {
                    match(input,52,FOLLOW_2); 

                    }

                     after(grammarAccess.getCapacityTypeAccess().getObjectivePlayEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalEsportDsl.g:968:2: ( ( 'metaGame' ) )
                    {
                    // InternalEsportDsl.g:968:2: ( ( 'metaGame' ) )
                    // InternalEsportDsl.g:969:3: ( 'metaGame' )
                    {
                     before(grammarAccess.getCapacityTypeAccess().getMetaGameEnumLiteralDeclaration_16()); 
                    // InternalEsportDsl.g:970:3: ( 'metaGame' )
                    // InternalEsportDsl.g:970:4: 'metaGame'
                    {
                    match(input,53,FOLLOW_2); 

                    }

                     after(grammarAccess.getCapacityTypeAccess().getMetaGameEnumLiteralDeclaration_16()); 

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
    // $ANTLR end "rule__CapacityType__Alternatives"


    // $ANTLR start "rule__Zone__Group__0"
    // InternalEsportDsl.g:978:1: rule__Zone__Group__0 : rule__Zone__Group__0__Impl rule__Zone__Group__1 ;
    public final void rule__Zone__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:982:1: ( rule__Zone__Group__0__Impl rule__Zone__Group__1 )
            // InternalEsportDsl.g:983:2: rule__Zone__Group__0__Impl rule__Zone__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Zone__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Zone__Group__1();

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
    // $ANTLR end "rule__Zone__Group__0"


    // $ANTLR start "rule__Zone__Group__0__Impl"
    // InternalEsportDsl.g:990:1: rule__Zone__Group__0__Impl : ( () ) ;
    public final void rule__Zone__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:994:1: ( ( () ) )
            // InternalEsportDsl.g:995:1: ( () )
            {
            // InternalEsportDsl.g:995:1: ( () )
            // InternalEsportDsl.g:996:2: ()
            {
             before(grammarAccess.getZoneAccess().getZoneAction_0()); 
            // InternalEsportDsl.g:997:2: ()
            // InternalEsportDsl.g:997:3: 
            {
            }

             after(grammarAccess.getZoneAccess().getZoneAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Zone__Group__0__Impl"


    // $ANTLR start "rule__Zone__Group__1"
    // InternalEsportDsl.g:1005:1: rule__Zone__Group__1 : rule__Zone__Group__1__Impl rule__Zone__Group__2 ;
    public final void rule__Zone__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1009:1: ( rule__Zone__Group__1__Impl rule__Zone__Group__2 )
            // InternalEsportDsl.g:1010:2: rule__Zone__Group__1__Impl rule__Zone__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Zone__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Zone__Group__2();

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
    // $ANTLR end "rule__Zone__Group__1"


    // $ANTLR start "rule__Zone__Group__1__Impl"
    // InternalEsportDsl.g:1017:1: rule__Zone__Group__1__Impl : ( 'Zone' ) ;
    public final void rule__Zone__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1021:1: ( ( 'Zone' ) )
            // InternalEsportDsl.g:1022:1: ( 'Zone' )
            {
            // InternalEsportDsl.g:1022:1: ( 'Zone' )
            // InternalEsportDsl.g:1023:2: 'Zone'
            {
             before(grammarAccess.getZoneAccess().getZoneKeyword_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getZoneAccess().getZoneKeyword_1()); 

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
    // $ANTLR end "rule__Zone__Group__1__Impl"


    // $ANTLR start "rule__Zone__Group__2"
    // InternalEsportDsl.g:1032:1: rule__Zone__Group__2 : rule__Zone__Group__2__Impl rule__Zone__Group__3 ;
    public final void rule__Zone__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1036:1: ( rule__Zone__Group__2__Impl rule__Zone__Group__3 )
            // InternalEsportDsl.g:1037:2: rule__Zone__Group__2__Impl rule__Zone__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Zone__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Zone__Group__3();

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
    // $ANTLR end "rule__Zone__Group__2"


    // $ANTLR start "rule__Zone__Group__2__Impl"
    // InternalEsportDsl.g:1044:1: rule__Zone__Group__2__Impl : ( ( rule__Zone__NameAssignment_2 ) ) ;
    public final void rule__Zone__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1048:1: ( ( ( rule__Zone__NameAssignment_2 ) ) )
            // InternalEsportDsl.g:1049:1: ( ( rule__Zone__NameAssignment_2 ) )
            {
            // InternalEsportDsl.g:1049:1: ( ( rule__Zone__NameAssignment_2 ) )
            // InternalEsportDsl.g:1050:2: ( rule__Zone__NameAssignment_2 )
            {
             before(grammarAccess.getZoneAccess().getNameAssignment_2()); 
            // InternalEsportDsl.g:1051:2: ( rule__Zone__NameAssignment_2 )
            // InternalEsportDsl.g:1051:3: rule__Zone__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Zone__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getZoneAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Zone__Group__2__Impl"


    // $ANTLR start "rule__Zone__Group__3"
    // InternalEsportDsl.g:1059:1: rule__Zone__Group__3 : rule__Zone__Group__3__Impl rule__Zone__Group__4 ;
    public final void rule__Zone__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1063:1: ( rule__Zone__Group__3__Impl rule__Zone__Group__4 )
            // InternalEsportDsl.g:1064:2: rule__Zone__Group__3__Impl rule__Zone__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Zone__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Zone__Group__4();

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
    // $ANTLR end "rule__Zone__Group__3"


    // $ANTLR start "rule__Zone__Group__3__Impl"
    // InternalEsportDsl.g:1071:1: rule__Zone__Group__3__Impl : ( ':' ) ;
    public final void rule__Zone__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1075:1: ( ( ':' ) )
            // InternalEsportDsl.g:1076:1: ( ':' )
            {
            // InternalEsportDsl.g:1076:1: ( ':' )
            // InternalEsportDsl.g:1077:2: ':'
            {
             before(grammarAccess.getZoneAccess().getColonKeyword_3()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getZoneAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__Zone__Group__3__Impl"


    // $ANTLR start "rule__Zone__Group__4"
    // InternalEsportDsl.g:1086:1: rule__Zone__Group__4 : rule__Zone__Group__4__Impl rule__Zone__Group__5 ;
    public final void rule__Zone__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1090:1: ( rule__Zone__Group__4__Impl rule__Zone__Group__5 )
            // InternalEsportDsl.g:1091:2: rule__Zone__Group__4__Impl rule__Zone__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Zone__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Zone__Group__5();

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
    // $ANTLR end "rule__Zone__Group__4"


    // $ANTLR start "rule__Zone__Group__4__Impl"
    // InternalEsportDsl.g:1098:1: rule__Zone__Group__4__Impl : ( '(' ) ;
    public final void rule__Zone__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1102:1: ( ( '(' ) )
            // InternalEsportDsl.g:1103:1: ( '(' )
            {
            // InternalEsportDsl.g:1103:1: ( '(' )
            // InternalEsportDsl.g:1104:2: '('
            {
             before(grammarAccess.getZoneAccess().getLeftParenthesisKeyword_4()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getZoneAccess().getLeftParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Zone__Group__4__Impl"


    // $ANTLR start "rule__Zone__Group__5"
    // InternalEsportDsl.g:1113:1: rule__Zone__Group__5 : rule__Zone__Group__5__Impl rule__Zone__Group__6 ;
    public final void rule__Zone__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1117:1: ( rule__Zone__Group__5__Impl rule__Zone__Group__6 )
            // InternalEsportDsl.g:1118:2: rule__Zone__Group__5__Impl rule__Zone__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Zone__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Zone__Group__6();

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
    // $ANTLR end "rule__Zone__Group__5"


    // $ANTLR start "rule__Zone__Group__5__Impl"
    // InternalEsportDsl.g:1125:1: rule__Zone__Group__5__Impl : ( ( rule__Zone__CountriesAssignment_5 ) ) ;
    public final void rule__Zone__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1129:1: ( ( ( rule__Zone__CountriesAssignment_5 ) ) )
            // InternalEsportDsl.g:1130:1: ( ( rule__Zone__CountriesAssignment_5 ) )
            {
            // InternalEsportDsl.g:1130:1: ( ( rule__Zone__CountriesAssignment_5 ) )
            // InternalEsportDsl.g:1131:2: ( rule__Zone__CountriesAssignment_5 )
            {
             before(grammarAccess.getZoneAccess().getCountriesAssignment_5()); 
            // InternalEsportDsl.g:1132:2: ( rule__Zone__CountriesAssignment_5 )
            // InternalEsportDsl.g:1132:3: rule__Zone__CountriesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Zone__CountriesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getZoneAccess().getCountriesAssignment_5()); 

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
    // $ANTLR end "rule__Zone__Group__5__Impl"


    // $ANTLR start "rule__Zone__Group__6"
    // InternalEsportDsl.g:1140:1: rule__Zone__Group__6 : rule__Zone__Group__6__Impl rule__Zone__Group__7 ;
    public final void rule__Zone__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1144:1: ( rule__Zone__Group__6__Impl rule__Zone__Group__7 )
            // InternalEsportDsl.g:1145:2: rule__Zone__Group__6__Impl rule__Zone__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Zone__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Zone__Group__7();

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
    // $ANTLR end "rule__Zone__Group__6"


    // $ANTLR start "rule__Zone__Group__6__Impl"
    // InternalEsportDsl.g:1152:1: rule__Zone__Group__6__Impl : ( ( rule__Zone__Group_6__0 )* ) ;
    public final void rule__Zone__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1156:1: ( ( ( rule__Zone__Group_6__0 )* ) )
            // InternalEsportDsl.g:1157:1: ( ( rule__Zone__Group_6__0 )* )
            {
            // InternalEsportDsl.g:1157:1: ( ( rule__Zone__Group_6__0 )* )
            // InternalEsportDsl.g:1158:2: ( rule__Zone__Group_6__0 )*
            {
             before(grammarAccess.getZoneAccess().getGroup_6()); 
            // InternalEsportDsl.g:1159:2: ( rule__Zone__Group_6__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==58) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalEsportDsl.g:1159:3: rule__Zone__Group_6__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Zone__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getZoneAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Zone__Group__6__Impl"


    // $ANTLR start "rule__Zone__Group__7"
    // InternalEsportDsl.g:1167:1: rule__Zone__Group__7 : rule__Zone__Group__7__Impl rule__Zone__Group__8 ;
    public final void rule__Zone__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1171:1: ( rule__Zone__Group__7__Impl rule__Zone__Group__8 )
            // InternalEsportDsl.g:1172:2: rule__Zone__Group__7__Impl rule__Zone__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__Zone__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Zone__Group__8();

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
    // $ANTLR end "rule__Zone__Group__7"


    // $ANTLR start "rule__Zone__Group__7__Impl"
    // InternalEsportDsl.g:1179:1: rule__Zone__Group__7__Impl : ( ')' ) ;
    public final void rule__Zone__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1183:1: ( ( ')' ) )
            // InternalEsportDsl.g:1184:1: ( ')' )
            {
            // InternalEsportDsl.g:1184:1: ( ')' )
            // InternalEsportDsl.g:1185:2: ')'
            {
             before(grammarAccess.getZoneAccess().getRightParenthesisKeyword_7()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getZoneAccess().getRightParenthesisKeyword_7()); 

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
    // $ANTLR end "rule__Zone__Group__7__Impl"


    // $ANTLR start "rule__Zone__Group__8"
    // InternalEsportDsl.g:1194:1: rule__Zone__Group__8 : rule__Zone__Group__8__Impl ;
    public final void rule__Zone__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1198:1: ( rule__Zone__Group__8__Impl )
            // InternalEsportDsl.g:1199:2: rule__Zone__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Zone__Group__8__Impl();

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
    // $ANTLR end "rule__Zone__Group__8"


    // $ANTLR start "rule__Zone__Group__8__Impl"
    // InternalEsportDsl.g:1205:1: rule__Zone__Group__8__Impl : ( ( rule__Zone__Group_8__0 )? ) ;
    public final void rule__Zone__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1209:1: ( ( ( rule__Zone__Group_8__0 )? ) )
            // InternalEsportDsl.g:1210:1: ( ( rule__Zone__Group_8__0 )? )
            {
            // InternalEsportDsl.g:1210:1: ( ( rule__Zone__Group_8__0 )? )
            // InternalEsportDsl.g:1211:2: ( rule__Zone__Group_8__0 )?
            {
             before(grammarAccess.getZoneAccess().getGroup_8()); 
            // InternalEsportDsl.g:1212:2: ( rule__Zone__Group_8__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==56) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalEsportDsl.g:1212:3: rule__Zone__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Zone__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getZoneAccess().getGroup_8()); 

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
    // $ANTLR end "rule__Zone__Group__8__Impl"


    // $ANTLR start "rule__Zone__Group_6__0"
    // InternalEsportDsl.g:1221:1: rule__Zone__Group_6__0 : rule__Zone__Group_6__0__Impl rule__Zone__Group_6__1 ;
    public final void rule__Zone__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1225:1: ( rule__Zone__Group_6__0__Impl rule__Zone__Group_6__1 )
            // InternalEsportDsl.g:1226:2: rule__Zone__Group_6__0__Impl rule__Zone__Group_6__1
            {
            pushFollow(FOLLOW_8);
            rule__Zone__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Zone__Group_6__1();

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
    // $ANTLR end "rule__Zone__Group_6__0"


    // $ANTLR start "rule__Zone__Group_6__0__Impl"
    // InternalEsportDsl.g:1233:1: rule__Zone__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Zone__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1237:1: ( ( ',' ) )
            // InternalEsportDsl.g:1238:1: ( ',' )
            {
            // InternalEsportDsl.g:1238:1: ( ',' )
            // InternalEsportDsl.g:1239:2: ','
            {
             before(grammarAccess.getZoneAccess().getCommaKeyword_6_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getZoneAccess().getCommaKeyword_6_0()); 

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
    // $ANTLR end "rule__Zone__Group_6__0__Impl"


    // $ANTLR start "rule__Zone__Group_6__1"
    // InternalEsportDsl.g:1248:1: rule__Zone__Group_6__1 : rule__Zone__Group_6__1__Impl ;
    public final void rule__Zone__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1252:1: ( rule__Zone__Group_6__1__Impl )
            // InternalEsportDsl.g:1253:2: rule__Zone__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Zone__Group_6__1__Impl();

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
    // $ANTLR end "rule__Zone__Group_6__1"


    // $ANTLR start "rule__Zone__Group_6__1__Impl"
    // InternalEsportDsl.g:1259:1: rule__Zone__Group_6__1__Impl : ( ( rule__Zone__CountriesAssignment_6_1 ) ) ;
    public final void rule__Zone__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1263:1: ( ( ( rule__Zone__CountriesAssignment_6_1 ) ) )
            // InternalEsportDsl.g:1264:1: ( ( rule__Zone__CountriesAssignment_6_1 ) )
            {
            // InternalEsportDsl.g:1264:1: ( ( rule__Zone__CountriesAssignment_6_1 ) )
            // InternalEsportDsl.g:1265:2: ( rule__Zone__CountriesAssignment_6_1 )
            {
             before(grammarAccess.getZoneAccess().getCountriesAssignment_6_1()); 
            // InternalEsportDsl.g:1266:2: ( rule__Zone__CountriesAssignment_6_1 )
            // InternalEsportDsl.g:1266:3: rule__Zone__CountriesAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Zone__CountriesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getZoneAccess().getCountriesAssignment_6_1()); 

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
    // $ANTLR end "rule__Zone__Group_6__1__Impl"


    // $ANTLR start "rule__Zone__Group_8__0"
    // InternalEsportDsl.g:1275:1: rule__Zone__Group_8__0 : rule__Zone__Group_8__0__Impl rule__Zone__Group_8__1 ;
    public final void rule__Zone__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1279:1: ( rule__Zone__Group_8__0__Impl rule__Zone__Group_8__1 )
            // InternalEsportDsl.g:1280:2: rule__Zone__Group_8__0__Impl rule__Zone__Group_8__1
            {
            pushFollow(FOLLOW_11);
            rule__Zone__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Zone__Group_8__1();

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
    // $ANTLR end "rule__Zone__Group_8__0"


    // $ANTLR start "rule__Zone__Group_8__0__Impl"
    // InternalEsportDsl.g:1287:1: rule__Zone__Group_8__0__Impl : ( '(' ) ;
    public final void rule__Zone__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1291:1: ( ( '(' ) )
            // InternalEsportDsl.g:1292:1: ( '(' )
            {
            // InternalEsportDsl.g:1292:1: ( '(' )
            // InternalEsportDsl.g:1293:2: '('
            {
             before(grammarAccess.getZoneAccess().getLeftParenthesisKeyword_8_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getZoneAccess().getLeftParenthesisKeyword_8_0()); 

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
    // $ANTLR end "rule__Zone__Group_8__0__Impl"


    // $ANTLR start "rule__Zone__Group_8__1"
    // InternalEsportDsl.g:1302:1: rule__Zone__Group_8__1 : rule__Zone__Group_8__1__Impl rule__Zone__Group_8__2 ;
    public final void rule__Zone__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1306:1: ( rule__Zone__Group_8__1__Impl rule__Zone__Group_8__2 )
            // InternalEsportDsl.g:1307:2: rule__Zone__Group_8__1__Impl rule__Zone__Group_8__2
            {
            pushFollow(FOLLOW_9);
            rule__Zone__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Zone__Group_8__2();

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
    // $ANTLR end "rule__Zone__Group_8__1"


    // $ANTLR start "rule__Zone__Group_8__1__Impl"
    // InternalEsportDsl.g:1314:1: rule__Zone__Group_8__1__Impl : ( ( rule__Zone__TeamsAssignment_8_1 ) ) ;
    public final void rule__Zone__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1318:1: ( ( ( rule__Zone__TeamsAssignment_8_1 ) ) )
            // InternalEsportDsl.g:1319:1: ( ( rule__Zone__TeamsAssignment_8_1 ) )
            {
            // InternalEsportDsl.g:1319:1: ( ( rule__Zone__TeamsAssignment_8_1 ) )
            // InternalEsportDsl.g:1320:2: ( rule__Zone__TeamsAssignment_8_1 )
            {
             before(grammarAccess.getZoneAccess().getTeamsAssignment_8_1()); 
            // InternalEsportDsl.g:1321:2: ( rule__Zone__TeamsAssignment_8_1 )
            // InternalEsportDsl.g:1321:3: rule__Zone__TeamsAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Zone__TeamsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getZoneAccess().getTeamsAssignment_8_1()); 

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
    // $ANTLR end "rule__Zone__Group_8__1__Impl"


    // $ANTLR start "rule__Zone__Group_8__2"
    // InternalEsportDsl.g:1329:1: rule__Zone__Group_8__2 : rule__Zone__Group_8__2__Impl rule__Zone__Group_8__3 ;
    public final void rule__Zone__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1333:1: ( rule__Zone__Group_8__2__Impl rule__Zone__Group_8__3 )
            // InternalEsportDsl.g:1334:2: rule__Zone__Group_8__2__Impl rule__Zone__Group_8__3
            {
            pushFollow(FOLLOW_9);
            rule__Zone__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Zone__Group_8__3();

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
    // $ANTLR end "rule__Zone__Group_8__2"


    // $ANTLR start "rule__Zone__Group_8__2__Impl"
    // InternalEsportDsl.g:1341:1: rule__Zone__Group_8__2__Impl : ( ( rule__Zone__Group_8_2__0 )* ) ;
    public final void rule__Zone__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1345:1: ( ( ( rule__Zone__Group_8_2__0 )* ) )
            // InternalEsportDsl.g:1346:1: ( ( rule__Zone__Group_8_2__0 )* )
            {
            // InternalEsportDsl.g:1346:1: ( ( rule__Zone__Group_8_2__0 )* )
            // InternalEsportDsl.g:1347:2: ( rule__Zone__Group_8_2__0 )*
            {
             before(grammarAccess.getZoneAccess().getGroup_8_2()); 
            // InternalEsportDsl.g:1348:2: ( rule__Zone__Group_8_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==58) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalEsportDsl.g:1348:3: rule__Zone__Group_8_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Zone__Group_8_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getZoneAccess().getGroup_8_2()); 

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
    // $ANTLR end "rule__Zone__Group_8__2__Impl"


    // $ANTLR start "rule__Zone__Group_8__3"
    // InternalEsportDsl.g:1356:1: rule__Zone__Group_8__3 : rule__Zone__Group_8__3__Impl ;
    public final void rule__Zone__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1360:1: ( rule__Zone__Group_8__3__Impl )
            // InternalEsportDsl.g:1361:2: rule__Zone__Group_8__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Zone__Group_8__3__Impl();

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
    // $ANTLR end "rule__Zone__Group_8__3"


    // $ANTLR start "rule__Zone__Group_8__3__Impl"
    // InternalEsportDsl.g:1367:1: rule__Zone__Group_8__3__Impl : ( ')' ) ;
    public final void rule__Zone__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1371:1: ( ( ')' ) )
            // InternalEsportDsl.g:1372:1: ( ')' )
            {
            // InternalEsportDsl.g:1372:1: ( ')' )
            // InternalEsportDsl.g:1373:2: ')'
            {
             before(grammarAccess.getZoneAccess().getRightParenthesisKeyword_8_3()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getZoneAccess().getRightParenthesisKeyword_8_3()); 

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
    // $ANTLR end "rule__Zone__Group_8__3__Impl"


    // $ANTLR start "rule__Zone__Group_8_2__0"
    // InternalEsportDsl.g:1383:1: rule__Zone__Group_8_2__0 : rule__Zone__Group_8_2__0__Impl rule__Zone__Group_8_2__1 ;
    public final void rule__Zone__Group_8_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1387:1: ( rule__Zone__Group_8_2__0__Impl rule__Zone__Group_8_2__1 )
            // InternalEsportDsl.g:1388:2: rule__Zone__Group_8_2__0__Impl rule__Zone__Group_8_2__1
            {
            pushFollow(FOLLOW_11);
            rule__Zone__Group_8_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Zone__Group_8_2__1();

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
    // $ANTLR end "rule__Zone__Group_8_2__0"


    // $ANTLR start "rule__Zone__Group_8_2__0__Impl"
    // InternalEsportDsl.g:1395:1: rule__Zone__Group_8_2__0__Impl : ( ',' ) ;
    public final void rule__Zone__Group_8_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1399:1: ( ( ',' ) )
            // InternalEsportDsl.g:1400:1: ( ',' )
            {
            // InternalEsportDsl.g:1400:1: ( ',' )
            // InternalEsportDsl.g:1401:2: ','
            {
             before(grammarAccess.getZoneAccess().getCommaKeyword_8_2_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getZoneAccess().getCommaKeyword_8_2_0()); 

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
    // $ANTLR end "rule__Zone__Group_8_2__0__Impl"


    // $ANTLR start "rule__Zone__Group_8_2__1"
    // InternalEsportDsl.g:1410:1: rule__Zone__Group_8_2__1 : rule__Zone__Group_8_2__1__Impl ;
    public final void rule__Zone__Group_8_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1414:1: ( rule__Zone__Group_8_2__1__Impl )
            // InternalEsportDsl.g:1415:2: rule__Zone__Group_8_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Zone__Group_8_2__1__Impl();

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
    // $ANTLR end "rule__Zone__Group_8_2__1"


    // $ANTLR start "rule__Zone__Group_8_2__1__Impl"
    // InternalEsportDsl.g:1421:1: rule__Zone__Group_8_2__1__Impl : ( ( rule__Zone__TeamsAssignment_8_2_1 ) ) ;
    public final void rule__Zone__Group_8_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1425:1: ( ( ( rule__Zone__TeamsAssignment_8_2_1 ) ) )
            // InternalEsportDsl.g:1426:1: ( ( rule__Zone__TeamsAssignment_8_2_1 ) )
            {
            // InternalEsportDsl.g:1426:1: ( ( rule__Zone__TeamsAssignment_8_2_1 ) )
            // InternalEsportDsl.g:1427:2: ( rule__Zone__TeamsAssignment_8_2_1 )
            {
             before(grammarAccess.getZoneAccess().getTeamsAssignment_8_2_1()); 
            // InternalEsportDsl.g:1428:2: ( rule__Zone__TeamsAssignment_8_2_1 )
            // InternalEsportDsl.g:1428:3: rule__Zone__TeamsAssignment_8_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Zone__TeamsAssignment_8_2_1();

            state._fsp--;


            }

             after(grammarAccess.getZoneAccess().getTeamsAssignment_8_2_1()); 

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
    // $ANTLR end "rule__Zone__Group_8_2__1__Impl"


    // $ANTLR start "rule__Tournament__Group__0"
    // InternalEsportDsl.g:1437:1: rule__Tournament__Group__0 : rule__Tournament__Group__0__Impl rule__Tournament__Group__1 ;
    public final void rule__Tournament__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1441:1: ( rule__Tournament__Group__0__Impl rule__Tournament__Group__1 )
            // InternalEsportDsl.g:1442:2: rule__Tournament__Group__0__Impl rule__Tournament__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Tournament__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group__1();

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
    // $ANTLR end "rule__Tournament__Group__0"


    // $ANTLR start "rule__Tournament__Group__0__Impl"
    // InternalEsportDsl.g:1449:1: rule__Tournament__Group__0__Impl : ( () ) ;
    public final void rule__Tournament__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1453:1: ( ( () ) )
            // InternalEsportDsl.g:1454:1: ( () )
            {
            // InternalEsportDsl.g:1454:1: ( () )
            // InternalEsportDsl.g:1455:2: ()
            {
             before(grammarAccess.getTournamentAccess().getTournamentAction_0()); 
            // InternalEsportDsl.g:1456:2: ()
            // InternalEsportDsl.g:1456:3: 
            {
            }

             after(grammarAccess.getTournamentAccess().getTournamentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group__0__Impl"


    // $ANTLR start "rule__Tournament__Group__1"
    // InternalEsportDsl.g:1464:1: rule__Tournament__Group__1 : rule__Tournament__Group__1__Impl rule__Tournament__Group__2 ;
    public final void rule__Tournament__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1468:1: ( rule__Tournament__Group__1__Impl rule__Tournament__Group__2 )
            // InternalEsportDsl.g:1469:2: rule__Tournament__Group__1__Impl rule__Tournament__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Tournament__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group__2();

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
    // $ANTLR end "rule__Tournament__Group__1"


    // $ANTLR start "rule__Tournament__Group__1__Impl"
    // InternalEsportDsl.g:1476:1: rule__Tournament__Group__1__Impl : ( 'Tournament' ) ;
    public final void rule__Tournament__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1480:1: ( ( 'Tournament' ) )
            // InternalEsportDsl.g:1481:1: ( 'Tournament' )
            {
            // InternalEsportDsl.g:1481:1: ( 'Tournament' )
            // InternalEsportDsl.g:1482:2: 'Tournament'
            {
             before(grammarAccess.getTournamentAccess().getTournamentKeyword_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getTournamentAccess().getTournamentKeyword_1()); 

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
    // $ANTLR end "rule__Tournament__Group__1__Impl"


    // $ANTLR start "rule__Tournament__Group__2"
    // InternalEsportDsl.g:1491:1: rule__Tournament__Group__2 : rule__Tournament__Group__2__Impl rule__Tournament__Group__3 ;
    public final void rule__Tournament__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1495:1: ( rule__Tournament__Group__2__Impl rule__Tournament__Group__3 )
            // InternalEsportDsl.g:1496:2: rule__Tournament__Group__2__Impl rule__Tournament__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Tournament__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group__3();

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
    // $ANTLR end "rule__Tournament__Group__2"


    // $ANTLR start "rule__Tournament__Group__2__Impl"
    // InternalEsportDsl.g:1503:1: rule__Tournament__Group__2__Impl : ( ( rule__Tournament__NameAssignment_2 ) ) ;
    public final void rule__Tournament__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1507:1: ( ( ( rule__Tournament__NameAssignment_2 ) ) )
            // InternalEsportDsl.g:1508:1: ( ( rule__Tournament__NameAssignment_2 ) )
            {
            // InternalEsportDsl.g:1508:1: ( ( rule__Tournament__NameAssignment_2 ) )
            // InternalEsportDsl.g:1509:2: ( rule__Tournament__NameAssignment_2 )
            {
             before(grammarAccess.getTournamentAccess().getNameAssignment_2()); 
            // InternalEsportDsl.g:1510:2: ( rule__Tournament__NameAssignment_2 )
            // InternalEsportDsl.g:1510:3: rule__Tournament__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Tournament__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTournamentAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Tournament__Group__2__Impl"


    // $ANTLR start "rule__Tournament__Group__3"
    // InternalEsportDsl.g:1518:1: rule__Tournament__Group__3 : rule__Tournament__Group__3__Impl rule__Tournament__Group__4 ;
    public final void rule__Tournament__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1522:1: ( rule__Tournament__Group__3__Impl rule__Tournament__Group__4 )
            // InternalEsportDsl.g:1523:2: rule__Tournament__Group__3__Impl rule__Tournament__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Tournament__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group__4();

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
    // $ANTLR end "rule__Tournament__Group__3"


    // $ANTLR start "rule__Tournament__Group__3__Impl"
    // InternalEsportDsl.g:1530:1: rule__Tournament__Group__3__Impl : ( ':' ) ;
    public final void rule__Tournament__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1534:1: ( ( ':' ) )
            // InternalEsportDsl.g:1535:1: ( ':' )
            {
            // InternalEsportDsl.g:1535:1: ( ':' )
            // InternalEsportDsl.g:1536:2: ':'
            {
             before(grammarAccess.getTournamentAccess().getColonKeyword_3()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getTournamentAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__Tournament__Group__3__Impl"


    // $ANTLR start "rule__Tournament__Group__4"
    // InternalEsportDsl.g:1545:1: rule__Tournament__Group__4 : rule__Tournament__Group__4__Impl rule__Tournament__Group__5 ;
    public final void rule__Tournament__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1549:1: ( rule__Tournament__Group__4__Impl rule__Tournament__Group__5 )
            // InternalEsportDsl.g:1550:2: rule__Tournament__Group__4__Impl rule__Tournament__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Tournament__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group__5();

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
    // $ANTLR end "rule__Tournament__Group__4"


    // $ANTLR start "rule__Tournament__Group__4__Impl"
    // InternalEsportDsl.g:1557:1: rule__Tournament__Group__4__Impl : ( ( rule__Tournament__SizeAssignment_4 ) ) ;
    public final void rule__Tournament__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1561:1: ( ( ( rule__Tournament__SizeAssignment_4 ) ) )
            // InternalEsportDsl.g:1562:1: ( ( rule__Tournament__SizeAssignment_4 ) )
            {
            // InternalEsportDsl.g:1562:1: ( ( rule__Tournament__SizeAssignment_4 ) )
            // InternalEsportDsl.g:1563:2: ( rule__Tournament__SizeAssignment_4 )
            {
             before(grammarAccess.getTournamentAccess().getSizeAssignment_4()); 
            // InternalEsportDsl.g:1564:2: ( rule__Tournament__SizeAssignment_4 )
            // InternalEsportDsl.g:1564:3: rule__Tournament__SizeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Tournament__SizeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTournamentAccess().getSizeAssignment_4()); 

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
    // $ANTLR end "rule__Tournament__Group__4__Impl"


    // $ANTLR start "rule__Tournament__Group__5"
    // InternalEsportDsl.g:1572:1: rule__Tournament__Group__5 : rule__Tournament__Group__5__Impl rule__Tournament__Group__6 ;
    public final void rule__Tournament__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1576:1: ( rule__Tournament__Group__5__Impl rule__Tournament__Group__6 )
            // InternalEsportDsl.g:1577:2: rule__Tournament__Group__5__Impl rule__Tournament__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Tournament__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group__6();

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
    // $ANTLR end "rule__Tournament__Group__5"


    // $ANTLR start "rule__Tournament__Group__5__Impl"
    // InternalEsportDsl.g:1584:1: rule__Tournament__Group__5__Impl : ( ( rule__Tournament__TypeAssignment_5 ) ) ;
    public final void rule__Tournament__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1588:1: ( ( ( rule__Tournament__TypeAssignment_5 ) ) )
            // InternalEsportDsl.g:1589:1: ( ( rule__Tournament__TypeAssignment_5 ) )
            {
            // InternalEsportDsl.g:1589:1: ( ( rule__Tournament__TypeAssignment_5 ) )
            // InternalEsportDsl.g:1590:2: ( rule__Tournament__TypeAssignment_5 )
            {
             before(grammarAccess.getTournamentAccess().getTypeAssignment_5()); 
            // InternalEsportDsl.g:1591:2: ( rule__Tournament__TypeAssignment_5 )
            // InternalEsportDsl.g:1591:3: rule__Tournament__TypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Tournament__TypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTournamentAccess().getTypeAssignment_5()); 

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
    // $ANTLR end "rule__Tournament__Group__5__Impl"


    // $ANTLR start "rule__Tournament__Group__6"
    // InternalEsportDsl.g:1599:1: rule__Tournament__Group__6 : rule__Tournament__Group__6__Impl rule__Tournament__Group__7 ;
    public final void rule__Tournament__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1603:1: ( rule__Tournament__Group__6__Impl rule__Tournament__Group__7 )
            // InternalEsportDsl.g:1604:2: rule__Tournament__Group__6__Impl rule__Tournament__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Tournament__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group__7();

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
    // $ANTLR end "rule__Tournament__Group__6"


    // $ANTLR start "rule__Tournament__Group__6__Impl"
    // InternalEsportDsl.g:1611:1: rule__Tournament__Group__6__Impl : ( ( rule__Tournament__YearAssignment_6 ) ) ;
    public final void rule__Tournament__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1615:1: ( ( ( rule__Tournament__YearAssignment_6 ) ) )
            // InternalEsportDsl.g:1616:1: ( ( rule__Tournament__YearAssignment_6 ) )
            {
            // InternalEsportDsl.g:1616:1: ( ( rule__Tournament__YearAssignment_6 ) )
            // InternalEsportDsl.g:1617:2: ( rule__Tournament__YearAssignment_6 )
            {
             before(grammarAccess.getTournamentAccess().getYearAssignment_6()); 
            // InternalEsportDsl.g:1618:2: ( rule__Tournament__YearAssignment_6 )
            // InternalEsportDsl.g:1618:3: rule__Tournament__YearAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Tournament__YearAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTournamentAccess().getYearAssignment_6()); 

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
    // $ANTLR end "rule__Tournament__Group__6__Impl"


    // $ANTLR start "rule__Tournament__Group__7"
    // InternalEsportDsl.g:1626:1: rule__Tournament__Group__7 : rule__Tournament__Group__7__Impl rule__Tournament__Group__8 ;
    public final void rule__Tournament__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1630:1: ( rule__Tournament__Group__7__Impl rule__Tournament__Group__8 )
            // InternalEsportDsl.g:1631:2: rule__Tournament__Group__7__Impl rule__Tournament__Group__8
            {
            pushFollow(FOLLOW_5);
            rule__Tournament__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group__8();

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
    // $ANTLR end "rule__Tournament__Group__7"


    // $ANTLR start "rule__Tournament__Group__7__Impl"
    // InternalEsportDsl.g:1638:1: rule__Tournament__Group__7__Impl : ( '(' ) ;
    public final void rule__Tournament__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1642:1: ( ( '(' ) )
            // InternalEsportDsl.g:1643:1: ( '(' )
            {
            // InternalEsportDsl.g:1643:1: ( '(' )
            // InternalEsportDsl.g:1644:2: '('
            {
             before(grammarAccess.getTournamentAccess().getLeftParenthesisKeyword_7()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getTournamentAccess().getLeftParenthesisKeyword_7()); 

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
    // $ANTLR end "rule__Tournament__Group__7__Impl"


    // $ANTLR start "rule__Tournament__Group__8"
    // InternalEsportDsl.g:1653:1: rule__Tournament__Group__8 : rule__Tournament__Group__8__Impl rule__Tournament__Group__9 ;
    public final void rule__Tournament__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1657:1: ( rule__Tournament__Group__8__Impl rule__Tournament__Group__9 )
            // InternalEsportDsl.g:1658:2: rule__Tournament__Group__8__Impl rule__Tournament__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__Tournament__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group__9();

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
    // $ANTLR end "rule__Tournament__Group__8"


    // $ANTLR start "rule__Tournament__Group__8__Impl"
    // InternalEsportDsl.g:1665:1: rule__Tournament__Group__8__Impl : ( ( rule__Tournament__AllowedZonesAssignment_8 ) ) ;
    public final void rule__Tournament__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1669:1: ( ( ( rule__Tournament__AllowedZonesAssignment_8 ) ) )
            // InternalEsportDsl.g:1670:1: ( ( rule__Tournament__AllowedZonesAssignment_8 ) )
            {
            // InternalEsportDsl.g:1670:1: ( ( rule__Tournament__AllowedZonesAssignment_8 ) )
            // InternalEsportDsl.g:1671:2: ( rule__Tournament__AllowedZonesAssignment_8 )
            {
             before(grammarAccess.getTournamentAccess().getAllowedZonesAssignment_8()); 
            // InternalEsportDsl.g:1672:2: ( rule__Tournament__AllowedZonesAssignment_8 )
            // InternalEsportDsl.g:1672:3: rule__Tournament__AllowedZonesAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Tournament__AllowedZonesAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getTournamentAccess().getAllowedZonesAssignment_8()); 

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
    // $ANTLR end "rule__Tournament__Group__8__Impl"


    // $ANTLR start "rule__Tournament__Group__9"
    // InternalEsportDsl.g:1680:1: rule__Tournament__Group__9 : rule__Tournament__Group__9__Impl rule__Tournament__Group__10 ;
    public final void rule__Tournament__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1684:1: ( rule__Tournament__Group__9__Impl rule__Tournament__Group__10 )
            // InternalEsportDsl.g:1685:2: rule__Tournament__Group__9__Impl rule__Tournament__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__Tournament__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group__10();

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
    // $ANTLR end "rule__Tournament__Group__9"


    // $ANTLR start "rule__Tournament__Group__9__Impl"
    // InternalEsportDsl.g:1692:1: rule__Tournament__Group__9__Impl : ( ( rule__Tournament__Group_9__0 )* ) ;
    public final void rule__Tournament__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1696:1: ( ( ( rule__Tournament__Group_9__0 )* ) )
            // InternalEsportDsl.g:1697:1: ( ( rule__Tournament__Group_9__0 )* )
            {
            // InternalEsportDsl.g:1697:1: ( ( rule__Tournament__Group_9__0 )* )
            // InternalEsportDsl.g:1698:2: ( rule__Tournament__Group_9__0 )*
            {
             before(grammarAccess.getTournamentAccess().getGroup_9()); 
            // InternalEsportDsl.g:1699:2: ( rule__Tournament__Group_9__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==58) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalEsportDsl.g:1699:3: rule__Tournament__Group_9__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Tournament__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getTournamentAccess().getGroup_9()); 

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
    // $ANTLR end "rule__Tournament__Group__9__Impl"


    // $ANTLR start "rule__Tournament__Group__10"
    // InternalEsportDsl.g:1707:1: rule__Tournament__Group__10 : rule__Tournament__Group__10__Impl rule__Tournament__Group__11 ;
    public final void rule__Tournament__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1711:1: ( rule__Tournament__Group__10__Impl rule__Tournament__Group__11 )
            // InternalEsportDsl.g:1712:2: rule__Tournament__Group__10__Impl rule__Tournament__Group__11
            {
            pushFollow(FOLLOW_15);
            rule__Tournament__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group__11();

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
    // $ANTLR end "rule__Tournament__Group__10"


    // $ANTLR start "rule__Tournament__Group__10__Impl"
    // InternalEsportDsl.g:1719:1: rule__Tournament__Group__10__Impl : ( ')' ) ;
    public final void rule__Tournament__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1723:1: ( ( ')' ) )
            // InternalEsportDsl.g:1724:1: ( ')' )
            {
            // InternalEsportDsl.g:1724:1: ( ')' )
            // InternalEsportDsl.g:1725:2: ')'
            {
             before(grammarAccess.getTournamentAccess().getRightParenthesisKeyword_10()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getTournamentAccess().getRightParenthesisKeyword_10()); 

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
    // $ANTLR end "rule__Tournament__Group__10__Impl"


    // $ANTLR start "rule__Tournament__Group__11"
    // InternalEsportDsl.g:1734:1: rule__Tournament__Group__11 : rule__Tournament__Group__11__Impl rule__Tournament__Group__12 ;
    public final void rule__Tournament__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1738:1: ( rule__Tournament__Group__11__Impl rule__Tournament__Group__12 )
            // InternalEsportDsl.g:1739:2: rule__Tournament__Group__11__Impl rule__Tournament__Group__12
            {
            pushFollow(FOLLOW_15);
            rule__Tournament__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group__12();

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
    // $ANTLR end "rule__Tournament__Group__11"


    // $ANTLR start "rule__Tournament__Group__11__Impl"
    // InternalEsportDsl.g:1746:1: rule__Tournament__Group__11__Impl : ( ( rule__Tournament__Group_11__0 )? ) ;
    public final void rule__Tournament__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1750:1: ( ( ( rule__Tournament__Group_11__0 )? ) )
            // InternalEsportDsl.g:1751:1: ( ( rule__Tournament__Group_11__0 )? )
            {
            // InternalEsportDsl.g:1751:1: ( ( rule__Tournament__Group_11__0 )? )
            // InternalEsportDsl.g:1752:2: ( rule__Tournament__Group_11__0 )?
            {
             before(grammarAccess.getTournamentAccess().getGroup_11()); 
            // InternalEsportDsl.g:1753:2: ( rule__Tournament__Group_11__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==56) ) {
                int LA15_1 = input.LA(2);

                if ( ((LA15_1>=RULE_STRING && LA15_1<=RULE_ID)) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // InternalEsportDsl.g:1753:3: rule__Tournament__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tournament__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTournamentAccess().getGroup_11()); 

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
    // $ANTLR end "rule__Tournament__Group__11__Impl"


    // $ANTLR start "rule__Tournament__Group__12"
    // InternalEsportDsl.g:1761:1: rule__Tournament__Group__12 : rule__Tournament__Group__12__Impl rule__Tournament__Group__13 ;
    public final void rule__Tournament__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1765:1: ( rule__Tournament__Group__12__Impl rule__Tournament__Group__13 )
            // InternalEsportDsl.g:1766:2: rule__Tournament__Group__12__Impl rule__Tournament__Group__13
            {
            pushFollow(FOLLOW_15);
            rule__Tournament__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group__13();

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
    // $ANTLR end "rule__Tournament__Group__12"


    // $ANTLR start "rule__Tournament__Group__12__Impl"
    // InternalEsportDsl.g:1773:1: rule__Tournament__Group__12__Impl : ( ( rule__Tournament__Group_12__0 )? ) ;
    public final void rule__Tournament__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1777:1: ( ( ( rule__Tournament__Group_12__0 )? ) )
            // InternalEsportDsl.g:1778:1: ( ( rule__Tournament__Group_12__0 )? )
            {
            // InternalEsportDsl.g:1778:1: ( ( rule__Tournament__Group_12__0 )? )
            // InternalEsportDsl.g:1779:2: ( rule__Tournament__Group_12__0 )?
            {
             before(grammarAccess.getTournamentAccess().getGroup_12()); 
            // InternalEsportDsl.g:1780:2: ( rule__Tournament__Group_12__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==60) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalEsportDsl.g:1780:3: rule__Tournament__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tournament__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTournamentAccess().getGroup_12()); 

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
    // $ANTLR end "rule__Tournament__Group__12__Impl"


    // $ANTLR start "rule__Tournament__Group__13"
    // InternalEsportDsl.g:1788:1: rule__Tournament__Group__13 : rule__Tournament__Group__13__Impl rule__Tournament__Group__14 ;
    public final void rule__Tournament__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1792:1: ( rule__Tournament__Group__13__Impl rule__Tournament__Group__14 )
            // InternalEsportDsl.g:1793:2: rule__Tournament__Group__13__Impl rule__Tournament__Group__14
            {
            pushFollow(FOLLOW_15);
            rule__Tournament__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group__14();

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
    // $ANTLR end "rule__Tournament__Group__13"


    // $ANTLR start "rule__Tournament__Group__13__Impl"
    // InternalEsportDsl.g:1800:1: rule__Tournament__Group__13__Impl : ( ( rule__Tournament__Group_13__0 )? ) ;
    public final void rule__Tournament__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1804:1: ( ( ( rule__Tournament__Group_13__0 )? ) )
            // InternalEsportDsl.g:1805:1: ( ( rule__Tournament__Group_13__0 )? )
            {
            // InternalEsportDsl.g:1805:1: ( ( rule__Tournament__Group_13__0 )? )
            // InternalEsportDsl.g:1806:2: ( rule__Tournament__Group_13__0 )?
            {
             before(grammarAccess.getTournamentAccess().getGroup_13()); 
            // InternalEsportDsl.g:1807:2: ( rule__Tournament__Group_13__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==61) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalEsportDsl.g:1807:3: rule__Tournament__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tournament__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTournamentAccess().getGroup_13()); 

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
    // $ANTLR end "rule__Tournament__Group__13__Impl"


    // $ANTLR start "rule__Tournament__Group__14"
    // InternalEsportDsl.g:1815:1: rule__Tournament__Group__14 : rule__Tournament__Group__14__Impl rule__Tournament__Group__15 ;
    public final void rule__Tournament__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1819:1: ( rule__Tournament__Group__14__Impl rule__Tournament__Group__15 )
            // InternalEsportDsl.g:1820:2: rule__Tournament__Group__14__Impl rule__Tournament__Group__15
            {
            pushFollow(FOLLOW_15);
            rule__Tournament__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group__15();

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
    // $ANTLR end "rule__Tournament__Group__14"


    // $ANTLR start "rule__Tournament__Group__14__Impl"
    // InternalEsportDsl.g:1827:1: rule__Tournament__Group__14__Impl : ( ( rule__Tournament__Group_14__0 )? ) ;
    public final void rule__Tournament__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1831:1: ( ( ( rule__Tournament__Group_14__0 )? ) )
            // InternalEsportDsl.g:1832:1: ( ( rule__Tournament__Group_14__0 )? )
            {
            // InternalEsportDsl.g:1832:1: ( ( rule__Tournament__Group_14__0 )? )
            // InternalEsportDsl.g:1833:2: ( rule__Tournament__Group_14__0 )?
            {
             before(grammarAccess.getTournamentAccess().getGroup_14()); 
            // InternalEsportDsl.g:1834:2: ( rule__Tournament__Group_14__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==56) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==67) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // InternalEsportDsl.g:1834:3: rule__Tournament__Group_14__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tournament__Group_14__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTournamentAccess().getGroup_14()); 

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
    // $ANTLR end "rule__Tournament__Group__14__Impl"


    // $ANTLR start "rule__Tournament__Group__15"
    // InternalEsportDsl.g:1842:1: rule__Tournament__Group__15 : rule__Tournament__Group__15__Impl ;
    public final void rule__Tournament__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1846:1: ( rule__Tournament__Group__15__Impl )
            // InternalEsportDsl.g:1847:2: rule__Tournament__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tournament__Group__15__Impl();

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
    // $ANTLR end "rule__Tournament__Group__15"


    // $ANTLR start "rule__Tournament__Group__15__Impl"
    // InternalEsportDsl.g:1853:1: rule__Tournament__Group__15__Impl : ( ( rule__Tournament__Group_15__0 )? ) ;
    public final void rule__Tournament__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1857:1: ( ( ( rule__Tournament__Group_15__0 )? ) )
            // InternalEsportDsl.g:1858:1: ( ( rule__Tournament__Group_15__0 )? )
            {
            // InternalEsportDsl.g:1858:1: ( ( rule__Tournament__Group_15__0 )? )
            // InternalEsportDsl.g:1859:2: ( rule__Tournament__Group_15__0 )?
            {
             before(grammarAccess.getTournamentAccess().getGroup_15()); 
            // InternalEsportDsl.g:1860:2: ( rule__Tournament__Group_15__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==56) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalEsportDsl.g:1860:3: rule__Tournament__Group_15__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tournament__Group_15__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTournamentAccess().getGroup_15()); 

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
    // $ANTLR end "rule__Tournament__Group__15__Impl"


    // $ANTLR start "rule__Tournament__Group_9__0"
    // InternalEsportDsl.g:1869:1: rule__Tournament__Group_9__0 : rule__Tournament__Group_9__0__Impl rule__Tournament__Group_9__1 ;
    public final void rule__Tournament__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1873:1: ( rule__Tournament__Group_9__0__Impl rule__Tournament__Group_9__1 )
            // InternalEsportDsl.g:1874:2: rule__Tournament__Group_9__0__Impl rule__Tournament__Group_9__1
            {
            pushFollow(FOLLOW_5);
            rule__Tournament__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group_9__1();

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
    // $ANTLR end "rule__Tournament__Group_9__0"


    // $ANTLR start "rule__Tournament__Group_9__0__Impl"
    // InternalEsportDsl.g:1881:1: rule__Tournament__Group_9__0__Impl : ( ',' ) ;
    public final void rule__Tournament__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1885:1: ( ( ',' ) )
            // InternalEsportDsl.g:1886:1: ( ',' )
            {
            // InternalEsportDsl.g:1886:1: ( ',' )
            // InternalEsportDsl.g:1887:2: ','
            {
             before(grammarAccess.getTournamentAccess().getCommaKeyword_9_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getTournamentAccess().getCommaKeyword_9_0()); 

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
    // $ANTLR end "rule__Tournament__Group_9__0__Impl"


    // $ANTLR start "rule__Tournament__Group_9__1"
    // InternalEsportDsl.g:1896:1: rule__Tournament__Group_9__1 : rule__Tournament__Group_9__1__Impl ;
    public final void rule__Tournament__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1900:1: ( rule__Tournament__Group_9__1__Impl )
            // InternalEsportDsl.g:1901:2: rule__Tournament__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tournament__Group_9__1__Impl();

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
    // $ANTLR end "rule__Tournament__Group_9__1"


    // $ANTLR start "rule__Tournament__Group_9__1__Impl"
    // InternalEsportDsl.g:1907:1: rule__Tournament__Group_9__1__Impl : ( ( rule__Tournament__AllowedZonesAssignment_9_1 ) ) ;
    public final void rule__Tournament__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1911:1: ( ( ( rule__Tournament__AllowedZonesAssignment_9_1 ) ) )
            // InternalEsportDsl.g:1912:1: ( ( rule__Tournament__AllowedZonesAssignment_9_1 ) )
            {
            // InternalEsportDsl.g:1912:1: ( ( rule__Tournament__AllowedZonesAssignment_9_1 ) )
            // InternalEsportDsl.g:1913:2: ( rule__Tournament__AllowedZonesAssignment_9_1 )
            {
             before(grammarAccess.getTournamentAccess().getAllowedZonesAssignment_9_1()); 
            // InternalEsportDsl.g:1914:2: ( rule__Tournament__AllowedZonesAssignment_9_1 )
            // InternalEsportDsl.g:1914:3: rule__Tournament__AllowedZonesAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Tournament__AllowedZonesAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getTournamentAccess().getAllowedZonesAssignment_9_1()); 

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
    // $ANTLR end "rule__Tournament__Group_9__1__Impl"


    // $ANTLR start "rule__Tournament__Group_11__0"
    // InternalEsportDsl.g:1923:1: rule__Tournament__Group_11__0 : rule__Tournament__Group_11__0__Impl rule__Tournament__Group_11__1 ;
    public final void rule__Tournament__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1927:1: ( rule__Tournament__Group_11__0__Impl rule__Tournament__Group_11__1 )
            // InternalEsportDsl.g:1928:2: rule__Tournament__Group_11__0__Impl rule__Tournament__Group_11__1
            {
            pushFollow(FOLLOW_5);
            rule__Tournament__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group_11__1();

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
    // $ANTLR end "rule__Tournament__Group_11__0"


    // $ANTLR start "rule__Tournament__Group_11__0__Impl"
    // InternalEsportDsl.g:1935:1: rule__Tournament__Group_11__0__Impl : ( '(' ) ;
    public final void rule__Tournament__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1939:1: ( ( '(' ) )
            // InternalEsportDsl.g:1940:1: ( '(' )
            {
            // InternalEsportDsl.g:1940:1: ( '(' )
            // InternalEsportDsl.g:1941:2: '('
            {
             before(grammarAccess.getTournamentAccess().getLeftParenthesisKeyword_11_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getTournamentAccess().getLeftParenthesisKeyword_11_0()); 

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
    // $ANTLR end "rule__Tournament__Group_11__0__Impl"


    // $ANTLR start "rule__Tournament__Group_11__1"
    // InternalEsportDsl.g:1950:1: rule__Tournament__Group_11__1 : rule__Tournament__Group_11__1__Impl rule__Tournament__Group_11__2 ;
    public final void rule__Tournament__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1954:1: ( rule__Tournament__Group_11__1__Impl rule__Tournament__Group_11__2 )
            // InternalEsportDsl.g:1955:2: rule__Tournament__Group_11__1__Impl rule__Tournament__Group_11__2
            {
            pushFollow(FOLLOW_9);
            rule__Tournament__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group_11__2();

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
    // $ANTLR end "rule__Tournament__Group_11__1"


    // $ANTLR start "rule__Tournament__Group_11__1__Impl"
    // InternalEsportDsl.g:1962:1: rule__Tournament__Group_11__1__Impl : ( ( rule__Tournament__CountriesAssignment_11_1 ) ) ;
    public final void rule__Tournament__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1966:1: ( ( ( rule__Tournament__CountriesAssignment_11_1 ) ) )
            // InternalEsportDsl.g:1967:1: ( ( rule__Tournament__CountriesAssignment_11_1 ) )
            {
            // InternalEsportDsl.g:1967:1: ( ( rule__Tournament__CountriesAssignment_11_1 ) )
            // InternalEsportDsl.g:1968:2: ( rule__Tournament__CountriesAssignment_11_1 )
            {
             before(grammarAccess.getTournamentAccess().getCountriesAssignment_11_1()); 
            // InternalEsportDsl.g:1969:2: ( rule__Tournament__CountriesAssignment_11_1 )
            // InternalEsportDsl.g:1969:3: rule__Tournament__CountriesAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__Tournament__CountriesAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getTournamentAccess().getCountriesAssignment_11_1()); 

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
    // $ANTLR end "rule__Tournament__Group_11__1__Impl"


    // $ANTLR start "rule__Tournament__Group_11__2"
    // InternalEsportDsl.g:1977:1: rule__Tournament__Group_11__2 : rule__Tournament__Group_11__2__Impl rule__Tournament__Group_11__3 ;
    public final void rule__Tournament__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1981:1: ( rule__Tournament__Group_11__2__Impl rule__Tournament__Group_11__3 )
            // InternalEsportDsl.g:1982:2: rule__Tournament__Group_11__2__Impl rule__Tournament__Group_11__3
            {
            pushFollow(FOLLOW_9);
            rule__Tournament__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group_11__3();

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
    // $ANTLR end "rule__Tournament__Group_11__2"


    // $ANTLR start "rule__Tournament__Group_11__2__Impl"
    // InternalEsportDsl.g:1989:1: rule__Tournament__Group_11__2__Impl : ( ( rule__Tournament__Group_11_2__0 )* ) ;
    public final void rule__Tournament__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:1993:1: ( ( ( rule__Tournament__Group_11_2__0 )* ) )
            // InternalEsportDsl.g:1994:1: ( ( rule__Tournament__Group_11_2__0 )* )
            {
            // InternalEsportDsl.g:1994:1: ( ( rule__Tournament__Group_11_2__0 )* )
            // InternalEsportDsl.g:1995:2: ( rule__Tournament__Group_11_2__0 )*
            {
             before(grammarAccess.getTournamentAccess().getGroup_11_2()); 
            // InternalEsportDsl.g:1996:2: ( rule__Tournament__Group_11_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==58) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalEsportDsl.g:1996:3: rule__Tournament__Group_11_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Tournament__Group_11_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getTournamentAccess().getGroup_11_2()); 

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
    // $ANTLR end "rule__Tournament__Group_11__2__Impl"


    // $ANTLR start "rule__Tournament__Group_11__3"
    // InternalEsportDsl.g:2004:1: rule__Tournament__Group_11__3 : rule__Tournament__Group_11__3__Impl ;
    public final void rule__Tournament__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2008:1: ( rule__Tournament__Group_11__3__Impl )
            // InternalEsportDsl.g:2009:2: rule__Tournament__Group_11__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tournament__Group_11__3__Impl();

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
    // $ANTLR end "rule__Tournament__Group_11__3"


    // $ANTLR start "rule__Tournament__Group_11__3__Impl"
    // InternalEsportDsl.g:2015:1: rule__Tournament__Group_11__3__Impl : ( ')' ) ;
    public final void rule__Tournament__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2019:1: ( ( ')' ) )
            // InternalEsportDsl.g:2020:1: ( ')' )
            {
            // InternalEsportDsl.g:2020:1: ( ')' )
            // InternalEsportDsl.g:2021:2: ')'
            {
             before(grammarAccess.getTournamentAccess().getRightParenthesisKeyword_11_3()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getTournamentAccess().getRightParenthesisKeyword_11_3()); 

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
    // $ANTLR end "rule__Tournament__Group_11__3__Impl"


    // $ANTLR start "rule__Tournament__Group_11_2__0"
    // InternalEsportDsl.g:2031:1: rule__Tournament__Group_11_2__0 : rule__Tournament__Group_11_2__0__Impl rule__Tournament__Group_11_2__1 ;
    public final void rule__Tournament__Group_11_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2035:1: ( rule__Tournament__Group_11_2__0__Impl rule__Tournament__Group_11_2__1 )
            // InternalEsportDsl.g:2036:2: rule__Tournament__Group_11_2__0__Impl rule__Tournament__Group_11_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Tournament__Group_11_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group_11_2__1();

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
    // $ANTLR end "rule__Tournament__Group_11_2__0"


    // $ANTLR start "rule__Tournament__Group_11_2__0__Impl"
    // InternalEsportDsl.g:2043:1: rule__Tournament__Group_11_2__0__Impl : ( ',' ) ;
    public final void rule__Tournament__Group_11_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2047:1: ( ( ',' ) )
            // InternalEsportDsl.g:2048:1: ( ',' )
            {
            // InternalEsportDsl.g:2048:1: ( ',' )
            // InternalEsportDsl.g:2049:2: ','
            {
             before(grammarAccess.getTournamentAccess().getCommaKeyword_11_2_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getTournamentAccess().getCommaKeyword_11_2_0()); 

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
    // $ANTLR end "rule__Tournament__Group_11_2__0__Impl"


    // $ANTLR start "rule__Tournament__Group_11_2__1"
    // InternalEsportDsl.g:2058:1: rule__Tournament__Group_11_2__1 : rule__Tournament__Group_11_2__1__Impl ;
    public final void rule__Tournament__Group_11_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2062:1: ( rule__Tournament__Group_11_2__1__Impl )
            // InternalEsportDsl.g:2063:2: rule__Tournament__Group_11_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tournament__Group_11_2__1__Impl();

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
    // $ANTLR end "rule__Tournament__Group_11_2__1"


    // $ANTLR start "rule__Tournament__Group_11_2__1__Impl"
    // InternalEsportDsl.g:2069:1: rule__Tournament__Group_11_2__1__Impl : ( ( rule__Tournament__CountriesAssignment_11_2_1 ) ) ;
    public final void rule__Tournament__Group_11_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2073:1: ( ( ( rule__Tournament__CountriesAssignment_11_2_1 ) ) )
            // InternalEsportDsl.g:2074:1: ( ( rule__Tournament__CountriesAssignment_11_2_1 ) )
            {
            // InternalEsportDsl.g:2074:1: ( ( rule__Tournament__CountriesAssignment_11_2_1 ) )
            // InternalEsportDsl.g:2075:2: ( rule__Tournament__CountriesAssignment_11_2_1 )
            {
             before(grammarAccess.getTournamentAccess().getCountriesAssignment_11_2_1()); 
            // InternalEsportDsl.g:2076:2: ( rule__Tournament__CountriesAssignment_11_2_1 )
            // InternalEsportDsl.g:2076:3: rule__Tournament__CountriesAssignment_11_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Tournament__CountriesAssignment_11_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTournamentAccess().getCountriesAssignment_11_2_1()); 

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
    // $ANTLR end "rule__Tournament__Group_11_2__1__Impl"


    // $ANTLR start "rule__Tournament__Group_12__0"
    // InternalEsportDsl.g:2085:1: rule__Tournament__Group_12__0 : rule__Tournament__Group_12__0__Impl rule__Tournament__Group_12__1 ;
    public final void rule__Tournament__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2089:1: ( rule__Tournament__Group_12__0__Impl rule__Tournament__Group_12__1 )
            // InternalEsportDsl.g:2090:2: rule__Tournament__Group_12__0__Impl rule__Tournament__Group_12__1
            {
            pushFollow(FOLLOW_5);
            rule__Tournament__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group_12__1();

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
    // $ANTLR end "rule__Tournament__Group_12__0"


    // $ANTLR start "rule__Tournament__Group_12__0__Impl"
    // InternalEsportDsl.g:2097:1: rule__Tournament__Group_12__0__Impl : ( 'qualifiesFor' ) ;
    public final void rule__Tournament__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2101:1: ( ( 'qualifiesFor' ) )
            // InternalEsportDsl.g:2102:1: ( 'qualifiesFor' )
            {
            // InternalEsportDsl.g:2102:1: ( 'qualifiesFor' )
            // InternalEsportDsl.g:2103:2: 'qualifiesFor'
            {
             before(grammarAccess.getTournamentAccess().getQualifiesForKeyword_12_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getTournamentAccess().getQualifiesForKeyword_12_0()); 

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
    // $ANTLR end "rule__Tournament__Group_12__0__Impl"


    // $ANTLR start "rule__Tournament__Group_12__1"
    // InternalEsportDsl.g:2112:1: rule__Tournament__Group_12__1 : rule__Tournament__Group_12__1__Impl ;
    public final void rule__Tournament__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2116:1: ( rule__Tournament__Group_12__1__Impl )
            // InternalEsportDsl.g:2117:2: rule__Tournament__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tournament__Group_12__1__Impl();

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
    // $ANTLR end "rule__Tournament__Group_12__1"


    // $ANTLR start "rule__Tournament__Group_12__1__Impl"
    // InternalEsportDsl.g:2123:1: rule__Tournament__Group_12__1__Impl : ( ( rule__Tournament__QualifiesForAssignment_12_1 ) ) ;
    public final void rule__Tournament__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2127:1: ( ( ( rule__Tournament__QualifiesForAssignment_12_1 ) ) )
            // InternalEsportDsl.g:2128:1: ( ( rule__Tournament__QualifiesForAssignment_12_1 ) )
            {
            // InternalEsportDsl.g:2128:1: ( ( rule__Tournament__QualifiesForAssignment_12_1 ) )
            // InternalEsportDsl.g:2129:2: ( rule__Tournament__QualifiesForAssignment_12_1 )
            {
             before(grammarAccess.getTournamentAccess().getQualifiesForAssignment_12_1()); 
            // InternalEsportDsl.g:2130:2: ( rule__Tournament__QualifiesForAssignment_12_1 )
            // InternalEsportDsl.g:2130:3: rule__Tournament__QualifiesForAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__Tournament__QualifiesForAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getTournamentAccess().getQualifiesForAssignment_12_1()); 

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
    // $ANTLR end "rule__Tournament__Group_12__1__Impl"


    // $ANTLR start "rule__Tournament__Group_13__0"
    // InternalEsportDsl.g:2139:1: rule__Tournament__Group_13__0 : rule__Tournament__Group_13__0__Impl rule__Tournament__Group_13__1 ;
    public final void rule__Tournament__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2143:1: ( rule__Tournament__Group_13__0__Impl rule__Tournament__Group_13__1 )
            // InternalEsportDsl.g:2144:2: rule__Tournament__Group_13__0__Impl rule__Tournament__Group_13__1
            {
            pushFollow(FOLLOW_7);
            rule__Tournament__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group_13__1();

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
    // $ANTLR end "rule__Tournament__Group_13__0"


    // $ANTLR start "rule__Tournament__Group_13__0__Impl"
    // InternalEsportDsl.g:2151:1: rule__Tournament__Group_13__0__Impl : ( 'qualifiesFrom' ) ;
    public final void rule__Tournament__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2155:1: ( ( 'qualifiesFrom' ) )
            // InternalEsportDsl.g:2156:1: ( 'qualifiesFrom' )
            {
            // InternalEsportDsl.g:2156:1: ( 'qualifiesFrom' )
            // InternalEsportDsl.g:2157:2: 'qualifiesFrom'
            {
             before(grammarAccess.getTournamentAccess().getQualifiesFromKeyword_13_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getTournamentAccess().getQualifiesFromKeyword_13_0()); 

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
    // $ANTLR end "rule__Tournament__Group_13__0__Impl"


    // $ANTLR start "rule__Tournament__Group_13__1"
    // InternalEsportDsl.g:2166:1: rule__Tournament__Group_13__1 : rule__Tournament__Group_13__1__Impl rule__Tournament__Group_13__2 ;
    public final void rule__Tournament__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2170:1: ( rule__Tournament__Group_13__1__Impl rule__Tournament__Group_13__2 )
            // InternalEsportDsl.g:2171:2: rule__Tournament__Group_13__1__Impl rule__Tournament__Group_13__2
            {
            pushFollow(FOLLOW_5);
            rule__Tournament__Group_13__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group_13__2();

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
    // $ANTLR end "rule__Tournament__Group_13__1"


    // $ANTLR start "rule__Tournament__Group_13__1__Impl"
    // InternalEsportDsl.g:2178:1: rule__Tournament__Group_13__1__Impl : ( '(' ) ;
    public final void rule__Tournament__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2182:1: ( ( '(' ) )
            // InternalEsportDsl.g:2183:1: ( '(' )
            {
            // InternalEsportDsl.g:2183:1: ( '(' )
            // InternalEsportDsl.g:2184:2: '('
            {
             before(grammarAccess.getTournamentAccess().getLeftParenthesisKeyword_13_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getTournamentAccess().getLeftParenthesisKeyword_13_1()); 

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
    // $ANTLR end "rule__Tournament__Group_13__1__Impl"


    // $ANTLR start "rule__Tournament__Group_13__2"
    // InternalEsportDsl.g:2193:1: rule__Tournament__Group_13__2 : rule__Tournament__Group_13__2__Impl rule__Tournament__Group_13__3 ;
    public final void rule__Tournament__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2197:1: ( rule__Tournament__Group_13__2__Impl rule__Tournament__Group_13__3 )
            // InternalEsportDsl.g:2198:2: rule__Tournament__Group_13__2__Impl rule__Tournament__Group_13__3
            {
            pushFollow(FOLLOW_9);
            rule__Tournament__Group_13__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group_13__3();

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
    // $ANTLR end "rule__Tournament__Group_13__2"


    // $ANTLR start "rule__Tournament__Group_13__2__Impl"
    // InternalEsportDsl.g:2205:1: rule__Tournament__Group_13__2__Impl : ( ( rule__Tournament__QualifiesFromAssignment_13_2 ) ) ;
    public final void rule__Tournament__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2209:1: ( ( ( rule__Tournament__QualifiesFromAssignment_13_2 ) ) )
            // InternalEsportDsl.g:2210:1: ( ( rule__Tournament__QualifiesFromAssignment_13_2 ) )
            {
            // InternalEsportDsl.g:2210:1: ( ( rule__Tournament__QualifiesFromAssignment_13_2 ) )
            // InternalEsportDsl.g:2211:2: ( rule__Tournament__QualifiesFromAssignment_13_2 )
            {
             before(grammarAccess.getTournamentAccess().getQualifiesFromAssignment_13_2()); 
            // InternalEsportDsl.g:2212:2: ( rule__Tournament__QualifiesFromAssignment_13_2 )
            // InternalEsportDsl.g:2212:3: rule__Tournament__QualifiesFromAssignment_13_2
            {
            pushFollow(FOLLOW_2);
            rule__Tournament__QualifiesFromAssignment_13_2();

            state._fsp--;


            }

             after(grammarAccess.getTournamentAccess().getQualifiesFromAssignment_13_2()); 

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
    // $ANTLR end "rule__Tournament__Group_13__2__Impl"


    // $ANTLR start "rule__Tournament__Group_13__3"
    // InternalEsportDsl.g:2220:1: rule__Tournament__Group_13__3 : rule__Tournament__Group_13__3__Impl rule__Tournament__Group_13__4 ;
    public final void rule__Tournament__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2224:1: ( rule__Tournament__Group_13__3__Impl rule__Tournament__Group_13__4 )
            // InternalEsportDsl.g:2225:2: rule__Tournament__Group_13__3__Impl rule__Tournament__Group_13__4
            {
            pushFollow(FOLLOW_9);
            rule__Tournament__Group_13__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group_13__4();

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
    // $ANTLR end "rule__Tournament__Group_13__3"


    // $ANTLR start "rule__Tournament__Group_13__3__Impl"
    // InternalEsportDsl.g:2232:1: rule__Tournament__Group_13__3__Impl : ( ( rule__Tournament__Group_13_3__0 )* ) ;
    public final void rule__Tournament__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2236:1: ( ( ( rule__Tournament__Group_13_3__0 )* ) )
            // InternalEsportDsl.g:2237:1: ( ( rule__Tournament__Group_13_3__0 )* )
            {
            // InternalEsportDsl.g:2237:1: ( ( rule__Tournament__Group_13_3__0 )* )
            // InternalEsportDsl.g:2238:2: ( rule__Tournament__Group_13_3__0 )*
            {
             before(grammarAccess.getTournamentAccess().getGroup_13_3()); 
            // InternalEsportDsl.g:2239:2: ( rule__Tournament__Group_13_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==58) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalEsportDsl.g:2239:3: rule__Tournament__Group_13_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Tournament__Group_13_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getTournamentAccess().getGroup_13_3()); 

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
    // $ANTLR end "rule__Tournament__Group_13__3__Impl"


    // $ANTLR start "rule__Tournament__Group_13__4"
    // InternalEsportDsl.g:2247:1: rule__Tournament__Group_13__4 : rule__Tournament__Group_13__4__Impl ;
    public final void rule__Tournament__Group_13__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2251:1: ( rule__Tournament__Group_13__4__Impl )
            // InternalEsportDsl.g:2252:2: rule__Tournament__Group_13__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tournament__Group_13__4__Impl();

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
    // $ANTLR end "rule__Tournament__Group_13__4"


    // $ANTLR start "rule__Tournament__Group_13__4__Impl"
    // InternalEsportDsl.g:2258:1: rule__Tournament__Group_13__4__Impl : ( ')' ) ;
    public final void rule__Tournament__Group_13__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2262:1: ( ( ')' ) )
            // InternalEsportDsl.g:2263:1: ( ')' )
            {
            // InternalEsportDsl.g:2263:1: ( ')' )
            // InternalEsportDsl.g:2264:2: ')'
            {
             before(grammarAccess.getTournamentAccess().getRightParenthesisKeyword_13_4()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getTournamentAccess().getRightParenthesisKeyword_13_4()); 

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
    // $ANTLR end "rule__Tournament__Group_13__4__Impl"


    // $ANTLR start "rule__Tournament__Group_13_3__0"
    // InternalEsportDsl.g:2274:1: rule__Tournament__Group_13_3__0 : rule__Tournament__Group_13_3__0__Impl rule__Tournament__Group_13_3__1 ;
    public final void rule__Tournament__Group_13_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2278:1: ( rule__Tournament__Group_13_3__0__Impl rule__Tournament__Group_13_3__1 )
            // InternalEsportDsl.g:2279:2: rule__Tournament__Group_13_3__0__Impl rule__Tournament__Group_13_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Tournament__Group_13_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group_13_3__1();

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
    // $ANTLR end "rule__Tournament__Group_13_3__0"


    // $ANTLR start "rule__Tournament__Group_13_3__0__Impl"
    // InternalEsportDsl.g:2286:1: rule__Tournament__Group_13_3__0__Impl : ( ',' ) ;
    public final void rule__Tournament__Group_13_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2290:1: ( ( ',' ) )
            // InternalEsportDsl.g:2291:1: ( ',' )
            {
            // InternalEsportDsl.g:2291:1: ( ',' )
            // InternalEsportDsl.g:2292:2: ','
            {
             before(grammarAccess.getTournamentAccess().getCommaKeyword_13_3_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getTournamentAccess().getCommaKeyword_13_3_0()); 

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
    // $ANTLR end "rule__Tournament__Group_13_3__0__Impl"


    // $ANTLR start "rule__Tournament__Group_13_3__1"
    // InternalEsportDsl.g:2301:1: rule__Tournament__Group_13_3__1 : rule__Tournament__Group_13_3__1__Impl ;
    public final void rule__Tournament__Group_13_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2305:1: ( rule__Tournament__Group_13_3__1__Impl )
            // InternalEsportDsl.g:2306:2: rule__Tournament__Group_13_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tournament__Group_13_3__1__Impl();

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
    // $ANTLR end "rule__Tournament__Group_13_3__1"


    // $ANTLR start "rule__Tournament__Group_13_3__1__Impl"
    // InternalEsportDsl.g:2312:1: rule__Tournament__Group_13_3__1__Impl : ( ( rule__Tournament__QualifiesFromAssignment_13_3_1 ) ) ;
    public final void rule__Tournament__Group_13_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2316:1: ( ( ( rule__Tournament__QualifiesFromAssignment_13_3_1 ) ) )
            // InternalEsportDsl.g:2317:1: ( ( rule__Tournament__QualifiesFromAssignment_13_3_1 ) )
            {
            // InternalEsportDsl.g:2317:1: ( ( rule__Tournament__QualifiesFromAssignment_13_3_1 ) )
            // InternalEsportDsl.g:2318:2: ( rule__Tournament__QualifiesFromAssignment_13_3_1 )
            {
             before(grammarAccess.getTournamentAccess().getQualifiesFromAssignment_13_3_1()); 
            // InternalEsportDsl.g:2319:2: ( rule__Tournament__QualifiesFromAssignment_13_3_1 )
            // InternalEsportDsl.g:2319:3: rule__Tournament__QualifiesFromAssignment_13_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Tournament__QualifiesFromAssignment_13_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTournamentAccess().getQualifiesFromAssignment_13_3_1()); 

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
    // $ANTLR end "rule__Tournament__Group_13_3__1__Impl"


    // $ANTLR start "rule__Tournament__Group_14__0"
    // InternalEsportDsl.g:2328:1: rule__Tournament__Group_14__0 : rule__Tournament__Group_14__0__Impl rule__Tournament__Group_14__1 ;
    public final void rule__Tournament__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2332:1: ( rule__Tournament__Group_14__0__Impl rule__Tournament__Group_14__1 )
            // InternalEsportDsl.g:2333:2: rule__Tournament__Group_14__0__Impl rule__Tournament__Group_14__1
            {
            pushFollow(FOLLOW_16);
            rule__Tournament__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group_14__1();

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
    // $ANTLR end "rule__Tournament__Group_14__0"


    // $ANTLR start "rule__Tournament__Group_14__0__Impl"
    // InternalEsportDsl.g:2340:1: rule__Tournament__Group_14__0__Impl : ( '(' ) ;
    public final void rule__Tournament__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2344:1: ( ( '(' ) )
            // InternalEsportDsl.g:2345:1: ( '(' )
            {
            // InternalEsportDsl.g:2345:1: ( '(' )
            // InternalEsportDsl.g:2346:2: '('
            {
             before(grammarAccess.getTournamentAccess().getLeftParenthesisKeyword_14_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getTournamentAccess().getLeftParenthesisKeyword_14_0()); 

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
    // $ANTLR end "rule__Tournament__Group_14__0__Impl"


    // $ANTLR start "rule__Tournament__Group_14__1"
    // InternalEsportDsl.g:2355:1: rule__Tournament__Group_14__1 : rule__Tournament__Group_14__1__Impl rule__Tournament__Group_14__2 ;
    public final void rule__Tournament__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2359:1: ( rule__Tournament__Group_14__1__Impl rule__Tournament__Group_14__2 )
            // InternalEsportDsl.g:2360:2: rule__Tournament__Group_14__1__Impl rule__Tournament__Group_14__2
            {
            pushFollow(FOLLOW_9);
            rule__Tournament__Group_14__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group_14__2();

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
    // $ANTLR end "rule__Tournament__Group_14__1"


    // $ANTLR start "rule__Tournament__Group_14__1__Impl"
    // InternalEsportDsl.g:2367:1: rule__Tournament__Group_14__1__Impl : ( ( rule__Tournament__FinalstagesAssignment_14_1 ) ) ;
    public final void rule__Tournament__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2371:1: ( ( ( rule__Tournament__FinalstagesAssignment_14_1 ) ) )
            // InternalEsportDsl.g:2372:1: ( ( rule__Tournament__FinalstagesAssignment_14_1 ) )
            {
            // InternalEsportDsl.g:2372:1: ( ( rule__Tournament__FinalstagesAssignment_14_1 ) )
            // InternalEsportDsl.g:2373:2: ( rule__Tournament__FinalstagesAssignment_14_1 )
            {
             before(grammarAccess.getTournamentAccess().getFinalstagesAssignment_14_1()); 
            // InternalEsportDsl.g:2374:2: ( rule__Tournament__FinalstagesAssignment_14_1 )
            // InternalEsportDsl.g:2374:3: rule__Tournament__FinalstagesAssignment_14_1
            {
            pushFollow(FOLLOW_2);
            rule__Tournament__FinalstagesAssignment_14_1();

            state._fsp--;


            }

             after(grammarAccess.getTournamentAccess().getFinalstagesAssignment_14_1()); 

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
    // $ANTLR end "rule__Tournament__Group_14__1__Impl"


    // $ANTLR start "rule__Tournament__Group_14__2"
    // InternalEsportDsl.g:2382:1: rule__Tournament__Group_14__2 : rule__Tournament__Group_14__2__Impl rule__Tournament__Group_14__3 ;
    public final void rule__Tournament__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2386:1: ( rule__Tournament__Group_14__2__Impl rule__Tournament__Group_14__3 )
            // InternalEsportDsl.g:2387:2: rule__Tournament__Group_14__2__Impl rule__Tournament__Group_14__3
            {
            pushFollow(FOLLOW_9);
            rule__Tournament__Group_14__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group_14__3();

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
    // $ANTLR end "rule__Tournament__Group_14__2"


    // $ANTLR start "rule__Tournament__Group_14__2__Impl"
    // InternalEsportDsl.g:2394:1: rule__Tournament__Group_14__2__Impl : ( ( rule__Tournament__Group_14_2__0 )* ) ;
    public final void rule__Tournament__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2398:1: ( ( ( rule__Tournament__Group_14_2__0 )* ) )
            // InternalEsportDsl.g:2399:1: ( ( rule__Tournament__Group_14_2__0 )* )
            {
            // InternalEsportDsl.g:2399:1: ( ( rule__Tournament__Group_14_2__0 )* )
            // InternalEsportDsl.g:2400:2: ( rule__Tournament__Group_14_2__0 )*
            {
             before(grammarAccess.getTournamentAccess().getGroup_14_2()); 
            // InternalEsportDsl.g:2401:2: ( rule__Tournament__Group_14_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==58) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalEsportDsl.g:2401:3: rule__Tournament__Group_14_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Tournament__Group_14_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getTournamentAccess().getGroup_14_2()); 

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
    // $ANTLR end "rule__Tournament__Group_14__2__Impl"


    // $ANTLR start "rule__Tournament__Group_14__3"
    // InternalEsportDsl.g:2409:1: rule__Tournament__Group_14__3 : rule__Tournament__Group_14__3__Impl ;
    public final void rule__Tournament__Group_14__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2413:1: ( rule__Tournament__Group_14__3__Impl )
            // InternalEsportDsl.g:2414:2: rule__Tournament__Group_14__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tournament__Group_14__3__Impl();

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
    // $ANTLR end "rule__Tournament__Group_14__3"


    // $ANTLR start "rule__Tournament__Group_14__3__Impl"
    // InternalEsportDsl.g:2420:1: rule__Tournament__Group_14__3__Impl : ( ')' ) ;
    public final void rule__Tournament__Group_14__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2424:1: ( ( ')' ) )
            // InternalEsportDsl.g:2425:1: ( ')' )
            {
            // InternalEsportDsl.g:2425:1: ( ')' )
            // InternalEsportDsl.g:2426:2: ')'
            {
             before(grammarAccess.getTournamentAccess().getRightParenthesisKeyword_14_3()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getTournamentAccess().getRightParenthesisKeyword_14_3()); 

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
    // $ANTLR end "rule__Tournament__Group_14__3__Impl"


    // $ANTLR start "rule__Tournament__Group_14_2__0"
    // InternalEsportDsl.g:2436:1: rule__Tournament__Group_14_2__0 : rule__Tournament__Group_14_2__0__Impl rule__Tournament__Group_14_2__1 ;
    public final void rule__Tournament__Group_14_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2440:1: ( rule__Tournament__Group_14_2__0__Impl rule__Tournament__Group_14_2__1 )
            // InternalEsportDsl.g:2441:2: rule__Tournament__Group_14_2__0__Impl rule__Tournament__Group_14_2__1
            {
            pushFollow(FOLLOW_16);
            rule__Tournament__Group_14_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group_14_2__1();

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
    // $ANTLR end "rule__Tournament__Group_14_2__0"


    // $ANTLR start "rule__Tournament__Group_14_2__0__Impl"
    // InternalEsportDsl.g:2448:1: rule__Tournament__Group_14_2__0__Impl : ( ',' ) ;
    public final void rule__Tournament__Group_14_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2452:1: ( ( ',' ) )
            // InternalEsportDsl.g:2453:1: ( ',' )
            {
            // InternalEsportDsl.g:2453:1: ( ',' )
            // InternalEsportDsl.g:2454:2: ','
            {
             before(grammarAccess.getTournamentAccess().getCommaKeyword_14_2_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getTournamentAccess().getCommaKeyword_14_2_0()); 

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
    // $ANTLR end "rule__Tournament__Group_14_2__0__Impl"


    // $ANTLR start "rule__Tournament__Group_14_2__1"
    // InternalEsportDsl.g:2463:1: rule__Tournament__Group_14_2__1 : rule__Tournament__Group_14_2__1__Impl ;
    public final void rule__Tournament__Group_14_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2467:1: ( rule__Tournament__Group_14_2__1__Impl )
            // InternalEsportDsl.g:2468:2: rule__Tournament__Group_14_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tournament__Group_14_2__1__Impl();

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
    // $ANTLR end "rule__Tournament__Group_14_2__1"


    // $ANTLR start "rule__Tournament__Group_14_2__1__Impl"
    // InternalEsportDsl.g:2474:1: rule__Tournament__Group_14_2__1__Impl : ( ( rule__Tournament__FinalstagesAssignment_14_2_1 ) ) ;
    public final void rule__Tournament__Group_14_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2478:1: ( ( ( rule__Tournament__FinalstagesAssignment_14_2_1 ) ) )
            // InternalEsportDsl.g:2479:1: ( ( rule__Tournament__FinalstagesAssignment_14_2_1 ) )
            {
            // InternalEsportDsl.g:2479:1: ( ( rule__Tournament__FinalstagesAssignment_14_2_1 ) )
            // InternalEsportDsl.g:2480:2: ( rule__Tournament__FinalstagesAssignment_14_2_1 )
            {
             before(grammarAccess.getTournamentAccess().getFinalstagesAssignment_14_2_1()); 
            // InternalEsportDsl.g:2481:2: ( rule__Tournament__FinalstagesAssignment_14_2_1 )
            // InternalEsportDsl.g:2481:3: rule__Tournament__FinalstagesAssignment_14_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Tournament__FinalstagesAssignment_14_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTournamentAccess().getFinalstagesAssignment_14_2_1()); 

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
    // $ANTLR end "rule__Tournament__Group_14_2__1__Impl"


    // $ANTLR start "rule__Tournament__Group_15__0"
    // InternalEsportDsl.g:2490:1: rule__Tournament__Group_15__0 : rule__Tournament__Group_15__0__Impl rule__Tournament__Group_15__1 ;
    public final void rule__Tournament__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2494:1: ( rule__Tournament__Group_15__0__Impl rule__Tournament__Group_15__1 )
            // InternalEsportDsl.g:2495:2: rule__Tournament__Group_15__0__Impl rule__Tournament__Group_15__1
            {
            pushFollow(FOLLOW_17);
            rule__Tournament__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group_15__1();

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
    // $ANTLR end "rule__Tournament__Group_15__0"


    // $ANTLR start "rule__Tournament__Group_15__0__Impl"
    // InternalEsportDsl.g:2502:1: rule__Tournament__Group_15__0__Impl : ( '(' ) ;
    public final void rule__Tournament__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2506:1: ( ( '(' ) )
            // InternalEsportDsl.g:2507:1: ( '(' )
            {
            // InternalEsportDsl.g:2507:1: ( '(' )
            // InternalEsportDsl.g:2508:2: '('
            {
             before(grammarAccess.getTournamentAccess().getLeftParenthesisKeyword_15_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getTournamentAccess().getLeftParenthesisKeyword_15_0()); 

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
    // $ANTLR end "rule__Tournament__Group_15__0__Impl"


    // $ANTLR start "rule__Tournament__Group_15__1"
    // InternalEsportDsl.g:2517:1: rule__Tournament__Group_15__1 : rule__Tournament__Group_15__1__Impl rule__Tournament__Group_15__2 ;
    public final void rule__Tournament__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2521:1: ( rule__Tournament__Group_15__1__Impl rule__Tournament__Group_15__2 )
            // InternalEsportDsl.g:2522:2: rule__Tournament__Group_15__1__Impl rule__Tournament__Group_15__2
            {
            pushFollow(FOLLOW_9);
            rule__Tournament__Group_15__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group_15__2();

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
    // $ANTLR end "rule__Tournament__Group_15__1"


    // $ANTLR start "rule__Tournament__Group_15__1__Impl"
    // InternalEsportDsl.g:2529:1: rule__Tournament__Group_15__1__Impl : ( ( rule__Tournament__GroupstagesAssignment_15_1 ) ) ;
    public final void rule__Tournament__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2533:1: ( ( ( rule__Tournament__GroupstagesAssignment_15_1 ) ) )
            // InternalEsportDsl.g:2534:1: ( ( rule__Tournament__GroupstagesAssignment_15_1 ) )
            {
            // InternalEsportDsl.g:2534:1: ( ( rule__Tournament__GroupstagesAssignment_15_1 ) )
            // InternalEsportDsl.g:2535:2: ( rule__Tournament__GroupstagesAssignment_15_1 )
            {
             before(grammarAccess.getTournamentAccess().getGroupstagesAssignment_15_1()); 
            // InternalEsportDsl.g:2536:2: ( rule__Tournament__GroupstagesAssignment_15_1 )
            // InternalEsportDsl.g:2536:3: rule__Tournament__GroupstagesAssignment_15_1
            {
            pushFollow(FOLLOW_2);
            rule__Tournament__GroupstagesAssignment_15_1();

            state._fsp--;


            }

             after(grammarAccess.getTournamentAccess().getGroupstagesAssignment_15_1()); 

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
    // $ANTLR end "rule__Tournament__Group_15__1__Impl"


    // $ANTLR start "rule__Tournament__Group_15__2"
    // InternalEsportDsl.g:2544:1: rule__Tournament__Group_15__2 : rule__Tournament__Group_15__2__Impl rule__Tournament__Group_15__3 ;
    public final void rule__Tournament__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2548:1: ( rule__Tournament__Group_15__2__Impl rule__Tournament__Group_15__3 )
            // InternalEsportDsl.g:2549:2: rule__Tournament__Group_15__2__Impl rule__Tournament__Group_15__3
            {
            pushFollow(FOLLOW_9);
            rule__Tournament__Group_15__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group_15__3();

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
    // $ANTLR end "rule__Tournament__Group_15__2"


    // $ANTLR start "rule__Tournament__Group_15__2__Impl"
    // InternalEsportDsl.g:2556:1: rule__Tournament__Group_15__2__Impl : ( ( rule__Tournament__Group_15_2__0 )* ) ;
    public final void rule__Tournament__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2560:1: ( ( ( rule__Tournament__Group_15_2__0 )* ) )
            // InternalEsportDsl.g:2561:1: ( ( rule__Tournament__Group_15_2__0 )* )
            {
            // InternalEsportDsl.g:2561:1: ( ( rule__Tournament__Group_15_2__0 )* )
            // InternalEsportDsl.g:2562:2: ( rule__Tournament__Group_15_2__0 )*
            {
             before(grammarAccess.getTournamentAccess().getGroup_15_2()); 
            // InternalEsportDsl.g:2563:2: ( rule__Tournament__Group_15_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==58) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalEsportDsl.g:2563:3: rule__Tournament__Group_15_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Tournament__Group_15_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getTournamentAccess().getGroup_15_2()); 

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
    // $ANTLR end "rule__Tournament__Group_15__2__Impl"


    // $ANTLR start "rule__Tournament__Group_15__3"
    // InternalEsportDsl.g:2571:1: rule__Tournament__Group_15__3 : rule__Tournament__Group_15__3__Impl ;
    public final void rule__Tournament__Group_15__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2575:1: ( rule__Tournament__Group_15__3__Impl )
            // InternalEsportDsl.g:2576:2: rule__Tournament__Group_15__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tournament__Group_15__3__Impl();

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
    // $ANTLR end "rule__Tournament__Group_15__3"


    // $ANTLR start "rule__Tournament__Group_15__3__Impl"
    // InternalEsportDsl.g:2582:1: rule__Tournament__Group_15__3__Impl : ( ')' ) ;
    public final void rule__Tournament__Group_15__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2586:1: ( ( ')' ) )
            // InternalEsportDsl.g:2587:1: ( ')' )
            {
            // InternalEsportDsl.g:2587:1: ( ')' )
            // InternalEsportDsl.g:2588:2: ')'
            {
             before(grammarAccess.getTournamentAccess().getRightParenthesisKeyword_15_3()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getTournamentAccess().getRightParenthesisKeyword_15_3()); 

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
    // $ANTLR end "rule__Tournament__Group_15__3__Impl"


    // $ANTLR start "rule__Tournament__Group_15_2__0"
    // InternalEsportDsl.g:2598:1: rule__Tournament__Group_15_2__0 : rule__Tournament__Group_15_2__0__Impl rule__Tournament__Group_15_2__1 ;
    public final void rule__Tournament__Group_15_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2602:1: ( rule__Tournament__Group_15_2__0__Impl rule__Tournament__Group_15_2__1 )
            // InternalEsportDsl.g:2603:2: rule__Tournament__Group_15_2__0__Impl rule__Tournament__Group_15_2__1
            {
            pushFollow(FOLLOW_17);
            rule__Tournament__Group_15_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group_15_2__1();

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
    // $ANTLR end "rule__Tournament__Group_15_2__0"


    // $ANTLR start "rule__Tournament__Group_15_2__0__Impl"
    // InternalEsportDsl.g:2610:1: rule__Tournament__Group_15_2__0__Impl : ( ',' ) ;
    public final void rule__Tournament__Group_15_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2614:1: ( ( ',' ) )
            // InternalEsportDsl.g:2615:1: ( ',' )
            {
            // InternalEsportDsl.g:2615:1: ( ',' )
            // InternalEsportDsl.g:2616:2: ','
            {
             before(grammarAccess.getTournamentAccess().getCommaKeyword_15_2_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getTournamentAccess().getCommaKeyword_15_2_0()); 

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
    // $ANTLR end "rule__Tournament__Group_15_2__0__Impl"


    // $ANTLR start "rule__Tournament__Group_15_2__1"
    // InternalEsportDsl.g:2625:1: rule__Tournament__Group_15_2__1 : rule__Tournament__Group_15_2__1__Impl ;
    public final void rule__Tournament__Group_15_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2629:1: ( rule__Tournament__Group_15_2__1__Impl )
            // InternalEsportDsl.g:2630:2: rule__Tournament__Group_15_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tournament__Group_15_2__1__Impl();

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
    // $ANTLR end "rule__Tournament__Group_15_2__1"


    // $ANTLR start "rule__Tournament__Group_15_2__1__Impl"
    // InternalEsportDsl.g:2636:1: rule__Tournament__Group_15_2__1__Impl : ( ( rule__Tournament__GroupstagesAssignment_15_2_1 ) ) ;
    public final void rule__Tournament__Group_15_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2640:1: ( ( ( rule__Tournament__GroupstagesAssignment_15_2_1 ) ) )
            // InternalEsportDsl.g:2641:1: ( ( rule__Tournament__GroupstagesAssignment_15_2_1 ) )
            {
            // InternalEsportDsl.g:2641:1: ( ( rule__Tournament__GroupstagesAssignment_15_2_1 ) )
            // InternalEsportDsl.g:2642:2: ( rule__Tournament__GroupstagesAssignment_15_2_1 )
            {
             before(grammarAccess.getTournamentAccess().getGroupstagesAssignment_15_2_1()); 
            // InternalEsportDsl.g:2643:2: ( rule__Tournament__GroupstagesAssignment_15_2_1 )
            // InternalEsportDsl.g:2643:3: rule__Tournament__GroupstagesAssignment_15_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Tournament__GroupstagesAssignment_15_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTournamentAccess().getGroupstagesAssignment_15_2_1()); 

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
    // $ANTLR end "rule__Tournament__Group_15_2__1__Impl"


    // $ANTLR start "rule__League__Group__0"
    // InternalEsportDsl.g:2652:1: rule__League__Group__0 : rule__League__Group__0__Impl rule__League__Group__1 ;
    public final void rule__League__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2656:1: ( rule__League__Group__0__Impl rule__League__Group__1 )
            // InternalEsportDsl.g:2657:2: rule__League__Group__0__Impl rule__League__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__League__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__League__Group__1();

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
    // $ANTLR end "rule__League__Group__0"


    // $ANTLR start "rule__League__Group__0__Impl"
    // InternalEsportDsl.g:2664:1: rule__League__Group__0__Impl : ( () ) ;
    public final void rule__League__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2668:1: ( ( () ) )
            // InternalEsportDsl.g:2669:1: ( () )
            {
            // InternalEsportDsl.g:2669:1: ( () )
            // InternalEsportDsl.g:2670:2: ()
            {
             before(grammarAccess.getLeagueAccess().getLeagueAction_0()); 
            // InternalEsportDsl.g:2671:2: ()
            // InternalEsportDsl.g:2671:3: 
            {
            }

             after(grammarAccess.getLeagueAccess().getLeagueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__Group__0__Impl"


    // $ANTLR start "rule__League__Group__1"
    // InternalEsportDsl.g:2679:1: rule__League__Group__1 : rule__League__Group__1__Impl rule__League__Group__2 ;
    public final void rule__League__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2683:1: ( rule__League__Group__1__Impl rule__League__Group__2 )
            // InternalEsportDsl.g:2684:2: rule__League__Group__1__Impl rule__League__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__League__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__League__Group__2();

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
    // $ANTLR end "rule__League__Group__1"


    // $ANTLR start "rule__League__Group__1__Impl"
    // InternalEsportDsl.g:2691:1: rule__League__Group__1__Impl : ( 'League' ) ;
    public final void rule__League__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2695:1: ( ( 'League' ) )
            // InternalEsportDsl.g:2696:1: ( 'League' )
            {
            // InternalEsportDsl.g:2696:1: ( 'League' )
            // InternalEsportDsl.g:2697:2: 'League'
            {
             before(grammarAccess.getLeagueAccess().getLeagueKeyword_1()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getLeagueAccess().getLeagueKeyword_1()); 

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
    // $ANTLR end "rule__League__Group__1__Impl"


    // $ANTLR start "rule__League__Group__2"
    // InternalEsportDsl.g:2706:1: rule__League__Group__2 : rule__League__Group__2__Impl rule__League__Group__3 ;
    public final void rule__League__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2710:1: ( rule__League__Group__2__Impl rule__League__Group__3 )
            // InternalEsportDsl.g:2711:2: rule__League__Group__2__Impl rule__League__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__League__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__League__Group__3();

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
    // $ANTLR end "rule__League__Group__2"


    // $ANTLR start "rule__League__Group__2__Impl"
    // InternalEsportDsl.g:2718:1: rule__League__Group__2__Impl : ( ( rule__League__NameAssignment_2 ) ) ;
    public final void rule__League__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2722:1: ( ( ( rule__League__NameAssignment_2 ) ) )
            // InternalEsportDsl.g:2723:1: ( ( rule__League__NameAssignment_2 ) )
            {
            // InternalEsportDsl.g:2723:1: ( ( rule__League__NameAssignment_2 ) )
            // InternalEsportDsl.g:2724:2: ( rule__League__NameAssignment_2 )
            {
             before(grammarAccess.getLeagueAccess().getNameAssignment_2()); 
            // InternalEsportDsl.g:2725:2: ( rule__League__NameAssignment_2 )
            // InternalEsportDsl.g:2725:3: rule__League__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__League__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLeagueAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__League__Group__2__Impl"


    // $ANTLR start "rule__League__Group__3"
    // InternalEsportDsl.g:2733:1: rule__League__Group__3 : rule__League__Group__3__Impl rule__League__Group__4 ;
    public final void rule__League__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2737:1: ( rule__League__Group__3__Impl rule__League__Group__4 )
            // InternalEsportDsl.g:2738:2: rule__League__Group__3__Impl rule__League__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__League__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__League__Group__4();

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
    // $ANTLR end "rule__League__Group__3"


    // $ANTLR start "rule__League__Group__3__Impl"
    // InternalEsportDsl.g:2745:1: rule__League__Group__3__Impl : ( ':' ) ;
    public final void rule__League__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2749:1: ( ( ':' ) )
            // InternalEsportDsl.g:2750:1: ( ':' )
            {
            // InternalEsportDsl.g:2750:1: ( ':' )
            // InternalEsportDsl.g:2751:2: ':'
            {
             before(grammarAccess.getLeagueAccess().getColonKeyword_3()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getLeagueAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__League__Group__3__Impl"


    // $ANTLR start "rule__League__Group__4"
    // InternalEsportDsl.g:2760:1: rule__League__Group__4 : rule__League__Group__4__Impl rule__League__Group__5 ;
    public final void rule__League__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2764:1: ( rule__League__Group__4__Impl rule__League__Group__5 )
            // InternalEsportDsl.g:2765:2: rule__League__Group__4__Impl rule__League__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__League__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__League__Group__5();

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
    // $ANTLR end "rule__League__Group__4"


    // $ANTLR start "rule__League__Group__4__Impl"
    // InternalEsportDsl.g:2772:1: rule__League__Group__4__Impl : ( ( rule__League__SizeAssignment_4 ) ) ;
    public final void rule__League__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2776:1: ( ( ( rule__League__SizeAssignment_4 ) ) )
            // InternalEsportDsl.g:2777:1: ( ( rule__League__SizeAssignment_4 ) )
            {
            // InternalEsportDsl.g:2777:1: ( ( rule__League__SizeAssignment_4 ) )
            // InternalEsportDsl.g:2778:2: ( rule__League__SizeAssignment_4 )
            {
             before(grammarAccess.getLeagueAccess().getSizeAssignment_4()); 
            // InternalEsportDsl.g:2779:2: ( rule__League__SizeAssignment_4 )
            // InternalEsportDsl.g:2779:3: rule__League__SizeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__League__SizeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLeagueAccess().getSizeAssignment_4()); 

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
    // $ANTLR end "rule__League__Group__4__Impl"


    // $ANTLR start "rule__League__Group__5"
    // InternalEsportDsl.g:2787:1: rule__League__Group__5 : rule__League__Group__5__Impl rule__League__Group__6 ;
    public final void rule__League__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2791:1: ( rule__League__Group__5__Impl rule__League__Group__6 )
            // InternalEsportDsl.g:2792:2: rule__League__Group__5__Impl rule__League__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__League__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__League__Group__6();

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
    // $ANTLR end "rule__League__Group__5"


    // $ANTLR start "rule__League__Group__5__Impl"
    // InternalEsportDsl.g:2799:1: rule__League__Group__5__Impl : ( ( rule__League__YearAssignment_5 ) ) ;
    public final void rule__League__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2803:1: ( ( ( rule__League__YearAssignment_5 ) ) )
            // InternalEsportDsl.g:2804:1: ( ( rule__League__YearAssignment_5 ) )
            {
            // InternalEsportDsl.g:2804:1: ( ( rule__League__YearAssignment_5 ) )
            // InternalEsportDsl.g:2805:2: ( rule__League__YearAssignment_5 )
            {
             before(grammarAccess.getLeagueAccess().getYearAssignment_5()); 
            // InternalEsportDsl.g:2806:2: ( rule__League__YearAssignment_5 )
            // InternalEsportDsl.g:2806:3: rule__League__YearAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__League__YearAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLeagueAccess().getYearAssignment_5()); 

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
    // $ANTLR end "rule__League__Group__5__Impl"


    // $ANTLR start "rule__League__Group__6"
    // InternalEsportDsl.g:2814:1: rule__League__Group__6 : rule__League__Group__6__Impl rule__League__Group__7 ;
    public final void rule__League__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2818:1: ( rule__League__Group__6__Impl rule__League__Group__7 )
            // InternalEsportDsl.g:2819:2: rule__League__Group__6__Impl rule__League__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__League__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__League__Group__7();

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
    // $ANTLR end "rule__League__Group__6"


    // $ANTLR start "rule__League__Group__6__Impl"
    // InternalEsportDsl.g:2826:1: rule__League__Group__6__Impl : ( ( rule__League__SeasonAssignment_6 ) ) ;
    public final void rule__League__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2830:1: ( ( ( rule__League__SeasonAssignment_6 ) ) )
            // InternalEsportDsl.g:2831:1: ( ( rule__League__SeasonAssignment_6 ) )
            {
            // InternalEsportDsl.g:2831:1: ( ( rule__League__SeasonAssignment_6 ) )
            // InternalEsportDsl.g:2832:2: ( rule__League__SeasonAssignment_6 )
            {
             before(grammarAccess.getLeagueAccess().getSeasonAssignment_6()); 
            // InternalEsportDsl.g:2833:2: ( rule__League__SeasonAssignment_6 )
            // InternalEsportDsl.g:2833:3: rule__League__SeasonAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__League__SeasonAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getLeagueAccess().getSeasonAssignment_6()); 

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
    // $ANTLR end "rule__League__Group__6__Impl"


    // $ANTLR start "rule__League__Group__7"
    // InternalEsportDsl.g:2841:1: rule__League__Group__7 : rule__League__Group__7__Impl rule__League__Group__8 ;
    public final void rule__League__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2845:1: ( rule__League__Group__7__Impl rule__League__Group__8 )
            // InternalEsportDsl.g:2846:2: rule__League__Group__7__Impl rule__League__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__League__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__League__Group__8();

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
    // $ANTLR end "rule__League__Group__7"


    // $ANTLR start "rule__League__Group__7__Impl"
    // InternalEsportDsl.g:2853:1: rule__League__Group__7__Impl : ( ( rule__League__ZoneAssignment_7 )? ) ;
    public final void rule__League__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2857:1: ( ( ( rule__League__ZoneAssignment_7 )? ) )
            // InternalEsportDsl.g:2858:1: ( ( rule__League__ZoneAssignment_7 )? )
            {
            // InternalEsportDsl.g:2858:1: ( ( rule__League__ZoneAssignment_7 )? )
            // InternalEsportDsl.g:2859:2: ( rule__League__ZoneAssignment_7 )?
            {
             before(grammarAccess.getLeagueAccess().getZoneAssignment_7()); 
            // InternalEsportDsl.g:2860:2: ( rule__League__ZoneAssignment_7 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_ID)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalEsportDsl.g:2860:3: rule__League__ZoneAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__League__ZoneAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLeagueAccess().getZoneAssignment_7()); 

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
    // $ANTLR end "rule__League__Group__7__Impl"


    // $ANTLR start "rule__League__Group__8"
    // InternalEsportDsl.g:2868:1: rule__League__Group__8 : rule__League__Group__8__Impl rule__League__Group__9 ;
    public final void rule__League__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2872:1: ( rule__League__Group__8__Impl rule__League__Group__9 )
            // InternalEsportDsl.g:2873:2: rule__League__Group__8__Impl rule__League__Group__9
            {
            pushFollow(FOLLOW_20);
            rule__League__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__League__Group__9();

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
    // $ANTLR end "rule__League__Group__8"


    // $ANTLR start "rule__League__Group__8__Impl"
    // InternalEsportDsl.g:2880:1: rule__League__Group__8__Impl : ( ( rule__League__Group_8__0 )? ) ;
    public final void rule__League__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2884:1: ( ( ( rule__League__Group_8__0 )? ) )
            // InternalEsportDsl.g:2885:1: ( ( rule__League__Group_8__0 )? )
            {
            // InternalEsportDsl.g:2885:1: ( ( rule__League__Group_8__0 )? )
            // InternalEsportDsl.g:2886:2: ( rule__League__Group_8__0 )?
            {
             before(grammarAccess.getLeagueAccess().getGroup_8()); 
            // InternalEsportDsl.g:2887:2: ( rule__League__Group_8__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==56) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalEsportDsl.g:2887:3: rule__League__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__League__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLeagueAccess().getGroup_8()); 

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
    // $ANTLR end "rule__League__Group__8__Impl"


    // $ANTLR start "rule__League__Group__9"
    // InternalEsportDsl.g:2895:1: rule__League__Group__9 : rule__League__Group__9__Impl ;
    public final void rule__League__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2899:1: ( rule__League__Group__9__Impl )
            // InternalEsportDsl.g:2900:2: rule__League__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__League__Group__9__Impl();

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
    // $ANTLR end "rule__League__Group__9"


    // $ANTLR start "rule__League__Group__9__Impl"
    // InternalEsportDsl.g:2906:1: rule__League__Group__9__Impl : ( ( rule__League__GroupstageAssignment_9 )? ) ;
    public final void rule__League__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2910:1: ( ( ( rule__League__GroupstageAssignment_9 )? ) )
            // InternalEsportDsl.g:2911:1: ( ( rule__League__GroupstageAssignment_9 )? )
            {
            // InternalEsportDsl.g:2911:1: ( ( rule__League__GroupstageAssignment_9 )? )
            // InternalEsportDsl.g:2912:2: ( rule__League__GroupstageAssignment_9 )?
            {
             before(grammarAccess.getLeagueAccess().getGroupstageAssignment_9()); 
            // InternalEsportDsl.g:2913:2: ( rule__League__GroupstageAssignment_9 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==69) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalEsportDsl.g:2913:3: rule__League__GroupstageAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__League__GroupstageAssignment_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLeagueAccess().getGroupstageAssignment_9()); 

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
    // $ANTLR end "rule__League__Group__9__Impl"


    // $ANTLR start "rule__League__Group_8__0"
    // InternalEsportDsl.g:2922:1: rule__League__Group_8__0 : rule__League__Group_8__0__Impl rule__League__Group_8__1 ;
    public final void rule__League__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2926:1: ( rule__League__Group_8__0__Impl rule__League__Group_8__1 )
            // InternalEsportDsl.g:2927:2: rule__League__Group_8__0__Impl rule__League__Group_8__1
            {
            pushFollow(FOLLOW_5);
            rule__League__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__League__Group_8__1();

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
    // $ANTLR end "rule__League__Group_8__0"


    // $ANTLR start "rule__League__Group_8__0__Impl"
    // InternalEsportDsl.g:2934:1: rule__League__Group_8__0__Impl : ( '(' ) ;
    public final void rule__League__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2938:1: ( ( '(' ) )
            // InternalEsportDsl.g:2939:1: ( '(' )
            {
            // InternalEsportDsl.g:2939:1: ( '(' )
            // InternalEsportDsl.g:2940:2: '('
            {
             before(grammarAccess.getLeagueAccess().getLeftParenthesisKeyword_8_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getLeagueAccess().getLeftParenthesisKeyword_8_0()); 

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
    // $ANTLR end "rule__League__Group_8__0__Impl"


    // $ANTLR start "rule__League__Group_8__1"
    // InternalEsportDsl.g:2949:1: rule__League__Group_8__1 : rule__League__Group_8__1__Impl rule__League__Group_8__2 ;
    public final void rule__League__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2953:1: ( rule__League__Group_8__1__Impl rule__League__Group_8__2 )
            // InternalEsportDsl.g:2954:2: rule__League__Group_8__1__Impl rule__League__Group_8__2
            {
            pushFollow(FOLLOW_9);
            rule__League__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__League__Group_8__2();

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
    // $ANTLR end "rule__League__Group_8__1"


    // $ANTLR start "rule__League__Group_8__1__Impl"
    // InternalEsportDsl.g:2961:1: rule__League__Group_8__1__Impl : ( ( rule__League__QualifiesForAssignment_8_1 ) ) ;
    public final void rule__League__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2965:1: ( ( ( rule__League__QualifiesForAssignment_8_1 ) ) )
            // InternalEsportDsl.g:2966:1: ( ( rule__League__QualifiesForAssignment_8_1 ) )
            {
            // InternalEsportDsl.g:2966:1: ( ( rule__League__QualifiesForAssignment_8_1 ) )
            // InternalEsportDsl.g:2967:2: ( rule__League__QualifiesForAssignment_8_1 )
            {
             before(grammarAccess.getLeagueAccess().getQualifiesForAssignment_8_1()); 
            // InternalEsportDsl.g:2968:2: ( rule__League__QualifiesForAssignment_8_1 )
            // InternalEsportDsl.g:2968:3: rule__League__QualifiesForAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__League__QualifiesForAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getLeagueAccess().getQualifiesForAssignment_8_1()); 

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
    // $ANTLR end "rule__League__Group_8__1__Impl"


    // $ANTLR start "rule__League__Group_8__2"
    // InternalEsportDsl.g:2976:1: rule__League__Group_8__2 : rule__League__Group_8__2__Impl rule__League__Group_8__3 ;
    public final void rule__League__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2980:1: ( rule__League__Group_8__2__Impl rule__League__Group_8__3 )
            // InternalEsportDsl.g:2981:2: rule__League__Group_8__2__Impl rule__League__Group_8__3
            {
            pushFollow(FOLLOW_9);
            rule__League__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__League__Group_8__3();

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
    // $ANTLR end "rule__League__Group_8__2"


    // $ANTLR start "rule__League__Group_8__2__Impl"
    // InternalEsportDsl.g:2988:1: rule__League__Group_8__2__Impl : ( ( rule__League__Group_8_2__0 )* ) ;
    public final void rule__League__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:2992:1: ( ( ( rule__League__Group_8_2__0 )* ) )
            // InternalEsportDsl.g:2993:1: ( ( rule__League__Group_8_2__0 )* )
            {
            // InternalEsportDsl.g:2993:1: ( ( rule__League__Group_8_2__0 )* )
            // InternalEsportDsl.g:2994:2: ( rule__League__Group_8_2__0 )*
            {
             before(grammarAccess.getLeagueAccess().getGroup_8_2()); 
            // InternalEsportDsl.g:2995:2: ( rule__League__Group_8_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==58) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalEsportDsl.g:2995:3: rule__League__Group_8_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__League__Group_8_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getLeagueAccess().getGroup_8_2()); 

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
    // $ANTLR end "rule__League__Group_8__2__Impl"


    // $ANTLR start "rule__League__Group_8__3"
    // InternalEsportDsl.g:3003:1: rule__League__Group_8__3 : rule__League__Group_8__3__Impl ;
    public final void rule__League__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3007:1: ( rule__League__Group_8__3__Impl )
            // InternalEsportDsl.g:3008:2: rule__League__Group_8__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__League__Group_8__3__Impl();

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
    // $ANTLR end "rule__League__Group_8__3"


    // $ANTLR start "rule__League__Group_8__3__Impl"
    // InternalEsportDsl.g:3014:1: rule__League__Group_8__3__Impl : ( ')' ) ;
    public final void rule__League__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3018:1: ( ( ')' ) )
            // InternalEsportDsl.g:3019:1: ( ')' )
            {
            // InternalEsportDsl.g:3019:1: ( ')' )
            // InternalEsportDsl.g:3020:2: ')'
            {
             before(grammarAccess.getLeagueAccess().getRightParenthesisKeyword_8_3()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getLeagueAccess().getRightParenthesisKeyword_8_3()); 

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
    // $ANTLR end "rule__League__Group_8__3__Impl"


    // $ANTLR start "rule__League__Group_8_2__0"
    // InternalEsportDsl.g:3030:1: rule__League__Group_8_2__0 : rule__League__Group_8_2__0__Impl rule__League__Group_8_2__1 ;
    public final void rule__League__Group_8_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3034:1: ( rule__League__Group_8_2__0__Impl rule__League__Group_8_2__1 )
            // InternalEsportDsl.g:3035:2: rule__League__Group_8_2__0__Impl rule__League__Group_8_2__1
            {
            pushFollow(FOLLOW_5);
            rule__League__Group_8_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__League__Group_8_2__1();

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
    // $ANTLR end "rule__League__Group_8_2__0"


    // $ANTLR start "rule__League__Group_8_2__0__Impl"
    // InternalEsportDsl.g:3042:1: rule__League__Group_8_2__0__Impl : ( ',' ) ;
    public final void rule__League__Group_8_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3046:1: ( ( ',' ) )
            // InternalEsportDsl.g:3047:1: ( ',' )
            {
            // InternalEsportDsl.g:3047:1: ( ',' )
            // InternalEsportDsl.g:3048:2: ','
            {
             before(grammarAccess.getLeagueAccess().getCommaKeyword_8_2_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getLeagueAccess().getCommaKeyword_8_2_0()); 

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
    // $ANTLR end "rule__League__Group_8_2__0__Impl"


    // $ANTLR start "rule__League__Group_8_2__1"
    // InternalEsportDsl.g:3057:1: rule__League__Group_8_2__1 : rule__League__Group_8_2__1__Impl ;
    public final void rule__League__Group_8_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3061:1: ( rule__League__Group_8_2__1__Impl )
            // InternalEsportDsl.g:3062:2: rule__League__Group_8_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__League__Group_8_2__1__Impl();

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
    // $ANTLR end "rule__League__Group_8_2__1"


    // $ANTLR start "rule__League__Group_8_2__1__Impl"
    // InternalEsportDsl.g:3068:1: rule__League__Group_8_2__1__Impl : ( ( rule__League__QualifiesForAssignment_8_2_1 ) ) ;
    public final void rule__League__Group_8_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3072:1: ( ( ( rule__League__QualifiesForAssignment_8_2_1 ) ) )
            // InternalEsportDsl.g:3073:1: ( ( rule__League__QualifiesForAssignment_8_2_1 ) )
            {
            // InternalEsportDsl.g:3073:1: ( ( rule__League__QualifiesForAssignment_8_2_1 ) )
            // InternalEsportDsl.g:3074:2: ( rule__League__QualifiesForAssignment_8_2_1 )
            {
             before(grammarAccess.getLeagueAccess().getQualifiesForAssignment_8_2_1()); 
            // InternalEsportDsl.g:3075:2: ( rule__League__QualifiesForAssignment_8_2_1 )
            // InternalEsportDsl.g:3075:3: rule__League__QualifiesForAssignment_8_2_1
            {
            pushFollow(FOLLOW_2);
            rule__League__QualifiesForAssignment_8_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLeagueAccess().getQualifiesForAssignment_8_2_1()); 

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
    // $ANTLR end "rule__League__Group_8_2__1__Impl"


    // $ANTLR start "rule__Team__Group__0"
    // InternalEsportDsl.g:3084:1: rule__Team__Group__0 : rule__Team__Group__0__Impl rule__Team__Group__1 ;
    public final void rule__Team__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3088:1: ( rule__Team__Group__0__Impl rule__Team__Group__1 )
            // InternalEsportDsl.g:3089:2: rule__Team__Group__0__Impl rule__Team__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Team__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Team__Group__1();

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
    // $ANTLR end "rule__Team__Group__0"


    // $ANTLR start "rule__Team__Group__0__Impl"
    // InternalEsportDsl.g:3096:1: rule__Team__Group__0__Impl : ( () ) ;
    public final void rule__Team__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3100:1: ( ( () ) )
            // InternalEsportDsl.g:3101:1: ( () )
            {
            // InternalEsportDsl.g:3101:1: ( () )
            // InternalEsportDsl.g:3102:2: ()
            {
             before(grammarAccess.getTeamAccess().getTeamAction_0()); 
            // InternalEsportDsl.g:3103:2: ()
            // InternalEsportDsl.g:3103:3: 
            {
            }

             after(grammarAccess.getTeamAccess().getTeamAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__0__Impl"


    // $ANTLR start "rule__Team__Group__1"
    // InternalEsportDsl.g:3111:1: rule__Team__Group__1 : rule__Team__Group__1__Impl rule__Team__Group__2 ;
    public final void rule__Team__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3115:1: ( rule__Team__Group__1__Impl rule__Team__Group__2 )
            // InternalEsportDsl.g:3116:2: rule__Team__Group__1__Impl rule__Team__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Team__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Team__Group__2();

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
    // $ANTLR end "rule__Team__Group__1"


    // $ANTLR start "rule__Team__Group__1__Impl"
    // InternalEsportDsl.g:3123:1: rule__Team__Group__1__Impl : ( 'Team' ) ;
    public final void rule__Team__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3127:1: ( ( 'Team' ) )
            // InternalEsportDsl.g:3128:1: ( 'Team' )
            {
            // InternalEsportDsl.g:3128:1: ( 'Team' )
            // InternalEsportDsl.g:3129:2: 'Team'
            {
             before(grammarAccess.getTeamAccess().getTeamKeyword_1()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getTeamAccess().getTeamKeyword_1()); 

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
    // $ANTLR end "rule__Team__Group__1__Impl"


    // $ANTLR start "rule__Team__Group__2"
    // InternalEsportDsl.g:3138:1: rule__Team__Group__2 : rule__Team__Group__2__Impl rule__Team__Group__3 ;
    public final void rule__Team__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3142:1: ( rule__Team__Group__2__Impl rule__Team__Group__3 )
            // InternalEsportDsl.g:3143:2: rule__Team__Group__2__Impl rule__Team__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Team__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Team__Group__3();

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
    // $ANTLR end "rule__Team__Group__2"


    // $ANTLR start "rule__Team__Group__2__Impl"
    // InternalEsportDsl.g:3150:1: rule__Team__Group__2__Impl : ( ( rule__Team__NameAssignment_2 ) ) ;
    public final void rule__Team__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3154:1: ( ( ( rule__Team__NameAssignment_2 ) ) )
            // InternalEsportDsl.g:3155:1: ( ( rule__Team__NameAssignment_2 ) )
            {
            // InternalEsportDsl.g:3155:1: ( ( rule__Team__NameAssignment_2 ) )
            // InternalEsportDsl.g:3156:2: ( rule__Team__NameAssignment_2 )
            {
             before(grammarAccess.getTeamAccess().getNameAssignment_2()); 
            // InternalEsportDsl.g:3157:2: ( rule__Team__NameAssignment_2 )
            // InternalEsportDsl.g:3157:3: rule__Team__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Team__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTeamAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Team__Group__2__Impl"


    // $ANTLR start "rule__Team__Group__3"
    // InternalEsportDsl.g:3165:1: rule__Team__Group__3 : rule__Team__Group__3__Impl rule__Team__Group__4 ;
    public final void rule__Team__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3169:1: ( rule__Team__Group__3__Impl rule__Team__Group__4 )
            // InternalEsportDsl.g:3170:2: rule__Team__Group__3__Impl rule__Team__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Team__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Team__Group__4();

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
    // $ANTLR end "rule__Team__Group__3"


    // $ANTLR start "rule__Team__Group__3__Impl"
    // InternalEsportDsl.g:3177:1: rule__Team__Group__3__Impl : ( ':' ) ;
    public final void rule__Team__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3181:1: ( ( ':' ) )
            // InternalEsportDsl.g:3182:1: ( ':' )
            {
            // InternalEsportDsl.g:3182:1: ( ':' )
            // InternalEsportDsl.g:3183:2: ':'
            {
             before(grammarAccess.getTeamAccess().getColonKeyword_3()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getTeamAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__Team__Group__3__Impl"


    // $ANTLR start "rule__Team__Group__4"
    // InternalEsportDsl.g:3192:1: rule__Team__Group__4 : rule__Team__Group__4__Impl rule__Team__Group__5 ;
    public final void rule__Team__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3196:1: ( rule__Team__Group__4__Impl rule__Team__Group__5 )
            // InternalEsportDsl.g:3197:2: rule__Team__Group__4__Impl rule__Team__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Team__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Team__Group__5();

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
    // $ANTLR end "rule__Team__Group__4"


    // $ANTLR start "rule__Team__Group__4__Impl"
    // InternalEsportDsl.g:3204:1: rule__Team__Group__4__Impl : ( ( rule__Team__ChampionshipPointsAssignment_4 ) ) ;
    public final void rule__Team__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3208:1: ( ( ( rule__Team__ChampionshipPointsAssignment_4 ) ) )
            // InternalEsportDsl.g:3209:1: ( ( rule__Team__ChampionshipPointsAssignment_4 ) )
            {
            // InternalEsportDsl.g:3209:1: ( ( rule__Team__ChampionshipPointsAssignment_4 ) )
            // InternalEsportDsl.g:3210:2: ( rule__Team__ChampionshipPointsAssignment_4 )
            {
             before(grammarAccess.getTeamAccess().getChampionshipPointsAssignment_4()); 
            // InternalEsportDsl.g:3211:2: ( rule__Team__ChampionshipPointsAssignment_4 )
            // InternalEsportDsl.g:3211:3: rule__Team__ChampionshipPointsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Team__ChampionshipPointsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTeamAccess().getChampionshipPointsAssignment_4()); 

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
    // $ANTLR end "rule__Team__Group__4__Impl"


    // $ANTLR start "rule__Team__Group__5"
    // InternalEsportDsl.g:3219:1: rule__Team__Group__5 : rule__Team__Group__5__Impl rule__Team__Group__6 ;
    public final void rule__Team__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3223:1: ( rule__Team__Group__5__Impl rule__Team__Group__6 )
            // InternalEsportDsl.g:3224:2: rule__Team__Group__5__Impl rule__Team__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__Team__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Team__Group__6();

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
    // $ANTLR end "rule__Team__Group__5"


    // $ANTLR start "rule__Team__Group__5__Impl"
    // InternalEsportDsl.g:3231:1: rule__Team__Group__5__Impl : ( ( rule__Team__CoachAssignment_5 )? ) ;
    public final void rule__Team__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3235:1: ( ( ( rule__Team__CoachAssignment_5 )? ) )
            // InternalEsportDsl.g:3236:1: ( ( rule__Team__CoachAssignment_5 )? )
            {
            // InternalEsportDsl.g:3236:1: ( ( rule__Team__CoachAssignment_5 )? )
            // InternalEsportDsl.g:3237:2: ( rule__Team__CoachAssignment_5 )?
            {
             before(grammarAccess.getTeamAccess().getCoachAssignment_5()); 
            // InternalEsportDsl.g:3238:2: ( rule__Team__CoachAssignment_5 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==73) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalEsportDsl.g:3238:3: rule__Team__CoachAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Team__CoachAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTeamAccess().getCoachAssignment_5()); 

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
    // $ANTLR end "rule__Team__Group__5__Impl"


    // $ANTLR start "rule__Team__Group__6"
    // InternalEsportDsl.g:3246:1: rule__Team__Group__6 : rule__Team__Group__6__Impl rule__Team__Group__7 ;
    public final void rule__Team__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3250:1: ( rule__Team__Group__6__Impl rule__Team__Group__7 )
            // InternalEsportDsl.g:3251:2: rule__Team__Group__6__Impl rule__Team__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__Team__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Team__Group__7();

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
    // $ANTLR end "rule__Team__Group__6"


    // $ANTLR start "rule__Team__Group__6__Impl"
    // InternalEsportDsl.g:3258:1: rule__Team__Group__6__Impl : ( '(' ) ;
    public final void rule__Team__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3262:1: ( ( '(' ) )
            // InternalEsportDsl.g:3263:1: ( '(' )
            {
            // InternalEsportDsl.g:3263:1: ( '(' )
            // InternalEsportDsl.g:3264:2: '('
            {
             before(grammarAccess.getTeamAccess().getLeftParenthesisKeyword_6()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getTeamAccess().getLeftParenthesisKeyword_6()); 

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
    // $ANTLR end "rule__Team__Group__6__Impl"


    // $ANTLR start "rule__Team__Group__7"
    // InternalEsportDsl.g:3273:1: rule__Team__Group__7 : rule__Team__Group__7__Impl rule__Team__Group__8 ;
    public final void rule__Team__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3277:1: ( rule__Team__Group__7__Impl rule__Team__Group__8 )
            // InternalEsportDsl.g:3278:2: rule__Team__Group__7__Impl rule__Team__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Team__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Team__Group__8();

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
    // $ANTLR end "rule__Team__Group__7"


    // $ANTLR start "rule__Team__Group__7__Impl"
    // InternalEsportDsl.g:3285:1: rule__Team__Group__7__Impl : ( ( rule__Team__PlayersAssignment_7 ) ) ;
    public final void rule__Team__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3289:1: ( ( ( rule__Team__PlayersAssignment_7 ) ) )
            // InternalEsportDsl.g:3290:1: ( ( rule__Team__PlayersAssignment_7 ) )
            {
            // InternalEsportDsl.g:3290:1: ( ( rule__Team__PlayersAssignment_7 ) )
            // InternalEsportDsl.g:3291:2: ( rule__Team__PlayersAssignment_7 )
            {
             before(grammarAccess.getTeamAccess().getPlayersAssignment_7()); 
            // InternalEsportDsl.g:3292:2: ( rule__Team__PlayersAssignment_7 )
            // InternalEsportDsl.g:3292:3: rule__Team__PlayersAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Team__PlayersAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getTeamAccess().getPlayersAssignment_7()); 

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
    // $ANTLR end "rule__Team__Group__7__Impl"


    // $ANTLR start "rule__Team__Group__8"
    // InternalEsportDsl.g:3300:1: rule__Team__Group__8 : rule__Team__Group__8__Impl rule__Team__Group__9 ;
    public final void rule__Team__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3304:1: ( rule__Team__Group__8__Impl rule__Team__Group__9 )
            // InternalEsportDsl.g:3305:2: rule__Team__Group__8__Impl rule__Team__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__Team__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Team__Group__9();

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
    // $ANTLR end "rule__Team__Group__8"


    // $ANTLR start "rule__Team__Group__8__Impl"
    // InternalEsportDsl.g:3312:1: rule__Team__Group__8__Impl : ( ( rule__Team__Group_8__0 )* ) ;
    public final void rule__Team__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3316:1: ( ( ( rule__Team__Group_8__0 )* ) )
            // InternalEsportDsl.g:3317:1: ( ( rule__Team__Group_8__0 )* )
            {
            // InternalEsportDsl.g:3317:1: ( ( rule__Team__Group_8__0 )* )
            // InternalEsportDsl.g:3318:2: ( rule__Team__Group_8__0 )*
            {
             before(grammarAccess.getTeamAccess().getGroup_8()); 
            // InternalEsportDsl.g:3319:2: ( rule__Team__Group_8__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==58) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalEsportDsl.g:3319:3: rule__Team__Group_8__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Team__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getTeamAccess().getGroup_8()); 

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
    // $ANTLR end "rule__Team__Group__8__Impl"


    // $ANTLR start "rule__Team__Group__9"
    // InternalEsportDsl.g:3327:1: rule__Team__Group__9 : rule__Team__Group__9__Impl ;
    public final void rule__Team__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3331:1: ( rule__Team__Group__9__Impl )
            // InternalEsportDsl.g:3332:2: rule__Team__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Team__Group__9__Impl();

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
    // $ANTLR end "rule__Team__Group__9"


    // $ANTLR start "rule__Team__Group__9__Impl"
    // InternalEsportDsl.g:3338:1: rule__Team__Group__9__Impl : ( ')' ) ;
    public final void rule__Team__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3342:1: ( ( ')' ) )
            // InternalEsportDsl.g:3343:1: ( ')' )
            {
            // InternalEsportDsl.g:3343:1: ( ')' )
            // InternalEsportDsl.g:3344:2: ')'
            {
             before(grammarAccess.getTeamAccess().getRightParenthesisKeyword_9()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getTeamAccess().getRightParenthesisKeyword_9()); 

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
    // $ANTLR end "rule__Team__Group__9__Impl"


    // $ANTLR start "rule__Team__Group_8__0"
    // InternalEsportDsl.g:3354:1: rule__Team__Group_8__0 : rule__Team__Group_8__0__Impl rule__Team__Group_8__1 ;
    public final void rule__Team__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3358:1: ( rule__Team__Group_8__0__Impl rule__Team__Group_8__1 )
            // InternalEsportDsl.g:3359:2: rule__Team__Group_8__0__Impl rule__Team__Group_8__1
            {
            pushFollow(FOLLOW_22);
            rule__Team__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Team__Group_8__1();

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
    // $ANTLR end "rule__Team__Group_8__0"


    // $ANTLR start "rule__Team__Group_8__0__Impl"
    // InternalEsportDsl.g:3366:1: rule__Team__Group_8__0__Impl : ( ',' ) ;
    public final void rule__Team__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3370:1: ( ( ',' ) )
            // InternalEsportDsl.g:3371:1: ( ',' )
            {
            // InternalEsportDsl.g:3371:1: ( ',' )
            // InternalEsportDsl.g:3372:2: ','
            {
             before(grammarAccess.getTeamAccess().getCommaKeyword_8_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getTeamAccess().getCommaKeyword_8_0()); 

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
    // $ANTLR end "rule__Team__Group_8__0__Impl"


    // $ANTLR start "rule__Team__Group_8__1"
    // InternalEsportDsl.g:3381:1: rule__Team__Group_8__1 : rule__Team__Group_8__1__Impl ;
    public final void rule__Team__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3385:1: ( rule__Team__Group_8__1__Impl )
            // InternalEsportDsl.g:3386:2: rule__Team__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Team__Group_8__1__Impl();

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
    // $ANTLR end "rule__Team__Group_8__1"


    // $ANTLR start "rule__Team__Group_8__1__Impl"
    // InternalEsportDsl.g:3392:1: rule__Team__Group_8__1__Impl : ( ( rule__Team__PlayersAssignment_8_1 ) ) ;
    public final void rule__Team__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3396:1: ( ( ( rule__Team__PlayersAssignment_8_1 ) ) )
            // InternalEsportDsl.g:3397:1: ( ( rule__Team__PlayersAssignment_8_1 ) )
            {
            // InternalEsportDsl.g:3397:1: ( ( rule__Team__PlayersAssignment_8_1 ) )
            // InternalEsportDsl.g:3398:2: ( rule__Team__PlayersAssignment_8_1 )
            {
             before(grammarAccess.getTeamAccess().getPlayersAssignment_8_1()); 
            // InternalEsportDsl.g:3399:2: ( rule__Team__PlayersAssignment_8_1 )
            // InternalEsportDsl.g:3399:3: rule__Team__PlayersAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Team__PlayersAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getTeamAccess().getPlayersAssignment_8_1()); 

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
    // $ANTLR end "rule__Team__Group_8__1__Impl"


    // $ANTLR start "rule__Qualification__Group__0"
    // InternalEsportDsl.g:3408:1: rule__Qualification__Group__0 : rule__Qualification__Group__0__Impl rule__Qualification__Group__1 ;
    public final void rule__Qualification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3412:1: ( rule__Qualification__Group__0__Impl rule__Qualification__Group__1 )
            // InternalEsportDsl.g:3413:2: rule__Qualification__Group__0__Impl rule__Qualification__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Qualification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Qualification__Group__1();

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
    // $ANTLR end "rule__Qualification__Group__0"


    // $ANTLR start "rule__Qualification__Group__0__Impl"
    // InternalEsportDsl.g:3420:1: rule__Qualification__Group__0__Impl : ( () ) ;
    public final void rule__Qualification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3424:1: ( ( () ) )
            // InternalEsportDsl.g:3425:1: ( () )
            {
            // InternalEsportDsl.g:3425:1: ( () )
            // InternalEsportDsl.g:3426:2: ()
            {
             before(grammarAccess.getQualificationAccess().getQualificationAction_0()); 
            // InternalEsportDsl.g:3427:2: ()
            // InternalEsportDsl.g:3427:3: 
            {
            }

             after(grammarAccess.getQualificationAccess().getQualificationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualification__Group__0__Impl"


    // $ANTLR start "rule__Qualification__Group__1"
    // InternalEsportDsl.g:3435:1: rule__Qualification__Group__1 : rule__Qualification__Group__1__Impl rule__Qualification__Group__2 ;
    public final void rule__Qualification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3439:1: ( rule__Qualification__Group__1__Impl rule__Qualification__Group__2 )
            // InternalEsportDsl.g:3440:2: rule__Qualification__Group__1__Impl rule__Qualification__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Qualification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Qualification__Group__2();

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
    // $ANTLR end "rule__Qualification__Group__1"


    // $ANTLR start "rule__Qualification__Group__1__Impl"
    // InternalEsportDsl.g:3447:1: rule__Qualification__Group__1__Impl : ( 'Qualification' ) ;
    public final void rule__Qualification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3451:1: ( ( 'Qualification' ) )
            // InternalEsportDsl.g:3452:1: ( 'Qualification' )
            {
            // InternalEsportDsl.g:3452:1: ( 'Qualification' )
            // InternalEsportDsl.g:3453:2: 'Qualification'
            {
             before(grammarAccess.getQualificationAccess().getQualificationKeyword_1()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getQualificationAccess().getQualificationKeyword_1()); 

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
    // $ANTLR end "rule__Qualification__Group__1__Impl"


    // $ANTLR start "rule__Qualification__Group__2"
    // InternalEsportDsl.g:3462:1: rule__Qualification__Group__2 : rule__Qualification__Group__2__Impl ;
    public final void rule__Qualification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3466:1: ( rule__Qualification__Group__2__Impl )
            // InternalEsportDsl.g:3467:2: rule__Qualification__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Qualification__Group__2__Impl();

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
    // $ANTLR end "rule__Qualification__Group__2"


    // $ANTLR start "rule__Qualification__Group__2__Impl"
    // InternalEsportDsl.g:3473:1: rule__Qualification__Group__2__Impl : ( ( rule__Qualification__NameAssignment_2 ) ) ;
    public final void rule__Qualification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3477:1: ( ( ( rule__Qualification__NameAssignment_2 ) ) )
            // InternalEsportDsl.g:3478:1: ( ( rule__Qualification__NameAssignment_2 ) )
            {
            // InternalEsportDsl.g:3478:1: ( ( rule__Qualification__NameAssignment_2 ) )
            // InternalEsportDsl.g:3479:2: ( rule__Qualification__NameAssignment_2 )
            {
             before(grammarAccess.getQualificationAccess().getNameAssignment_2()); 
            // InternalEsportDsl.g:3480:2: ( rule__Qualification__NameAssignment_2 )
            // InternalEsportDsl.g:3480:3: rule__Qualification__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Qualification__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQualificationAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Qualification__Group__2__Impl"


    // $ANTLR start "rule__Country__Group__0"
    // InternalEsportDsl.g:3489:1: rule__Country__Group__0 : rule__Country__Group__0__Impl rule__Country__Group__1 ;
    public final void rule__Country__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3493:1: ( rule__Country__Group__0__Impl rule__Country__Group__1 )
            // InternalEsportDsl.g:3494:2: rule__Country__Group__0__Impl rule__Country__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Country__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Country__Group__1();

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
    // $ANTLR end "rule__Country__Group__0"


    // $ANTLR start "rule__Country__Group__0__Impl"
    // InternalEsportDsl.g:3501:1: rule__Country__Group__0__Impl : ( () ) ;
    public final void rule__Country__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3505:1: ( ( () ) )
            // InternalEsportDsl.g:3506:1: ( () )
            {
            // InternalEsportDsl.g:3506:1: ( () )
            // InternalEsportDsl.g:3507:2: ()
            {
             before(grammarAccess.getCountryAccess().getCountryAction_0()); 
            // InternalEsportDsl.g:3508:2: ()
            // InternalEsportDsl.g:3508:3: 
            {
            }

             after(grammarAccess.getCountryAccess().getCountryAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group__0__Impl"


    // $ANTLR start "rule__Country__Group__1"
    // InternalEsportDsl.g:3516:1: rule__Country__Group__1 : rule__Country__Group__1__Impl rule__Country__Group__2 ;
    public final void rule__Country__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3520:1: ( rule__Country__Group__1__Impl rule__Country__Group__2 )
            // InternalEsportDsl.g:3521:2: rule__Country__Group__1__Impl rule__Country__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Country__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Country__Group__2();

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
    // $ANTLR end "rule__Country__Group__1"


    // $ANTLR start "rule__Country__Group__1__Impl"
    // InternalEsportDsl.g:3528:1: rule__Country__Group__1__Impl : ( 'Country' ) ;
    public final void rule__Country__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3532:1: ( ( 'Country' ) )
            // InternalEsportDsl.g:3533:1: ( 'Country' )
            {
            // InternalEsportDsl.g:3533:1: ( 'Country' )
            // InternalEsportDsl.g:3534:2: 'Country'
            {
             before(grammarAccess.getCountryAccess().getCountryKeyword_1()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getCountryAccess().getCountryKeyword_1()); 

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
    // $ANTLR end "rule__Country__Group__1__Impl"


    // $ANTLR start "rule__Country__Group__2"
    // InternalEsportDsl.g:3543:1: rule__Country__Group__2 : rule__Country__Group__2__Impl ;
    public final void rule__Country__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3547:1: ( rule__Country__Group__2__Impl )
            // InternalEsportDsl.g:3548:2: rule__Country__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Country__Group__2__Impl();

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
    // $ANTLR end "rule__Country__Group__2"


    // $ANTLR start "rule__Country__Group__2__Impl"
    // InternalEsportDsl.g:3554:1: rule__Country__Group__2__Impl : ( ( rule__Country__NameAssignment_2 ) ) ;
    public final void rule__Country__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3558:1: ( ( ( rule__Country__NameAssignment_2 ) ) )
            // InternalEsportDsl.g:3559:1: ( ( rule__Country__NameAssignment_2 ) )
            {
            // InternalEsportDsl.g:3559:1: ( ( rule__Country__NameAssignment_2 ) )
            // InternalEsportDsl.g:3560:2: ( rule__Country__NameAssignment_2 )
            {
             before(grammarAccess.getCountryAccess().getNameAssignment_2()); 
            // InternalEsportDsl.g:3561:2: ( rule__Country__NameAssignment_2 )
            // InternalEsportDsl.g:3561:3: rule__Country__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Country__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCountryAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Country__Group__2__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalEsportDsl.g:3570:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3574:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalEsportDsl.g:3575:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalEsportDsl.g:3582:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3586:1: ( ( ( '-' )? ) )
            // InternalEsportDsl.g:3587:1: ( ( '-' )? )
            {
            // InternalEsportDsl.g:3587:1: ( ( '-' )? )
            // InternalEsportDsl.g:3588:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalEsportDsl.g:3589:2: ( '-' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==66) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalEsportDsl.g:3589:3: '-'
                    {
                    match(input,66,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalEsportDsl.g:3597:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3601:1: ( rule__EInt__Group__1__Impl )
            // InternalEsportDsl.g:3602:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalEsportDsl.g:3608:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3612:1: ( ( RULE_INT ) )
            // InternalEsportDsl.g:3613:1: ( RULE_INT )
            {
            // InternalEsportDsl.g:3613:1: ( RULE_INT )
            // InternalEsportDsl.g:3614:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__FinalStage__Group__0"
    // InternalEsportDsl.g:3624:1: rule__FinalStage__Group__0 : rule__FinalStage__Group__0__Impl rule__FinalStage__Group__1 ;
    public final void rule__FinalStage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3628:1: ( rule__FinalStage__Group__0__Impl rule__FinalStage__Group__1 )
            // InternalEsportDsl.g:3629:2: rule__FinalStage__Group__0__Impl rule__FinalStage__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__FinalStage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinalStage__Group__1();

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
    // $ANTLR end "rule__FinalStage__Group__0"


    // $ANTLR start "rule__FinalStage__Group__0__Impl"
    // InternalEsportDsl.g:3636:1: rule__FinalStage__Group__0__Impl : ( () ) ;
    public final void rule__FinalStage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3640:1: ( ( () ) )
            // InternalEsportDsl.g:3641:1: ( () )
            {
            // InternalEsportDsl.g:3641:1: ( () )
            // InternalEsportDsl.g:3642:2: ()
            {
             before(grammarAccess.getFinalStageAccess().getFinalStageAction_0()); 
            // InternalEsportDsl.g:3643:2: ()
            // InternalEsportDsl.g:3643:3: 
            {
            }

             after(grammarAccess.getFinalStageAccess().getFinalStageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalStage__Group__0__Impl"


    // $ANTLR start "rule__FinalStage__Group__1"
    // InternalEsportDsl.g:3651:1: rule__FinalStage__Group__1 : rule__FinalStage__Group__1__Impl rule__FinalStage__Group__2 ;
    public final void rule__FinalStage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3655:1: ( rule__FinalStage__Group__1__Impl rule__FinalStage__Group__2 )
            // InternalEsportDsl.g:3656:2: rule__FinalStage__Group__1__Impl rule__FinalStage__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__FinalStage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinalStage__Group__2();

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
    // $ANTLR end "rule__FinalStage__Group__1"


    // $ANTLR start "rule__FinalStage__Group__1__Impl"
    // InternalEsportDsl.g:3663:1: rule__FinalStage__Group__1__Impl : ( 'FinalStage' ) ;
    public final void rule__FinalStage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3667:1: ( ( 'FinalStage' ) )
            // InternalEsportDsl.g:3668:1: ( 'FinalStage' )
            {
            // InternalEsportDsl.g:3668:1: ( 'FinalStage' )
            // InternalEsportDsl.g:3669:2: 'FinalStage'
            {
             before(grammarAccess.getFinalStageAccess().getFinalStageKeyword_1()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getFinalStageAccess().getFinalStageKeyword_1()); 

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
    // $ANTLR end "rule__FinalStage__Group__1__Impl"


    // $ANTLR start "rule__FinalStage__Group__2"
    // InternalEsportDsl.g:3678:1: rule__FinalStage__Group__2 : rule__FinalStage__Group__2__Impl rule__FinalStage__Group__3 ;
    public final void rule__FinalStage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3682:1: ( rule__FinalStage__Group__2__Impl rule__FinalStage__Group__3 )
            // InternalEsportDsl.g:3683:2: rule__FinalStage__Group__2__Impl rule__FinalStage__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__FinalStage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinalStage__Group__3();

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
    // $ANTLR end "rule__FinalStage__Group__2"


    // $ANTLR start "rule__FinalStage__Group__2__Impl"
    // InternalEsportDsl.g:3690:1: rule__FinalStage__Group__2__Impl : ( ':' ) ;
    public final void rule__FinalStage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3694:1: ( ( ':' ) )
            // InternalEsportDsl.g:3695:1: ( ':' )
            {
            // InternalEsportDsl.g:3695:1: ( ':' )
            // InternalEsportDsl.g:3696:2: ':'
            {
             before(grammarAccess.getFinalStageAccess().getColonKeyword_2()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getFinalStageAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__FinalStage__Group__2__Impl"


    // $ANTLR start "rule__FinalStage__Group__3"
    // InternalEsportDsl.g:3705:1: rule__FinalStage__Group__3 : rule__FinalStage__Group__3__Impl rule__FinalStage__Group__4 ;
    public final void rule__FinalStage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3709:1: ( rule__FinalStage__Group__3__Impl rule__FinalStage__Group__4 )
            // InternalEsportDsl.g:3710:2: rule__FinalStage__Group__3__Impl rule__FinalStage__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__FinalStage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinalStage__Group__4();

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
    // $ANTLR end "rule__FinalStage__Group__3"


    // $ANTLR start "rule__FinalStage__Group__3__Impl"
    // InternalEsportDsl.g:3717:1: rule__FinalStage__Group__3__Impl : ( ( rule__FinalStage__MaxNbGamesAssignment_3 ) ) ;
    public final void rule__FinalStage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3721:1: ( ( ( rule__FinalStage__MaxNbGamesAssignment_3 ) ) )
            // InternalEsportDsl.g:3722:1: ( ( rule__FinalStage__MaxNbGamesAssignment_3 ) )
            {
            // InternalEsportDsl.g:3722:1: ( ( rule__FinalStage__MaxNbGamesAssignment_3 ) )
            // InternalEsportDsl.g:3723:2: ( rule__FinalStage__MaxNbGamesAssignment_3 )
            {
             before(grammarAccess.getFinalStageAccess().getMaxNbGamesAssignment_3()); 
            // InternalEsportDsl.g:3724:2: ( rule__FinalStage__MaxNbGamesAssignment_3 )
            // InternalEsportDsl.g:3724:3: rule__FinalStage__MaxNbGamesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__FinalStage__MaxNbGamesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFinalStageAccess().getMaxNbGamesAssignment_3()); 

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
    // $ANTLR end "rule__FinalStage__Group__3__Impl"


    // $ANTLR start "rule__FinalStage__Group__4"
    // InternalEsportDsl.g:3732:1: rule__FinalStage__Group__4 : rule__FinalStage__Group__4__Impl rule__FinalStage__Group__5 ;
    public final void rule__FinalStage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3736:1: ( rule__FinalStage__Group__4__Impl rule__FinalStage__Group__5 )
            // InternalEsportDsl.g:3737:2: rule__FinalStage__Group__4__Impl rule__FinalStage__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__FinalStage__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinalStage__Group__5();

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
    // $ANTLR end "rule__FinalStage__Group__4"


    // $ANTLR start "rule__FinalStage__Group__4__Impl"
    // InternalEsportDsl.g:3744:1: rule__FinalStage__Group__4__Impl : ( '(' ) ;
    public final void rule__FinalStage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3748:1: ( ( '(' ) )
            // InternalEsportDsl.g:3749:1: ( '(' )
            {
            // InternalEsportDsl.g:3749:1: ( '(' )
            // InternalEsportDsl.g:3750:2: '('
            {
             before(grammarAccess.getFinalStageAccess().getLeftParenthesisKeyword_4()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getFinalStageAccess().getLeftParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__FinalStage__Group__4__Impl"


    // $ANTLR start "rule__FinalStage__Group__5"
    // InternalEsportDsl.g:3759:1: rule__FinalStage__Group__5 : rule__FinalStage__Group__5__Impl rule__FinalStage__Group__6 ;
    public final void rule__FinalStage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3763:1: ( rule__FinalStage__Group__5__Impl rule__FinalStage__Group__6 )
            // InternalEsportDsl.g:3764:2: rule__FinalStage__Group__5__Impl rule__FinalStage__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__FinalStage__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinalStage__Group__6();

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
    // $ANTLR end "rule__FinalStage__Group__5"


    // $ANTLR start "rule__FinalStage__Group__5__Impl"
    // InternalEsportDsl.g:3771:1: rule__FinalStage__Group__5__Impl : ( ( rule__FinalStage__TeamsAssignment_5 ) ) ;
    public final void rule__FinalStage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3775:1: ( ( ( rule__FinalStage__TeamsAssignment_5 ) ) )
            // InternalEsportDsl.g:3776:1: ( ( rule__FinalStage__TeamsAssignment_5 ) )
            {
            // InternalEsportDsl.g:3776:1: ( ( rule__FinalStage__TeamsAssignment_5 ) )
            // InternalEsportDsl.g:3777:2: ( rule__FinalStage__TeamsAssignment_5 )
            {
             before(grammarAccess.getFinalStageAccess().getTeamsAssignment_5()); 
            // InternalEsportDsl.g:3778:2: ( rule__FinalStage__TeamsAssignment_5 )
            // InternalEsportDsl.g:3778:3: rule__FinalStage__TeamsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__FinalStage__TeamsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFinalStageAccess().getTeamsAssignment_5()); 

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
    // $ANTLR end "rule__FinalStage__Group__5__Impl"


    // $ANTLR start "rule__FinalStage__Group__6"
    // InternalEsportDsl.g:3786:1: rule__FinalStage__Group__6 : rule__FinalStage__Group__6__Impl rule__FinalStage__Group__7 ;
    public final void rule__FinalStage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3790:1: ( rule__FinalStage__Group__6__Impl rule__FinalStage__Group__7 )
            // InternalEsportDsl.g:3791:2: rule__FinalStage__Group__6__Impl rule__FinalStage__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__FinalStage__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinalStage__Group__7();

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
    // $ANTLR end "rule__FinalStage__Group__6"


    // $ANTLR start "rule__FinalStage__Group__6__Impl"
    // InternalEsportDsl.g:3798:1: rule__FinalStage__Group__6__Impl : ( ( rule__FinalStage__Group_6__0 )* ) ;
    public final void rule__FinalStage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3802:1: ( ( ( rule__FinalStage__Group_6__0 )* ) )
            // InternalEsportDsl.g:3803:1: ( ( rule__FinalStage__Group_6__0 )* )
            {
            // InternalEsportDsl.g:3803:1: ( ( rule__FinalStage__Group_6__0 )* )
            // InternalEsportDsl.g:3804:2: ( rule__FinalStage__Group_6__0 )*
            {
             before(grammarAccess.getFinalStageAccess().getGroup_6()); 
            // InternalEsportDsl.g:3805:2: ( rule__FinalStage__Group_6__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==58) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalEsportDsl.g:3805:3: rule__FinalStage__Group_6__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__FinalStage__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getFinalStageAccess().getGroup_6()); 

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
    // $ANTLR end "rule__FinalStage__Group__6__Impl"


    // $ANTLR start "rule__FinalStage__Group__7"
    // InternalEsportDsl.g:3813:1: rule__FinalStage__Group__7 : rule__FinalStage__Group__7__Impl rule__FinalStage__Group__8 ;
    public final void rule__FinalStage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3817:1: ( rule__FinalStage__Group__7__Impl rule__FinalStage__Group__8 )
            // InternalEsportDsl.g:3818:2: rule__FinalStage__Group__7__Impl rule__FinalStage__Group__8
            {
            pushFollow(FOLLOW_24);
            rule__FinalStage__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinalStage__Group__8();

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
    // $ANTLR end "rule__FinalStage__Group__7"


    // $ANTLR start "rule__FinalStage__Group__7__Impl"
    // InternalEsportDsl.g:3825:1: rule__FinalStage__Group__7__Impl : ( ')' ) ;
    public final void rule__FinalStage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3829:1: ( ( ')' ) )
            // InternalEsportDsl.g:3830:1: ( ')' )
            {
            // InternalEsportDsl.g:3830:1: ( ')' )
            // InternalEsportDsl.g:3831:2: ')'
            {
             before(grammarAccess.getFinalStageAccess().getRightParenthesisKeyword_7()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getFinalStageAccess().getRightParenthesisKeyword_7()); 

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
    // $ANTLR end "rule__FinalStage__Group__7__Impl"


    // $ANTLR start "rule__FinalStage__Group__8"
    // InternalEsportDsl.g:3840:1: rule__FinalStage__Group__8 : rule__FinalStage__Group__8__Impl ;
    public final void rule__FinalStage__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3844:1: ( rule__FinalStage__Group__8__Impl )
            // InternalEsportDsl.g:3845:2: rule__FinalStage__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FinalStage__Group__8__Impl();

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
    // $ANTLR end "rule__FinalStage__Group__8"


    // $ANTLR start "rule__FinalStage__Group__8__Impl"
    // InternalEsportDsl.g:3851:1: rule__FinalStage__Group__8__Impl : ( ( rule__FinalStage__Group_8__0 )? ) ;
    public final void rule__FinalStage__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3855:1: ( ( ( rule__FinalStage__Group_8__0 )? ) )
            // InternalEsportDsl.g:3856:1: ( ( rule__FinalStage__Group_8__0 )? )
            {
            // InternalEsportDsl.g:3856:1: ( ( rule__FinalStage__Group_8__0 )? )
            // InternalEsportDsl.g:3857:2: ( rule__FinalStage__Group_8__0 )?
            {
             before(grammarAccess.getFinalStageAccess().getGroup_8()); 
            // InternalEsportDsl.g:3858:2: ( rule__FinalStage__Group_8__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==68) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalEsportDsl.g:3858:3: rule__FinalStage__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FinalStage__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFinalStageAccess().getGroup_8()); 

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
    // $ANTLR end "rule__FinalStage__Group__8__Impl"


    // $ANTLR start "rule__FinalStage__Group_6__0"
    // InternalEsportDsl.g:3867:1: rule__FinalStage__Group_6__0 : rule__FinalStage__Group_6__0__Impl rule__FinalStage__Group_6__1 ;
    public final void rule__FinalStage__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3871:1: ( rule__FinalStage__Group_6__0__Impl rule__FinalStage__Group_6__1 )
            // InternalEsportDsl.g:3872:2: rule__FinalStage__Group_6__0__Impl rule__FinalStage__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__FinalStage__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinalStage__Group_6__1();

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
    // $ANTLR end "rule__FinalStage__Group_6__0"


    // $ANTLR start "rule__FinalStage__Group_6__0__Impl"
    // InternalEsportDsl.g:3879:1: rule__FinalStage__Group_6__0__Impl : ( ',' ) ;
    public final void rule__FinalStage__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3883:1: ( ( ',' ) )
            // InternalEsportDsl.g:3884:1: ( ',' )
            {
            // InternalEsportDsl.g:3884:1: ( ',' )
            // InternalEsportDsl.g:3885:2: ','
            {
             before(grammarAccess.getFinalStageAccess().getCommaKeyword_6_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getFinalStageAccess().getCommaKeyword_6_0()); 

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
    // $ANTLR end "rule__FinalStage__Group_6__0__Impl"


    // $ANTLR start "rule__FinalStage__Group_6__1"
    // InternalEsportDsl.g:3894:1: rule__FinalStage__Group_6__1 : rule__FinalStage__Group_6__1__Impl ;
    public final void rule__FinalStage__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3898:1: ( rule__FinalStage__Group_6__1__Impl )
            // InternalEsportDsl.g:3899:2: rule__FinalStage__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FinalStage__Group_6__1__Impl();

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
    // $ANTLR end "rule__FinalStage__Group_6__1"


    // $ANTLR start "rule__FinalStage__Group_6__1__Impl"
    // InternalEsportDsl.g:3905:1: rule__FinalStage__Group_6__1__Impl : ( ( rule__FinalStage__TeamsAssignment_6_1 ) ) ;
    public final void rule__FinalStage__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3909:1: ( ( ( rule__FinalStage__TeamsAssignment_6_1 ) ) )
            // InternalEsportDsl.g:3910:1: ( ( rule__FinalStage__TeamsAssignment_6_1 ) )
            {
            // InternalEsportDsl.g:3910:1: ( ( rule__FinalStage__TeamsAssignment_6_1 ) )
            // InternalEsportDsl.g:3911:2: ( rule__FinalStage__TeamsAssignment_6_1 )
            {
             before(grammarAccess.getFinalStageAccess().getTeamsAssignment_6_1()); 
            // InternalEsportDsl.g:3912:2: ( rule__FinalStage__TeamsAssignment_6_1 )
            // InternalEsportDsl.g:3912:3: rule__FinalStage__TeamsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__FinalStage__TeamsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getFinalStageAccess().getTeamsAssignment_6_1()); 

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
    // $ANTLR end "rule__FinalStage__Group_6__1__Impl"


    // $ANTLR start "rule__FinalStage__Group_8__0"
    // InternalEsportDsl.g:3921:1: rule__FinalStage__Group_8__0 : rule__FinalStage__Group_8__0__Impl rule__FinalStage__Group_8__1 ;
    public final void rule__FinalStage__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3925:1: ( rule__FinalStage__Group_8__0__Impl rule__FinalStage__Group_8__1 )
            // InternalEsportDsl.g:3926:2: rule__FinalStage__Group_8__0__Impl rule__FinalStage__Group_8__1
            {
            pushFollow(FOLLOW_7);
            rule__FinalStage__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinalStage__Group_8__1();

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
    // $ANTLR end "rule__FinalStage__Group_8__0"


    // $ANTLR start "rule__FinalStage__Group_8__0__Impl"
    // InternalEsportDsl.g:3933:1: rule__FinalStage__Group_8__0__Impl : ( 'matchs' ) ;
    public final void rule__FinalStage__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3937:1: ( ( 'matchs' ) )
            // InternalEsportDsl.g:3938:1: ( 'matchs' )
            {
            // InternalEsportDsl.g:3938:1: ( 'matchs' )
            // InternalEsportDsl.g:3939:2: 'matchs'
            {
             before(grammarAccess.getFinalStageAccess().getMatchsKeyword_8_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getFinalStageAccess().getMatchsKeyword_8_0()); 

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
    // $ANTLR end "rule__FinalStage__Group_8__0__Impl"


    // $ANTLR start "rule__FinalStage__Group_8__1"
    // InternalEsportDsl.g:3948:1: rule__FinalStage__Group_8__1 : rule__FinalStage__Group_8__1__Impl rule__FinalStage__Group_8__2 ;
    public final void rule__FinalStage__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3952:1: ( rule__FinalStage__Group_8__1__Impl rule__FinalStage__Group_8__2 )
            // InternalEsportDsl.g:3953:2: rule__FinalStage__Group_8__1__Impl rule__FinalStage__Group_8__2
            {
            pushFollow(FOLLOW_25);
            rule__FinalStage__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinalStage__Group_8__2();

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
    // $ANTLR end "rule__FinalStage__Group_8__1"


    // $ANTLR start "rule__FinalStage__Group_8__1__Impl"
    // InternalEsportDsl.g:3960:1: rule__FinalStage__Group_8__1__Impl : ( '(' ) ;
    public final void rule__FinalStage__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3964:1: ( ( '(' ) )
            // InternalEsportDsl.g:3965:1: ( '(' )
            {
            // InternalEsportDsl.g:3965:1: ( '(' )
            // InternalEsportDsl.g:3966:2: '('
            {
             before(grammarAccess.getFinalStageAccess().getLeftParenthesisKeyword_8_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getFinalStageAccess().getLeftParenthesisKeyword_8_1()); 

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
    // $ANTLR end "rule__FinalStage__Group_8__1__Impl"


    // $ANTLR start "rule__FinalStage__Group_8__2"
    // InternalEsportDsl.g:3975:1: rule__FinalStage__Group_8__2 : rule__FinalStage__Group_8__2__Impl rule__FinalStage__Group_8__3 ;
    public final void rule__FinalStage__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3979:1: ( rule__FinalStage__Group_8__2__Impl rule__FinalStage__Group_8__3 )
            // InternalEsportDsl.g:3980:2: rule__FinalStage__Group_8__2__Impl rule__FinalStage__Group_8__3
            {
            pushFollow(FOLLOW_9);
            rule__FinalStage__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinalStage__Group_8__3();

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
    // $ANTLR end "rule__FinalStage__Group_8__2"


    // $ANTLR start "rule__FinalStage__Group_8__2__Impl"
    // InternalEsportDsl.g:3987:1: rule__FinalStage__Group_8__2__Impl : ( ( rule__FinalStage__MatchsAssignment_8_2 ) ) ;
    public final void rule__FinalStage__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:3991:1: ( ( ( rule__FinalStage__MatchsAssignment_8_2 ) ) )
            // InternalEsportDsl.g:3992:1: ( ( rule__FinalStage__MatchsAssignment_8_2 ) )
            {
            // InternalEsportDsl.g:3992:1: ( ( rule__FinalStage__MatchsAssignment_8_2 ) )
            // InternalEsportDsl.g:3993:2: ( rule__FinalStage__MatchsAssignment_8_2 )
            {
             before(grammarAccess.getFinalStageAccess().getMatchsAssignment_8_2()); 
            // InternalEsportDsl.g:3994:2: ( rule__FinalStage__MatchsAssignment_8_2 )
            // InternalEsportDsl.g:3994:3: rule__FinalStage__MatchsAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__FinalStage__MatchsAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getFinalStageAccess().getMatchsAssignment_8_2()); 

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
    // $ANTLR end "rule__FinalStage__Group_8__2__Impl"


    // $ANTLR start "rule__FinalStage__Group_8__3"
    // InternalEsportDsl.g:4002:1: rule__FinalStage__Group_8__3 : rule__FinalStage__Group_8__3__Impl rule__FinalStage__Group_8__4 ;
    public final void rule__FinalStage__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4006:1: ( rule__FinalStage__Group_8__3__Impl rule__FinalStage__Group_8__4 )
            // InternalEsportDsl.g:4007:2: rule__FinalStage__Group_8__3__Impl rule__FinalStage__Group_8__4
            {
            pushFollow(FOLLOW_9);
            rule__FinalStage__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinalStage__Group_8__4();

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
    // $ANTLR end "rule__FinalStage__Group_8__3"


    // $ANTLR start "rule__FinalStage__Group_8__3__Impl"
    // InternalEsportDsl.g:4014:1: rule__FinalStage__Group_8__3__Impl : ( ( rule__FinalStage__Group_8_3__0 )* ) ;
    public final void rule__FinalStage__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4018:1: ( ( ( rule__FinalStage__Group_8_3__0 )* ) )
            // InternalEsportDsl.g:4019:1: ( ( rule__FinalStage__Group_8_3__0 )* )
            {
            // InternalEsportDsl.g:4019:1: ( ( rule__FinalStage__Group_8_3__0 )* )
            // InternalEsportDsl.g:4020:2: ( rule__FinalStage__Group_8_3__0 )*
            {
             before(grammarAccess.getFinalStageAccess().getGroup_8_3()); 
            // InternalEsportDsl.g:4021:2: ( rule__FinalStage__Group_8_3__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==58) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalEsportDsl.g:4021:3: rule__FinalStage__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__FinalStage__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getFinalStageAccess().getGroup_8_3()); 

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
    // $ANTLR end "rule__FinalStage__Group_8__3__Impl"


    // $ANTLR start "rule__FinalStage__Group_8__4"
    // InternalEsportDsl.g:4029:1: rule__FinalStage__Group_8__4 : rule__FinalStage__Group_8__4__Impl ;
    public final void rule__FinalStage__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4033:1: ( rule__FinalStage__Group_8__4__Impl )
            // InternalEsportDsl.g:4034:2: rule__FinalStage__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FinalStage__Group_8__4__Impl();

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
    // $ANTLR end "rule__FinalStage__Group_8__4"


    // $ANTLR start "rule__FinalStage__Group_8__4__Impl"
    // InternalEsportDsl.g:4040:1: rule__FinalStage__Group_8__4__Impl : ( ')' ) ;
    public final void rule__FinalStage__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4044:1: ( ( ')' ) )
            // InternalEsportDsl.g:4045:1: ( ')' )
            {
            // InternalEsportDsl.g:4045:1: ( ')' )
            // InternalEsportDsl.g:4046:2: ')'
            {
             before(grammarAccess.getFinalStageAccess().getRightParenthesisKeyword_8_4()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getFinalStageAccess().getRightParenthesisKeyword_8_4()); 

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
    // $ANTLR end "rule__FinalStage__Group_8__4__Impl"


    // $ANTLR start "rule__FinalStage__Group_8_3__0"
    // InternalEsportDsl.g:4056:1: rule__FinalStage__Group_8_3__0 : rule__FinalStage__Group_8_3__0__Impl rule__FinalStage__Group_8_3__1 ;
    public final void rule__FinalStage__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4060:1: ( rule__FinalStage__Group_8_3__0__Impl rule__FinalStage__Group_8_3__1 )
            // InternalEsportDsl.g:4061:2: rule__FinalStage__Group_8_3__0__Impl rule__FinalStage__Group_8_3__1
            {
            pushFollow(FOLLOW_25);
            rule__FinalStage__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FinalStage__Group_8_3__1();

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
    // $ANTLR end "rule__FinalStage__Group_8_3__0"


    // $ANTLR start "rule__FinalStage__Group_8_3__0__Impl"
    // InternalEsportDsl.g:4068:1: rule__FinalStage__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__FinalStage__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4072:1: ( ( ',' ) )
            // InternalEsportDsl.g:4073:1: ( ',' )
            {
            // InternalEsportDsl.g:4073:1: ( ',' )
            // InternalEsportDsl.g:4074:2: ','
            {
             before(grammarAccess.getFinalStageAccess().getCommaKeyword_8_3_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getFinalStageAccess().getCommaKeyword_8_3_0()); 

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
    // $ANTLR end "rule__FinalStage__Group_8_3__0__Impl"


    // $ANTLR start "rule__FinalStage__Group_8_3__1"
    // InternalEsportDsl.g:4083:1: rule__FinalStage__Group_8_3__1 : rule__FinalStage__Group_8_3__1__Impl ;
    public final void rule__FinalStage__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4087:1: ( rule__FinalStage__Group_8_3__1__Impl )
            // InternalEsportDsl.g:4088:2: rule__FinalStage__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FinalStage__Group_8_3__1__Impl();

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
    // $ANTLR end "rule__FinalStage__Group_8_3__1"


    // $ANTLR start "rule__FinalStage__Group_8_3__1__Impl"
    // InternalEsportDsl.g:4094:1: rule__FinalStage__Group_8_3__1__Impl : ( ( rule__FinalStage__MatchsAssignment_8_3_1 ) ) ;
    public final void rule__FinalStage__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4098:1: ( ( ( rule__FinalStage__MatchsAssignment_8_3_1 ) ) )
            // InternalEsportDsl.g:4099:1: ( ( rule__FinalStage__MatchsAssignment_8_3_1 ) )
            {
            // InternalEsportDsl.g:4099:1: ( ( rule__FinalStage__MatchsAssignment_8_3_1 ) )
            // InternalEsportDsl.g:4100:2: ( rule__FinalStage__MatchsAssignment_8_3_1 )
            {
             before(grammarAccess.getFinalStageAccess().getMatchsAssignment_8_3_1()); 
            // InternalEsportDsl.g:4101:2: ( rule__FinalStage__MatchsAssignment_8_3_1 )
            // InternalEsportDsl.g:4101:3: rule__FinalStage__MatchsAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__FinalStage__MatchsAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFinalStageAccess().getMatchsAssignment_8_3_1()); 

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
    // $ANTLR end "rule__FinalStage__Group_8_3__1__Impl"


    // $ANTLR start "rule__GroupStage__Group__0"
    // InternalEsportDsl.g:4110:1: rule__GroupStage__Group__0 : rule__GroupStage__Group__0__Impl rule__GroupStage__Group__1 ;
    public final void rule__GroupStage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4114:1: ( rule__GroupStage__Group__0__Impl rule__GroupStage__Group__1 )
            // InternalEsportDsl.g:4115:2: rule__GroupStage__Group__0__Impl rule__GroupStage__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__GroupStage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupStage__Group__1();

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
    // $ANTLR end "rule__GroupStage__Group__0"


    // $ANTLR start "rule__GroupStage__Group__0__Impl"
    // InternalEsportDsl.g:4122:1: rule__GroupStage__Group__0__Impl : ( () ) ;
    public final void rule__GroupStage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4126:1: ( ( () ) )
            // InternalEsportDsl.g:4127:1: ( () )
            {
            // InternalEsportDsl.g:4127:1: ( () )
            // InternalEsportDsl.g:4128:2: ()
            {
             before(grammarAccess.getGroupStageAccess().getGroupStageAction_0()); 
            // InternalEsportDsl.g:4129:2: ()
            // InternalEsportDsl.g:4129:3: 
            {
            }

             after(grammarAccess.getGroupStageAccess().getGroupStageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupStage__Group__0__Impl"


    // $ANTLR start "rule__GroupStage__Group__1"
    // InternalEsportDsl.g:4137:1: rule__GroupStage__Group__1 : rule__GroupStage__Group__1__Impl rule__GroupStage__Group__2 ;
    public final void rule__GroupStage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4141:1: ( rule__GroupStage__Group__1__Impl rule__GroupStage__Group__2 )
            // InternalEsportDsl.g:4142:2: rule__GroupStage__Group__1__Impl rule__GroupStage__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__GroupStage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupStage__Group__2();

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
    // $ANTLR end "rule__GroupStage__Group__1"


    // $ANTLR start "rule__GroupStage__Group__1__Impl"
    // InternalEsportDsl.g:4149:1: rule__GroupStage__Group__1__Impl : ( 'GroupStage' ) ;
    public final void rule__GroupStage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4153:1: ( ( 'GroupStage' ) )
            // InternalEsportDsl.g:4154:1: ( 'GroupStage' )
            {
            // InternalEsportDsl.g:4154:1: ( 'GroupStage' )
            // InternalEsportDsl.g:4155:2: 'GroupStage'
            {
             before(grammarAccess.getGroupStageAccess().getGroupStageKeyword_1()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getGroupStageAccess().getGroupStageKeyword_1()); 

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
    // $ANTLR end "rule__GroupStage__Group__1__Impl"


    // $ANTLR start "rule__GroupStage__Group__2"
    // InternalEsportDsl.g:4164:1: rule__GroupStage__Group__2 : rule__GroupStage__Group__2__Impl rule__GroupStage__Group__3 ;
    public final void rule__GroupStage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4168:1: ( rule__GroupStage__Group__2__Impl rule__GroupStage__Group__3 )
            // InternalEsportDsl.g:4169:2: rule__GroupStage__Group__2__Impl rule__GroupStage__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__GroupStage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupStage__Group__3();

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
    // $ANTLR end "rule__GroupStage__Group__2"


    // $ANTLR start "rule__GroupStage__Group__2__Impl"
    // InternalEsportDsl.g:4176:1: rule__GroupStage__Group__2__Impl : ( ':' ) ;
    public final void rule__GroupStage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4180:1: ( ( ':' ) )
            // InternalEsportDsl.g:4181:1: ( ':' )
            {
            // InternalEsportDsl.g:4181:1: ( ':' )
            // InternalEsportDsl.g:4182:2: ':'
            {
             before(grammarAccess.getGroupStageAccess().getColonKeyword_2()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getGroupStageAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__GroupStage__Group__2__Impl"


    // $ANTLR start "rule__GroupStage__Group__3"
    // InternalEsportDsl.g:4191:1: rule__GroupStage__Group__3 : rule__GroupStage__Group__3__Impl rule__GroupStage__Group__4 ;
    public final void rule__GroupStage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4195:1: ( rule__GroupStage__Group__3__Impl rule__GroupStage__Group__4 )
            // InternalEsportDsl.g:4196:2: rule__GroupStage__Group__3__Impl rule__GroupStage__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__GroupStage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupStage__Group__4();

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
    // $ANTLR end "rule__GroupStage__Group__3"


    // $ANTLR start "rule__GroupStage__Group__3__Impl"
    // InternalEsportDsl.g:4203:1: rule__GroupStage__Group__3__Impl : ( ( rule__GroupStage__TypeAssignment_3 ) ) ;
    public final void rule__GroupStage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4207:1: ( ( ( rule__GroupStage__TypeAssignment_3 ) ) )
            // InternalEsportDsl.g:4208:1: ( ( rule__GroupStage__TypeAssignment_3 ) )
            {
            // InternalEsportDsl.g:4208:1: ( ( rule__GroupStage__TypeAssignment_3 ) )
            // InternalEsportDsl.g:4209:2: ( rule__GroupStage__TypeAssignment_3 )
            {
             before(grammarAccess.getGroupStageAccess().getTypeAssignment_3()); 
            // InternalEsportDsl.g:4210:2: ( rule__GroupStage__TypeAssignment_3 )
            // InternalEsportDsl.g:4210:3: rule__GroupStage__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__GroupStage__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGroupStageAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__GroupStage__Group__3__Impl"


    // $ANTLR start "rule__GroupStage__Group__4"
    // InternalEsportDsl.g:4218:1: rule__GroupStage__Group__4 : rule__GroupStage__Group__4__Impl rule__GroupStage__Group__5 ;
    public final void rule__GroupStage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4222:1: ( rule__GroupStage__Group__4__Impl rule__GroupStage__Group__5 )
            // InternalEsportDsl.g:4223:2: rule__GroupStage__Group__4__Impl rule__GroupStage__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__GroupStage__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupStage__Group__5();

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
    // $ANTLR end "rule__GroupStage__Group__4"


    // $ANTLR start "rule__GroupStage__Group__4__Impl"
    // InternalEsportDsl.g:4230:1: rule__GroupStage__Group__4__Impl : ( ( rule__GroupStage__MaxNbGamesAssignment_4 ) ) ;
    public final void rule__GroupStage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4234:1: ( ( ( rule__GroupStage__MaxNbGamesAssignment_4 ) ) )
            // InternalEsportDsl.g:4235:1: ( ( rule__GroupStage__MaxNbGamesAssignment_4 ) )
            {
            // InternalEsportDsl.g:4235:1: ( ( rule__GroupStage__MaxNbGamesAssignment_4 ) )
            // InternalEsportDsl.g:4236:2: ( rule__GroupStage__MaxNbGamesAssignment_4 )
            {
             before(grammarAccess.getGroupStageAccess().getMaxNbGamesAssignment_4()); 
            // InternalEsportDsl.g:4237:2: ( rule__GroupStage__MaxNbGamesAssignment_4 )
            // InternalEsportDsl.g:4237:3: rule__GroupStage__MaxNbGamesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__GroupStage__MaxNbGamesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGroupStageAccess().getMaxNbGamesAssignment_4()); 

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
    // $ANTLR end "rule__GroupStage__Group__4__Impl"


    // $ANTLR start "rule__GroupStage__Group__5"
    // InternalEsportDsl.g:4245:1: rule__GroupStage__Group__5 : rule__GroupStage__Group__5__Impl rule__GroupStage__Group__6 ;
    public final void rule__GroupStage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4249:1: ( rule__GroupStage__Group__5__Impl rule__GroupStage__Group__6 )
            // InternalEsportDsl.g:4250:2: rule__GroupStage__Group__5__Impl rule__GroupStage__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__GroupStage__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupStage__Group__6();

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
    // $ANTLR end "rule__GroupStage__Group__5"


    // $ANTLR start "rule__GroupStage__Group__5__Impl"
    // InternalEsportDsl.g:4257:1: rule__GroupStage__Group__5__Impl : ( ( rule__GroupStage__MeetingsInSameGroupAssignment_5 ) ) ;
    public final void rule__GroupStage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4261:1: ( ( ( rule__GroupStage__MeetingsInSameGroupAssignment_5 ) ) )
            // InternalEsportDsl.g:4262:1: ( ( rule__GroupStage__MeetingsInSameGroupAssignment_5 ) )
            {
            // InternalEsportDsl.g:4262:1: ( ( rule__GroupStage__MeetingsInSameGroupAssignment_5 ) )
            // InternalEsportDsl.g:4263:2: ( rule__GroupStage__MeetingsInSameGroupAssignment_5 )
            {
             before(grammarAccess.getGroupStageAccess().getMeetingsInSameGroupAssignment_5()); 
            // InternalEsportDsl.g:4264:2: ( rule__GroupStage__MeetingsInSameGroupAssignment_5 )
            // InternalEsportDsl.g:4264:3: rule__GroupStage__MeetingsInSameGroupAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__GroupStage__MeetingsInSameGroupAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGroupStageAccess().getMeetingsInSameGroupAssignment_5()); 

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
    // $ANTLR end "rule__GroupStage__Group__5__Impl"


    // $ANTLR start "rule__GroupStage__Group__6"
    // InternalEsportDsl.g:4272:1: rule__GroupStage__Group__6 : rule__GroupStage__Group__6__Impl rule__GroupStage__Group__7 ;
    public final void rule__GroupStage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4276:1: ( rule__GroupStage__Group__6__Impl rule__GroupStage__Group__7 )
            // InternalEsportDsl.g:4277:2: rule__GroupStage__Group__6__Impl rule__GroupStage__Group__7
            {
            pushFollow(FOLLOW_27);
            rule__GroupStage__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupStage__Group__7();

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
    // $ANTLR end "rule__GroupStage__Group__6"


    // $ANTLR start "rule__GroupStage__Group__6__Impl"
    // InternalEsportDsl.g:4284:1: rule__GroupStage__Group__6__Impl : ( ( rule__GroupStage__MeetingsWithOtherGroupsAssignment_6 )? ) ;
    public final void rule__GroupStage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4288:1: ( ( ( rule__GroupStage__MeetingsWithOtherGroupsAssignment_6 )? ) )
            // InternalEsportDsl.g:4289:1: ( ( rule__GroupStage__MeetingsWithOtherGroupsAssignment_6 )? )
            {
            // InternalEsportDsl.g:4289:1: ( ( rule__GroupStage__MeetingsWithOtherGroupsAssignment_6 )? )
            // InternalEsportDsl.g:4290:2: ( rule__GroupStage__MeetingsWithOtherGroupsAssignment_6 )?
            {
             before(grammarAccess.getGroupStageAccess().getMeetingsWithOtherGroupsAssignment_6()); 
            // InternalEsportDsl.g:4291:2: ( rule__GroupStage__MeetingsWithOtherGroupsAssignment_6 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_INT||LA34_0==66) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalEsportDsl.g:4291:3: rule__GroupStage__MeetingsWithOtherGroupsAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__GroupStage__MeetingsWithOtherGroupsAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroupStageAccess().getMeetingsWithOtherGroupsAssignment_6()); 

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
    // $ANTLR end "rule__GroupStage__Group__6__Impl"


    // $ANTLR start "rule__GroupStage__Group__7"
    // InternalEsportDsl.g:4299:1: rule__GroupStage__Group__7 : rule__GroupStage__Group__7__Impl ;
    public final void rule__GroupStage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4303:1: ( rule__GroupStage__Group__7__Impl )
            // InternalEsportDsl.g:4304:2: rule__GroupStage__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroupStage__Group__7__Impl();

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
    // $ANTLR end "rule__GroupStage__Group__7"


    // $ANTLR start "rule__GroupStage__Group__7__Impl"
    // InternalEsportDsl.g:4310:1: rule__GroupStage__Group__7__Impl : ( ( rule__GroupStage__Group_7__0 )? ) ;
    public final void rule__GroupStage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4314:1: ( ( ( rule__GroupStage__Group_7__0 )? ) )
            // InternalEsportDsl.g:4315:1: ( ( rule__GroupStage__Group_7__0 )? )
            {
            // InternalEsportDsl.g:4315:1: ( ( rule__GroupStage__Group_7__0 )? )
            // InternalEsportDsl.g:4316:2: ( rule__GroupStage__Group_7__0 )?
            {
             before(grammarAccess.getGroupStageAccess().getGroup_7()); 
            // InternalEsportDsl.g:4317:2: ( rule__GroupStage__Group_7__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==56) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalEsportDsl.g:4317:3: rule__GroupStage__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GroupStage__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroupStageAccess().getGroup_7()); 

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
    // $ANTLR end "rule__GroupStage__Group__7__Impl"


    // $ANTLR start "rule__GroupStage__Group_7__0"
    // InternalEsportDsl.g:4326:1: rule__GroupStage__Group_7__0 : rule__GroupStage__Group_7__0__Impl rule__GroupStage__Group_7__1 ;
    public final void rule__GroupStage__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4330:1: ( rule__GroupStage__Group_7__0__Impl rule__GroupStage__Group_7__1 )
            // InternalEsportDsl.g:4331:2: rule__GroupStage__Group_7__0__Impl rule__GroupStage__Group_7__1
            {
            pushFollow(FOLLOW_28);
            rule__GroupStage__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupStage__Group_7__1();

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
    // $ANTLR end "rule__GroupStage__Group_7__0"


    // $ANTLR start "rule__GroupStage__Group_7__0__Impl"
    // InternalEsportDsl.g:4338:1: rule__GroupStage__Group_7__0__Impl : ( '(' ) ;
    public final void rule__GroupStage__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4342:1: ( ( '(' ) )
            // InternalEsportDsl.g:4343:1: ( '(' )
            {
            // InternalEsportDsl.g:4343:1: ( '(' )
            // InternalEsportDsl.g:4344:2: '('
            {
             before(grammarAccess.getGroupStageAccess().getLeftParenthesisKeyword_7_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getGroupStageAccess().getLeftParenthesisKeyword_7_0()); 

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
    // $ANTLR end "rule__GroupStage__Group_7__0__Impl"


    // $ANTLR start "rule__GroupStage__Group_7__1"
    // InternalEsportDsl.g:4353:1: rule__GroupStage__Group_7__1 : rule__GroupStage__Group_7__1__Impl rule__GroupStage__Group_7__2 ;
    public final void rule__GroupStage__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4357:1: ( rule__GroupStage__Group_7__1__Impl rule__GroupStage__Group_7__2 )
            // InternalEsportDsl.g:4358:2: rule__GroupStage__Group_7__1__Impl rule__GroupStage__Group_7__2
            {
            pushFollow(FOLLOW_9);
            rule__GroupStage__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupStage__Group_7__2();

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
    // $ANTLR end "rule__GroupStage__Group_7__1"


    // $ANTLR start "rule__GroupStage__Group_7__1__Impl"
    // InternalEsportDsl.g:4365:1: rule__GroupStage__Group_7__1__Impl : ( ( rule__GroupStage__GroupsAssignment_7_1 ) ) ;
    public final void rule__GroupStage__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4369:1: ( ( ( rule__GroupStage__GroupsAssignment_7_1 ) ) )
            // InternalEsportDsl.g:4370:1: ( ( rule__GroupStage__GroupsAssignment_7_1 ) )
            {
            // InternalEsportDsl.g:4370:1: ( ( rule__GroupStage__GroupsAssignment_7_1 ) )
            // InternalEsportDsl.g:4371:2: ( rule__GroupStage__GroupsAssignment_7_1 )
            {
             before(grammarAccess.getGroupStageAccess().getGroupsAssignment_7_1()); 
            // InternalEsportDsl.g:4372:2: ( rule__GroupStage__GroupsAssignment_7_1 )
            // InternalEsportDsl.g:4372:3: rule__GroupStage__GroupsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__GroupStage__GroupsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupStageAccess().getGroupsAssignment_7_1()); 

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
    // $ANTLR end "rule__GroupStage__Group_7__1__Impl"


    // $ANTLR start "rule__GroupStage__Group_7__2"
    // InternalEsportDsl.g:4380:1: rule__GroupStage__Group_7__2 : rule__GroupStage__Group_7__2__Impl rule__GroupStage__Group_7__3 ;
    public final void rule__GroupStage__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4384:1: ( rule__GroupStage__Group_7__2__Impl rule__GroupStage__Group_7__3 )
            // InternalEsportDsl.g:4385:2: rule__GroupStage__Group_7__2__Impl rule__GroupStage__Group_7__3
            {
            pushFollow(FOLLOW_9);
            rule__GroupStage__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupStage__Group_7__3();

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
    // $ANTLR end "rule__GroupStage__Group_7__2"


    // $ANTLR start "rule__GroupStage__Group_7__2__Impl"
    // InternalEsportDsl.g:4392:1: rule__GroupStage__Group_7__2__Impl : ( ( rule__GroupStage__Group_7_2__0 )* ) ;
    public final void rule__GroupStage__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4396:1: ( ( ( rule__GroupStage__Group_7_2__0 )* ) )
            // InternalEsportDsl.g:4397:1: ( ( rule__GroupStage__Group_7_2__0 )* )
            {
            // InternalEsportDsl.g:4397:1: ( ( rule__GroupStage__Group_7_2__0 )* )
            // InternalEsportDsl.g:4398:2: ( rule__GroupStage__Group_7_2__0 )*
            {
             before(grammarAccess.getGroupStageAccess().getGroup_7_2()); 
            // InternalEsportDsl.g:4399:2: ( rule__GroupStage__Group_7_2__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==58) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalEsportDsl.g:4399:3: rule__GroupStage__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__GroupStage__Group_7_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getGroupStageAccess().getGroup_7_2()); 

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
    // $ANTLR end "rule__GroupStage__Group_7__2__Impl"


    // $ANTLR start "rule__GroupStage__Group_7__3"
    // InternalEsportDsl.g:4407:1: rule__GroupStage__Group_7__3 : rule__GroupStage__Group_7__3__Impl ;
    public final void rule__GroupStage__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4411:1: ( rule__GroupStage__Group_7__3__Impl )
            // InternalEsportDsl.g:4412:2: rule__GroupStage__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroupStage__Group_7__3__Impl();

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
    // $ANTLR end "rule__GroupStage__Group_7__3"


    // $ANTLR start "rule__GroupStage__Group_7__3__Impl"
    // InternalEsportDsl.g:4418:1: rule__GroupStage__Group_7__3__Impl : ( ')' ) ;
    public final void rule__GroupStage__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4422:1: ( ( ')' ) )
            // InternalEsportDsl.g:4423:1: ( ')' )
            {
            // InternalEsportDsl.g:4423:1: ( ')' )
            // InternalEsportDsl.g:4424:2: ')'
            {
             before(grammarAccess.getGroupStageAccess().getRightParenthesisKeyword_7_3()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getGroupStageAccess().getRightParenthesisKeyword_7_3()); 

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
    // $ANTLR end "rule__GroupStage__Group_7__3__Impl"


    // $ANTLR start "rule__GroupStage__Group_7_2__0"
    // InternalEsportDsl.g:4434:1: rule__GroupStage__Group_7_2__0 : rule__GroupStage__Group_7_2__0__Impl rule__GroupStage__Group_7_2__1 ;
    public final void rule__GroupStage__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4438:1: ( rule__GroupStage__Group_7_2__0__Impl rule__GroupStage__Group_7_2__1 )
            // InternalEsportDsl.g:4439:2: rule__GroupStage__Group_7_2__0__Impl rule__GroupStage__Group_7_2__1
            {
            pushFollow(FOLLOW_28);
            rule__GroupStage__Group_7_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupStage__Group_7_2__1();

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
    // $ANTLR end "rule__GroupStage__Group_7_2__0"


    // $ANTLR start "rule__GroupStage__Group_7_2__0__Impl"
    // InternalEsportDsl.g:4446:1: rule__GroupStage__Group_7_2__0__Impl : ( ',' ) ;
    public final void rule__GroupStage__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4450:1: ( ( ',' ) )
            // InternalEsportDsl.g:4451:1: ( ',' )
            {
            // InternalEsportDsl.g:4451:1: ( ',' )
            // InternalEsportDsl.g:4452:2: ','
            {
             before(grammarAccess.getGroupStageAccess().getCommaKeyword_7_2_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getGroupStageAccess().getCommaKeyword_7_2_0()); 

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
    // $ANTLR end "rule__GroupStage__Group_7_2__0__Impl"


    // $ANTLR start "rule__GroupStage__Group_7_2__1"
    // InternalEsportDsl.g:4461:1: rule__GroupStage__Group_7_2__1 : rule__GroupStage__Group_7_2__1__Impl ;
    public final void rule__GroupStage__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4465:1: ( rule__GroupStage__Group_7_2__1__Impl )
            // InternalEsportDsl.g:4466:2: rule__GroupStage__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroupStage__Group_7_2__1__Impl();

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
    // $ANTLR end "rule__GroupStage__Group_7_2__1"


    // $ANTLR start "rule__GroupStage__Group_7_2__1__Impl"
    // InternalEsportDsl.g:4472:1: rule__GroupStage__Group_7_2__1__Impl : ( ( rule__GroupStage__GroupsAssignment_7_2_1 ) ) ;
    public final void rule__GroupStage__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4476:1: ( ( ( rule__GroupStage__GroupsAssignment_7_2_1 ) ) )
            // InternalEsportDsl.g:4477:1: ( ( rule__GroupStage__GroupsAssignment_7_2_1 ) )
            {
            // InternalEsportDsl.g:4477:1: ( ( rule__GroupStage__GroupsAssignment_7_2_1 ) )
            // InternalEsportDsl.g:4478:2: ( rule__GroupStage__GroupsAssignment_7_2_1 )
            {
             before(grammarAccess.getGroupStageAccess().getGroupsAssignment_7_2_1()); 
            // InternalEsportDsl.g:4479:2: ( rule__GroupStage__GroupsAssignment_7_2_1 )
            // InternalEsportDsl.g:4479:3: rule__GroupStage__GroupsAssignment_7_2_1
            {
            pushFollow(FOLLOW_2);
            rule__GroupStage__GroupsAssignment_7_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupStageAccess().getGroupsAssignment_7_2_1()); 

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
    // $ANTLR end "rule__GroupStage__Group_7_2__1__Impl"


    // $ANTLR start "rule__Match__Group__0"
    // InternalEsportDsl.g:4488:1: rule__Match__Group__0 : rule__Match__Group__0__Impl rule__Match__Group__1 ;
    public final void rule__Match__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4492:1: ( rule__Match__Group__0__Impl rule__Match__Group__1 )
            // InternalEsportDsl.g:4493:2: rule__Match__Group__0__Impl rule__Match__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Match__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Match__Group__1();

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
    // $ANTLR end "rule__Match__Group__0"


    // $ANTLR start "rule__Match__Group__0__Impl"
    // InternalEsportDsl.g:4500:1: rule__Match__Group__0__Impl : ( () ) ;
    public final void rule__Match__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4504:1: ( ( () ) )
            // InternalEsportDsl.g:4505:1: ( () )
            {
            // InternalEsportDsl.g:4505:1: ( () )
            // InternalEsportDsl.g:4506:2: ()
            {
             before(grammarAccess.getMatchAccess().getMatchAction_0()); 
            // InternalEsportDsl.g:4507:2: ()
            // InternalEsportDsl.g:4507:3: 
            {
            }

             after(grammarAccess.getMatchAccess().getMatchAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group__0__Impl"


    // $ANTLR start "rule__Match__Group__1"
    // InternalEsportDsl.g:4515:1: rule__Match__Group__1 : rule__Match__Group__1__Impl rule__Match__Group__2 ;
    public final void rule__Match__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4519:1: ( rule__Match__Group__1__Impl rule__Match__Group__2 )
            // InternalEsportDsl.g:4520:2: rule__Match__Group__1__Impl rule__Match__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Match__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Match__Group__2();

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
    // $ANTLR end "rule__Match__Group__1"


    // $ANTLR start "rule__Match__Group__1__Impl"
    // InternalEsportDsl.g:4527:1: rule__Match__Group__1__Impl : ( 'Match' ) ;
    public final void rule__Match__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4531:1: ( ( 'Match' ) )
            // InternalEsportDsl.g:4532:1: ( 'Match' )
            {
            // InternalEsportDsl.g:4532:1: ( 'Match' )
            // InternalEsportDsl.g:4533:2: 'Match'
            {
             before(grammarAccess.getMatchAccess().getMatchKeyword_1()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getMatchAccess().getMatchKeyword_1()); 

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
    // $ANTLR end "rule__Match__Group__1__Impl"


    // $ANTLR start "rule__Match__Group__2"
    // InternalEsportDsl.g:4542:1: rule__Match__Group__2 : rule__Match__Group__2__Impl rule__Match__Group__3 ;
    public final void rule__Match__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4546:1: ( rule__Match__Group__2__Impl rule__Match__Group__3 )
            // InternalEsportDsl.g:4547:2: rule__Match__Group__2__Impl rule__Match__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__Match__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Match__Group__3();

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
    // $ANTLR end "rule__Match__Group__2"


    // $ANTLR start "rule__Match__Group__2__Impl"
    // InternalEsportDsl.g:4554:1: rule__Match__Group__2__Impl : ( ':' ) ;
    public final void rule__Match__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4558:1: ( ( ':' ) )
            // InternalEsportDsl.g:4559:1: ( ':' )
            {
            // InternalEsportDsl.g:4559:1: ( ':' )
            // InternalEsportDsl.g:4560:2: ':'
            {
             before(grammarAccess.getMatchAccess().getColonKeyword_2()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getMatchAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Match__Group__2__Impl"


    // $ANTLR start "rule__Match__Group__3"
    // InternalEsportDsl.g:4569:1: rule__Match__Group__3 : rule__Match__Group__3__Impl rule__Match__Group__4 ;
    public final void rule__Match__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4573:1: ( rule__Match__Group__3__Impl rule__Match__Group__4 )
            // InternalEsportDsl.g:4574:2: rule__Match__Group__3__Impl rule__Match__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Match__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Match__Group__4();

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
    // $ANTLR end "rule__Match__Group__3"


    // $ANTLR start "rule__Match__Group__3__Impl"
    // InternalEsportDsl.g:4581:1: rule__Match__Group__3__Impl : ( ( rule__Match__TypeAssignment_3 ) ) ;
    public final void rule__Match__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4585:1: ( ( ( rule__Match__TypeAssignment_3 ) ) )
            // InternalEsportDsl.g:4586:1: ( ( rule__Match__TypeAssignment_3 ) )
            {
            // InternalEsportDsl.g:4586:1: ( ( rule__Match__TypeAssignment_3 ) )
            // InternalEsportDsl.g:4587:2: ( rule__Match__TypeAssignment_3 )
            {
             before(grammarAccess.getMatchAccess().getTypeAssignment_3()); 
            // InternalEsportDsl.g:4588:2: ( rule__Match__TypeAssignment_3 )
            // InternalEsportDsl.g:4588:3: rule__Match__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Match__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMatchAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__Match__Group__3__Impl"


    // $ANTLR start "rule__Match__Group__4"
    // InternalEsportDsl.g:4596:1: rule__Match__Group__4 : rule__Match__Group__4__Impl rule__Match__Group__5 ;
    public final void rule__Match__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4600:1: ( rule__Match__Group__4__Impl rule__Match__Group__5 )
            // InternalEsportDsl.g:4601:2: rule__Match__Group__4__Impl rule__Match__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Match__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Match__Group__5();

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
    // $ANTLR end "rule__Match__Group__4"


    // $ANTLR start "rule__Match__Group__4__Impl"
    // InternalEsportDsl.g:4608:1: rule__Match__Group__4__Impl : ( ( rule__Match__LoserWinsAssignment_4 ) ) ;
    public final void rule__Match__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4612:1: ( ( ( rule__Match__LoserWinsAssignment_4 ) ) )
            // InternalEsportDsl.g:4613:1: ( ( rule__Match__LoserWinsAssignment_4 ) )
            {
            // InternalEsportDsl.g:4613:1: ( ( rule__Match__LoserWinsAssignment_4 ) )
            // InternalEsportDsl.g:4614:2: ( rule__Match__LoserWinsAssignment_4 )
            {
             before(grammarAccess.getMatchAccess().getLoserWinsAssignment_4()); 
            // InternalEsportDsl.g:4615:2: ( rule__Match__LoserWinsAssignment_4 )
            // InternalEsportDsl.g:4615:3: rule__Match__LoserWinsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Match__LoserWinsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMatchAccess().getLoserWinsAssignment_4()); 

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
    // $ANTLR end "rule__Match__Group__4__Impl"


    // $ANTLR start "rule__Match__Group__5"
    // InternalEsportDsl.g:4623:1: rule__Match__Group__5 : rule__Match__Group__5__Impl rule__Match__Group__6 ;
    public final void rule__Match__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4627:1: ( rule__Match__Group__5__Impl rule__Match__Group__6 )
            // InternalEsportDsl.g:4628:2: rule__Match__Group__5__Impl rule__Match__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Match__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Match__Group__6();

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
    // $ANTLR end "rule__Match__Group__5"


    // $ANTLR start "rule__Match__Group__5__Impl"
    // InternalEsportDsl.g:4635:1: rule__Match__Group__5__Impl : ( ( rule__Match__TeamWinnerAssignment_5 ) ) ;
    public final void rule__Match__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4639:1: ( ( ( rule__Match__TeamWinnerAssignment_5 ) ) )
            // InternalEsportDsl.g:4640:1: ( ( rule__Match__TeamWinnerAssignment_5 ) )
            {
            // InternalEsportDsl.g:4640:1: ( ( rule__Match__TeamWinnerAssignment_5 ) )
            // InternalEsportDsl.g:4641:2: ( rule__Match__TeamWinnerAssignment_5 )
            {
             before(grammarAccess.getMatchAccess().getTeamWinnerAssignment_5()); 
            // InternalEsportDsl.g:4642:2: ( rule__Match__TeamWinnerAssignment_5 )
            // InternalEsportDsl.g:4642:3: rule__Match__TeamWinnerAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Match__TeamWinnerAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMatchAccess().getTeamWinnerAssignment_5()); 

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
    // $ANTLR end "rule__Match__Group__5__Impl"


    // $ANTLR start "rule__Match__Group__6"
    // InternalEsportDsl.g:4650:1: rule__Match__Group__6 : rule__Match__Group__6__Impl ;
    public final void rule__Match__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4654:1: ( rule__Match__Group__6__Impl )
            // InternalEsportDsl.g:4655:2: rule__Match__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Match__Group__6__Impl();

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
    // $ANTLR end "rule__Match__Group__6"


    // $ANTLR start "rule__Match__Group__6__Impl"
    // InternalEsportDsl.g:4661:1: rule__Match__Group__6__Impl : ( ( rule__Match__TeamLoserAssignment_6 ) ) ;
    public final void rule__Match__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4665:1: ( ( ( rule__Match__TeamLoserAssignment_6 ) ) )
            // InternalEsportDsl.g:4666:1: ( ( rule__Match__TeamLoserAssignment_6 ) )
            {
            // InternalEsportDsl.g:4666:1: ( ( rule__Match__TeamLoserAssignment_6 ) )
            // InternalEsportDsl.g:4667:2: ( rule__Match__TeamLoserAssignment_6 )
            {
             before(grammarAccess.getMatchAccess().getTeamLoserAssignment_6()); 
            // InternalEsportDsl.g:4668:2: ( rule__Match__TeamLoserAssignment_6 )
            // InternalEsportDsl.g:4668:3: rule__Match__TeamLoserAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Match__TeamLoserAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMatchAccess().getTeamLoserAssignment_6()); 

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
    // $ANTLR end "rule__Match__Group__6__Impl"


    // $ANTLR start "rule__Group__Group__0"
    // InternalEsportDsl.g:4677:1: rule__Group__Group__0 : rule__Group__Group__0__Impl rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4681:1: ( rule__Group__Group__0__Impl rule__Group__Group__1 )
            // InternalEsportDsl.g:4682:2: rule__Group__Group__0__Impl rule__Group__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Group__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__1();

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
    // $ANTLR end "rule__Group__Group__0"


    // $ANTLR start "rule__Group__Group__0__Impl"
    // InternalEsportDsl.g:4689:1: rule__Group__Group__0__Impl : ( () ) ;
    public final void rule__Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4693:1: ( ( () ) )
            // InternalEsportDsl.g:4694:1: ( () )
            {
            // InternalEsportDsl.g:4694:1: ( () )
            // InternalEsportDsl.g:4695:2: ()
            {
             before(grammarAccess.getGroupAccess().getGroupAction_0()); 
            // InternalEsportDsl.g:4696:2: ()
            // InternalEsportDsl.g:4696:3: 
            {
            }

             after(grammarAccess.getGroupAccess().getGroupAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__0__Impl"


    // $ANTLR start "rule__Group__Group__1"
    // InternalEsportDsl.g:4704:1: rule__Group__Group__1 : rule__Group__Group__1__Impl rule__Group__Group__2 ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4708:1: ( rule__Group__Group__1__Impl rule__Group__Group__2 )
            // InternalEsportDsl.g:4709:2: rule__Group__Group__1__Impl rule__Group__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Group__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__2();

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
    // $ANTLR end "rule__Group__Group__1"


    // $ANTLR start "rule__Group__Group__1__Impl"
    // InternalEsportDsl.g:4716:1: rule__Group__Group__1__Impl : ( 'Group' ) ;
    public final void rule__Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4720:1: ( ( 'Group' ) )
            // InternalEsportDsl.g:4721:1: ( 'Group' )
            {
            // InternalEsportDsl.g:4721:1: ( 'Group' )
            // InternalEsportDsl.g:4722:2: 'Group'
            {
             before(grammarAccess.getGroupAccess().getGroupKeyword_1()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getGroupKeyword_1()); 

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
    // $ANTLR end "rule__Group__Group__1__Impl"


    // $ANTLR start "rule__Group__Group__2"
    // InternalEsportDsl.g:4731:1: rule__Group__Group__2 : rule__Group__Group__2__Impl rule__Group__Group__3 ;
    public final void rule__Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4735:1: ( rule__Group__Group__2__Impl rule__Group__Group__3 )
            // InternalEsportDsl.g:4736:2: rule__Group__Group__2__Impl rule__Group__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Group__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__3();

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
    // $ANTLR end "rule__Group__Group__2"


    // $ANTLR start "rule__Group__Group__2__Impl"
    // InternalEsportDsl.g:4743:1: rule__Group__Group__2__Impl : ( ':' ) ;
    public final void rule__Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4747:1: ( ( ':' ) )
            // InternalEsportDsl.g:4748:1: ( ':' )
            {
            // InternalEsportDsl.g:4748:1: ( ':' )
            // InternalEsportDsl.g:4749:2: ':'
            {
             before(grammarAccess.getGroupAccess().getColonKeyword_2()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Group__Group__2__Impl"


    // $ANTLR start "rule__Group__Group__3"
    // InternalEsportDsl.g:4758:1: rule__Group__Group__3 : rule__Group__Group__3__Impl rule__Group__Group__4 ;
    public final void rule__Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4762:1: ( rule__Group__Group__3__Impl rule__Group__Group__4 )
            // InternalEsportDsl.g:4763:2: rule__Group__Group__3__Impl rule__Group__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Group__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__4();

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
    // $ANTLR end "rule__Group__Group__3"


    // $ANTLR start "rule__Group__Group__3__Impl"
    // InternalEsportDsl.g:4770:1: rule__Group__Group__3__Impl : ( '(' ) ;
    public final void rule__Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4774:1: ( ( '(' ) )
            // InternalEsportDsl.g:4775:1: ( '(' )
            {
            // InternalEsportDsl.g:4775:1: ( '(' )
            // InternalEsportDsl.g:4776:2: '('
            {
             before(grammarAccess.getGroupAccess().getLeftParenthesisKeyword_3()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getLeftParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Group__Group__3__Impl"


    // $ANTLR start "rule__Group__Group__4"
    // InternalEsportDsl.g:4785:1: rule__Group__Group__4 : rule__Group__Group__4__Impl rule__Group__Group__5 ;
    public final void rule__Group__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4789:1: ( rule__Group__Group__4__Impl rule__Group__Group__5 )
            // InternalEsportDsl.g:4790:2: rule__Group__Group__4__Impl rule__Group__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Group__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__5();

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
    // $ANTLR end "rule__Group__Group__4"


    // $ANTLR start "rule__Group__Group__4__Impl"
    // InternalEsportDsl.g:4797:1: rule__Group__Group__4__Impl : ( ( rule__Group__TeamsAssignment_4 ) ) ;
    public final void rule__Group__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4801:1: ( ( ( rule__Group__TeamsAssignment_4 ) ) )
            // InternalEsportDsl.g:4802:1: ( ( rule__Group__TeamsAssignment_4 ) )
            {
            // InternalEsportDsl.g:4802:1: ( ( rule__Group__TeamsAssignment_4 ) )
            // InternalEsportDsl.g:4803:2: ( rule__Group__TeamsAssignment_4 )
            {
             before(grammarAccess.getGroupAccess().getTeamsAssignment_4()); 
            // InternalEsportDsl.g:4804:2: ( rule__Group__TeamsAssignment_4 )
            // InternalEsportDsl.g:4804:3: rule__Group__TeamsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Group__TeamsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getTeamsAssignment_4()); 

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
    // $ANTLR end "rule__Group__Group__4__Impl"


    // $ANTLR start "rule__Group__Group__5"
    // InternalEsportDsl.g:4812:1: rule__Group__Group__5 : rule__Group__Group__5__Impl rule__Group__Group__6 ;
    public final void rule__Group__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4816:1: ( rule__Group__Group__5__Impl rule__Group__Group__6 )
            // InternalEsportDsl.g:4817:2: rule__Group__Group__5__Impl rule__Group__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Group__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__6();

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
    // $ANTLR end "rule__Group__Group__5"


    // $ANTLR start "rule__Group__Group__5__Impl"
    // InternalEsportDsl.g:4824:1: rule__Group__Group__5__Impl : ( ( rule__Group__Group_5__0 )* ) ;
    public final void rule__Group__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4828:1: ( ( ( rule__Group__Group_5__0 )* ) )
            // InternalEsportDsl.g:4829:1: ( ( rule__Group__Group_5__0 )* )
            {
            // InternalEsportDsl.g:4829:1: ( ( rule__Group__Group_5__0 )* )
            // InternalEsportDsl.g:4830:2: ( rule__Group__Group_5__0 )*
            {
             before(grammarAccess.getGroupAccess().getGroup_5()); 
            // InternalEsportDsl.g:4831:2: ( rule__Group__Group_5__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==58) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalEsportDsl.g:4831:3: rule__Group__Group_5__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Group__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getGroupAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Group__Group__5__Impl"


    // $ANTLR start "rule__Group__Group__6"
    // InternalEsportDsl.g:4839:1: rule__Group__Group__6 : rule__Group__Group__6__Impl rule__Group__Group__7 ;
    public final void rule__Group__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4843:1: ( rule__Group__Group__6__Impl rule__Group__Group__7 )
            // InternalEsportDsl.g:4844:2: rule__Group__Group__6__Impl rule__Group__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Group__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__7();

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
    // $ANTLR end "rule__Group__Group__6"


    // $ANTLR start "rule__Group__Group__6__Impl"
    // InternalEsportDsl.g:4851:1: rule__Group__Group__6__Impl : ( ')' ) ;
    public final void rule__Group__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4855:1: ( ( ')' ) )
            // InternalEsportDsl.g:4856:1: ( ')' )
            {
            // InternalEsportDsl.g:4856:1: ( ')' )
            // InternalEsportDsl.g:4857:2: ')'
            {
             before(grammarAccess.getGroupAccess().getRightParenthesisKeyword_6()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getRightParenthesisKeyword_6()); 

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
    // $ANTLR end "rule__Group__Group__6__Impl"


    // $ANTLR start "rule__Group__Group__7"
    // InternalEsportDsl.g:4866:1: rule__Group__Group__7 : rule__Group__Group__7__Impl ;
    public final void rule__Group__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4870:1: ( rule__Group__Group__7__Impl )
            // InternalEsportDsl.g:4871:2: rule__Group__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group__7__Impl();

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
    // $ANTLR end "rule__Group__Group__7"


    // $ANTLR start "rule__Group__Group__7__Impl"
    // InternalEsportDsl.g:4877:1: rule__Group__Group__7__Impl : ( ( rule__Group__Group_7__0 )? ) ;
    public final void rule__Group__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4881:1: ( ( ( rule__Group__Group_7__0 )? ) )
            // InternalEsportDsl.g:4882:1: ( ( rule__Group__Group_7__0 )? )
            {
            // InternalEsportDsl.g:4882:1: ( ( rule__Group__Group_7__0 )? )
            // InternalEsportDsl.g:4883:2: ( rule__Group__Group_7__0 )?
            {
             before(grammarAccess.getGroupAccess().getGroup_7()); 
            // InternalEsportDsl.g:4884:2: ( rule__Group__Group_7__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==56) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalEsportDsl.g:4884:3: rule__Group__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Group__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroupAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Group__Group__7__Impl"


    // $ANTLR start "rule__Group__Group_5__0"
    // InternalEsportDsl.g:4893:1: rule__Group__Group_5__0 : rule__Group__Group_5__0__Impl rule__Group__Group_5__1 ;
    public final void rule__Group__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4897:1: ( rule__Group__Group_5__0__Impl rule__Group__Group_5__1 )
            // InternalEsportDsl.g:4898:2: rule__Group__Group_5__0__Impl rule__Group__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Group__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group_5__1();

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
    // $ANTLR end "rule__Group__Group_5__0"


    // $ANTLR start "rule__Group__Group_5__0__Impl"
    // InternalEsportDsl.g:4905:1: rule__Group__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Group__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4909:1: ( ( ',' ) )
            // InternalEsportDsl.g:4910:1: ( ',' )
            {
            // InternalEsportDsl.g:4910:1: ( ',' )
            // InternalEsportDsl.g:4911:2: ','
            {
             before(grammarAccess.getGroupAccess().getCommaKeyword_5_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getCommaKeyword_5_0()); 

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
    // $ANTLR end "rule__Group__Group_5__0__Impl"


    // $ANTLR start "rule__Group__Group_5__1"
    // InternalEsportDsl.g:4920:1: rule__Group__Group_5__1 : rule__Group__Group_5__1__Impl ;
    public final void rule__Group__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4924:1: ( rule__Group__Group_5__1__Impl )
            // InternalEsportDsl.g:4925:2: rule__Group__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group_5__1__Impl();

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
    // $ANTLR end "rule__Group__Group_5__1"


    // $ANTLR start "rule__Group__Group_5__1__Impl"
    // InternalEsportDsl.g:4931:1: rule__Group__Group_5__1__Impl : ( ( rule__Group__TeamsAssignment_5_1 ) ) ;
    public final void rule__Group__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4935:1: ( ( ( rule__Group__TeamsAssignment_5_1 ) ) )
            // InternalEsportDsl.g:4936:1: ( ( rule__Group__TeamsAssignment_5_1 ) )
            {
            // InternalEsportDsl.g:4936:1: ( ( rule__Group__TeamsAssignment_5_1 ) )
            // InternalEsportDsl.g:4937:2: ( rule__Group__TeamsAssignment_5_1 )
            {
             before(grammarAccess.getGroupAccess().getTeamsAssignment_5_1()); 
            // InternalEsportDsl.g:4938:2: ( rule__Group__TeamsAssignment_5_1 )
            // InternalEsportDsl.g:4938:3: rule__Group__TeamsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Group__TeamsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getTeamsAssignment_5_1()); 

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
    // $ANTLR end "rule__Group__Group_5__1__Impl"


    // $ANTLR start "rule__Group__Group_7__0"
    // InternalEsportDsl.g:4947:1: rule__Group__Group_7__0 : rule__Group__Group_7__0__Impl rule__Group__Group_7__1 ;
    public final void rule__Group__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4951:1: ( rule__Group__Group_7__0__Impl rule__Group__Group_7__1 )
            // InternalEsportDsl.g:4952:2: rule__Group__Group_7__0__Impl rule__Group__Group_7__1
            {
            pushFollow(FOLLOW_25);
            rule__Group__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group_7__1();

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
    // $ANTLR end "rule__Group__Group_7__0"


    // $ANTLR start "rule__Group__Group_7__0__Impl"
    // InternalEsportDsl.g:4959:1: rule__Group__Group_7__0__Impl : ( '(' ) ;
    public final void rule__Group__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4963:1: ( ( '(' ) )
            // InternalEsportDsl.g:4964:1: ( '(' )
            {
            // InternalEsportDsl.g:4964:1: ( '(' )
            // InternalEsportDsl.g:4965:2: '('
            {
             before(grammarAccess.getGroupAccess().getLeftParenthesisKeyword_7_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getLeftParenthesisKeyword_7_0()); 

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
    // $ANTLR end "rule__Group__Group_7__0__Impl"


    // $ANTLR start "rule__Group__Group_7__1"
    // InternalEsportDsl.g:4974:1: rule__Group__Group_7__1 : rule__Group__Group_7__1__Impl rule__Group__Group_7__2 ;
    public final void rule__Group__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4978:1: ( rule__Group__Group_7__1__Impl rule__Group__Group_7__2 )
            // InternalEsportDsl.g:4979:2: rule__Group__Group_7__1__Impl rule__Group__Group_7__2
            {
            pushFollow(FOLLOW_9);
            rule__Group__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group_7__2();

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
    // $ANTLR end "rule__Group__Group_7__1"


    // $ANTLR start "rule__Group__Group_7__1__Impl"
    // InternalEsportDsl.g:4986:1: rule__Group__Group_7__1__Impl : ( ( rule__Group__MatchsAssignment_7_1 ) ) ;
    public final void rule__Group__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:4990:1: ( ( ( rule__Group__MatchsAssignment_7_1 ) ) )
            // InternalEsportDsl.g:4991:1: ( ( rule__Group__MatchsAssignment_7_1 ) )
            {
            // InternalEsportDsl.g:4991:1: ( ( rule__Group__MatchsAssignment_7_1 ) )
            // InternalEsportDsl.g:4992:2: ( rule__Group__MatchsAssignment_7_1 )
            {
             before(grammarAccess.getGroupAccess().getMatchsAssignment_7_1()); 
            // InternalEsportDsl.g:4993:2: ( rule__Group__MatchsAssignment_7_1 )
            // InternalEsportDsl.g:4993:3: rule__Group__MatchsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Group__MatchsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getMatchsAssignment_7_1()); 

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
    // $ANTLR end "rule__Group__Group_7__1__Impl"


    // $ANTLR start "rule__Group__Group_7__2"
    // InternalEsportDsl.g:5001:1: rule__Group__Group_7__2 : rule__Group__Group_7__2__Impl rule__Group__Group_7__3 ;
    public final void rule__Group__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5005:1: ( rule__Group__Group_7__2__Impl rule__Group__Group_7__3 )
            // InternalEsportDsl.g:5006:2: rule__Group__Group_7__2__Impl rule__Group__Group_7__3
            {
            pushFollow(FOLLOW_9);
            rule__Group__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group_7__3();

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
    // $ANTLR end "rule__Group__Group_7__2"


    // $ANTLR start "rule__Group__Group_7__2__Impl"
    // InternalEsportDsl.g:5013:1: rule__Group__Group_7__2__Impl : ( ( rule__Group__Group_7_2__0 )* ) ;
    public final void rule__Group__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5017:1: ( ( ( rule__Group__Group_7_2__0 )* ) )
            // InternalEsportDsl.g:5018:1: ( ( rule__Group__Group_7_2__0 )* )
            {
            // InternalEsportDsl.g:5018:1: ( ( rule__Group__Group_7_2__0 )* )
            // InternalEsportDsl.g:5019:2: ( rule__Group__Group_7_2__0 )*
            {
             before(grammarAccess.getGroupAccess().getGroup_7_2()); 
            // InternalEsportDsl.g:5020:2: ( rule__Group__Group_7_2__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==58) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalEsportDsl.g:5020:3: rule__Group__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Group__Group_7_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getGroupAccess().getGroup_7_2()); 

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
    // $ANTLR end "rule__Group__Group_7__2__Impl"


    // $ANTLR start "rule__Group__Group_7__3"
    // InternalEsportDsl.g:5028:1: rule__Group__Group_7__3 : rule__Group__Group_7__3__Impl ;
    public final void rule__Group__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5032:1: ( rule__Group__Group_7__3__Impl )
            // InternalEsportDsl.g:5033:2: rule__Group__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group_7__3__Impl();

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
    // $ANTLR end "rule__Group__Group_7__3"


    // $ANTLR start "rule__Group__Group_7__3__Impl"
    // InternalEsportDsl.g:5039:1: rule__Group__Group_7__3__Impl : ( ')' ) ;
    public final void rule__Group__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5043:1: ( ( ')' ) )
            // InternalEsportDsl.g:5044:1: ( ')' )
            {
            // InternalEsportDsl.g:5044:1: ( ')' )
            // InternalEsportDsl.g:5045:2: ')'
            {
             before(grammarAccess.getGroupAccess().getRightParenthesisKeyword_7_3()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getRightParenthesisKeyword_7_3()); 

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
    // $ANTLR end "rule__Group__Group_7__3__Impl"


    // $ANTLR start "rule__Group__Group_7_2__0"
    // InternalEsportDsl.g:5055:1: rule__Group__Group_7_2__0 : rule__Group__Group_7_2__0__Impl rule__Group__Group_7_2__1 ;
    public final void rule__Group__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5059:1: ( rule__Group__Group_7_2__0__Impl rule__Group__Group_7_2__1 )
            // InternalEsportDsl.g:5060:2: rule__Group__Group_7_2__0__Impl rule__Group__Group_7_2__1
            {
            pushFollow(FOLLOW_25);
            rule__Group__Group_7_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group_7_2__1();

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
    // $ANTLR end "rule__Group__Group_7_2__0"


    // $ANTLR start "rule__Group__Group_7_2__0__Impl"
    // InternalEsportDsl.g:5067:1: rule__Group__Group_7_2__0__Impl : ( ',' ) ;
    public final void rule__Group__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5071:1: ( ( ',' ) )
            // InternalEsportDsl.g:5072:1: ( ',' )
            {
            // InternalEsportDsl.g:5072:1: ( ',' )
            // InternalEsportDsl.g:5073:2: ','
            {
             before(grammarAccess.getGroupAccess().getCommaKeyword_7_2_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getCommaKeyword_7_2_0()); 

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
    // $ANTLR end "rule__Group__Group_7_2__0__Impl"


    // $ANTLR start "rule__Group__Group_7_2__1"
    // InternalEsportDsl.g:5082:1: rule__Group__Group_7_2__1 : rule__Group__Group_7_2__1__Impl ;
    public final void rule__Group__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5086:1: ( rule__Group__Group_7_2__1__Impl )
            // InternalEsportDsl.g:5087:2: rule__Group__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group_7_2__1__Impl();

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
    // $ANTLR end "rule__Group__Group_7_2__1"


    // $ANTLR start "rule__Group__Group_7_2__1__Impl"
    // InternalEsportDsl.g:5093:1: rule__Group__Group_7_2__1__Impl : ( ( rule__Group__MatchsAssignment_7_2_1 ) ) ;
    public final void rule__Group__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5097:1: ( ( ( rule__Group__MatchsAssignment_7_2_1 ) ) )
            // InternalEsportDsl.g:5098:1: ( ( rule__Group__MatchsAssignment_7_2_1 ) )
            {
            // InternalEsportDsl.g:5098:1: ( ( rule__Group__MatchsAssignment_7_2_1 ) )
            // InternalEsportDsl.g:5099:2: ( rule__Group__MatchsAssignment_7_2_1 )
            {
             before(grammarAccess.getGroupAccess().getMatchsAssignment_7_2_1()); 
            // InternalEsportDsl.g:5100:2: ( rule__Group__MatchsAssignment_7_2_1 )
            // InternalEsportDsl.g:5100:3: rule__Group__MatchsAssignment_7_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Group__MatchsAssignment_7_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getMatchsAssignment_7_2_1()); 

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
    // $ANTLR end "rule__Group__Group_7_2__1__Impl"


    // $ANTLR start "rule__Player__Group__0"
    // InternalEsportDsl.g:5109:1: rule__Player__Group__0 : rule__Player__Group__0__Impl rule__Player__Group__1 ;
    public final void rule__Player__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5113:1: ( rule__Player__Group__0__Impl rule__Player__Group__1 )
            // InternalEsportDsl.g:5114:2: rule__Player__Group__0__Impl rule__Player__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Player__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group__1();

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
    // $ANTLR end "rule__Player__Group__0"


    // $ANTLR start "rule__Player__Group__0__Impl"
    // InternalEsportDsl.g:5121:1: rule__Player__Group__0__Impl : ( () ) ;
    public final void rule__Player__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5125:1: ( ( () ) )
            // InternalEsportDsl.g:5126:1: ( () )
            {
            // InternalEsportDsl.g:5126:1: ( () )
            // InternalEsportDsl.g:5127:2: ()
            {
             before(grammarAccess.getPlayerAccess().getPlayerAction_0()); 
            // InternalEsportDsl.g:5128:2: ()
            // InternalEsportDsl.g:5128:3: 
            {
            }

             after(grammarAccess.getPlayerAccess().getPlayerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__0__Impl"


    // $ANTLR start "rule__Player__Group__1"
    // InternalEsportDsl.g:5136:1: rule__Player__Group__1 : rule__Player__Group__1__Impl rule__Player__Group__2 ;
    public final void rule__Player__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5140:1: ( rule__Player__Group__1__Impl rule__Player__Group__2 )
            // InternalEsportDsl.g:5141:2: rule__Player__Group__1__Impl rule__Player__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Player__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group__2();

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
    // $ANTLR end "rule__Player__Group__1"


    // $ANTLR start "rule__Player__Group__1__Impl"
    // InternalEsportDsl.g:5148:1: rule__Player__Group__1__Impl : ( 'Player' ) ;
    public final void rule__Player__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5152:1: ( ( 'Player' ) )
            // InternalEsportDsl.g:5153:1: ( 'Player' )
            {
            // InternalEsportDsl.g:5153:1: ( 'Player' )
            // InternalEsportDsl.g:5154:2: 'Player'
            {
             before(grammarAccess.getPlayerAccess().getPlayerKeyword_1()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getPlayerAccess().getPlayerKeyword_1()); 

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
    // $ANTLR end "rule__Player__Group__1__Impl"


    // $ANTLR start "rule__Player__Group__2"
    // InternalEsportDsl.g:5163:1: rule__Player__Group__2 : rule__Player__Group__2__Impl rule__Player__Group__3 ;
    public final void rule__Player__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5167:1: ( rule__Player__Group__2__Impl rule__Player__Group__3 )
            // InternalEsportDsl.g:5168:2: rule__Player__Group__2__Impl rule__Player__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Player__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group__3();

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
    // $ANTLR end "rule__Player__Group__2"


    // $ANTLR start "rule__Player__Group__2__Impl"
    // InternalEsportDsl.g:5175:1: rule__Player__Group__2__Impl : ( ( rule__Player__NameAssignment_2 ) ) ;
    public final void rule__Player__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5179:1: ( ( ( rule__Player__NameAssignment_2 ) ) )
            // InternalEsportDsl.g:5180:1: ( ( rule__Player__NameAssignment_2 ) )
            {
            // InternalEsportDsl.g:5180:1: ( ( rule__Player__NameAssignment_2 ) )
            // InternalEsportDsl.g:5181:2: ( rule__Player__NameAssignment_2 )
            {
             before(grammarAccess.getPlayerAccess().getNameAssignment_2()); 
            // InternalEsportDsl.g:5182:2: ( rule__Player__NameAssignment_2 )
            // InternalEsportDsl.g:5182:3: rule__Player__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Player__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPlayerAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Player__Group__2__Impl"


    // $ANTLR start "rule__Player__Group__3"
    // InternalEsportDsl.g:5190:1: rule__Player__Group__3 : rule__Player__Group__3__Impl rule__Player__Group__4 ;
    public final void rule__Player__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5194:1: ( rule__Player__Group__3__Impl rule__Player__Group__4 )
            // InternalEsportDsl.g:5195:2: rule__Player__Group__3__Impl rule__Player__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Player__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group__4();

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
    // $ANTLR end "rule__Player__Group__3"


    // $ANTLR start "rule__Player__Group__3__Impl"
    // InternalEsportDsl.g:5202:1: rule__Player__Group__3__Impl : ( ':' ) ;
    public final void rule__Player__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5206:1: ( ( ':' ) )
            // InternalEsportDsl.g:5207:1: ( ':' )
            {
            // InternalEsportDsl.g:5207:1: ( ':' )
            // InternalEsportDsl.g:5208:2: ':'
            {
             before(grammarAccess.getPlayerAccess().getColonKeyword_3()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getPlayerAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__Player__Group__3__Impl"


    // $ANTLR start "rule__Player__Group__4"
    // InternalEsportDsl.g:5217:1: rule__Player__Group__4 : rule__Player__Group__4__Impl rule__Player__Group__5 ;
    public final void rule__Player__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5221:1: ( rule__Player__Group__4__Impl rule__Player__Group__5 )
            // InternalEsportDsl.g:5222:2: rule__Player__Group__4__Impl rule__Player__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Player__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group__5();

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
    // $ANTLR end "rule__Player__Group__4"


    // $ANTLR start "rule__Player__Group__4__Impl"
    // InternalEsportDsl.g:5229:1: rule__Player__Group__4__Impl : ( ( rule__Player__AgeAssignment_4 ) ) ;
    public final void rule__Player__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5233:1: ( ( ( rule__Player__AgeAssignment_4 ) ) )
            // InternalEsportDsl.g:5234:1: ( ( rule__Player__AgeAssignment_4 ) )
            {
            // InternalEsportDsl.g:5234:1: ( ( rule__Player__AgeAssignment_4 ) )
            // InternalEsportDsl.g:5235:2: ( rule__Player__AgeAssignment_4 )
            {
             before(grammarAccess.getPlayerAccess().getAgeAssignment_4()); 
            // InternalEsportDsl.g:5236:2: ( rule__Player__AgeAssignment_4 )
            // InternalEsportDsl.g:5236:3: rule__Player__AgeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Player__AgeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPlayerAccess().getAgeAssignment_4()); 

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
    // $ANTLR end "rule__Player__Group__4__Impl"


    // $ANTLR start "rule__Player__Group__5"
    // InternalEsportDsl.g:5244:1: rule__Player__Group__5 : rule__Player__Group__5__Impl rule__Player__Group__6 ;
    public final void rule__Player__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5248:1: ( rule__Player__Group__5__Impl rule__Player__Group__6 )
            // InternalEsportDsl.g:5249:2: rule__Player__Group__5__Impl rule__Player__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__Player__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group__6();

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
    // $ANTLR end "rule__Player__Group__5"


    // $ANTLR start "rule__Player__Group__5__Impl"
    // InternalEsportDsl.g:5256:1: rule__Player__Group__5__Impl : ( ( rule__Player__CountryAssignment_5 ) ) ;
    public final void rule__Player__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5260:1: ( ( ( rule__Player__CountryAssignment_5 ) ) )
            // InternalEsportDsl.g:5261:1: ( ( rule__Player__CountryAssignment_5 ) )
            {
            // InternalEsportDsl.g:5261:1: ( ( rule__Player__CountryAssignment_5 ) )
            // InternalEsportDsl.g:5262:2: ( rule__Player__CountryAssignment_5 )
            {
             before(grammarAccess.getPlayerAccess().getCountryAssignment_5()); 
            // InternalEsportDsl.g:5263:2: ( rule__Player__CountryAssignment_5 )
            // InternalEsportDsl.g:5263:3: rule__Player__CountryAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Player__CountryAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPlayerAccess().getCountryAssignment_5()); 

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
    // $ANTLR end "rule__Player__Group__5__Impl"


    // $ANTLR start "rule__Player__Group__6"
    // InternalEsportDsl.g:5271:1: rule__Player__Group__6 : rule__Player__Group__6__Impl rule__Player__Group__7 ;
    public final void rule__Player__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5275:1: ( rule__Player__Group__6__Impl rule__Player__Group__7 )
            // InternalEsportDsl.g:5276:2: rule__Player__Group__6__Impl rule__Player__Group__7
            {
            pushFollow(FOLLOW_30);
            rule__Player__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group__7();

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
    // $ANTLR end "rule__Player__Group__6"


    // $ANTLR start "rule__Player__Group__6__Impl"
    // InternalEsportDsl.g:5283:1: rule__Player__Group__6__Impl : ( ( rule__Player__PositionAssignment_6 )? ) ;
    public final void rule__Player__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5287:1: ( ( ( rule__Player__PositionAssignment_6 )? ) )
            // InternalEsportDsl.g:5288:1: ( ( rule__Player__PositionAssignment_6 )? )
            {
            // InternalEsportDsl.g:5288:1: ( ( rule__Player__PositionAssignment_6 )? )
            // InternalEsportDsl.g:5289:2: ( rule__Player__PositionAssignment_6 )?
            {
             before(grammarAccess.getPlayerAccess().getPositionAssignment_6()); 
            // InternalEsportDsl.g:5290:2: ( rule__Player__PositionAssignment_6 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=32 && LA40_0<=36)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalEsportDsl.g:5290:3: rule__Player__PositionAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Player__PositionAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPlayerAccess().getPositionAssignment_6()); 

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
    // $ANTLR end "rule__Player__Group__6__Impl"


    // $ANTLR start "rule__Player__Group__7"
    // InternalEsportDsl.g:5298:1: rule__Player__Group__7 : rule__Player__Group__7__Impl rule__Player__Group__8 ;
    public final void rule__Player__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5302:1: ( rule__Player__Group__7__Impl rule__Player__Group__8 )
            // InternalEsportDsl.g:5303:2: rule__Player__Group__7__Impl rule__Player__Group__8
            {
            pushFollow(FOLLOW_30);
            rule__Player__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group__8();

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
    // $ANTLR end "rule__Player__Group__7"


    // $ANTLR start "rule__Player__Group__7__Impl"
    // InternalEsportDsl.g:5310:1: rule__Player__Group__7__Impl : ( ( rule__Player__DescriptionAssignment_7 )? ) ;
    public final void rule__Player__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5314:1: ( ( ( rule__Player__DescriptionAssignment_7 )? ) )
            // InternalEsportDsl.g:5315:1: ( ( rule__Player__DescriptionAssignment_7 )? )
            {
            // InternalEsportDsl.g:5315:1: ( ( rule__Player__DescriptionAssignment_7 )? )
            // InternalEsportDsl.g:5316:2: ( rule__Player__DescriptionAssignment_7 )?
            {
             before(grammarAccess.getPlayerAccess().getDescriptionAssignment_7()); 
            // InternalEsportDsl.g:5317:2: ( rule__Player__DescriptionAssignment_7 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_STRING && LA41_0<=RULE_ID)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalEsportDsl.g:5317:3: rule__Player__DescriptionAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Player__DescriptionAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPlayerAccess().getDescriptionAssignment_7()); 

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
    // $ANTLR end "rule__Player__Group__7__Impl"


    // $ANTLR start "rule__Player__Group__8"
    // InternalEsportDsl.g:5325:1: rule__Player__Group__8 : rule__Player__Group__8__Impl ;
    public final void rule__Player__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5329:1: ( rule__Player__Group__8__Impl )
            // InternalEsportDsl.g:5330:2: rule__Player__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Player__Group__8__Impl();

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
    // $ANTLR end "rule__Player__Group__8"


    // $ANTLR start "rule__Player__Group__8__Impl"
    // InternalEsportDsl.g:5336:1: rule__Player__Group__8__Impl : ( ( rule__Player__Group_8__0 )? ) ;
    public final void rule__Player__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5340:1: ( ( ( rule__Player__Group_8__0 )? ) )
            // InternalEsportDsl.g:5341:1: ( ( rule__Player__Group_8__0 )? )
            {
            // InternalEsportDsl.g:5341:1: ( ( rule__Player__Group_8__0 )? )
            // InternalEsportDsl.g:5342:2: ( rule__Player__Group_8__0 )?
            {
             before(grammarAccess.getPlayerAccess().getGroup_8()); 
            // InternalEsportDsl.g:5343:2: ( rule__Player__Group_8__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==56) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalEsportDsl.g:5343:3: rule__Player__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Player__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPlayerAccess().getGroup_8()); 

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
    // $ANTLR end "rule__Player__Group__8__Impl"


    // $ANTLR start "rule__Player__Group_8__0"
    // InternalEsportDsl.g:5352:1: rule__Player__Group_8__0 : rule__Player__Group_8__0__Impl rule__Player__Group_8__1 ;
    public final void rule__Player__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5356:1: ( rule__Player__Group_8__0__Impl rule__Player__Group_8__1 )
            // InternalEsportDsl.g:5357:2: rule__Player__Group_8__0__Impl rule__Player__Group_8__1
            {
            pushFollow(FOLLOW_31);
            rule__Player__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group_8__1();

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
    // $ANTLR end "rule__Player__Group_8__0"


    // $ANTLR start "rule__Player__Group_8__0__Impl"
    // InternalEsportDsl.g:5364:1: rule__Player__Group_8__0__Impl : ( '(' ) ;
    public final void rule__Player__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5368:1: ( ( '(' ) )
            // InternalEsportDsl.g:5369:1: ( '(' )
            {
            // InternalEsportDsl.g:5369:1: ( '(' )
            // InternalEsportDsl.g:5370:2: '('
            {
             before(grammarAccess.getPlayerAccess().getLeftParenthesisKeyword_8_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getPlayerAccess().getLeftParenthesisKeyword_8_0()); 

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
    // $ANTLR end "rule__Player__Group_8__0__Impl"


    // $ANTLR start "rule__Player__Group_8__1"
    // InternalEsportDsl.g:5379:1: rule__Player__Group_8__1 : rule__Player__Group_8__1__Impl rule__Player__Group_8__2 ;
    public final void rule__Player__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5383:1: ( rule__Player__Group_8__1__Impl rule__Player__Group_8__2 )
            // InternalEsportDsl.g:5384:2: rule__Player__Group_8__1__Impl rule__Player__Group_8__2
            {
            pushFollow(FOLLOW_9);
            rule__Player__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group_8__2();

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
    // $ANTLR end "rule__Player__Group_8__1"


    // $ANTLR start "rule__Player__Group_8__1__Impl"
    // InternalEsportDsl.g:5391:1: rule__Player__Group_8__1__Impl : ( ( rule__Player__CapacitiesAssignment_8_1 ) ) ;
    public final void rule__Player__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5395:1: ( ( ( rule__Player__CapacitiesAssignment_8_1 ) ) )
            // InternalEsportDsl.g:5396:1: ( ( rule__Player__CapacitiesAssignment_8_1 ) )
            {
            // InternalEsportDsl.g:5396:1: ( ( rule__Player__CapacitiesAssignment_8_1 ) )
            // InternalEsportDsl.g:5397:2: ( rule__Player__CapacitiesAssignment_8_1 )
            {
             before(grammarAccess.getPlayerAccess().getCapacitiesAssignment_8_1()); 
            // InternalEsportDsl.g:5398:2: ( rule__Player__CapacitiesAssignment_8_1 )
            // InternalEsportDsl.g:5398:3: rule__Player__CapacitiesAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Player__CapacitiesAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getPlayerAccess().getCapacitiesAssignment_8_1()); 

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
    // $ANTLR end "rule__Player__Group_8__1__Impl"


    // $ANTLR start "rule__Player__Group_8__2"
    // InternalEsportDsl.g:5406:1: rule__Player__Group_8__2 : rule__Player__Group_8__2__Impl rule__Player__Group_8__3 ;
    public final void rule__Player__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5410:1: ( rule__Player__Group_8__2__Impl rule__Player__Group_8__3 )
            // InternalEsportDsl.g:5411:2: rule__Player__Group_8__2__Impl rule__Player__Group_8__3
            {
            pushFollow(FOLLOW_9);
            rule__Player__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group_8__3();

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
    // $ANTLR end "rule__Player__Group_8__2"


    // $ANTLR start "rule__Player__Group_8__2__Impl"
    // InternalEsportDsl.g:5418:1: rule__Player__Group_8__2__Impl : ( ( rule__Player__Group_8_2__0 )* ) ;
    public final void rule__Player__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5422:1: ( ( ( rule__Player__Group_8_2__0 )* ) )
            // InternalEsportDsl.g:5423:1: ( ( rule__Player__Group_8_2__0 )* )
            {
            // InternalEsportDsl.g:5423:1: ( ( rule__Player__Group_8_2__0 )* )
            // InternalEsportDsl.g:5424:2: ( rule__Player__Group_8_2__0 )*
            {
             before(grammarAccess.getPlayerAccess().getGroup_8_2()); 
            // InternalEsportDsl.g:5425:2: ( rule__Player__Group_8_2__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==58) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalEsportDsl.g:5425:3: rule__Player__Group_8_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Player__Group_8_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getPlayerAccess().getGroup_8_2()); 

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
    // $ANTLR end "rule__Player__Group_8__2__Impl"


    // $ANTLR start "rule__Player__Group_8__3"
    // InternalEsportDsl.g:5433:1: rule__Player__Group_8__3 : rule__Player__Group_8__3__Impl ;
    public final void rule__Player__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5437:1: ( rule__Player__Group_8__3__Impl )
            // InternalEsportDsl.g:5438:2: rule__Player__Group_8__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Player__Group_8__3__Impl();

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
    // $ANTLR end "rule__Player__Group_8__3"


    // $ANTLR start "rule__Player__Group_8__3__Impl"
    // InternalEsportDsl.g:5444:1: rule__Player__Group_8__3__Impl : ( ')' ) ;
    public final void rule__Player__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5448:1: ( ( ')' ) )
            // InternalEsportDsl.g:5449:1: ( ')' )
            {
            // InternalEsportDsl.g:5449:1: ( ')' )
            // InternalEsportDsl.g:5450:2: ')'
            {
             before(grammarAccess.getPlayerAccess().getRightParenthesisKeyword_8_3()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getPlayerAccess().getRightParenthesisKeyword_8_3()); 

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
    // $ANTLR end "rule__Player__Group_8__3__Impl"


    // $ANTLR start "rule__Player__Group_8_2__0"
    // InternalEsportDsl.g:5460:1: rule__Player__Group_8_2__0 : rule__Player__Group_8_2__0__Impl rule__Player__Group_8_2__1 ;
    public final void rule__Player__Group_8_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5464:1: ( rule__Player__Group_8_2__0__Impl rule__Player__Group_8_2__1 )
            // InternalEsportDsl.g:5465:2: rule__Player__Group_8_2__0__Impl rule__Player__Group_8_2__1
            {
            pushFollow(FOLLOW_31);
            rule__Player__Group_8_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group_8_2__1();

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
    // $ANTLR end "rule__Player__Group_8_2__0"


    // $ANTLR start "rule__Player__Group_8_2__0__Impl"
    // InternalEsportDsl.g:5472:1: rule__Player__Group_8_2__0__Impl : ( ',' ) ;
    public final void rule__Player__Group_8_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5476:1: ( ( ',' ) )
            // InternalEsportDsl.g:5477:1: ( ',' )
            {
            // InternalEsportDsl.g:5477:1: ( ',' )
            // InternalEsportDsl.g:5478:2: ','
            {
             before(grammarAccess.getPlayerAccess().getCommaKeyword_8_2_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getPlayerAccess().getCommaKeyword_8_2_0()); 

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
    // $ANTLR end "rule__Player__Group_8_2__0__Impl"


    // $ANTLR start "rule__Player__Group_8_2__1"
    // InternalEsportDsl.g:5487:1: rule__Player__Group_8_2__1 : rule__Player__Group_8_2__1__Impl ;
    public final void rule__Player__Group_8_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5491:1: ( rule__Player__Group_8_2__1__Impl )
            // InternalEsportDsl.g:5492:2: rule__Player__Group_8_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Player__Group_8_2__1__Impl();

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
    // $ANTLR end "rule__Player__Group_8_2__1"


    // $ANTLR start "rule__Player__Group_8_2__1__Impl"
    // InternalEsportDsl.g:5498:1: rule__Player__Group_8_2__1__Impl : ( ( rule__Player__CapacitiesAssignment_8_2_1 ) ) ;
    public final void rule__Player__Group_8_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5502:1: ( ( ( rule__Player__CapacitiesAssignment_8_2_1 ) ) )
            // InternalEsportDsl.g:5503:1: ( ( rule__Player__CapacitiesAssignment_8_2_1 ) )
            {
            // InternalEsportDsl.g:5503:1: ( ( rule__Player__CapacitiesAssignment_8_2_1 ) )
            // InternalEsportDsl.g:5504:2: ( rule__Player__CapacitiesAssignment_8_2_1 )
            {
             before(grammarAccess.getPlayerAccess().getCapacitiesAssignment_8_2_1()); 
            // InternalEsportDsl.g:5505:2: ( rule__Player__CapacitiesAssignment_8_2_1 )
            // InternalEsportDsl.g:5505:3: rule__Player__CapacitiesAssignment_8_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Player__CapacitiesAssignment_8_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPlayerAccess().getCapacitiesAssignment_8_2_1()); 

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
    // $ANTLR end "rule__Player__Group_8_2__1__Impl"


    // $ANTLR start "rule__Coach__Group__0"
    // InternalEsportDsl.g:5514:1: rule__Coach__Group__0 : rule__Coach__Group__0__Impl rule__Coach__Group__1 ;
    public final void rule__Coach__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5518:1: ( rule__Coach__Group__0__Impl rule__Coach__Group__1 )
            // InternalEsportDsl.g:5519:2: rule__Coach__Group__0__Impl rule__Coach__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Coach__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coach__Group__1();

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
    // $ANTLR end "rule__Coach__Group__0"


    // $ANTLR start "rule__Coach__Group__0__Impl"
    // InternalEsportDsl.g:5526:1: rule__Coach__Group__0__Impl : ( () ) ;
    public final void rule__Coach__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5530:1: ( ( () ) )
            // InternalEsportDsl.g:5531:1: ( () )
            {
            // InternalEsportDsl.g:5531:1: ( () )
            // InternalEsportDsl.g:5532:2: ()
            {
             before(grammarAccess.getCoachAccess().getCoachAction_0()); 
            // InternalEsportDsl.g:5533:2: ()
            // InternalEsportDsl.g:5533:3: 
            {
            }

             after(grammarAccess.getCoachAccess().getCoachAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coach__Group__0__Impl"


    // $ANTLR start "rule__Coach__Group__1"
    // InternalEsportDsl.g:5541:1: rule__Coach__Group__1 : rule__Coach__Group__1__Impl rule__Coach__Group__2 ;
    public final void rule__Coach__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5545:1: ( rule__Coach__Group__1__Impl rule__Coach__Group__2 )
            // InternalEsportDsl.g:5546:2: rule__Coach__Group__1__Impl rule__Coach__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Coach__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coach__Group__2();

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
    // $ANTLR end "rule__Coach__Group__1"


    // $ANTLR start "rule__Coach__Group__1__Impl"
    // InternalEsportDsl.g:5553:1: rule__Coach__Group__1__Impl : ( 'Coach' ) ;
    public final void rule__Coach__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5557:1: ( ( 'Coach' ) )
            // InternalEsportDsl.g:5558:1: ( 'Coach' )
            {
            // InternalEsportDsl.g:5558:1: ( 'Coach' )
            // InternalEsportDsl.g:5559:2: 'Coach'
            {
             before(grammarAccess.getCoachAccess().getCoachKeyword_1()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getCoachAccess().getCoachKeyword_1()); 

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
    // $ANTLR end "rule__Coach__Group__1__Impl"


    // $ANTLR start "rule__Coach__Group__2"
    // InternalEsportDsl.g:5568:1: rule__Coach__Group__2 : rule__Coach__Group__2__Impl rule__Coach__Group__3 ;
    public final void rule__Coach__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5572:1: ( rule__Coach__Group__2__Impl rule__Coach__Group__3 )
            // InternalEsportDsl.g:5573:2: rule__Coach__Group__2__Impl rule__Coach__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Coach__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coach__Group__3();

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
    // $ANTLR end "rule__Coach__Group__2"


    // $ANTLR start "rule__Coach__Group__2__Impl"
    // InternalEsportDsl.g:5580:1: rule__Coach__Group__2__Impl : ( ( rule__Coach__NameAssignment_2 ) ) ;
    public final void rule__Coach__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5584:1: ( ( ( rule__Coach__NameAssignment_2 ) ) )
            // InternalEsportDsl.g:5585:1: ( ( rule__Coach__NameAssignment_2 ) )
            {
            // InternalEsportDsl.g:5585:1: ( ( rule__Coach__NameAssignment_2 ) )
            // InternalEsportDsl.g:5586:2: ( rule__Coach__NameAssignment_2 )
            {
             before(grammarAccess.getCoachAccess().getNameAssignment_2()); 
            // InternalEsportDsl.g:5587:2: ( rule__Coach__NameAssignment_2 )
            // InternalEsportDsl.g:5587:3: rule__Coach__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Coach__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCoachAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Coach__Group__2__Impl"


    // $ANTLR start "rule__Coach__Group__3"
    // InternalEsportDsl.g:5595:1: rule__Coach__Group__3 : rule__Coach__Group__3__Impl rule__Coach__Group__4 ;
    public final void rule__Coach__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5599:1: ( rule__Coach__Group__3__Impl rule__Coach__Group__4 )
            // InternalEsportDsl.g:5600:2: rule__Coach__Group__3__Impl rule__Coach__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Coach__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coach__Group__4();

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
    // $ANTLR end "rule__Coach__Group__3"


    // $ANTLR start "rule__Coach__Group__3__Impl"
    // InternalEsportDsl.g:5607:1: rule__Coach__Group__3__Impl : ( ':' ) ;
    public final void rule__Coach__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5611:1: ( ( ':' ) )
            // InternalEsportDsl.g:5612:1: ( ':' )
            {
            // InternalEsportDsl.g:5612:1: ( ':' )
            // InternalEsportDsl.g:5613:2: ':'
            {
             before(grammarAccess.getCoachAccess().getColonKeyword_3()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getCoachAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__Coach__Group__3__Impl"


    // $ANTLR start "rule__Coach__Group__4"
    // InternalEsportDsl.g:5622:1: rule__Coach__Group__4 : rule__Coach__Group__4__Impl rule__Coach__Group__5 ;
    public final void rule__Coach__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5626:1: ( rule__Coach__Group__4__Impl rule__Coach__Group__5 )
            // InternalEsportDsl.g:5627:2: rule__Coach__Group__4__Impl rule__Coach__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Coach__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coach__Group__5();

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
    // $ANTLR end "rule__Coach__Group__4"


    // $ANTLR start "rule__Coach__Group__4__Impl"
    // InternalEsportDsl.g:5634:1: rule__Coach__Group__4__Impl : ( ( rule__Coach__AgeAssignment_4 ) ) ;
    public final void rule__Coach__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5638:1: ( ( ( rule__Coach__AgeAssignment_4 ) ) )
            // InternalEsportDsl.g:5639:1: ( ( rule__Coach__AgeAssignment_4 ) )
            {
            // InternalEsportDsl.g:5639:1: ( ( rule__Coach__AgeAssignment_4 ) )
            // InternalEsportDsl.g:5640:2: ( rule__Coach__AgeAssignment_4 )
            {
             before(grammarAccess.getCoachAccess().getAgeAssignment_4()); 
            // InternalEsportDsl.g:5641:2: ( rule__Coach__AgeAssignment_4 )
            // InternalEsportDsl.g:5641:3: rule__Coach__AgeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Coach__AgeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCoachAccess().getAgeAssignment_4()); 

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
    // $ANTLR end "rule__Coach__Group__4__Impl"


    // $ANTLR start "rule__Coach__Group__5"
    // InternalEsportDsl.g:5649:1: rule__Coach__Group__5 : rule__Coach__Group__5__Impl rule__Coach__Group__6 ;
    public final void rule__Coach__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5653:1: ( rule__Coach__Group__5__Impl rule__Coach__Group__6 )
            // InternalEsportDsl.g:5654:2: rule__Coach__Group__5__Impl rule__Coach__Group__6
            {
            pushFollow(FOLLOW_33);
            rule__Coach__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coach__Group__6();

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
    // $ANTLR end "rule__Coach__Group__5"


    // $ANTLR start "rule__Coach__Group__5__Impl"
    // InternalEsportDsl.g:5661:1: rule__Coach__Group__5__Impl : ( ( rule__Coach__CountryAssignment_5 ) ) ;
    public final void rule__Coach__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5665:1: ( ( ( rule__Coach__CountryAssignment_5 ) ) )
            // InternalEsportDsl.g:5666:1: ( ( rule__Coach__CountryAssignment_5 ) )
            {
            // InternalEsportDsl.g:5666:1: ( ( rule__Coach__CountryAssignment_5 ) )
            // InternalEsportDsl.g:5667:2: ( rule__Coach__CountryAssignment_5 )
            {
             before(grammarAccess.getCoachAccess().getCountryAssignment_5()); 
            // InternalEsportDsl.g:5668:2: ( rule__Coach__CountryAssignment_5 )
            // InternalEsportDsl.g:5668:3: rule__Coach__CountryAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Coach__CountryAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCoachAccess().getCountryAssignment_5()); 

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
    // $ANTLR end "rule__Coach__Group__5__Impl"


    // $ANTLR start "rule__Coach__Group__6"
    // InternalEsportDsl.g:5676:1: rule__Coach__Group__6 : rule__Coach__Group__6__Impl rule__Coach__Group__7 ;
    public final void rule__Coach__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5680:1: ( rule__Coach__Group__6__Impl rule__Coach__Group__7 )
            // InternalEsportDsl.g:5681:2: rule__Coach__Group__6__Impl rule__Coach__Group__7
            {
            pushFollow(FOLLOW_33);
            rule__Coach__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coach__Group__7();

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
    // $ANTLR end "rule__Coach__Group__6"


    // $ANTLR start "rule__Coach__Group__6__Impl"
    // InternalEsportDsl.g:5688:1: rule__Coach__Group__6__Impl : ( ( rule__Coach__DescriptionAssignment_6 )? ) ;
    public final void rule__Coach__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5692:1: ( ( ( rule__Coach__DescriptionAssignment_6 )? ) )
            // InternalEsportDsl.g:5693:1: ( ( rule__Coach__DescriptionAssignment_6 )? )
            {
            // InternalEsportDsl.g:5693:1: ( ( rule__Coach__DescriptionAssignment_6 )? )
            // InternalEsportDsl.g:5694:2: ( rule__Coach__DescriptionAssignment_6 )?
            {
             before(grammarAccess.getCoachAccess().getDescriptionAssignment_6()); 
            // InternalEsportDsl.g:5695:2: ( rule__Coach__DescriptionAssignment_6 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_STRING && LA44_0<=RULE_ID)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalEsportDsl.g:5695:3: rule__Coach__DescriptionAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Coach__DescriptionAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCoachAccess().getDescriptionAssignment_6()); 

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
    // $ANTLR end "rule__Coach__Group__6__Impl"


    // $ANTLR start "rule__Coach__Group__7"
    // InternalEsportDsl.g:5703:1: rule__Coach__Group__7 : rule__Coach__Group__7__Impl ;
    public final void rule__Coach__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5707:1: ( rule__Coach__Group__7__Impl )
            // InternalEsportDsl.g:5708:2: rule__Coach__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Coach__Group__7__Impl();

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
    // $ANTLR end "rule__Coach__Group__7"


    // $ANTLR start "rule__Coach__Group__7__Impl"
    // InternalEsportDsl.g:5714:1: rule__Coach__Group__7__Impl : ( ( rule__Coach__Group_7__0 )? ) ;
    public final void rule__Coach__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5718:1: ( ( ( rule__Coach__Group_7__0 )? ) )
            // InternalEsportDsl.g:5719:1: ( ( rule__Coach__Group_7__0 )? )
            {
            // InternalEsportDsl.g:5719:1: ( ( rule__Coach__Group_7__0 )? )
            // InternalEsportDsl.g:5720:2: ( rule__Coach__Group_7__0 )?
            {
             before(grammarAccess.getCoachAccess().getGroup_7()); 
            // InternalEsportDsl.g:5721:2: ( rule__Coach__Group_7__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==56) ) {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==74) ) {
                    alt45=1;
                }
            }
            switch (alt45) {
                case 1 :
                    // InternalEsportDsl.g:5721:3: rule__Coach__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Coach__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCoachAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Coach__Group__7__Impl"


    // $ANTLR start "rule__Coach__Group_7__0"
    // InternalEsportDsl.g:5730:1: rule__Coach__Group_7__0 : rule__Coach__Group_7__0__Impl rule__Coach__Group_7__1 ;
    public final void rule__Coach__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5734:1: ( rule__Coach__Group_7__0__Impl rule__Coach__Group_7__1 )
            // InternalEsportDsl.g:5735:2: rule__Coach__Group_7__0__Impl rule__Coach__Group_7__1
            {
            pushFollow(FOLLOW_31);
            rule__Coach__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coach__Group_7__1();

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
    // $ANTLR end "rule__Coach__Group_7__0"


    // $ANTLR start "rule__Coach__Group_7__0__Impl"
    // InternalEsportDsl.g:5742:1: rule__Coach__Group_7__0__Impl : ( '(' ) ;
    public final void rule__Coach__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5746:1: ( ( '(' ) )
            // InternalEsportDsl.g:5747:1: ( '(' )
            {
            // InternalEsportDsl.g:5747:1: ( '(' )
            // InternalEsportDsl.g:5748:2: '('
            {
             before(grammarAccess.getCoachAccess().getLeftParenthesisKeyword_7_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getCoachAccess().getLeftParenthesisKeyword_7_0()); 

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
    // $ANTLR end "rule__Coach__Group_7__0__Impl"


    // $ANTLR start "rule__Coach__Group_7__1"
    // InternalEsportDsl.g:5757:1: rule__Coach__Group_7__1 : rule__Coach__Group_7__1__Impl rule__Coach__Group_7__2 ;
    public final void rule__Coach__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5761:1: ( rule__Coach__Group_7__1__Impl rule__Coach__Group_7__2 )
            // InternalEsportDsl.g:5762:2: rule__Coach__Group_7__1__Impl rule__Coach__Group_7__2
            {
            pushFollow(FOLLOW_9);
            rule__Coach__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coach__Group_7__2();

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
    // $ANTLR end "rule__Coach__Group_7__1"


    // $ANTLR start "rule__Coach__Group_7__1__Impl"
    // InternalEsportDsl.g:5769:1: rule__Coach__Group_7__1__Impl : ( ( rule__Coach__CapacitiesAssignment_7_1 ) ) ;
    public final void rule__Coach__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5773:1: ( ( ( rule__Coach__CapacitiesAssignment_7_1 ) ) )
            // InternalEsportDsl.g:5774:1: ( ( rule__Coach__CapacitiesAssignment_7_1 ) )
            {
            // InternalEsportDsl.g:5774:1: ( ( rule__Coach__CapacitiesAssignment_7_1 ) )
            // InternalEsportDsl.g:5775:2: ( rule__Coach__CapacitiesAssignment_7_1 )
            {
             before(grammarAccess.getCoachAccess().getCapacitiesAssignment_7_1()); 
            // InternalEsportDsl.g:5776:2: ( rule__Coach__CapacitiesAssignment_7_1 )
            // InternalEsportDsl.g:5776:3: rule__Coach__CapacitiesAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Coach__CapacitiesAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getCoachAccess().getCapacitiesAssignment_7_1()); 

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
    // $ANTLR end "rule__Coach__Group_7__1__Impl"


    // $ANTLR start "rule__Coach__Group_7__2"
    // InternalEsportDsl.g:5784:1: rule__Coach__Group_7__2 : rule__Coach__Group_7__2__Impl rule__Coach__Group_7__3 ;
    public final void rule__Coach__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5788:1: ( rule__Coach__Group_7__2__Impl rule__Coach__Group_7__3 )
            // InternalEsportDsl.g:5789:2: rule__Coach__Group_7__2__Impl rule__Coach__Group_7__3
            {
            pushFollow(FOLLOW_9);
            rule__Coach__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coach__Group_7__3();

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
    // $ANTLR end "rule__Coach__Group_7__2"


    // $ANTLR start "rule__Coach__Group_7__2__Impl"
    // InternalEsportDsl.g:5796:1: rule__Coach__Group_7__2__Impl : ( ( rule__Coach__Group_7_2__0 )* ) ;
    public final void rule__Coach__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5800:1: ( ( ( rule__Coach__Group_7_2__0 )* ) )
            // InternalEsportDsl.g:5801:1: ( ( rule__Coach__Group_7_2__0 )* )
            {
            // InternalEsportDsl.g:5801:1: ( ( rule__Coach__Group_7_2__0 )* )
            // InternalEsportDsl.g:5802:2: ( rule__Coach__Group_7_2__0 )*
            {
             before(grammarAccess.getCoachAccess().getGroup_7_2()); 
            // InternalEsportDsl.g:5803:2: ( rule__Coach__Group_7_2__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==58) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalEsportDsl.g:5803:3: rule__Coach__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Coach__Group_7_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getCoachAccess().getGroup_7_2()); 

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
    // $ANTLR end "rule__Coach__Group_7__2__Impl"


    // $ANTLR start "rule__Coach__Group_7__3"
    // InternalEsportDsl.g:5811:1: rule__Coach__Group_7__3 : rule__Coach__Group_7__3__Impl ;
    public final void rule__Coach__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5815:1: ( rule__Coach__Group_7__3__Impl )
            // InternalEsportDsl.g:5816:2: rule__Coach__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Coach__Group_7__3__Impl();

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
    // $ANTLR end "rule__Coach__Group_7__3"


    // $ANTLR start "rule__Coach__Group_7__3__Impl"
    // InternalEsportDsl.g:5822:1: rule__Coach__Group_7__3__Impl : ( ')' ) ;
    public final void rule__Coach__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5826:1: ( ( ')' ) )
            // InternalEsportDsl.g:5827:1: ( ')' )
            {
            // InternalEsportDsl.g:5827:1: ( ')' )
            // InternalEsportDsl.g:5828:2: ')'
            {
             before(grammarAccess.getCoachAccess().getRightParenthesisKeyword_7_3()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getCoachAccess().getRightParenthesisKeyword_7_3()); 

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
    // $ANTLR end "rule__Coach__Group_7__3__Impl"


    // $ANTLR start "rule__Coach__Group_7_2__0"
    // InternalEsportDsl.g:5838:1: rule__Coach__Group_7_2__0 : rule__Coach__Group_7_2__0__Impl rule__Coach__Group_7_2__1 ;
    public final void rule__Coach__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5842:1: ( rule__Coach__Group_7_2__0__Impl rule__Coach__Group_7_2__1 )
            // InternalEsportDsl.g:5843:2: rule__Coach__Group_7_2__0__Impl rule__Coach__Group_7_2__1
            {
            pushFollow(FOLLOW_31);
            rule__Coach__Group_7_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coach__Group_7_2__1();

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
    // $ANTLR end "rule__Coach__Group_7_2__0"


    // $ANTLR start "rule__Coach__Group_7_2__0__Impl"
    // InternalEsportDsl.g:5850:1: rule__Coach__Group_7_2__0__Impl : ( ',' ) ;
    public final void rule__Coach__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5854:1: ( ( ',' ) )
            // InternalEsportDsl.g:5855:1: ( ',' )
            {
            // InternalEsportDsl.g:5855:1: ( ',' )
            // InternalEsportDsl.g:5856:2: ','
            {
             before(grammarAccess.getCoachAccess().getCommaKeyword_7_2_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getCoachAccess().getCommaKeyword_7_2_0()); 

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
    // $ANTLR end "rule__Coach__Group_7_2__0__Impl"


    // $ANTLR start "rule__Coach__Group_7_2__1"
    // InternalEsportDsl.g:5865:1: rule__Coach__Group_7_2__1 : rule__Coach__Group_7_2__1__Impl ;
    public final void rule__Coach__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5869:1: ( rule__Coach__Group_7_2__1__Impl )
            // InternalEsportDsl.g:5870:2: rule__Coach__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Coach__Group_7_2__1__Impl();

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
    // $ANTLR end "rule__Coach__Group_7_2__1"


    // $ANTLR start "rule__Coach__Group_7_2__1__Impl"
    // InternalEsportDsl.g:5876:1: rule__Coach__Group_7_2__1__Impl : ( ( rule__Coach__CapacitiesAssignment_7_2_1 ) ) ;
    public final void rule__Coach__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5880:1: ( ( ( rule__Coach__CapacitiesAssignment_7_2_1 ) ) )
            // InternalEsportDsl.g:5881:1: ( ( rule__Coach__CapacitiesAssignment_7_2_1 ) )
            {
            // InternalEsportDsl.g:5881:1: ( ( rule__Coach__CapacitiesAssignment_7_2_1 ) )
            // InternalEsportDsl.g:5882:2: ( rule__Coach__CapacitiesAssignment_7_2_1 )
            {
             before(grammarAccess.getCoachAccess().getCapacitiesAssignment_7_2_1()); 
            // InternalEsportDsl.g:5883:2: ( rule__Coach__CapacitiesAssignment_7_2_1 )
            // InternalEsportDsl.g:5883:3: rule__Coach__CapacitiesAssignment_7_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Coach__CapacitiesAssignment_7_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCoachAccess().getCapacitiesAssignment_7_2_1()); 

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
    // $ANTLR end "rule__Coach__Group_7_2__1__Impl"


    // $ANTLR start "rule__Capacity__Group__0"
    // InternalEsportDsl.g:5892:1: rule__Capacity__Group__0 : rule__Capacity__Group__0__Impl rule__Capacity__Group__1 ;
    public final void rule__Capacity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5896:1: ( rule__Capacity__Group__0__Impl rule__Capacity__Group__1 )
            // InternalEsportDsl.g:5897:2: rule__Capacity__Group__0__Impl rule__Capacity__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__Capacity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Capacity__Group__1();

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
    // $ANTLR end "rule__Capacity__Group__0"


    // $ANTLR start "rule__Capacity__Group__0__Impl"
    // InternalEsportDsl.g:5904:1: rule__Capacity__Group__0__Impl : ( () ) ;
    public final void rule__Capacity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5908:1: ( ( () ) )
            // InternalEsportDsl.g:5909:1: ( () )
            {
            // InternalEsportDsl.g:5909:1: ( () )
            // InternalEsportDsl.g:5910:2: ()
            {
             before(grammarAccess.getCapacityAccess().getCapacityAction_0()); 
            // InternalEsportDsl.g:5911:2: ()
            // InternalEsportDsl.g:5911:3: 
            {
            }

             after(grammarAccess.getCapacityAccess().getCapacityAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capacity__Group__0__Impl"


    // $ANTLR start "rule__Capacity__Group__1"
    // InternalEsportDsl.g:5919:1: rule__Capacity__Group__1 : rule__Capacity__Group__1__Impl rule__Capacity__Group__2 ;
    public final void rule__Capacity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5923:1: ( rule__Capacity__Group__1__Impl rule__Capacity__Group__2 )
            // InternalEsportDsl.g:5924:2: rule__Capacity__Group__1__Impl rule__Capacity__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Capacity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Capacity__Group__2();

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
    // $ANTLR end "rule__Capacity__Group__1"


    // $ANTLR start "rule__Capacity__Group__1__Impl"
    // InternalEsportDsl.g:5931:1: rule__Capacity__Group__1__Impl : ( 'Capacity' ) ;
    public final void rule__Capacity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5935:1: ( ( 'Capacity' ) )
            // InternalEsportDsl.g:5936:1: ( 'Capacity' )
            {
            // InternalEsportDsl.g:5936:1: ( 'Capacity' )
            // InternalEsportDsl.g:5937:2: 'Capacity'
            {
             before(grammarAccess.getCapacityAccess().getCapacityKeyword_1()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getCapacityAccess().getCapacityKeyword_1()); 

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
    // $ANTLR end "rule__Capacity__Group__1__Impl"


    // $ANTLR start "rule__Capacity__Group__2"
    // InternalEsportDsl.g:5946:1: rule__Capacity__Group__2 : rule__Capacity__Group__2__Impl rule__Capacity__Group__3 ;
    public final void rule__Capacity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5950:1: ( rule__Capacity__Group__2__Impl rule__Capacity__Group__3 )
            // InternalEsportDsl.g:5951:2: rule__Capacity__Group__2__Impl rule__Capacity__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__Capacity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Capacity__Group__3();

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
    // $ANTLR end "rule__Capacity__Group__2"


    // $ANTLR start "rule__Capacity__Group__2__Impl"
    // InternalEsportDsl.g:5958:1: rule__Capacity__Group__2__Impl : ( ':' ) ;
    public final void rule__Capacity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5962:1: ( ( ':' ) )
            // InternalEsportDsl.g:5963:1: ( ':' )
            {
            // InternalEsportDsl.g:5963:1: ( ':' )
            // InternalEsportDsl.g:5964:2: ':'
            {
             before(grammarAccess.getCapacityAccess().getColonKeyword_2()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getCapacityAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Capacity__Group__2__Impl"


    // $ANTLR start "rule__Capacity__Group__3"
    // InternalEsportDsl.g:5973:1: rule__Capacity__Group__3 : rule__Capacity__Group__3__Impl rule__Capacity__Group__4 ;
    public final void rule__Capacity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5977:1: ( rule__Capacity__Group__3__Impl rule__Capacity__Group__4 )
            // InternalEsportDsl.g:5978:2: rule__Capacity__Group__3__Impl rule__Capacity__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Capacity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Capacity__Group__4();

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
    // $ANTLR end "rule__Capacity__Group__3"


    // $ANTLR start "rule__Capacity__Group__3__Impl"
    // InternalEsportDsl.g:5985:1: rule__Capacity__Group__3__Impl : ( ( rule__Capacity__TypeAssignment_3 ) ) ;
    public final void rule__Capacity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:5989:1: ( ( ( rule__Capacity__TypeAssignment_3 ) ) )
            // InternalEsportDsl.g:5990:1: ( ( rule__Capacity__TypeAssignment_3 ) )
            {
            // InternalEsportDsl.g:5990:1: ( ( rule__Capacity__TypeAssignment_3 ) )
            // InternalEsportDsl.g:5991:2: ( rule__Capacity__TypeAssignment_3 )
            {
             before(grammarAccess.getCapacityAccess().getTypeAssignment_3()); 
            // InternalEsportDsl.g:5992:2: ( rule__Capacity__TypeAssignment_3 )
            // InternalEsportDsl.g:5992:3: rule__Capacity__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Capacity__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCapacityAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__Capacity__Group__3__Impl"


    // $ANTLR start "rule__Capacity__Group__4"
    // InternalEsportDsl.g:6000:1: rule__Capacity__Group__4 : rule__Capacity__Group__4__Impl ;
    public final void rule__Capacity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6004:1: ( rule__Capacity__Group__4__Impl )
            // InternalEsportDsl.g:6005:2: rule__Capacity__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Capacity__Group__4__Impl();

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
    // $ANTLR end "rule__Capacity__Group__4"


    // $ANTLR start "rule__Capacity__Group__4__Impl"
    // InternalEsportDsl.g:6011:1: rule__Capacity__Group__4__Impl : ( ( rule__Capacity__ValueAssignment_4 ) ) ;
    public final void rule__Capacity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6015:1: ( ( ( rule__Capacity__ValueAssignment_4 ) ) )
            // InternalEsportDsl.g:6016:1: ( ( rule__Capacity__ValueAssignment_4 ) )
            {
            // InternalEsportDsl.g:6016:1: ( ( rule__Capacity__ValueAssignment_4 ) )
            // InternalEsportDsl.g:6017:2: ( rule__Capacity__ValueAssignment_4 )
            {
             before(grammarAccess.getCapacityAccess().getValueAssignment_4()); 
            // InternalEsportDsl.g:6018:2: ( rule__Capacity__ValueAssignment_4 )
            // InternalEsportDsl.g:6018:3: rule__Capacity__ValueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Capacity__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCapacityAccess().getValueAssignment_4()); 

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
    // $ANTLR end "rule__Capacity__Group__4__Impl"


    // $ANTLR start "rule__Root__ZonesAssignment_0"
    // InternalEsportDsl.g:6027:1: rule__Root__ZonesAssignment_0 : ( ruleZone ) ;
    public final void rule__Root__ZonesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6031:1: ( ( ruleZone ) )
            // InternalEsportDsl.g:6032:2: ( ruleZone )
            {
            // InternalEsportDsl.g:6032:2: ( ruleZone )
            // InternalEsportDsl.g:6033:3: ruleZone
            {
             before(grammarAccess.getRootAccess().getZonesZoneParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleZone();

            state._fsp--;

             after(grammarAccess.getRootAccess().getZonesZoneParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Root__ZonesAssignment_0"


    // $ANTLR start "rule__Root__TournamentsAssignment_1"
    // InternalEsportDsl.g:6042:1: rule__Root__TournamentsAssignment_1 : ( ruleTournament ) ;
    public final void rule__Root__TournamentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6046:1: ( ( ruleTournament ) )
            // InternalEsportDsl.g:6047:2: ( ruleTournament )
            {
            // InternalEsportDsl.g:6047:2: ( ruleTournament )
            // InternalEsportDsl.g:6048:3: ruleTournament
            {
             before(grammarAccess.getRootAccess().getTournamentsTournamentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTournament();

            state._fsp--;

             after(grammarAccess.getRootAccess().getTournamentsTournamentParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Root__TournamentsAssignment_1"


    // $ANTLR start "rule__Root__LeaguesAssignment_2"
    // InternalEsportDsl.g:6057:1: rule__Root__LeaguesAssignment_2 : ( ruleLeague ) ;
    public final void rule__Root__LeaguesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6061:1: ( ( ruleLeague ) )
            // InternalEsportDsl.g:6062:2: ( ruleLeague )
            {
            // InternalEsportDsl.g:6062:2: ( ruleLeague )
            // InternalEsportDsl.g:6063:3: ruleLeague
            {
             before(grammarAccess.getRootAccess().getLeaguesLeagueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLeague();

            state._fsp--;

             after(grammarAccess.getRootAccess().getLeaguesLeagueParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Root__LeaguesAssignment_2"


    // $ANTLR start "rule__Root__TeamsAssignment_3"
    // InternalEsportDsl.g:6072:1: rule__Root__TeamsAssignment_3 : ( ruleTeam ) ;
    public final void rule__Root__TeamsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6076:1: ( ( ruleTeam ) )
            // InternalEsportDsl.g:6077:2: ( ruleTeam )
            {
            // InternalEsportDsl.g:6077:2: ( ruleTeam )
            // InternalEsportDsl.g:6078:3: ruleTeam
            {
             before(grammarAccess.getRootAccess().getTeamsTeamParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTeam();

            state._fsp--;

             after(grammarAccess.getRootAccess().getTeamsTeamParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Root__TeamsAssignment_3"


    // $ANTLR start "rule__Root__PersonsAssignment_4"
    // InternalEsportDsl.g:6087:1: rule__Root__PersonsAssignment_4 : ( rulePerson ) ;
    public final void rule__Root__PersonsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6091:1: ( ( rulePerson ) )
            // InternalEsportDsl.g:6092:2: ( rulePerson )
            {
            // InternalEsportDsl.g:6092:2: ( rulePerson )
            // InternalEsportDsl.g:6093:3: rulePerson
            {
             before(grammarAccess.getRootAccess().getPersonsPersonParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getRootAccess().getPersonsPersonParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Root__PersonsAssignment_4"


    // $ANTLR start "rule__Root__QualificationsAssignment_5"
    // InternalEsportDsl.g:6102:1: rule__Root__QualificationsAssignment_5 : ( ruleQualification ) ;
    public final void rule__Root__QualificationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6106:1: ( ( ruleQualification ) )
            // InternalEsportDsl.g:6107:2: ( ruleQualification )
            {
            // InternalEsportDsl.g:6107:2: ( ruleQualification )
            // InternalEsportDsl.g:6108:3: ruleQualification
            {
             before(grammarAccess.getRootAccess().getQualificationsQualificationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleQualification();

            state._fsp--;

             after(grammarAccess.getRootAccess().getQualificationsQualificationParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Root__QualificationsAssignment_5"


    // $ANTLR start "rule__Root__CountriesAssignment_6"
    // InternalEsportDsl.g:6117:1: rule__Root__CountriesAssignment_6 : ( ruleCountry ) ;
    public final void rule__Root__CountriesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6121:1: ( ( ruleCountry ) )
            // InternalEsportDsl.g:6122:2: ( ruleCountry )
            {
            // InternalEsportDsl.g:6122:2: ( ruleCountry )
            // InternalEsportDsl.g:6123:3: ruleCountry
            {
             before(grammarAccess.getRootAccess().getCountriesCountryParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleCountry();

            state._fsp--;

             after(grammarAccess.getRootAccess().getCountriesCountryParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Root__CountriesAssignment_6"


    // $ANTLR start "rule__Zone__NameAssignment_2"
    // InternalEsportDsl.g:6132:1: rule__Zone__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Zone__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6136:1: ( ( ruleEString ) )
            // InternalEsportDsl.g:6137:2: ( ruleEString )
            {
            // InternalEsportDsl.g:6137:2: ( ruleEString )
            // InternalEsportDsl.g:6138:3: ruleEString
            {
             before(grammarAccess.getZoneAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getZoneAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Zone__NameAssignment_2"


    // $ANTLR start "rule__Zone__CountriesAssignment_5"
    // InternalEsportDsl.g:6147:1: rule__Zone__CountriesAssignment_5 : ( ruleCountry ) ;
    public final void rule__Zone__CountriesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6151:1: ( ( ruleCountry ) )
            // InternalEsportDsl.g:6152:2: ( ruleCountry )
            {
            // InternalEsportDsl.g:6152:2: ( ruleCountry )
            // InternalEsportDsl.g:6153:3: ruleCountry
            {
             before(grammarAccess.getZoneAccess().getCountriesCountryParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCountry();

            state._fsp--;

             after(grammarAccess.getZoneAccess().getCountriesCountryParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Zone__CountriesAssignment_5"


    // $ANTLR start "rule__Zone__CountriesAssignment_6_1"
    // InternalEsportDsl.g:6162:1: rule__Zone__CountriesAssignment_6_1 : ( ruleCountry ) ;
    public final void rule__Zone__CountriesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6166:1: ( ( ruleCountry ) )
            // InternalEsportDsl.g:6167:2: ( ruleCountry )
            {
            // InternalEsportDsl.g:6167:2: ( ruleCountry )
            // InternalEsportDsl.g:6168:3: ruleCountry
            {
             before(grammarAccess.getZoneAccess().getCountriesCountryParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCountry();

            state._fsp--;

             after(grammarAccess.getZoneAccess().getCountriesCountryParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Zone__CountriesAssignment_6_1"


    // $ANTLR start "rule__Zone__TeamsAssignment_8_1"
    // InternalEsportDsl.g:6177:1: rule__Zone__TeamsAssignment_8_1 : ( ruleTeam ) ;
    public final void rule__Zone__TeamsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6181:1: ( ( ruleTeam ) )
            // InternalEsportDsl.g:6182:2: ( ruleTeam )
            {
            // InternalEsportDsl.g:6182:2: ( ruleTeam )
            // InternalEsportDsl.g:6183:3: ruleTeam
            {
             before(grammarAccess.getZoneAccess().getTeamsTeamParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTeam();

            state._fsp--;

             after(grammarAccess.getZoneAccess().getTeamsTeamParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__Zone__TeamsAssignment_8_1"


    // $ANTLR start "rule__Zone__TeamsAssignment_8_2_1"
    // InternalEsportDsl.g:6192:1: rule__Zone__TeamsAssignment_8_2_1 : ( ruleTeam ) ;
    public final void rule__Zone__TeamsAssignment_8_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6196:1: ( ( ruleTeam ) )
            // InternalEsportDsl.g:6197:2: ( ruleTeam )
            {
            // InternalEsportDsl.g:6197:2: ( ruleTeam )
            // InternalEsportDsl.g:6198:3: ruleTeam
            {
             before(grammarAccess.getZoneAccess().getTeamsTeamParserRuleCall_8_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTeam();

            state._fsp--;

             after(grammarAccess.getZoneAccess().getTeamsTeamParserRuleCall_8_2_1_0()); 

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
    // $ANTLR end "rule__Zone__TeamsAssignment_8_2_1"


    // $ANTLR start "rule__Tournament__NameAssignment_2"
    // InternalEsportDsl.g:6207:1: rule__Tournament__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Tournament__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6211:1: ( ( ruleEString ) )
            // InternalEsportDsl.g:6212:2: ( ruleEString )
            {
            // InternalEsportDsl.g:6212:2: ( ruleEString )
            // InternalEsportDsl.g:6213:3: ruleEString
            {
             before(grammarAccess.getTournamentAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTournamentAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Tournament__NameAssignment_2"


    // $ANTLR start "rule__Tournament__SizeAssignment_4"
    // InternalEsportDsl.g:6222:1: rule__Tournament__SizeAssignment_4 : ( ruleEInt ) ;
    public final void rule__Tournament__SizeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6226:1: ( ( ruleEInt ) )
            // InternalEsportDsl.g:6227:2: ( ruleEInt )
            {
            // InternalEsportDsl.g:6227:2: ( ruleEInt )
            // InternalEsportDsl.g:6228:3: ruleEInt
            {
             before(grammarAccess.getTournamentAccess().getSizeEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTournamentAccess().getSizeEIntParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Tournament__SizeAssignment_4"


    // $ANTLR start "rule__Tournament__TypeAssignment_5"
    // InternalEsportDsl.g:6237:1: rule__Tournament__TypeAssignment_5 : ( ruleTournamentType ) ;
    public final void rule__Tournament__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6241:1: ( ( ruleTournamentType ) )
            // InternalEsportDsl.g:6242:2: ( ruleTournamentType )
            {
            // InternalEsportDsl.g:6242:2: ( ruleTournamentType )
            // InternalEsportDsl.g:6243:3: ruleTournamentType
            {
             before(grammarAccess.getTournamentAccess().getTypeTournamentTypeEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTournamentType();

            state._fsp--;

             after(grammarAccess.getTournamentAccess().getTypeTournamentTypeEnumRuleCall_5_0()); 

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
    // $ANTLR end "rule__Tournament__TypeAssignment_5"


    // $ANTLR start "rule__Tournament__YearAssignment_6"
    // InternalEsportDsl.g:6252:1: rule__Tournament__YearAssignment_6 : ( ruleEInt ) ;
    public final void rule__Tournament__YearAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6256:1: ( ( ruleEInt ) )
            // InternalEsportDsl.g:6257:2: ( ruleEInt )
            {
            // InternalEsportDsl.g:6257:2: ( ruleEInt )
            // InternalEsportDsl.g:6258:3: ruleEInt
            {
             before(grammarAccess.getTournamentAccess().getYearEIntParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTournamentAccess().getYearEIntParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Tournament__YearAssignment_6"


    // $ANTLR start "rule__Tournament__AllowedZonesAssignment_8"
    // InternalEsportDsl.g:6267:1: rule__Tournament__AllowedZonesAssignment_8 : ( ( ruleEString ) ) ;
    public final void rule__Tournament__AllowedZonesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6271:1: ( ( ( ruleEString ) ) )
            // InternalEsportDsl.g:6272:2: ( ( ruleEString ) )
            {
            // InternalEsportDsl.g:6272:2: ( ( ruleEString ) )
            // InternalEsportDsl.g:6273:3: ( ruleEString )
            {
             before(grammarAccess.getTournamentAccess().getAllowedZonesZoneCrossReference_8_0()); 
            // InternalEsportDsl.g:6274:3: ( ruleEString )
            // InternalEsportDsl.g:6275:4: ruleEString
            {
             before(grammarAccess.getTournamentAccess().getAllowedZonesZoneEStringParserRuleCall_8_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTournamentAccess().getAllowedZonesZoneEStringParserRuleCall_8_0_1()); 

            }

             after(grammarAccess.getTournamentAccess().getAllowedZonesZoneCrossReference_8_0()); 

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
    // $ANTLR end "rule__Tournament__AllowedZonesAssignment_8"


    // $ANTLR start "rule__Tournament__AllowedZonesAssignment_9_1"
    // InternalEsportDsl.g:6286:1: rule__Tournament__AllowedZonesAssignment_9_1 : ( ( ruleEString ) ) ;
    public final void rule__Tournament__AllowedZonesAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6290:1: ( ( ( ruleEString ) ) )
            // InternalEsportDsl.g:6291:2: ( ( ruleEString ) )
            {
            // InternalEsportDsl.g:6291:2: ( ( ruleEString ) )
            // InternalEsportDsl.g:6292:3: ( ruleEString )
            {
             before(grammarAccess.getTournamentAccess().getAllowedZonesZoneCrossReference_9_1_0()); 
            // InternalEsportDsl.g:6293:3: ( ruleEString )
            // InternalEsportDsl.g:6294:4: ruleEString
            {
             before(grammarAccess.getTournamentAccess().getAllowedZonesZoneEStringParserRuleCall_9_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTournamentAccess().getAllowedZonesZoneEStringParserRuleCall_9_1_0_1()); 

            }

             after(grammarAccess.getTournamentAccess().getAllowedZonesZoneCrossReference_9_1_0()); 

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
    // $ANTLR end "rule__Tournament__AllowedZonesAssignment_9_1"


    // $ANTLR start "rule__Tournament__CountriesAssignment_11_1"
    // InternalEsportDsl.g:6305:1: rule__Tournament__CountriesAssignment_11_1 : ( ( ruleEString ) ) ;
    public final void rule__Tournament__CountriesAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6309:1: ( ( ( ruleEString ) ) )
            // InternalEsportDsl.g:6310:2: ( ( ruleEString ) )
            {
            // InternalEsportDsl.g:6310:2: ( ( ruleEString ) )
            // InternalEsportDsl.g:6311:3: ( ruleEString )
            {
             before(grammarAccess.getTournamentAccess().getCountriesCountryCrossReference_11_1_0()); 
            // InternalEsportDsl.g:6312:3: ( ruleEString )
            // InternalEsportDsl.g:6313:4: ruleEString
            {
             before(grammarAccess.getTournamentAccess().getCountriesCountryEStringParserRuleCall_11_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTournamentAccess().getCountriesCountryEStringParserRuleCall_11_1_0_1()); 

            }

             after(grammarAccess.getTournamentAccess().getCountriesCountryCrossReference_11_1_0()); 

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
    // $ANTLR end "rule__Tournament__CountriesAssignment_11_1"


    // $ANTLR start "rule__Tournament__CountriesAssignment_11_2_1"
    // InternalEsportDsl.g:6324:1: rule__Tournament__CountriesAssignment_11_2_1 : ( ( ruleEString ) ) ;
    public final void rule__Tournament__CountriesAssignment_11_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6328:1: ( ( ( ruleEString ) ) )
            // InternalEsportDsl.g:6329:2: ( ( ruleEString ) )
            {
            // InternalEsportDsl.g:6329:2: ( ( ruleEString ) )
            // InternalEsportDsl.g:6330:3: ( ruleEString )
            {
             before(grammarAccess.getTournamentAccess().getCountriesCountryCrossReference_11_2_1_0()); 
            // InternalEsportDsl.g:6331:3: ( ruleEString )
            // InternalEsportDsl.g:6332:4: ruleEString
            {
             before(grammarAccess.getTournamentAccess().getCountriesCountryEStringParserRuleCall_11_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTournamentAccess().getCountriesCountryEStringParserRuleCall_11_2_1_0_1()); 

            }

             after(grammarAccess.getTournamentAccess().getCountriesCountryCrossReference_11_2_1_0()); 

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
    // $ANTLR end "rule__Tournament__CountriesAssignment_11_2_1"


    // $ANTLR start "rule__Tournament__QualifiesForAssignment_12_1"
    // InternalEsportDsl.g:6343:1: rule__Tournament__QualifiesForAssignment_12_1 : ( ( ruleEString ) ) ;
    public final void rule__Tournament__QualifiesForAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6347:1: ( ( ( ruleEString ) ) )
            // InternalEsportDsl.g:6348:2: ( ( ruleEString ) )
            {
            // InternalEsportDsl.g:6348:2: ( ( ruleEString ) )
            // InternalEsportDsl.g:6349:3: ( ruleEString )
            {
             before(grammarAccess.getTournamentAccess().getQualifiesForQualificationCrossReference_12_1_0()); 
            // InternalEsportDsl.g:6350:3: ( ruleEString )
            // InternalEsportDsl.g:6351:4: ruleEString
            {
             before(grammarAccess.getTournamentAccess().getQualifiesForQualificationEStringParserRuleCall_12_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTournamentAccess().getQualifiesForQualificationEStringParserRuleCall_12_1_0_1()); 

            }

             after(grammarAccess.getTournamentAccess().getQualifiesForQualificationCrossReference_12_1_0()); 

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
    // $ANTLR end "rule__Tournament__QualifiesForAssignment_12_1"


    // $ANTLR start "rule__Tournament__QualifiesFromAssignment_13_2"
    // InternalEsportDsl.g:6362:1: rule__Tournament__QualifiesFromAssignment_13_2 : ( ( ruleEString ) ) ;
    public final void rule__Tournament__QualifiesFromAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6366:1: ( ( ( ruleEString ) ) )
            // InternalEsportDsl.g:6367:2: ( ( ruleEString ) )
            {
            // InternalEsportDsl.g:6367:2: ( ( ruleEString ) )
            // InternalEsportDsl.g:6368:3: ( ruleEString )
            {
             before(grammarAccess.getTournamentAccess().getQualifiesFromQualificationCrossReference_13_2_0()); 
            // InternalEsportDsl.g:6369:3: ( ruleEString )
            // InternalEsportDsl.g:6370:4: ruleEString
            {
             before(grammarAccess.getTournamentAccess().getQualifiesFromQualificationEStringParserRuleCall_13_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTournamentAccess().getQualifiesFromQualificationEStringParserRuleCall_13_2_0_1()); 

            }

             after(grammarAccess.getTournamentAccess().getQualifiesFromQualificationCrossReference_13_2_0()); 

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
    // $ANTLR end "rule__Tournament__QualifiesFromAssignment_13_2"


    // $ANTLR start "rule__Tournament__QualifiesFromAssignment_13_3_1"
    // InternalEsportDsl.g:6381:1: rule__Tournament__QualifiesFromAssignment_13_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Tournament__QualifiesFromAssignment_13_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6385:1: ( ( ( ruleEString ) ) )
            // InternalEsportDsl.g:6386:2: ( ( ruleEString ) )
            {
            // InternalEsportDsl.g:6386:2: ( ( ruleEString ) )
            // InternalEsportDsl.g:6387:3: ( ruleEString )
            {
             before(grammarAccess.getTournamentAccess().getQualifiesFromQualificationCrossReference_13_3_1_0()); 
            // InternalEsportDsl.g:6388:3: ( ruleEString )
            // InternalEsportDsl.g:6389:4: ruleEString
            {
             before(grammarAccess.getTournamentAccess().getQualifiesFromQualificationEStringParserRuleCall_13_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTournamentAccess().getQualifiesFromQualificationEStringParserRuleCall_13_3_1_0_1()); 

            }

             after(grammarAccess.getTournamentAccess().getQualifiesFromQualificationCrossReference_13_3_1_0()); 

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
    // $ANTLR end "rule__Tournament__QualifiesFromAssignment_13_3_1"


    // $ANTLR start "rule__Tournament__FinalstagesAssignment_14_1"
    // InternalEsportDsl.g:6400:1: rule__Tournament__FinalstagesAssignment_14_1 : ( ruleFinalStage ) ;
    public final void rule__Tournament__FinalstagesAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6404:1: ( ( ruleFinalStage ) )
            // InternalEsportDsl.g:6405:2: ( ruleFinalStage )
            {
            // InternalEsportDsl.g:6405:2: ( ruleFinalStage )
            // InternalEsportDsl.g:6406:3: ruleFinalStage
            {
             before(grammarAccess.getTournamentAccess().getFinalstagesFinalStageParserRuleCall_14_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFinalStage();

            state._fsp--;

             after(grammarAccess.getTournamentAccess().getFinalstagesFinalStageParserRuleCall_14_1_0()); 

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
    // $ANTLR end "rule__Tournament__FinalstagesAssignment_14_1"


    // $ANTLR start "rule__Tournament__FinalstagesAssignment_14_2_1"
    // InternalEsportDsl.g:6415:1: rule__Tournament__FinalstagesAssignment_14_2_1 : ( ruleFinalStage ) ;
    public final void rule__Tournament__FinalstagesAssignment_14_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6419:1: ( ( ruleFinalStage ) )
            // InternalEsportDsl.g:6420:2: ( ruleFinalStage )
            {
            // InternalEsportDsl.g:6420:2: ( ruleFinalStage )
            // InternalEsportDsl.g:6421:3: ruleFinalStage
            {
             before(grammarAccess.getTournamentAccess().getFinalstagesFinalStageParserRuleCall_14_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFinalStage();

            state._fsp--;

             after(grammarAccess.getTournamentAccess().getFinalstagesFinalStageParserRuleCall_14_2_1_0()); 

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
    // $ANTLR end "rule__Tournament__FinalstagesAssignment_14_2_1"


    // $ANTLR start "rule__Tournament__GroupstagesAssignment_15_1"
    // InternalEsportDsl.g:6430:1: rule__Tournament__GroupstagesAssignment_15_1 : ( ruleGroupStage ) ;
    public final void rule__Tournament__GroupstagesAssignment_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6434:1: ( ( ruleGroupStage ) )
            // InternalEsportDsl.g:6435:2: ( ruleGroupStage )
            {
            // InternalEsportDsl.g:6435:2: ( ruleGroupStage )
            // InternalEsportDsl.g:6436:3: ruleGroupStage
            {
             before(grammarAccess.getTournamentAccess().getGroupstagesGroupStageParserRuleCall_15_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGroupStage();

            state._fsp--;

             after(grammarAccess.getTournamentAccess().getGroupstagesGroupStageParserRuleCall_15_1_0()); 

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
    // $ANTLR end "rule__Tournament__GroupstagesAssignment_15_1"


    // $ANTLR start "rule__Tournament__GroupstagesAssignment_15_2_1"
    // InternalEsportDsl.g:6445:1: rule__Tournament__GroupstagesAssignment_15_2_1 : ( ruleGroupStage ) ;
    public final void rule__Tournament__GroupstagesAssignment_15_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6449:1: ( ( ruleGroupStage ) )
            // InternalEsportDsl.g:6450:2: ( ruleGroupStage )
            {
            // InternalEsportDsl.g:6450:2: ( ruleGroupStage )
            // InternalEsportDsl.g:6451:3: ruleGroupStage
            {
             before(grammarAccess.getTournamentAccess().getGroupstagesGroupStageParserRuleCall_15_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGroupStage();

            state._fsp--;

             after(grammarAccess.getTournamentAccess().getGroupstagesGroupStageParserRuleCall_15_2_1_0()); 

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
    // $ANTLR end "rule__Tournament__GroupstagesAssignment_15_2_1"


    // $ANTLR start "rule__League__NameAssignment_2"
    // InternalEsportDsl.g:6460:1: rule__League__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__League__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6464:1: ( ( ruleEString ) )
            // InternalEsportDsl.g:6465:2: ( ruleEString )
            {
            // InternalEsportDsl.g:6465:2: ( ruleEString )
            // InternalEsportDsl.g:6466:3: ruleEString
            {
             before(grammarAccess.getLeagueAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLeagueAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__League__NameAssignment_2"


    // $ANTLR start "rule__League__SizeAssignment_4"
    // InternalEsportDsl.g:6475:1: rule__League__SizeAssignment_4 : ( ruleEInt ) ;
    public final void rule__League__SizeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6479:1: ( ( ruleEInt ) )
            // InternalEsportDsl.g:6480:2: ( ruleEInt )
            {
            // InternalEsportDsl.g:6480:2: ( ruleEInt )
            // InternalEsportDsl.g:6481:3: ruleEInt
            {
             before(grammarAccess.getLeagueAccess().getSizeEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getLeagueAccess().getSizeEIntParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__League__SizeAssignment_4"


    // $ANTLR start "rule__League__YearAssignment_5"
    // InternalEsportDsl.g:6490:1: rule__League__YearAssignment_5 : ( ruleEInt ) ;
    public final void rule__League__YearAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6494:1: ( ( ruleEInt ) )
            // InternalEsportDsl.g:6495:2: ( ruleEInt )
            {
            // InternalEsportDsl.g:6495:2: ( ruleEInt )
            // InternalEsportDsl.g:6496:3: ruleEInt
            {
             before(grammarAccess.getLeagueAccess().getYearEIntParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getLeagueAccess().getYearEIntParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__League__YearAssignment_5"


    // $ANTLR start "rule__League__SeasonAssignment_6"
    // InternalEsportDsl.g:6505:1: rule__League__SeasonAssignment_6 : ( ruleSeason ) ;
    public final void rule__League__SeasonAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6509:1: ( ( ruleSeason ) )
            // InternalEsportDsl.g:6510:2: ( ruleSeason )
            {
            // InternalEsportDsl.g:6510:2: ( ruleSeason )
            // InternalEsportDsl.g:6511:3: ruleSeason
            {
             before(grammarAccess.getLeagueAccess().getSeasonSeasonEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleSeason();

            state._fsp--;

             after(grammarAccess.getLeagueAccess().getSeasonSeasonEnumRuleCall_6_0()); 

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
    // $ANTLR end "rule__League__SeasonAssignment_6"


    // $ANTLR start "rule__League__ZoneAssignment_7"
    // InternalEsportDsl.g:6520:1: rule__League__ZoneAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__League__ZoneAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6524:1: ( ( ( ruleEString ) ) )
            // InternalEsportDsl.g:6525:2: ( ( ruleEString ) )
            {
            // InternalEsportDsl.g:6525:2: ( ( ruleEString ) )
            // InternalEsportDsl.g:6526:3: ( ruleEString )
            {
             before(grammarAccess.getLeagueAccess().getZoneZoneCrossReference_7_0()); 
            // InternalEsportDsl.g:6527:3: ( ruleEString )
            // InternalEsportDsl.g:6528:4: ruleEString
            {
             before(grammarAccess.getLeagueAccess().getZoneZoneEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLeagueAccess().getZoneZoneEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getLeagueAccess().getZoneZoneCrossReference_7_0()); 

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
    // $ANTLR end "rule__League__ZoneAssignment_7"


    // $ANTLR start "rule__League__QualifiesForAssignment_8_1"
    // InternalEsportDsl.g:6539:1: rule__League__QualifiesForAssignment_8_1 : ( ( ruleEString ) ) ;
    public final void rule__League__QualifiesForAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6543:1: ( ( ( ruleEString ) ) )
            // InternalEsportDsl.g:6544:2: ( ( ruleEString ) )
            {
            // InternalEsportDsl.g:6544:2: ( ( ruleEString ) )
            // InternalEsportDsl.g:6545:3: ( ruleEString )
            {
             before(grammarAccess.getLeagueAccess().getQualifiesForQualificationCrossReference_8_1_0()); 
            // InternalEsportDsl.g:6546:3: ( ruleEString )
            // InternalEsportDsl.g:6547:4: ruleEString
            {
             before(grammarAccess.getLeagueAccess().getQualifiesForQualificationEStringParserRuleCall_8_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLeagueAccess().getQualifiesForQualificationEStringParserRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getLeagueAccess().getQualifiesForQualificationCrossReference_8_1_0()); 

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
    // $ANTLR end "rule__League__QualifiesForAssignment_8_1"


    // $ANTLR start "rule__League__QualifiesForAssignment_8_2_1"
    // InternalEsportDsl.g:6558:1: rule__League__QualifiesForAssignment_8_2_1 : ( ( ruleEString ) ) ;
    public final void rule__League__QualifiesForAssignment_8_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6562:1: ( ( ( ruleEString ) ) )
            // InternalEsportDsl.g:6563:2: ( ( ruleEString ) )
            {
            // InternalEsportDsl.g:6563:2: ( ( ruleEString ) )
            // InternalEsportDsl.g:6564:3: ( ruleEString )
            {
             before(grammarAccess.getLeagueAccess().getQualifiesForQualificationCrossReference_8_2_1_0()); 
            // InternalEsportDsl.g:6565:3: ( ruleEString )
            // InternalEsportDsl.g:6566:4: ruleEString
            {
             before(grammarAccess.getLeagueAccess().getQualifiesForQualificationEStringParserRuleCall_8_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLeagueAccess().getQualifiesForQualificationEStringParserRuleCall_8_2_1_0_1()); 

            }

             after(grammarAccess.getLeagueAccess().getQualifiesForQualificationCrossReference_8_2_1_0()); 

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
    // $ANTLR end "rule__League__QualifiesForAssignment_8_2_1"


    // $ANTLR start "rule__League__GroupstageAssignment_9"
    // InternalEsportDsl.g:6577:1: rule__League__GroupstageAssignment_9 : ( ruleGroupStage ) ;
    public final void rule__League__GroupstageAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6581:1: ( ( ruleGroupStage ) )
            // InternalEsportDsl.g:6582:2: ( ruleGroupStage )
            {
            // InternalEsportDsl.g:6582:2: ( ruleGroupStage )
            // InternalEsportDsl.g:6583:3: ruleGroupStage
            {
             before(grammarAccess.getLeagueAccess().getGroupstageGroupStageParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleGroupStage();

            state._fsp--;

             after(grammarAccess.getLeagueAccess().getGroupstageGroupStageParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__League__GroupstageAssignment_9"


    // $ANTLR start "rule__Team__NameAssignment_2"
    // InternalEsportDsl.g:6592:1: rule__Team__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Team__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6596:1: ( ( ruleEString ) )
            // InternalEsportDsl.g:6597:2: ( ruleEString )
            {
            // InternalEsportDsl.g:6597:2: ( ruleEString )
            // InternalEsportDsl.g:6598:3: ruleEString
            {
             before(grammarAccess.getTeamAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTeamAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Team__NameAssignment_2"


    // $ANTLR start "rule__Team__ChampionshipPointsAssignment_4"
    // InternalEsportDsl.g:6607:1: rule__Team__ChampionshipPointsAssignment_4 : ( ruleEInt ) ;
    public final void rule__Team__ChampionshipPointsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6611:1: ( ( ruleEInt ) )
            // InternalEsportDsl.g:6612:2: ( ruleEInt )
            {
            // InternalEsportDsl.g:6612:2: ( ruleEInt )
            // InternalEsportDsl.g:6613:3: ruleEInt
            {
             before(grammarAccess.getTeamAccess().getChampionshipPointsEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTeamAccess().getChampionshipPointsEIntParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Team__ChampionshipPointsAssignment_4"


    // $ANTLR start "rule__Team__CoachAssignment_5"
    // InternalEsportDsl.g:6622:1: rule__Team__CoachAssignment_5 : ( ruleCoach ) ;
    public final void rule__Team__CoachAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6626:1: ( ( ruleCoach ) )
            // InternalEsportDsl.g:6627:2: ( ruleCoach )
            {
            // InternalEsportDsl.g:6627:2: ( ruleCoach )
            // InternalEsportDsl.g:6628:3: ruleCoach
            {
             before(grammarAccess.getTeamAccess().getCoachCoachParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCoach();

            state._fsp--;

             after(grammarAccess.getTeamAccess().getCoachCoachParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Team__CoachAssignment_5"


    // $ANTLR start "rule__Team__PlayersAssignment_7"
    // InternalEsportDsl.g:6637:1: rule__Team__PlayersAssignment_7 : ( rulePlayer ) ;
    public final void rule__Team__PlayersAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6641:1: ( ( rulePlayer ) )
            // InternalEsportDsl.g:6642:2: ( rulePlayer )
            {
            // InternalEsportDsl.g:6642:2: ( rulePlayer )
            // InternalEsportDsl.g:6643:3: rulePlayer
            {
             before(grammarAccess.getTeamAccess().getPlayersPlayerParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            rulePlayer();

            state._fsp--;

             after(grammarAccess.getTeamAccess().getPlayersPlayerParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Team__PlayersAssignment_7"


    // $ANTLR start "rule__Team__PlayersAssignment_8_1"
    // InternalEsportDsl.g:6652:1: rule__Team__PlayersAssignment_8_1 : ( rulePlayer ) ;
    public final void rule__Team__PlayersAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6656:1: ( ( rulePlayer ) )
            // InternalEsportDsl.g:6657:2: ( rulePlayer )
            {
            // InternalEsportDsl.g:6657:2: ( rulePlayer )
            // InternalEsportDsl.g:6658:3: rulePlayer
            {
             before(grammarAccess.getTeamAccess().getPlayersPlayerParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            rulePlayer();

            state._fsp--;

             after(grammarAccess.getTeamAccess().getPlayersPlayerParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__Team__PlayersAssignment_8_1"


    // $ANTLR start "rule__Qualification__NameAssignment_2"
    // InternalEsportDsl.g:6667:1: rule__Qualification__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Qualification__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6671:1: ( ( ruleEString ) )
            // InternalEsportDsl.g:6672:2: ( ruleEString )
            {
            // InternalEsportDsl.g:6672:2: ( ruleEString )
            // InternalEsportDsl.g:6673:3: ruleEString
            {
             before(grammarAccess.getQualificationAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQualificationAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Qualification__NameAssignment_2"


    // $ANTLR start "rule__Country__NameAssignment_2"
    // InternalEsportDsl.g:6682:1: rule__Country__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Country__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6686:1: ( ( ruleEString ) )
            // InternalEsportDsl.g:6687:2: ( ruleEString )
            {
            // InternalEsportDsl.g:6687:2: ( ruleEString )
            // InternalEsportDsl.g:6688:3: ruleEString
            {
             before(grammarAccess.getCountryAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCountryAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Country__NameAssignment_2"


    // $ANTLR start "rule__FinalStage__MaxNbGamesAssignment_3"
    // InternalEsportDsl.g:6697:1: rule__FinalStage__MaxNbGamesAssignment_3 : ( ruleEInt ) ;
    public final void rule__FinalStage__MaxNbGamesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6701:1: ( ( ruleEInt ) )
            // InternalEsportDsl.g:6702:2: ( ruleEInt )
            {
            // InternalEsportDsl.g:6702:2: ( ruleEInt )
            // InternalEsportDsl.g:6703:3: ruleEInt
            {
             before(grammarAccess.getFinalStageAccess().getMaxNbGamesEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getFinalStageAccess().getMaxNbGamesEIntParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__FinalStage__MaxNbGamesAssignment_3"


    // $ANTLR start "rule__FinalStage__TeamsAssignment_5"
    // InternalEsportDsl.g:6712:1: rule__FinalStage__TeamsAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__FinalStage__TeamsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6716:1: ( ( ( ruleEString ) ) )
            // InternalEsportDsl.g:6717:2: ( ( ruleEString ) )
            {
            // InternalEsportDsl.g:6717:2: ( ( ruleEString ) )
            // InternalEsportDsl.g:6718:3: ( ruleEString )
            {
             before(grammarAccess.getFinalStageAccess().getTeamsTeamCrossReference_5_0()); 
            // InternalEsportDsl.g:6719:3: ( ruleEString )
            // InternalEsportDsl.g:6720:4: ruleEString
            {
             before(grammarAccess.getFinalStageAccess().getTeamsTeamEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFinalStageAccess().getTeamsTeamEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getFinalStageAccess().getTeamsTeamCrossReference_5_0()); 

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
    // $ANTLR end "rule__FinalStage__TeamsAssignment_5"


    // $ANTLR start "rule__FinalStage__TeamsAssignment_6_1"
    // InternalEsportDsl.g:6731:1: rule__FinalStage__TeamsAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__FinalStage__TeamsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6735:1: ( ( ( ruleEString ) ) )
            // InternalEsportDsl.g:6736:2: ( ( ruleEString ) )
            {
            // InternalEsportDsl.g:6736:2: ( ( ruleEString ) )
            // InternalEsportDsl.g:6737:3: ( ruleEString )
            {
             before(grammarAccess.getFinalStageAccess().getTeamsTeamCrossReference_6_1_0()); 
            // InternalEsportDsl.g:6738:3: ( ruleEString )
            // InternalEsportDsl.g:6739:4: ruleEString
            {
             before(grammarAccess.getFinalStageAccess().getTeamsTeamEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFinalStageAccess().getTeamsTeamEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getFinalStageAccess().getTeamsTeamCrossReference_6_1_0()); 

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
    // $ANTLR end "rule__FinalStage__TeamsAssignment_6_1"


    // $ANTLR start "rule__FinalStage__MatchsAssignment_8_2"
    // InternalEsportDsl.g:6750:1: rule__FinalStage__MatchsAssignment_8_2 : ( ruleMatch ) ;
    public final void rule__FinalStage__MatchsAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6754:1: ( ( ruleMatch ) )
            // InternalEsportDsl.g:6755:2: ( ruleMatch )
            {
            // InternalEsportDsl.g:6755:2: ( ruleMatch )
            // InternalEsportDsl.g:6756:3: ruleMatch
            {
             before(grammarAccess.getFinalStageAccess().getMatchsMatchParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMatch();

            state._fsp--;

             after(grammarAccess.getFinalStageAccess().getMatchsMatchParserRuleCall_8_2_0()); 

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
    // $ANTLR end "rule__FinalStage__MatchsAssignment_8_2"


    // $ANTLR start "rule__FinalStage__MatchsAssignment_8_3_1"
    // InternalEsportDsl.g:6765:1: rule__FinalStage__MatchsAssignment_8_3_1 : ( ruleMatch ) ;
    public final void rule__FinalStage__MatchsAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6769:1: ( ( ruleMatch ) )
            // InternalEsportDsl.g:6770:2: ( ruleMatch )
            {
            // InternalEsportDsl.g:6770:2: ( ruleMatch )
            // InternalEsportDsl.g:6771:3: ruleMatch
            {
             before(grammarAccess.getFinalStageAccess().getMatchsMatchParserRuleCall_8_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMatch();

            state._fsp--;

             after(grammarAccess.getFinalStageAccess().getMatchsMatchParserRuleCall_8_3_1_0()); 

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
    // $ANTLR end "rule__FinalStage__MatchsAssignment_8_3_1"


    // $ANTLR start "rule__GroupStage__TypeAssignment_3"
    // InternalEsportDsl.g:6780:1: rule__GroupStage__TypeAssignment_3 : ( ruleGroupStageType ) ;
    public final void rule__GroupStage__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6784:1: ( ( ruleGroupStageType ) )
            // InternalEsportDsl.g:6785:2: ( ruleGroupStageType )
            {
            // InternalEsportDsl.g:6785:2: ( ruleGroupStageType )
            // InternalEsportDsl.g:6786:3: ruleGroupStageType
            {
             before(grammarAccess.getGroupStageAccess().getTypeGroupStageTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleGroupStageType();

            state._fsp--;

             after(grammarAccess.getGroupStageAccess().getTypeGroupStageTypeEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__GroupStage__TypeAssignment_3"


    // $ANTLR start "rule__GroupStage__MaxNbGamesAssignment_4"
    // InternalEsportDsl.g:6795:1: rule__GroupStage__MaxNbGamesAssignment_4 : ( ruleEInt ) ;
    public final void rule__GroupStage__MaxNbGamesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6799:1: ( ( ruleEInt ) )
            // InternalEsportDsl.g:6800:2: ( ruleEInt )
            {
            // InternalEsportDsl.g:6800:2: ( ruleEInt )
            // InternalEsportDsl.g:6801:3: ruleEInt
            {
             before(grammarAccess.getGroupStageAccess().getMaxNbGamesEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getGroupStageAccess().getMaxNbGamesEIntParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__GroupStage__MaxNbGamesAssignment_4"


    // $ANTLR start "rule__GroupStage__MeetingsInSameGroupAssignment_5"
    // InternalEsportDsl.g:6810:1: rule__GroupStage__MeetingsInSameGroupAssignment_5 : ( ruleEInt ) ;
    public final void rule__GroupStage__MeetingsInSameGroupAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6814:1: ( ( ruleEInt ) )
            // InternalEsportDsl.g:6815:2: ( ruleEInt )
            {
            // InternalEsportDsl.g:6815:2: ( ruleEInt )
            // InternalEsportDsl.g:6816:3: ruleEInt
            {
             before(grammarAccess.getGroupStageAccess().getMeetingsInSameGroupEIntParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getGroupStageAccess().getMeetingsInSameGroupEIntParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__GroupStage__MeetingsInSameGroupAssignment_5"


    // $ANTLR start "rule__GroupStage__MeetingsWithOtherGroupsAssignment_6"
    // InternalEsportDsl.g:6825:1: rule__GroupStage__MeetingsWithOtherGroupsAssignment_6 : ( ruleEInt ) ;
    public final void rule__GroupStage__MeetingsWithOtherGroupsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6829:1: ( ( ruleEInt ) )
            // InternalEsportDsl.g:6830:2: ( ruleEInt )
            {
            // InternalEsportDsl.g:6830:2: ( ruleEInt )
            // InternalEsportDsl.g:6831:3: ruleEInt
            {
             before(grammarAccess.getGroupStageAccess().getMeetingsWithOtherGroupsEIntParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getGroupStageAccess().getMeetingsWithOtherGroupsEIntParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__GroupStage__MeetingsWithOtherGroupsAssignment_6"


    // $ANTLR start "rule__GroupStage__GroupsAssignment_7_1"
    // InternalEsportDsl.g:6840:1: rule__GroupStage__GroupsAssignment_7_1 : ( ruleGroup ) ;
    public final void rule__GroupStage__GroupsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6844:1: ( ( ruleGroup ) )
            // InternalEsportDsl.g:6845:2: ( ruleGroup )
            {
            // InternalEsportDsl.g:6845:2: ( ruleGroup )
            // InternalEsportDsl.g:6846:3: ruleGroup
            {
             before(grammarAccess.getGroupStageAccess().getGroupsGroupParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getGroupStageAccess().getGroupsGroupParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__GroupStage__GroupsAssignment_7_1"


    // $ANTLR start "rule__GroupStage__GroupsAssignment_7_2_1"
    // InternalEsportDsl.g:6855:1: rule__GroupStage__GroupsAssignment_7_2_1 : ( ruleGroup ) ;
    public final void rule__GroupStage__GroupsAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6859:1: ( ( ruleGroup ) )
            // InternalEsportDsl.g:6860:2: ( ruleGroup )
            {
            // InternalEsportDsl.g:6860:2: ( ruleGroup )
            // InternalEsportDsl.g:6861:3: ruleGroup
            {
             before(grammarAccess.getGroupStageAccess().getGroupsGroupParserRuleCall_7_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getGroupStageAccess().getGroupsGroupParserRuleCall_7_2_1_0()); 

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
    // $ANTLR end "rule__GroupStage__GroupsAssignment_7_2_1"


    // $ANTLR start "rule__Match__TypeAssignment_3"
    // InternalEsportDsl.g:6870:1: rule__Match__TypeAssignment_3 : ( ruleMatchType ) ;
    public final void rule__Match__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6874:1: ( ( ruleMatchType ) )
            // InternalEsportDsl.g:6875:2: ( ruleMatchType )
            {
            // InternalEsportDsl.g:6875:2: ( ruleMatchType )
            // InternalEsportDsl.g:6876:3: ruleMatchType
            {
             before(grammarAccess.getMatchAccess().getTypeMatchTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMatchType();

            state._fsp--;

             after(grammarAccess.getMatchAccess().getTypeMatchTypeEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__Match__TypeAssignment_3"


    // $ANTLR start "rule__Match__LoserWinsAssignment_4"
    // InternalEsportDsl.g:6885:1: rule__Match__LoserWinsAssignment_4 : ( ruleEInt ) ;
    public final void rule__Match__LoserWinsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6889:1: ( ( ruleEInt ) )
            // InternalEsportDsl.g:6890:2: ( ruleEInt )
            {
            // InternalEsportDsl.g:6890:2: ( ruleEInt )
            // InternalEsportDsl.g:6891:3: ruleEInt
            {
             before(grammarAccess.getMatchAccess().getLoserWinsEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMatchAccess().getLoserWinsEIntParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Match__LoserWinsAssignment_4"


    // $ANTLR start "rule__Match__TeamWinnerAssignment_5"
    // InternalEsportDsl.g:6900:1: rule__Match__TeamWinnerAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Match__TeamWinnerAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6904:1: ( ( ( ruleEString ) ) )
            // InternalEsportDsl.g:6905:2: ( ( ruleEString ) )
            {
            // InternalEsportDsl.g:6905:2: ( ( ruleEString ) )
            // InternalEsportDsl.g:6906:3: ( ruleEString )
            {
             before(grammarAccess.getMatchAccess().getTeamWinnerTeamCrossReference_5_0()); 
            // InternalEsportDsl.g:6907:3: ( ruleEString )
            // InternalEsportDsl.g:6908:4: ruleEString
            {
             before(grammarAccess.getMatchAccess().getTeamWinnerTeamEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMatchAccess().getTeamWinnerTeamEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getMatchAccess().getTeamWinnerTeamCrossReference_5_0()); 

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
    // $ANTLR end "rule__Match__TeamWinnerAssignment_5"


    // $ANTLR start "rule__Match__TeamLoserAssignment_6"
    // InternalEsportDsl.g:6919:1: rule__Match__TeamLoserAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Match__TeamLoserAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6923:1: ( ( ( ruleEString ) ) )
            // InternalEsportDsl.g:6924:2: ( ( ruleEString ) )
            {
            // InternalEsportDsl.g:6924:2: ( ( ruleEString ) )
            // InternalEsportDsl.g:6925:3: ( ruleEString )
            {
             before(grammarAccess.getMatchAccess().getTeamLoserTeamCrossReference_6_0()); 
            // InternalEsportDsl.g:6926:3: ( ruleEString )
            // InternalEsportDsl.g:6927:4: ruleEString
            {
             before(grammarAccess.getMatchAccess().getTeamLoserTeamEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMatchAccess().getTeamLoserTeamEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getMatchAccess().getTeamLoserTeamCrossReference_6_0()); 

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
    // $ANTLR end "rule__Match__TeamLoserAssignment_6"


    // $ANTLR start "rule__Group__TeamsAssignment_4"
    // InternalEsportDsl.g:6938:1: rule__Group__TeamsAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Group__TeamsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6942:1: ( ( ( ruleEString ) ) )
            // InternalEsportDsl.g:6943:2: ( ( ruleEString ) )
            {
            // InternalEsportDsl.g:6943:2: ( ( ruleEString ) )
            // InternalEsportDsl.g:6944:3: ( ruleEString )
            {
             before(grammarAccess.getGroupAccess().getTeamsTeamCrossReference_4_0()); 
            // InternalEsportDsl.g:6945:3: ( ruleEString )
            // InternalEsportDsl.g:6946:4: ruleEString
            {
             before(grammarAccess.getGroupAccess().getTeamsTeamEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGroupAccess().getTeamsTeamEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getGroupAccess().getTeamsTeamCrossReference_4_0()); 

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
    // $ANTLR end "rule__Group__TeamsAssignment_4"


    // $ANTLR start "rule__Group__TeamsAssignment_5_1"
    // InternalEsportDsl.g:6957:1: rule__Group__TeamsAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__Group__TeamsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6961:1: ( ( ( ruleEString ) ) )
            // InternalEsportDsl.g:6962:2: ( ( ruleEString ) )
            {
            // InternalEsportDsl.g:6962:2: ( ( ruleEString ) )
            // InternalEsportDsl.g:6963:3: ( ruleEString )
            {
             before(grammarAccess.getGroupAccess().getTeamsTeamCrossReference_5_1_0()); 
            // InternalEsportDsl.g:6964:3: ( ruleEString )
            // InternalEsportDsl.g:6965:4: ruleEString
            {
             before(grammarAccess.getGroupAccess().getTeamsTeamEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGroupAccess().getTeamsTeamEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getGroupAccess().getTeamsTeamCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__Group__TeamsAssignment_5_1"


    // $ANTLR start "rule__Group__MatchsAssignment_7_1"
    // InternalEsportDsl.g:6976:1: rule__Group__MatchsAssignment_7_1 : ( ruleMatch ) ;
    public final void rule__Group__MatchsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6980:1: ( ( ruleMatch ) )
            // InternalEsportDsl.g:6981:2: ( ruleMatch )
            {
            // InternalEsportDsl.g:6981:2: ( ruleMatch )
            // InternalEsportDsl.g:6982:3: ruleMatch
            {
             before(grammarAccess.getGroupAccess().getMatchsMatchParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMatch();

            state._fsp--;

             after(grammarAccess.getGroupAccess().getMatchsMatchParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__Group__MatchsAssignment_7_1"


    // $ANTLR start "rule__Group__MatchsAssignment_7_2_1"
    // InternalEsportDsl.g:6991:1: rule__Group__MatchsAssignment_7_2_1 : ( ruleMatch ) ;
    public final void rule__Group__MatchsAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:6995:1: ( ( ruleMatch ) )
            // InternalEsportDsl.g:6996:2: ( ruleMatch )
            {
            // InternalEsportDsl.g:6996:2: ( ruleMatch )
            // InternalEsportDsl.g:6997:3: ruleMatch
            {
             before(grammarAccess.getGroupAccess().getMatchsMatchParserRuleCall_7_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMatch();

            state._fsp--;

             after(grammarAccess.getGroupAccess().getMatchsMatchParserRuleCall_7_2_1_0()); 

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
    // $ANTLR end "rule__Group__MatchsAssignment_7_2_1"


    // $ANTLR start "rule__Player__NameAssignment_2"
    // InternalEsportDsl.g:7006:1: rule__Player__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Player__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:7010:1: ( ( ruleEString ) )
            // InternalEsportDsl.g:7011:2: ( ruleEString )
            {
            // InternalEsportDsl.g:7011:2: ( ruleEString )
            // InternalEsportDsl.g:7012:3: ruleEString
            {
             before(grammarAccess.getPlayerAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPlayerAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Player__NameAssignment_2"


    // $ANTLR start "rule__Player__AgeAssignment_4"
    // InternalEsportDsl.g:7021:1: rule__Player__AgeAssignment_4 : ( ruleEInt ) ;
    public final void rule__Player__AgeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:7025:1: ( ( ruleEInt ) )
            // InternalEsportDsl.g:7026:2: ( ruleEInt )
            {
            // InternalEsportDsl.g:7026:2: ( ruleEInt )
            // InternalEsportDsl.g:7027:3: ruleEInt
            {
             before(grammarAccess.getPlayerAccess().getAgeEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPlayerAccess().getAgeEIntParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Player__AgeAssignment_4"


    // $ANTLR start "rule__Player__CountryAssignment_5"
    // InternalEsportDsl.g:7036:1: rule__Player__CountryAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Player__CountryAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:7040:1: ( ( ( ruleEString ) ) )
            // InternalEsportDsl.g:7041:2: ( ( ruleEString ) )
            {
            // InternalEsportDsl.g:7041:2: ( ( ruleEString ) )
            // InternalEsportDsl.g:7042:3: ( ruleEString )
            {
             before(grammarAccess.getPlayerAccess().getCountryCountryCrossReference_5_0()); 
            // InternalEsportDsl.g:7043:3: ( ruleEString )
            // InternalEsportDsl.g:7044:4: ruleEString
            {
             before(grammarAccess.getPlayerAccess().getCountryCountryEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPlayerAccess().getCountryCountryEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getPlayerAccess().getCountryCountryCrossReference_5_0()); 

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
    // $ANTLR end "rule__Player__CountryAssignment_5"


    // $ANTLR start "rule__Player__PositionAssignment_6"
    // InternalEsportDsl.g:7055:1: rule__Player__PositionAssignment_6 : ( rulePosition ) ;
    public final void rule__Player__PositionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:7059:1: ( ( rulePosition ) )
            // InternalEsportDsl.g:7060:2: ( rulePosition )
            {
            // InternalEsportDsl.g:7060:2: ( rulePosition )
            // InternalEsportDsl.g:7061:3: rulePosition
            {
             before(grammarAccess.getPlayerAccess().getPositionPositionEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getPlayerAccess().getPositionPositionEnumRuleCall_6_0()); 

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
    // $ANTLR end "rule__Player__PositionAssignment_6"


    // $ANTLR start "rule__Player__DescriptionAssignment_7"
    // InternalEsportDsl.g:7070:1: rule__Player__DescriptionAssignment_7 : ( ruleEString ) ;
    public final void rule__Player__DescriptionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:7074:1: ( ( ruleEString ) )
            // InternalEsportDsl.g:7075:2: ( ruleEString )
            {
            // InternalEsportDsl.g:7075:2: ( ruleEString )
            // InternalEsportDsl.g:7076:3: ruleEString
            {
             before(grammarAccess.getPlayerAccess().getDescriptionEStringParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPlayerAccess().getDescriptionEStringParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Player__DescriptionAssignment_7"


    // $ANTLR start "rule__Player__CapacitiesAssignment_8_1"
    // InternalEsportDsl.g:7085:1: rule__Player__CapacitiesAssignment_8_1 : ( ruleCapacity ) ;
    public final void rule__Player__CapacitiesAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:7089:1: ( ( ruleCapacity ) )
            // InternalEsportDsl.g:7090:2: ( ruleCapacity )
            {
            // InternalEsportDsl.g:7090:2: ( ruleCapacity )
            // InternalEsportDsl.g:7091:3: ruleCapacity
            {
             before(grammarAccess.getPlayerAccess().getCapacitiesCapacityParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCapacity();

            state._fsp--;

             after(grammarAccess.getPlayerAccess().getCapacitiesCapacityParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__Player__CapacitiesAssignment_8_1"


    // $ANTLR start "rule__Player__CapacitiesAssignment_8_2_1"
    // InternalEsportDsl.g:7100:1: rule__Player__CapacitiesAssignment_8_2_1 : ( ruleCapacity ) ;
    public final void rule__Player__CapacitiesAssignment_8_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:7104:1: ( ( ruleCapacity ) )
            // InternalEsportDsl.g:7105:2: ( ruleCapacity )
            {
            // InternalEsportDsl.g:7105:2: ( ruleCapacity )
            // InternalEsportDsl.g:7106:3: ruleCapacity
            {
             before(grammarAccess.getPlayerAccess().getCapacitiesCapacityParserRuleCall_8_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCapacity();

            state._fsp--;

             after(grammarAccess.getPlayerAccess().getCapacitiesCapacityParserRuleCall_8_2_1_0()); 

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
    // $ANTLR end "rule__Player__CapacitiesAssignment_8_2_1"


    // $ANTLR start "rule__Coach__NameAssignment_2"
    // InternalEsportDsl.g:7115:1: rule__Coach__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Coach__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:7119:1: ( ( ruleEString ) )
            // InternalEsportDsl.g:7120:2: ( ruleEString )
            {
            // InternalEsportDsl.g:7120:2: ( ruleEString )
            // InternalEsportDsl.g:7121:3: ruleEString
            {
             before(grammarAccess.getCoachAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCoachAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Coach__NameAssignment_2"


    // $ANTLR start "rule__Coach__AgeAssignment_4"
    // InternalEsportDsl.g:7130:1: rule__Coach__AgeAssignment_4 : ( ruleEInt ) ;
    public final void rule__Coach__AgeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:7134:1: ( ( ruleEInt ) )
            // InternalEsportDsl.g:7135:2: ( ruleEInt )
            {
            // InternalEsportDsl.g:7135:2: ( ruleEInt )
            // InternalEsportDsl.g:7136:3: ruleEInt
            {
             before(grammarAccess.getCoachAccess().getAgeEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getCoachAccess().getAgeEIntParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Coach__AgeAssignment_4"


    // $ANTLR start "rule__Coach__CountryAssignment_5"
    // InternalEsportDsl.g:7145:1: rule__Coach__CountryAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Coach__CountryAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:7149:1: ( ( ( ruleEString ) ) )
            // InternalEsportDsl.g:7150:2: ( ( ruleEString ) )
            {
            // InternalEsportDsl.g:7150:2: ( ( ruleEString ) )
            // InternalEsportDsl.g:7151:3: ( ruleEString )
            {
             before(grammarAccess.getCoachAccess().getCountryCountryCrossReference_5_0()); 
            // InternalEsportDsl.g:7152:3: ( ruleEString )
            // InternalEsportDsl.g:7153:4: ruleEString
            {
             before(grammarAccess.getCoachAccess().getCountryCountryEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCoachAccess().getCountryCountryEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getCoachAccess().getCountryCountryCrossReference_5_0()); 

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
    // $ANTLR end "rule__Coach__CountryAssignment_5"


    // $ANTLR start "rule__Coach__DescriptionAssignment_6"
    // InternalEsportDsl.g:7164:1: rule__Coach__DescriptionAssignment_6 : ( ruleEString ) ;
    public final void rule__Coach__DescriptionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:7168:1: ( ( ruleEString ) )
            // InternalEsportDsl.g:7169:2: ( ruleEString )
            {
            // InternalEsportDsl.g:7169:2: ( ruleEString )
            // InternalEsportDsl.g:7170:3: ruleEString
            {
             before(grammarAccess.getCoachAccess().getDescriptionEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCoachAccess().getDescriptionEStringParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Coach__DescriptionAssignment_6"


    // $ANTLR start "rule__Coach__CapacitiesAssignment_7_1"
    // InternalEsportDsl.g:7179:1: rule__Coach__CapacitiesAssignment_7_1 : ( ruleCapacity ) ;
    public final void rule__Coach__CapacitiesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:7183:1: ( ( ruleCapacity ) )
            // InternalEsportDsl.g:7184:2: ( ruleCapacity )
            {
            // InternalEsportDsl.g:7184:2: ( ruleCapacity )
            // InternalEsportDsl.g:7185:3: ruleCapacity
            {
             before(grammarAccess.getCoachAccess().getCapacitiesCapacityParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCapacity();

            state._fsp--;

             after(grammarAccess.getCoachAccess().getCapacitiesCapacityParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__Coach__CapacitiesAssignment_7_1"


    // $ANTLR start "rule__Coach__CapacitiesAssignment_7_2_1"
    // InternalEsportDsl.g:7194:1: rule__Coach__CapacitiesAssignment_7_2_1 : ( ruleCapacity ) ;
    public final void rule__Coach__CapacitiesAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:7198:1: ( ( ruleCapacity ) )
            // InternalEsportDsl.g:7199:2: ( ruleCapacity )
            {
            // InternalEsportDsl.g:7199:2: ( ruleCapacity )
            // InternalEsportDsl.g:7200:3: ruleCapacity
            {
             before(grammarAccess.getCoachAccess().getCapacitiesCapacityParserRuleCall_7_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCapacity();

            state._fsp--;

             after(grammarAccess.getCoachAccess().getCapacitiesCapacityParserRuleCall_7_2_1_0()); 

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
    // $ANTLR end "rule__Coach__CapacitiesAssignment_7_2_1"


    // $ANTLR start "rule__Capacity__TypeAssignment_3"
    // InternalEsportDsl.g:7209:1: rule__Capacity__TypeAssignment_3 : ( ruleCapacityType ) ;
    public final void rule__Capacity__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:7213:1: ( ( ruleCapacityType ) )
            // InternalEsportDsl.g:7214:2: ( ruleCapacityType )
            {
            // InternalEsportDsl.g:7214:2: ( ruleCapacityType )
            // InternalEsportDsl.g:7215:3: ruleCapacityType
            {
             before(grammarAccess.getCapacityAccess().getTypeCapacityTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCapacityType();

            state._fsp--;

             after(grammarAccess.getCapacityAccess().getTypeCapacityTypeEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__Capacity__TypeAssignment_3"


    // $ANTLR start "rule__Capacity__ValueAssignment_4"
    // InternalEsportDsl.g:7224:1: rule__Capacity__ValueAssignment_4 : ( ruleEInt ) ;
    public final void rule__Capacity__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsportDsl.g:7228:1: ( ( ruleEInt ) )
            // InternalEsportDsl.g:7229:2: ( ruleEInt )
            {
            // InternalEsportDsl.g:7229:2: ( ruleEInt )
            // InternalEsportDsl.g:7230:3: ruleEInt
            {
             before(grammarAccess.getCapacityAccess().getValueEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getCapacityAccess().getValueEIntParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Capacity__ValueAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0xC840000000000002L,0x0000000000000303L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0xC840000000000000L,0x0000000000000303L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000004L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000003F800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x3100000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0100000000000030L,0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000003F800000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0100000000000040L,0x0000000000000004L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000000007C0000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0100001F00000030L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0100000000000030L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x003FFFE000000000L});

}