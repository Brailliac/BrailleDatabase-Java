package com.lukeneedham.brailledatabase.Braille;

import android.content.Context;

import com.lukeneedham.brailledatabase.R;

/**
 * Created by Luke on 15/06/2017.
 */

public enum BrailleSymbolType
{
	UNKNOWN(R.string.symbol_unknown, R.string.symbol_unknown_desc),
	INVISIBLE(R.string.symbol_invisible, R.string.symbol_invisible_desc),
	PUNCTUATION(R.string.symbol_punctuation, R.string.symbol_punctuation_desc),
	NUMBER(R.string.symbol_number, R.string.symbol_number_desc),
	MATHS(R.string.symbol_maths, R.string.symbol_maths_desc),

	// latin
	LETTER(R.string.symbol_letter, R.string.symbol_letter_desc),

	// swedish
	SHORT_1(R.string.symbol_short1, R.string.symbol_short1_desc),
	SHORT_2A(R.string.symbol_short2a, R.string.symbol_short2a_desc),
	SHORT_2B(R.string.symbol_short2b, R.string.symbol_short2b_desc),
	SHORT_2C(R.string.symbol_short2c, R.string.symbol_short2c_desc),
	FOREIGN(R.string.symbol_foreign, R.string.symbol_foreign_desc),

	//tamil
	UYIR(R.string.symbol_uyir, R.string.symbol_uyir_desc),
	UYIRMEI1(R.string.symbol_uyirmei1, R.string.symbol_uyirmei1_desc),
	MEI(R.string.symbol_mei, R.string.symbol_mei_desc),
	UYIRMEI2(R.string.symbol_uyirmei2, R.string.symbol_uyirmei2_desc),
	GRANTHA(R.string.symbol_grantha, R.string.symbol_grantha_desc),

	// ueb
	WORDSIGN(R.string.symbol_wordsign, R.string.symbol_wordsign_desc),
	GROUPSIGN(R.string.symbol_groupsign, R.string.symbol_groupsign_desc),
	INITIALLETTERCONTRACTION(R.string.symbol_initiallettercontraction, R.string.symbol_initiallettercontraction_desc),
	FINALLETTERCONTRACTION(R.string.symbol_finallettercontraction, R.string.symbol_finallettercontraction_desc),
	SHORTFORM(R.string.symbol_shortform, R.string.symbol_shortform_desc);

	private int nameRes;
	private int descRes;

	BrailleSymbolType(int nameRes, int descRes)
	{
		this.nameRes = nameRes;
		this.descRes = descRes;
	}

	public String getName(Context c)
	{
		return c.getResources().getString(nameRes);
	}

	public String getDesc(Context c)
	{
		return c.getResources().getString(descRes);
	}

	public String toString()
	{
		return name();
	}

}
