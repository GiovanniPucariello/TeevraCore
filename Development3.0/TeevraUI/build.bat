cd TeevraClient/build
cmd /C build compileAll
if NOT ERRORLEVEL 0 exit(1)
echo teevraClient build complete
cd ../../TeevraConfig
cmd /C mvn clean install
if NOT ERRORLEVEL 0 exit(1)
echo teevraClient configurations packaged
cd ../TeevraApp
mvn install
cd ..
