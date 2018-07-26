package com.lukeneedham.brailledatabase.Braille;

import android.content.Context;

import com.lukeneedham.brailledatabase.R;

import java.util.Arrays;

public class BrailleCell
{
    private boolean[] dots = new boolean[6];
    private char fontSymbol;

    public BrailleCell(boolean d1, boolean d2, boolean d3, boolean d4, boolean d5, boolean d6)
    {
        dots[0] = d1;
        dots[1] = d2;
        dots[2] = d3;
        dots[3] = d4;
        dots[4] = d5;
        dots[5] = d6;
    }

    public BrailleCell(char font, boolean d1, boolean d2, boolean d3, boolean d4, boolean d5, boolean d6)
    {
        fontSymbol = font;
        dots[0] = d1;
        dots[1] = d2;
        dots[2] = d3;
        dots[3] = d4;
        dots[4] = d5;
        dots[5] = d6;
    }

    public char getUnicodeCellSymbol()
	{
		int total = 10240;
		for(int i = 0; i < dots.length; i++)
		{
			int score = (int) Math.pow(2, i);
			if(dots[i]) total += score;
		}

		return (char) total;
	}

    public char getFontSymbol()
    {
        return fontSymbol;
    }

    public BrailleCell(boolean[] dotsIn)
    {
        if (dotsIn.length == 6)
        {
            dots = dotsIn;
        }
    }

    public boolean getDotAt(int dotNumber)
    {
        return dots[dotNumber];
    }

    public boolean equals(BrailleCell bc)
    {
        if(bc == null) return false;
        boolean equal = true;
        for (int i = 0; i < 6 && equal == true; i++)
        {
            boolean currentDot = dots[i];
            if (currentDot == bc.getDotAt(i))
            {
            }
            else
            {
                equal = false;
            }
        }
        return equal;
    }

    public String getDotsDescription(Context c)
    {
        String res = "";
        for(int i = 1; i <= dots.length; i++)
        {
            if(dots[i-1])
                res += i + ", ";
        }
		if(res.equals(""))
		{
			return c.getResources().getString(R.string.braille_space);
		}
		else
        	return c.getResources().getString(R.string.dots) + " " + res.substring(0, res.length()-2);
    }

    public String toString()
    {
        return ""+getUnicodeCellSymbol();
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BrailleCell that = (BrailleCell) o;

        return Arrays.equals(dots, that.dots);
    }

    @Override
    public int hashCode()
    {
        return Arrays.hashCode(dots);
    }
}