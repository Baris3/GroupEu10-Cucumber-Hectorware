Feature: Default

	#{color:#4c9aff}*User story:*{color}
	#
	#{color:#172b4d}As a user, I should be able to log in with {color:#00875a}*valid*{color} credentials so that I can use the app{color}
	#
	# 
	#
	#{color:#de350b}*AC5:*{color} users should be able to log in with a {color:#00875a}*valid username and password,*{color} launch the library main page, and see “Library“ text as the page title
	@HECWARE10-156
	Scenario: Verify is user able to log in to DB with valid credentials
		Given   Navigate to DB URL
		When    Enter valid DB username in Email address field
		And     Enter valid DB password in password field
		And     Click on Sign in button
		Then    Verify the library2 main page


	Scenario: Users should be able to login to DB as librarian, or as a student
		Given 	Navigate to DB URL
		And 	User should be able to login to DB as a "library"
		Then    Verify the library2 main page