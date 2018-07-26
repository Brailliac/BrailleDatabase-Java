package com.lukeneedham.brailledatabase.Braille.SymbolDatabases;

import android.content.Context;
import android.support.annotation.NonNull;

import com.lukeneedham.brailledatabase.Braille.BrailleSymbol;
import com.lukeneedham.brailledatabase.Braille.BrailleSymbolDataEntry;
import com.lukeneedham.brailledatabase.Braille.DictionaryCategory;
import com.lukeneedham.brailledatabase.R;
import com.lukeneedham.brailledatabase.Braille.BrailleSymbolType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class BrailleSymbolDatabase
{
	public static final String NO_STRING = "";
	private final int LONGEST_BRAILLE_WORD;
	private final int LONGEST_BRAILLE_SYMBOL_CELLS;

	private Map<BrailleSymbolType, List<BrailleSymbolDataEntry>> symbolTypes;

	public BrailleSymbolDatabase()
	{
		LONGEST_BRAILLE_WORD = findLongestBrailleWord();
		LONGEST_BRAILLE_SYMBOL_CELLS = findLongestSymbolCells();

		symbolTypes = new HashMap<>();

		for (BrailleSymbolDataEntry entry : getAllSymbols())
		{
			BrailleSymbolType type = entry.getType();
			if (symbolTypes.containsKey(type))
			{
				symbolTypes.get(type).add(entry);
			}
			else
			{
				ArrayList<BrailleSymbolDataEntry> newList = new ArrayList<>();
				newList.add(entry);
				symbolTypes.put(type, newList);
			}
		}
	}

	public boolean canDoChallenge()
	{
		return getChallengeSymbols() != null;
	}

	public abstract boolean canDoTranslation();

	public List<BrailleSymbolDataEntry> getSymbolsList(BrailleSymbolType type)
	{
		return symbolTypes.get(type);
	}

	public BrailleSymbolDataEntry[] getSymbols(BrailleSymbolType type)
	{
		List<BrailleSymbolDataEntry> list = getSymbolsList(type);
		return list.toArray(new BrailleSymbolDataEntry[list.size()]);
	}

	public BrailleSymbolDataEntry[] getSymbols(DictionaryCategory category)
	{
		List<BrailleSymbolDataEntry> symbols = new ArrayList<>();
		for (BrailleSymbolType type : category.getSubsections())
		{
			symbols.addAll(getSymbolsList(type));
		}
		return symbols.toArray(new BrailleSymbolDataEntry[symbols.size()]);
	}

	public BrailleSymbolDataEntry[] getDefaultPractise()
	{
		DictionaryCategory[] cats = getDictionaryCategories();
		List<BrailleSymbolDataEntry> res = new ArrayList<>();

		for (DictionaryCategory cat : cats)
		{
			if (cat.getUnlockLevel() == 0) // default category
			{
				BrailleSymbolType[] types = cat.getSubsections();
				for (BrailleSymbolType t : types)
				{
					res.addAll(Arrays.asList(getSymbols(t)));
				}
			}
		}

		return res.toArray(new BrailleSymbolDataEntry[res.size()]);
	}

	public int getLongestBrailleWord()
	{
		return LONGEST_BRAILLE_WORD;
	}

	public int getLongestBrailleSymbolCells()
	{
		return LONGEST_BRAILLE_SYMBOL_CELLS;
	}

	@NonNull
	public List<BrailleSymbolDataEntry> findSymbolDataByLettersRepresented(String in)
	{
		ArrayList<BrailleSymbolDataEntry> res = new ArrayList<>();
		for (int i = 0; i < getAllSymbols().length; i++)
		{
			if (getAllSymbols()[i].getFirstLettersRepresented().equals(in))
			{
				res.add(getAllSymbols()[i]);
			}
		}
		return res;
	}

	@NonNull
	public List<BrailleSymbolDataEntry> findSymbolDataByDescription(String in, Context c)
	{
		ArrayList<BrailleSymbolDataEntry> res = new ArrayList<>();
		in = in.toLowerCase();
		for (int i = 0; i < getAllSymbols().length; i++)
		{
			if (getAllSymbols()[i].getDescriptiveName(c).toLowerCase().equals(in))
			{
				res.add(getAllSymbols()[i]);
			}
		}
		return res;
	}

	@NonNull
	public List<BrailleSymbolDataEntry> findSymbolDataByDescription(int in)
	{
		ArrayList<BrailleSymbolDataEntry> res = new ArrayList<>();
		for (int i = 0; i < getAllSymbols().length; i++)
		{
			if (getAllSymbols()[i].getDescriptiveNameRes() == in)
			{
				res.add(getAllSymbols()[i]);
			}
		}
		return res;
	}

	public List<BrailleSymbolDataEntry> findSymbolDataByFont(String font)
	{
		ArrayList<BrailleSymbolDataEntry> symbols = new ArrayList<>();
		for (int i = 0; i < getAllSymbols().length; i++)
		{
			BrailleSymbolDataEntry current = getAllSymbols()[i];

			if (font.equals(current.getFont()))
			{
				symbols.add(current);
			}
		}
		if (symbols.size() == 0) return null;
		else return symbols;
	}

	@NonNull
	public List<BrailleSymbolDataEntry> findSymbolDataBySymbol(BrailleSymbol brailleCharIn)
	{
		ArrayList<BrailleSymbolDataEntry> symbols = new ArrayList<>();
		for (int i = 0; i < getAllSymbols().length; i++)
		{
			BrailleSymbolDataEntry currentSymbol = getAllSymbols()[i];
			if (brailleCharIn.equals(currentSymbol.getSymbol()))
			{
				symbols.add(currentSymbol);
			}
		}

		return symbols;
	}

	private int findLongestBrailleWord()
	{
		int maxLength = 0;
		for (BrailleSymbolDataEntry entry : getAllSymbols())
		{
			String[] allLetters = entry.getAllLettersRepresented();
			for (String letter : allLetters)
			{
				int checkLength = letter.length();
				if (checkLength > maxLength)
				{
					maxLength = checkLength;
				}
			}
		}
		return maxLength;
	}

	private int findLongestSymbolCells()
	{
		int maxLength = 0;
		for (BrailleSymbolDataEntry entry : getAllSymbols())
		{
			int checkLength = entry.getCells().length;
			if (checkLength > maxLength)
			{
				maxLength = checkLength;
			}
		}
		return maxLength;
	}

	public abstract BrailleSymbolDataEntry[] getAllSymbols();

	public abstract DictionaryCategory[] getDictionaryCategories();

	public abstract BrailleSymbolDataEntry[] getChallengeSymbols();

	public BrailleSymbolDataEntry getCapitalSymbol()
	{
		return findSymbolDataByDescription(R.string.braille_capital).get(0);
	}

	public BrailleSymbolDataEntry getCapitalWordSymbol()
	{
		return findSymbolDataByDescription(R.string.braille_capitalword).get(0);
	}

	public BrailleSymbolDataEntry getCloseQuote()
	{
		return findSymbolDataByDescription(R.string.braille_closequote).get(0);
	}

	public BrailleSymbolDataEntry getOpenQuote()
	{
		return findSymbolDataByDescription(R.string.braille_openquote).get(0);
	}

	public BrailleSymbolDataEntry getSpace()
	{
		return findSymbolDataByLettersRepresented(" ").get(0);
	}

	public String toString()
	{
		String res = "";
		for (BrailleSymbolDataEntry entry : getAllSymbols())
		{
			res += entry.getFirstLettersRepresented() + " ";
		}
		return res;
	}
}
