package inter;

public interface RemoteControl {
    // 상수(final static), 추상메서드(public abstract), defult, static 메서드
    int MAX_VOLUME = 10;
    final static int MIN_VOLUME = 0;

    // public abstract 붙이지 않아도 추상 메서드
    void turnOn();

    void turnOff();

    void setVolume(int volume);

    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음");
        } else {
            System.out.println("무음 해제");
        }
    }

    static void changeBattery() {
        System.out.println("건전지 교환");
    }
}
