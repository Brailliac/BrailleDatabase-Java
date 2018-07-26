package com.lukeneedham.brailledatabase.Braille;

import android.content.Context;

import com.lukeneedham.brailledatabase.Braille.SymbolDatabases.BrailleSymbolDatabase;

import java.util.ArrayList;

/**
 * Created by Luke on 15/06/2017.
 */

public class DictionaryCategory
{
	private int nameRes;

	private String icon;

	private BrailleSymbolType[] subpages;

	private int unlockLevel;

	private boolean translationToggle = false;

	public DictionaryCategory(int n, int l,  String i, BrailleSymbolType... ps)
	{
		nameRes = n;
		unlockLevel = l;
		subpages = ps;
		icon = i;
	}

	public DictionaryCategory setTranslateToggle(boolean t)
	{
		translationToggle = t;
		return this;
	}

	public int getNameRes()
	{
		return nameRes;
	}

	public String getIcon()
	{
		return icon;
	}

	public String getName(Context c)
	{
		return c.getResources().getString(nameRes);
	}

	public BrailleSymbolType[] getSubsections()
	{
		return subpages;
	}

	public int getUnlockLevel()
	{
		return unlockLevel;
	}

	public boolean canBeToggledForTranslation()
	{
		return translationToggle;
	}

	public String toString()
	{
		return unlockLevel + "";
	}

	public boolean equals(Object obj)
	{
		try
		{
			DictionaryCategory cat = (DictionaryCategory) obj;
			return (nameRes == cat.getNameRes()) && (unlockLevel == cat.getUnlockLevel());
		}
		catch (ClassCastException ex)
		{
			try
			{
				BrailleSymbolType type = (BrailleSymbolType) obj;
				return subpages.length == 1 && subpages[0].equals(type);
			}
			catch (ClassCastException ex2)
			{
				return false;
			}
		}
	}

	public ArrayList<Object> getItems(BrailleSymbolDatabase d)
	{
		ArrayList<Object> res = new ArrayList<>();
		for(BrailleSymbolType type : subpages)
		{
			res.add(type);
			BrailleSymbolDataEntry[] entries = d.getSymbols(type);
			for(BrailleSymbolDataEntry entry : entries)
			{
				res.add(entry);
			}
		}
		return res;
	}
}
