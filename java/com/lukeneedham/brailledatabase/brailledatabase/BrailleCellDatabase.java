package com.lukeneedham.brailledatabase.Braille;

import android.content.Context;

public abstract class BrailleCellDatabase
{
	public static final BrailleCell CellEmpty = new BrailleCell(' ', false, false, false, false, false, false);

    public static final BrailleCell Cell1 = new BrailleCell('A', true, false, false, false, false, false);
    public static final BrailleCell Cell12 = new BrailleCell('B', true, true, false, false, false, false);
	public static final BrailleCell Cell123 = new BrailleCell('L', true, true, true, false, false, false);
    public static final BrailleCell Cell124 = new BrailleCell('F', true, true, false, true, false, false);
    public static final BrailleCell Cell1245 = new BrailleCell('G', true, true, false, true, true, false);
    public static final BrailleCell Cell125 = new BrailleCell('H', true, true, false, false, true, false);

	public static final BrailleCell Cell1234 = new BrailleCell('P', true, true, true, true, false, false);
	public static final BrailleCell Cell12345 = new BrailleCell('Q', true, true, true, true, true, false);
	public static final BrailleCell Cell1235 = new BrailleCell('R', true, true, true, false, true, false);
	public static final BrailleCell Cell1236 = new BrailleCell('V', true, true, true, false, false, true);

	public static final BrailleCell Cell13 = new BrailleCell('K', true, false, true, false, false, false);
	public static final BrailleCell Cell134 = new BrailleCell('M', true, false, true, true, false, false);
	public static final BrailleCell Cell1345 = new BrailleCell('N', true, false, true, true, true, false);
	public static final BrailleCell Cell13456 = new BrailleCell('Y', true, false, true, true, true, true);
	public static final BrailleCell Cell1346 = new BrailleCell('X', true, false, true, true, false, true);
	public static final BrailleCell Cell135 = new BrailleCell('O', true, false, true, false, true, false);
	public static final BrailleCell Cell1356 = new BrailleCell('Z', true, false, true, false, true, true);
	public static final BrailleCell Cell136 = new BrailleCell('U', true, false, true, false, false, true);

	public static final BrailleCell Cell14 = new BrailleCell('C', true, false, false, true, false, false);
	public static final BrailleCell Cell145 = new BrailleCell('D', true, false, false, true, true, false);
	public static final BrailleCell Cell15 = new BrailleCell('E', true, false, false, false, true, false);

    public static final BrailleCell Cell24 = new BrailleCell('I', false, true, false, true, false, false);
    public static final BrailleCell Cell245 = new BrailleCell('J', false, true, false, true, true, false);
    public static final BrailleCell Cell234 = new BrailleCell('S', false, true, true, true, false, false);
    public static final BrailleCell Cell2345 = new BrailleCell('T', false, true, true, true, true, false);
    public static final BrailleCell Cell2456 = new BrailleCell('W', false, true, false, true, true, true);


    public static final BrailleCell Cell3456 = new BrailleCell('#', false, false, true, true, true, true); // [3456]

    public static final BrailleCell Cell256 = new BrailleCell('4', false, true, false, false, true, true); //dis [256]
    public static final BrailleCell Cell236 = new BrailleCell('8', false, true, true, false, false, true); //his [236
    public static final BrailleCell Cell235 = new BrailleCell('6', false, true, true, false, true, false); //ff [235]
    public static final BrailleCell Cell2 = new BrailleCell('1', false, true, false, false, false, false); //ea [2]
    public static final BrailleCell Cell25 = new BrailleCell('3', false, true, false, false, true, false); //con, cc [25]
    public static final BrailleCell Cell23 = new BrailleCell('2', false, true, true, false, false, false); //bb, be [23]
    public static final BrailleCell Cell3 = new BrailleCell('\'', false, false, true, false, false, false); // [3]
    public static final BrailleCell Cell36 = new BrailleCell('-', false, false, true, false, false, true); // [36]
    public static final BrailleCell Cell356 = new BrailleCell('0', false, false, true, false, true, true); //was [356]

    public static final BrailleCell Cell6 = new BrailleCell(',', false, false, false, false, false, true); // [6]

