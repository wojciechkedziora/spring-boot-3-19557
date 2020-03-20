# Demo for  #19557

This is a demo application for https://github.com/spring-projects/spring-boot/issues/19557 to reproduce the issue.

## How to reproduce

1. Check out the repo
2. `mvn spring-boot:run`
3. Stop the application with `CTRL-C`
4. There should now be a warning in the log that says `Failed to apply the value function for the gauge 'queueSize'.` and is followed by a stack trace
