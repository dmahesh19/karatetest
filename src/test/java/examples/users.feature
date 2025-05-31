Feature: sample karate test script for chrome headless
  Scenario: chrome headless mode
    * configure driver = {type: 'chrome', addOptions: ['--headless=new']}
    #* configure driverTarget = { docker: 'justinribeiro/chrome-headless', showDriverLog: true }
    * driver 'https://www.saucedemo.com'
    * maximize()
    * print "tile is : ", driver.title
    * delay(2000)