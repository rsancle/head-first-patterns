package chapterTwo.wheatherStation.observer;

public interface Subject {
    public void registerObserver();

    public void removeObserver();

    public void notifyObserver();
}
