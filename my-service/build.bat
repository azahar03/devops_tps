@echo off
cd /d "C:\Users\e.octavie\OneDrive - ELECTROCLASS\Documents\EFREI\seconde_annee\devops\devops_tps\my-service"
call gradlew build -x test
echo.
echo BUILD COMPLETED
pause
