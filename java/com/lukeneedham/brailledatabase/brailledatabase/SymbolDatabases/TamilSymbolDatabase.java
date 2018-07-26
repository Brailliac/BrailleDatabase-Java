package com.lukeneedham.brailledatabase.Braille.SymbolDatabases;

import com.lukeneedham.brailledatabase.Braille.BrailleSymbolDataEntry;
import com.lukeneedham.brailledatabase.Braille.DictionaryCategory;
import com.lukeneedham.brailledatabase.R;

import java.util.ArrayList;

import static com.lukeneedham.brailledatabase.Braille.BrailleCellDatabase.*;
import static com.lukeneedham.brailledatabase.Braille.BrailleSymbolDataEntry.OnEntryClickType.NOTHING;
import static com.lukeneedham.brailledatabase.Braille.BrailleSymbolDataEntry.OnEntryClickType.SHOW_INFO;
import static com.lukeneedham.brailledatabase.Braille.BrailleSymbolDataEntry.OnEntryClickType.SHOW_LETTERS_REP;
import static com.lukeneedham.brailledatabase.Braille.BrailleSymbolType.GRANTHA;
import static com.lukeneedham.brailledatabase.Braille.BrailleSymbolType.INVISIBLE;
import static com.lukeneedham.brailledatabase.Braille.BrailleSymbolType.MEI;
import static com.lukeneedham.brailledatabase.Braille.BrailleSymbolType.NUMBER;
import static com.lukeneedham.brailledatabase.Braille.BrailleSymbolType.PUNCTUATION;
import static com.lukeneedham.brailledatabase.Braille.BrailleSymbolType.UYIR;
import static com.lukeneedham.brailledatabase.Braille.BrailleSymbolType.UYIRMEI1;
import static com.lukeneedham.brailledatabase.Braille.BrailleSymbolType.UYIRMEI2;

public class TamilSymbolDatabase extends BrailleSymbolDatabase
{

