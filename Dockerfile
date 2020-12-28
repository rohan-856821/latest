FROM    maven:3.6.0-jdk-8
RUN     mkdir /Group10
WORKDIR /Group10
COPY    . .
RUN ls
CMD mvn clean test -Dcucumber.options="--tags '@Timesheet and @Update'" -DexecutionPlatform="GRID_CHROME"