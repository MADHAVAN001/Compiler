package parser;

import beaver.*;
import java.util.ArrayList;

/**
 * This class is a LALR parser generated by
 * <a href="http://beaver.sourceforge.net">Beaver</a> v0.9.6.1
 * from the grammar specification "parser.beaver".
 */
public class Parser extends beaver.Parser {
	static public class Terminals {
		static public final short EOF = 0;
		static public final short ID = 1;
		static public final short LBRACKET = 2;
		static public final short LPAREN = 3;
		static public final short MINUS = 4;
		static public final short STRING_LITERAL = 5;
		static public final short TRUE = 6;
		static public final short FALSE = 7;
		static public final short INT_LITERAL = 8;
		static public final short RPAREN = 9;
		static public final short RCURLY = 10;
		static public final short INT = 11;
		static public final short VOID = 12;
		static public final short BOOLEAN = 13;
		static public final short SEMICOLON = 14;
		static public final short LCURLY = 15;
		static public final short IF = 16;
		static public final short WHILE = 17;
		static public final short RETURN = 18;
		static public final short BREAK = 19;
		static public final short RBRACKET = 20;
		static public final short COMMA = 21;
		static public final short PUBLIC = 22;
		static public final short IMPORT = 23;
		static public final short PLUS = 24;
		static public final short TIMES = 25;
		static public final short DIV = 26;
		static public final short MOD = 27;
		static public final short EQL = 28;
		static public final short MODULE = 29;
		static public final short ELSE = 30;
		static public final short TYPE = 31;
		static public final short EQEQ = 32;
		static public final short NEQ = 33;
		static public final short LEQ = 34;
		static public final short GEQ = 35;
		static public final short LT = 36;
		static public final short GT = 37;
	}
	static public class AltGoals {
		static public final short Dummy = 38;
	}

