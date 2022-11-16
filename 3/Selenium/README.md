Selenium Tests  
To run -> go in terminal to directory with pom.xml and run "mvn clean test"
Two screenshots added into package "testResults" as an evidence of working tests
1. Environment
- Maven
- Selenium
- Chrome and Edge drivers added into repository in package "executables"
- Chrome Driver url -> https://chromedriver.storage.googleapis.com/index.html?path=107.0.5304.62/
- Edge Driver url ->  https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/

1. Test Scenarios:  
    1. Find President Aleksander Kwaśniewski and go deeper in wikipedia:  
       1. go to google.pl
       2. search president Aleksander Kwaśniewski in google
       3. go to wikipedia with his biography
       4. go from his bio article to new article "wybory prezydenckie w Polsce w 1995 roku" 
       5. then from this article click from table with candidates to "Lech Wałęsa"
    2. Read article on Baeldung and redirect to its source code on github to read README.md:  
       1. go to baeldung.com
       2. agree with privacy policy of baeldung
       3. click on hamburger menu to see options to read
       4. choose and click "Spring REST Tutorials"
       5. then go to "How to Read HTTP Headers in Spring REST Controllers" article
       6. then go to GitHub - click "over on GitHub"
       7. then click "README.md" to read README
       