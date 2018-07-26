package com.lukeneedham.brailledatabase.Braille.SymbolDatabases;

import android.content.Context;

import com.lukeneedham.brailledatabase.R;

import java.util.Arrays;

public enum DatabaseEnum
{
	UEB(new UEBSymbolDatabase(), R.string.database_ueb, R.string.database_ueb_desc, "eng"),
	SWEDISH(new SvenskaSymbolDatabase(), R.string.database_swedish, R.string.database_swedish_desc, "swe"),
	CZECH(new CzechSymbolDatabase(), R.string.database_czech, R.string.database_czech_desc, new String[]{"cze", "ces"}),
	SLOVAK(new SlovakSymbolDatabase(), R.string.database_slovak, R.string.database_slovak_desc, new String[]{"slo", "slk"}),
	TAMIL(new TamilSymbolDatabase(), R.string.database_tamil, R.string.database_tamil_desc, "tam"),
	SPANISH(new EspanolSymbolDatabase(), R.string.database_spanish, R.string.database_spanish_desc, "spa");


	BrailleSymbolDatabase db;
	int name;
	int desc;
	String[] locale;

	DatabaseEnum(BrailleSymbolDatabase d, int n, int de, String... locale)
	{
		db = d;
		name = n;
		desc = de;
		this.locale = locale;
	}

	public BrailleSymbolDatabase getDatabase()
	{
		return db;
	}

	public String getName(Context c)
	{
		return c.getResources().getString(name);
	}

	public String getDesc(Context c)
	{
		return c.getResources().getString(desc);
	}

	public String[] getLocale()
	{
		return locale;
	}

	public static DatabaseEnum fromLocale(String localeIn)
	{
		for (DatabaseEnum db : values())
		{
			if (Arrays.asList(db.getLocale()).contains(localeIn))
			{
				return db;
			}
		}
		return null;
	}

	public static DatabaseEnum fromSave(String s)
	{
		return valueOf(s);
	}

	public String toSave()
	{
		return name();
	}
}
