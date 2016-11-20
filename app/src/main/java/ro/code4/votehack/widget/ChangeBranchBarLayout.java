package ro.code4.votehack.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.LinearLayout;

import ro.code4.votehack.R;

public class ChangeBranchBarLayout extends LinearLayout {
    public ChangeBranchBarLayout(Context context) {
        super(context);
        init(context);
    }

    public ChangeBranchBarLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public ChangeBranchBarLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public ChangeBranchBarLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);
    }

    private void init(Context context) {
        inflate(context, R.layout.widget_change_branch_bar, this);

        setOrientation(HORIZONTAL);
        setGravity(Gravity.CENTER_VERTICAL);

        int verticalPadding = getResources().getDimensionPixelSize(R.dimen.branch_bar_padding_vertical);
        setPadding(getPaddingLeft(), verticalPadding, getPaddingRight(), verticalPadding);
    }
}
