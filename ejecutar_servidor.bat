@echo off
title Servidor RMI - IMC
cd /d "%~dp0"
echo Iniciando Servidor RMI...
call gradlew.bat run
pause
