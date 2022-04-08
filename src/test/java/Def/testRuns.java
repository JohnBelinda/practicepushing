package Def;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)

	@CucumberOptions(features= {"src/test/resources/Login/Logina.feature"},
	glue= {"def_after_run"},
	dryRun=false,
	plugin= {"html:testoutput/belinda.html","json:testoutput/belinda.json","junit:testoutput/belinda.xml"})
	//tags = "@PositiveTesting")

public class testRuns {

}
