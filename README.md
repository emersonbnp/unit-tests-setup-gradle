# unit-tests-setup-gradle
A simple unit tests setup on Gradle

To run on comand line using Gradle wrapper:
  ./gradle build
This will only build the project if all test cases pass since the jar task depends on test.

To run on Intellij, you can create a build/run configuration as follows:
  tasks: :cleanTest :clean
  arguments: --tests "path.to.tests/*"
The "cleanTest" task will delete other tests results and "test" will run them again. Regarding
arguments, those will set the root path for the tests to be run.
