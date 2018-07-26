package com.lukeneedham.brailledatabase.Braille;

import android.content.Context;

import com.lukeneedham.brailledatabase.R;

/**
 * Created by Luke on 30/07/2016.
 */
public enum BrailleSymbolUsageRule
{
    ANYWHERE(R.string.rule_anywhere),
    STANDALONE(R.string.rule_standAlone, (start, end, word) -> isAtStart(word, start) && isAtEnd(word, end)),
    SURROUNDED(R.string.rule_surrounded, (start, end, word) -> !isAtStart(word, start) && !isAtEnd(word, end)),
    FIRST_SYLLABLE(R.string.rule_firstSyllable, (start, end, word) -> isAtStart(word, start)),
    NOT_AT_START(R.string.rule_notAtStart, (start, end, word) -> !isAtStart(word, start)),
    STRESS_ON_FIRST_E_AND_NOT_AFTER_I_OR_E(R.string.rule_stressFirst_E_AndDontFollow_I_Or_E, (start, end, word) -> !isAfter(word, start, 'i') && !isAfter(word, start, 'e')),
    NOT_AFTER_A_OR_O_AND_UN_NOT_A_PREFIX(R.string.rule_dontFollow_A_Or_O_And_UN_notPrefix, (start, end, word) -> !isAfter(word, start, 'a') && !isAfter(word, start, 'o')),
    ORIGINAL_MEANING_RETAINED(R.string.rule_wordMeaningRetained),
    ORIGINAL_PRONOUNCIATION_RETAINED(R.string.rule_samePronounciation),
    SHORT_A(R.string.rule_short_A),
    ONE_SYLLABLE(R.string.rule_oneSyllable),
    ONE_SYLLABLE_OR_END_WITH_ONEY_BUT_NEVER_AFTER_O(R.string.rule_oneSyllableOr_ONEY_NotAfter_O, (start, end, word) -> !isAfter(word, start, 'o')),

    //SWEDISH
    SURROUNDED_1_OR_2_SIDES_BY_PLAIN(R.string.rule_optionalSurroundedPlainBothSides, (start, end, word) -> !isAtStart(word, start) || !isAtEnd(word, end)),
    SURROUNDED_START_BY_PLAIN(R.string.rule_optionalSurroundedPlainStart, (start, end, word) -> !isAtStart(word, start)),
    SURROUNDED_1_OR_2_SIDES_BY_PLAIN_OR_STANDALONE(R.string.rule_optionalSurroundedPlainStart_standalone, (start, end, word) -> !isAtStart(word, start) || isAtEnd(word, end));

    private int ruleDescription;
	private UsageRuleCheck checker;

	private interface UsageRuleCheck
	{
		boolean check(int start, int end, String word);
	}

	BrailleSymbolUsageRule(int ruleDesc)
	{
		ruleDescription = ruleDesc;
		checker = null;
	}

    BrailleSymbolUsageRule(int ruleDesc, UsageRuleCheck c)
    {
        ruleDescription = ruleDesc;
		checker = c;
    }

    public String getRuleDescription(Context c)
    {
        return c.getResources().getString(ruleDescription);
    }


    public boolean isLegal(int start, int end, String word)
    {
		return checker == null || checker.check(start, end, word);
    }

    private static boolean isAtStart(String word, int start)
    {
        int before = start - 1;
        while (before >= 0)
        {
            char previous = word.charAt(before);
            if (isWordSplitter(previous)) return true;
            else if (!(previous == '(' || previous == '[' || previous == '{' || previous == '\'' || previous == '"'))
            {
                return false;
            }

            before--;
        }

        return true;
    }

	private static boolean isAtEnd(String word, int end)
    {
        int after = end;
        while (after < word.length())
        {
            char next = word.charAt(after);
            if (isWordSplitter(next)) return true;
            else if (!(next == ',' || next == ';' || next == ':' || next == '.' || next == '!' || next == '?' || next == '\'' || next == '"' || next == ')' || next == ']' || next == '}'))
            {
                return false;
            }

            after++;
        }

        return true;
    }

	private static boolean isAfter(String word, int start, char after)
    {
        int before = start - 1;
        while (before >= 0)
        {
            char previous = word.charAt(before);
            if (isWordSplitter(previous)) return false;
            else if (previous == after) return true;

            before--;
        }

        return false;
    }

	private static boolean isWordSplitter(char in)
    {
        return in == '-' || in == '—' || in == ' ';
    }
}
