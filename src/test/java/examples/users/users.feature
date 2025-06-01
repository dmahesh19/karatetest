Feature: sample file option 1
  Scenario: chrome headless mode 1
    #* configure driver = { type: 'chrome', headless: true, addOptions: [ '--headless=new' ] }
    #* configure driverTarget = { docker: 'justinribeiro/chrome-headless', showDriverLog: true }
    * configure driver = { type: 'playwright', headless: true }
    * driver 'https://www.saucedemo.com'
    * maximize()
    * print "tile is : ", driver.title
    * delay(2000)