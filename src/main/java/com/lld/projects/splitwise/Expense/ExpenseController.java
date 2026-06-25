package com.lld.projects.splitwise.Expense;

import com.lld.projects.splitwise.BalanceSheetController;
import com.lld.projects.splitwise.Expense.Split.ExpenseSplit;
import com.lld.projects.splitwise.Expense.Split.Split;
import com.lld.projects.splitwise.User.User;

import java.util.List;

public class ExpenseController {

    BalanceSheetController balanceSheetController;

    public ExpenseController() {
        balanceSheetController = new BalanceSheetController();
    }

    public Expense createExpense(String expenseId, String description, double expenseAmount,
                                 List<Split> splitDetails, ExpenseSplitType splitType, User paidByUser) {

        ExpenseSplit expenseSplit = SplitFactory.getSplitObject(splitType);
        expenseSplit.validateSplitRequest(splitDetails, expenseAmount);

        Expense expense = new Expense(expenseId, expenseAmount, description, paidByUser, splitType, splitDetails);

        balanceSheetController.updateUserExpenseBalanceSheet(paidByUser, splitDetails, expenseAmount);

        return expense;
    }
}
