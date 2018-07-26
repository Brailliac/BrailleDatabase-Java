package com.lukeneedham.brailledatabase.Braille.SymbolDatabases;

import com.lukeneedham.brailledatabase.Braille.BrailleSymbolDataEntry;
import com.lukeneedham.brailledatabase.Braille.DictionaryCategory;
import com.lukeneedham.brailledatabase.R;

import static com.lukeneedham.brailledatabase.Braille.BrailleCellDatabase.*;

import static com.lukeneedham.brailledatabase.Braille.BrailleSymbolDataEntry.OnEntryClickType.NOTHING;
import static com.lukeneedham.brailledatabase.Braille.BrailleSymbolDataEntry.OnEntryClickType.SHOW_INFO;
import static com.lukeneedham.brailledatabase.Braille.BrailleSymbolDataEntry.OnEntryClickType.SHOW_LETTERS_REP;
import static com.lukeneedham.brailledatabase.Braille.BrailleSymbolDataEntry.OnEntryClickType.SHOW_USAGE_RULE;
import static com.lukeneedham.brailledatabase.Braille.BrailleSymbolType.FINALLETTERCONTRACTION;
import static com.lukeneedham.brailledatabase.Braille.BrailleSymbolType.GROUPSIGN;
import static com.lukeneedham.brailledatabase.Braille.BrailleSymbolType.INITIALLETTERCONTRACTION;
import static com.lukeneedham.brailledatabase.Braille.BrailleSymbolType.INVISIBLE;
import static com.lukeneedham.brailledatabase.Braille.BrailleSymbolType.LETTER;
import static com.lukeneedham.brailledatabase.Braille.BrailleSymbolType.NUMBER;
import static com.lukeneedham.brailledatabase.Braille.BrailleSymbolType.PUNCTUATION;
import static com.lukeneedham.brailledatabase.Braille.BrailleSymbolType.SHORTFORM;
import static com.lukeneedham.brailledatabase.Braille.BrailleSymbolType.WORDSIGN;

import static com.lukeneedham.brailledatabase.Braille.BrailleSymbolUsageRule.FIRST_SYLLABLE;
import static com.lukeneedham.brailledatabase.Braille.BrailleSymbolUsageRule.NOT_AFTER_A_OR_O_AND_UN_NOT_A_PREFIX;
import static com.lukeneedham.brailledatabase.Braille.BrailleSymbolUsageRule.NOT_AT_START;
import static com.lukeneedham.brailledatabase.Braille.BrailleSymbolUsageRule.ONE_SYLLABLE;
import static com.lukeneedham.brailledatabase.Braille.BrailleSymbolUsageRule.ONE_SYLLABLE_OR_END_WITH_ONEY_BUT_NEVER_AFTER_O;
import static com.lukeneedham.brailledatabase.Braille.BrailleSymbolUsageRule.ORIGINAL_MEANING_RETAINED;
import static com.lukeneedham.brailledatabase.Braille.BrailleSymbolUsageRule.ORIGINAL_PRONOUNCIATION_RETAINED;
import static com.lukeneedham.brailledatabase.Braille.BrailleSymbolUsageRule.SHORT_A;
import static com.lukeneedham.brailledatabase.Braille.BrailleSymbolUsageRule.STANDALONE;
import static com.lukeneedham.brailledatabase.Braille.BrailleSymbolUsageRule.STRESS_ON_FIRST_E_AND_NOT_AFTER_I_OR_E;
import static com.lukeneedham.brailledatabase.Braille.BrailleSymbolUsageRule.SURROUNDED;