    public static final BrailleCell Cell2356 = new BrailleCell('7', false, true, true, false, true, true); //were [2356]
    public static final BrailleCell Cell34 = new BrailleCell('/', false, false, true, true, false, false); //still [34]
    public static final BrailleCell Cell16 = new BrailleCell('*', true, false, false, false, false, true); //child [16]
    public static final BrailleCell Cell126 = new BrailleCell('<', true, true, false, false, false, true); // [126]
    public static final BrailleCell Cell146 = new BrailleCell('%', true, false, false, true, false, true); //shall [146]
    public static final BrailleCell Cell1456 = new BrailleCell('?', true, false, false, true, true, true); //this [1456]
    public static final BrailleCell Cell156 = new BrailleCell(':', true, false, false, false, true, true); //which [156]
    public static final BrailleCell Cell1246 = new BrailleCell('$', true, true, false, true, false, true); // [1246]
    public static final BrailleCell Cell12456 = new BrailleCell(']', true, true, false, true, true, true); // [12456]
    public static final BrailleCell Cell1256 = new BrailleCell('\\', true, true, false, false, true, true); //out [1256]
    public static final BrailleCell Cell246 = new BrailleCell('[', false, true, false, true, false, true); // [246]
    public static final BrailleCell Cell26 = new BrailleCell('5', false, true, false, false, false, true); //enough [26]
    public static final BrailleCell Cell346 = new BrailleCell('+', false, false, true, true, false, true); // [346]
    public static final BrailleCell Cell345 = new BrailleCell('>', false, false, true, true, true, false); // [345]
    public static final BrailleCell Cell35 = new BrailleCell('9', false, false, true, false, true, false); // [35]

    public static final BrailleCell Cell12346 = new BrailleCell('&', true, true, true, true, false, true); // [12346]
    public static final BrailleCell Cell123456 = new BrailleCell('=', true, true, true, true, true, true); // [123456]
    public static final BrailleCell Cell12356 = new BrailleCell('(', true, true, true, false, true, true); // [12356]
    public static final BrailleCell Cell2346 = new BrailleCell('!', false, true, true, true, false, true); // [2346]
    public static final BrailleCell Cell23456 = new BrailleCell(')', false, true, true, true, true, true); // [23456]

    public static final BrailleCell Cell5 = new BrailleCell('"', false, false, false, false, true, false); // [5]
    public static final BrailleCell Cell45 = new BrailleCell('^', false, false, false, true, true, false); // [45]
    public static final BrailleCell Cell456 = new BrailleCell('_', false, false, false, true, true, true); // [456]
    public static final BrailleCell Cell46 = new BrailleCell('.', false, false, false, true, false, true); // [46]
    public static final BrailleCell Cell56 = new BrailleCell(';', false, false, false, false, true, true); // [56]
    public static final BrailleCell Cell4 = new BrailleCell('@', false, false, false, true, false, false); // [4]

    private static final BrailleCell[] allCells = {Cell1, Cell12, Cell14, Cell145, Cell15, Cell124, Cell1245, Cell125, Cell24, Cell245, Cell13, Cell123, Cell134, Cell1345, Cell135, Cell1234, Cell12345, Cell1235, Cell234, Cell2345, Cell136, Cell1236, Cell2456, Cell1346,
			Cell13456, Cell1356, CellEmpty, Cell3456, Cell256, Cell236, Cell235, Cell2, Cell25, Cell23, Cell3, Cell36, Cell356,
			Cell6, Cell2356, Cell34, Cell16, Cell126, Cell146, Cell1456, Cell156, Cell1246, Cell12456, Cell1256, Cell246, Cell26, Cell346, Cell345, Cell35, Cell12346, Cell123456, Cell12356, Cell2346, Cell23456, Cell4, Cell5, Cell45, Cell456, Cell46, Cell56};

    public static BrailleCell lookUpCell(BrailleCell in)
    {
        for(BrailleCell cell : allCells)
        {
            if(cell.equals(in))
                return cell;
        }
        return null;
    }

    public static BrailleCell lookUpCell(char font)
    {
        for(BrailleCell cell : allCells)
        {
            if(cell.getFontSymbol()==font)
                return cell;
        }
        return null;
    }

    public static String getDotDescriptionsFromFont(String font, Context con)
    {
        StringBuilder res = new StringBuilder();

        for(char c : font.toCharArray())
        {
            BrailleCell cell = lookUpCell(c);
            if(cell != null)
            {
                res.append(cell.getDotsDescription(con)).append(". ");
            }
        }

        return res.toString();
    }
}
