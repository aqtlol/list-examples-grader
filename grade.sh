# Create your grading script here

#set -e

JU=".:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar"

rm -rf student-submission
git clone $1 student-submission

echo "Successful clone"

FILE=student-submission/ListExamples.java
if  [ -f "$FILE" ]; then
    echo "file exists"
else
    echo "file doesnt exist"
    exit 1
fi

cp -r lib student-submission
echo "Junit copied"

cp TestListExamples.java student-submission/
cd student-submission
echo "In student-submission"

javac -cp $JU *.java 2> compileError.txt
cat compileError.txt
set -e
echo "Compiled"

java -cp $JU org.junit.runner.JUnitCore TestListExamples

echo "Ran da tests"






