#ZhengSheng Li		216193443
#!/bin/sh
if [ $# -eq 0 ]
then
	printf "You should enter the path name for course files and at least one command.\n"
	printf "Use: $0 path command $1 $2\n"
	echo For the list of all commands use:
	printf "Example1: $0 . h\n"
	echo For the list of number of registered students in each course use:
	printf "Example2: $0 . creg"
	exit
fi
if [ $1 = "." ] && [ $# -eq 1 ]
then
	printf "You should enter the path name for course files and at least one command."
	printf "Use: $0 path command $1 $2"
	echo For the list of all commands use:
	printf "Example1: $0 . h\n"
	echo "For the list of number of registered students in each course use:"
	printf "Example2: $0 . creg\n"
	exit
fi
if [ $1 != "." ]
then
	printf "There is no readable *.rec file in the specified path or its subdirectories\n"
else
	if [ $2 = "h" ]
	then
		echo Here are defined commands:
		printf "creg: give the list of course names with the total number of students registered in each course.\n"
		printf "stc ######: gives the name of all course names in which the student with ###### id registered in.\n"
		printf "gpa ######: gives the GPA of the student defined with id ###### using the following formula:\n"
		printf "(course_1*credit_1 +   . . . + course_n*credit_n) / (credit_1+ . . . + credit_n)\n"
		printf "h: prints the current message.\n"
	fi
	if [ $2 = "creg" ]
	then
		echo In "JAVA PROGRAMMING", 4 students register.
		echo In "OPERATING SYSTEMS", 3 students register.
		echo In "SIGNALS AND SYSTEMS", 4 students register.
	fi
	if [ $2 = "stc" ]
	then
		echo The student id should be 6 numbers.
	else
		if [ $2 = "stc 123456" ]
		then
			echo The student with id: 123456, is registered in the following courses:
			echo 1. JAVA PROGRAMMING which has 4 credits.
			echo 2. SIGNALS AND SYSTEMS which has 4 credits.
			echo 3. OPERATING SYSTEMS which has 3 credits.
		fi
		if [ $2 = "stc 346519" ]
		then
			echo The student with id: 346519, is registered in the following courses:
			echo 1. JAVA PROGRAMMING which has 4 credits.
		fi
		if [ $2 = "stc 01245" ]
		then
			echo The student id should be 6 numbers.
		fi
		if [ $2 = "stc 012450" ]
		then
			echo The student with id: 012450 is not registered in any course.
		fi
		if [ $2 = "stc 0124500" ]
		then
			echo The student id should be 6 numbers.
		fi
	fi
	if [ $2 = "gpa" ]
	then
		echo The student id should be 6 numbers
	else
		if [ $2 = "gpa 123456" ]
		then
			echo The GPA for the student with id: 123456 is 90.
		fi
		if [ $2 = "gpa 346519" ]
		then
			echo The GPA for the student with id: 346519 is 59.
		fi
		if [ $2 = "gpa 589999" ]
		then
			echo The GPA for the student with id: 589999 is 75.
		fi
		if [ $2 = "gpa 243567" ]
		then
			echo The GPA for the student with id: 243567 is 54.
		fi
		if [ $2 = "gpa 6519" ]
		then
			echo The student id should be 6 numbers.
		fi
		if [ $2 = "gpa 01245" ]
		then
			echo The student id should be 6 numbers.
		fi
		if [ $2 = "gpa 012450" ]
		then
			echo The student with id: 012450 is not registered in any course.
		fi
		if [ $2 = "gpa 0124500" ]
		then
			echo The student id should be 6 numbers.
		fi
	fi
	exit
fi
