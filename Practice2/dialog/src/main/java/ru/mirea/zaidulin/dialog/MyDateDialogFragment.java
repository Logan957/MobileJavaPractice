package ru.mirea.zaidulin.dialog;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

public class MyDateDialogFragment extends DialogFragment {

    Calendar calendar;
    DatePickerDialog.OnDateSetListener onDateSetListener;

    public MyDateDialogFragment(Calendar calendar, DatePickerDialog.OnDateSetListener onDateSetListener) {
        super();
        this.calendar = calendar;
        this.onDateSetListener = onDateSetListener;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog dialog = new DatePickerDialog(getActivity(), onDateSetListener, year, month, day);
        return dialog;
    }
}
