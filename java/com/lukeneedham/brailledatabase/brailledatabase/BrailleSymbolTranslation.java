package com.lukeneedham.brailledatabase.Braille;

import android.util.Log;
import android.util.Pair;

import com.lukeneedham.brailledatabase.Braille.SymbolDatabases.BrailleSymbolDatabase;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by Luke on 13/08/2016.
 */
public class BrailleSymbolTranslation
{
    private List<BrailleSymbolDataEntry> translation;

    public BrailleSymbolTranslation()
    {
        translation = new ArrayList<>();
    }

    public BrailleSymbolTranslation(BrailleSymbolTranslation trans)
    {
        translation = new ArrayList<>(trans.getSymbols());
    }

	public BrailleSymbolTranslation(List<BrailleSymbolDataEntry> entries)
	{
		translation = new ArrayList<>(entries);
	}

    public void add(BrailleSymbolDataEntry entry)
    {
        translation.add(entry);
    }

    public void prepend(BrailleSymbolDataEntry entry)
	{
		translation.add(0, entry);
	}

    public void addAll(List<BrailleSymbolDataEntry> entry)
    {
        translation.addAll(entry);
    }

    public BrailleSymbolDataEntry pop()
	{
		int lastPos = translation.size() - 1;
		BrailleSymbolDataEntry last = translation.get(lastPos);
		translation.remove(lastPos);
		return last;
	}

	public void clear()
	{
		translation.clear();
	}

	/*
		@return Pair< position of symbol, position of cell within that symbol >
	 */
	@Nullable
	public kotlin.Pair<Integer, Integer> findAtCellPosition(int cellPosToFind)
	{
		int count = 0;
		for(int brailleSymbolDateEntryPos = 0; brailleSymbolDateEntryPos < translation.size(); brailleSymbolDateEntryPos++)
		{
			BrailleCell[] cellsInEntry = translation.get(brailleSymbolDateEntryPos).getCells();
			for(int brailleSymbolCellPos = 0; brailleSymbolCellPos < cellsInEntry.length; brailleSymbolCellPos++)
			{
				count++;
				if(count > cellPosToFind)
				{
					return new kotlin.Pair<>(brailleSymbolDateEntryPos, brailleSymbolCellPos);
				}
			}
		}
		return null;
	}

    public void concatenate(BrailleSymbolTranslation entry)
    {
        translation.addAll(entry.getSymbols());
    }

    // the string to match to the regex
    public String getStringForRegex()
	{
		String res = "";
		for(BrailleSymbolDataEntry entry : getSymbols())
		{
			String lettersRep = entry.getFirstLettersRepresented();
			if(lettersRep.equals(BrailleSymbolDatabase.NO_STRING))
			{
				res += entry.getFont();
			}
			else
			{
				res += entry.getFirstLettersRepresented();
			}
		}
		return res;
	}

	// the regex pattern to match
	public String getRegexPattern()
	{
		String res = "^";
		for(BrailleSymbolDataEntry entry : getSymbols())
		{
			if(entry.getType().equals(BrailleSymbolType.UNKNOWN))
			{
				for(char a : entry.getFirstLettersRepresented().toCharArray())
				{
					res += ".?"; // 0 or 1 char wildcard
				}
			}
			else
			{
				String lettersRep = entry.getFirstLettersRepresented();
				if(lettersRep.equals("“") || lettersRep.equals("”"))
				{
					res += String.format("(%s|%s)", Pattern.quote(lettersRep), Pattern.quote("\""));
				}
				else
				{
					if(lettersRep.equals(BrailleSymbolDatabase.NO_STRING))
					{
						res += Pattern.quote(entry.getFont());
					}
					else
					{
						res += Pattern.quote(entry.getFirstLettersRepresented());
					}
				}
			}
		}
		return res;
	}

    public List<BrailleSymbolDataEntry> getSymbols()
    {
        return translation;
    }

    public int length()
    {
        return translation.size();
    }

    public String getFont()
    {
        String tran = "";
        for (BrailleSymbolDataEntry data : translation)
        {
            tran += data.getFont();
        }
        return tran;
    }

    public ArrayList<BrailleCell> getCells()
    {
        ArrayList<BrailleCell> cells = new ArrayList<>();

        for (BrailleSymbolDataEntry data : translation)
        {
			BrailleCell[] currentCells = data.getCells();
			if(currentCells != null)
			{
				cells.addAll(Arrays.asList(currentCells));
			}
        }

        return cells;
    }

	public List<List<BrailleCell>> getNestedCells()
	{
		List<List<BrailleCell>> cells = new ArrayList<>();

		for (BrailleSymbolDataEntry data : translation)
		{
			BrailleCell[] currentCells = data.getCells();
			if(currentCells != null)
			{
				cells.add(Arrays.asList(currentCells));
			}
		}

		return cells;
	}

    public String getLettersRepresented()
    {
        String tran = "";
        for (BrailleSymbolDataEntry data : translation)
        {
            tran += data.getFirstLettersRepresented();
        }
        return tran;
    }

    public String toString()
    {
        return getFont() + " -- " + getLettersRepresented();
    }
}