	private static final BrailleSymbolDataEntry[] allSymbols = {

			new BrailleSymbolDataEntry("அ", UYIR, NOTHING, Cell1),
			new BrailleSymbolDataEntry("ஆ", UYIR, NOTHING, Cell345),
			new BrailleSymbolDataEntry("இ", UYIR, NOTHING, Cell24),
			new BrailleSymbolDataEntry("ஈ", UYIR, NOTHING, Cell35),
			new BrailleSymbolDataEntry("உ", UYIR, NOTHING, Cell136),
			new BrailleSymbolDataEntry("ஊ", UYIR, NOTHING, Cell1256),
			new BrailleSymbolDataEntry("எ", UYIR, NOTHING, Cell26),
			new BrailleSymbolDataEntry("ஏ", UYIR, NOTHING, Cell15),
			new BrailleSymbolDataEntry("ஐ", UYIR, NOTHING, Cell34),
			new BrailleSymbolDataEntry("ஒ", UYIR, NOTHING, Cell1346),
			new BrailleSymbolDataEntry("ஓ", UYIR, NOTHING, Cell135),
			new BrailleSymbolDataEntry("ஔ", UYIR, NOTHING, Cell246),
			new BrailleSymbolDataEntry("ஃ", UYIR, NOTHING, Cell6),

			new BrailleSymbolDataEntry("க", UYIRMEI1, NOTHING, Cell13),
			new BrailleSymbolDataEntry("ங", UYIRMEI1, NOTHING, Cell346),
			new BrailleSymbolDataEntry("ச", UYIRMEI1, NOTHING, Cell14),
			new BrailleSymbolDataEntry("ஞ", UYIRMEI1, NOTHING, Cell25),
			new BrailleSymbolDataEntry("ட", UYIRMEI1, NOTHING, Cell23456),
			new BrailleSymbolDataEntry("ண", UYIRMEI1, NOTHING, Cell3456),
			new BrailleSymbolDataEntry("த", UYIRMEI1, NOTHING, Cell2345),
			new BrailleSymbolDataEntry("ந", UYIRMEI1, NOTHING, Cell1345),
			new BrailleSymbolDataEntry("ப", UYIRMEI1, NOTHING, Cell1234),
			new BrailleSymbolDataEntry("ம", UYIRMEI1, NOTHING, Cell134),
			new BrailleSymbolDataEntry("ய", UYIRMEI1, NOTHING, Cell13456),
			new BrailleSymbolDataEntry("ர", UYIRMEI1, NOTHING, Cell1235),
			new BrailleSymbolDataEntry("ல", UYIRMEI1, NOTHING, Cell123),
			new BrailleSymbolDataEntry("வ", UYIRMEI1, NOTHING, Cell1236),
			new BrailleSymbolDataEntry("ழ", UYIRMEI1, NOTHING, Cell12356),
			new BrailleSymbolDataEntry("ள", UYIRMEI1, NOTHING, Cell456),
			new BrailleSymbolDataEntry("ற", UYIRMEI1, NOTHING, Cell12456),
			new BrailleSymbolDataEntry("ன", UYIRMEI1, NOTHING, Cell56),

			new BrailleSymbolDataEntry("க்", MEI, NOTHING, Cell4, Cell13),
			new BrailleSymbolDataEntry("ங்", MEI, NOTHING, Cell4, Cell346),
			new BrailleSymbolDataEntry("ச்", MEI, NOTHING, Cell4, Cell14),
			new BrailleSymbolDataEntry("ஞ்", MEI, NOTHING, Cell4, Cell25),
			new BrailleSymbolDataEntry("ட்", MEI, NOTHING, Cell4, Cell23456),
			new BrailleSymbolDataEntry("ண்", MEI, NOTHING, Cell4, Cell3456),
			new BrailleSymbolDataEntry("த்", MEI, NOTHING, Cell4, Cell2345),
			new BrailleSymbolDataEntry("ந்", MEI, NOTHING, Cell4, Cell1345),
			new BrailleSymbolDataEntry("ப்", MEI, NOTHING, Cell4, Cell1234),
			new BrailleSymbolDataEntry("ம்", MEI, NOTHING, Cell4, Cell134),
			new BrailleSymbolDataEntry("ய்", MEI, NOTHING, Cell4, Cell13456),
			new BrailleSymbolDataEntry("ர்", MEI, NOTHING, Cell4, Cell1235),
			new BrailleSymbolDataEntry("ல்", MEI, NOTHING, Cell4, Cell123),
			new BrailleSymbolDataEntry("வ்", MEI, NOTHING, Cell4, Cell1236),
			new BrailleSymbolDataEntry("ழ்", MEI, NOTHING, Cell4, Cell12356),
			new BrailleSymbolDataEntry("ள்", MEI, NOTHING, Cell4, Cell456),
			new BrailleSymbolDataEntry("ற்", MEI, NOTHING, Cell4, Cell12456),
			new BrailleSymbolDataEntry("ன்", MEI, NOTHING, Cell4, Cell56),

			new BrailleSymbolDataEntry("கா", UYIRMEI2, NOTHING, Cell13, Cell345),
			new BrailleSymbolDataEntry("ஙா", UYIRMEI2, NOTHING, Cell346, Cell345),
			new BrailleSymbolDataEntry("சா", UYIRMEI2, NOTHING, Cell14, Cell345),
			new BrailleSymbolDataEntry("ஞா", UYIRMEI2, NOTHING, Cell25, Cell345),
			new BrailleSymbolDataEntry("டா", UYIRMEI2, NOTHING, Cell23456, Cell345),
			new BrailleSymbolDataEntry("ணா", UYIRMEI2, NOTHING, Cell3456, Cell345),
			new BrailleSymbolDataEntry("தா", UYIRMEI2, NOTHING, Cell2345, Cell345),
			new BrailleSymbolDataEntry("நா", UYIRMEI2, NOTHING, Cell1345, Cell345),
			new BrailleSymbolDataEntry("பா", UYIRMEI2, NOTHING, Cell1234, Cell345),
			new BrailleSymbolDataEntry("மா", UYIRMEI2, NOTHING, Cell134, Cell345),
			new BrailleSymbolDataEntry("யா", UYIRMEI2, NOTHING, Cell13456, Cell345),
			new BrailleSymbolDataEntry("ரா", UYIRMEI2, NOTHING, Cell1235, Cell345),
			new BrailleSymbolDataEntry("லா", UYIRMEI2, NOTHING, Cell123, Cell345),
			new BrailleSymbolDataEntry("வா", UYIRMEI2, NOTHING, Cell1236, Cell345),
			new BrailleSymbolDataEntry("ழா", UYIRMEI2, NOTHING, Cell12356, Cell345),
			new BrailleSymbolDataEntry("ளா", UYIRMEI2, NOTHING, Cell456, Cell345),
			new BrailleSymbolDataEntry("றா", UYIRMEI2, NOTHING, Cell12456, Cell345),
			new BrailleSymbolDataEntry("னா", UYIRMEI2, NOTHING, Cell56, Cell345),

			new BrailleSymbolDataEntry("கி", UYIRMEI2, NOTHING, Cell13, Cell24),
			new BrailleSymbolDataEntry("ஙி", UYIRMEI2, NOTHING, Cell346, Cell24),
			new BrailleSymbolDataEntry("சி", UYIRMEI2, NOTHING, Cell14, Cell24),
			new BrailleSymbolDataEntry("ஞி", UYIRMEI2, NOTHING, Cell25, Cell24),
			new BrailleSymbolDataEntry("டி", UYIRMEI2, NOTHING, Cell23456, Cell24),
			new BrailleSymbolDataEntry("ணி", UYIRMEI2, NOTHING, Cell3456, Cell24),
			new BrailleSymbolDataEntry("தி", UYIRMEI2, NOTHING, Cell2345, Cell24),
			new BrailleSymbolDataEntry("நி", UYIRMEI2, NOTHING, Cell1345, Cell24),
			new BrailleSymbolDataEntry("பி", UYIRMEI2, NOTHING, Cell1234, Cell24),
			new BrailleSymbolDataEntry("மி", UYIRMEI2, NOTHING, Cell134, Cell24),
			new BrailleSymbolDataEntry("யி", UYIRMEI2, NOTHING, Cell13456, Cell24),
			new BrailleSymbolDataEntry("ரி", UYIRMEI2, NOTHING, Cell1235, Cell24),
			new BrailleSymbolDataEntry("லி", UYIRMEI2, NOTHING, Cell123, Cell24),
			new BrailleSymbolDataEntry("வி", UYIRMEI2, NOTHING, Cell1236, Cell24),
			new BrailleSymbolDataEntry("ழி", UYIRMEI2, NOTHING, Cell12356, Cell24),
			new BrailleSymbolDataEntry("ளி", UYIRMEI2, NOTHING, Cell456, Cell24),
			new BrailleSymbolDataEntry("றி", UYIRMEI2, NOTHING, Cell12456, Cell24),
			new BrailleSymbolDataEntry("னி", UYIRMEI2, NOTHING, Cell56, Cell24),

			new BrailleSymbolDataEntry("கீ", UYIRMEI2, NOTHING, Cell13, Cell35),
			new BrailleSymbolDataEntry("ஙீ", UYIRMEI2, NOTHING, Cell346, Cell35),
			new BrailleSymbolDataEntry("சீ", UYIRMEI2, NOTHING, Cell14, Cell35),
			new BrailleSymbolDataEntry("ஞீ", UYIRMEI2, NOTHING, Cell25, Cell35),
			new BrailleSymbolDataEntry("டீ", UYIRMEI2, NOTHING, Cell23456, Cell35),
			new BrailleSymbolDataEntry("ணீ", UYIRMEI2, NOTHING, Cell3456, Cell35),
			new BrailleSymbolDataEntry("தீ", UYIRMEI2, NOTHING, Cell2345, Cell35),
			new BrailleSymbolDataEntry("நீ", UYIRMEI2, NOTHING, Cell1345, Cell35),
			new BrailleSymbolDataEntry("பீ", UYIRMEI2, NOTHING, Cell1234, Cell35),
			new BrailleSymbolDataEntry("மீ", UYIRMEI2, NOTHING, Cell134, Cell35),
			new BrailleSymbolDataEntry("யீ", UYIRMEI2, NOTHING, Cell13456, Cell35),
			new BrailleSymbolDataEntry("ரீ", UYIRMEI2, NOTHING, Cell1235, Cell35),
			new BrailleSymbolDataEntry("லீ", UYIRMEI2, NOTHING, Cell123, Cell35),
			new BrailleSymbolDataEntry("வீ", UYIRMEI2, NOTHING, Cell1236, Cell35),
			new BrailleSymbolDataEntry("ழீ", UYIRMEI2, NOTHING, Cell12356, Cell35),
			new BrailleSymbolDataEntry("ளீ", UYIRMEI2, NOTHING, Cell456, Cell35),
			new BrailleSymbolDataEntry("றீ", UYIRMEI2, NOTHING, Cell12456, Cell35),
			new BrailleSymbolDataEntry("னீ", UYIRMEI2, NOTHING, Cell56, Cell35),

			new BrailleSymbolDataEntry("கு", UYIRMEI2, NOTHING, Cell13, Cell136),
			new BrailleSymbolDataEntry("ஙு", UYIRMEI2, NOTHING, Cell346, Cell136),
			new BrailleSymbolDataEntry("சு", UYIRMEI2, NOTHING, Cell14, Cell136),
			new BrailleSymbolDataEntry("ஞு", UYIRMEI2, NOTHING, Cell25, Cell136),
			new BrailleSymbolDataEntry("டு", UYIRMEI2, NOTHING, Cell23456, Cell136),
			new BrailleSymbolDataEntry("ணு", UYIRMEI2, NOTHING, Cell3456, Cell136),
			new BrailleSymbolDataEntry("து", UYIRMEI2, NOTHING, Cell2345, Cell136),
			new BrailleSymbolDataEntry("நு", UYIRMEI2, NOTHING, Cell1345, Cell136),
			new BrailleSymbolDataEntry("பு", UYIRMEI2, NOTHING, Cell1234, Cell136),
			new BrailleSymbolDataEntry("மு", UYIRMEI2, NOTHING, Cell134, Cell136),
			new BrailleSymbolDataEntry("யு", UYIRMEI2, NOTHING, Cell13456, Cell136),
			new BrailleSymbolDataEntry("ரு", UYIRMEI2, NOTHING, Cell1235, Cell136),
			new BrailleSymbolDataEntry("லு", UYIRMEI2, NOTHING, Cell123, Cell136),
			new BrailleSymbolDataEntry("வு", UYIRMEI2, NOTHING, Cell1236, Cell136),
			new BrailleSymbolDataEntry("ழு", UYIRMEI2, NOTHING, Cell12356, Cell136),
			new BrailleSymbolDataEntry("ளு", UYIRMEI2, NOTHING, Cell456, Cell136),
			new BrailleSymbolDataEntry("று", UYIRMEI2, NOTHING, Cell12456, Cell136),
			new BrailleSymbolDataEntry("னு", UYIRMEI2, NOTHING, Cell56, Cell136),

			new BrailleSymbolDataEntry("கூ", UYIRMEI2, NOTHING, Cell13, Cell1256),
			new BrailleSymbolDataEntry("ஙூ", UYIRMEI2, NOTHING, Cell346, Cell1256),
			new BrailleSymbolDataEntry("சூ", UYIRMEI2, NOTHING, Cell14, Cell1256),
			new BrailleSymbolDataEntry("ஞூ", UYIRMEI2, NOTHING, Cell25, Cell1256),
			new BrailleSymbolDataEntry("டூ", UYIRMEI2, NOTHING, Cell23456, Cell1256),
			new BrailleSymbolDataEntry("ணூ", UYIRMEI2, NOTHING, Cell3456, Cell1256),
			new BrailleSymbolDataEntry("தூ", UYIRMEI2, NOTHING, Cell2345, Cell1256),
			new BrailleSymbolDataEntry("நூ", UYIRMEI2, NOTHING, Cell1345, Cell1256),
			new BrailleSymbolDataEntry("பூ", UYIRMEI2, NOTHING, Cell1234, Cell1256),
			new BrailleSymbolDataEntry("மூ", UYIRMEI2, NOTHING, Cell134, Cell1256),
			new BrailleSymbolDataEntry("யூ", UYIRMEI2, NOTHING, Cell13456, Cell1256),
			new BrailleSymbolDataEntry("ரூ", UYIRMEI2, NOTHING, Cell1235, Cell1256),
			new BrailleSymbolDataEntry("லூ", UYIRMEI2, NOTHING, Cell123, Cell1256),
			new BrailleSymbolDataEntry("வூ", UYIRMEI2, NOTHING, Cell1236, Cell1256),
			new BrailleSymbolDataEntry("ழூ", UYIRMEI2, NOTHING, Cell12356, Cell1256),
			new BrailleSymbolDataEntry("ளூ", UYIRMEI2, NOTHING, Cell456, Cell1256),
			new BrailleSymbolDataEntry("றூ", UYIRMEI2, NOTHING, Cell12456, Cell1256),
			new BrailleSymbolDataEntry("னூ", UYIRMEI2, NOTHING, Cell56, Cell1256),

			new BrailleSymbolDataEntry("கெ", UYIRMEI2, NOTHING, Cell13, Cell26),
			new BrailleSymbolDataEntry("ஙெ", UYIRMEI2, NOTHING, Cell346, Cell26),
			new BrailleSymbolDataEntry("செ", UYIRMEI2, NOTHING, Cell14, Cell26),
			new BrailleSymbolDataEntry("ஞெ", UYIRMEI2, NOTHING, Cell25, Cell26),
			new BrailleSymbolDataEntry("டெ", UYIRMEI2, NOTHING, Cell23456, Cell26),
			new BrailleSymbolDataEntry("ணெ", UYIRMEI2, NOTHING, Cell3456, Cell26),
			new BrailleSymbolDataEntry("தெ", UYIRMEI2, NOTHING, Cell2345, Cell26),
			new BrailleSymbolDataEntry("நெ", UYIRMEI2, NOTHING, Cell1345, Cell26),
			new BrailleSymbolDataEntry("பெ", UYIRMEI2, NOTHING, Cell1234, Cell26),
			new BrailleSymbolDataEntry("மெ", UYIRMEI2, NOTHING, Cell134, Cell26),
			new BrailleSymbolDataEntry("யெ", UYIRMEI2, NOTHING, Cell13456, Cell26),
			new BrailleSymbolDataEntry("ரெ", UYIRMEI2, NOTHING, Cell1235, Cell26),
			new BrailleSymbolDataEntry("லெ", UYIRMEI2, NOTHING, Cell123, Cell26),
			new BrailleSymbolDataEntry("வெ", UYIRMEI2, NOTHING, Cell1236, Cell26),
			new BrailleSymbolDataEntry("ழெ", UYIRMEI2, NOTHING, Cell12356, Cell26),
			new BrailleSymbolDataEntry("ளெ", UYIRMEI2, NOTHING, Cell456, Cell26),
			new BrailleSymbolDataEntry("றெ", UYIRMEI2, NOTHING, Cell12456, Cell26),
			new BrailleSymbolDataEntry("னெ", UYIRMEI2, NOTHING, Cell56, Cell26),

			new BrailleSymbolDataEntry("கே", UYIRMEI2, NOTHING, Cell13, Cell15),
			new BrailleSymbolDataEntry("ஙே", UYIRMEI2, NOTHING, Cell346, Cell15),
			new BrailleSymbolDataEntry("சே", UYIRMEI2, NOTHING, Cell14, Cell15),
			new BrailleSymbolDataEntry("ஞே", UYIRMEI2, NOTHING, Cell25, Cell15),
			new BrailleSymbolDataEntry("டே", UYIRMEI2, NOTHING, Cell23456, Cell15),
			new BrailleSymbolDataEntry("ணே", UYIRMEI2, NOTHING, Cell3456, Cell15),
			new BrailleSymbolDataEntry("தே", UYIRMEI2, NOTHING, Cell2345, Cell15),
			new BrailleSymbolDataEntry("நே", UYIRMEI2, NOTHING, Cell1345, Cell15),
			new BrailleSymbolDataEntry("பே", UYIRMEI2, NOTHING, Cell1234, Cell15),
			new BrailleSymbolDataEntry("மே", UYIRMEI2, NOTHING, Cell134, Cell15),
			new BrailleSymbolDataEntry("யே", UYIRMEI2, NOTHING, Cell13456, Cell15),
			new BrailleSymbolDataEntry("ரே", UYIRMEI2, NOTHING, Cell1235, Cell15),
			new BrailleSymbolDataEntry("லே", UYIRMEI2, NOTHING, Cell123, Cell15),
			new BrailleSymbolDataEntry("வே", UYIRMEI2, NOTHING, Cell1236, Cell15),
			new BrailleSymbolDataEntry("ழே", UYIRMEI2, NOTHING, Cell12356, Cell15),
			new BrailleSymbolDataEntry("ளே", UYIRMEI2, NOTHING, Cell456, Cell15),
			new BrailleSymbolDataEntry("றே", UYIRMEI2, NOTHING, Cell12456, Cell15),
			new BrailleSymbolDataEntry("னே ", UYIRMEI2, NOTHING, Cell56, Cell15),

			new BrailleSymbolDataEntry("கை", UYIRMEI2, NOTHING, Cell13, Cell34),
			new BrailleSymbolDataEntry("ஙை", UYIRMEI2, NOTHING, Cell346, Cell34),
			new BrailleSymbolDataEntry("சை", UYIRMEI2, NOTHING, Cell14, Cell34),
			new BrailleSymbolDataEntry("ஞை", UYIRMEI2, NOTHING, Cell25, Cell34),
			new BrailleSymbolDataEntry("டை", UYIRMEI2, NOTHING, Cell23456, Cell34),
			new BrailleSymbolDataEntry("ணை", UYIRMEI2, NOTHING, Cell3456, Cell34),
			new BrailleSymbolDataEntry("தை", UYIRMEI2, NOTHING, Cell2345, Cell34),
			new BrailleSymbolDataEntry("நை", UYIRMEI2, NOTHING, Cell1345, Cell34),
			new BrailleSymbolDataEntry("பை", UYIRMEI2, NOTHING, Cell1234, Cell34),
			new BrailleSymbolDataEntry("மை", UYIRMEI2, NOTHING, Cell134, Cell34),
			new BrailleSymbolDataEntry("யை", UYIRMEI2, NOTHING, Cell13456, Cell34),
			new BrailleSymbolDataEntry("ரை", UYIRMEI2, NOTHING, Cell1235, Cell34),
			new BrailleSymbolDataEntry("லை", UYIRMEI2, NOTHING, Cell123, Cell34),
			new BrailleSymbolDataEntry("வை", UYIRMEI2, NOTHING, Cell1236, Cell34),
			new BrailleSymbolDataEntry("ழை", UYIRMEI2, NOTHING, Cell12356, Cell34),
			new BrailleSymbolDataEntry("ளை", UYIRMEI2, NOTHING, Cell456, Cell34),
			new BrailleSymbolDataEntry("றை", UYIRMEI2, NOTHING, Cell12456, Cell34),
			new BrailleSymbolDataEntry("னை", UYIRMEI2, NOTHING, Cell56, Cell34),

			new BrailleSymbolDataEntry("கொ", UYIRMEI2, NOTHING, Cell13, Cell1346),
			new BrailleSymbolDataEntry("ஙொ", UYIRMEI2, NOTHING, Cell346, Cell1346),
			new BrailleSymbolDataEntry("சொ", UYIRMEI2, NOTHING, Cell14, Cell1346),
			new BrailleSymbolDataEntry("ஞொ", UYIRMEI2, NOTHING, Cell25, Cell1346),
			new BrailleSymbolDataEntry("டொ", UYIRMEI2, NOTHING, Cell23456, Cell1346),
			new BrailleSymbolDataEntry("ணொ", UYIRMEI2, NOTHING, Cell3456, Cell1346),
			new BrailleSymbolDataEntry("தொ", UYIRMEI2, NOTHING, Cell2345, Cell1346),
			new BrailleSymbolDataEntry("நொ", UYIRMEI2, NOTHING, Cell1345, Cell1346),
			new BrailleSymbolDataEntry("பொ", UYIRMEI2, NOTHING, Cell1234, Cell1346),
			new BrailleSymbolDataEntry("மொ", UYIRMEI2, NOTHING, Cell134, Cell1346),
			new BrailleSymbolDataEntry("யொ", UYIRMEI2, NOTHING, Cell13456, Cell1346),
			new BrailleSymbolDataEntry("ரொ", UYIRMEI2, NOTHING, Cell1235, Cell1346),
			new BrailleSymbolDataEntry("லொ", UYIRMEI2, NOTHING, Cell123, Cell1346),
			new BrailleSymbolDataEntry("வொ", UYIRMEI2, NOTHING, Cell1236, Cell1346),
			new BrailleSymbolDataEntry("ழொ", UYIRMEI2, NOTHING, Cell12356, Cell1346),
			new BrailleSymbolDataEntry("ளொ", UYIRMEI2, NOTHING, Cell456, Cell1346),
			new BrailleSymbolDataEntry("றொ", UYIRMEI2, NOTHING, Cell12456, Cell1346),
			new BrailleSymbolDataEntry("னொ", UYIRMEI2, NOTHING, Cell56, Cell1346),

			new BrailleSymbolDataEntry("கோ", UYIRMEI2, NOTHING, Cell13, Cell135),
			new BrailleSymbolDataEntry("ஙோ", UYIRMEI2, NOTHING, Cell346, Cell135),
			new BrailleSymbolDataEntry("சோ", UYIRMEI2, NOTHING, Cell14, Cell135),
			new BrailleSymbolDataEntry("ஞோ", UYIRMEI2, NOTHING, Cell25, Cell135),
			new BrailleSymbolDataEntry("டோ", UYIRMEI2, NOTHING, Cell23456, Cell135),
			new BrailleSymbolDataEntry("ணோ", UYIRMEI2, NOTHING, Cell3456, Cell135),
			new BrailleSymbolDataEntry("தோ", UYIRMEI2, NOTHING, Cell2345, Cell135),
			new BrailleSymbolDataEntry("நோ", UYIRMEI2, NOTHING, Cell1345, Cell135),
			new BrailleSymbolDataEntry("போ", UYIRMEI2, NOTHING, Cell1234, Cell135),
			new BrailleSymbolDataEntry("மோ", UYIRMEI2, NOTHING, Cell134, Cell135),
			new BrailleSymbolDataEntry("யோ", UYIRMEI2, NOTHING, Cell13456, Cell135),
			new BrailleSymbolDataEntry("ரோ", UYIRMEI2, NOTHING, Cell1235, Cell135),
			new BrailleSymbolDataEntry("லோ", UYIRMEI2, NOTHING, Cell123, Cell135),
			new BrailleSymbolDataEntry("வோ", UYIRMEI2, NOTHING, Cell1236, Cell135),
			new BrailleSymbolDataEntry("ழோ", UYIRMEI2, NOTHING, Cell12356, Cell135),
			new BrailleSymbolDataEntry("ளோ", UYIRMEI2, NOTHING, Cell456, Cell135),
			new BrailleSymbolDataEntry("றோ", UYIRMEI2, NOTHING, Cell12456, Cell135),
			new BrailleSymbolDataEntry("னோ", UYIRMEI2, NOTHING, Cell56, Cell135),

			new BrailleSymbolDataEntry("கௌ", UYIRMEI2, NOTHING, Cell13, Cell246),
			new BrailleSymbolDataEntry("சௌ", UYIRMEI2, NOTHING, Cell14, Cell246),
			new BrailleSymbolDataEntry("ஞௌ", UYIRMEI2, NOTHING, Cell25, Cell246),
			new BrailleSymbolDataEntry("டௌ", UYIRMEI2, NOTHING, Cell23456, Cell246),
			new BrailleSymbolDataEntry("ணௌ", UYIRMEI2, NOTHING, Cell3456, Cell246),
			new BrailleSymbolDataEntry("தௌ", UYIRMEI2, NOTHING, Cell2345, Cell246),
			new BrailleSymbolDataEntry("நௌ", UYIRMEI2, NOTHING, Cell1345, Cell246),
			new BrailleSymbolDataEntry("பௌ", UYIRMEI2, NOTHING, Cell1234, Cell246),
			new BrailleSymbolDataEntry("மௌ", UYIRMEI2, NOTHING, Cell134, Cell246),
			new BrailleSymbolDataEntry("யௌ", UYIRMEI2, NOTHING, Cell13456, Cell246),
			new BrailleSymbolDataEntry("ரௌ", UYIRMEI2, NOTHING, Cell1235, Cell246),
			new BrailleSymbolDataEntry("லௌ", UYIRMEI2, NOTHING, Cell123, Cell246),
			new BrailleSymbolDataEntry("வௌ", UYIRMEI2, NOTHING, Cell1236, Cell246),
			new BrailleSymbolDataEntry("ழௌ", UYIRMEI2, NOTHING, Cell12356, Cell246),
			new BrailleSymbolDataEntry("ளௌ", UYIRMEI2, NOTHING, Cell456, Cell246),
			new BrailleSymbolDataEntry("றௌ", UYIRMEI2, NOTHING, Cell12456, Cell246),
			new BrailleSymbolDataEntry("னௌ", UYIRMEI2, NOTHING, Cell56, Cell246),

			//Sanskrit alphabets used in Tamil
			new BrailleSymbolDataEntry("ஷ", GRANTHA, NOTHING, Cell12346),
			new BrailleSymbolDataEntry("ஸ", GRANTHA, NOTHING, Cell234),
			new BrailleSymbolDataEntry("ஹ", GRANTHA, NOTHING, Cell125),
			new BrailleSymbolDataEntry("க்ஷ", GRANTHA, NOTHING, Cell12345),
			new BrailleSymbolDataEntry("ஜ", GRANTHA, NOTHING, Cell245),

			new BrailleSymbolDataEntry("ஜ்", GRANTHA, NOTHING, Cell4, Cell245),
			new BrailleSymbolDataEntry("ஷ்", GRANTHA, NOTHING, Cell4, Cell12346),
			new BrailleSymbolDataEntry("ஸ்", GRANTHA, NOTHING, Cell4, Cell234),
			new BrailleSymbolDataEntry("ஹ்", GRANTHA, NOTHING, Cell4, Cell125),
			new BrailleSymbolDataEntry("க்ஷ்", GRANTHA, NOTHING, Cell4, Cell12345),

			new BrailleSymbolDataEntry("ஜா", GRANTHA, NOTHING, Cell245, Cell345),
			new BrailleSymbolDataEntry("ஷா", GRANTHA, NOTHING, Cell12346, Cell345),
			new BrailleSymbolDataEntry("ஸா", GRANTHA, NOTHING, Cell234, Cell345),
			new BrailleSymbolDataEntry("ஹா", GRANTHA, NOTHING, Cell125, Cell345),
			new BrailleSymbolDataEntry("க்ஷா", GRANTHA, NOTHING, Cell12345, Cell345),

			new BrailleSymbolDataEntry("ஜி", GRANTHA, NOTHING, Cell245, Cell24),
			new BrailleSymbolDataEntry("ஷி", GRANTHA, NOTHING, Cell12346, Cell24),
			new BrailleSymbolDataEntry("ஸி", GRANTHA, NOTHING, Cell234, Cell24),
			new BrailleSymbolDataEntry("ஹி", GRANTHA, NOTHING, Cell125, Cell24),
			new BrailleSymbolDataEntry("க்ஷி", GRANTHA, NOTHING, Cell12345, Cell24),

			new BrailleSymbolDataEntry("ஜீ", GRANTHA, NOTHING, Cell245, Cell35),
			new BrailleSymbolDataEntry("ஷீ", GRANTHA, NOTHING, Cell12346, Cell35),
			new BrailleSymbolDataEntry("ஸீ", GRANTHA, NOTHING, Cell234, Cell35),
			new BrailleSymbolDataEntry("ஹீ", GRANTHA, NOTHING, Cell125, Cell35),
			new BrailleSymbolDataEntry("க்ஷீ", GRANTHA, NOTHING, Cell12345, Cell35),

			new BrailleSymbolDataEntry("ஜு", GRANTHA, NOTHING, Cell245, Cell136),
			new BrailleSymbolDataEntry("ஷு", GRANTHA, NOTHING, Cell12346, Cell136),
			new BrailleSymbolDataEntry("ஸு", GRANTHA, NOTHING, Cell234, Cell136),
			new BrailleSymbolDataEntry("ஹு", GRANTHA, NOTHING, Cell125, Cell136),
			new BrailleSymbolDataEntry("க்ஷு", GRANTHA, NOTHING, Cell12345, Cell136),

			new BrailleSymbolDataEntry("ஜூ", GRANTHA, NOTHING, Cell245, Cell1256),
			new BrailleSymbolDataEntry("ஷூ", GRANTHA, NOTHING, Cell12346, Cell1256),
			new BrailleSymbolDataEntry("ஸூ", GRANTHA, NOTHING, Cell234, Cell1256),
			new BrailleSymbolDataEntry("ஹூ", GRANTHA, NOTHING, Cell125, Cell1256),
			new BrailleSymbolDataEntry("க்ஷூ", GRANTHA, NOTHING, Cell12345, Cell1256),

			new BrailleSymbolDataEntry("ஜெ", GRANTHA, NOTHING, Cell245, Cell26),
			new BrailleSymbolDataEntry("ஷெ", GRANTHA, NOTHING, Cell12346, Cell26),
			new BrailleSymbolDataEntry("ஸெ", GRANTHA, NOTHING, Cell234, Cell26),
			new BrailleSymbolDataEntry("ஹெ", GRANTHA, NOTHING, Cell125, Cell26),
			new BrailleSymbolDataEntry("க்ஷெ", GRANTHA, NOTHING, Cell12345, Cell26),

			new BrailleSymbolDataEntry("ஜே", GRANTHA, NOTHING, Cell245, Cell15),
			new BrailleSymbolDataEntry("ஷே", GRANTHA, NOTHING, Cell12346, Cell15),
			new BrailleSymbolDataEntry("ஸே", GRANTHA, NOTHING, Cell234, Cell15),
			new BrailleSymbolDataEntry("ஹே", GRANTHA, NOTHING, Cell125, Cell15),
			new BrailleSymbolDataEntry("க்ஷே", GRANTHA, NOTHING, Cell12345, Cell15),

			new BrailleSymbolDataEntry("ஜை", GRANTHA, NOTHING, Cell245, Cell34),
			new BrailleSymbolDataEntry("ஷை", GRANTHA, NOTHING, Cell12346, Cell34),
			new BrailleSymbolDataEntry("ஸை", GRANTHA, NOTHING, Cell234, Cell34),
			new BrailleSymbolDataEntry("ஹை", GRANTHA, NOTHING, Cell125, Cell34),
			new BrailleSymbolDataEntry("க்ஷை", GRANTHA, NOTHING, Cell12345, Cell34),

			new BrailleSymbolDataEntry("ஜொ", GRANTHA, NOTHING, Cell245, Cell1346),
			new BrailleSymbolDataEntry("ஷொ", GRANTHA, NOTHING, Cell12346, Cell1346),
			new BrailleSymbolDataEntry("ஸொ", GRANTHA, NOTHING, Cell234, Cell1346),
			new BrailleSymbolDataEntry("ஹொ", GRANTHA, NOTHING, Cell125, Cell1346),
			new BrailleSymbolDataEntry("க்ஷொ", GRANTHA, NOTHING, Cell12345, Cell1346),

			new BrailleSymbolDataEntry("ஜோ", GRANTHA, NOTHING, Cell245, Cell135),
			new BrailleSymbolDataEntry("ஷோ", GRANTHA, NOTHING, Cell12346, Cell135),
			new BrailleSymbolDataEntry("ஸோ", GRANTHA, NOTHING, Cell234, Cell135),
			new BrailleSymbolDataEntry("ஹோ", GRANTHA, NOTHING, Cell125, Cell135),
			new BrailleSymbolDataEntry("க்ஷோ", GRANTHA, NOTHING, Cell12345, Cell135),

			new BrailleSymbolDataEntry("ஜௌ", GRANTHA, NOTHING, Cell245, Cell246),
			new BrailleSymbolDataEntry("ஷௌ", GRANTHA, NOTHING, Cell12346, Cell246),
			new BrailleSymbolDataEntry("ஸௌ", GRANTHA, NOTHING, Cell234, Cell246),
			new BrailleSymbolDataEntry("ஹௌ", GRANTHA, NOTHING, Cell125, Cell246),
			new BrailleSymbolDataEntry("க்ஷெள", GRANTHA, NOTHING, Cell12345, Cell246),


//Numbers
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

//Punctuation
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
	};

