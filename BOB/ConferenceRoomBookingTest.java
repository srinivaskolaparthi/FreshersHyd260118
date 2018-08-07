package com.cg.roorbooking.test;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"features"},
		glue= {"com.cg.roorbooking.stepdefination"},
		tags= {"@execute"}
	)
public class ConferenceRoomBookingTest {

}
