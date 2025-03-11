package inter;

public class Audio implements RemoteControl {

    private int volume;

    @Override
    public void turnOn() {
        System.out.println("오디오 켬");
    }

    @Override
    public void turnOff() {
        System.out.println("오디오 끔");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 볼륨 : " + this.volume);
    }
}
