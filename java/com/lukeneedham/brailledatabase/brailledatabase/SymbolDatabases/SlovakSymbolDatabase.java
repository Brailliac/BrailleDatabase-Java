package com.lukeneedham.brailledatabase.Braille.SymbolDatabases;

import com.lukeneedham.brailledatabase.Braille.BrailleSymbolDataEntry;
import com.lukeneedham.brailledatabase.Braille.DictionaryCategory;
import com.lukeneedham.brailledatabase.R;

import static com.lukeneedham.brailledatabase.Braille.BrailleCellDatabase.*;

import static com.lukeneedham.brailledatabase.Braille.BrailleSymbolDataEntry.OnEntryClickType.NOTHING;
import static com.lukeneedham.brailledatabase.Braille.BrailleSymbolDataEntry.OnEntryClickType.SHOW_INFO;
import static com.lukeneedham.brailledatabase.Braille.BrailleSymbolDataEntry.OnEntryClickType.SHOW_LETTERS_REP;
import static com.lukeneedham.brailledatabase.Braille.BrailleSymbolType.INVISIBLE;
import static com.lukeneedham.brailledatabase.Braille.BrailleSymbolType.LETTER;
import static com.lukeneedham.brailledatabase.Braille.BrailleSymbolType.NUMBER;
import static com.lukeneedham.brailledatabase.Braille.BrailleSymbolType.PUNCTUATION;

public class SlovakSymbolDatabase extends BrailleSymbolDatabase
{
	/**
	 * make the array of all the entries in the database
	 * for each entry, make a new BrailleSymbolDataEntry object, and pass the relevant paramaters
	 * the available BrailleSymbolDataEntry constructors and neccessary paramaters can be seen in BrailleSymbolDataEntry.java
	 * the last paramter is BrailleCell... (ie varargs of BrailleCells, more here: http://stackoverflow.com/questions/1656901/varargs-and-the-argument if you need it)
	 * the cells are named after what they mean alone in UEB - cells with no independent meaning are named like 'Cell456' - the names be looked up with the search function in the app, or in BrailleCellDatabase.java
	 */