	static final ParsingTables PARSING_TABLES = new ParsingTables(
		"U9pDbmTq55KKXl#PJGARGAWna8G0eQH080YX9dH2211w2RrtfGeg5cmK2s11nOuYlJS51HN" +
		"1WjWBWYWeAb84E$RhFszUDiDcizdr78vcppVttJl$ws$VtW3cNDo84RWMLs0ERi9iZ4OMXc" +
		"4uid4$bg8bMgCDsg8TsgC3CeBGjWf2syMljkT5Md$AtW4hyovIFe85c8k9k1ctuZRS8YB7i" +
		"GoFumc4eZDoqGU3CC1RXP1ybVpjHnNcQQk47zKYcBgj5NvK9R5Gj#KkMYNdyO1MXJjKtgin" +
		"Iws6TtIeYiuiKdsb9peECz1OhUKrk0xNumOvXuSmEC1#kglexONY$NogH$cCJl4PdQUYqxn" +
		"MpXxXjtXKtl5#9siBgOlp5nMhI4KADdEt9ZXMp8N5k1ltOWdkmNr1zncixzohsRWBwV8h8a" +
		"Wzha8QfYCTbwCX6g41Dj7VXDNQd#IePv#YrLYfzbbR#GfZzPl9sgv5Kpc19p46Tz8#ZMROW" +
		"bAS$ngKndAKGJb4qfP5ULJ0I5H45A9n6QgX4k9G6R68GNKae0PgeXPg8n5La8HuMObar45L" +
		"r9M$K1zRvJSqGISqHmjaokVeXMxeY$7eWOx8GLUEfJy6SbxZSPMimn1vbwESZwUm0gkm3bF" +
		"bQ$aIsx01LmEu0m$YOJm6#syZjlEvbQndtqdiDONzrkKUrcE$QLmXUsNIUTwRe2bdPuqXut" +
		"#WlHHAWpUH2o6y#S9uOvNageGZWhjPchjIXdjOJksYjohNeu8VLOH7LSgFAeIxQQjw#56Lv" +
		"UcnLV5#L9PlgyevLBvNmtSqCo1rTxsMcJpFCJpHLh$TBa4$$oRglIO58umizCxjSmNz#I75" +
		"AjhmvBJZRZb7LvlV$eBlVB1z1kjxhqjBdiFof2sLxQbioJiactTBMzvAxOcXVMSz#nGPUf$" +
		"phPjvZlqc$vnLPNjkvXITcTLODeVphy3vH$9T5CTJakr7SLIXR2EEwcYEinBNe3BN8uQh4i" +
		"kMt5I4yxn6ygvCO7ir#AsAexucOzRtCPeO$BZfX$CJJusB6OsRDIBfcwfaH#nOAzeiVgnQ5" +
		"LNKu0YYHEYfZwW$IyjdD8bZJplcg0lIMCZ70ZALB2FBoIgodpnFZb9p0Z0haUg4TSqKaagI" +
		"IHf99vL90k5ypCQa9gb5QfDgf0f994ca3eachKbpKf#q84r8CzA8T2GDI1VIbRGX6HpBQTf" +
		"iqeFbixGvrZpoeM#ItgGguOgQkQIJ$ThiPcluEmspkxEULnizjUr3UkawArZkh#DvxDjgho" +
		"#TdRIPj0Vrkm5yDvzs89rZEjPFh$LubWVfs617Vx5yjrXhbcYxbF26DfPfVvT3Fvp#NjeXs" +
		"Xz9VnRjKEqF8oCOEr1GnyWhQhw5vs#yn$gZTFa8owDr#Gi#zXHV7oTPPuokOvs7iRfyWULn" +
		"XVLc39b0Af1uCf5CrdLcQCqKOgqVpwavpL5tahOpo7J766PgcnlelFyhx7DXR7VukmjhSCR" +
		"n$bX#cL$hmuxo#U3xHgZNM29qF5RRDCUxQ1thuDN68JzpIz3sYDQUi$VOcAVZnxtqgLvj7$" +
		"GnvXC5PJCnyBaQJHrbPtoVTPy5saxW$Pb9kdth$amEhgvnoiUyT#0I$SaVyfsoVCe5#KL#B" +
		"gJuIJsFoMVogHoLJuJtWXnMiO$Lyv17#H7vqEDzGDvN9TugyhQy9Sp8vKrvLLwdVO7mLqQU" +
		"aHrMdAK3Sb3PzMGrMILlo8koItRAi$ASR9EjiaKsooRPg5GRr7CDUKtso6vvHVRBFdbPzif" +
		"BwiqfzVp6QbDEobav8wSlcXLlDFdHu$qWttCb$bJbt$d8OvPg49DPQnX$wqq2$jwxc4sO1C" +
		"me30yT#SkRZH3c5c7CEWm2PXA6XuOE6h6DV7BOLWwrMIndqNQWdw40ytUZ24nczYxczYvcz" +
		"w6a17FyK6Rv9lDy5$DJWu1Peg58Ooo9rYAPOsn0NMS5cCiOFgcdS36$C1IfBAVIjdQGo3OI" +
		"QLFyucAM5S8ysY1WlkLYHcmG5$#tg8MU$m21kDMO");

