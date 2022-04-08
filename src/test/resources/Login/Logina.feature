Feature: Skillrary App 
 Scenario: To login with valid credentials as Admin
 Given I want to open the app in chrome 
 And enter username as "admin"
 And enter password as "admin"
 Then click in the loginbutton
 And check more outcomes "SkillRary Admin"


 # @PositiveTesting
 #Scenario Outline:To test with all postitive data
 #When enter username "<name>"
 #And enter password "<password>"
 #And click on the login button 
 #Then I should see the "<username>"
 
# Examples:
# name|password|username
# admin|admin|SkillRary Admin
# admin|admin|SkillRary Admin