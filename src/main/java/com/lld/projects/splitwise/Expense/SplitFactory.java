package com.lld.projects.splitwise.Expense;

import com.lld.projects.splitwise.Expense.Split.EqualExpenseSplit;
import com.lld.projects.splitwise.Expense.Split.ExpenseSplit;
import com.lld.projects.splitwise.Expense.Split.PercentageExpenseSplit;
import com.lld.projects.splitwise.Expense.Split.UnequalExpenseSplit;

public class SplitFactory {

    public static ExpenseSplit getSplitObject(ExpenseSplitType splitType) {

        switch (splitType) {
            case EQUAL:
                return new EqualExpenseSplit();
            case UNEQUAL:
                return new UnequalExpenseSplit();
            case PERCENTAGE:
                return new PercentageExpenseSplit();
            default:
                return null;
        }
    }
}
