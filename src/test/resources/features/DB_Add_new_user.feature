Feature: Default

	#{color:#4c9aff}*User story:*{color}
	#
	#As a {color:#00875a}*librarian*{color}, I should be able to add a new user.
	#
	# 
	#
	#{color:#de350b}*AC1:*{color} Librarian can add new user 
	@HECWARE10-159
	Scenario: Verify can a librarian add a new user
		Given 	Navigate to DB URL
		And 	User should be able to login to DB as a "librarian"
		When    Librarian select Users from Navigation bar
		Then    Librarian should be able to click Add user button



	#{color:#4c9aff}*User story:*{color}
	#
	#As a {color:#00875a}*librarian*{color}, I should be able to add a new user.
	#
	# 
	#
	#{color:#de350b}*AC2:*{color} Add user window should have the following parameters :
	# * Full Name
	# * Password
	# * Email
	# * User Group
	# * Status
	# * Start Date
	# * End Date
	# * Address
	#
	# 
	@HECWARE10-160
	Scenario: Verify add user window parameters
		Given 	Navigate to DB URL
		And 	User should be able to login to DB as a "librarian"
		And     Librarian select Users from Navigation bar
		When    Librarian should be able to click Add user button
		Then    Librarian should be able to see Full Name box in pop up window
		And     Librarian should be able to see Password box in pop up window
		And     Librarian should be able to see Email box in pop up window
		And     Librarian should be able to see User Group box in pop up window
		And     Librarian should be able to see Status box in pop up window
		And     Librarian should be able to see Start Date box in pop up window
		And     Librarian should be able to see End Date box in pop up window
		And     Librarian should be able to see Address box in pop up window


	@igor
	Scenario: As librarian I would be able to add new user
		Given 	Navigate to DB URL
		And 	User should be able to login to DB as a "librarian"
		And     Librarian select Users from Navigation bar
		When    Librarian should be able to click Add user button
		Then   	Librarian should be able to enter "Dennis Rodman" as Full Name
		And     Librarian should be able to enter "CB91" as Password
		And     Librarian should be able to enter "dr91-1@cb.com" as Email
		And     Librarian should be able to chose "Students" from User Group
		And     Librarian should be able to chose "ACTIVE" as Status
		And     Librarian should be able to enter "2023-05-27" as Start Date box
		And     Librarian should be able to enter "2023-06-29" as End Date
		And     Librarian should be able to enter "1901 W Madison St, Chicago, IL 60612" as Address
		And 	Librarian should be able add new user by clicking to Save changes button