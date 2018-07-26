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

public class EspanolSymbolDatabase extends BrailleSymbolDatabase
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
			new BrailleSymbolDataEntry("ñ", LETTER, NOTHING, Cell12456), //Special letter used for certain words
			new BrailleSymbolDataEntry("o", LETTER, NOTHING, Cell135),
			new BrailleSymbolDataEntry("p", LETTER, NOTHING, Cell1234),
			new BrailleSymbolDataEntry("q", LETTER, NOTHING, Cell12345),
			new BrailleSymbolDataEntry("r", LETTER, NOTHING, Cell1235),
			new BrailleSymbolDataEntry("s", LETTER, NOTHING, Cell234),
			new BrailleSymbolDataEntry("t", LETTER, NOTHING, Cell2345),
			new BrailleSymbolDataEntry("u", LETTER, NOTHING, Cell136),
			new BrailleSymbolDataEntry("v", LETTER, NOTHING, Cell1236),
			new BrailleSymbolDataEntry("w", LETTER, NOTHING, Cell2456),
			new BrailleSymbolDataEntry("x", LETTER, NOTHING, Cell1346),
			new BrailleSymbolDataEntry("y", LETTER, NOTHING, Cell13456),
			new BrailleSymbolDataEntry("z", LETTER, NOTHING, Cell1356),

			//Accent and diactricit letters
			new BrailleSymbolDataEntry("á", LETTER, NOTHING, Cell12356),
			new BrailleSymbolDataEntry("é", LETTER, NOTHING, Cell2346),
			new BrailleSymbolDataEntry("í", LETTER, NOTHING, Cell34),
			new BrailleSymbolDataEntry("ó", LETTER, NOTHING, Cell346),
			new BrailleSymbolDataEntry("ú", LETTER, NOTHING, Cell23456),
			new BrailleSymbolDataEntry("ü", LETTER, NOTHING, Cell1256),

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
			new BrailleSymbolDataEntry(".", R.string.braille_decimal_point, NUMBER, SHOW_LETTERS_REP, Cell256),
			new BrailleSymbolDataEntry(",", R.string.braille_thousands_separator, NUMBER, SHOW_LETTERS_REP, Cell2),

			new BrailleSymbolDataEntry(" ", INVISIBLE, NOTHING, CellEmpty),

			new BrailleSymbolDataEntry(".", R.string.braille_fullstop, PUNCTUATION, SHOW_LETTERS_REP, Cell256),
			new BrailleSymbolDataEntry("?", R.string.braille_questionmark, PUNCTUATION, SHOW_LETTERS_REP, Cell26), //Different in Spanish
			new BrailleSymbolDataEntry("¿", R.string.braille_questionmark_inverse, PUNCTUATION, SHOW_LETTERS_REP, Cell26), //Different in Spanish
			new BrailleSymbolDataEntry("“", R.string.braille_openquote, PUNCTUATION, SHOW_LETTERS_REP, Cell236),
			new BrailleSymbolDataEntry("!", R.string.braille_exclamationmark, PUNCTUATION, SHOW_LETTERS_REP, Cell235), //Same as English
			new BrailleSymbolDataEntry("¡", R.string.braille_exclamationmark_inverse, PUNCTUATION, SHOW_LETTERS_REP, Cell235), //Same as English
			new BrailleSymbolDataEntry(",", R.string.braille_comma, PUNCTUATION, SHOW_LETTERS_REP, Cell2),
			new BrailleSymbolDataEntry(":", R.string.braille_colon, PUNCTUATION, SHOW_LETTERS_REP, Cell25),
			new BrailleSymbolDataEntry(";", R.string.braille_semicolon, PUNCTUATION, SHOW_LETTERS_REP, Cell23),
			new BrailleSymbolDataEntry("'", R.string.braille_apostrophe, PUNCTUATION, SHOW_LETTERS_REP, Cell3),
			new BrailleSymbolDataEntry("-", R.string.braille_hyphen, PUNCTUATION, SHOW_LETTERS_REP, Cell36),
			new BrailleSymbolDataEntry("”", R.string.braille_closequote, PUNCTUATION, SHOW_LETTERS_REP, Cell356),
			new BrailleSymbolDataEntry(NO_STRING, R.string.braille_lettersign, PUNCTUATION, SHOW_LETTERS_REP, Cell56),
			new BrailleSymbolDataEntry(NO_STRING, R.string.braille_capital, PUNCTUATION, SHOW_LETTERS_REP, Cell6),
			new BrailleSymbolDataEntry(NO_STRING, R.string.braille_capitalword, PUNCTUATION, SHOW_LETTERS_REP, Cell6, Cell6),

			new BrailleSymbolDataEntry("*", R.string.braille_asterisk, PUNCTUATION, SHOW_LETTERS_REP, Cell5, Cell35),
			new BrailleSymbolDataEntry("(", R.string.braille_openbracket, PUNCTUATION, SHOW_LETTERS_REP, Cell5, Cell126),
			new BrailleSymbolDataEntry(")", R.string.braille_closebracket, PUNCTUATION, SHOW_LETTERS_REP, Cell5, Cell345),
			new BrailleSymbolDataEntry("/", R.string.braille_slash, PUNCTUATION, SHOW_LETTERS_REP, Cell456, Cell34),

			new BrailleSymbolDataEntry(NO_STRING, R.string.braille_dots5, INVISIBLE, NOTHING, Cell5),
			new BrailleSymbolDataEntry(NO_STRING, R.string.braille_dots45, INVISIBLE, NOTHING, Cell45),
			new BrailleSymbolDataEntry(NO_STRING, R.string.braille_dots456, INVISIBLE, NOTHING, Cell456),

			new BrailleSymbolDataEntry(NO_STRING, R.string.braille_dots46, INVISIBLE, NOTHING, Cell46),
			new BrailleSymbolDataEntry(NO_STRING, R.string.braille_dots56, INVISIBLE, NOTHING, Cell56),
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
				new DictionaryCategory(R.string.symbol_punctuation, 6, "?", PUNCTUATION)};
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
