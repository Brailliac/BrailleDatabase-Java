package com.lukeneedham.brailledatabase.Braille;

import java.util.ArrayList;

/**
 * Created by Luke on 24/08/2017.
 */

public class BrailleCategoryUseList
{
	ArrayList<BrailleCategoryUse> list;

	public BrailleCategoryUseList()
	{
		list = new ArrayList<>();
	}

	public void add(BrailleCategoryUse in)
	{
		list.add(in);
	}

	public BrailleCategoryUse getCategory(DictionaryCategory cat)
	{
		for(BrailleCategoryUse useC : list)
		{
			if(useC.getCategory().equals(cat))
			{
				return useC;
			}
		}
		return null;
	}

	public boolean forceCategory(DictionaryCategory cat)
	{
		BrailleCategoryUse u = getCategory(cat);
		return (u != null && u.isForce());
	}

	public static class BrailleCategoryUse
	{
		private DictionaryCategory category;
		private boolean force;

		public BrailleCategoryUse(DictionaryCategory category, boolean force)
		{
			this.category = category;
			this.force = force;
		}

		public DictionaryCategory getCategory()
		{
			return category;
		}

		public boolean isForce()
		{
			return force;
		}

		public String toString()
		{
			return "(" + category.getNameRes() + ", " + force + ")";
		}
	}
}