	public BrailleSymbolDataEntry[] getAllSymbols()
	{
		return allSymbols;
	}

	public DictionaryCategory[] getDictionaryCategories()
	{
		return new DictionaryCategory[]{
				new DictionaryCategory(R.string.symbol_uyir, 0, "அ", UYIR),
				new DictionaryCategory(R.string.symbol_uyirmei1, 1, "க", UYIRMEI1),
				new DictionaryCategory(R.string.symbol_mei, 4, "க்", MEI),
				new DictionaryCategory(R.string.symbol_uyirmei2, 7, "கா", UYIRMEI2).setTranslateToggle(true),
				new DictionaryCategory(R.string.symbol_grantha, 11, "ஷ", GRANTHA).setTranslateToggle(true),
				new DictionaryCategory(R.string.symbol_number, 13, "1", NUMBER),
				new DictionaryCategory(R.string.symbol_punctuation, 14, "?", PUNCTUATION)};
	}

	@Override
	public BrailleSymbolDataEntry[] getChallengeSymbols()
	{
		ArrayList<BrailleSymbolDataEntry> syms = new ArrayList<>();
		syms.addAll(getSymbolsList(UYIR));
		syms.addAll(getSymbolsList(UYIRMEI1));
		return syms.toArray(new BrailleSymbolDataEntry[syms.size()]);
	}

	public boolean canDoTranslation()
	{
		return true;
	}
}
