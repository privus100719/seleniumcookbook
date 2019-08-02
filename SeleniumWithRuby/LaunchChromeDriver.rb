require 'rubygems'
require 'Selenium-webdriver'

driver = Selenium::WebDriver.for:chrome
driver.manage.window.maximize
driver.navigate.to "https://opensource-demo.orangehrmlive.com/index.php/auth/login"
driver.find_element(:id,'txtUsername').send_keys "Admin"
puts "enter username"
driver.save_screenshot "./ScreenShot/#{Time.now.strftime("failshot__%d_%m_%Y__%H_%M_%S")}.png"  
driver.find_element(:id,'txtPassword').send_keys "admin123"
puts "enter txtPassword"
driver.save_screenshot "./ScreenShot/#{Time.now.strftime("failshot__%d_%m_%Y__%H_%M_%S")}.png"  
driver.find_element(:id,'btnLogin').click
driver.save_screenshot "./ScreenShot/#{Time.now.strftime("failshot__%d_%m_%Y__%H_%M_%S")}.png"              
driver.close
puts "browser launches"
