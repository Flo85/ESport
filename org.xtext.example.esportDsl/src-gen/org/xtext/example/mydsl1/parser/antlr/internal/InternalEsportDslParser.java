package org.xtext.example.mydsl1.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl1.services.EsportDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEsportDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Zone'", "':'", "'('", "','", "')'", "'Tournament'", "'qualifiesFor'", "'qualifiesFrom'", "'League'", "'Team'", "'Qualification'", "'Country'", "'-'", "'FinalStage'", "'matchs'", "'GroupStage'", "'Match'", "'Group'", "'Player'", "'Coach'", "'Capacity'", "'worlds'", "'regionals'", "'allStars'", "'promotion'", "'midSeasonInvitational'", "'riftRivals'", "'playOff'", "'group'", "'final'", "'semiFinal'", "'quarterFinal'", "'singleRoundElimination'", "'league'", "'worldsPlayIn'", "'worldsGroup'", "'riftRivalsGroup'", "'msiPlayIn'", "'msiGroup'", "'allStarsGroup'", "'spring'", "'summer'", "'attackDamageCarry'", "'support'", "'midLane'", "'topLane'", "'jungle'", "'positioning'", "'stressManagement'", "'playmakingMechanics'", "'escapeMechanics'", "'patience'", "'farm'", "'steal'", "'splitPush'", "'teamPlay'", "'aggressivity'", "'leadership'", "'draft'", "'pathing'", "'awareness'", "'experience'", "'objectivePlay'", "'metaGame'"
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

        public InternalEsportDslParser(TokenStream input, EsportDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Root";
       	}

       	@Override
       	protected EsportDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRoot"
    // InternalEsportDsl.g:65:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // InternalEsportDsl.g:65:45: (iv_ruleRoot= ruleRoot EOF )
            // InternalEsportDsl.g:66:2: iv_ruleRoot= ruleRoot EOF
            {
             newCompositeNode(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoot=ruleRoot();

            state._fsp--;

             current =iv_ruleRoot; 
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
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalEsportDsl.g:72:1: ruleRoot returns [EObject current=null] : ( ( (lv_zones_0_0= ruleZone ) ) | ( (lv_tournaments_1_0= ruleTournament ) ) | ( (lv_leagues_2_0= ruleLeague ) ) | ( (lv_teams_3_0= ruleTeam ) ) | ( (lv_persons_4_0= rulePerson ) ) | ( (lv_qualifications_5_0= ruleQualification ) ) | ( (lv_countries_6_0= ruleCountry ) ) )* ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        EObject lv_zones_0_0 = null;

        EObject lv_tournaments_1_0 = null;

        EObject lv_leagues_2_0 = null;

        EObject lv_teams_3_0 = null;

        EObject lv_persons_4_0 = null;

        EObject lv_qualifications_5_0 = null;

        EObject lv_countries_6_0 = null;



        	enterRule();

        try {
            // InternalEsportDsl.g:78:2: ( ( ( (lv_zones_0_0= ruleZone ) ) | ( (lv_tournaments_1_0= ruleTournament ) ) | ( (lv_leagues_2_0= ruleLeague ) ) | ( (lv_teams_3_0= ruleTeam ) ) | ( (lv_persons_4_0= rulePerson ) ) | ( (lv_qualifications_5_0= ruleQualification ) ) | ( (lv_countries_6_0= ruleCountry ) ) )* )
            // InternalEsportDsl.g:79:2: ( ( (lv_zones_0_0= ruleZone ) ) | ( (lv_tournaments_1_0= ruleTournament ) ) | ( (lv_leagues_2_0= ruleLeague ) ) | ( (lv_teams_3_0= ruleTeam ) ) | ( (lv_persons_4_0= rulePerson ) ) | ( (lv_qualifications_5_0= ruleQualification ) ) | ( (lv_countries_6_0= ruleCountry ) ) )*
            {
            // InternalEsportDsl.g:79:2: ( ( (lv_zones_0_0= ruleZone ) ) | ( (lv_tournaments_1_0= ruleTournament ) ) | ( (lv_leagues_2_0= ruleLeague ) ) | ( (lv_teams_3_0= ruleTeam ) ) | ( (lv_persons_4_0= rulePerson ) ) | ( (lv_qualifications_5_0= ruleQualification ) ) | ( (lv_countries_6_0= ruleCountry ) ) )*
            loop1:
            do {
                int alt1=8;
                switch ( input.LA(1) ) {
                case 11:
                    {
                    alt1=1;
                    }
                    break;
                case 16:
                    {
                    alt1=2;
                    }
                    break;
                case 19:
                    {
                    alt1=3;
                    }
                    break;
                case 20:
                    {
                    alt1=4;
                    }
                    break;
                case 29:
                case 30:
                    {
                    alt1=5;
                    }
                    break;
                case 21:
                    {
                    alt1=6;
                    }
                    break;
                case 22:
                    {
                    alt1=7;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalEsportDsl.g:80:3: ( (lv_zones_0_0= ruleZone ) )
            	    {
            	    // InternalEsportDsl.g:80:3: ( (lv_zones_0_0= ruleZone ) )
            	    // InternalEsportDsl.g:81:4: (lv_zones_0_0= ruleZone )
            	    {
            	    // InternalEsportDsl.g:81:4: (lv_zones_0_0= ruleZone )
            	    // InternalEsportDsl.g:82:5: lv_zones_0_0= ruleZone
            	    {

            	    					newCompositeNode(grammarAccess.getRootAccess().getZonesZoneParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_zones_0_0=ruleZone();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootRule());
            	    					}
            	    					add(
            	    						current,
            	    						"zones",
            	    						lv_zones_0_0,
            	    						"org.xtext.example.mydsl1.EsportDsl.Zone");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalEsportDsl.g:100:3: ( (lv_tournaments_1_0= ruleTournament ) )
            	    {
            	    // InternalEsportDsl.g:100:3: ( (lv_tournaments_1_0= ruleTournament ) )
            	    // InternalEsportDsl.g:101:4: (lv_tournaments_1_0= ruleTournament )
            	    {
            	    // InternalEsportDsl.g:101:4: (lv_tournaments_1_0= ruleTournament )
            	    // InternalEsportDsl.g:102:5: lv_tournaments_1_0= ruleTournament
            	    {

            	    					newCompositeNode(grammarAccess.getRootAccess().getTournamentsTournamentParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_tournaments_1_0=ruleTournament();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tournaments",
            	    						lv_tournaments_1_0,
            	    						"org.xtext.example.mydsl1.EsportDsl.Tournament");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalEsportDsl.g:120:3: ( (lv_leagues_2_0= ruleLeague ) )
            	    {
            	    // InternalEsportDsl.g:120:3: ( (lv_leagues_2_0= ruleLeague ) )
            	    // InternalEsportDsl.g:121:4: (lv_leagues_2_0= ruleLeague )
            	    {
            	    // InternalEsportDsl.g:121:4: (lv_leagues_2_0= ruleLeague )
            	    // InternalEsportDsl.g:122:5: lv_leagues_2_0= ruleLeague
            	    {

            	    					newCompositeNode(grammarAccess.getRootAccess().getLeaguesLeagueParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_leagues_2_0=ruleLeague();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootRule());
            	    					}
            	    					add(
            	    						current,
            	    						"leagues",
            	    						lv_leagues_2_0,
            	    						"org.xtext.example.mydsl1.EsportDsl.League");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalEsportDsl.g:140:3: ( (lv_teams_3_0= ruleTeam ) )
            	    {
            	    // InternalEsportDsl.g:140:3: ( (lv_teams_3_0= ruleTeam ) )
            	    // InternalEsportDsl.g:141:4: (lv_teams_3_0= ruleTeam )
            	    {
            	    // InternalEsportDsl.g:141:4: (lv_teams_3_0= ruleTeam )
            	    // InternalEsportDsl.g:142:5: lv_teams_3_0= ruleTeam
            	    {

            	    					newCompositeNode(grammarAccess.getRootAccess().getTeamsTeamParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_teams_3_0=ruleTeam();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootRule());
            	    					}
            	    					add(
            	    						current,
            	    						"teams",
            	    						lv_teams_3_0,
            	    						"org.xtext.example.mydsl1.EsportDsl.Team");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalEsportDsl.g:160:3: ( (lv_persons_4_0= rulePerson ) )
            	    {
            	    // InternalEsportDsl.g:160:3: ( (lv_persons_4_0= rulePerson ) )
            	    // InternalEsportDsl.g:161:4: (lv_persons_4_0= rulePerson )
            	    {
            	    // InternalEsportDsl.g:161:4: (lv_persons_4_0= rulePerson )
            	    // InternalEsportDsl.g:162:5: lv_persons_4_0= rulePerson
            	    {

            	    					newCompositeNode(grammarAccess.getRootAccess().getPersonsPersonParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_persons_4_0=rulePerson();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootRule());
            	    					}
            	    					add(
            	    						current,
            	    						"persons",
            	    						lv_persons_4_0,
            	    						"org.xtext.example.mydsl1.EsportDsl.Person");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalEsportDsl.g:180:3: ( (lv_qualifications_5_0= ruleQualification ) )
            	    {
            	    // InternalEsportDsl.g:180:3: ( (lv_qualifications_5_0= ruleQualification ) )
            	    // InternalEsportDsl.g:181:4: (lv_qualifications_5_0= ruleQualification )
            	    {
            	    // InternalEsportDsl.g:181:4: (lv_qualifications_5_0= ruleQualification )
            	    // InternalEsportDsl.g:182:5: lv_qualifications_5_0= ruleQualification
            	    {

            	    					newCompositeNode(grammarAccess.getRootAccess().getQualificationsQualificationParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_qualifications_5_0=ruleQualification();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootRule());
            	    					}
            	    					add(
            	    						current,
            	    						"qualifications",
            	    						lv_qualifications_5_0,
            	    						"org.xtext.example.mydsl1.EsportDsl.Qualification");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalEsportDsl.g:200:3: ( (lv_countries_6_0= ruleCountry ) )
            	    {
            	    // InternalEsportDsl.g:200:3: ( (lv_countries_6_0= ruleCountry ) )
            	    // InternalEsportDsl.g:201:4: (lv_countries_6_0= ruleCountry )
            	    {
            	    // InternalEsportDsl.g:201:4: (lv_countries_6_0= ruleCountry )
            	    // InternalEsportDsl.g:202:5: lv_countries_6_0= ruleCountry
            	    {

            	    					newCompositeNode(grammarAccess.getRootAccess().getCountriesCountryParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_countries_6_0=ruleCountry();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootRule());
            	    					}
            	    					add(
            	    						current,
            	    						"countries",
            	    						lv_countries_6_0,
            	    						"org.xtext.example.mydsl1.EsportDsl.Country");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRulePerson"
    // InternalEsportDsl.g:223:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalEsportDsl.g:223:47: (iv_rulePerson= rulePerson EOF )
            // InternalEsportDsl.g:224:2: iv_rulePerson= rulePerson EOF
            {
             newCompositeNode(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePerson=rulePerson();

            state._fsp--;

             current =iv_rulePerson; 
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
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalEsportDsl.g:230:1: rulePerson returns [EObject current=null] : (this_Player_0= rulePlayer | this_Coach_1= ruleCoach ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        EObject this_Player_0 = null;

        EObject this_Coach_1 = null;



        	enterRule();

        try {
            // InternalEsportDsl.g:236:2: ( (this_Player_0= rulePlayer | this_Coach_1= ruleCoach ) )
            // InternalEsportDsl.g:237:2: (this_Player_0= rulePlayer | this_Coach_1= ruleCoach )
            {
            // InternalEsportDsl.g:237:2: (this_Player_0= rulePlayer | this_Coach_1= ruleCoach )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==29) ) {
                alt2=1;
            }
            else if ( (LA2_0==30) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalEsportDsl.g:238:3: this_Player_0= rulePlayer
                    {

                    			newCompositeNode(grammarAccess.getPersonAccess().getPlayerParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Player_0=rulePlayer();

                    state._fsp--;


                    			current = this_Player_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEsportDsl.g:247:3: this_Coach_1= ruleCoach
                    {

                    			newCompositeNode(grammarAccess.getPersonAccess().getCoachParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Coach_1=ruleCoach();

                    state._fsp--;


                    			current = this_Coach_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleZone"
    // InternalEsportDsl.g:259:1: entryRuleZone returns [EObject current=null] : iv_ruleZone= ruleZone EOF ;
    public final EObject entryRuleZone() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleZone = null;


        try {
            // InternalEsportDsl.g:259:45: (iv_ruleZone= ruleZone EOF )
            // InternalEsportDsl.g:260:2: iv_ruleZone= ruleZone EOF
            {
             newCompositeNode(grammarAccess.getZoneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleZone=ruleZone();

            state._fsp--;

             current =iv_ruleZone; 
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
    // $ANTLR end "entryRuleZone"


    // $ANTLR start "ruleZone"
    // InternalEsportDsl.g:266:1: ruleZone returns [EObject current=null] : ( () otherlv_1= 'Zone' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' otherlv_4= '(' ( (lv_countries_5_0= ruleCountry ) ) (otherlv_6= ',' ( (lv_countries_7_0= ruleCountry ) ) )* otherlv_8= ')' (otherlv_9= '(' ( (lv_teams_10_0= ruleTeam ) ) (otherlv_11= ',' ( (lv_teams_12_0= ruleTeam ) ) )* otherlv_13= ')' )? ) ;
    public final EObject ruleZone() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_countries_5_0 = null;

        EObject lv_countries_7_0 = null;

        EObject lv_teams_10_0 = null;

        EObject lv_teams_12_0 = null;



        	enterRule();

        try {
            // InternalEsportDsl.g:272:2: ( ( () otherlv_1= 'Zone' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' otherlv_4= '(' ( (lv_countries_5_0= ruleCountry ) ) (otherlv_6= ',' ( (lv_countries_7_0= ruleCountry ) ) )* otherlv_8= ')' (otherlv_9= '(' ( (lv_teams_10_0= ruleTeam ) ) (otherlv_11= ',' ( (lv_teams_12_0= ruleTeam ) ) )* otherlv_13= ')' )? ) )
            // InternalEsportDsl.g:273:2: ( () otherlv_1= 'Zone' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' otherlv_4= '(' ( (lv_countries_5_0= ruleCountry ) ) (otherlv_6= ',' ( (lv_countries_7_0= ruleCountry ) ) )* otherlv_8= ')' (otherlv_9= '(' ( (lv_teams_10_0= ruleTeam ) ) (otherlv_11= ',' ( (lv_teams_12_0= ruleTeam ) ) )* otherlv_13= ')' )? )
            {
            // InternalEsportDsl.g:273:2: ( () otherlv_1= 'Zone' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' otherlv_4= '(' ( (lv_countries_5_0= ruleCountry ) ) (otherlv_6= ',' ( (lv_countries_7_0= ruleCountry ) ) )* otherlv_8= ')' (otherlv_9= '(' ( (lv_teams_10_0= ruleTeam ) ) (otherlv_11= ',' ( (lv_teams_12_0= ruleTeam ) ) )* otherlv_13= ')' )? )
            // InternalEsportDsl.g:274:3: () otherlv_1= 'Zone' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' otherlv_4= '(' ( (lv_countries_5_0= ruleCountry ) ) (otherlv_6= ',' ( (lv_countries_7_0= ruleCountry ) ) )* otherlv_8= ')' (otherlv_9= '(' ( (lv_teams_10_0= ruleTeam ) ) (otherlv_11= ',' ( (lv_teams_12_0= ruleTeam ) ) )* otherlv_13= ')' )?
            {
            // InternalEsportDsl.g:274:3: ()
            // InternalEsportDsl.g:275:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getZoneAccess().getZoneAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getZoneAccess().getZoneKeyword_1());
            		
            // InternalEsportDsl.g:285:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEsportDsl.g:286:4: (lv_name_2_0= ruleEString )
            {
            // InternalEsportDsl.g:286:4: (lv_name_2_0= ruleEString )
            // InternalEsportDsl.g:287:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getZoneAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getZoneRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl1.EsportDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getZoneAccess().getColonKeyword_3());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getZoneAccess().getLeftParenthesisKeyword_4());
            		
            // InternalEsportDsl.g:312:3: ( (lv_countries_5_0= ruleCountry ) )
            // InternalEsportDsl.g:313:4: (lv_countries_5_0= ruleCountry )
            {
            // InternalEsportDsl.g:313:4: (lv_countries_5_0= ruleCountry )
            // InternalEsportDsl.g:314:5: lv_countries_5_0= ruleCountry
            {

            					newCompositeNode(grammarAccess.getZoneAccess().getCountriesCountryParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_countries_5_0=ruleCountry();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getZoneRule());
            					}
            					add(
            						current,
            						"countries",
            						lv_countries_5_0,
            						"org.xtext.example.mydsl1.EsportDsl.Country");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEsportDsl.g:331:3: (otherlv_6= ',' ( (lv_countries_7_0= ruleCountry ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalEsportDsl.g:332:4: otherlv_6= ',' ( (lv_countries_7_0= ruleCountry ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_7); 

            	    				newLeafNode(otherlv_6, grammarAccess.getZoneAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalEsportDsl.g:336:4: ( (lv_countries_7_0= ruleCountry ) )
            	    // InternalEsportDsl.g:337:5: (lv_countries_7_0= ruleCountry )
            	    {
            	    // InternalEsportDsl.g:337:5: (lv_countries_7_0= ruleCountry )
            	    // InternalEsportDsl.g:338:6: lv_countries_7_0= ruleCountry
            	    {

            	    						newCompositeNode(grammarAccess.getZoneAccess().getCountriesCountryParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_countries_7_0=ruleCountry();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getZoneRule());
            	    						}
            	    						add(
            	    							current,
            	    							"countries",
            	    							lv_countries_7_0,
            	    							"org.xtext.example.mydsl1.EsportDsl.Country");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getZoneAccess().getRightParenthesisKeyword_7());
            		
            // InternalEsportDsl.g:360:3: (otherlv_9= '(' ( (lv_teams_10_0= ruleTeam ) ) (otherlv_11= ',' ( (lv_teams_12_0= ruleTeam ) ) )* otherlv_13= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEsportDsl.g:361:4: otherlv_9= '(' ( (lv_teams_10_0= ruleTeam ) ) (otherlv_11= ',' ( (lv_teams_12_0= ruleTeam ) ) )* otherlv_13= ')'
                    {
                    otherlv_9=(Token)match(input,13,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getZoneAccess().getLeftParenthesisKeyword_8_0());
                    			
                    // InternalEsportDsl.g:365:4: ( (lv_teams_10_0= ruleTeam ) )
                    // InternalEsportDsl.g:366:5: (lv_teams_10_0= ruleTeam )
                    {
                    // InternalEsportDsl.g:366:5: (lv_teams_10_0= ruleTeam )
                    // InternalEsportDsl.g:367:6: lv_teams_10_0= ruleTeam
                    {

                    						newCompositeNode(grammarAccess.getZoneAccess().getTeamsTeamParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_teams_10_0=ruleTeam();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getZoneRule());
                    						}
                    						add(
                    							current,
                    							"teams",
                    							lv_teams_10_0,
                    							"org.xtext.example.mydsl1.EsportDsl.Team");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEsportDsl.g:384:4: (otherlv_11= ',' ( (lv_teams_12_0= ruleTeam ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==14) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalEsportDsl.g:385:5: otherlv_11= ',' ( (lv_teams_12_0= ruleTeam ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getZoneAccess().getCommaKeyword_8_2_0());
                    	    				
                    	    // InternalEsportDsl.g:389:5: ( (lv_teams_12_0= ruleTeam ) )
                    	    // InternalEsportDsl.g:390:6: (lv_teams_12_0= ruleTeam )
                    	    {
                    	    // InternalEsportDsl.g:390:6: (lv_teams_12_0= ruleTeam )
                    	    // InternalEsportDsl.g:391:7: lv_teams_12_0= ruleTeam
                    	    {

                    	    							newCompositeNode(grammarAccess.getZoneAccess().getTeamsTeamParserRuleCall_8_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_teams_12_0=ruleTeam();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getZoneRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"teams",
                    	    								lv_teams_12_0,
                    	    								"org.xtext.example.mydsl1.EsportDsl.Team");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getZoneAccess().getRightParenthesisKeyword_8_3());
                    			

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
    // $ANTLR end "ruleZone"


    // $ANTLR start "entryRuleTournament"
    // InternalEsportDsl.g:418:1: entryRuleTournament returns [EObject current=null] : iv_ruleTournament= ruleTournament EOF ;
    public final EObject entryRuleTournament() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTournament = null;


        try {
            // InternalEsportDsl.g:418:51: (iv_ruleTournament= ruleTournament EOF )
            // InternalEsportDsl.g:419:2: iv_ruleTournament= ruleTournament EOF
            {
             newCompositeNode(grammarAccess.getTournamentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTournament=ruleTournament();

            state._fsp--;

             current =iv_ruleTournament; 
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
    // $ANTLR end "entryRuleTournament"


    // $ANTLR start "ruleTournament"
    // InternalEsportDsl.g:425:1: ruleTournament returns [EObject current=null] : ( () otherlv_1= 'Tournament' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_size_4_0= ruleEInt ) ) ( (lv_type_5_0= ruleTournamentType ) ) ( (lv_year_6_0= ruleEInt ) ) otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' (otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'qualifiesFor' ( ( ruleEString ) ) )? (otherlv_19= 'qualifiesFrom' otherlv_20= '(' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* otherlv_24= ')' )? (otherlv_25= '(' ( (lv_finalstages_26_0= ruleFinalStage ) ) (otherlv_27= ',' ( (lv_finalstages_28_0= ruleFinalStage ) ) )* otherlv_29= ')' )? (otherlv_30= '(' ( (lv_groupstages_31_0= ruleGroupStage ) ) (otherlv_32= ',' ( (lv_groupstages_33_0= ruleGroupStage ) ) )* otherlv_34= ')' )? ) ;
    public final EObject ruleTournament() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_size_4_0 = null;

        Enumerator lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_year_6_0 = null;

        EObject lv_finalstages_26_0 = null;

        EObject lv_finalstages_28_0 = null;

        EObject lv_groupstages_31_0 = null;

        EObject lv_groupstages_33_0 = null;



        	enterRule();

        try {
            // InternalEsportDsl.g:431:2: ( ( () otherlv_1= 'Tournament' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_size_4_0= ruleEInt ) ) ( (lv_type_5_0= ruleTournamentType ) ) ( (lv_year_6_0= ruleEInt ) ) otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' (otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'qualifiesFor' ( ( ruleEString ) ) )? (otherlv_19= 'qualifiesFrom' otherlv_20= '(' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* otherlv_24= ')' )? (otherlv_25= '(' ( (lv_finalstages_26_0= ruleFinalStage ) ) (otherlv_27= ',' ( (lv_finalstages_28_0= ruleFinalStage ) ) )* otherlv_29= ')' )? (otherlv_30= '(' ( (lv_groupstages_31_0= ruleGroupStage ) ) (otherlv_32= ',' ( (lv_groupstages_33_0= ruleGroupStage ) ) )* otherlv_34= ')' )? ) )
            // InternalEsportDsl.g:432:2: ( () otherlv_1= 'Tournament' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_size_4_0= ruleEInt ) ) ( (lv_type_5_0= ruleTournamentType ) ) ( (lv_year_6_0= ruleEInt ) ) otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' (otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'qualifiesFor' ( ( ruleEString ) ) )? (otherlv_19= 'qualifiesFrom' otherlv_20= '(' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* otherlv_24= ')' )? (otherlv_25= '(' ( (lv_finalstages_26_0= ruleFinalStage ) ) (otherlv_27= ',' ( (lv_finalstages_28_0= ruleFinalStage ) ) )* otherlv_29= ')' )? (otherlv_30= '(' ( (lv_groupstages_31_0= ruleGroupStage ) ) (otherlv_32= ',' ( (lv_groupstages_33_0= ruleGroupStage ) ) )* otherlv_34= ')' )? )
            {
            // InternalEsportDsl.g:432:2: ( () otherlv_1= 'Tournament' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_size_4_0= ruleEInt ) ) ( (lv_type_5_0= ruleTournamentType ) ) ( (lv_year_6_0= ruleEInt ) ) otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' (otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'qualifiesFor' ( ( ruleEString ) ) )? (otherlv_19= 'qualifiesFrom' otherlv_20= '(' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* otherlv_24= ')' )? (otherlv_25= '(' ( (lv_finalstages_26_0= ruleFinalStage ) ) (otherlv_27= ',' ( (lv_finalstages_28_0= ruleFinalStage ) ) )* otherlv_29= ')' )? (otherlv_30= '(' ( (lv_groupstages_31_0= ruleGroupStage ) ) (otherlv_32= ',' ( (lv_groupstages_33_0= ruleGroupStage ) ) )* otherlv_34= ')' )? )
            // InternalEsportDsl.g:433:3: () otherlv_1= 'Tournament' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_size_4_0= ruleEInt ) ) ( (lv_type_5_0= ruleTournamentType ) ) ( (lv_year_6_0= ruleEInt ) ) otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' (otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'qualifiesFor' ( ( ruleEString ) ) )? (otherlv_19= 'qualifiesFrom' otherlv_20= '(' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* otherlv_24= ')' )? (otherlv_25= '(' ( (lv_finalstages_26_0= ruleFinalStage ) ) (otherlv_27= ',' ( (lv_finalstages_28_0= ruleFinalStage ) ) )* otherlv_29= ')' )? (otherlv_30= '(' ( (lv_groupstages_31_0= ruleGroupStage ) ) (otherlv_32= ',' ( (lv_groupstages_33_0= ruleGroupStage ) ) )* otherlv_34= ')' )?
            {
            // InternalEsportDsl.g:433:3: ()
            // InternalEsportDsl.g:434:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTournamentAccess().getTournamentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTournamentAccess().getTournamentKeyword_1());
            		
            // InternalEsportDsl.g:444:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEsportDsl.g:445:4: (lv_name_2_0= ruleEString )
            {
            // InternalEsportDsl.g:445:4: (lv_name_2_0= ruleEString )
            // InternalEsportDsl.g:446:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTournamentAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTournamentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl1.EsportDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getTournamentAccess().getColonKeyword_3());
            		
            // InternalEsportDsl.g:467:3: ( (lv_size_4_0= ruleEInt ) )
            // InternalEsportDsl.g:468:4: (lv_size_4_0= ruleEInt )
            {
            // InternalEsportDsl.g:468:4: (lv_size_4_0= ruleEInt )
            // InternalEsportDsl.g:469:5: lv_size_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTournamentAccess().getSizeEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
            lv_size_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTournamentRule());
            					}
            					set(
            						current,
            						"size",
            						lv_size_4_0,
            						"org.xtext.example.mydsl1.EsportDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEsportDsl.g:486:3: ( (lv_type_5_0= ruleTournamentType ) )
            // InternalEsportDsl.g:487:4: (lv_type_5_0= ruleTournamentType )
            {
            // InternalEsportDsl.g:487:4: (lv_type_5_0= ruleTournamentType )
            // InternalEsportDsl.g:488:5: lv_type_5_0= ruleTournamentType
            {

            					newCompositeNode(grammarAccess.getTournamentAccess().getTypeTournamentTypeEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_11);
            lv_type_5_0=ruleTournamentType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTournamentRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_5_0,
            						"org.xtext.example.mydsl1.EsportDsl.TournamentType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEsportDsl.g:505:3: ( (lv_year_6_0= ruleEInt ) )
            // InternalEsportDsl.g:506:4: (lv_year_6_0= ruleEInt )
            {
            // InternalEsportDsl.g:506:4: (lv_year_6_0= ruleEInt )
            // InternalEsportDsl.g:507:5: lv_year_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTournamentAccess().getYearEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_6);
            lv_year_6_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTournamentRule());
            					}
            					set(
            						current,
            						"year",
            						lv_year_6_0,
            						"org.xtext.example.mydsl1.EsportDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getTournamentAccess().getLeftParenthesisKeyword_7());
            		
            // InternalEsportDsl.g:528:3: ( ( ruleEString ) )
            // InternalEsportDsl.g:529:4: ( ruleEString )
            {
            // InternalEsportDsl.g:529:4: ( ruleEString )
            // InternalEsportDsl.g:530:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTournamentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTournamentAccess().getAllowedZonesZoneCrossReference_8_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEsportDsl.g:544:3: (otherlv_9= ',' ( ( ruleEString ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEsportDsl.g:545:4: otherlv_9= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_9=(Token)match(input,14,FOLLOW_4); 

            	    				newLeafNode(otherlv_9, grammarAccess.getTournamentAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalEsportDsl.g:549:4: ( ( ruleEString ) )
            	    // InternalEsportDsl.g:550:5: ( ruleEString )
            	    {
            	    // InternalEsportDsl.g:550:5: ( ruleEString )
            	    // InternalEsportDsl.g:551:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTournamentRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getTournamentAccess().getAllowedZonesZoneCrossReference_9_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_11=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_11, grammarAccess.getTournamentAccess().getRightParenthesisKeyword_10());
            		
            // InternalEsportDsl.g:570:3: (otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                int LA8_1 = input.LA(2);

                if ( ((LA8_1>=RULE_STRING && LA8_1<=RULE_ID)) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // InternalEsportDsl.g:571:4: otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_12=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getTournamentAccess().getLeftParenthesisKeyword_11_0());
                    			
                    // InternalEsportDsl.g:575:4: ( ( ruleEString ) )
                    // InternalEsportDsl.g:576:5: ( ruleEString )
                    {
                    // InternalEsportDsl.g:576:5: ( ruleEString )
                    // InternalEsportDsl.g:577:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTournamentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTournamentAccess().getCountriesCountryCrossReference_11_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEsportDsl.g:591:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalEsportDsl.g:592:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,14,FOLLOW_4); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getTournamentAccess().getCommaKeyword_11_2_0());
                    	    				
                    	    // InternalEsportDsl.g:596:5: ( ( ruleEString ) )
                    	    // InternalEsportDsl.g:597:6: ( ruleEString )
                    	    {
                    	    // InternalEsportDsl.g:597:6: ( ruleEString )
                    	    // InternalEsportDsl.g:598:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTournamentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getTournamentAccess().getCountriesCountryCrossReference_11_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_16, grammarAccess.getTournamentAccess().getRightParenthesisKeyword_11_3());
                    			

                    }
                    break;

            }

            // InternalEsportDsl.g:618:3: (otherlv_17= 'qualifiesFor' ( ( ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalEsportDsl.g:619:4: otherlv_17= 'qualifiesFor' ( ( ruleEString ) )
                    {
                    otherlv_17=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_17, grammarAccess.getTournamentAccess().getQualifiesForKeyword_12_0());
                    			
                    // InternalEsportDsl.g:623:4: ( ( ruleEString ) )
                    // InternalEsportDsl.g:624:5: ( ruleEString )
                    {
                    // InternalEsportDsl.g:624:5: ( ruleEString )
                    // InternalEsportDsl.g:625:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTournamentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTournamentAccess().getQualifiesForQualificationCrossReference_12_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEsportDsl.g:640:3: (otherlv_19= 'qualifiesFrom' otherlv_20= '(' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* otherlv_24= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalEsportDsl.g:641:4: otherlv_19= 'qualifiesFrom' otherlv_20= '(' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* otherlv_24= ')'
                    {
                    otherlv_19=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_19, grammarAccess.getTournamentAccess().getQualifiesFromKeyword_13_0());
                    			
                    otherlv_20=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_20, grammarAccess.getTournamentAccess().getLeftParenthesisKeyword_13_1());
                    			
                    // InternalEsportDsl.g:649:4: ( ( ruleEString ) )
                    // InternalEsportDsl.g:650:5: ( ruleEString )
                    {
                    // InternalEsportDsl.g:650:5: ( ruleEString )
                    // InternalEsportDsl.g:651:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTournamentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTournamentAccess().getQualifiesFromQualificationCrossReference_13_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEsportDsl.g:665:4: (otherlv_22= ',' ( ( ruleEString ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==14) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalEsportDsl.g:666:5: otherlv_22= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_22=(Token)match(input,14,FOLLOW_4); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getTournamentAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalEsportDsl.g:670:5: ( ( ruleEString ) )
                    	    // InternalEsportDsl.g:671:6: ( ruleEString )
                    	    {
                    	    // InternalEsportDsl.g:671:6: ( ruleEString )
                    	    // InternalEsportDsl.g:672:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTournamentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getTournamentAccess().getQualifiesFromQualificationCrossReference_13_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_24, grammarAccess.getTournamentAccess().getRightParenthesisKeyword_13_4());
                    			

                    }
                    break;

            }

            // InternalEsportDsl.g:692:3: (otherlv_25= '(' ( (lv_finalstages_26_0= ruleFinalStage ) ) (otherlv_27= ',' ( (lv_finalstages_28_0= ruleFinalStage ) ) )* otherlv_29= ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==13) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==24) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // InternalEsportDsl.g:693:4: otherlv_25= '(' ( (lv_finalstages_26_0= ruleFinalStage ) ) (otherlv_27= ',' ( (lv_finalstages_28_0= ruleFinalStage ) ) )* otherlv_29= ')'
                    {
                    otherlv_25=(Token)match(input,13,FOLLOW_15); 

                    				newLeafNode(otherlv_25, grammarAccess.getTournamentAccess().getLeftParenthesisKeyword_14_0());
                    			
                    // InternalEsportDsl.g:697:4: ( (lv_finalstages_26_0= ruleFinalStage ) )
                    // InternalEsportDsl.g:698:5: (lv_finalstages_26_0= ruleFinalStage )
                    {
                    // InternalEsportDsl.g:698:5: (lv_finalstages_26_0= ruleFinalStage )
                    // InternalEsportDsl.g:699:6: lv_finalstages_26_0= ruleFinalStage
                    {

                    						newCompositeNode(grammarAccess.getTournamentAccess().getFinalstagesFinalStageParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_finalstages_26_0=ruleFinalStage();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTournamentRule());
                    						}
                    						add(
                    							current,
                    							"finalstages",
                    							lv_finalstages_26_0,
                    							"org.xtext.example.mydsl1.EsportDsl.FinalStage");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEsportDsl.g:716:4: (otherlv_27= ',' ( (lv_finalstages_28_0= ruleFinalStage ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalEsportDsl.g:717:5: otherlv_27= ',' ( (lv_finalstages_28_0= ruleFinalStage ) )
                    	    {
                    	    otherlv_27=(Token)match(input,14,FOLLOW_15); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getTournamentAccess().getCommaKeyword_14_2_0());
                    	    				
                    	    // InternalEsportDsl.g:721:5: ( (lv_finalstages_28_0= ruleFinalStage ) )
                    	    // InternalEsportDsl.g:722:6: (lv_finalstages_28_0= ruleFinalStage )
                    	    {
                    	    // InternalEsportDsl.g:722:6: (lv_finalstages_28_0= ruleFinalStage )
                    	    // InternalEsportDsl.g:723:7: lv_finalstages_28_0= ruleFinalStage
                    	    {

                    	    							newCompositeNode(grammarAccess.getTournamentAccess().getFinalstagesFinalStageParserRuleCall_14_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_finalstages_28_0=ruleFinalStage();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTournamentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"finalstages",
                    	    								lv_finalstages_28_0,
                    	    								"org.xtext.example.mydsl1.EsportDsl.FinalStage");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_29, grammarAccess.getTournamentAccess().getRightParenthesisKeyword_14_3());
                    			

                    }
                    break;

            }

            // InternalEsportDsl.g:746:3: (otherlv_30= '(' ( (lv_groupstages_31_0= ruleGroupStage ) ) (otherlv_32= ',' ( (lv_groupstages_33_0= ruleGroupStage ) ) )* otherlv_34= ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==13) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalEsportDsl.g:747:4: otherlv_30= '(' ( (lv_groupstages_31_0= ruleGroupStage ) ) (otherlv_32= ',' ( (lv_groupstages_33_0= ruleGroupStage ) ) )* otherlv_34= ')'
                    {
                    otherlv_30=(Token)match(input,13,FOLLOW_16); 

                    				newLeafNode(otherlv_30, grammarAccess.getTournamentAccess().getLeftParenthesisKeyword_15_0());
                    			
                    // InternalEsportDsl.g:751:4: ( (lv_groupstages_31_0= ruleGroupStage ) )
                    // InternalEsportDsl.g:752:5: (lv_groupstages_31_0= ruleGroupStage )
                    {
                    // InternalEsportDsl.g:752:5: (lv_groupstages_31_0= ruleGroupStage )
                    // InternalEsportDsl.g:753:6: lv_groupstages_31_0= ruleGroupStage
                    {

                    						newCompositeNode(grammarAccess.getTournamentAccess().getGroupstagesGroupStageParserRuleCall_15_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_groupstages_31_0=ruleGroupStage();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTournamentRule());
                    						}
                    						add(
                    							current,
                    							"groupstages",
                    							lv_groupstages_31_0,
                    							"org.xtext.example.mydsl1.EsportDsl.GroupStage");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEsportDsl.g:770:4: (otherlv_32= ',' ( (lv_groupstages_33_0= ruleGroupStage ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==14) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalEsportDsl.g:771:5: otherlv_32= ',' ( (lv_groupstages_33_0= ruleGroupStage ) )
                    	    {
                    	    otherlv_32=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_32, grammarAccess.getTournamentAccess().getCommaKeyword_15_2_0());
                    	    				
                    	    // InternalEsportDsl.g:775:5: ( (lv_groupstages_33_0= ruleGroupStage ) )
                    	    // InternalEsportDsl.g:776:6: (lv_groupstages_33_0= ruleGroupStage )
                    	    {
                    	    // InternalEsportDsl.g:776:6: (lv_groupstages_33_0= ruleGroupStage )
                    	    // InternalEsportDsl.g:777:7: lv_groupstages_33_0= ruleGroupStage
                    	    {

                    	    							newCompositeNode(grammarAccess.getTournamentAccess().getGroupstagesGroupStageParserRuleCall_15_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_groupstages_33_0=ruleGroupStage();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTournamentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"groupstages",
                    	    								lv_groupstages_33_0,
                    	    								"org.xtext.example.mydsl1.EsportDsl.GroupStage");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_34=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_34, grammarAccess.getTournamentAccess().getRightParenthesisKeyword_15_3());
                    			

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
    // $ANTLR end "ruleTournament"


    // $ANTLR start "entryRuleLeague"
    // InternalEsportDsl.g:804:1: entryRuleLeague returns [EObject current=null] : iv_ruleLeague= ruleLeague EOF ;
    public final EObject entryRuleLeague() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeague = null;


        try {
            // InternalEsportDsl.g:804:47: (iv_ruleLeague= ruleLeague EOF )
            // InternalEsportDsl.g:805:2: iv_ruleLeague= ruleLeague EOF
            {
             newCompositeNode(grammarAccess.getLeagueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeague=ruleLeague();

            state._fsp--;

             current =iv_ruleLeague; 
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
    // $ANTLR end "entryRuleLeague"


    // $ANTLR start "ruleLeague"
    // InternalEsportDsl.g:811:1: ruleLeague returns [EObject current=null] : ( () otherlv_1= 'League' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_size_4_0= ruleEInt ) ) ( (lv_year_5_0= ruleEInt ) ) ( (lv_season_6_0= ruleSeason ) ) ( ( ruleEString ) )? (otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? ( (lv_groupstage_13_0= ruleGroupStage ) )? ) ;
    public final EObject ruleLeague() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_size_4_0 = null;

        AntlrDatatypeRuleToken lv_year_5_0 = null;

        Enumerator lv_season_6_0 = null;

        EObject lv_groupstage_13_0 = null;



        	enterRule();

        try {
            // InternalEsportDsl.g:817:2: ( ( () otherlv_1= 'League' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_size_4_0= ruleEInt ) ) ( (lv_year_5_0= ruleEInt ) ) ( (lv_season_6_0= ruleSeason ) ) ( ( ruleEString ) )? (otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? ( (lv_groupstage_13_0= ruleGroupStage ) )? ) )
            // InternalEsportDsl.g:818:2: ( () otherlv_1= 'League' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_size_4_0= ruleEInt ) ) ( (lv_year_5_0= ruleEInt ) ) ( (lv_season_6_0= ruleSeason ) ) ( ( ruleEString ) )? (otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? ( (lv_groupstage_13_0= ruleGroupStage ) )? )
            {
            // InternalEsportDsl.g:818:2: ( () otherlv_1= 'League' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_size_4_0= ruleEInt ) ) ( (lv_year_5_0= ruleEInt ) ) ( (lv_season_6_0= ruleSeason ) ) ( ( ruleEString ) )? (otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? ( (lv_groupstage_13_0= ruleGroupStage ) )? )
            // InternalEsportDsl.g:819:3: () otherlv_1= 'League' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_size_4_0= ruleEInt ) ) ( (lv_year_5_0= ruleEInt ) ) ( (lv_season_6_0= ruleSeason ) ) ( ( ruleEString ) )? (otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? ( (lv_groupstage_13_0= ruleGroupStage ) )?
            {
            // InternalEsportDsl.g:819:3: ()
            // InternalEsportDsl.g:820:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLeagueAccess().getLeagueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLeagueAccess().getLeagueKeyword_1());
            		
            // InternalEsportDsl.g:830:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEsportDsl.g:831:4: (lv_name_2_0= ruleEString )
            {
            // InternalEsportDsl.g:831:4: (lv_name_2_0= ruleEString )
            // InternalEsportDsl.g:832:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLeagueAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLeagueRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl1.EsportDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getLeagueAccess().getColonKeyword_3());
            		
            // InternalEsportDsl.g:853:3: ( (lv_size_4_0= ruleEInt ) )
            // InternalEsportDsl.g:854:4: (lv_size_4_0= ruleEInt )
            {
            // InternalEsportDsl.g:854:4: (lv_size_4_0= ruleEInt )
            // InternalEsportDsl.g:855:5: lv_size_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getLeagueAccess().getSizeEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_size_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLeagueRule());
            					}
            					set(
            						current,
            						"size",
            						lv_size_4_0,
            						"org.xtext.example.mydsl1.EsportDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEsportDsl.g:872:3: ( (lv_year_5_0= ruleEInt ) )
            // InternalEsportDsl.g:873:4: (lv_year_5_0= ruleEInt )
            {
            // InternalEsportDsl.g:873:4: (lv_year_5_0= ruleEInt )
            // InternalEsportDsl.g:874:5: lv_year_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getLeagueAccess().getYearEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_17);
            lv_year_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLeagueRule());
            					}
            					set(
            						current,
            						"year",
            						lv_year_5_0,
            						"org.xtext.example.mydsl1.EsportDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEsportDsl.g:891:3: ( (lv_season_6_0= ruleSeason ) )
            // InternalEsportDsl.g:892:4: (lv_season_6_0= ruleSeason )
            {
            // InternalEsportDsl.g:892:4: (lv_season_6_0= ruleSeason )
            // InternalEsportDsl.g:893:5: lv_season_6_0= ruleSeason
            {

            					newCompositeNode(grammarAccess.getLeagueAccess().getSeasonSeasonEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_18);
            lv_season_6_0=ruleSeason();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLeagueRule());
            					}
            					set(
            						current,
            						"season",
            						lv_season_6_0,
            						"org.xtext.example.mydsl1.EsportDsl.Season");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEsportDsl.g:910:3: ( ( ruleEString ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalEsportDsl.g:911:4: ( ruleEString )
                    {
                    // InternalEsportDsl.g:911:4: ( ruleEString )
                    // InternalEsportDsl.g:912:5: ruleEString
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLeagueRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getLeagueAccess().getZoneZoneCrossReference_7_0());
                    				
                    pushFollow(FOLLOW_19);
                    ruleEString();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalEsportDsl.g:926:3: (otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==13) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalEsportDsl.g:927:4: otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')'
                    {
                    otherlv_8=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getLeagueAccess().getLeftParenthesisKeyword_8_0());
                    			
                    // InternalEsportDsl.g:931:4: ( ( ruleEString ) )
                    // InternalEsportDsl.g:932:5: ( ruleEString )
                    {
                    // InternalEsportDsl.g:932:5: ( ruleEString )
                    // InternalEsportDsl.g:933:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLeagueRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLeagueAccess().getQualifiesForQualificationCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEsportDsl.g:947:4: (otherlv_10= ',' ( ( ruleEString ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==14) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalEsportDsl.g:948:5: otherlv_10= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FOLLOW_4); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getLeagueAccess().getCommaKeyword_8_2_0());
                    	    				
                    	    // InternalEsportDsl.g:952:5: ( ( ruleEString ) )
                    	    // InternalEsportDsl.g:953:6: ( ruleEString )
                    	    {
                    	    // InternalEsportDsl.g:953:6: ( ruleEString )
                    	    // InternalEsportDsl.g:954:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getLeagueRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getLeagueAccess().getQualifiesForQualificationCrossReference_8_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,15,FOLLOW_20); 

                    				newLeafNode(otherlv_12, grammarAccess.getLeagueAccess().getRightParenthesisKeyword_8_3());
                    			

                    }
                    break;

            }

            // InternalEsportDsl.g:974:3: ( (lv_groupstage_13_0= ruleGroupStage ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalEsportDsl.g:975:4: (lv_groupstage_13_0= ruleGroupStage )
                    {
                    // InternalEsportDsl.g:975:4: (lv_groupstage_13_0= ruleGroupStage )
                    // InternalEsportDsl.g:976:5: lv_groupstage_13_0= ruleGroupStage
                    {

                    					newCompositeNode(grammarAccess.getLeagueAccess().getGroupstageGroupStageParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_groupstage_13_0=ruleGroupStage();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLeagueRule());
                    					}
                    					set(
                    						current,
                    						"groupstage",
                    						lv_groupstage_13_0,
                    						"org.xtext.example.mydsl1.EsportDsl.GroupStage");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleLeague"


    // $ANTLR start "entryRuleTeam"
    // InternalEsportDsl.g:997:1: entryRuleTeam returns [EObject current=null] : iv_ruleTeam= ruleTeam EOF ;
    public final EObject entryRuleTeam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeam = null;


        try {
            // InternalEsportDsl.g:997:45: (iv_ruleTeam= ruleTeam EOF )
            // InternalEsportDsl.g:998:2: iv_ruleTeam= ruleTeam EOF
            {
             newCompositeNode(grammarAccess.getTeamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTeam=ruleTeam();

            state._fsp--;

             current =iv_ruleTeam; 
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
    // $ANTLR end "entryRuleTeam"


    // $ANTLR start "ruleTeam"
    // InternalEsportDsl.g:1004:1: ruleTeam returns [EObject current=null] : ( () otherlv_1= 'Team' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_championshipPoints_4_0= ruleEInt ) ) ( (lv_coach_5_0= ruleCoach ) )? otherlv_6= '(' ( (lv_players_7_0= rulePlayer ) ) (otherlv_8= ',' ( (lv_players_9_0= rulePlayer ) ) )* otherlv_10= ')' ) ;
    public final EObject ruleTeam() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_championshipPoints_4_0 = null;

        EObject lv_coach_5_0 = null;

        EObject lv_players_7_0 = null;

        EObject lv_players_9_0 = null;



        	enterRule();

        try {
            // InternalEsportDsl.g:1010:2: ( ( () otherlv_1= 'Team' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_championshipPoints_4_0= ruleEInt ) ) ( (lv_coach_5_0= ruleCoach ) )? otherlv_6= '(' ( (lv_players_7_0= rulePlayer ) ) (otherlv_8= ',' ( (lv_players_9_0= rulePlayer ) ) )* otherlv_10= ')' ) )
            // InternalEsportDsl.g:1011:2: ( () otherlv_1= 'Team' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_championshipPoints_4_0= ruleEInt ) ) ( (lv_coach_5_0= ruleCoach ) )? otherlv_6= '(' ( (lv_players_7_0= rulePlayer ) ) (otherlv_8= ',' ( (lv_players_9_0= rulePlayer ) ) )* otherlv_10= ')' )
            {
            // InternalEsportDsl.g:1011:2: ( () otherlv_1= 'Team' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_championshipPoints_4_0= ruleEInt ) ) ( (lv_coach_5_0= ruleCoach ) )? otherlv_6= '(' ( (lv_players_7_0= rulePlayer ) ) (otherlv_8= ',' ( (lv_players_9_0= rulePlayer ) ) )* otherlv_10= ')' )
            // InternalEsportDsl.g:1012:3: () otherlv_1= 'Team' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_championshipPoints_4_0= ruleEInt ) ) ( (lv_coach_5_0= ruleCoach ) )? otherlv_6= '(' ( (lv_players_7_0= rulePlayer ) ) (otherlv_8= ',' ( (lv_players_9_0= rulePlayer ) ) )* otherlv_10= ')'
            {
            // InternalEsportDsl.g:1012:3: ()
            // InternalEsportDsl.g:1013:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTeamAccess().getTeamAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTeamAccess().getTeamKeyword_1());
            		
            // InternalEsportDsl.g:1023:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEsportDsl.g:1024:4: (lv_name_2_0= ruleEString )
            {
            // InternalEsportDsl.g:1024:4: (lv_name_2_0= ruleEString )
            // InternalEsportDsl.g:1025:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTeamAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTeamRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl1.EsportDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getTeamAccess().getColonKeyword_3());
            		
            // InternalEsportDsl.g:1046:3: ( (lv_championshipPoints_4_0= ruleEInt ) )
            // InternalEsportDsl.g:1047:4: (lv_championshipPoints_4_0= ruleEInt )
            {
            // InternalEsportDsl.g:1047:4: (lv_championshipPoints_4_0= ruleEInt )
            // InternalEsportDsl.g:1048:5: lv_championshipPoints_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTeamAccess().getChampionshipPointsEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_21);
            lv_championshipPoints_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTeamRule());
            					}
            					set(
            						current,
            						"championshipPoints",
            						lv_championshipPoints_4_0,
            						"org.xtext.example.mydsl1.EsportDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEsportDsl.g:1065:3: ( (lv_coach_5_0= ruleCoach ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalEsportDsl.g:1066:4: (lv_coach_5_0= ruleCoach )
                    {
                    // InternalEsportDsl.g:1066:4: (lv_coach_5_0= ruleCoach )
                    // InternalEsportDsl.g:1067:5: lv_coach_5_0= ruleCoach
                    {

                    					newCompositeNode(grammarAccess.getTeamAccess().getCoachCoachParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_coach_5_0=ruleCoach();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTeamRule());
                    					}
                    					set(
                    						current,
                    						"coach",
                    						lv_coach_5_0,
                    						"org.xtext.example.mydsl1.EsportDsl.Coach");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,13,FOLLOW_22); 

            			newLeafNode(otherlv_6, grammarAccess.getTeamAccess().getLeftParenthesisKeyword_6());
            		
            // InternalEsportDsl.g:1088:3: ( (lv_players_7_0= rulePlayer ) )
            // InternalEsportDsl.g:1089:4: (lv_players_7_0= rulePlayer )
            {
            // InternalEsportDsl.g:1089:4: (lv_players_7_0= rulePlayer )
            // InternalEsportDsl.g:1090:5: lv_players_7_0= rulePlayer
            {

            					newCompositeNode(grammarAccess.getTeamAccess().getPlayersPlayerParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_8);
            lv_players_7_0=rulePlayer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTeamRule());
            					}
            					add(
            						current,
            						"players",
            						lv_players_7_0,
            						"org.xtext.example.mydsl1.EsportDsl.Player");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEsportDsl.g:1107:3: (otherlv_8= ',' ( (lv_players_9_0= rulePlayer ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==14) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalEsportDsl.g:1108:4: otherlv_8= ',' ( (lv_players_9_0= rulePlayer ) )
            	    {
            	    otherlv_8=(Token)match(input,14,FOLLOW_22); 

            	    				newLeafNode(otherlv_8, grammarAccess.getTeamAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalEsportDsl.g:1112:4: ( (lv_players_9_0= rulePlayer ) )
            	    // InternalEsportDsl.g:1113:5: (lv_players_9_0= rulePlayer )
            	    {
            	    // InternalEsportDsl.g:1113:5: (lv_players_9_0= rulePlayer )
            	    // InternalEsportDsl.g:1114:6: lv_players_9_0= rulePlayer
            	    {

            	    						newCompositeNode(grammarAccess.getTeamAccess().getPlayersPlayerParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_players_9_0=rulePlayer();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTeamRule());
            	    						}
            	    						add(
            	    							current,
            	    							"players",
            	    							lv_players_9_0,
            	    							"org.xtext.example.mydsl1.EsportDsl.Player");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getTeamAccess().getRightParenthesisKeyword_9());
            		

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
    // $ANTLR end "ruleTeam"


    // $ANTLR start "entryRuleQualification"
    // InternalEsportDsl.g:1140:1: entryRuleQualification returns [EObject current=null] : iv_ruleQualification= ruleQualification EOF ;
    public final EObject entryRuleQualification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualification = null;


        try {
            // InternalEsportDsl.g:1140:54: (iv_ruleQualification= ruleQualification EOF )
            // InternalEsportDsl.g:1141:2: iv_ruleQualification= ruleQualification EOF
            {
             newCompositeNode(grammarAccess.getQualificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualification=ruleQualification();

            state._fsp--;

             current =iv_ruleQualification; 
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
    // $ANTLR end "entryRuleQualification"


    // $ANTLR start "ruleQualification"
    // InternalEsportDsl.g:1147:1: ruleQualification returns [EObject current=null] : ( () otherlv_1= 'Qualification' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleQualification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalEsportDsl.g:1153:2: ( ( () otherlv_1= 'Qualification' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalEsportDsl.g:1154:2: ( () otherlv_1= 'Qualification' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalEsportDsl.g:1154:2: ( () otherlv_1= 'Qualification' ( (lv_name_2_0= ruleEString ) ) )
            // InternalEsportDsl.g:1155:3: () otherlv_1= 'Qualification' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalEsportDsl.g:1155:3: ()
            // InternalEsportDsl.g:1156:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQualificationAccess().getQualificationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getQualificationAccess().getQualificationKeyword_1());
            		
            // InternalEsportDsl.g:1166:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEsportDsl.g:1167:4: (lv_name_2_0= ruleEString )
            {
            // InternalEsportDsl.g:1167:4: (lv_name_2_0= ruleEString )
            // InternalEsportDsl.g:1168:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getQualificationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQualificationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl1.EsportDsl.EString");
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
    // $ANTLR end "ruleQualification"


    // $ANTLR start "entryRuleEString"
    // InternalEsportDsl.g:1189:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalEsportDsl.g:1189:47: (iv_ruleEString= ruleEString EOF )
            // InternalEsportDsl.g:1190:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalEsportDsl.g:1196:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalEsportDsl.g:1202:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalEsportDsl.g:1203:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalEsportDsl.g:1203:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_ID) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalEsportDsl.g:1204:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEsportDsl.g:1212:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleCountry"
    // InternalEsportDsl.g:1223:1: entryRuleCountry returns [EObject current=null] : iv_ruleCountry= ruleCountry EOF ;
    public final EObject entryRuleCountry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCountry = null;


        try {
            // InternalEsportDsl.g:1223:48: (iv_ruleCountry= ruleCountry EOF )
            // InternalEsportDsl.g:1224:2: iv_ruleCountry= ruleCountry EOF
            {
             newCompositeNode(grammarAccess.getCountryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCountry=ruleCountry();

            state._fsp--;

             current =iv_ruleCountry; 
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
    // $ANTLR end "entryRuleCountry"


    // $ANTLR start "ruleCountry"
    // InternalEsportDsl.g:1230:1: ruleCountry returns [EObject current=null] : ( () otherlv_1= 'Country' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleCountry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalEsportDsl.g:1236:2: ( ( () otherlv_1= 'Country' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalEsportDsl.g:1237:2: ( () otherlv_1= 'Country' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalEsportDsl.g:1237:2: ( () otherlv_1= 'Country' ( (lv_name_2_0= ruleEString ) ) )
            // InternalEsportDsl.g:1238:3: () otherlv_1= 'Country' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalEsportDsl.g:1238:3: ()
            // InternalEsportDsl.g:1239:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCountryAccess().getCountryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCountryAccess().getCountryKeyword_1());
            		
            // InternalEsportDsl.g:1249:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEsportDsl.g:1250:4: (lv_name_2_0= ruleEString )
            {
            // InternalEsportDsl.g:1250:4: (lv_name_2_0= ruleEString )
            // InternalEsportDsl.g:1251:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCountryAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCountryRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl1.EsportDsl.EString");
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
    // $ANTLR end "ruleCountry"


    // $ANTLR start "entryRuleEInt"
    // InternalEsportDsl.g:1272:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalEsportDsl.g:1272:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalEsportDsl.g:1273:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalEsportDsl.g:1279:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalEsportDsl.g:1285:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalEsportDsl.g:1286:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalEsportDsl.g:1286:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalEsportDsl.g:1287:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalEsportDsl.g:1287:3: (kw= '-' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==23) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalEsportDsl.g:1288:4: kw= '-'
                    {
                    kw=(Token)match(input,23,FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleFinalStage"
    // InternalEsportDsl.g:1305:1: entryRuleFinalStage returns [EObject current=null] : iv_ruleFinalStage= ruleFinalStage EOF ;
    public final EObject entryRuleFinalStage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinalStage = null;


        try {
            // InternalEsportDsl.g:1305:51: (iv_ruleFinalStage= ruleFinalStage EOF )
            // InternalEsportDsl.g:1306:2: iv_ruleFinalStage= ruleFinalStage EOF
            {
             newCompositeNode(grammarAccess.getFinalStageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFinalStage=ruleFinalStage();

            state._fsp--;

             current =iv_ruleFinalStage; 
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
    // $ANTLR end "entryRuleFinalStage"


    // $ANTLR start "ruleFinalStage"
    // InternalEsportDsl.g:1312:1: ruleFinalStage returns [EObject current=null] : ( () otherlv_1= 'FinalStage' otherlv_2= ':' ( (lv_maxNbGames_3_0= ruleEInt ) ) otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' (otherlv_9= 'matchs' otherlv_10= '(' ( (lv_matchs_11_0= ruleMatch ) ) (otherlv_12= ',' ( (lv_matchs_13_0= ruleMatch ) ) )* otherlv_14= ')' )? ) ;
    public final EObject ruleFinalStage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_maxNbGames_3_0 = null;

        EObject lv_matchs_11_0 = null;

        EObject lv_matchs_13_0 = null;



        	enterRule();

        try {
            // InternalEsportDsl.g:1318:2: ( ( () otherlv_1= 'FinalStage' otherlv_2= ':' ( (lv_maxNbGames_3_0= ruleEInt ) ) otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' (otherlv_9= 'matchs' otherlv_10= '(' ( (lv_matchs_11_0= ruleMatch ) ) (otherlv_12= ',' ( (lv_matchs_13_0= ruleMatch ) ) )* otherlv_14= ')' )? ) )
            // InternalEsportDsl.g:1319:2: ( () otherlv_1= 'FinalStage' otherlv_2= ':' ( (lv_maxNbGames_3_0= ruleEInt ) ) otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' (otherlv_9= 'matchs' otherlv_10= '(' ( (lv_matchs_11_0= ruleMatch ) ) (otherlv_12= ',' ( (lv_matchs_13_0= ruleMatch ) ) )* otherlv_14= ')' )? )
            {
            // InternalEsportDsl.g:1319:2: ( () otherlv_1= 'FinalStage' otherlv_2= ':' ( (lv_maxNbGames_3_0= ruleEInt ) ) otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' (otherlv_9= 'matchs' otherlv_10= '(' ( (lv_matchs_11_0= ruleMatch ) ) (otherlv_12= ',' ( (lv_matchs_13_0= ruleMatch ) ) )* otherlv_14= ')' )? )
            // InternalEsportDsl.g:1320:3: () otherlv_1= 'FinalStage' otherlv_2= ':' ( (lv_maxNbGames_3_0= ruleEInt ) ) otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' (otherlv_9= 'matchs' otherlv_10= '(' ( (lv_matchs_11_0= ruleMatch ) ) (otherlv_12= ',' ( (lv_matchs_13_0= ruleMatch ) ) )* otherlv_14= ')' )?
            {
            // InternalEsportDsl.g:1320:3: ()
            // InternalEsportDsl.g:1321:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFinalStageAccess().getFinalStageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getFinalStageAccess().getFinalStageKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getFinalStageAccess().getColonKeyword_2());
            		
            // InternalEsportDsl.g:1335:3: ( (lv_maxNbGames_3_0= ruleEInt ) )
            // InternalEsportDsl.g:1336:4: (lv_maxNbGames_3_0= ruleEInt )
            {
            // InternalEsportDsl.g:1336:4: (lv_maxNbGames_3_0= ruleEInt )
            // InternalEsportDsl.g:1337:5: lv_maxNbGames_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getFinalStageAccess().getMaxNbGamesEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_maxNbGames_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFinalStageRule());
            					}
            					set(
            						current,
            						"maxNbGames",
            						lv_maxNbGames_3_0,
            						"org.xtext.example.mydsl1.EsportDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getFinalStageAccess().getLeftParenthesisKeyword_4());
            		
            // InternalEsportDsl.g:1358:3: ( ( ruleEString ) )
            // InternalEsportDsl.g:1359:4: ( ruleEString )
            {
            // InternalEsportDsl.g:1359:4: ( ruleEString )
            // InternalEsportDsl.g:1360:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFinalStageRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFinalStageAccess().getTeamsTeamCrossReference_5_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEsportDsl.g:1374:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==14) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalEsportDsl.g:1375:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_4); 

            	    				newLeafNode(otherlv_6, grammarAccess.getFinalStageAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalEsportDsl.g:1379:4: ( ( ruleEString ) )
            	    // InternalEsportDsl.g:1380:5: ( ruleEString )
            	    {
            	    // InternalEsportDsl.g:1380:5: ( ruleEString )
            	    // InternalEsportDsl.g:1381:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFinalStageRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getFinalStageAccess().getTeamsTeamCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_24); 

            			newLeafNode(otherlv_8, grammarAccess.getFinalStageAccess().getRightParenthesisKeyword_7());
            		
            // InternalEsportDsl.g:1400:3: (otherlv_9= 'matchs' otherlv_10= '(' ( (lv_matchs_11_0= ruleMatch ) ) (otherlv_12= ',' ( (lv_matchs_13_0= ruleMatch ) ) )* otherlv_14= ')' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==25) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalEsportDsl.g:1401:4: otherlv_9= 'matchs' otherlv_10= '(' ( (lv_matchs_11_0= ruleMatch ) ) (otherlv_12= ',' ( (lv_matchs_13_0= ruleMatch ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,25,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getFinalStageAccess().getMatchsKeyword_8_0());
                    			
                    otherlv_10=(Token)match(input,13,FOLLOW_25); 

                    				newLeafNode(otherlv_10, grammarAccess.getFinalStageAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalEsportDsl.g:1409:4: ( (lv_matchs_11_0= ruleMatch ) )
                    // InternalEsportDsl.g:1410:5: (lv_matchs_11_0= ruleMatch )
                    {
                    // InternalEsportDsl.g:1410:5: (lv_matchs_11_0= ruleMatch )
                    // InternalEsportDsl.g:1411:6: lv_matchs_11_0= ruleMatch
                    {

                    						newCompositeNode(grammarAccess.getFinalStageAccess().getMatchsMatchParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_matchs_11_0=ruleMatch();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFinalStageRule());
                    						}
                    						add(
                    							current,
                    							"matchs",
                    							lv_matchs_11_0,
                    							"org.xtext.example.mydsl1.EsportDsl.Match");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEsportDsl.g:1428:4: (otherlv_12= ',' ( (lv_matchs_13_0= ruleMatch ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==14) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalEsportDsl.g:1429:5: otherlv_12= ',' ( (lv_matchs_13_0= ruleMatch ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_25); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getFinalStageAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalEsportDsl.g:1433:5: ( (lv_matchs_13_0= ruleMatch ) )
                    	    // InternalEsportDsl.g:1434:6: (lv_matchs_13_0= ruleMatch )
                    	    {
                    	    // InternalEsportDsl.g:1434:6: (lv_matchs_13_0= ruleMatch )
                    	    // InternalEsportDsl.g:1435:7: lv_matchs_13_0= ruleMatch
                    	    {

                    	    							newCompositeNode(grammarAccess.getFinalStageAccess().getMatchsMatchParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_matchs_13_0=ruleMatch();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFinalStageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"matchs",
                    	    								lv_matchs_13_0,
                    	    								"org.xtext.example.mydsl1.EsportDsl.Match");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getFinalStageAccess().getRightParenthesisKeyword_8_4());
                    			

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
    // $ANTLR end "ruleFinalStage"


    // $ANTLR start "entryRuleGroupStage"
    // InternalEsportDsl.g:1462:1: entryRuleGroupStage returns [EObject current=null] : iv_ruleGroupStage= ruleGroupStage EOF ;
    public final EObject entryRuleGroupStage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupStage = null;


        try {
            // InternalEsportDsl.g:1462:51: (iv_ruleGroupStage= ruleGroupStage EOF )
            // InternalEsportDsl.g:1463:2: iv_ruleGroupStage= ruleGroupStage EOF
            {
             newCompositeNode(grammarAccess.getGroupStageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroupStage=ruleGroupStage();

            state._fsp--;

             current =iv_ruleGroupStage; 
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
    // $ANTLR end "entryRuleGroupStage"


    // $ANTLR start "ruleGroupStage"
    // InternalEsportDsl.g:1469:1: ruleGroupStage returns [EObject current=null] : ( () otherlv_1= 'GroupStage' otherlv_2= ':' ( (lv_type_3_0= ruleGroupStageType ) ) ( (lv_maxNbGames_4_0= ruleEInt ) ) ( (lv_meetingsInSameGroup_5_0= ruleEInt ) ) ( (lv_meetingsWithOtherGroups_6_0= ruleEInt ) )? (otherlv_7= '(' ( (lv_groups_8_0= ruleGroup ) ) (otherlv_9= ',' ( (lv_groups_10_0= ruleGroup ) ) )* otherlv_11= ')' )? ) ;
    public final EObject ruleGroupStage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Enumerator lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_maxNbGames_4_0 = null;

        AntlrDatatypeRuleToken lv_meetingsInSameGroup_5_0 = null;

        AntlrDatatypeRuleToken lv_meetingsWithOtherGroups_6_0 = null;

        EObject lv_groups_8_0 = null;

        EObject lv_groups_10_0 = null;



        	enterRule();

        try {
            // InternalEsportDsl.g:1475:2: ( ( () otherlv_1= 'GroupStage' otherlv_2= ':' ( (lv_type_3_0= ruleGroupStageType ) ) ( (lv_maxNbGames_4_0= ruleEInt ) ) ( (lv_meetingsInSameGroup_5_0= ruleEInt ) ) ( (lv_meetingsWithOtherGroups_6_0= ruleEInt ) )? (otherlv_7= '(' ( (lv_groups_8_0= ruleGroup ) ) (otherlv_9= ',' ( (lv_groups_10_0= ruleGroup ) ) )* otherlv_11= ')' )? ) )
            // InternalEsportDsl.g:1476:2: ( () otherlv_1= 'GroupStage' otherlv_2= ':' ( (lv_type_3_0= ruleGroupStageType ) ) ( (lv_maxNbGames_4_0= ruleEInt ) ) ( (lv_meetingsInSameGroup_5_0= ruleEInt ) ) ( (lv_meetingsWithOtherGroups_6_0= ruleEInt ) )? (otherlv_7= '(' ( (lv_groups_8_0= ruleGroup ) ) (otherlv_9= ',' ( (lv_groups_10_0= ruleGroup ) ) )* otherlv_11= ')' )? )
            {
            // InternalEsportDsl.g:1476:2: ( () otherlv_1= 'GroupStage' otherlv_2= ':' ( (lv_type_3_0= ruleGroupStageType ) ) ( (lv_maxNbGames_4_0= ruleEInt ) ) ( (lv_meetingsInSameGroup_5_0= ruleEInt ) ) ( (lv_meetingsWithOtherGroups_6_0= ruleEInt ) )? (otherlv_7= '(' ( (lv_groups_8_0= ruleGroup ) ) (otherlv_9= ',' ( (lv_groups_10_0= ruleGroup ) ) )* otherlv_11= ')' )? )
            // InternalEsportDsl.g:1477:3: () otherlv_1= 'GroupStage' otherlv_2= ':' ( (lv_type_3_0= ruleGroupStageType ) ) ( (lv_maxNbGames_4_0= ruleEInt ) ) ( (lv_meetingsInSameGroup_5_0= ruleEInt ) ) ( (lv_meetingsWithOtherGroups_6_0= ruleEInt ) )? (otherlv_7= '(' ( (lv_groups_8_0= ruleGroup ) ) (otherlv_9= ',' ( (lv_groups_10_0= ruleGroup ) ) )* otherlv_11= ')' )?
            {
            // InternalEsportDsl.g:1477:3: ()
            // InternalEsportDsl.g:1478:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGroupStageAccess().getGroupStageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getGroupStageAccess().getGroupStageKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getGroupStageAccess().getColonKeyword_2());
            		
            // InternalEsportDsl.g:1492:3: ( (lv_type_3_0= ruleGroupStageType ) )
            // InternalEsportDsl.g:1493:4: (lv_type_3_0= ruleGroupStageType )
            {
            // InternalEsportDsl.g:1493:4: (lv_type_3_0= ruleGroupStageType )
            // InternalEsportDsl.g:1494:5: lv_type_3_0= ruleGroupStageType
            {

            					newCompositeNode(grammarAccess.getGroupStageAccess().getTypeGroupStageTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_type_3_0=ruleGroupStageType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupStageRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.xtext.example.mydsl1.EsportDsl.GroupStageType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEsportDsl.g:1511:3: ( (lv_maxNbGames_4_0= ruleEInt ) )
            // InternalEsportDsl.g:1512:4: (lv_maxNbGames_4_0= ruleEInt )
            {
            // InternalEsportDsl.g:1512:4: (lv_maxNbGames_4_0= ruleEInt )
            // InternalEsportDsl.g:1513:5: lv_maxNbGames_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getGroupStageAccess().getMaxNbGamesEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_maxNbGames_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupStageRule());
            					}
            					set(
            						current,
            						"maxNbGames",
            						lv_maxNbGames_4_0,
            						"org.xtext.example.mydsl1.EsportDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEsportDsl.g:1530:3: ( (lv_meetingsInSameGroup_5_0= ruleEInt ) )
            // InternalEsportDsl.g:1531:4: (lv_meetingsInSameGroup_5_0= ruleEInt )
            {
            // InternalEsportDsl.g:1531:4: (lv_meetingsInSameGroup_5_0= ruleEInt )
            // InternalEsportDsl.g:1532:5: lv_meetingsInSameGroup_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getGroupStageAccess().getMeetingsInSameGroupEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_27);
            lv_meetingsInSameGroup_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupStageRule());
            					}
            					set(
            						current,
            						"meetingsInSameGroup",
            						lv_meetingsInSameGroup_5_0,
            						"org.xtext.example.mydsl1.EsportDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEsportDsl.g:1549:3: ( (lv_meetingsWithOtherGroups_6_0= ruleEInt ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_INT||LA27_0==23) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalEsportDsl.g:1550:4: (lv_meetingsWithOtherGroups_6_0= ruleEInt )
                    {
                    // InternalEsportDsl.g:1550:4: (lv_meetingsWithOtherGroups_6_0= ruleEInt )
                    // InternalEsportDsl.g:1551:5: lv_meetingsWithOtherGroups_6_0= ruleEInt
                    {

                    					newCompositeNode(grammarAccess.getGroupStageAccess().getMeetingsWithOtherGroupsEIntParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_meetingsWithOtherGroups_6_0=ruleEInt();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getGroupStageRule());
                    					}
                    					set(
                    						current,
                    						"meetingsWithOtherGroups",
                    						lv_meetingsWithOtherGroups_6_0,
                    						"org.xtext.example.mydsl1.EsportDsl.EInt");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalEsportDsl.g:1568:3: (otherlv_7= '(' ( (lv_groups_8_0= ruleGroup ) ) (otherlv_9= ',' ( (lv_groups_10_0= ruleGroup ) ) )* otherlv_11= ')' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==13) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalEsportDsl.g:1569:4: otherlv_7= '(' ( (lv_groups_8_0= ruleGroup ) ) (otherlv_9= ',' ( (lv_groups_10_0= ruleGroup ) ) )* otherlv_11= ')'
                    {
                    otherlv_7=(Token)match(input,13,FOLLOW_28); 

                    				newLeafNode(otherlv_7, grammarAccess.getGroupStageAccess().getLeftParenthesisKeyword_7_0());
                    			
                    // InternalEsportDsl.g:1573:4: ( (lv_groups_8_0= ruleGroup ) )
                    // InternalEsportDsl.g:1574:5: (lv_groups_8_0= ruleGroup )
                    {
                    // InternalEsportDsl.g:1574:5: (lv_groups_8_0= ruleGroup )
                    // InternalEsportDsl.g:1575:6: lv_groups_8_0= ruleGroup
                    {

                    						newCompositeNode(grammarAccess.getGroupStageAccess().getGroupsGroupParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_groups_8_0=ruleGroup();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGroupStageRule());
                    						}
                    						add(
                    							current,
                    							"groups",
                    							lv_groups_8_0,
                    							"org.xtext.example.mydsl1.EsportDsl.Group");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEsportDsl.g:1592:4: (otherlv_9= ',' ( (lv_groups_10_0= ruleGroup ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==14) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalEsportDsl.g:1593:5: otherlv_9= ',' ( (lv_groups_10_0= ruleGroup ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_28); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getGroupStageAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalEsportDsl.g:1597:5: ( (lv_groups_10_0= ruleGroup ) )
                    	    // InternalEsportDsl.g:1598:6: (lv_groups_10_0= ruleGroup )
                    	    {
                    	    // InternalEsportDsl.g:1598:6: (lv_groups_10_0= ruleGroup )
                    	    // InternalEsportDsl.g:1599:7: lv_groups_10_0= ruleGroup
                    	    {

                    	    							newCompositeNode(grammarAccess.getGroupStageAccess().getGroupsGroupParserRuleCall_7_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_groups_10_0=ruleGroup();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGroupStageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"groups",
                    	    								lv_groups_10_0,
                    	    								"org.xtext.example.mydsl1.EsportDsl.Group");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getGroupStageAccess().getRightParenthesisKeyword_7_3());
                    			

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
    // $ANTLR end "ruleGroupStage"


    // $ANTLR start "entryRuleMatch"
    // InternalEsportDsl.g:1626:1: entryRuleMatch returns [EObject current=null] : iv_ruleMatch= ruleMatch EOF ;
    public final EObject entryRuleMatch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatch = null;


        try {
            // InternalEsportDsl.g:1626:46: (iv_ruleMatch= ruleMatch EOF )
            // InternalEsportDsl.g:1627:2: iv_ruleMatch= ruleMatch EOF
            {
             newCompositeNode(grammarAccess.getMatchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMatch=ruleMatch();

            state._fsp--;

             current =iv_ruleMatch; 
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
    // $ANTLR end "entryRuleMatch"


    // $ANTLR start "ruleMatch"
    // InternalEsportDsl.g:1633:1: ruleMatch returns [EObject current=null] : ( () otherlv_1= 'Match' otherlv_2= ':' ( (lv_type_3_0= ruleMatchType ) ) ( (lv_loserWins_4_0= ruleEInt ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) ) ;
    public final EObject ruleMatch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_loserWins_4_0 = null;



        	enterRule();

        try {
            // InternalEsportDsl.g:1639:2: ( ( () otherlv_1= 'Match' otherlv_2= ':' ( (lv_type_3_0= ruleMatchType ) ) ( (lv_loserWins_4_0= ruleEInt ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) ) )
            // InternalEsportDsl.g:1640:2: ( () otherlv_1= 'Match' otherlv_2= ':' ( (lv_type_3_0= ruleMatchType ) ) ( (lv_loserWins_4_0= ruleEInt ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) )
            {
            // InternalEsportDsl.g:1640:2: ( () otherlv_1= 'Match' otherlv_2= ':' ( (lv_type_3_0= ruleMatchType ) ) ( (lv_loserWins_4_0= ruleEInt ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) )
            // InternalEsportDsl.g:1641:3: () otherlv_1= 'Match' otherlv_2= ':' ( (lv_type_3_0= ruleMatchType ) ) ( (lv_loserWins_4_0= ruleEInt ) ) ( ( ruleEString ) ) ( ( ruleEString ) )
            {
            // InternalEsportDsl.g:1641:3: ()
            // InternalEsportDsl.g:1642:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMatchAccess().getMatchAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMatchAccess().getMatchKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getMatchAccess().getColonKeyword_2());
            		
            // InternalEsportDsl.g:1656:3: ( (lv_type_3_0= ruleMatchType ) )
            // InternalEsportDsl.g:1657:4: (lv_type_3_0= ruleMatchType )
            {
            // InternalEsportDsl.g:1657:4: (lv_type_3_0= ruleMatchType )
            // InternalEsportDsl.g:1658:5: lv_type_3_0= ruleMatchType
            {

            					newCompositeNode(grammarAccess.getMatchAccess().getTypeMatchTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_type_3_0=ruleMatchType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMatchRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.xtext.example.mydsl1.EsportDsl.MatchType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEsportDsl.g:1675:3: ( (lv_loserWins_4_0= ruleEInt ) )
            // InternalEsportDsl.g:1676:4: (lv_loserWins_4_0= ruleEInt )
            {
            // InternalEsportDsl.g:1676:4: (lv_loserWins_4_0= ruleEInt )
            // InternalEsportDsl.g:1677:5: lv_loserWins_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getMatchAccess().getLoserWinsEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_4);
            lv_loserWins_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMatchRule());
            					}
            					set(
            						current,
            						"loserWins",
            						lv_loserWins_4_0,
            						"org.xtext.example.mydsl1.EsportDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEsportDsl.g:1694:3: ( ( ruleEString ) )
            // InternalEsportDsl.g:1695:4: ( ruleEString )
            {
            // InternalEsportDsl.g:1695:4: ( ruleEString )
            // InternalEsportDsl.g:1696:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMatchRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMatchAccess().getTeamWinnerTeamCrossReference_5_0());
            				
            pushFollow(FOLLOW_4);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEsportDsl.g:1710:3: ( ( ruleEString ) )
            // InternalEsportDsl.g:1711:4: ( ruleEString )
            {
            // InternalEsportDsl.g:1711:4: ( ruleEString )
            // InternalEsportDsl.g:1712:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMatchRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMatchAccess().getTeamLoserTeamCrossReference_6_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleMatch"


    // $ANTLR start "entryRuleGroup"
    // InternalEsportDsl.g:1730:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // InternalEsportDsl.g:1730:46: (iv_ruleGroup= ruleGroup EOF )
            // InternalEsportDsl.g:1731:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
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
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // InternalEsportDsl.g:1737:1: ruleGroup returns [EObject current=null] : ( () otherlv_1= 'Group' otherlv_2= ':' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' (otherlv_8= '(' ( (lv_matchs_9_0= ruleMatch ) ) (otherlv_10= ',' ( (lv_matchs_11_0= ruleMatch ) ) )* otherlv_12= ')' )? ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_matchs_9_0 = null;

        EObject lv_matchs_11_0 = null;



        	enterRule();

        try {
            // InternalEsportDsl.g:1743:2: ( ( () otherlv_1= 'Group' otherlv_2= ':' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' (otherlv_8= '(' ( (lv_matchs_9_0= ruleMatch ) ) (otherlv_10= ',' ( (lv_matchs_11_0= ruleMatch ) ) )* otherlv_12= ')' )? ) )
            // InternalEsportDsl.g:1744:2: ( () otherlv_1= 'Group' otherlv_2= ':' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' (otherlv_8= '(' ( (lv_matchs_9_0= ruleMatch ) ) (otherlv_10= ',' ( (lv_matchs_11_0= ruleMatch ) ) )* otherlv_12= ')' )? )
            {
            // InternalEsportDsl.g:1744:2: ( () otherlv_1= 'Group' otherlv_2= ':' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' (otherlv_8= '(' ( (lv_matchs_9_0= ruleMatch ) ) (otherlv_10= ',' ( (lv_matchs_11_0= ruleMatch ) ) )* otherlv_12= ')' )? )
            // InternalEsportDsl.g:1745:3: () otherlv_1= 'Group' otherlv_2= ':' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' (otherlv_8= '(' ( (lv_matchs_9_0= ruleMatch ) ) (otherlv_10= ',' ( (lv_matchs_11_0= ruleMatch ) ) )* otherlv_12= ')' )?
            {
            // InternalEsportDsl.g:1745:3: ()
            // InternalEsportDsl.g:1746:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGroupAccess().getGroupAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getGroupAccess().getGroupKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getGroupAccess().getLeftParenthesisKeyword_3());
            		
            // InternalEsportDsl.g:1764:3: ( ( ruleEString ) )
            // InternalEsportDsl.g:1765:4: ( ruleEString )
            {
            // InternalEsportDsl.g:1765:4: ( ruleEString )
            // InternalEsportDsl.g:1766:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGroupAccess().getTeamsTeamCrossReference_4_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEsportDsl.g:1780:3: (otherlv_5= ',' ( ( ruleEString ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==14) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalEsportDsl.g:1781:4: otherlv_5= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_4); 

            	    				newLeafNode(otherlv_5, grammarAccess.getGroupAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalEsportDsl.g:1785:4: ( ( ruleEString ) )
            	    // InternalEsportDsl.g:1786:5: ( ruleEString )
            	    {
            	    // InternalEsportDsl.g:1786:5: ( ruleEString )
            	    // InternalEsportDsl.g:1787:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getGroupRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getGroupAccess().getTeamsTeamCrossReference_5_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getGroupAccess().getRightParenthesisKeyword_6());
            		
            // InternalEsportDsl.g:1806:3: (otherlv_8= '(' ( (lv_matchs_9_0= ruleMatch ) ) (otherlv_10= ',' ( (lv_matchs_11_0= ruleMatch ) ) )* otherlv_12= ')' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==13) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalEsportDsl.g:1807:4: otherlv_8= '(' ( (lv_matchs_9_0= ruleMatch ) ) (otherlv_10= ',' ( (lv_matchs_11_0= ruleMatch ) ) )* otherlv_12= ')'
                    {
                    otherlv_8=(Token)match(input,13,FOLLOW_25); 

                    				newLeafNode(otherlv_8, grammarAccess.getGroupAccess().getLeftParenthesisKeyword_7_0());
                    			
                    // InternalEsportDsl.g:1811:4: ( (lv_matchs_9_0= ruleMatch ) )
                    // InternalEsportDsl.g:1812:5: (lv_matchs_9_0= ruleMatch )
                    {
                    // InternalEsportDsl.g:1812:5: (lv_matchs_9_0= ruleMatch )
                    // InternalEsportDsl.g:1813:6: lv_matchs_9_0= ruleMatch
                    {

                    						newCompositeNode(grammarAccess.getGroupAccess().getMatchsMatchParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_matchs_9_0=ruleMatch();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGroupRule());
                    						}
                    						add(
                    							current,
                    							"matchs",
                    							lv_matchs_9_0,
                    							"org.xtext.example.mydsl1.EsportDsl.Match");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEsportDsl.g:1830:4: (otherlv_10= ',' ( (lv_matchs_11_0= ruleMatch ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==14) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalEsportDsl.g:1831:5: otherlv_10= ',' ( (lv_matchs_11_0= ruleMatch ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FOLLOW_25); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getGroupAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalEsportDsl.g:1835:5: ( (lv_matchs_11_0= ruleMatch ) )
                    	    // InternalEsportDsl.g:1836:6: (lv_matchs_11_0= ruleMatch )
                    	    {
                    	    // InternalEsportDsl.g:1836:6: (lv_matchs_11_0= ruleMatch )
                    	    // InternalEsportDsl.g:1837:7: lv_matchs_11_0= ruleMatch
                    	    {

                    	    							newCompositeNode(grammarAccess.getGroupAccess().getMatchsMatchParserRuleCall_7_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_matchs_11_0=ruleMatch();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGroupRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"matchs",
                    	    								lv_matchs_11_0,
                    	    								"org.xtext.example.mydsl1.EsportDsl.Match");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getGroupAccess().getRightParenthesisKeyword_7_3());
                    			

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
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRulePlayer"
    // InternalEsportDsl.g:1864:1: entryRulePlayer returns [EObject current=null] : iv_rulePlayer= rulePlayer EOF ;
    public final EObject entryRulePlayer() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlayer = null;


        try {
            // InternalEsportDsl.g:1864:47: (iv_rulePlayer= rulePlayer EOF )
            // InternalEsportDsl.g:1865:2: iv_rulePlayer= rulePlayer EOF
            {
             newCompositeNode(grammarAccess.getPlayerRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlayer=rulePlayer();

            state._fsp--;

             current =iv_rulePlayer; 
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
    // $ANTLR end "entryRulePlayer"


    // $ANTLR start "rulePlayer"
    // InternalEsportDsl.g:1871:1: rulePlayer returns [EObject current=null] : ( () otherlv_1= 'Player' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_age_4_0= ruleEInt ) ) ( ( ruleEString ) ) ( (lv_position_6_0= rulePosition ) )? ( (lv_description_7_0= ruleEString ) )? (otherlv_8= '(' ( (lv_capacities_9_0= ruleCapacity ) ) (otherlv_10= ',' ( (lv_capacities_11_0= ruleCapacity ) ) )* otherlv_12= ')' )? ) ;
    public final EObject rulePlayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_age_4_0 = null;

        Enumerator lv_position_6_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        EObject lv_capacities_9_0 = null;

        EObject lv_capacities_11_0 = null;



        	enterRule();

        try {
            // InternalEsportDsl.g:1877:2: ( ( () otherlv_1= 'Player' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_age_4_0= ruleEInt ) ) ( ( ruleEString ) ) ( (lv_position_6_0= rulePosition ) )? ( (lv_description_7_0= ruleEString ) )? (otherlv_8= '(' ( (lv_capacities_9_0= ruleCapacity ) ) (otherlv_10= ',' ( (lv_capacities_11_0= ruleCapacity ) ) )* otherlv_12= ')' )? ) )
            // InternalEsportDsl.g:1878:2: ( () otherlv_1= 'Player' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_age_4_0= ruleEInt ) ) ( ( ruleEString ) ) ( (lv_position_6_0= rulePosition ) )? ( (lv_description_7_0= ruleEString ) )? (otherlv_8= '(' ( (lv_capacities_9_0= ruleCapacity ) ) (otherlv_10= ',' ( (lv_capacities_11_0= ruleCapacity ) ) )* otherlv_12= ')' )? )
            {
            // InternalEsportDsl.g:1878:2: ( () otherlv_1= 'Player' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_age_4_0= ruleEInt ) ) ( ( ruleEString ) ) ( (lv_position_6_0= rulePosition ) )? ( (lv_description_7_0= ruleEString ) )? (otherlv_8= '(' ( (lv_capacities_9_0= ruleCapacity ) ) (otherlv_10= ',' ( (lv_capacities_11_0= ruleCapacity ) ) )* otherlv_12= ')' )? )
            // InternalEsportDsl.g:1879:3: () otherlv_1= 'Player' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_age_4_0= ruleEInt ) ) ( ( ruleEString ) ) ( (lv_position_6_0= rulePosition ) )? ( (lv_description_7_0= ruleEString ) )? (otherlv_8= '(' ( (lv_capacities_9_0= ruleCapacity ) ) (otherlv_10= ',' ( (lv_capacities_11_0= ruleCapacity ) ) )* otherlv_12= ')' )?
            {
            // InternalEsportDsl.g:1879:3: ()
            // InternalEsportDsl.g:1880:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPlayerAccess().getPlayerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPlayerAccess().getPlayerKeyword_1());
            		
            // InternalEsportDsl.g:1890:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEsportDsl.g:1891:4: (lv_name_2_0= ruleEString )
            {
            // InternalEsportDsl.g:1891:4: (lv_name_2_0= ruleEString )
            // InternalEsportDsl.g:1892:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPlayerAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlayerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl1.EsportDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getPlayerAccess().getColonKeyword_3());
            		
            // InternalEsportDsl.g:1913:3: ( (lv_age_4_0= ruleEInt ) )
            // InternalEsportDsl.g:1914:4: (lv_age_4_0= ruleEInt )
            {
            // InternalEsportDsl.g:1914:4: (lv_age_4_0= ruleEInt )
            // InternalEsportDsl.g:1915:5: lv_age_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getPlayerAccess().getAgeEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_4);
            lv_age_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlayerRule());
            					}
            					set(
            						current,
            						"age",
            						lv_age_4_0,
            						"org.xtext.example.mydsl1.EsportDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEsportDsl.g:1932:3: ( ( ruleEString ) )
            // InternalEsportDsl.g:1933:4: ( ruleEString )
            {
            // InternalEsportDsl.g:1933:4: ( ruleEString )
            // InternalEsportDsl.g:1934:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlayerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlayerAccess().getCountryCountryCrossReference_5_0());
            				
            pushFollow(FOLLOW_30);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEsportDsl.g:1948:3: ( (lv_position_6_0= rulePosition ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=53 && LA33_0<=57)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalEsportDsl.g:1949:4: (lv_position_6_0= rulePosition )
                    {
                    // InternalEsportDsl.g:1949:4: (lv_position_6_0= rulePosition )
                    // InternalEsportDsl.g:1950:5: lv_position_6_0= rulePosition
                    {

                    					newCompositeNode(grammarAccess.getPlayerAccess().getPositionPositionEnumRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_31);
                    lv_position_6_0=rulePosition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPlayerRule());
                    					}
                    					set(
                    						current,
                    						"position",
                    						lv_position_6_0,
                    						"org.xtext.example.mydsl1.EsportDsl.Position");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalEsportDsl.g:1967:3: ( (lv_description_7_0= ruleEString ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_STRING && LA34_0<=RULE_ID)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalEsportDsl.g:1968:4: (lv_description_7_0= ruleEString )
                    {
                    // InternalEsportDsl.g:1968:4: (lv_description_7_0= ruleEString )
                    // InternalEsportDsl.g:1969:5: lv_description_7_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getPlayerAccess().getDescriptionEStringParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_description_7_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPlayerRule());
                    					}
                    					set(
                    						current,
                    						"description",
                    						lv_description_7_0,
                    						"org.xtext.example.mydsl1.EsportDsl.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalEsportDsl.g:1986:3: (otherlv_8= '(' ( (lv_capacities_9_0= ruleCapacity ) ) (otherlv_10= ',' ( (lv_capacities_11_0= ruleCapacity ) ) )* otherlv_12= ')' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==13) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalEsportDsl.g:1987:4: otherlv_8= '(' ( (lv_capacities_9_0= ruleCapacity ) ) (otherlv_10= ',' ( (lv_capacities_11_0= ruleCapacity ) ) )* otherlv_12= ')'
                    {
                    otherlv_8=(Token)match(input,13,FOLLOW_32); 

                    				newLeafNode(otherlv_8, grammarAccess.getPlayerAccess().getLeftParenthesisKeyword_8_0());
                    			
                    // InternalEsportDsl.g:1991:4: ( (lv_capacities_9_0= ruleCapacity ) )
                    // InternalEsportDsl.g:1992:5: (lv_capacities_9_0= ruleCapacity )
                    {
                    // InternalEsportDsl.g:1992:5: (lv_capacities_9_0= ruleCapacity )
                    // InternalEsportDsl.g:1993:6: lv_capacities_9_0= ruleCapacity
                    {

                    						newCompositeNode(grammarAccess.getPlayerAccess().getCapacitiesCapacityParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_capacities_9_0=ruleCapacity();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPlayerRule());
                    						}
                    						add(
                    							current,
                    							"capacities",
                    							lv_capacities_9_0,
                    							"org.xtext.example.mydsl1.EsportDsl.Capacity");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEsportDsl.g:2010:4: (otherlv_10= ',' ( (lv_capacities_11_0= ruleCapacity ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==14) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalEsportDsl.g:2011:5: otherlv_10= ',' ( (lv_capacities_11_0= ruleCapacity ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FOLLOW_32); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getPlayerAccess().getCommaKeyword_8_2_0());
                    	    				
                    	    // InternalEsportDsl.g:2015:5: ( (lv_capacities_11_0= ruleCapacity ) )
                    	    // InternalEsportDsl.g:2016:6: (lv_capacities_11_0= ruleCapacity )
                    	    {
                    	    // InternalEsportDsl.g:2016:6: (lv_capacities_11_0= ruleCapacity )
                    	    // InternalEsportDsl.g:2017:7: lv_capacities_11_0= ruleCapacity
                    	    {

                    	    							newCompositeNode(grammarAccess.getPlayerAccess().getCapacitiesCapacityParserRuleCall_8_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_capacities_11_0=ruleCapacity();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPlayerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"capacities",
                    	    								lv_capacities_11_0,
                    	    								"org.xtext.example.mydsl1.EsportDsl.Capacity");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getPlayerAccess().getRightParenthesisKeyword_8_3());
                    			

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
    // $ANTLR end "rulePlayer"


    // $ANTLR start "entryRuleCoach"
    // InternalEsportDsl.g:2044:1: entryRuleCoach returns [EObject current=null] : iv_ruleCoach= ruleCoach EOF ;
    public final EObject entryRuleCoach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoach = null;


        try {
            // InternalEsportDsl.g:2044:46: (iv_ruleCoach= ruleCoach EOF )
            // InternalEsportDsl.g:2045:2: iv_ruleCoach= ruleCoach EOF
            {
             newCompositeNode(grammarAccess.getCoachRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoach=ruleCoach();

            state._fsp--;

             current =iv_ruleCoach; 
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
    // $ANTLR end "entryRuleCoach"


    // $ANTLR start "ruleCoach"
    // InternalEsportDsl.g:2051:1: ruleCoach returns [EObject current=null] : ( () otherlv_1= 'Coach' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_age_4_0= ruleEInt ) ) ( ( ruleEString ) ) ( (lv_description_6_0= ruleEString ) )? (otherlv_7= '(' ( (lv_capacities_8_0= ruleCapacity ) ) (otherlv_9= ',' ( (lv_capacities_10_0= ruleCapacity ) ) )* otherlv_11= ')' )? ) ;
    public final EObject ruleCoach() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_age_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        EObject lv_capacities_8_0 = null;

        EObject lv_capacities_10_0 = null;



        	enterRule();

        try {
            // InternalEsportDsl.g:2057:2: ( ( () otherlv_1= 'Coach' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_age_4_0= ruleEInt ) ) ( ( ruleEString ) ) ( (lv_description_6_0= ruleEString ) )? (otherlv_7= '(' ( (lv_capacities_8_0= ruleCapacity ) ) (otherlv_9= ',' ( (lv_capacities_10_0= ruleCapacity ) ) )* otherlv_11= ')' )? ) )
            // InternalEsportDsl.g:2058:2: ( () otherlv_1= 'Coach' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_age_4_0= ruleEInt ) ) ( ( ruleEString ) ) ( (lv_description_6_0= ruleEString ) )? (otherlv_7= '(' ( (lv_capacities_8_0= ruleCapacity ) ) (otherlv_9= ',' ( (lv_capacities_10_0= ruleCapacity ) ) )* otherlv_11= ')' )? )
            {
            // InternalEsportDsl.g:2058:2: ( () otherlv_1= 'Coach' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_age_4_0= ruleEInt ) ) ( ( ruleEString ) ) ( (lv_description_6_0= ruleEString ) )? (otherlv_7= '(' ( (lv_capacities_8_0= ruleCapacity ) ) (otherlv_9= ',' ( (lv_capacities_10_0= ruleCapacity ) ) )* otherlv_11= ')' )? )
            // InternalEsportDsl.g:2059:3: () otherlv_1= 'Coach' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_age_4_0= ruleEInt ) ) ( ( ruleEString ) ) ( (lv_description_6_0= ruleEString ) )? (otherlv_7= '(' ( (lv_capacities_8_0= ruleCapacity ) ) (otherlv_9= ',' ( (lv_capacities_10_0= ruleCapacity ) ) )* otherlv_11= ')' )?
            {
            // InternalEsportDsl.g:2059:3: ()
            // InternalEsportDsl.g:2060:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCoachAccess().getCoachAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCoachAccess().getCoachKeyword_1());
            		
            // InternalEsportDsl.g:2070:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEsportDsl.g:2071:4: (lv_name_2_0= ruleEString )
            {
            // InternalEsportDsl.g:2071:4: (lv_name_2_0= ruleEString )
            // InternalEsportDsl.g:2072:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCoachAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCoachRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl1.EsportDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getCoachAccess().getColonKeyword_3());
            		
            // InternalEsportDsl.g:2093:3: ( (lv_age_4_0= ruleEInt ) )
            // InternalEsportDsl.g:2094:4: (lv_age_4_0= ruleEInt )
            {
            // InternalEsportDsl.g:2094:4: (lv_age_4_0= ruleEInt )
            // InternalEsportDsl.g:2095:5: lv_age_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getCoachAccess().getAgeEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_4);
            lv_age_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCoachRule());
            					}
            					set(
            						current,
            						"age",
            						lv_age_4_0,
            						"org.xtext.example.mydsl1.EsportDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEsportDsl.g:2112:3: ( ( ruleEString ) )
            // InternalEsportDsl.g:2113:4: ( ruleEString )
            {
            // InternalEsportDsl.g:2113:4: ( ruleEString )
            // InternalEsportDsl.g:2114:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoachRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCoachAccess().getCountryCountryCrossReference_5_0());
            				
            pushFollow(FOLLOW_31);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEsportDsl.g:2128:3: ( (lv_description_6_0= ruleEString ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_STRING && LA37_0<=RULE_ID)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalEsportDsl.g:2129:4: (lv_description_6_0= ruleEString )
                    {
                    // InternalEsportDsl.g:2129:4: (lv_description_6_0= ruleEString )
                    // InternalEsportDsl.g:2130:5: lv_description_6_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getCoachAccess().getDescriptionEStringParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_description_6_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCoachRule());
                    					}
                    					set(
                    						current,
                    						"description",
                    						lv_description_6_0,
                    						"org.xtext.example.mydsl1.EsportDsl.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalEsportDsl.g:2147:3: (otherlv_7= '(' ( (lv_capacities_8_0= ruleCapacity ) ) (otherlv_9= ',' ( (lv_capacities_10_0= ruleCapacity ) ) )* otherlv_11= ')' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==13) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==31) ) {
                    alt39=1;
                }
            }
            switch (alt39) {
                case 1 :
                    // InternalEsportDsl.g:2148:4: otherlv_7= '(' ( (lv_capacities_8_0= ruleCapacity ) ) (otherlv_9= ',' ( (lv_capacities_10_0= ruleCapacity ) ) )* otherlv_11= ')'
                    {
                    otherlv_7=(Token)match(input,13,FOLLOW_32); 

                    				newLeafNode(otherlv_7, grammarAccess.getCoachAccess().getLeftParenthesisKeyword_7_0());
                    			
                    // InternalEsportDsl.g:2152:4: ( (lv_capacities_8_0= ruleCapacity ) )
                    // InternalEsportDsl.g:2153:5: (lv_capacities_8_0= ruleCapacity )
                    {
                    // InternalEsportDsl.g:2153:5: (lv_capacities_8_0= ruleCapacity )
                    // InternalEsportDsl.g:2154:6: lv_capacities_8_0= ruleCapacity
                    {

                    						newCompositeNode(grammarAccess.getCoachAccess().getCapacitiesCapacityParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_capacities_8_0=ruleCapacity();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCoachRule());
                    						}
                    						add(
                    							current,
                    							"capacities",
                    							lv_capacities_8_0,
                    							"org.xtext.example.mydsl1.EsportDsl.Capacity");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEsportDsl.g:2171:4: (otherlv_9= ',' ( (lv_capacities_10_0= ruleCapacity ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==14) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalEsportDsl.g:2172:5: otherlv_9= ',' ( (lv_capacities_10_0= ruleCapacity ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_32); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getCoachAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalEsportDsl.g:2176:5: ( (lv_capacities_10_0= ruleCapacity ) )
                    	    // InternalEsportDsl.g:2177:6: (lv_capacities_10_0= ruleCapacity )
                    	    {
                    	    // InternalEsportDsl.g:2177:6: (lv_capacities_10_0= ruleCapacity )
                    	    // InternalEsportDsl.g:2178:7: lv_capacities_10_0= ruleCapacity
                    	    {

                    	    							newCompositeNode(grammarAccess.getCoachAccess().getCapacitiesCapacityParserRuleCall_7_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_capacities_10_0=ruleCapacity();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCoachRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"capacities",
                    	    								lv_capacities_10_0,
                    	    								"org.xtext.example.mydsl1.EsportDsl.Capacity");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getCoachAccess().getRightParenthesisKeyword_7_3());
                    			

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
    // $ANTLR end "ruleCoach"


    // $ANTLR start "entryRuleCapacity"
    // InternalEsportDsl.g:2205:1: entryRuleCapacity returns [EObject current=null] : iv_ruleCapacity= ruleCapacity EOF ;
    public final EObject entryRuleCapacity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapacity = null;


        try {
            // InternalEsportDsl.g:2205:49: (iv_ruleCapacity= ruleCapacity EOF )
            // InternalEsportDsl.g:2206:2: iv_ruleCapacity= ruleCapacity EOF
            {
             newCompositeNode(grammarAccess.getCapacityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCapacity=ruleCapacity();

            state._fsp--;

             current =iv_ruleCapacity; 
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
    // $ANTLR end "entryRuleCapacity"


    // $ANTLR start "ruleCapacity"
    // InternalEsportDsl.g:2212:1: ruleCapacity returns [EObject current=null] : ( () otherlv_1= 'Capacity' otherlv_2= ':' ( (lv_type_3_0= ruleCapacityType ) ) ( (lv_value_4_0= ruleEInt ) ) ) ;
    public final EObject ruleCapacity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalEsportDsl.g:2218:2: ( ( () otherlv_1= 'Capacity' otherlv_2= ':' ( (lv_type_3_0= ruleCapacityType ) ) ( (lv_value_4_0= ruleEInt ) ) ) )
            // InternalEsportDsl.g:2219:2: ( () otherlv_1= 'Capacity' otherlv_2= ':' ( (lv_type_3_0= ruleCapacityType ) ) ( (lv_value_4_0= ruleEInt ) ) )
            {
            // InternalEsportDsl.g:2219:2: ( () otherlv_1= 'Capacity' otherlv_2= ':' ( (lv_type_3_0= ruleCapacityType ) ) ( (lv_value_4_0= ruleEInt ) ) )
            // InternalEsportDsl.g:2220:3: () otherlv_1= 'Capacity' otherlv_2= ':' ( (lv_type_3_0= ruleCapacityType ) ) ( (lv_value_4_0= ruleEInt ) )
            {
            // InternalEsportDsl.g:2220:3: ()
            // InternalEsportDsl.g:2221:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCapacityAccess().getCapacityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getCapacityAccess().getCapacityKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getCapacityAccess().getColonKeyword_2());
            		
            // InternalEsportDsl.g:2235:3: ( (lv_type_3_0= ruleCapacityType ) )
            // InternalEsportDsl.g:2236:4: (lv_type_3_0= ruleCapacityType )
            {
            // InternalEsportDsl.g:2236:4: (lv_type_3_0= ruleCapacityType )
            // InternalEsportDsl.g:2237:5: lv_type_3_0= ruleCapacityType
            {

            					newCompositeNode(grammarAccess.getCapacityAccess().getTypeCapacityTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_type_3_0=ruleCapacityType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCapacityRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.xtext.example.mydsl1.EsportDsl.CapacityType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEsportDsl.g:2254:3: ( (lv_value_4_0= ruleEInt ) )
            // InternalEsportDsl.g:2255:4: (lv_value_4_0= ruleEInt )
            {
            // InternalEsportDsl.g:2255:4: (lv_value_4_0= ruleEInt )
            // InternalEsportDsl.g:2256:5: lv_value_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getCapacityAccess().getValueEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCapacityRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_4_0,
            						"org.xtext.example.mydsl1.EsportDsl.EInt");
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
    // $ANTLR end "ruleCapacity"


    // $ANTLR start "ruleTournamentType"
    // InternalEsportDsl.g:2277:1: ruleTournamentType returns [Enumerator current=null] : ( (enumLiteral_0= 'worlds' ) | (enumLiteral_1= 'regionals' ) | (enumLiteral_2= 'allStars' ) | (enumLiteral_3= 'promotion' ) | (enumLiteral_4= 'midSeasonInvitational' ) | (enumLiteral_5= 'riftRivals' ) | (enumLiteral_6= 'playOff' ) ) ;
    public final Enumerator ruleTournamentType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalEsportDsl.g:2283:2: ( ( (enumLiteral_0= 'worlds' ) | (enumLiteral_1= 'regionals' ) | (enumLiteral_2= 'allStars' ) | (enumLiteral_3= 'promotion' ) | (enumLiteral_4= 'midSeasonInvitational' ) | (enumLiteral_5= 'riftRivals' ) | (enumLiteral_6= 'playOff' ) ) )
            // InternalEsportDsl.g:2284:2: ( (enumLiteral_0= 'worlds' ) | (enumLiteral_1= 'regionals' ) | (enumLiteral_2= 'allStars' ) | (enumLiteral_3= 'promotion' ) | (enumLiteral_4= 'midSeasonInvitational' ) | (enumLiteral_5= 'riftRivals' ) | (enumLiteral_6= 'playOff' ) )
            {
            // InternalEsportDsl.g:2284:2: ( (enumLiteral_0= 'worlds' ) | (enumLiteral_1= 'regionals' ) | (enumLiteral_2= 'allStars' ) | (enumLiteral_3= 'promotion' ) | (enumLiteral_4= 'midSeasonInvitational' ) | (enumLiteral_5= 'riftRivals' ) | (enumLiteral_6= 'playOff' ) )
            int alt40=7;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt40=1;
                }
                break;
            case 33:
                {
                alt40=2;
                }
                break;
            case 34:
                {
                alt40=3;
                }
                break;
            case 35:
                {
                alt40=4;
                }
                break;
            case 36:
                {
                alt40=5;
                }
                break;
            case 37:
                {
                alt40=6;
                }
                break;
            case 38:
                {
                alt40=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalEsportDsl.g:2285:3: (enumLiteral_0= 'worlds' )
                    {
                    // InternalEsportDsl.g:2285:3: (enumLiteral_0= 'worlds' )
                    // InternalEsportDsl.g:2286:4: enumLiteral_0= 'worlds'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getTournamentTypeAccess().getWorldsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTournamentTypeAccess().getWorldsEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEsportDsl.g:2293:3: (enumLiteral_1= 'regionals' )
                    {
                    // InternalEsportDsl.g:2293:3: (enumLiteral_1= 'regionals' )
                    // InternalEsportDsl.g:2294:4: enumLiteral_1= 'regionals'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getTournamentTypeAccess().getRegionalsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTournamentTypeAccess().getRegionalsEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEsportDsl.g:2301:3: (enumLiteral_2= 'allStars' )
                    {
                    // InternalEsportDsl.g:2301:3: (enumLiteral_2= 'allStars' )
                    // InternalEsportDsl.g:2302:4: enumLiteral_2= 'allStars'
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getTournamentTypeAccess().getAllStarsEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTournamentTypeAccess().getAllStarsEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalEsportDsl.g:2309:3: (enumLiteral_3= 'promotion' )
                    {
                    // InternalEsportDsl.g:2309:3: (enumLiteral_3= 'promotion' )
                    // InternalEsportDsl.g:2310:4: enumLiteral_3= 'promotion'
                    {
                    enumLiteral_3=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getTournamentTypeAccess().getPromotionEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTournamentTypeAccess().getPromotionEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalEsportDsl.g:2317:3: (enumLiteral_4= 'midSeasonInvitational' )
                    {
                    // InternalEsportDsl.g:2317:3: (enumLiteral_4= 'midSeasonInvitational' )
                    // InternalEsportDsl.g:2318:4: enumLiteral_4= 'midSeasonInvitational'
                    {
                    enumLiteral_4=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getTournamentTypeAccess().getMidSeasonInvitationalEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTournamentTypeAccess().getMidSeasonInvitationalEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalEsportDsl.g:2325:3: (enumLiteral_5= 'riftRivals' )
                    {
                    // InternalEsportDsl.g:2325:3: (enumLiteral_5= 'riftRivals' )
                    // InternalEsportDsl.g:2326:4: enumLiteral_5= 'riftRivals'
                    {
                    enumLiteral_5=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getTournamentTypeAccess().getRiftRivalsEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTournamentTypeAccess().getRiftRivalsEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalEsportDsl.g:2333:3: (enumLiteral_6= 'playOff' )
                    {
                    // InternalEsportDsl.g:2333:3: (enumLiteral_6= 'playOff' )
                    // InternalEsportDsl.g:2334:4: enumLiteral_6= 'playOff'
                    {
                    enumLiteral_6=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getTournamentTypeAccess().getPlayOffEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getTournamentTypeAccess().getPlayOffEnumLiteralDeclaration_6());
                    			

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
    // $ANTLR end "ruleTournamentType"


    // $ANTLR start "ruleMatchType"
    // InternalEsportDsl.g:2344:1: ruleMatchType returns [Enumerator current=null] : ( (enumLiteral_0= 'group' ) | (enumLiteral_1= 'final' ) | (enumLiteral_2= 'semiFinal' ) | (enumLiteral_3= 'quarterFinal' ) | (enumLiteral_4= 'singleRoundElimination' ) ) ;
    public final Enumerator ruleMatchType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalEsportDsl.g:2350:2: ( ( (enumLiteral_0= 'group' ) | (enumLiteral_1= 'final' ) | (enumLiteral_2= 'semiFinal' ) | (enumLiteral_3= 'quarterFinal' ) | (enumLiteral_4= 'singleRoundElimination' ) ) )
            // InternalEsportDsl.g:2351:2: ( (enumLiteral_0= 'group' ) | (enumLiteral_1= 'final' ) | (enumLiteral_2= 'semiFinal' ) | (enumLiteral_3= 'quarterFinal' ) | (enumLiteral_4= 'singleRoundElimination' ) )
            {
            // InternalEsportDsl.g:2351:2: ( (enumLiteral_0= 'group' ) | (enumLiteral_1= 'final' ) | (enumLiteral_2= 'semiFinal' ) | (enumLiteral_3= 'quarterFinal' ) | (enumLiteral_4= 'singleRoundElimination' ) )
            int alt41=5;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt41=1;
                }
                break;
            case 40:
                {
                alt41=2;
                }
                break;
            case 41:
                {
                alt41=3;
                }
                break;
            case 42:
                {
                alt41=4;
                }
                break;
            case 43:
                {
                alt41=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalEsportDsl.g:2352:3: (enumLiteral_0= 'group' )
                    {
                    // InternalEsportDsl.g:2352:3: (enumLiteral_0= 'group' )
                    // InternalEsportDsl.g:2353:4: enumLiteral_0= 'group'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getMatchTypeAccess().getGroupEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMatchTypeAccess().getGroupEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEsportDsl.g:2360:3: (enumLiteral_1= 'final' )
                    {
                    // InternalEsportDsl.g:2360:3: (enumLiteral_1= 'final' )
                    // InternalEsportDsl.g:2361:4: enumLiteral_1= 'final'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getMatchTypeAccess().getFinalEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMatchTypeAccess().getFinalEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEsportDsl.g:2368:3: (enumLiteral_2= 'semiFinal' )
                    {
                    // InternalEsportDsl.g:2368:3: (enumLiteral_2= 'semiFinal' )
                    // InternalEsportDsl.g:2369:4: enumLiteral_2= 'semiFinal'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getMatchTypeAccess().getSemiFinalEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMatchTypeAccess().getSemiFinalEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalEsportDsl.g:2376:3: (enumLiteral_3= 'quarterFinal' )
                    {
                    // InternalEsportDsl.g:2376:3: (enumLiteral_3= 'quarterFinal' )
                    // InternalEsportDsl.g:2377:4: enumLiteral_3= 'quarterFinal'
                    {
                    enumLiteral_3=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getMatchTypeAccess().getQuarterFinalEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMatchTypeAccess().getQuarterFinalEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalEsportDsl.g:2384:3: (enumLiteral_4= 'singleRoundElimination' )
                    {
                    // InternalEsportDsl.g:2384:3: (enumLiteral_4= 'singleRoundElimination' )
                    // InternalEsportDsl.g:2385:4: enumLiteral_4= 'singleRoundElimination'
                    {
                    enumLiteral_4=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getMatchTypeAccess().getSingleRoundEliminationEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getMatchTypeAccess().getSingleRoundEliminationEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleMatchType"


    // $ANTLR start "ruleGroupStageType"
    // InternalEsportDsl.g:2395:1: ruleGroupStageType returns [Enumerator current=null] : ( (enumLiteral_0= 'league' ) | (enumLiteral_1= 'worldsPlayIn' ) | (enumLiteral_2= 'worldsGroup' ) | (enumLiteral_3= 'riftRivalsGroup' ) | (enumLiteral_4= 'msiPlayIn' ) | (enumLiteral_5= 'msiGroup' ) | (enumLiteral_6= 'allStarsGroup' ) ) ;
    public final Enumerator ruleGroupStageType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalEsportDsl.g:2401:2: ( ( (enumLiteral_0= 'league' ) | (enumLiteral_1= 'worldsPlayIn' ) | (enumLiteral_2= 'worldsGroup' ) | (enumLiteral_3= 'riftRivalsGroup' ) | (enumLiteral_4= 'msiPlayIn' ) | (enumLiteral_5= 'msiGroup' ) | (enumLiteral_6= 'allStarsGroup' ) ) )
            // InternalEsportDsl.g:2402:2: ( (enumLiteral_0= 'league' ) | (enumLiteral_1= 'worldsPlayIn' ) | (enumLiteral_2= 'worldsGroup' ) | (enumLiteral_3= 'riftRivalsGroup' ) | (enumLiteral_4= 'msiPlayIn' ) | (enumLiteral_5= 'msiGroup' ) | (enumLiteral_6= 'allStarsGroup' ) )
            {
            // InternalEsportDsl.g:2402:2: ( (enumLiteral_0= 'league' ) | (enumLiteral_1= 'worldsPlayIn' ) | (enumLiteral_2= 'worldsGroup' ) | (enumLiteral_3= 'riftRivalsGroup' ) | (enumLiteral_4= 'msiPlayIn' ) | (enumLiteral_5= 'msiGroup' ) | (enumLiteral_6= 'allStarsGroup' ) )
            int alt42=7;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt42=1;
                }
                break;
            case 45:
                {
                alt42=2;
                }
                break;
            case 46:
                {
                alt42=3;
                }
                break;
            case 47:
                {
                alt42=4;
                }
                break;
            case 48:
                {
                alt42=5;
                }
                break;
            case 49:
                {
                alt42=6;
                }
                break;
            case 50:
                {
                alt42=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalEsportDsl.g:2403:3: (enumLiteral_0= 'league' )
                    {
                    // InternalEsportDsl.g:2403:3: (enumLiteral_0= 'league' )
                    // InternalEsportDsl.g:2404:4: enumLiteral_0= 'league'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getGroupStageTypeAccess().getLeagueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getGroupStageTypeAccess().getLeagueEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEsportDsl.g:2411:3: (enumLiteral_1= 'worldsPlayIn' )
                    {
                    // InternalEsportDsl.g:2411:3: (enumLiteral_1= 'worldsPlayIn' )
                    // InternalEsportDsl.g:2412:4: enumLiteral_1= 'worldsPlayIn'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getGroupStageTypeAccess().getWorldsPlayInEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getGroupStageTypeAccess().getWorldsPlayInEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEsportDsl.g:2419:3: (enumLiteral_2= 'worldsGroup' )
                    {
                    // InternalEsportDsl.g:2419:3: (enumLiteral_2= 'worldsGroup' )
                    // InternalEsportDsl.g:2420:4: enumLiteral_2= 'worldsGroup'
                    {
                    enumLiteral_2=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getGroupStageTypeAccess().getWorldsGroupEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getGroupStageTypeAccess().getWorldsGroupEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalEsportDsl.g:2427:3: (enumLiteral_3= 'riftRivalsGroup' )
                    {
                    // InternalEsportDsl.g:2427:3: (enumLiteral_3= 'riftRivalsGroup' )
                    // InternalEsportDsl.g:2428:4: enumLiteral_3= 'riftRivalsGroup'
                    {
                    enumLiteral_3=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getGroupStageTypeAccess().getRiftRivalsGroupEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getGroupStageTypeAccess().getRiftRivalsGroupEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalEsportDsl.g:2435:3: (enumLiteral_4= 'msiPlayIn' )
                    {
                    // InternalEsportDsl.g:2435:3: (enumLiteral_4= 'msiPlayIn' )
                    // InternalEsportDsl.g:2436:4: enumLiteral_4= 'msiPlayIn'
                    {
                    enumLiteral_4=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getGroupStageTypeAccess().getMsiPlayInEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getGroupStageTypeAccess().getMsiPlayInEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalEsportDsl.g:2443:3: (enumLiteral_5= 'msiGroup' )
                    {
                    // InternalEsportDsl.g:2443:3: (enumLiteral_5= 'msiGroup' )
                    // InternalEsportDsl.g:2444:4: enumLiteral_5= 'msiGroup'
                    {
                    enumLiteral_5=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getGroupStageTypeAccess().getMsiGroupEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getGroupStageTypeAccess().getMsiGroupEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalEsportDsl.g:2451:3: (enumLiteral_6= 'allStarsGroup' )
                    {
                    // InternalEsportDsl.g:2451:3: (enumLiteral_6= 'allStarsGroup' )
                    // InternalEsportDsl.g:2452:4: enumLiteral_6= 'allStarsGroup'
                    {
                    enumLiteral_6=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getGroupStageTypeAccess().getAllStarsGroupEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getGroupStageTypeAccess().getAllStarsGroupEnumLiteralDeclaration_6());
                    			

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
    // $ANTLR end "ruleGroupStageType"


    // $ANTLR start "ruleSeason"
    // InternalEsportDsl.g:2462:1: ruleSeason returns [Enumerator current=null] : ( (enumLiteral_0= 'spring' ) | (enumLiteral_1= 'summer' ) ) ;
    public final Enumerator ruleSeason() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalEsportDsl.g:2468:2: ( ( (enumLiteral_0= 'spring' ) | (enumLiteral_1= 'summer' ) ) )
            // InternalEsportDsl.g:2469:2: ( (enumLiteral_0= 'spring' ) | (enumLiteral_1= 'summer' ) )
            {
            // InternalEsportDsl.g:2469:2: ( (enumLiteral_0= 'spring' ) | (enumLiteral_1= 'summer' ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==51) ) {
                alt43=1;
            }
            else if ( (LA43_0==52) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalEsportDsl.g:2470:3: (enumLiteral_0= 'spring' )
                    {
                    // InternalEsportDsl.g:2470:3: (enumLiteral_0= 'spring' )
                    // InternalEsportDsl.g:2471:4: enumLiteral_0= 'spring'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getSeasonAccess().getSpringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSeasonAccess().getSpringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEsportDsl.g:2478:3: (enumLiteral_1= 'summer' )
                    {
                    // InternalEsportDsl.g:2478:3: (enumLiteral_1= 'summer' )
                    // InternalEsportDsl.g:2479:4: enumLiteral_1= 'summer'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getSeasonAccess().getSummerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSeasonAccess().getSummerEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleSeason"


    // $ANTLR start "rulePosition"
    // InternalEsportDsl.g:2489:1: rulePosition returns [Enumerator current=null] : ( (enumLiteral_0= 'attackDamageCarry' ) | (enumLiteral_1= 'support' ) | (enumLiteral_2= 'midLane' ) | (enumLiteral_3= 'topLane' ) | (enumLiteral_4= 'jungle' ) ) ;
    public final Enumerator rulePosition() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalEsportDsl.g:2495:2: ( ( (enumLiteral_0= 'attackDamageCarry' ) | (enumLiteral_1= 'support' ) | (enumLiteral_2= 'midLane' ) | (enumLiteral_3= 'topLane' ) | (enumLiteral_4= 'jungle' ) ) )
            // InternalEsportDsl.g:2496:2: ( (enumLiteral_0= 'attackDamageCarry' ) | (enumLiteral_1= 'support' ) | (enumLiteral_2= 'midLane' ) | (enumLiteral_3= 'topLane' ) | (enumLiteral_4= 'jungle' ) )
            {
            // InternalEsportDsl.g:2496:2: ( (enumLiteral_0= 'attackDamageCarry' ) | (enumLiteral_1= 'support' ) | (enumLiteral_2= 'midLane' ) | (enumLiteral_3= 'topLane' ) | (enumLiteral_4= 'jungle' ) )
            int alt44=5;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt44=1;
                }
                break;
            case 54:
                {
                alt44=2;
                }
                break;
            case 55:
                {
                alt44=3;
                }
                break;
            case 56:
                {
                alt44=4;
                }
                break;
            case 57:
                {
                alt44=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalEsportDsl.g:2497:3: (enumLiteral_0= 'attackDamageCarry' )
                    {
                    // InternalEsportDsl.g:2497:3: (enumLiteral_0= 'attackDamageCarry' )
                    // InternalEsportDsl.g:2498:4: enumLiteral_0= 'attackDamageCarry'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getPositionAccess().getAttackDamageCarryEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPositionAccess().getAttackDamageCarryEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEsportDsl.g:2505:3: (enumLiteral_1= 'support' )
                    {
                    // InternalEsportDsl.g:2505:3: (enumLiteral_1= 'support' )
                    // InternalEsportDsl.g:2506:4: enumLiteral_1= 'support'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getPositionAccess().getSupportEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPositionAccess().getSupportEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEsportDsl.g:2513:3: (enumLiteral_2= 'midLane' )
                    {
                    // InternalEsportDsl.g:2513:3: (enumLiteral_2= 'midLane' )
                    // InternalEsportDsl.g:2514:4: enumLiteral_2= 'midLane'
                    {
                    enumLiteral_2=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getPositionAccess().getMidLaneEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPositionAccess().getMidLaneEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalEsportDsl.g:2521:3: (enumLiteral_3= 'topLane' )
                    {
                    // InternalEsportDsl.g:2521:3: (enumLiteral_3= 'topLane' )
                    // InternalEsportDsl.g:2522:4: enumLiteral_3= 'topLane'
                    {
                    enumLiteral_3=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getPositionAccess().getTopLaneEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPositionAccess().getTopLaneEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalEsportDsl.g:2529:3: (enumLiteral_4= 'jungle' )
                    {
                    // InternalEsportDsl.g:2529:3: (enumLiteral_4= 'jungle' )
                    // InternalEsportDsl.g:2530:4: enumLiteral_4= 'jungle'
                    {
                    enumLiteral_4=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getPositionAccess().getJungleEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPositionAccess().getJungleEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "rulePosition"


    // $ANTLR start "ruleCapacityType"
    // InternalEsportDsl.g:2540:1: ruleCapacityType returns [Enumerator current=null] : ( (enumLiteral_0= 'positioning' ) | (enumLiteral_1= 'stressManagement' ) | (enumLiteral_2= 'playmakingMechanics' ) | (enumLiteral_3= 'escapeMechanics' ) | (enumLiteral_4= 'patience' ) | (enumLiteral_5= 'farm' ) | (enumLiteral_6= 'steal' ) | (enumLiteral_7= 'splitPush' ) | (enumLiteral_8= 'teamPlay' ) | (enumLiteral_9= 'aggressivity' ) | (enumLiteral_10= 'leadership' ) | (enumLiteral_11= 'draft' ) | (enumLiteral_12= 'pathing' ) | (enumLiteral_13= 'awareness' ) | (enumLiteral_14= 'experience' ) | (enumLiteral_15= 'objectivePlay' ) | (enumLiteral_16= 'metaGame' ) ) ;
    public final Enumerator ruleCapacityType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;
        Token enumLiteral_16=null;


        	enterRule();

        try {
            // InternalEsportDsl.g:2546:2: ( ( (enumLiteral_0= 'positioning' ) | (enumLiteral_1= 'stressManagement' ) | (enumLiteral_2= 'playmakingMechanics' ) | (enumLiteral_3= 'escapeMechanics' ) | (enumLiteral_4= 'patience' ) | (enumLiteral_5= 'farm' ) | (enumLiteral_6= 'steal' ) | (enumLiteral_7= 'splitPush' ) | (enumLiteral_8= 'teamPlay' ) | (enumLiteral_9= 'aggressivity' ) | (enumLiteral_10= 'leadership' ) | (enumLiteral_11= 'draft' ) | (enumLiteral_12= 'pathing' ) | (enumLiteral_13= 'awareness' ) | (enumLiteral_14= 'experience' ) | (enumLiteral_15= 'objectivePlay' ) | (enumLiteral_16= 'metaGame' ) ) )
            // InternalEsportDsl.g:2547:2: ( (enumLiteral_0= 'positioning' ) | (enumLiteral_1= 'stressManagement' ) | (enumLiteral_2= 'playmakingMechanics' ) | (enumLiteral_3= 'escapeMechanics' ) | (enumLiteral_4= 'patience' ) | (enumLiteral_5= 'farm' ) | (enumLiteral_6= 'steal' ) | (enumLiteral_7= 'splitPush' ) | (enumLiteral_8= 'teamPlay' ) | (enumLiteral_9= 'aggressivity' ) | (enumLiteral_10= 'leadership' ) | (enumLiteral_11= 'draft' ) | (enumLiteral_12= 'pathing' ) | (enumLiteral_13= 'awareness' ) | (enumLiteral_14= 'experience' ) | (enumLiteral_15= 'objectivePlay' ) | (enumLiteral_16= 'metaGame' ) )
            {
            // InternalEsportDsl.g:2547:2: ( (enumLiteral_0= 'positioning' ) | (enumLiteral_1= 'stressManagement' ) | (enumLiteral_2= 'playmakingMechanics' ) | (enumLiteral_3= 'escapeMechanics' ) | (enumLiteral_4= 'patience' ) | (enumLiteral_5= 'farm' ) | (enumLiteral_6= 'steal' ) | (enumLiteral_7= 'splitPush' ) | (enumLiteral_8= 'teamPlay' ) | (enumLiteral_9= 'aggressivity' ) | (enumLiteral_10= 'leadership' ) | (enumLiteral_11= 'draft' ) | (enumLiteral_12= 'pathing' ) | (enumLiteral_13= 'awareness' ) | (enumLiteral_14= 'experience' ) | (enumLiteral_15= 'objectivePlay' ) | (enumLiteral_16= 'metaGame' ) )
            int alt45=17;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt45=1;
                }
                break;
            case 59:
                {
                alt45=2;
                }
                break;
            case 60:
                {
                alt45=3;
                }
                break;
            case 61:
                {
                alt45=4;
                }
                break;
            case 62:
                {
                alt45=5;
                }
                break;
            case 63:
                {
                alt45=6;
                }
                break;
            case 64:
                {
                alt45=7;
                }
                break;
            case 65:
                {
                alt45=8;
                }
                break;
            case 66:
                {
                alt45=9;
                }
                break;
            case 67:
                {
                alt45=10;
                }
                break;
            case 68:
                {
                alt45=11;
                }
                break;
            case 69:
                {
                alt45=12;
                }
                break;
            case 70:
                {
                alt45=13;
                }
                break;
            case 71:
                {
                alt45=14;
                }
                break;
            case 72:
                {
                alt45=15;
                }
                break;
            case 73:
                {
                alt45=16;
                }
                break;
            case 74:
                {
                alt45=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalEsportDsl.g:2548:3: (enumLiteral_0= 'positioning' )
                    {
                    // InternalEsportDsl.g:2548:3: (enumLiteral_0= 'positioning' )
                    // InternalEsportDsl.g:2549:4: enumLiteral_0= 'positioning'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getCapacityTypeAccess().getPositioningEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCapacityTypeAccess().getPositioningEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEsportDsl.g:2556:3: (enumLiteral_1= 'stressManagement' )
                    {
                    // InternalEsportDsl.g:2556:3: (enumLiteral_1= 'stressManagement' )
                    // InternalEsportDsl.g:2557:4: enumLiteral_1= 'stressManagement'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getCapacityTypeAccess().getStressManagementEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCapacityTypeAccess().getStressManagementEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEsportDsl.g:2564:3: (enumLiteral_2= 'playmakingMechanics' )
                    {
                    // InternalEsportDsl.g:2564:3: (enumLiteral_2= 'playmakingMechanics' )
                    // InternalEsportDsl.g:2565:4: enumLiteral_2= 'playmakingMechanics'
                    {
                    enumLiteral_2=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getCapacityTypeAccess().getPlaymakingMechanicsEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCapacityTypeAccess().getPlaymakingMechanicsEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalEsportDsl.g:2572:3: (enumLiteral_3= 'escapeMechanics' )
                    {
                    // InternalEsportDsl.g:2572:3: (enumLiteral_3= 'escapeMechanics' )
                    // InternalEsportDsl.g:2573:4: enumLiteral_3= 'escapeMechanics'
                    {
                    enumLiteral_3=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getCapacityTypeAccess().getEscapeMechanicsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCapacityTypeAccess().getEscapeMechanicsEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalEsportDsl.g:2580:3: (enumLiteral_4= 'patience' )
                    {
                    // InternalEsportDsl.g:2580:3: (enumLiteral_4= 'patience' )
                    // InternalEsportDsl.g:2581:4: enumLiteral_4= 'patience'
                    {
                    enumLiteral_4=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getCapacityTypeAccess().getPatienceEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getCapacityTypeAccess().getPatienceEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalEsportDsl.g:2588:3: (enumLiteral_5= 'farm' )
                    {
                    // InternalEsportDsl.g:2588:3: (enumLiteral_5= 'farm' )
                    // InternalEsportDsl.g:2589:4: enumLiteral_5= 'farm'
                    {
                    enumLiteral_5=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getCapacityTypeAccess().getFarmEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getCapacityTypeAccess().getFarmEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalEsportDsl.g:2596:3: (enumLiteral_6= 'steal' )
                    {
                    // InternalEsportDsl.g:2596:3: (enumLiteral_6= 'steal' )
                    // InternalEsportDsl.g:2597:4: enumLiteral_6= 'steal'
                    {
                    enumLiteral_6=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getCapacityTypeAccess().getStealEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getCapacityTypeAccess().getStealEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalEsportDsl.g:2604:3: (enumLiteral_7= 'splitPush' )
                    {
                    // InternalEsportDsl.g:2604:3: (enumLiteral_7= 'splitPush' )
                    // InternalEsportDsl.g:2605:4: enumLiteral_7= 'splitPush'
                    {
                    enumLiteral_7=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getCapacityTypeAccess().getSplitPushEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getCapacityTypeAccess().getSplitPushEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalEsportDsl.g:2612:3: (enumLiteral_8= 'teamPlay' )
                    {
                    // InternalEsportDsl.g:2612:3: (enumLiteral_8= 'teamPlay' )
                    // InternalEsportDsl.g:2613:4: enumLiteral_8= 'teamPlay'
                    {
                    enumLiteral_8=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getCapacityTypeAccess().getTeamPlayEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getCapacityTypeAccess().getTeamPlayEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalEsportDsl.g:2620:3: (enumLiteral_9= 'aggressivity' )
                    {
                    // InternalEsportDsl.g:2620:3: (enumLiteral_9= 'aggressivity' )
                    // InternalEsportDsl.g:2621:4: enumLiteral_9= 'aggressivity'
                    {
                    enumLiteral_9=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getCapacityTypeAccess().getAggressivityEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getCapacityTypeAccess().getAggressivityEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalEsportDsl.g:2628:3: (enumLiteral_10= 'leadership' )
                    {
                    // InternalEsportDsl.g:2628:3: (enumLiteral_10= 'leadership' )
                    // InternalEsportDsl.g:2629:4: enumLiteral_10= 'leadership'
                    {
                    enumLiteral_10=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getCapacityTypeAccess().getLeadershipEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getCapacityTypeAccess().getLeadershipEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalEsportDsl.g:2636:3: (enumLiteral_11= 'draft' )
                    {
                    // InternalEsportDsl.g:2636:3: (enumLiteral_11= 'draft' )
                    // InternalEsportDsl.g:2637:4: enumLiteral_11= 'draft'
                    {
                    enumLiteral_11=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getCapacityTypeAccess().getDraftEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getCapacityTypeAccess().getDraftEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalEsportDsl.g:2644:3: (enumLiteral_12= 'pathing' )
                    {
                    // InternalEsportDsl.g:2644:3: (enumLiteral_12= 'pathing' )
                    // InternalEsportDsl.g:2645:4: enumLiteral_12= 'pathing'
                    {
                    enumLiteral_12=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getCapacityTypeAccess().getPathingEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getCapacityTypeAccess().getPathingEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalEsportDsl.g:2652:3: (enumLiteral_13= 'awareness' )
                    {
                    // InternalEsportDsl.g:2652:3: (enumLiteral_13= 'awareness' )
                    // InternalEsportDsl.g:2653:4: enumLiteral_13= 'awareness'
                    {
                    enumLiteral_13=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getCapacityTypeAccess().getAwarenessEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getCapacityTypeAccess().getAwarenessEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalEsportDsl.g:2660:3: (enumLiteral_14= 'experience' )
                    {
                    // InternalEsportDsl.g:2660:3: (enumLiteral_14= 'experience' )
                    // InternalEsportDsl.g:2661:4: enumLiteral_14= 'experience'
                    {
                    enumLiteral_14=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getCapacityTypeAccess().getExperienceEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getCapacityTypeAccess().getExperienceEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalEsportDsl.g:2668:3: (enumLiteral_15= 'objectivePlay' )
                    {
                    // InternalEsportDsl.g:2668:3: (enumLiteral_15= 'objectivePlay' )
                    // InternalEsportDsl.g:2669:4: enumLiteral_15= 'objectivePlay'
                    {
                    enumLiteral_15=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getCapacityTypeAccess().getObjectivePlayEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getCapacityTypeAccess().getObjectivePlayEnumLiteralDeclaration_15());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalEsportDsl.g:2676:3: (enumLiteral_16= 'metaGame' )
                    {
                    // InternalEsportDsl.g:2676:3: (enumLiteral_16= 'metaGame' )
                    // InternalEsportDsl.g:2677:4: enumLiteral_16= 'metaGame'
                    {
                    enumLiteral_16=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getCapacityTypeAccess().getMetaGameEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_16, grammarAccess.getCapacityTypeAccess().getMetaGameEnumLiteralDeclaration_16());
                    			

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
    // $ANTLR end "ruleCapacityType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000060790802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000006079C800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000007F00000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000062002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000042002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004002032L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004002002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000060002000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0007F00000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000802042L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000F8000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x03E0000000002032L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000002032L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0xFC00000000000000L,0x00000000000007FFL});

}