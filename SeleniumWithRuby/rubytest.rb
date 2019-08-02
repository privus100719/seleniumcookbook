def setup
     @driver = Selenium::WebDriver.for :chrome
     @driver.manage.window.maximize
     @driver.navigate.to "https://www.findmedecor.com"

      wait = Selenium::WebDriver::Wait.new(:timeout => 10)

    screenshot()
  end

  def test_login

    @driver.find_element(:class,'open-overlay').click
    screenshot(DateTime.now)
    wait = Selenium::WebDriver::Wait.new(:timeout => 10)
    login_email = wait.until {
        element = @driver.find_element(:name, "login_email")
        element if element.displayed?
    }

    login_email.send_keys("suwarna.wade@rohagroup.com")
    puts "Test Passed: login pop up found" if login_email.displayed?
    screenshot(DateTime.now)
    @driver.find_element(:id,'pass').send_keys('123456')
    @driver.find_element(:id,'btn_login').click

    puts "Logged in successfully"

    puts "Time of test = ", DateTime.now
    screenshot(Time.now.strftime('%Y-%m-%d_%H.%M.%S'))
  end
  $i = DateTime.now
  def screenshot
  @driver.save_screenshot("screenshot #{'$i'}.png")
    $i= +1
  end