	private static final BrailleSymbolDataEntry[] allSymbols = {

			new BrailleSymbolDataEntry("a", LETTER, NOTHING, Cell1),
			new BrailleSymbolDataEntry("b", LETTER, NOTHING, Cell12),
			new BrailleSymbolDataEntry("c", LETTER, NOTHING, Cell14),
			new BrailleSymbolDataEntry("d", LETTER, NOTHING, Cell145),
			new BrailleSymbolDataEntry("e", LETTER, NOTHING, Cell15),
			new BrailleSymbolDataEntry("f", LETTER, NOTHING, Cell124),
			new BrailleSymbolDataEntry("g", LETTER, NOTHING, Cell1245),
			new BrailleSymbolDataEntry("h", LETTER, NOTHING, Cell125),
			new BrailleSymbolDataEntry("i", LETTER, NOTHING, Cell24),
			new BrailleSymbolDataEntry("j", LETTER, NOTHING, Cell245),
			new BrailleSymbolDataEntry("k", LETTER, NOTHING, Cell13),
			new BrailleSymbolDataEntry("l", LETTER, NOTHING, Cell123),
			new BrailleSymbolDataEntry("m", LETTER, NOTHING, Cell134),
			new BrailleSymbolDataEntry("n", LETTER, NOTHING, Cell1345),
			new BrailleSymbolDataEntry("o", LETTER, NOTHING, Cell135),
			new BrailleSymbolDataEntry("p", LETTER, NOTHING, Cell1234),
			new BrailleSymbolDataEntry("q", LETTER, NOTHING, Cell12345),
			new BrailleSymbolDataEntry("r", LETTER, NOTHING, Cell1235),
			new BrailleSymbolDataEntry("s", LETTER, NOTHING, Cell234),
			new BrailleSymbolDataEntry("t", LETTER, NOTHING, Cell2345),
			new BrailleSymbolDataEntry("u", LETTER, NOTHING, Cell136),
			new BrailleSymbolDataEntry("v", LETTER, NOTHING, Cell1236),
			new BrailleSymbolDataEntry("w", LETTER, NOTHING, Cell12356), // [12356]
			new BrailleSymbolDataEntry("x", LETTER, NOTHING, Cell1346),
			new BrailleSymbolDataEntry("y", LETTER, NOTHING, Cell13456),
			new BrailleSymbolDataEntry("z", LETTER, NOTHING, Cell1356),

			//Accent and diactricit letters
			new BrailleSymbolDataEntry("á", LETTER, NOTHING, Cell16), // [16]
			new BrailleSymbolDataEntry("ä", LETTER, NOTHING, Cell4),
			new BrailleSymbolDataEntry("č", LETTER, NOTHING, Cell146), // [146]
			new BrailleSymbolDataEntry("ď", LETTER, NOTHING, Cell1456), // [1456]
			new BrailleSymbolDataEntry("é", LETTER, NOTHING, Cell345), // [345]
			new BrailleSymbolDataEntry("í", LETTER, NOTHING, Cell34), // [34]
			new BrailleSymbolDataEntry("ĺ", LETTER, NOTHING, Cell46),
			new BrailleSymbolDataEntry("ľ", LETTER, NOTHING, Cell456),
			new BrailleSymbolDataEntry("ň", LETTER, NOTHING, Cell1246), // [1246]
			new BrailleSymbolDataEntry("ó", LETTER, NOTHING, Cell246), // [246]
			new BrailleSymbolDataEntry("ô", LETTER, NOTHING, Cell23456), // [23456]
			new BrailleSymbolDataEntry("ŕ", LETTER, NOTHING, Cell12356),
			new BrailleSymbolDataEntry("š", LETTER, NOTHING, Cell156), // [156]
			new BrailleSymbolDataEntry("ť", LETTER, NOTHING, Cell1256), // [1256]
			new BrailleSymbolDataEntry("ú", LETTER, NOTHING, Cell346), // [346]
			new BrailleSymbolDataEntry("ý", LETTER, NOTHING, Cell12346), // [12346]
			new BrailleSymbolDataEntry("ž", LETTER, NOTHING, Cell2346), // [2346]


			new BrailleSymbolDataEntry(NO_STRING, R.string.braille_number_sign, NUMBER, SHOW_INFO, Cell3456).setExtraInfo(R.string.numbersExplanation).setFillWidth(true),
			new BrailleSymbolDataEntry("1", NUMBER, NOTHING, Cell1),
			new BrailleSymbolDataEntry("2", NUMBER, NOTHING, Cell12),
			new BrailleSymbolDataEntry("3", NUMBER, NOTHING, Cell14),
			new BrailleSymbolDataEntry("4", NUMBER, NOTHING, Cell145),
			new BrailleSymbolDataEntry("5", NUMBER, NOTHING, Cell15),
			new BrailleSymbolDataEntry("6", NUMBER, NOTHING, Cell124),
			new BrailleSymbolDataEntry("7", NUMBER, NOTHING, Cell1245),
			new BrailleSymbolDataEntry("8", NUMBER, NOTHING, Cell125),
			new BrailleSymbolDataEntry("9", NUMBER, NOTHING, Cell24),
			new BrailleSymbolDataEntry("0", NUMBER, NOTHING, Cell245),
			new BrailleSymbolDataEntry(".", R.string.braille_decimal_point, NUMBER, SHOW_LETTERS_REP, Cell3), // [3]
			new BrailleSymbolDataEntry(",", R.string.braille_thousands_separator, NUMBER, SHOW_LETTERS_REP, Cell2),

			new BrailleSymbolDataEntry(" ", INVISIBLE, NOTHING, CellEmpty),

			new BrailleSymbolDataEntry(".", R.string.braille_fullstop, PUNCTUATION, SHOW_LETTERS_REP, Cell256),
			new BrailleSymbolDataEntry("?", R.string.braille_questionmark, PUNCTUATION, SHOW_LETTERS_REP, Cell26), // [26]
			new BrailleSymbolDataEntry("!", R.string.braille_exclamationmark, PUNCTUATION, SHOW_LETTERS_REP, Cell235),
			new BrailleSymbolDataEntry(",", R.string.braille_comma, PUNCTUATION, SHOW_LETTERS_REP, Cell2),
			new BrailleSymbolDataEntry(":", R.string.braille_colon, PUNCTUATION, SHOW_LETTERS_REP, Cell25),
			new BrailleSymbolDataEntry(";", R.string.braille_semicolon, PUNCTUATION, SHOW_LETTERS_REP, Cell23),
			new BrailleSymbolDataEntry("'", R.string.braille_apostrophe, PUNCTUATION, SHOW_LETTERS_REP, Cell4), // [4]
			new BrailleSymbolDataEntry("-", R.string.braille_hyphen, PUNCTUATION, SHOW_LETTERS_REP, Cell36),
			new BrailleSymbolDataEntry("“", R.string.braille_openquote, PUNCTUATION, SHOW_LETTERS_REP, Cell2356), // [56] quote sign, also used for second and inch
			new BrailleSymbolDataEntry("”", R.string.braille_closequote, PUNCTUATION, SHOW_LETTERS_REP, Cell2356), // [56] quote sign, also used for second and inch//new BrailleSymbolDataEntry(NO_STRING, R.string.braille_lettersign, PUNCTUATION, SHOW_INFO, Cell5).setExtraInfo(R.string.lettersignExplanation), // [5]
			new BrailleSymbolDataEntry(NO_STRING, R.string.braille_capital, PUNCTUATION, SHOW_INFO, Cell6).setExtraInfo(R.string.capitalsignExplanation),
			//new BrailleSymbolDataEntry(NO_STRING, R.string.braille_capitalword, PUNCTUATION, SHOW_INFO, Cell56).setExtraInfo(R.string.capitalwordExplanation), // [56]
			new BrailleSymbolDataEntry("*", R.string.braille_asterisk, PUNCTUATION, SHOW_LETTERS_REP, Cell35), // [35]
			new BrailleSymbolDataEntry("(", R.string.braille_openbracket, PUNCTUATION, SHOW_LETTERS_REP, Cell236), // [236]
			new BrailleSymbolDataEntry(")", R.string.braille_closebracket, PUNCTUATION, SHOW_LETTERS_REP, Cell356), // [356]
			new BrailleSymbolDataEntry("%", R.string.braille_percent, PUNCTUATION, SHOW_LETTERS_REP, Cell3456, Cell1234), // [3456][1234]
			new BrailleSymbolDataEntry("‰", R.string.braille_permille, PUNCTUATION, SHOW_LETTERS_REP, Cell3456, Cell1235), // [3456][1235]
			new BrailleSymbolDataEntry("§", R.string.braille_dollar, PUNCTUATION, SHOW_LETTERS_REP, Cell3456, Cell346), // [3456][346]
			new BrailleSymbolDataEntry("&", R.string.braille_pipe, PUNCTUATION, SHOW_LETTERS_REP, Cell3456, Cell12346),
			new BrailleSymbolDataEntry("/", R.string.braille_slash, PUNCTUATION, SHOW_LETTERS_REP, Cell12456),
			new BrailleSymbolDataEntry("@", R.string.braille_slash, PUNCTUATION, SHOW_LETTERS_REP, Cell4)

	};

	public BrailleSymbolDataEntry[] getAllSymbols()
	{
		return allSymbols;
	}

	public DictionaryCategory[] getDictionaryCategories()
	{
		return new DictionaryCategory[]{
				new DictionaryCategory(R.string.symbol_letter, 0, "A", LETTER),
				new DictionaryCategory(R.string.symbol_number, 4, "1", NUMBER),
				new DictionaryCategory(R.string.symbol_punctuation, 6, "?", PUNCTUATION)
		};
	}

	@Override
	public BrailleSymbolDataEntry[] getChallengeSymbols()
	{
		return getSymbols(LETTER);
	}

	public boolean canDoTranslation()
	{
		return true;
	}
}
