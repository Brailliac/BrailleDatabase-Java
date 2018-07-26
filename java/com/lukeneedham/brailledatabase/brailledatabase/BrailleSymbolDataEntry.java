package com.lukeneedham.brailledatabase.Braille;

import android.content.Context;

import com.lukeneedham.brailledatabase.Braille.SymbolDatabases.BrailleSymbolDatabase;
import com.lukeneedham.brailledatabase.R;

import java.util.Arrays;

/**
 * Created by Luke on 30/07/2016.
 */
public class BrailleSymbolDataEntry
{
	private final BrailleSymbol symbol; // store the list of cells and encapsulate methods on them
	private String[] possibleLettersRepresented; // the literal ascii to be read when reading this symbol - like "and", "?". Use NO_STRING when the symbol has to literal meaning (modifiers)
	private int descriptiveNameRes = 0; // the descriptive title of the symbol - like "Question mark" - should be an int referencing the value in strings.xml
	private BrailleSymbolUsageRule ruleForUsage = BrailleSymbolUsageRule.ANYWHERE; // rule for where the symbol can be used
	private BrailleSymbolType type; // type of symbol
	private OnEntryClickType onEntryClickType = OnEntryClickType.NOTHING;
	private int extraInfoRes = 0;
	private boolean fillEntryWidth = false;

	public OnEntryClickType getOnEntryClickType()
	{
		return onEntryClickType;
	}

	public int getExtraInfoRes()
	{
		return extraInfoRes;
	}

	public BrailleSymbolDataEntry(String nameIn, BrailleSymbolType typeIn, OnEntryClickType onClick, BrailleCell... cellsIn)
	{
		symbol = new BrailleSymbol(cellsIn);
		possibleLettersRepresented = new String[] {nameIn};
		type = typeIn;
		onEntryClickType = onClick;
	}

	public BrailleSymbolDataEntry(String nameIn, BrailleSymbolUsageRule ruleForUsageIn, BrailleSymbolType typeIn, OnEntryClickType onClick, BrailleCell... cellsIn)
	{
		symbol = new BrailleSymbol(cellsIn);
		possibleLettersRepresented = new String[] {nameIn};
		ruleForUsage = ruleForUsageIn;
		type = typeIn;
		onEntryClickType = onClick;
	}

	public BrailleSymbolDataEntry(String nameIn, int descRes, BrailleSymbolType typeIn, OnEntryClickType onClick, BrailleCell... cellsIn)
	{
		symbol = new BrailleSymbol(cellsIn);
		possibleLettersRepresented = new String[] {nameIn};
		descriptiveNameRes = descRes;
		type = typeIn;
		onEntryClickType = onClick;
	}

	public BrailleSymbolDataEntry(String[] nameIn, BrailleSymbolUsageRule ruleForUsageIn, BrailleSymbolType typeIn, OnEntryClickType onClick, BrailleCell... cellsIn)
	{
		symbol = new BrailleSymbol(cellsIn);
		possibleLettersRepresented = nameIn;
		ruleForUsage = ruleForUsageIn;
		type = typeIn;
		onEntryClickType = onClick;
	}

	public BrailleSymbolDataEntry(BrailleSymbol symbol, String[] possibleLettersRepresented, int descriptiveNameRes, BrailleSymbolUsageRule ruleForUsage, BrailleSymbolType type, OnEntryClickType onEntryClickType, int extraInfoRes, boolean fillEntryWidth)
	{
		this.symbol = symbol;
		this.possibleLettersRepresented = possibleLettersRepresented;
		this.descriptiveNameRes = descriptiveNameRes;
		this.ruleForUsage = ruleForUsage;
		this.type = type;
		this.onEntryClickType = onEntryClickType;
		this.extraInfoRes = extraInfoRes;
		this.fillEntryWidth = fillEntryWidth;
	}

	public BrailleSymbolDataEntry setExtraInfo(int res)
	{
		extraInfoRes = res;
		return this;
	}

	public BrailleSymbolDataEntry setFillWidth(boolean fill)
	{
		fillEntryWidth = fill;
		return this;
	}

	public boolean isFillEntryWidth()
	{
		return fillEntryWidth;
	}

	public DictionaryCategory getCategory(BrailleSymbolDatabase db)
	{
		DictionaryCategory[] cats = db.getDictionaryCategories();
		for(DictionaryCategory cat : cats)
		{
			if(Arrays.asList(cat.getSubsections()).contains(type)) return cat;
		}
		return null;
	}

	public String getOnClickText(Context c)
	{
		switch(onEntryClickType)
		{
			case SHOW_LETTERS_REP:
				return getFirstLettersRepresented();
			case SHOW_INFO:
				return c.getString(extraInfoRes);
			case SHOW_USAGE_RULE:
				return getRuleDescription(c);
			case NOTHING:
			default:
				return "";
		}
	}

	public enum OnEntryClickType
	{
		SHOW_LETTERS_REP, SHOW_INFO, SHOW_USAGE_RULE, NOTHING;
	}

	public BrailleSymbolUsageRule getRuleForUsage()
	{
		return ruleForUsage;
	}

	public BrailleSymbolType getType()
	{
		return type;
	}

	public String getFirstLettersRepresented()
	{
		return possibleLettersRepresented[0];
	}

	public String[] getAllLettersRepresented()
	{
		return possibleLettersRepresented;
	}

	public String getDescriptiveName(Context c)
	{
		if (descriptiveNameRes == 0)
		{
			return getFirstLettersRepresented();
		}
		else
		{
			return c.getResources().getString(descriptiveNameRes);
		}
	}

	public int getDescriptiveNameRes()
	{
		return descriptiveNameRes;
	}

	public BrailleCell[] getCells()
	{
		return symbol.getCells();
	}

	public String getFont()
	{
		return symbol.getFont();
	}

	public BrailleSymbol getSymbol()
	{
		return symbol;
	}

	public String toString()
	{
		return "( " + symbol.toString() + ", " + Arrays.toString(possibleLettersRepresented) + ", " + ruleForUsage.toString() + ", " + type.toString() + " )";
	}

	public String getRuleDescription(Context c)
	{
		return c.getResources().getString(R.string.theContraction) + getDescriptiveName(c) + getRuleForUsage().getRuleDescription(c);
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		BrailleSymbolDataEntry that = (BrailleSymbolDataEntry) o;

		if (symbol != null ? !symbol.equals(that.symbol) : that.symbol != null) return false;
		// Probably incorrect - comparing Object[] arrays with Arrays.equals
		if (!Arrays.equals(possibleLettersRepresented, that.possibleLettersRepresented))
			return false;
		if (ruleForUsage != that.ruleForUsage) return false;
		return type != null ? type.equals(that.type) : that.type == null;

	}

	@Override
	public int hashCode()
	{
		int result = symbol != null ? symbol.hashCode() : 0;
		result = 31 * result + Arrays.hashCode(possibleLettersRepresented);
		result = 31 * result + (ruleForUsage != null ? ruleForUsage.hashCode() : 0);
		result = 31 * result + (type != null ? type.hashCode() : 0);
		return result;
	}
}