	static final Action RETURN2 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 2];
		}
	};

	static final Action RETURN6 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 6];
		}
	};

	static final Action RETURN3 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 3];
		}
	};

	static final Action RETURN9 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 9];
		}
	};

	static final Action RETURN4 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 4];
		}
	};

	static final Action RETURN5 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 5];
		}
	};

	static final Action RETURN7 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 7];
		}
	};

	static final Action RETURN37 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 37];
		}
	};

	// turn off automated error recovery
	@Override
	protected void recoverFromError(Symbol token, TokenStream in) throws java.io.IOException, Exception {
		super.recoverFromError(new Symbol(0), in);
	}

	private final Action[] actions;

	public Parser() {
		super(PARSING_TABLES);
		actions = new Action[] {
			Action.RETURN,	// [0] $goal = Module
			RETURN2,	// [1] $goal = $Dummy Dummy; returns 'Dummy' although none is marked
			RETURN6,	// [2] Module = MODULE ID LCURLY Imports Declarations RCURLY; returns 'RCURLY' although none is marked
			RETURN2,	// [3] Imports = Import Imports; returns 'Imports' although none is marked
			Action.NONE,  	// [4] Imports = 
			RETURN3,	// [5] Import = IMPORT ID SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN2,	// [6] Declarations = Declaration Declarations; returns 'Declarations' although none is marked
			Action.NONE,  	// [7] Declarations = 
			Action.RETURN,	// [8] Declaration = FunctionDeclaration
			Action.RETURN,	// [9] Declaration = FieldDeclaration
			Action.RETURN,	// [10] Declaration = TypeDeclaration
			RETURN9,	// [11] FunctionDeclaration = AccessibilitySpecifier TypeName ID LPAREN ParameterList RPAREN LCURLY StatementList RCURLY; returns 'RCURLY' although none is marked
			RETURN4,	// [12] FieldDeclaration = AccessibilitySpecifier TypeName ID SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN6,	// [13] TypeDeclaration = AccessibilitySpecifier TYPE ID EQL STRING_LITERAL SEMICOLON; returns 'SEMICOLON' although none is marked
			Action.RETURN,	// [14] AccessibilitySpecifier = PUBLIC
			Action.NONE,  	// [15] AccessibilitySpecifier = 
			Action.RETURN,	// [16] TypeName = PrimitiveType
			Action.RETURN,	// [17] TypeName = ArrayType
			Action.RETURN,	// [18] TypeName = ID
			Action.RETURN,	// [19] PrimitiveType = VOID
			Action.RETURN,	// [20] PrimitiveType = BOOLEAN
			Action.RETURN,	// [21] PrimitiveType = INT
			RETURN3,	// [22] ArrayType = PrimitiveType LBRACKET RBRACKET; returns 'RBRACKET' although none is marked
			RETURN3,	// [23] ArrayType = ArrayType LBRACKET RBRACKET; returns 'RBRACKET' although none is marked
			RETURN3,	// [24] ArrayType = ID LBRACKET RBRACKET; returns 'RBRACKET' although none is marked
			RETURN2,	// [25] ParameterList = Parameter ParameterTail; returns 'ParameterTail' although none is marked
			Action.NONE,  	// [26] ParameterList = 
			RETURN3,	// [27] ParameterTail = COMMA Parameter ParameterTail; returns 'ParameterTail' although none is marked
			Action.NONE,  	// [28] ParameterTail = 
			RETURN2,	// [29] Parameter = TypeName ID; returns 'ID' although none is marked
			RETURN2,	// [30] StatementList = Statement StatementList; returns 'StatementList' although none is marked
			Action.NONE,  	// [31] StatementList = 
			Action.RETURN,	// [32] Statement = VariableDeclaration
			Action.RETURN,	// [33] Statement = StatementBlock
			Action.RETURN,	// [34] Statement = IfStatement
			Action.RETURN,	// [35] Statement = WhileStatement
			Action.RETURN,	// [36] Statement = BreakStatement
			Action.RETURN,	// [37] Statement = ReturnStatement
			RETURN2,	// [38] Statement = Expression SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN3,	// [39] VariableDeclaration = TypeName ID SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN3,	// [40] StatementBlock = LCURLY StatementList RCURLY; returns 'RCURLY' although none is marked
			RETURN5,	// [41] IfStatement = IF LPAREN Expression RPAREN Statement; returns 'Statement' although none is marked
			RETURN7,	// [42] IfStatement = IF LPAREN Expression RPAREN Statement ELSE Statement; returns 'Statement' although none is marked
			RETURN5,	// [43] WhileStatement = WHILE LPAREN Expression RPAREN Statement; returns 'Statement' although none is marked
			RETURN2,	// [44] BreakStatement = BREAK SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN3,	// [45] ReturnStatement = RETURN OptionalExpression SEMICOLON; returns 'SEMICOLON' although none is marked
			Action.RETURN,	// [46] OptionalExpression = Expression
			Action.NONE,  	// [47] OptionalExpression = 
			Action.RETURN,	// [48] Expression = Assignment
			Action.RETURN,	// [49] Expression = RHS
			RETURN3,	// [50] Assignment = LHS EQL Expression; returns 'Expression' although none is marked
			Action.RETURN,	// [51] LHS = ID
			Action.RETURN,	// [52] LHS = ArrayAccess
			RETURN4,	// [53] ArrayAccess = LHS LBRACKET Expression RBRACKET; returns 'RBRACKET' although none is marked
			RETURN2,	// [54] RHS = ArithmeticExpression ArithmeticTail; returns 'ArithmeticTail' although none is marked
			RETURN2,	// [55] ArithmeticTail = ComparisonOperator ArithmeticExpression; returns 'ArithmeticExpression' although none is marked
			Action.NONE,  	// [56] ArithmeticTail = 
			Action.RETURN,	// [57] ComparisonOperator = EQEQ
			Action.RETURN,	// [58] ComparisonOperator = NEQ
			Action.RETURN,	// [59] ComparisonOperator = LT
			Action.RETURN,	// [60] ComparisonOperator = LEQ
			Action.RETURN,	// [61] ComparisonOperator = GT
			Action.RETURN,	// [62] ComparisonOperator = GEQ
			new Action() {	// [63] ArithmeticExpression = Term
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1]); return new Symbol(lst);
				}
			},
			new Action() {	// [64] ArithmeticExpression = ArithmeticExpression AdditiveOperator Term
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 3]); return _symbols[offset + 1];
				}
			},
			Action.RETURN,	// [65] AdditiveOperator = PLUS
			Action.RETURN,	// [66] AdditiveOperator = MINUS
			new Action() {	// [67] Term = Term MultiplicativeOperator Factor
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 3]); return _symbols[offset + 1];
				}
			},
			new Action() {	// [68] Term = Factor
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1]); return new Symbol(lst);
				}
			},
			Action.RETURN,	// [69] MultiplicativeOperator = TIMES
			Action.RETURN,	// [70] MultiplicativeOperator = DIV
			Action.RETURN,	// [71] MultiplicativeOperator = MOD
			RETURN2,	// [72] Factor = MINUS Factor; returns 'Factor' although none is marked
			Action.RETURN,	// [73] Factor = PrimaryExpression
			Action.RETURN,	// [74] PrimaryExpression = LHS
			Action.RETURN,	// [75] PrimaryExpression = FunctionCall
			Action.RETURN,	// [76] PrimaryExpression = ArrayExpression
			Action.RETURN,	// [77] PrimaryExpression = STRING_LITERAL
			Action.RETURN,	// [78] PrimaryExpression = INT_LITERAL
			Action.RETURN,	// [79] PrimaryExpression = TRUE
			Action.RETURN,	// [80] PrimaryExpression = FALSE
			RETURN3,	// [81] PrimaryExpression = LPAREN Expression RPAREN; returns 'RPAREN' although none is marked
			RETURN4,	// [82] FunctionCall = ID LPAREN ExpressionList RPAREN; returns 'RPAREN' although none is marked
			Action.RETURN,	// [83] ExpressionList = NExpressionList
			Action.NONE,  	// [84] ExpressionList = 
			RETURN3,	// [85] ArrayExpression = LBRACKET NExpressionList RBRACKET; returns 'RBRACKET' although none is marked
			Action.RETURN,	// [86] NExpressionList = Expression
			RETURN3,	// [87] NExpressionList = Expression COMMA NExpressionList; returns 'NExpressionList' although none is marked
			RETURN37	// [88] Dummy = MODULE INT VOID IF ELSE WHILE RETURN BREAK BOOLEAN PUBLIC TRUE FALSE INT_LITERAL STRING_LITERAL ID TYPE IMPORT PLUS MINUS TIMES DIV MOD EQEQ NEQ LEQ GEQ LT GT LBRACKET RPAREN COMMA RCURLY LCURLY SEMICOLON RBRACKET LPAREN EQL; returns 'EQL' although none is marked
		};
	}

	protected Symbol invokeReduceAction(int rule_num, int offset) {
		return actions[rule_num].reduce(_symbols, offset);
	}
}
