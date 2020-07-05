package am.ak.design.facade;

import org.junit.jupiter.api.Test;

public class HomeTheaterTestDrive {

    @Test
    public void test() {
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvd = new DvdPlayer();
        CdPlayer cd = new CdPlayer();
        Projector projector = new Projector();
        TheaterLights screen = new TheaterLights();
        Screen lights = new Screen();
        PopcornPopper popper = new PopcornPopper();
        HomeTheaterFacade homeTheater =
                new HomeTheaterFacade(amp, tuner, dvd, cd, projector, screen, lights, popper);
        homeTheater.watchMovie("Raiders of the Lost Ark");
        homeTheater.endMovie();
    }
}
