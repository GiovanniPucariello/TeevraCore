echo "Building Teevra Fusion Server"

cd ../TeevraServer/assembler/scripts/
call build-noTests.bat

echo "Teevra Fusion Server build completed"


echo "Creating Teevra installer"

 cd ../../Installer/
 call createInstaller.bat
 
echo "Teevra installer created"