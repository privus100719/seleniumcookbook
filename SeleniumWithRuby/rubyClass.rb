
  require 'rubygems'
  require 'Selenium-webdriver'
  driver = Selenium::WebDriver.for:firefox
  driver.navigate.to "https://www.javatpoint.com/ruby-installation"
  driver.close
  puts "browser launches"
