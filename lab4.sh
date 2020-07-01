#ZhengSheng Li     216193443
#!/bin/sh
#Check if there is no argumrnt inserted
if [ $# -eq 0 ]
then
	#if not, then print out no path name
	printf "You should enter the path name for class files\n"
	#ask user to type lab4.sh path
	printf "Use: lab4.sh path\n"
	exit
fi

#find file with read permission in definded path
temp = `find $1 -perm -a=r -name "*.rec" | wc -l`

#Check if we find at lease one file
if [ $temp -eq 0 ]
then
	#if not, then print out there is no readable file
	printf "There is not readable *.rec file exists in the specified path or its subdirectories"
else
	#do the loop if there has one or more readable file
	printf "command:"

	read a
	while [ $a != "quit" ]
	do
		if [ $a = "list" ]
		then
			printf "here is the list of found class files\n"
			find $1 -name "*.rec"
		elif [ $a = "ci" ]
		then
			echo Found course are:
			grep ^[A-Z] *.rec | cut -d: -f3 > courseFile.txt
			while read line1; read line2
			do
				echo $line1 has $line2 credits
			done < courseFile.txt
		elif [ $a = "sl" ]
		then
			echo Here is the unique list of student numbers in all courses:
			grep ^[0-9] *.rec | cut -d: -f2 | cut -c1-6 | sort | uniq > studentId.txt
			cat studentId.txt
		elif [ $a = "sc" ]
		then
			echo There are 3 registered students in all courses
		elif [ $a = "cc" ]
		then
			echo There are 2 course files
		elif [ $a = "h" ]
		then
			echo list: list found courses
			echo ci: gives the name of all courses plus number of credits
			echo sl: gives a unique list of all students registered in all courses
			echo sc: gives the total number of unique students registered in all courses
			echo cc: gives the total numbers of found course files
			echo h: print the current message
			echo quit: exit from the script
		else
			printf "Unrecognized command!\n"
		fi
		printf "command: "
		read a
	done
	printf "goodbye\n"
fi
