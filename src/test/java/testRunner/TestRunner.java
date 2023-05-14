package testRunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)//.class represent this class, here there is no use of this class body 
                        //and Cucumber is a predefined class import from above 
@CucumberOptions(
		
		features={".//Features//Login.feature"},
		//    features = {".//Features//Login.feature",".//Features//LoginDDT.feature"},   
		  //  features={".//Features//LoginDDT.feature"},											
		  //  features= {".//Features//LoginDDTExcelFeature.feature"},											
		//  features="@target/rerun.txt",                                              
		                                                /* .//Features if we use only this then it will include all the 
		    		                                      features files but if we use .//Features//Login.feature, then it
		    											 includes this particular feature file in Features folder if we
		    											want to run multiple features files then just insert comma 
		    											in between({".//Features//Login.feature","second feature file"}*/ 
		    
		    glue= "stepDefinitions",//glue is a keyword(in case of this we have only one step definition file for all features files.
            plugin = {"pretty","html:reports/myreport.html","json:reports/myreport.json","rerun:target/rerun.txt"},
                                                      /*Built-in reporter plugins
														message.
														progress.
														pretty.-this plugin  generates the Cucumber test report in the 
														HTML format, i.e. an HTML file.
														html.
													    json.
														rerun.
														junit.
														r5testng.*/
		    dryRun = false,       /* this line will execute the step definition file in dry run mode(dry run mode in the sense
                                     it will not actually run the code, it will just check whether every step of a 
                                      particular scenario in feature file has its corresponding method present in the 
                                      stepDefinitions class or not.By default it is false.*/ 
		    monochrome = true    // this is used to remove the junk character from the console after executiuon.
		  
		    		              // which sceanrios we want to execute, here in the scenario we have put sanity  
		    
		 //    tags = "@sanity" //here we want to execute scenario having sanity tag     
		  //  tags = "@sanity or @regression"//here we want to execute scenario having sanity tag or regression tag
		   // tags="@sanity and @regression"//here we want to execute scenario having sanity tag and regression tag(both should be there) 
		   //tags="@sanity and not @regression"//here we want to execute scenario having sanity tag but should not be regression 
		)	     
		
		
		
	public class TestRunner 
	{

}
