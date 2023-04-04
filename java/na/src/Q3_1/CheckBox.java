package Q3_1;

public class CheckBox {
    OnSelectListener listener;

    void setOnSelectListener(OnSelectListener listener) {
        this.listener = listener;
    }

    void select() {
        listener.onSelet();
    }
    static interface OnSelectListener{
        void onSelet();
    }
}