public class UEBSymbolDatabase extends BrailleSymbolDatabase
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
			new BrailleSymbolDataEntry("w", LETTER, NOTHING, Cell2456),
			new BrailleSymbolDataEntry("x", LETTER, NOTHING, Cell1346),
			new BrailleSymbolDataEntry("y", LETTER, NOTHING, Cell13456),
			new BrailleSymbolDataEntry("z", LETTER, NOTHING, Cell1356),

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
			new BrailleSymbolDataEntry("?", R.string.braille_questionmark, PUNCTUATION, SHOW_LETTERS_REP, Cell236),
			new BrailleSymbolDataEntry("!", R.string.braille_exclamationmark, PUNCTUATION, SHOW_LETTERS_REP, Cell235),
			new BrailleSymbolDataEntry(",", R.string.braille_comma, PUNCTUATION, SHOW_LETTERS_REP, Cell2),
			new BrailleSymbolDataEntry(":", R.string.braille_colon, PUNCTUATION, SHOW_LETTERS_REP, Cell25),
			new BrailleSymbolDataEntry(";", R.string.braille_semicolon, PUNCTUATION, SHOW_LETTERS_REP, Cell23),
			new BrailleSymbolDataEntry("'", R.string.braille_apostrophe, PUNCTUATION, SHOW_LETTERS_REP, Cell3),
			new BrailleSymbolDataEntry("-", R.string.braille_hyphen, PUNCTUATION, SHOW_LETTERS_REP, Cell36),
			new BrailleSymbolDataEntry("“", R.string.braille_openquote, PUNCTUATION, SHOW_LETTERS_REP, Cell236),
			new BrailleSymbolDataEntry("”", R.string.braille_closequote, PUNCTUATION, SHOW_LETTERS_REP, Cell356),
			new BrailleSymbolDataEntry(NO_STRING, R.string.braille_lettersign, PUNCTUATION, SHOW_INFO, Cell56).setExtraInfo(R.string.lettersignExplanation),
			new BrailleSymbolDataEntry(NO_STRING, R.string.braille_capital, PUNCTUATION, SHOW_INFO, Cell6).setExtraInfo(R.string.capitalsignExplanation),
			new BrailleSymbolDataEntry(NO_STRING, R.string.braille_capitalword, PUNCTUATION, SHOW_INFO, Cell6, Cell6).setExtraInfo(R.string.capitalwordExplanation),
			new BrailleSymbolDataEntry("*", R.string.braille_asterisk, PUNCTUATION, SHOW_LETTERS_REP, Cell5, Cell35),
			new BrailleSymbolDataEntry("(", R.string.braille_openbracket, PUNCTUATION, SHOW_LETTERS_REP, Cell5, Cell126),
			new BrailleSymbolDataEntry(")", R.string.braille_closebracket, PUNCTUATION, SHOW_LETTERS_REP, Cell5, Cell345),
			new BrailleSymbolDataEntry("/", R.string.braille_slash, PUNCTUATION, SHOW_LETTERS_REP, Cell456, Cell34),

			new BrailleSymbolDataEntry("but", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, Cell12),
			new BrailleSymbolDataEntry("can", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, Cell14),
			new BrailleSymbolDataEntry("do", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, Cell145),
			new BrailleSymbolDataEntry("every", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, Cell15),
			new BrailleSymbolDataEntry("from", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, Cell124),
			new BrailleSymbolDataEntry("go", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, Cell1245),
			new BrailleSymbolDataEntry("have", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, Cell125),
			new BrailleSymbolDataEntry("just", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, Cell245),
			new BrailleSymbolDataEntry("knowledge", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, Cell13),
			new BrailleSymbolDataEntry("like", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, Cell123),
			new BrailleSymbolDataEntry("more", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, Cell134),
			new BrailleSymbolDataEntry("not", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, Cell1345),
			new BrailleSymbolDataEntry("people", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, Cell1234),
			new BrailleSymbolDataEntry("quite", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, Cell12345),
			new BrailleSymbolDataEntry("rather", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, Cell1235),
			new BrailleSymbolDataEntry("so", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, Cell234),
			new BrailleSymbolDataEntry("that", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, Cell2345),
			new BrailleSymbolDataEntry("us", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, Cell136),
			new BrailleSymbolDataEntry("very", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, Cell1236),
			new BrailleSymbolDataEntry("will", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, Cell2456),
			new BrailleSymbolDataEntry("it", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, Cell1346),
			new BrailleSymbolDataEntry("you", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, Cell13456),
			new BrailleSymbolDataEntry("as", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, Cell1356),

			new BrailleSymbolDataEntry("gg", SURROUNDED, GROUPSIGN, SHOW_USAGE_RULE, Cell2356),
			new BrailleSymbolDataEntry("were", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, Cell2356),
			new BrailleSymbolDataEntry("st", GROUPSIGN, SHOW_USAGE_RULE, Cell34),
			new BrailleSymbolDataEntry("still", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, Cell34),
			new BrailleSymbolDataEntry("ch", GROUPSIGN, SHOW_USAGE_RULE, Cell16),
			new BrailleSymbolDataEntry("child", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, Cell16),
			new BrailleSymbolDataEntry("gh", GROUPSIGN, SHOW_USAGE_RULE, Cell126),
			new BrailleSymbolDataEntry("sh", GROUPSIGN, SHOW_USAGE_RULE, Cell146),
			new BrailleSymbolDataEntry("shall", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, Cell146),
			new BrailleSymbolDataEntry("th", GROUPSIGN, SHOW_USAGE_RULE, Cell1456),
			new BrailleSymbolDataEntry("this", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, Cell1456),
			new BrailleSymbolDataEntry("wh", GROUPSIGN, SHOW_USAGE_RULE, Cell156),
			new BrailleSymbolDataEntry("which", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, Cell156),
			new BrailleSymbolDataEntry("ed", GROUPSIGN, SHOW_USAGE_RULE, Cell1246),
			new BrailleSymbolDataEntry("er", GROUPSIGN, SHOW_USAGE_RULE, Cell12456),
			new BrailleSymbolDataEntry("ou", GROUPSIGN, SHOW_USAGE_RULE, Cell1256),
			new BrailleSymbolDataEntry("out", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, Cell1256),
			new BrailleSymbolDataEntry("ow", GROUPSIGN, SHOW_USAGE_RULE, Cell246),
			new BrailleSymbolDataEntry("en", GROUPSIGN, SHOW_USAGE_RULE, Cell26),
			new BrailleSymbolDataEntry("enough", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, Cell26),
			new BrailleSymbolDataEntry("ing", NOT_AT_START, GROUPSIGN, SHOW_USAGE_RULE, Cell346),
			new BrailleSymbolDataEntry("ar", GROUPSIGN, SHOW_USAGE_RULE, Cell345),
			new BrailleSymbolDataEntry("in", GROUPSIGN, SHOW_USAGE_RULE, Cell35),

			new BrailleSymbolDataEntry("and", GROUPSIGN, SHOW_USAGE_RULE, Cell12346),
			new BrailleSymbolDataEntry("for", GROUPSIGN, SHOW_USAGE_RULE, Cell123456),
			new BrailleSymbolDataEntry("of", GROUPSIGN, SHOW_USAGE_RULE, Cell12356),
			new BrailleSymbolDataEntry("the", GROUPSIGN, SHOW_USAGE_RULE, Cell2346),
			new BrailleSymbolDataEntry("with", GROUPSIGN, SHOW_USAGE_RULE, Cell23456),

			new BrailleSymbolDataEntry("dis", FIRST_SYLLABLE, GROUPSIGN, SHOW_USAGE_RULE, Cell256),
			new BrailleSymbolDataEntry("his", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, Cell236),
			new BrailleSymbolDataEntry("ff", SURROUNDED, GROUPSIGN, SHOW_USAGE_RULE, Cell235),
			new BrailleSymbolDataEntry("ea", SURROUNDED, GROUPSIGN, SHOW_USAGE_RULE, Cell2),
			new BrailleSymbolDataEntry("con", FIRST_SYLLABLE, GROUPSIGN, SHOW_USAGE_RULE, Cell25),
			new BrailleSymbolDataEntry("cc", SURROUNDED, GROUPSIGN, SHOW_USAGE_RULE, Cell25),
			new BrailleSymbolDataEntry("bb", SURROUNDED, GROUPSIGN, SHOW_USAGE_RULE, Cell23),
			new BrailleSymbolDataEntry("be", FIRST_SYLLABLE, GROUPSIGN, SHOW_USAGE_RULE, Cell23),
			new BrailleSymbolDataEntry("was", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, Cell356),

			new BrailleSymbolDataEntry("upon", ORIGINAL_MEANING_RETAINED, INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell45, Cell136),
			new BrailleSymbolDataEntry("these", ORIGINAL_MEANING_RETAINED, INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell45, Cell2346),
			new BrailleSymbolDataEntry("those", ORIGINAL_MEANING_RETAINED, INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell45, Cell1456),
			new BrailleSymbolDataEntry("whose", ORIGINAL_MEANING_RETAINED, INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell45, Cell156),
			new BrailleSymbolDataEntry("word", INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell45, Cell2456),

			new BrailleSymbolDataEntry("cannot", INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell456, Cell14),
			new BrailleSymbolDataEntry("had", SHORT_A, INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell456, Cell125),
			new BrailleSymbolDataEntry("many", INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell456, Cell134),
			new BrailleSymbolDataEntry("spirit", INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell456, Cell234),
			new BrailleSymbolDataEntry("their", INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell456, Cell2346),
			new BrailleSymbolDataEntry("world", INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell456, Cell2456),

			new BrailleSymbolDataEntry("day", INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell5, Cell145),
			new BrailleSymbolDataEntry("ever", STRESS_ON_FIRST_E_AND_NOT_AFTER_I_OR_E, INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell5, Cell15),
			new BrailleSymbolDataEntry("father", INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell5, Cell124),
			new BrailleSymbolDataEntry("here", ONE_SYLLABLE, INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell5, Cell125),
			new BrailleSymbolDataEntry("know", INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell5, Cell13),
			new BrailleSymbolDataEntry("lord", INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell5, Cell123),
			new BrailleSymbolDataEntry("mother", INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell5, Cell134),
			new BrailleSymbolDataEntry("name", ONE_SYLLABLE, INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell5, Cell1345),
			new BrailleSymbolDataEntry("one", ONE_SYLLABLE_OR_END_WITH_ONEY_BUT_NEVER_AFTER_O, INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell5, Cell135),
			new BrailleSymbolDataEntry("part", INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell5, Cell1234),
			new BrailleSymbolDataEntry("question", INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell5, Cell12345),
			new BrailleSymbolDataEntry("right", INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell5, Cell1235),
			new BrailleSymbolDataEntry("some", ONE_SYLLABLE, INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell5, Cell234),
			new BrailleSymbolDataEntry("time", ORIGINAL_PRONOUNCIATION_RETAINED, INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell5, Cell2345),
			new BrailleSymbolDataEntry("under", NOT_AFTER_A_OR_O_AND_UN_NOT_A_PREFIX, INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell5, Cell136),
			new BrailleSymbolDataEntry("young", INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell5, Cell13456),
			new BrailleSymbolDataEntry("there", ORIGINAL_MEANING_RETAINED, INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell5, Cell2346),
			new BrailleSymbolDataEntry("character", INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell5, Cell16),
			new BrailleSymbolDataEntry("through", INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell5, Cell1456),
			new BrailleSymbolDataEntry("where", INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell5, Cell156),
			new BrailleSymbolDataEntry("ought", INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell5, Cell1256),
			new BrailleSymbolDataEntry("work", INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell5, Cell2456),

			new BrailleSymbolDataEntry("ound", NOT_AT_START, FINALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell46, Cell145),
			new BrailleSymbolDataEntry("ance", NOT_AT_START, FINALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell46, Cell15),
			new BrailleSymbolDataEntry("sion", NOT_AT_START, FINALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell46, Cell1345),
			new BrailleSymbolDataEntry("less", NOT_AT_START, FINALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell46, Cell234),
			new BrailleSymbolDataEntry("ount", NOT_AT_START, FINALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell46, Cell2345),

			new BrailleSymbolDataEntry("ence", NOT_AT_START, FINALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell56, Cell15),
			new BrailleSymbolDataEntry("ong", NOT_AT_START, FINALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell56, Cell1245),
			new BrailleSymbolDataEntry("ful", NOT_AT_START, FINALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell56, Cell123),
			new BrailleSymbolDataEntry("tion", NOT_AT_START, FINALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell56, Cell1345),
			new BrailleSymbolDataEntry("ness", NOT_AT_START, FINALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell56, Cell234),
			new BrailleSymbolDataEntry("ment", NOT_AT_START, FINALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell56, Cell2345),
			new BrailleSymbolDataEntry("ity", NOT_AT_START, FINALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell56, Cell13456),

			new BrailleSymbolDataEntry("about", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell1, Cell12),
			new BrailleSymbolDataEntry("above", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell1, Cell12, Cell1236),
			new BrailleSymbolDataEntry("according", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell1, Cell14),
			new BrailleSymbolDataEntry("across", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell1, Cell14, Cell1235),
			new BrailleSymbolDataEntry("after", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell1, Cell124),
			new BrailleSymbolDataEntry("afternoon", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell1, Cell124, Cell1345),
			new BrailleSymbolDataEntry("afterward", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell1, Cell124, Cell2456),
			new BrailleSymbolDataEntry("again", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell1, Cell1245),
			new BrailleSymbolDataEntry("against", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell1, Cell1245, Cell34),
			new BrailleSymbolDataEntry("also", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell1, Cell123),
			new BrailleSymbolDataEntry("almost", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell1, Cell123, Cell134),
			new BrailleSymbolDataEntry("already", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell1, Cell123, Cell1235),
			new BrailleSymbolDataEntry("altogether", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell1, Cell123, Cell2345),
			new BrailleSymbolDataEntry("although", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell1, Cell123, Cell1456),
			new BrailleSymbolDataEntry("always", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell1, Cell123, Cell2456),
			new BrailleSymbolDataEntry("blind", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell12, Cell123),
			new BrailleSymbolDataEntry("braille", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell12, Cell1235, Cell123),
			new BrailleSymbolDataEntry("could", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell14, Cell145),
			new BrailleSymbolDataEntry("declare", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell145, Cell14, Cell123),
			new BrailleSymbolDataEntry("declaring", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell145, Cell14, Cell123, Cell1245),
			new BrailleSymbolDataEntry("deceive", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell145, Cell14, Cell1236),
			new BrailleSymbolDataEntry("deceiving", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell145, Cell14, Cell1236, Cell1245),
			new BrailleSymbolDataEntry("either", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell15, Cell24),
			new BrailleSymbolDataEntry("friend", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell124, Cell1235),
			new BrailleSymbolDataEntry("first", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell124, Cell34),
			new BrailleSymbolDataEntry("good", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell1245, Cell145),
			new BrailleSymbolDataEntry("great", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell1245, Cell1235, Cell2345),
			new BrailleSymbolDataEntry("him", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell125, Cell134),
			new BrailleSymbolDataEntry("himself", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell125, Cell134, Cell124),
			new BrailleSymbolDataEntry("herself", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell125, Cell12456, Cell124),
			new BrailleSymbolDataEntry("immediate", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell24, Cell134, Cell134),
			new BrailleSymbolDataEntry("little", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell123, Cell123),
			new BrailleSymbolDataEntry("letter", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell123, Cell1235),
			new BrailleSymbolDataEntry("myself", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell134, Cell13456, Cell124),
			new BrailleSymbolDataEntry("much", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell134, Cell16),
			new BrailleSymbolDataEntry("must", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell134, Cell34),
			new BrailleSymbolDataEntry("necessary", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell1345, Cell15, Cell14),
			new BrailleSymbolDataEntry("neither", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell1345, Cell15, Cell24),
			new BrailleSymbolDataEntry("paid", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell1234, Cell145),
			new BrailleSymbolDataEntry("perceive", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell1234, Cell12456, Cell14, Cell1236),
			new BrailleSymbolDataEntry("perceiving", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell1234, Cell12456, Cell14, Cell1236, Cell1245),
			new BrailleSymbolDataEntry("perhaps", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell1234, Cell12456, Cell125),
			new BrailleSymbolDataEntry("quick", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell12345, Cell13),
			new BrailleSymbolDataEntry("receive", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell1235, Cell14, Cell1236),
			new BrailleSymbolDataEntry("receiving", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell1235, Cell14, Cell1236, Cell1245),
			new BrailleSymbolDataEntry("rejoice", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell1235, Cell245, Cell14),
			new BrailleSymbolDataEntry("rejoicing", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell1235, Cell245, Cell14, Cell1245),
			new BrailleSymbolDataEntry("said", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell234, Cell145),
			new BrailleSymbolDataEntry("such", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell234, Cell16),
			new BrailleSymbolDataEntry("today", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell2345, Cell145),
			new BrailleSymbolDataEntry("together", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell2345, Cell1245, Cell1235),
			new BrailleSymbolDataEntry("tomorrow", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell2345, Cell134),
			new BrailleSymbolDataEntry("tonight", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell2345, Cell1345),
			new BrailleSymbolDataEntry("itself", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell1346, Cell124),
			new BrailleSymbolDataEntry("its", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell1346, Cell234),
			new BrailleSymbolDataEntry("your", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell13456, Cell1235),
			new BrailleSymbolDataEntry("yourself", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell13456, Cell1235, Cell124),
			new BrailleSymbolDataEntry("yourselves", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell13456, Cell1235, Cell1236, Cell234),
			new BrailleSymbolDataEntry("themselves", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell2346, Cell134, Cell1236, Cell234),
			new BrailleSymbolDataEntry("children", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell16, Cell1345),
			new BrailleSymbolDataEntry("should", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell146, Cell145),
			new BrailleSymbolDataEntry("thyself", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell1456, Cell13456, Cell124),
			new BrailleSymbolDataEntry("ourselves", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell1256, Cell1235, Cell1236, Cell234),
			new BrailleSymbolDataEntry("would", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell2456, Cell145),
			new BrailleSymbolDataEntry("because", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell23, Cell14),
			new BrailleSymbolDataEntry("before", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell23, Cell124),
			new BrailleSymbolDataEntry("behind", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell23, Cell125),
			new BrailleSymbolDataEntry("below", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell23, Cell123),
			new BrailleSymbolDataEntry("beneath", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell23, Cell1345),
			new BrailleSymbolDataEntry("beside", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell23, Cell234),
			new BrailleSymbolDataEntry("between", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell23, Cell2345),
			new BrailleSymbolDataEntry("beyond", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell23, Cell13456),
			new BrailleSymbolDataEntry("conceive", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell25, Cell14, Cell1236),
			new BrailleSymbolDataEntry("conceiving", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell25, Cell14, Cell1236, Cell1245),
			new BrailleSymbolDataEntry("oneself", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell5, Cell135, Cell124)
	};

	public BrailleSymbolDataEntry[] getAllSymbols()
	{
		return allSymbols;
	}

	public DictionaryCategory[] getDictionaryCategories()
	{
		return new DictionaryCategory[] {
				new DictionaryCategory(R.string.symbol_letter,0,"A",LETTER),
				new DictionaryCategory(R.string.symbol_number,4,"1",NUMBER),
				new DictionaryCategory(R.string.symbol_punctuation,6,"?",PUNCTUATION),
				new DictionaryCategory(R.string.category_contractions, 8, "~",GROUPSIGN, WORDSIGN).setTranslateToggle(true),
				new DictionaryCategory(R.string.category_advancedcontractions, 12, "~+",INITIALLETTERCONTRACTION, FINALLETTERCONTRACTION).setTranslateToggle(true),
				new DictionaryCategory(R.string.symbol_shortform, 15, "…", SHORTFORM).setTranslateToggle(true)};
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