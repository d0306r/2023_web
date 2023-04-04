package sec01.exam06;

public class Button {
    OnClickListener listener;
    // 메소드 선언
    void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    void touch() {
        listener.OnClick();
    }

    static interface OnClickListener {
        void OnClick();
    }
}
