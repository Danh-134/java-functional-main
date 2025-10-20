package functional.lambda.customfunctionalinterface;

//SAM: Single Abstract Method (Functional Interface annotation dictates that this interface has single abstract method.)
@FunctionalInterface
public interface PlayMusicService {
    void run(String song);
}
